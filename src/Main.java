import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true){
            System.out.println("""
                    1.Цилиндр
                    2.Параллелипед
                    3.Выход
                    Enter your choice:
                    """);
            switch (new Scanner(System.in).nextLine()){
                case "1"->{
                    Cylinder cylinder = new Cylinder();
                    System.out.print("Enter height:");
                    cylinder.setHeight(chekScanner());
                    System.out.print("Enet radius: ");
                    cylinder.setRadius(chekScanner());
                    System.out.println("Cylinder area : "+cylinder.areaCylinder());
                    System.out.println("Cylinder volume: "+cylinder.volumeCylinder());
                }
                case "2"->{
                    Parallelepiped parallelepiped = new Parallelepiped();
                    System.out.print("Enter height: ");
                    parallelepiped.setHeight(chekScanner());
                    System.out.print("Enter width: ");
                    parallelepiped.setWidth(chekScanner());
                    System.out.print("Enter length: ");
                    parallelepiped.setLength(chekScanner());
                    System.out.println("Parallelepiped area: "+parallelepiped.areaParallelepiped());
                }
                case "3"-> System.exit(0);
                default -> System.out.println("incorrect choice");
            }
        }


    }

    public static double chekScanner() {
        while (true) {
            try {
                double number  = new  Scanner(System.in).nextDouble();
                if(number>0 ){
                    return number;
                } else throw new Exception("Данные должны быть отрицательным числом");
            } catch (InputMismatchException e) {
                System.out.println(" Введите допустимое значение Double.");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }

}