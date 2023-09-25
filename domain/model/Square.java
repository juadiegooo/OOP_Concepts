package domain.model;

public class Square extends Shape{
    private int width=0;
    
    public int getwidth(){
        return width;
    }

    public void setWidth(int newWidth){
        if(newWidth>=0){
            width=newWidth;
        }
    }

    public int getHeight(){
        return getwidth();
    }

    public void setHeight(int newHeight){
        setHeight(newHeight);
    }

    @Override
    public int getArea(){
        return getwidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return (getHeight()*2)+(getwidth()*2);
    }

    public Square(int newX, int newY, int newWidth){
        super(newX, newY); //El super sirve para llamar a la clase padre
        setWidth(newWidth);
    }

    public Square(int newWidth){
        this (0,0,newWidth);
    }

    public Square(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }

    
}
