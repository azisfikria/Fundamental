package juaracodingday6;

import java.util.ArrayList;

public class ContohList {
    public static void main(String[] args) {
        // Collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Mitsubishi");
        cars.add("Toyota");
        cars.add("Suzuki");
        System.out.println(cars); //panggil semua
        System.out.println("Get: "+ cars.get(3)); //panggil index 3
        cars.set(1, "Mazda"); // ini ganti index 1 jadi Mazda
        System.out.println(cars);
        System.out.println("Size: "+ cars.size());
        cars.remove(3);
        System.out.println("Remove: "+ cars);
        cars.clear();
        System.out.println("Clear: "+ cars);
    }
}
