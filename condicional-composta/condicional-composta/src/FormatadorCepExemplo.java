public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2356778");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde as regras de negócio (8 dígitos)");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
