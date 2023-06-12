package AdvanceArray;

public class MaxPop {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        System.out.println(MaxPopulation(logs));
    }
    static int MaxPopulation(int[][] logs) {
        int[] population = new int[10001];
        for (int[] person : logs) {
            int birth = person[0];
            int death = person[1];
            population[birth]++;
            population[death]--;
        }

        int MaxPop = 0;
        int MaxYear = 0;
        int currPop = 0;

        for (int year = 1950; year < population.length; year++) {
            currPop += population[year];
            if (currPop > MaxPop) {
                MaxPop = currPop;
                MaxYear = year;
            }
        }
        return MaxYear;
    }
}
