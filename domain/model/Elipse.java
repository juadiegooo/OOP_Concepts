package domain.model;

public class Elipse extends Circle{

    private int radius2=0;

    public int getRadius2(){
        return radius2;
    }

    public void setRadius2(int newRadius2){
        if(newRadius2>=0){
            radius2=newRadius2;
        }
    }
    
    @Override
    public int getArea(){
        return (int)(Math.PI*getRadius() *getRadius2());
    }

    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI*Math.sqrt((Math.pow(getRadius(), 2) + Math.pow(getRadius2(), 2))/2)) ;
    }

    public Elipse(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }
    
}
