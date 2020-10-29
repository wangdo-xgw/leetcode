package com.aisino.javajichu;

/**
 * volatile的java语义
 * https://blog.csdn.net/qq_30332665/article/details/105385290
 *
 * volatile语义
 * 当写一个 volatile 变量时，JMM 会把该线程对应的本地内存中的共享变量值刷新到主内存。
 * 当读一个 volatile 变量时，JMM 会把该线程对应的本地内存置为无效。线程接下来将从主内存中读取共享变量。
 *
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-23-下午 3:05
 */
public class TestVolatile {
    private static volatile  Test test = new Test("4545",45);
    static Test a = test;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while ("4545".equals(test.getName())) {
            }
        }).start();

        Thread.sleep(100);
        a.setName("343434");
    }

    public static void main1(String[] args) throws InterruptedException {
        new Thread(() -> {
            while ("4545".equals(a.getName())) {
            }
        }).start();

        Thread.sleep(100);
        /**这个就会死循环了，因为子线程先执行，所以子线程的本地内存中a的值不会随主线程更改而发生改变。
         * a.setName()改成test.setName()也不行，子线程没结束之前，是不会去主线程读数据的。
         */
        a.setName("343434");
    }
}
    class Test{
        String name;



        int value;
        Test(String name , int value){
            this.name=name;
            this.value=value;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }


    }