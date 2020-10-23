public class CarDemo1 {
    public static void main(String[] args) {

        Car car1;
        car1 = new Car();
        //System.out.println(car1);

        Car car2 = new Car();
        //System.out.println(car2);

        Car car3 = new Car();

        car1.model = "Ferrari";
        car1.Year = 2020;
        car1.price = 1_200_000;

        car2.model = "Lexus";
        car2.Year = 2016;
        car2.price = 650_000;

        car3.model = "Porsche";
        car3.Year = 2018;
        car3.price = 750_000;

        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);

        System.out.printf("%s kostar %, d kr \n", car1.model, car1.price);
        System.out.printf("%s kostar %, d kr \n", car2.model, car1.price);
        System.out.printf("%s kostar %, d kr \n", car3.model, car1.price);
    }
}
