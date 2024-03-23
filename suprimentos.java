public class suprimentos {

/*1 - Crie uma classe chamada Suprimentos que possa ser utilizado por uma loja de
suprimentos de informática para representar uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintes informações como atributos:

• o número do item faturado
• a descrição do item
• a quantidade comprada do item e
• o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade
não for positiva, ela deve ser configurada como 0. Se o preço por item não for
positivo ele deve ser configurado como 0.0. Forneça um método set e um método get
para cada variável de instância. Além disso, forneça um método chamado
getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a
quantidade pelo preço por item) e depois retorna o valor como um double.
Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
 */
  // atributos//

    private int IDitem;
    private String desc;
    private int quantidadecomprada;
    private double preco;


    // construtor//
    public suprimentos(int IDitem, String desc, int quantidadecomprada, double preco) {
        this.IDitem = IDitem;
        this.desc = desc;

        if (quantidadecomprada < 0) {
            this.quantidadecomprada = 0;
        } else {
            this.quantidadecomprada = quantidadecomprada;
        }
        if (preco < 0.0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
    public int getIDitem() {
        return IDitem;
    }

    public String getDesc() {
        return desc;
    }

    public int getQuantidadecomprada() {
        return quantidadecomprada;
    }

    public double getPreco() {
        return preco;
    }

    public double getInvoiceAmount(){
        return quantidadecomprada * preco;
    }
    public void setIDitem(int IDitem) {
        this.IDitem = IDitem;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQuantidadecomprada(int quantidadecomprada) {
        this.quantidadecomprada = quantidadecomprada;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




    }





