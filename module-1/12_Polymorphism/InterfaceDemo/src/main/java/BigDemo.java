public class BigDemo implements MyInterface {

    @Override
    public void method1() {
        System.out.println("Big Demo calculation 1 :" + (1 + 1));
    }

    @Override
    public void method2(String one, String two) {
        System.out.println("Big Demo calculation 2 :" + (2 + 2));
    }

    public String bigDemoMethod() {
        return "Print Big Demo!";
    }

}
