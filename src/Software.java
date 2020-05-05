public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    private String os;


    @Override
    public String toString() {

        return "Code:               " + this.getCode() + "\n" +
                "Description:        " + this.getDescription() + "\n" +
                "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                "Operating System:   " + this.getOs() + "\n" +
                "Platform:           " + this.getPlatform() + "\n" +
                "Programmer:         " + this.getProgrammer() + "\n";
    }
}
