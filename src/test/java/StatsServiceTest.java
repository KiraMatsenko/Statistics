import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statistics.service.StatsService;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSalesCalc(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAverageOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageOfSalesCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesBelowAverageCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesAboveAverageCalc(sales);

        Assertions.assertEquals(expected, actual);
    }
}
