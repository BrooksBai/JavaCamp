public class ChessBoard {
    public static void main(String[] args) {
        // 绘制棋盘第一行
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        for (char c = 'a'; c <= 'f'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        // 绘制棋盘其余行
        char c = 'a';
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                if (i < 10) {
                    if (j == 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    if (j == 0) {
                        System.out.print(c++ + " ");
                    } else {
                        System.out.print("+ ");
                    }
                }
            }
            System.out.println();
        }
    }
}