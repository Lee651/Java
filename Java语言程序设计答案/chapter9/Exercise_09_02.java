package chapter9;

public class Exercise_09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle");

        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.printf("%.2f", stock.getChangePercent());
        System.out.println("%");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock() {
    };

    Stock(String symbolCode, String stockName) {
        symbol = symbolCode;
        name = stockName;
    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
