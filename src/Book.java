public class Book extends Product {

        private String author;
        private int pages;

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public int getPages() {
                return pages;
        }

        public void setPages(int pages) {
                this.pages = pages;
        }

        @Override
        public String toString() {

                return "Code:               " + this.getCode() + "\n" +
                        "Description:        " + this.getDescription() + "\n" +
                        "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                        "Author:             "  + this.getAuthor() + "\n" +
                        "Pages:              "  +  this.getPages() + "\n";

        }
}
