package aula12;

import java.time.LocalDate;

public class Contact {
    private int id;
    private String nome;
    private int numero;
    private String email;
    private LocalDate dataNascimento;

    public Contact(String nome, int numero, String email, LocalDate dataNascimento) {
        this.nome = nome;
        validate(email, numero);
        this.email = email;
        this.numero = numero;
        this.dataNascimento = dataNascimento;
    }

    private void validate(String email, int phoneNumber) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Email cannot be ivalid");
        }
        if (100000000 > phoneNumber || phoneNumber > 1000000000) {
            throw new IllegalArgumentException("Phone number must be 9 digits");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", nome=" + nome + ", numero=" + numero + ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
    }
}