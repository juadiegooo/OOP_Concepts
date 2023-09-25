package domain.model;

public class Rect extends Square{

    private int Height=0;
    @Override
    public int getHeight(){
        return Height;
    }

    @Override
    public void setHeight(int newHeight){
        if(newHeight>=0){
            Height=newHeight;
        }
    }

   /*  @Override
    public int getArea(){
        return getwidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return (getHeight()*2)+(getwidth()*2);
    }
    */

    public Rect(int newX, int newY, int newWidth, int newHeight){
        super(newX, newY, newWidth); //El super sirve para llamar a la clase padre
        setHeight(newHeight);
    }

    public Rect(int newHeight){
        this (0,0,0, newHeight);
    }

    public Rect(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }


    
}
