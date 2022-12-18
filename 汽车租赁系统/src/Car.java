public class Car {
    private String type;
    private String brand;
    private String numberplate;
    private double rent;
    private String zulin;

    public Car(String type, String brand, String numberplate, double rent, String zulin) {
        this.type = type;
        this.brand = brand;
        this.numberplate = numberplate;
        this.rent = rent;
        this.zulin = zulin;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", numberplate='" + numberplate + '\'' +
                ", rent=" + rent +
                ", zulin='" + zulin + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getZulin() {
        return zulin;
    }

    public void setZulin(String zulin) {
        this.zulin = zulin;
    }
}
