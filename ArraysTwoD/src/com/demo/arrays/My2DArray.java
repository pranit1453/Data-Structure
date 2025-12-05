package com.demo.arrays;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];
	}

	public My2DArray(int rows, int cols) {
		arr = new int[rows][cols];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enetr value " + i + "," + j);
				arr[i][j] = sc.nextInt();

			}
		}
	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

	public int[] findSumRowWise() {
		int[] sumofrows = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				sumofrows[i] += arr[i][j];
			}
		}
		return sumofrows;
	}

	public int[] findSumColumnWise() {
		int[] sumofcols = new int[arr[0].length];
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = i; j < arr.length; j++) {
				sumofcols[i] += arr[j][i];
			}
		}
		return sumofcols;
	}

	public int[][] add2DArrays(My2DArray ob) {
		if (this.arr.length == ob.arr.length && this.arr[0].length == ob.arr[0].length) {
			int[][] temp = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					temp[i][j] = arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}

	public int[][] subtract2DArrays(My2DArray ob) {
		if (this.arr.length == ob.arr.length && this.arr[0].length == ob.arr[0].length) {
			int[][] temp = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					temp[i][j] = arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}

	// flag==true ---->rotate rows upward
	// flag==false ---->rotate rows downward
	public void rowRotation(boolean flag, int num) {
		if (flag) {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = arr[0];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
			}
		} else {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = arr[arr.length - 1];
				for (int i = arr.length - 1; i > 0; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
			}
		}
	}

	// flag==true ---->rotate right
	// flag==false ---->rotate left
	public void columnRotation(boolean flag, int num) {
		if (flag) {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = new int[arr.length];
				// to copy last column int temp array
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][arr[0].length - 1];
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = arr[0].length - 2; j >= 0; j--) {
						arr[i][j + 1] = arr[i][j];
					}
				}

				// copy temp array as 0th col
				for (int i = 0; i < arr.length; i++) {
					arr[i][0] = temp[i];
				}
			}
		} else {

			for (int cnt = 0; cnt < num; cnt++) {
				// to copy last column into temp array
				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][0];
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 1; j < arr[0].length; j++) {
						arr[i][j - 1] = arr[i][j];
					}
				}

				// copy temp array as oth column
				for (int i = 0; i < arr.length; i++) {
					arr[i][arr[0].length - 1] = temp[i];
				}
			}

		}
	}

	public int[][] transpose() {
		int[][] temp = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}

	public boolean isSysmmetric() {
		// check matrix is square matrix
		if (arr.length == arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] != arr[j][i])
						return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isIdentity() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j && arr[i][j] != 1) {
					return false;
				} else if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
}
