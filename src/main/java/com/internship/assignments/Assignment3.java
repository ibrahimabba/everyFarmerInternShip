package com.internship.assignments;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {

        int[][] teamAandBmatrix = {{3, 8, 5},
                                   {5, 6, 6}};

        int[][] scoringMatrix = {{3, 4},
                                 {2, 3},
                                 {1, 2}};

        int[][] finalMatrix = {{0,0},
                               {0,0}};

        int m = 0;
        for (int j = 0; j < scoringMatrix.length; j++) {

            finalMatrix[0][0] += teamAandBmatrix[0][m]*scoringMatrix[j][0];
            finalMatrix[0][1] += teamAandBmatrix[0][m]*scoringMatrix[j][1];
            m++;
        }

        int n = 0;
        for (int j = 0; j < scoringMatrix.length; j++) {

            finalMatrix[1][0] += teamAandBmatrix[1][n]*scoringMatrix[j][0];
            finalMatrix[1][1] += teamAandBmatrix[1][n]*scoringMatrix[j][1];
            n++;
        }

        System.out.println(Arrays.deepToString(finalMatrix));

    }
}
