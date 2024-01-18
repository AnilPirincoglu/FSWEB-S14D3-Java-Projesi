import com.ap.car.brand.Ford;
import com.ap.car.carRD.CarSkeleton;
import com.ap.car.carRD.GasPowderCar;

public class Main {
    public static void main(String[] args) {
        Ford focus=new Ford(4,"Focus");

        focus.startEngine();
        focus.accelerate();
        focus.brake();
        System.out.println(focus);

        System.out.println("\n***\n***\n***");
        CarSkeleton car = new GasPowderCar("benzinli","araba",5.0,4);
        car.startEngine();
        car.drive();
    }
}