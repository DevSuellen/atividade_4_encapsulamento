public class main {

    public static void main(String[] args) {
        suprimentos suprimento = new suprimentos(10,"mouse", 5, 10);

// mostrar

        System.out.println(suprimento.getDesc());
        double soma = suprimento.getInvoiceAmount();
        System.out.println(soma);

     }
}
