package chapter08;

public class Exercise_08_04 {
    public static void main(String[] args) {
        int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 } };

        for (int i = 0; i < DescendingOrder(workHours).length; i++) {
            System.out.println("Employee " + DescendingOrder(workHours)[i][0] + "'s total work hours is "
                    + DescendingOrder(workHours)[i][1]);
        }
    }

    public static int[][] DescendingOrder(int[][] workHours) {
        int[][] employeesAndTotalWorkHours = new int[workHours.length][2];

        // 将员工序号和总工时存入到二维数组中
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j];
            }

            employeesAndTotalWorkHours[i][0] = i;
            employeesAndTotalWorkHours[i][1] = sum;
        }

        lo: while (true) {
            // 遍历数组，如果后面的数大于前面的数，则进行交换
            int[] tem;
            for (int k = 0; k < employeesAndTotalWorkHours.length - 1; k++) {
                if (employeesAndTotalWorkHours[k][1] < employeesAndTotalWorkHours[k + 1][1]) {
                    tem = employeesAndTotalWorkHours[k + 1];
                    employeesAndTotalWorkHours[k + 1] = employeesAndTotalWorkHours[k];
                    employeesAndTotalWorkHours[k] = tem;
                }
            }

            boolean isOk = true;

            // 再次遍历数组，确保整个数组中前一个数大于后一个数，否则继续循环进行交换
            for (int l = 0; l < employeesAndTotalWorkHours.length - 1; l++) {
                if (employeesAndTotalWorkHours[l][1] >= employeesAndTotalWorkHours[l + 1][1]) {
                    continue;
                } else {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                break lo;
            }
        }

        return employeesAndTotalWorkHours;
    }
}