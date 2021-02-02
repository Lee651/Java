package chapter09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(0.45);
        account.withDraw(2500);
        account.deposit(3000);

        System.out.println("余额为: " + account.getBalance());
        System.out.println("月息为: " + account.getMonthlyInterest());
        System.out.println("开户日期: " + new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(account.getDateCreated()));
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // 无参构造
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // 带有特定id和初始余额的账户的构造方法
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    // id、balance和annualInterestRate访问器和修改器
    public void setId(int newId) {
        id = newId;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // dateCreated访问器
    public Date getDateCreated() {
        return dateCreated;
    }

    // 返回月利率
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // 返回月息
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // 从账户上提取特定数额
    public void withDraw(double money) {
        balance -= money;
    }

    // 向账户存储特定数额
    public void deposit(double money) {
        balance += money;
    }
}