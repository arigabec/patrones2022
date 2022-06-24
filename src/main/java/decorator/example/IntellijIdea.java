package decorator.example;

public class IntellijIdea implements IDE {
    private String license;
    private String size;
    private String version;
    private int cost;

    public IntellijIdea(String license, String size, String version, int cost) {
        this.license = license;
        this.size = size;
        this.version = version;
        this.cost = cost;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void showInformation() {
        System.out.println("*** IntelliJIdea");
        System.out.println("License: " + license);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("Cost: " + cost);
    }
}
