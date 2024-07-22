package estados;

public enum EstadoBrasileiro {
    PARAIBA("PB", "Paraíba", 11),
    SAO_PAULO("SP", "São Paulo", 12),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 13),
    PIAUI("PI", "Piauí", 14),
    MARANHAO("MA", "Maranhão", 15);

    private String sigla;
    private String nome;
    private int ibge;

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
}
