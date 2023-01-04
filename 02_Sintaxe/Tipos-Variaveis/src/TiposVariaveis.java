public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        int numero = +5;
        System.out.println(-numero);
        numero = - numero;
        System.out.println(numero);
        System.out.println(--numero);

        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Sim" : "Não";
        System.out.println(resultado);

        String nomeUm = "Foo";
        String nomeDois = "Bar";
        String nomeTres = "Foo";
        String nomeQuatro = new String("Foo");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm == nomeQuatro);
        System.out.println(nomeUm.equals(nomeQuatro));

    }
}
