package UjianMingguPertama;
import java.util.Scanner;

public class Soal7ClassObject {
        public static void main(String[] args) {
                Computer computer1 = new Computer();
                Scanner scanner = new Scanner(System.in);
                computer1.processor = scanner.nextLine();
                computer1.motherboard = scanner.nextLine();
                computer1.ram = scanner.nextInt();
                computer1.displaySpec = scanner.nextInt();
                computer1.gpu = scanner.next();
                computer1.harddisk = scanner.next();

                System.out.print("Processor: " + computer1.processor+ ", ");
                System.out.print("Motherboard: " + computer1.motherboard+ ", ");
                System.out.print("RAM: " + computer1.ram);
                System.out.print("x" + computer1.displaySpec + ", ");
                System.out.print("GPU: " + computer1.gpu+ ", ");
                System.out.print("Harddisk: " + computer1.harddisk);
        }
}

class Computer {
        int ram;
        int displaySpec;
        String gpu;
        String harddisk;
        String motherboard;
        String processor;
        // complete the code
}

