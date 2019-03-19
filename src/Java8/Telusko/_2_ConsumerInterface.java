/**
 * 
 */
package Java8.Telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Tousif
 *
 */
public class _2_ConsumerInterface {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);

		//FunctionalInterface
		Consumer<Integer> consumer = new Consumer<Integer>() {

			public void accept(Integer i) {
				System.out.println(i);
			}

		};
	
		values.forEach(consumer);
	
	}


}
