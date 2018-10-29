import java.util.stream.IntStream;

public class IntStreamDemo {

	static int getMaxMarks(int[] arr) {
		return IntStream.of(arr).max().getAsInt();
	}

	static int getMinMarks(int[] arr) {
		return IntStream.of(arr).min().getAsInt();
	}

	static long getNumberOfSubjectMarks(int[] arr) {
		return IntStream.of(arr).count();
	}

	static int getSumOfAllMarks(int[] arr) {
		return IntStream.of(arr).sum();
	}

	static int[] getSortedMarksArray(int[] arr) {
		return IntStream.of(arr).sorted().toArray();
	}

	static int[] getLimitedSizeMarksArray(int[] arr, int lim) {
		if (lim < 0) {
			throw new IllegalArgumentException("limit size cannot be less than zero");
		} else {
			return IntStream.of(arr).limit(lim).toArray();
		}
	}

	static double getAverageMarks(int[] arr) {
		return IntStream.of(arr).average().getAsDouble();
	}

	static int[] getDistinctMarks(int[] arr) {
		return IntStream.of(arr).distinct().toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 42, 35, 48, 26, 39, 25, 31, 35, 39 };

		// of(int/int[]) - changes integer array to IntStream object, calling
		// forEach we can loop through entire array
		// of() - Returns a sequential ordered stream whose elements are the
		// specified values.
		IntStream is = IntStream.of(marks);
		System.out.print("marks are : ");
		is.forEach(x -> {
			System.out.print(x + " ");
		});

		// returns number of elements in an array, count() returns long value
		System.out.println("\ntotal subjects are : " + getNumberOfSubjectMarks(marks));

		// Find sum of all elements of array
		System.out.println("Sum of all marks are : " + getSumOfAllMarks(marks));

		// skip(n) - skips first n character of an array & display it
		for (long i = 0; i < marks.length; i++) {
			int[] arr = IntStream.of(marks).skip(i).toArray();
			System.out.print("\nafter skipping " + i + " elements, marks array is : ");
			for (int k : arr) {
				System.out.print(k + " ");
			}
		}

		// Find maximum & minimum element in an array
		System.out.println("\nMaximum marks in array is : " + getMaxMarks(marks));
		System.out.println("Minimum marks in array is : " + getMinMarks(marks));

		// sort all the elements of an array
		IntStream.of(marks).sorted().forEach(x -> System.out.print(x + " "));
		// using sorted() to create a new sorted array
		System.out.print("\nMarks array : ");
		for (int i : marks) {
			System.out.print(i + " ");
		}
		int[] sortedMarks = getSortedMarksArray(marks);
		System.out.print("\nMarks after sorting becomes : ");
		for (int i : sortedMarks) {
			System.out.print(i + " ");
		}

		// get marks array to some limit
		int[] limMarksArray = null;
		//Scanner sc = new Scanner(System.in);
		// System.out.print("\nEnter limit to see that much array : ");
		// int lim = sc.nextInt();
		try {
			limMarksArray = getLimitedSizeMarksArray(marks, 3);
			System.out.print("\nLimited size array is : ");
			for (int m : limMarksArray) {
				System.out.print(m + " ");
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		// Get Average of all values or marks
		System.out.println("\nAverage marks is : " + (float) getAverageMarks(marks));

		// Get distinct marks i.e. no duplicate marks allowed
		System.out.print("Distinct marks available are : ");
		for (int dis : getDistinctMarks(marks)) {
			System.out.print(dis + " ");
		}
		System.out.println();

		// Create a stream within some range
		// range(x,y) - x is included, y is excluded. Example - range(1,7) will
		// create array from 1 to 6
		IntStream i = IntStream.range(1, 7);
		i.forEach(System.out::print);

		int[] rangeArray = IntStream.range(0, 10).toArray();
		System.out.print("\nRange create between 0 to 10 is : ");
		for (int r : rangeArray) {
			System.out.print(r + " ");
		}

		// rangeClosed(x,y) - Both x & y will be included
		int[] closedRange = IntStream.rangeClosed(0, 10).toArray();
		System.out.print("\nClosed Range create between 0 to 10 is : ");
		for (int r : closedRange) {
			System.out.print(r + " ");
		}

		// what if we want only even numbers.
		// With iterator we can define a start value and a function that will
		// calculate the next int's based on the previous element.
		// iterator creates an infinite stream, so I've used limit to create a
		// stream containing just 50 elements.
		int[] ite = IntStream.iterate(1, k -> k + 2).limit(50).toArray();
		System.out.print("\nlooping only odd values till 100 : ");
		for (int odd : ite) {
			System.out.print(odd + " ");
		}

		// the normal map function to find the squared value of all ints between
		// 0 and 10.
		int[] sq = IntStream.rangeClosed(0, 10).map(k -> k * k).toArray();
		System.out.print("\nsquared values between 0 to 10 is : ");
		for(int s:sq) {
			System.out.print(s + " ");
		}
	}

}
