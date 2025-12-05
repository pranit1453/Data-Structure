package com.demo.arraystest;

import java.util.Scanner;

import com.demo.arraysbean.My1DArray;
import com.demo.services.SingleDimArray;
import com.demo.services.SingleDimArrayServices;

public class Test1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SingleDimArray singleservices = new SingleDimArrayServices();
		My1DArray arr = new My1DArray();
		Operations op = null;

		do {
			System.out.println("---Select Operations---");
			for (Operations o : Operations.values()) {
				System.out.println(o.ordinal() + "." + o);
			}
			System.out.print("Enter Choice : ");
			String input = sc.nextLine();

			try {
				int choice = Integer.parseInt(input);
				if (choice < 0 || choice >= Operations.values().length) {
					System.out.println("Invalid choice....");
					continue;
				}
				op = Operations.values()[choice];

				switch (op) {
				case accept:
					System.out.println("Enter data in array...");
					int[] arr1 = arr.getArr();
					singleservices.accept(arr1);
					break;
				case display:
					System.out.println("Displayed Data");
					arr1 = arr.getArr();
					singleservices.display(arr1);
					break;
				case add_end:
					System.out.print("Enter data to add : ");
					int data=sc.nextInt();
					boolean status=singleservices.addAtEnd(data);
					if(status) {
						System.out.println("Added at End");
					}else {
						System.out.println("Not Added");
					}
					break;
				case add_pos:
					break;
				case Exit:
					sc.close();

				}

			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid number format. Please enter a valid integer.");
			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}

		} while (op != Operations.Exit);

	}

}
