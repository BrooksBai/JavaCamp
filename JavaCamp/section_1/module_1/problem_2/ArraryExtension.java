import java.util.Arrays;
import java.util.Scanner;

public class ArraryExtension {
    public static void main(String[] args) {
        // 提示用户输入数组长度并记录用户输入数组长度的值
        System.out.println("请输入数组长度：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 声明一个用户指定长度的数组
        int[] arr = new int[num];
        // 用count记录数组中已添加元素的数量
        int count = 0;
        // 往数组中添加元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个要向数组中添加的整数：");
            arr[i] = sc.nextInt();
            count++;
            // 当已存储元素数量达到总容量的80%时，扩容到原容量的1.5倍
            if (count >= 0.8 * arr.length) {
                System.out.println("已存储元素数量达到数组总容量的80%，进行扩容");
                int[] newArr = new int[(int) (1.5 * arr.length)];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                arr = newArr;
            }
            // 询问用户是否继续向数组中加入元素，若不继续添加，则退出循环
            System.out.println("是否继续向数组中加入元素？(y/n)");
            String s = sc.next();
            if (s.equals("n")) {
                break;
            }
        }

        System.out.println("数组中的元素为：");
        System.out.println(Arrays.toString(arr));
    }
}