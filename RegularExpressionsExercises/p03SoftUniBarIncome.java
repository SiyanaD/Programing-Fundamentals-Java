package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String regex ="%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[\\d]+)" +
                "\\|[^|$%.]*?(?<price>[\\d]+\\.?[\\d]+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;
        while (!line.equals("end of shift")){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count*price;
                totalIncome+=sum;
                System.out.printf("%s: %s - %.2f%n",name,product,sum);
            }
            line = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }


}
