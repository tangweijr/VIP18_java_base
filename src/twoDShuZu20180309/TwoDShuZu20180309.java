package twoDShuZu20180309;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * 二维数组的使用练习
 * @author tangweijr
 * @since 20180309
 */
public class TwoDShuZu20180309 {
    // 使用数组画图
    static void mapPrinter() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int w = toolkit.getScreenSize().width;
        int h = toolkit.getScreenSize().height;
        int[][] map = {
                {0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0},
                {0, 1, 1, 1, 1, 0, 0, 6, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 6, 6, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0},
                {0, 1, 0, 0, 0, 5, 0, 1, 0, 5, 0, 0},
                {0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 6, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 4, 0},
                {0, 1, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        JFrame jf = new JFrame("DiLao");
        jf.setBounds(w/2,h/2,220, 308);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setResizable(false);
        jf.setLayout(null);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    JLabel wall = new JLabel(new ImageIcon("src//twoDShuZu20180309/wall.png"));
                    wall.setSize(16,16);
                    wall.setLocation(j*16,i*16);
                    jf.getContentPane().add(wall);
                } else if (map[i][j] == 2) {
                    JLabel opendoor = new JLabel(new ImageIcon("src//twoDShuZu20180309/opendoor.png"));
                    opendoor.setSize(29,32);
                    opendoor.setLocation(j*16,i*16);
                    jf.getContentPane().add(opendoor);
                } else if (map[i][j] == 4) {
                    JLabel s = new JLabel(new ImageIcon("src//twoDShuZu20180309/s.png"));
                    s.setSize(33, 32);
                    s.setLocation(j * 16, i * 16);
                    jf.getContentPane().add(s);
                } else if (map[i][j] == 5) {
                    JLabel snake = new JLabel(new ImageIcon("src//twoDShuZu20180309/snake.png"));
                    snake.setSize(16, 16);
                    snake.setLocation(j * 16, i * 16);
                    jf.getContentPane().add(snake);
                } else if (map[i][j] == 6) {
                    JLabel d = new JLabel(new ImageIcon("src//twoDShuZu20180309/d.png"));
                    d.setSize(16, 16);
                    d.setLocation(j * 16, i * 16);
                    jf.getContentPane().add(d);
                }
            }
        }
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static void twoDSort(int[][] nums) {
        // 获得二维数组的总长度
        int length=0;
        for (int i = 0; i < nums.length; i++) {
            length += nums[i].length;
        }
        // 创建新的一维数组，依次填充
        int[] temp = new int[length];
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                temp[index++] = nums[i][j];
            }
        }
        // 排序
        Arrays.sort(temp);
        // 存储回二维数组并打印出来
        index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = temp[index++];
                System.out.print("nums["+i+"]["+j+"]="+nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 3:");
        int[][] ints={{4,8,-1},{3,6},{12,-10,25,0}};
        twoDSort(ints);

        System.out.println("Question 4:");
        mapPrinter();
    }
}

