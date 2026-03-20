package br.edu.deitel;
import static java.lang.System.out;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1;
        invoice1 = new Invoice("1", "Caneca", 10, 250.00);
        out.println("Invoice 1:");
        out.println("Part Number: " + invoice1.getNumero());
        out.println("Part Description: " + invoice1.getDescricao());
        out.println("Quantity: " + invoice1.getQuantidade());
        out.printf("Price per Item: %.2f ", invoice1.getPreco());
        out.printf("\nInvoice Amount: %.2f ", invoice1.getInvoiceAmount());

    }
}
