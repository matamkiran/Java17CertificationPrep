package classdemo;

class MyClass1 {
    private static int myNum;
    static {
        myNum = 2;
    }
    {
        myNum+=1;
    }
    public static int getMyNum() {
        return myNum;
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        System.out.println(MyClass1.getMyNum());
        System.out.println(new MyClass1().getMyNum());
    }
}
