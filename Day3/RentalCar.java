package Day3;

public class RentalCar {
    private String carNo;
    private double ratePerDay;
    private int days;

    public RentalCar(String carNo, double ratePerDay, int days) {
        this.carNo = carNo;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

    public double getTotalFare() {
        return (days > 0) ? days * ratePerDay : 0;
    }
    public static void main(String[] args) {
        RentalCar car = new RentalCar("WB-01-KS-1234", 1000, 5);
        System.out.println("Car No: " + car.carNo + ", Total Fare: " + car.getTotalFare());
    }
} 
