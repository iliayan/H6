public class House {
    private int bedrooms;
    private double area;
    private String address;

    public House(int bedrooms, double area, String address) {
        this.bedrooms = bedrooms;
        this.area = area;
        this.address = address;
    }

    public House(int bedrooms, double area) {
        this(bedrooms, area, "Unknown Address");
    }

    // Гетери і сетери
    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}