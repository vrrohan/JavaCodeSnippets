class Demo {
    Demo() {
        System.out.println("this is line 1 in demo class constructor");
        System.out.println("line 2 in demo class constructor");
        return;
        //System.out.println("this is line 3 after return statement");
    }
}
public class Hello {
    public static void main(String[] args) {
        new Demo();
    }
}