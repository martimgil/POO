package aula06;


public class Pessoa {
    private String nome;
    private int CC;
    private DateYMD dataNasc;

    public Pessoa(String nome, int CC, DateYMD dataNasc) {

        if (validarNome(nome) && DateYMD.valid(dataNasc.getDay(), dataNasc.getMonth(), dataNasc.getYear())) {
            this.nome = nome;
            this.CC = CC;
            this.dataNasc = dataNasc;
        }   
    }


    public String getName() {
        return nome;
    }


    public int getCC() {
        return CC;
    }


    public DateYMD getDataNasc() {
        return dataNasc;
    }


    static boolean validarNome(String nome) {
        String[] nameParts = nome.split(" ");

        if (nameParts.length >= 2) {
            for (String part : nameParts) {
                if (!Character.isUpperCase(part.charAt(0)) || !part.matches("[A-Za-z]+")) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }



    @Override
    public String toString() {
        return nome+"; CC: " + CC + "; Data de Nascimento: " + dataNasc.toString();
    }
}
