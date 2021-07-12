package numbers_random_of_500_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ran {
public static void main(String[] args) {
	List<Integer> integer=new ArrayList<Integer>(500);
	Random rnd=new Random();
	for(int i=0;i<500;i++) {
		 int result=rnd.nextInt(500-1+1)+1;
		 integer.addAll(i, integer);
		 System.out.println(result);
	}
	integer.sort(null);
}
}