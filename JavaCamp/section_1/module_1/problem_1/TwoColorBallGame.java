import java.util.Random;
import java.util.Arrays;

public class TwoColorBallGame {
    public static void main(String[] args) {
        // 声明一个长度为7的数组
        int[] balls = new int[7];
        // 随机生成6个1~33之间不重复的号码作为红球号码并存入数组
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            balls[i] = random.nextInt(33) + 1;
            for (int j = 0; j < i; j++) {
                if (balls[i] == balls[j]) {
                    i--;
                    break;
                }
            }
        }
        // 随机生成1个1~16之间的号码作为蓝球号码并存入数组
        balls[6] = random.nextInt(16) + 1;
        // 打印7个随机生成的中奖号码
        System.out.println("双色球的中奖号码是（其中前6个为红球号码，最后一个为蓝球号码）：");
        System.out.println(Arrays.toString(balls));
    }
}