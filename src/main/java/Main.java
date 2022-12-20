import ru.netology.stats.statistics.service.StatsService;

import java.util.OptionalDouble;

public class Main {

    public static void main(int[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumSales = service.sumSalesCalc(sales);
        int averageSales = service.averageOfSalesCalc(sales);
        int maxSalesMonth = service.maxSalesCalc(sales);
        int minSalesMonth = service.minSalesCalc(sales);
        int salesBelowAverage = service.salesBelowAverageCalc(sales);
        int salesAboveAverage = service.salesAboveAverageCalc(sales);
        //System.out.println("Продажи по месяцам " + Arrays.toString(sales));
        System.out.println("Сумма продаж " + sumSales);
        System.out.println("Средняя сумма продаж " + averageSales);
        System.out.println("Больше всего продаж в " + maxSalesMonth + " месяце");
        System.out.println("Меньше всего продаж в " + minSalesMonth + " месяце");
        System.out.println("Продаж ниже среднего в " + salesBelowAverage + " месяцах");
        System.out.println("Продаж выше среднего в " + salesAboveAverage + " месяцах");
    }

}


