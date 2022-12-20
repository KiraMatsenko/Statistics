package ru.netology.stats.statistics.service;

    public class StatsService {


        public int sumSalesCalc(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            return sum;
        }

        public int averageOfSalesCalc(int[] sales) {
            int sum = sumSalesCalc(sales);
            int average = sum / sales.length;
            return average;
        }

        public int maxSalesCalc(int[] sales) { //попробуйте через ForEach
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

        public int minSalesCalc(int[] sales) { //попробуйте через ForEach
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

        public int salesBelowAverageCalc(int[] sales) {
            int average = averageOfSalesCalc(sales);
            int monthCounter = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < average) {
                    monthCounter = monthCounter + 1;
                }
            }
            return monthCounter;
        }

        public int salesAboveAverageCalc(int[] sales) {
            int average = averageOfSalesCalc(sales);
            int monthCounter = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > average) {
                    monthCounter = monthCounter + 1;
                }
            }
            return monthCounter;
        }
    }