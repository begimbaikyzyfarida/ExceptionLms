import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Put choice");
        System.out.println("1. Parallelepiped");
        System.out.println("2. Cylinder");
        while (true) {
            int choice = scanner1.nextInt();
            switch (choice) {
                case 1:
                    try {
                        Scanner scanner = new Scanner(System.in);
                        int length = scanner.nextInt();
                        int height = scanner.nextInt();
                        int width = scanner.nextInt();
                        if (length < 0) {
                            throw new RuntimeException();
                        }
                        System.out.println("This is the area of Parallelepiped");
                        System.out.println(Parallelepiped.areaOfParallelepiped(height, length, width));
                        System.out.println("This is the volume of Parallelepiped");
                        System.out.println(Parallelepiped.volumeOfParallelepiped(length, width, height));
                    } catch (RuntimeException e) {
                        System.out.println("wrong input");
                        break;
                    }
                case 2:
                    if (choice == 2) {
                        try {
                            System.out.println("Put height of cylinder");
                            int height1 = scanner1.nextInt();
                            System.out.println("Put radius of cylinder");
                            int radius1 = scanner1.nextInt();

                            if (height1 < 0) {
                                throw new RuntimeException();
                            }
                            Cylinder cylinder = new Cylinder();
                            System.out.println("This is the areaCylinder");
                            cylinder.areaCylinder(radius1, height1);
                            System.out.println("This is the volumeCylinder");
                            cylinder.volumeCylinder(radius1, height1);
                        } catch (RuntimeException ex) {
                            System.out.println("Put correct one");
                        }
                    }
            }
        }
    }
}
