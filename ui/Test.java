package ui;

import domain.model.Rect;
import domain.model.Shape;
import domain.model.Square;

public class Test {

public static void main(String[] args) {
        var Square=new Rect(0, 0);
        Square.setWidth(60);
        System.out.println("Width"+Square.getwidth());

        Square.setHeight(21);
        System.out.println("Height"+Square.getHeight());
}

}


