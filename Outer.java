public class Outer {
    private int value = 20;
    class Inner {
        void display() {
            System.out.println("The value is:"+value);
        }
    }
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o.value);
        //OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner inner = o.new Inner();
        inner.display();
    }
}
