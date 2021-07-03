package com.xworkz.aptitude.demomatric;

public class PrintingBoundary {

	public static void printBoundary(int a[][], int m,
            int n)
{
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
if (i == 0)
System.out.print(a[i][j] + " ");
else if (i == m - 1)
System.out.print(a[i][j] + " ");
else if (j == 0)
System.out.print(a[i][j] + " ");
else if (j == n - 1)
System.out.print(a[i][j] + " ");
else
System.out.print("   ");
}
System.out.println(" ");
}
}

public static void main(String[] args) {
int a[][] = { { 11, 12, 13, 14 ,15}, {21, 22, 23, 24, 25}, { 31, 32, 33,  34, 35 }, { 41, 42, 43, 44, 45 } ,{ 51, 52, 53, 54, 55}};
//11 12 13 14 15
//21          25
//31          35
//41          45
//51 52 53 54 55
printBoundary(a, 5, 5);

}

}