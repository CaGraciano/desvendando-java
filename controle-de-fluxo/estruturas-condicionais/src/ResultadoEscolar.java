//Condicional composta e encadeada

public class ResultadoEscolar {
    public static void main(String[] args) {

    int nota = 6;
       
    if (nota >= 7)
       System.out.println("Aprovado");
   else if (nota >= 5 && nota < 7)
       System.out.println("Recuperação");
   else
       System.out.println("Reprovado");
 

    //Condição ternária

    int media = 7;
		String resultado = media >=7 ? "Aprovado" :  media >=5 && media <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
