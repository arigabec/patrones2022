package singleton.example.logger;

public class ClientExample {

    public static void main(String[]args){
        Invoice invoice = new Invoice();
        invoice.setNroInvoice(456);
        invoice.getNroInvoice();

        Product product = new Product();
        product.setName("Computadora");
        product.setAmount(5);
        product.getAmount();

        invoice.setDetail(product.getName());
        Client client = new Client();
        client.setPoints("8888");
        client.getPoints();

        Supplier supplier = new Supplier();
        supplier.setName("IBM");
        supplier.getName();
    }
}
