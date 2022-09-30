// Print a Matrix in Spiral 

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	 public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        //print boundaries
        while(startRow <= endCol && startCol <= endCol) {
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1; i>startRow; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++; startRow++;
            endCol--; endRow--;
        }

        System.out.println();
    }

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < m; j++)
            {
				arr[i][j] = sc.nextInt();
			}
		}
    printSpiral(arr);
	}
}

// Input:
// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
