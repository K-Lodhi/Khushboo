import java.util.Scanner;

public class FruitShopProfit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        
        int profitAmount = sc.nextInt();
        
        
        int ramuShare = sc.nextInt();
        int gopuShare = sc.nextInt();
        int samuShare = sc.nextInt();

        
        int totalRatio = ramuShare + gopuShare + samuShare;

        double ramuProfit = (double) profitAmount * ramuShare / totalRatio;
        double gopuProfit = (double) profitAmount * gopuShare / totalRatio;
        double samuProfit = (double) profitAmount * samuShare / totalRatio;

        System.out.printf("%.2f%n", ramuProfit);
        System.out.printf("%.2f%n", gopuProfit);
        System.out.printf("%.2f%n", samuProfit);

        sc.close();
    }

	}

