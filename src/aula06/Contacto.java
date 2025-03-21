package aula06;

public class Contacto extends Pessoa{

    private int ntelemovel;
    private int id;
    private String email;
    private static int count=1;

    public Contacto(String nome, int CC, DateYMD dataNasc, int ntelemovel, String email) {
        super(nome, CC, dataNasc); // Explicitly call the superclass constructor

        if (email == null && !validarNumero(ntelemovel)) {
            throw new IllegalArgumentException("Telemóvel e email não podem ser ambos inválidos.");
        } else if (email != null && !validEmail(email)) {
            throw new IllegalArgumentException("O email não é válido.");
        } else if (!validarNumero(ntelemovel)) {
            throw new IllegalArgumentException("O telemóvel não é válido.");
        }

        this.ntelemovel = ntelemovel;
        this.id = count++;
        this.email = email;
    }

    static boolean validarNumero(int ntelemovel){
        String ntelemovelStr = String.valueOf(ntelemovel);
        if (ntelemovelStr.charAt(0) == '9' && ntelemovelStr.length() == 9 && ntelemovelStr.matches("\\d{9}")) {
            return true;
        } else{
            return false;
        }    
    }

    static boolean validEmail(String email) {
        if (email != null && email.matches(".+@.+\\.(pt | com)")) {
            return true;
        } else {
            return false;
        }
    }

    public void setNtelemovel(int ntelemovel) {
        this.ntelemovel = ntelemovel;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getNtelemovel() {
        return ntelemovel;
    }


    public int getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    


}