package com.wyf.單例模式; /**
 * @Description
 * @author wangyifei
 * @date 2021/2/2618:00
 */

/**
 * @author Annlla
 * @since 2021/2/26  18:00
 * @description:
 */
public class TestSingleton {

    String name = null;
    public TestSingleton() {
    }

    private static TestSingleton instance = new TestSingleton();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TestSingleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("the name is " + name);
    }

    public static void main(String[] args) {
        TestSingleton test1 = TestSingleton.getInstance();
        test1.setName("12345");
        test1.print();

        TestSingleton test2 = TestSingleton.getInstance();
        test2.setName("56789");
        test2.print();

        TestSingleton test3 = TestSingleton.getInstance();
        test3.setName("00000");
        test3.print();


        test1.print();
        test2.print();
        test3.print();

        if(test1 == test2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }

    }
}
