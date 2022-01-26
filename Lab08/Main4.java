package Lab08;

public class Main4 {
    public static void main(String[] args) {
        Father obj1=new Father();
        System.out.println("now uses the "+obj1.prop1+" of his father");
        Son obj2=new Son();
        System.out.println("now uses the "+obj2.prop1+" of his own");
    }
}
