package chapter07;

public class Exercise_07_24 {
    public static void main(String[] args) {
        int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        String[] colors = new String[4];
        String[] numbers = new String[4];

        while (count < 4) {

            String number = getCardNumber();

            String color = getDesignColor();

            if (color == "Spades") {
                count1++;
            } else if (color == "Hearts") {
                count2++;
            } else if (color == "Clubs") {
                count3++;
            } else {
                count4++;
            }

            boolean isDifferent = true;

            // count的值是多少表示colors数组中有多少中不同的花色
            for (int i = 0; i < count; i++) {
                if (colors[i] == color) {
                    isDifferent = false;
                    break;
                } else {
                    continue;
                }
            }

            if (isDifferent) {
                colors[count] = color;
                numbers[count] = number;
                count++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i] + " of " + colors[i]);
        }

        System.out.println("Number of picks: " + (count1 + count2 + count3 + count4));
    }

    // 获取花色
    public static String getDesignColor() {
        char cha = (char) (Math.random() * 4 + 65);

        String color = "";

        switch (cha) {
            // 如果随机产生的是A，代表是黑桃
            case 'A':
                color = "Spades";
                break;
            // 如果随机产生的是B，代表是红桃
            case 'B':
                color = "Hearts";
                break;
            // 如果随机产生的是C，代表是梅花
            case 'C':
                color = "Clubs";
                break;
            // 其他则是方块
            default:
                color = "Diamonds";
                break;
        }

        return color;
    }

    // 获取牌数
    public static String getCardNumber() {
        String str = "";

        int number = (int) (Math.random() * 13 + 2);

        switch (number) {
            case 11:
                str += 'J';
                break;
            case 12:
                str += 'Q';
                break;
            case 13:
                str += 'K';
                break;
            case 14:
                str += 'A';
                break;
            default:
                str += number;
                break;
        }

        return str;
    }
}