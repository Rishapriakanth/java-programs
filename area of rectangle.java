//calculate area of rectangle
class Rectangle{  
 int length;  
 int width;  
 void insert(int l, int w){  
  length=l;  
  width=w;  
 }  
 void calculateArea()
 {
     System.out.println(length*width);
     
 }  
}  
class Main{  
 public static void main(String args[]){  
  Rectangle r1=new Rectangle();  
  Rectangle r2=new Rectangle();  
  r1.insert(5,10);  
  r2.insert(15,20);  
  r1.calculateArea();  
  r2.calculateArea();  
}  
}  