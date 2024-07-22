package main.java.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
//Adicionando com alt+insert = equals and hashcode, para impossibilitar que tenha mais de um convidado com o mesmo código de convite
    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString(){
        return "Nome do convidado: " + nome + " | Código do convite: " + codigoConvite;
    }
}
