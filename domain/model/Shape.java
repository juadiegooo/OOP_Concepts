package domain.model;

public abstract class Shape {
    public int x=0;
    public int y=0;
    public Shape (int newX, int newY){//el metodo no debe tener la misma firma, cambiar el tipo de dato y orden
        x=newX;
        y=newY;
        
    }
    public void setX(int newX){
        if(newX>=0&&newX<=1000){
            x = newX;
        }}
public int getX(){
    return x;}

public void setY(int newY){
    if(newY>=0&&newY<=1000){
        y = newY;
    }}
public int getY(){
return y;
}

public abstract int getArea();
public abstract int getPerimeter();

}

