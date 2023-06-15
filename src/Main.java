public class Main {
    public static void main(String[] args) {
        Shape kor = new Circle(2);
        System.out.println("A kerulete: " + kor.getPerimeter());
        System.out.println("A terulete: " + kor.getArea());

        Shape myshape = new Circle(3);
        System.out.println(myshape.getPerimeter());
        System.out.println(myshape.getArea());

        Shape negyzet = new Square(4);
        System.out.println("Kerülete: "+ negyzet.getPerimeter());
        System.out.println("Területe: "+ negyzet.getArea());
    }
}
