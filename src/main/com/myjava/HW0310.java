package main.com.myjava;

import java.util.Scanner;

public class HW0310 {
    public static void main(String[] args) {
        //用Scanner接收输入数据。要求输入姓名、年龄、性别、学号和HTML的成绩。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的姓名：");
//        String name = scanner.next();
//        System.out.println("请输入您的年龄：");
//        int age = scanner.nextInt();
//        System.out.println("请输入您的性别：");
//        String sex = scanner.next();
//        System.out.println("请输入您的学号");
//        double number = scanner.nextDouble();
//        System.out.println("请输入您的HTML成绩：");
//        double score = scanner.nextDouble();
//
//        System.out.println("姓名： " + name);
//        System.out.println("年龄： " + age);
//        System.out.println("性别： " + sex);
//        System.out.println("学号： " + number);
//        System.out.println("HTML成绩： " + score);

        //要求用户输入半径的值，打印出以此值为半径的圆的面积
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入半径r");
//        double r = scanner.nextDouble();
//        double s = 3.14 * r;
//        System.out.println("圆的面积为： " + s);

        //打印输出长方形的面积
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入长方形的长：");
//        double longs = scanner.nextDouble();
//        System.out.println("请输入长方形的宽：");
//        double wide = scanner.nextDouble();
//
//        System.out.println("长方形的面积为： " + (longs * wide));



        //编写一个可以将用户输入的华氏温度换算为摄氏温度的程序
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入华氏温度： ");
//        double F = scanner.nextDouble();
//        System.out.println("氏温度换算为摄氏温度为： " + ((F - 32) * 5)/9);


        //编写一个程序，将用户输入的的4位数的千位百位和个位分别显示出来，如1234，则显示“用户输入的千位为1，百位是为2，十位为3，个位为4”
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个4位数 ");
//        int number = scanner.nextInt();
//
//        System.out.println("千位：" + (number / 1000));
//        System.out.println("百位：" + ((number / 100) % 10));
//        System.out.println("十位：" + (number / 10) % 10);
//        System.out.println("个位：" + (number % 10));




        //编写一个程序，接收用户输入两个int数值，实现这两个数值互换，并输出。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请分别输入a的值：");
//        int a = scanner.nextInt();
//        System.out.println("请分别输入b的值：");
//        int b = scanner.nextInt();
//
//        System.out.printf("互换前: \na=%d\nb=%d%n",a,b);
//
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.printf("互换后: \na=%d\nb=%d%n",a,b);





        //请用户输入一个数，若该数为偶数，则输出这个数本身； 如果该数为奇数，则输出比它大的相邻偶数
//        System.out.println("请输入一个整数： ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if((number & 1) == 1){
//            System.out.println(number);
//        }else{
//            System.out.println(number + 1);
//        }


        //声明一个char型变量并为其赋一个字母作为值。编写一段程序，若其值为大写字母，则直接输出；若为小写则变为大写字母再输出
//        System.out.println("请输入一个字母： ");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        char c = s.charAt(0);
//        if((c < 65) || (c > 90)){
//            c -= 32;
//            System.out.println(c);
//        }else{
//            System.out.println(c);
//        }




        //编写一个程序，显示用户输入的字符在unicode表中的顺序位置。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个字符: ");
//        String input = scanner.nextLine();
//        if(input == null || input.isEmpty()) {
//            System.out.println("输入为空");
//            return;
//        }
//        char c = input.charAt(0);
//        System.out.println("字符" + c + "在unicode表中的位置为： " + (int)c);

    }
}