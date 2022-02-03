package com.demo.exceptionhandling;

public class TryWithMutipleCatchBlocks {

	public static void main(String ar[]) {

		int array[] = new int[10];

		try {
			array[11] = 100;

			System.out.println(array);
		} catch (ArrayIndexOutOfBoundsException r) {

			System.out.println("caused to due to array" + r);

		}

		catch (IndexOutOfBoundsException e) {

			System.out.println("IndexOutOfBoundsException" + e);

		}
		
		
		catch (Exception e) {

			System.out.println("" + e);

		}

	}

}
