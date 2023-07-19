class sample
{
    final void brake()
    {
        System.out.println("brake used is disc gear");
    }
    final void clutch()
    {
        System.out.println("clutch used is friction clutch");
    }
    final void accelerator()
    {
        System.out.println("accelerator used is throttle");
    }
}
class honda extends sample
{

    void color()
    {
        System.out.println("Colour is black");
    }
}
class maruthi extends sample
{
    void color()
    {
        System.out.println("Colour is white ");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        honda a= new honda();
        maruthi m=new maruthi();
        System.out.println("Honda car details");
        a.brake();
        a.clutch();
        a.accelerator();
        a.color();
        System.out.println("maruthi car details");
        m.brake();
        m.clutch();
        m.accelerator();
        m.color();

    }
}