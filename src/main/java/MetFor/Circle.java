package MetFor;


import java.util.Scanner;

public class Circle implements Figure {
    @Override
    public int getType() {
        return 1;
    }

    @Override
    public void getSquare(Scanner input) {
        System.out.println("Введите радиус круга");
        int r = input.nextInt();
        System.out.println("Площадь круга " + Math.PI * r * r);
    }
}
