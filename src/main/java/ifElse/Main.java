package ifElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите тип фигуры: 0 - Прямоугольник, 1 - Круг, 2 - Треугольник");
        Scanner input = new Scanner(System.in);
        Figure[] figures = new Figure[]{new Rectangle(), new Circle(), new Triangle()};

        int typeOfFigure = input.nextInt();
        if (typeOfFigure >= 0 && typeOfFigure < figures.length) {
            figures[typeOfFigure].getSquare(input);
        } else {
            System.out.println("Неверный тип фигуры. Введите число от 0 до " + (figures.length - 1));
        }
    }
}
