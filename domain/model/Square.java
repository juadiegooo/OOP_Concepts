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
        return getHeight()+getwidth();
    }

    public Square(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }

    
}
