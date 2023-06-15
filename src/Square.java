public class Square implements Shape{

    private double form;
    public Square(double form){ this.form = form ; }
    @Override
    public double getPerimeter() {
        return 4*form;
    }

    @Override
    public double getArea() {
        return form*form;
    }
}
