/** Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para 
 * representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
 * -> o número do item faturado,
 * -> a descrição do item,
 * -> a quantidade comprada do item e
 * -> o preço unitário do item.
 * Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser 
 * configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça um método set e 
 * um método get para cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o 
 * valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. 
 * Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice. 
*/

package store;

import java.util.Scanner;

/**
 *
 * @author laryr
 */

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de intens para venda: ");
        int quantP = scan.nextInt();
        
        Invoice in[] = new Invoice[quantP];
        double t = 0;
        
        for(int i = 0; i < in.length; i++){
            in[i] = new Invoice();
            in[i].setNum(i+1);
            System.out.println("");
            System.out.println("Produto: " + (i+1));
            System.out.println("Descrição do Produto: ");
            String descP = scan.next();
            in[i].setDesc(descP);
            
            System.out.println("Valor Unitário: ");
            in[i].setValorUnit(scan.nextDouble());
            
            System.out.println("Quantidade: ");
            in[i].setQuant(scan.nextInt());
            t += in[i].getInvoiceAmount();
        }
        
        for(Invoice produto: in){
            System.out.println("==== Loja de Informática ====");
            System.out.println("Nº do Produto: " + produto.getNum());
            System.out.println("Descrição: " + produto.getDesc());
            System.out.println("Quantidae: " + produto.getQuant());
            System.out.println("Valor Unitário: " + produto.getValorUnit());
        }
        
        System.out.println("Valor Total: " + t);
    }
}
