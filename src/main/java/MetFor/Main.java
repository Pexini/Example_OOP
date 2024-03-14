package MetFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите тип фигуры: 0 - Прямоугольник, 1 - Круг, 2 - Треугольник");
        Scanner input = new Scanner(System.in);
        Figure[] figures = new Figure[]{new Rectangle(), new Circle(), new Triangle()};

        int typeOfFigure = input.nextInt();
        for (int i = 0; i <= typeOfFigure; i++) {
            if (typeOfFigure == figures[i].getType()) {
                figures[i].getSquare(input);
            }
        }
    }


}


