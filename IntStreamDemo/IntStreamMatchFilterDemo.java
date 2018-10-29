import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamMatchFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 82, 78, 94, 56, 78, 66, 55, 90, 86, 56, 66, 75, 91, 61 };

		// convert InStream to Stream<Integer>
		Stream<Integer> iStream = IntStream.of(scores).boxed();
		// can iterate through it via iterator()
		Iterator<Integer> it = iStream.iterator();
		System.out.print("Stream of student scores are : ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		// Matching functions for IntStream ranges or arrays
		// anyMatch(condition) , matches if any value in stream or array match
		// specified condition
		// anyMatch will check if a predicate holds for at least one of the
		// elements in the stream.
		System.out.println(
				"\nDoes scores stream contains any even score : " + IntStream.of(scores).anyMatch(i -> i % 2 == 0));

		// check if any student scores distinction i.e. 90 or above
		System.out.println("Does any student scores distinction : " + IntStream.of(scores).anyMatch(i -> i >= 90));

		// allMatch() & noneMatch()
		System.out.println("Does all student scores more than 50 : " + IntStream.of(scores).allMatch(i -> i >= 50));
		System.out.println("Does any student scores more than 100 : " + IntStream.of(scores).noneMatch(i -> i > 100));

		// filter() - to filter data
		// we try to filter scores greater than 70 & only even scores
		System.out.println("marks >=70 & even marks : "
				+ IntStream.of(scores).filter(i -> i >= 70 & i % 2 == 0).allMatch(i -> i % 2 == 0));

		System.out.println("marks >=80 & odd marks : "
				+ IntStream.of(scores).filter(i -> i >= 80).anyMatch(i -> i%2==1));

		//fetch max & min stream value
		System.out.println("max student score is : " + IntStream.of(scores).max().getAsInt());
		System.out.println("min student score is : " + IntStream.of(scores).min().getAsInt());

		//get all even marks >=80 & in sorted order
		Iterator<Integer> itr = IntStream.of(scores).filter(i -> i>=80 & i%2==0).boxed().sorted().iterator();
		System.out.print("Get all even marks >=80 & in sorted order : ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		//using reduce() to reduce all values in a stream to single value, by adding their sum
		System.out.println("\nSum of all scores is : " + IntStream.of(scores).reduce((x,y) -> (x+y)).getAsInt());
	}

}
