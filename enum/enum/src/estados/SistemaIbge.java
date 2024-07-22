package estados;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            //System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.PARAIBA; 

        System.out.println(eb.getNome() + " - " + eb.getSigla() + " - " + eb.getNomeMaiusculo()
         + " - " + eb.getIbge());

    }
}
