interface ii {
    void d();

    default void d1() {
        System.out.println("Hello guys");
    }
}

interface ii2 {
    void d2();

}

abstract class AA {
    abstract void display();

}

class bbb extends AA implements ii, ii2 {
    void display() {
        System.out.println("Hello abstract");
    }

    @Override
    public void d2() {
        System.out.println("Hello interfacee31313");

    }

    @Override
    public void d() {
        System.out.println("Hello interface");

    }
}

class ABSTRACTC {
    public static void main(String[] args) {
        bbb obj = new bbb();
        obj.display();
        obj.d1();
    }
}