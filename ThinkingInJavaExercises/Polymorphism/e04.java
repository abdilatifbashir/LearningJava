import java.util.*;

public class e04 {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
	    // write your code here
        Shape[] s = new Shape[13];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s){
            shp.draw();
            shp.say(); 
        }
            
    }
}

class Shape {
    public void say() {System.out.println("I'm the base class");}
    public void draw() {}
    public void erase() {}
} 

class Circle extends Shape {
    @Override public void say() { System.out.println("I'm the Circle class");}
    @Override public void draw() { System.out.println("Circle.draw()"); }
    @Override public void erase() { System.out.println("Circle.erase()"); }
}
 
class Square extends Shape {
    @Override public void say() { System.out.println("I'm the Square class");}
    @Override public void draw() { System.out.println("Square.draw()"); }
    @Override public void erase() { System.out.println("Square.erase()"); }
}
 
class Triangle extends Shape {
    @Override public void say() { 
        super.say();
        System.out.println("I'm the Triangle class");
    }
    @Override public void draw() { System.out.println("Triangle.draw()"); }
    @Override public void erase() { System.out.println("Triangle.erase()"); }
}

class Pentagon extends Shape {
    @Override public void say() { System.out.println("I'm the Pentagon class");}
    @Override public void draw() { System.out.println("Pentagon.draw()"); }
    @Override public void erase() { System.out.println("Pentagon.erase()"); }
}
 
class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Pentagon();
        }
    }
}