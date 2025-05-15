import java.util.ArrayList;
public class Parte2 {

    public static class Pacote{
        private String source;
        private String destino;
        public Pacote(String source, String destino) {

            if (source.matches("^([0-255][.]){3}[0-255]$") && destino.matches("^([0-255][.]){3}[0-255]$")) {
                this.source = source;
                this.destino = destino;
            } else {
                throw new IllegalArgumentException("O formato do endereço de source ou do enedereço de destino não é válido.");
            }
        }

        
        public String getSource() {
            return source;
        }


        public String getDestino() {
            return destino;
        }


        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((source == null) ? 0 : source.hashCode());
            result = prime * result + ((destino == null) ? 0 : destino.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pacote other = (Pacote) obj;
            if (source == null) {
                if (other.source != null)
                    return false;
            } else if (!source.equals(other.source))
                return false;
            if (destino == null) {
                if (other.destino != null)
                    return false;
            } else if (!destino.equals(other.destino))
                return false;
            return true;
        }
    }

    public static class TCP extends Pacote {
        private int id;
        private static int NEXT_ID = 100;
        private String mensagem;
        public TCP(String source, String destino, String mensagem) {
            super(source, destino);

            if(mensagem.length()>1410){
                throw new IllegalArgumentException("A menssagem tem mais de 1410 caracteres");
            }
            this.id = NEXT_ID++;
            this.mensagem = mensagem;

        }

        public String toString() {
            return "TCP (source:  " + getSource() + ", destination: " + getDestino() + ", seq:" + id + ") msg: [" + mensagem + "]";
        }
        public String getMensagem() {
            return mensagem;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            TCP other = (TCP) obj;

            if (mensagem == null) {
                if (other.mensagem != null)
                    return false;
            } else if (!mensagem.equals(other.mensagem))
                return false;


            return true;
        }

        
        
    }

    public static class UDP extends Pacote{
        private String mensagem;

        public UDP(String source, String destino, String mensagem) {
            super(source, destino);
            if(mensagem.length()>1430){
                throw new IllegalArgumentException("A menssagem tem mais de 1430 caracteres");
            }
            else{
                this.mensagem = mensagem;
            }
        }

        public String toString() {
            return "UDP (source:  " + getSource() + ", destination: " + getDestino() + ") msg: [" + mensagem + "]" ;
        }

        public String getMensagem() {
            return mensagem;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = super.hashCode();
            result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!super.equals(obj))
                return false;
            if (getClass() != obj.getClass())
                return false;
            UDP other = (UDP) obj;
            if (mensagem == null) {
                if (other.mensagem != null)
                    return false;
            } else if (!mensagem.equals(other.mensagem))
                return false;
            return true;
        }
    }

    public static class Roteador {
        private String nome;
        private ArrayList<Pacote> filaPacotes;
        private static Pacote ultimoPacoteEnviado = null;

        public Roteador(String nome) {
            this.nome = nome;
            this.filaPacotes = new ArrayList<>();
        }

        public void addPacote(Pacote pack){
            filaPacotes.add(pack);
        }

        public void removePacote(Pacote pack){
            filaPacotes.remove(pack);
        }

        
        public void enviaPacote() {
            if (!filaPacotes.isEmpty()) {
            Pacote pack = filaPacotes.get(0);
            if (pack.equals(ultimoPacoteEnviado)) {
                System.out.println("(pacote duplicado)");
            } else {
                System.out.println(pack.toString());
                ultimoPacoteEnviado = pack;
            }
            filaPacotes.remove(0);
            }
        }
        
        public boolean hasPacotes(){
            if(filaPacotes.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }

        @Override
        public String toString() {
            return "Roteador " + nome + " está UP, tamanhoFila = " + getTamanhoFila();
        }

        public int getTamanhoFila() {
            int totalTamanho = 0;
            for (Pacote pacote : filaPacotes) {
            if (pacote instanceof TCP) {
                totalTamanho += ((TCP) pacote).getMensagem().length();
            } else if (pacote instanceof UDP) {
                totalTamanho += ((UDP) pacote).getMensagem().length();
            }
            }
            return totalTamanho;
        }
    }

    public static Pacote[] geraPacotes() {
        Pacote[] out = new Pacote[5];
        out[0] = new UDP("1.1.1.1","2.2.2.2", "Olá! :)");
        out[1] = new UDP("1.1.1.1","2.2.2.2", "Olá! :)");
        out[2] = new UDP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[3] = new TCP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[4] = new TCP("2.2.2.2","1.1.1.1", "Tudo bem?");
        return out;
    }

    public static void main(String[] args) {
        // --------------------------------------------------------
        // Run #1
        // --------------------------------------------------------


        Pacote[] pacotes = geraPacotes();
        Pacote p1 = pacotes[0];
        Pacote p2 = pacotes[1];
        Pacote p3 = pacotes[2];
        Pacote p4 = pacotes[3];
        Pacote p5 = pacotes[4];

        Roteador router1 = new Roteador("Aveiro-UA");
        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while(router1.hasPacotes()) {
            router1.enviaPacote();
        }
        System.out.println(router1);

        // --------------------------------------------------------
        // Run #2
        // --------------------------------------------------------
        pacotes = geraPacotes();
        p1 = pacotes[0];
        p2 = pacotes[1];
        p3 = pacotes[2];
        p4 = pacotes[3];
        p5 = pacotes[4];

        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.removePacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while(router1.hasPacotes()) {
            router1.enviaPacote();
        }
        System.out.println(router1);
    }
}
