import ru.netology.stats.statistics.service.StatsService;

import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumSales = StatsService.sumSalesCalc(sales);
        int averageSales = StatsService.averageOfSalesCalc(sales);
        int maxSalesMonth = StatsService.maxSalesCalc(sales);
        int minSalesMonth = StatsService.minSalesCalc(sales);
        int salesBelowAverage = StatsService.salesBelowAverageCalc(sales);
        int salesAboveAverage = StatsService.salesAboveAverageCalc(sales);
        //System.out.println("Продажи по месяцам " + Arrays.toString(sales));
        System.out.println("Сумма продаж " + sumSales);
        System.out.println("Средняя сумма продаж " + averageSales);
        System.out.println("Больше всего продаж в " + maxSalesMonth + " месяце");
        System.out.println("Меньше всего продаж в " + minSalesMonth + " месяце");
        System.out.println("Продаж ниже среднего в " + salesBelowAverage + " месяцах");
        System.out.println("Продаж выше среднего в " + salesAboveAverage + " месяцах");
    }

}


