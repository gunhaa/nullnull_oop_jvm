package mynote.polymorphism;

import java.util.Scanner;

// interface도 같은 역할을 할 수 있다
// 추상클래스와 인터페이스의 다른 점은 필드의 차이이다
public abstract class Shape {
    abstract void render();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Shape shape;

        if(input == 0) {
            shape = new Rectangle();
        } else {
            shape = new Triangle();
        }

        if(shape instanceof Rectangle) {
            System.out.println("instance of rectangle");
        } else {
            System.out.println("!instance of rectangle");
        }
        shape.render();
    }
}
