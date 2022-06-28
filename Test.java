public class Test {   // main class staring threads                     // Tyler Bailly  11/16/2020
// Purpose - create individual threads holding different objects


public static void main(String[] args) {


Thread t1 = new Thread(new threadTwo("one"));    // Selection Class
t1.start();
Thread t2 = new Thread(new threadOne ("two"));  // Histogram Class
t2.start();
Thread t3 = new Thread(new threadThree("three"));
t3.start();
}
}
