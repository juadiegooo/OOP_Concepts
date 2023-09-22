package domain.model;

public class Triangle extends Shape{

    private int sideSize1=0;
    private int sideSize2=0;
    private int sideSize3=0;

    @Override
    public int getArea(){
        return getwidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return getHeight()+getwidth();
    }
    
    public Triangle(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }

    
}
