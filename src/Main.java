import java.util.Scanner;
public class Main {
public static void main(String[] agrs){
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap chieu dai: ");
    double weight = scanner.nextDouble();
    System.out.println("nhap chieu rong: ");
    double height = scanner.nextDouble();

Rectanger rectanger = new Rectanger(weight,height);
    System.out.println(rectanger.display());
    System.out.println("dien tich: "+ rectanger.getArea());
    System.out.println("chu vi: " + rectanger.getPrimeter());
}
}
