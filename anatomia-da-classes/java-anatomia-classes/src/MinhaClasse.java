public class MinhaClasse {
    public static void main (String [] args) {
        System.out.println("Minha primeira classe Java");
        
        String primeiroNome = "Camila";
        String segundoNome = "Graciano";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

       // int anoFabricacao = 2022;

      //  boolean verdadeira = false;

      //  anoFabricacao = 2018;
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
