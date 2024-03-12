package MetFor;

import java.util.Scanner;

public class Triangle implements Figure {
    @Override
    public int getType() {
        return 2;
    }

    @Override
    public void getSquare(Scanner input) {
        System.out.println("Введите длину основания и высоту к этому основанию");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Площадь треугольника " + a * b / 2);
    }
}
