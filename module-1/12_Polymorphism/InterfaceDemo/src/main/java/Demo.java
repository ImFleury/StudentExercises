public class Demo implements MyInterface {

    @Override
    public void method1() {
        System.out.println("implementation of method 1");
    }

    @Override
    public void method2(String one, String two) {
        System.out.println("implementation of method 2");
    }

    public void method3(){
        System.out.println("implementation of method 3");
    }
}
