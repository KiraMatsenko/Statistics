package ru.netology.stats.statistics.service;
import java.util.Arrays;
import java.util.stream.IntStream;

    public class StatsService {


        public static int sumSalesCalc(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            return sum;
        }

        public static int averageOfSalesCalc(int[] sales) {
            int sum = StatsService.sumSalesCalc(sales);
            int months = sales.length;
            int average = sum / sales.length;
            return average;
        }

        public static int maxSalesCalc(int[] sales) { //попробуйте через ForEach
            int maxMonth = 0;
            int monthCounter = 0;
            for (int mX : sales) {
                if (mX >= sales[maxMonth]) {
                    maxMonth = monthCounter;
                }
                monthCounter = monthCounter + 1;
            }
            return maxMonth + 1;
        }

        public static int minSalesCalc(int[] sales) { //попробуйте через ForEach
            int minMonth = 0;
            int monthCounter = 0;
            for (int mI : sales) {
                if (mI <= sales[minMonth]) {
                    minMonth = monthCounter;
                }
                monthCounter = monthCounter + 1;
            }
            return minMonth + 1;
        }

        public static int salesBelowAverageCalc(int[] sales) {
            int average = StatsService.averageOfSalesCalc(sales);
            int monthCounter = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < average) {
                    monthCounter = monthCounter + 1;
                }
            }
            return monthCounter;
        }

        public static int salesAboveAverageCalc(int[] sales) {
            int average = StatsService.averageOfSalesCalc(sales);
            int monthCounter = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > average) {
                    monthCounter = monthCounter + 1;
                }
            }
            return monthCounter;
        }
    }