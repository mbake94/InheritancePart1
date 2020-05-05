public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Software software = new Software();
        Product product = new Product();

        product.setPrice(12.34);
        product.setCode("11111");
        product.setDescription("Great product");

        book.setPrice(25.00);
        book.setCode("12345");
        book.setDescription("It's a good book.");
        book.setAuthor("Miles Baker");
        book.setPages(400); book.setPrice(25.00);

        software.setCode("12345");
        software.setDescription("It's a good software.");
        software.setProgrammer("Miles Baker");
        software.setOs("MacOS");
        software.setPlatform("Macintosh");

        System.out.println(product.toString());
        System.out.println(book.toString());
        System.out.println(software.toString());

     //   System.out.printf("Book Price: %f\nBook Code: %s\n",book.getPrice(), book.getCode());
    }
}
