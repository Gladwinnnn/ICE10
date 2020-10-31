/**
 * Created by yeowleong on 13/5/15.
 */
public class SnackTest {
    public static void main(String[] args) {
        Snack kitKat = new Snack("Kit kat", 5.6, 400, "Nestle", 250);
        Snack bun = new Snack("Meat Bun", 1.2, 200, "Kong Guan");
        Snack nuts = new Snack("Fruits & Nuts Fusion", 6, "Tai Sun", 150);

        System.out.println(new Product("Kit Kat", 5.6) + " [numCalories=" + kitKat.getNumCalories() + ",brand=" + kitKat.getBrand() + ",weight=" + kitKat.getWeight() + "]");
        System.out.println(new Product("Meat Bun", 1.2) + " [numCalories=" + bun.getNumCalories() + ",brand=" + bun.getBrand() + ",weight=" + bun.getWeight() + "]");
        System.out.println(new Product("Fruits & Nuts Fusion", 6) + " [numCalories=" + nuts.getNumCalories() + ",brand=" + nuts.getBrand() + ",weight=" + nuts.getWeight() + "]");
    }
}
