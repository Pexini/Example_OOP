package ifElse;

import java.util.Scanner;

public class Rectangle implements Figure {
    @Override
    public int getType() {
        return 0;
    }

    @Override
    public void getSquare(Scanner input) {
        System.out.println("Введите длины сторон прямогуольника");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Площадь прямоугольника " + a * b);
    }

}
