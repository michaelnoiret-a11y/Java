class CarTest {

    public String brand;
    public String color;
    public String speed = 0;

    public String startOn()
    {
        System.out.println("Car start");
    }

    public Integer speedUp10km(speed) {
        speed += 10;
        System.out.println("Your speed now is " + speed "km/h");
    }

    public Integer brakeUntilSTop(speed) {
        speed = 0;
        System.out.println("Car stop. Speed reinitialized at 0 km/h");
    }

    
    public void static main(String[] args) {
        CarTest Car = new Car();
        Car.startOn();
        Car.speedUp10km(speed);
        Car.speedUp10km(speed);
        Car.brakeUntilSTop(speed);
    }
}