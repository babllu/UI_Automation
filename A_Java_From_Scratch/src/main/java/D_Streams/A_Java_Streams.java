package D_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_Java_Streams {

	
	public static void main (String [] args) {
		
		String [] s = {"Akhil","Abhishek","Saketh","Manikanta","Manoj","Phani","Manoj"};
		List<String> names = Arrays.asList(s);
		
//		Count the Names in arrayList starts with A:
		System.out.println("************** Count names in arrayList starts with A:*******************************************************");
		long c = names.stream().filter(a->a.startsWith("A")).count();
		System.out.println(c);
		
		
//		Print the Names in arrayList starts with M:
		System.out.println("************** Print the names in arrayList starts with M:********************************************************");
		names.stream().filter(a->a.startsWith("M")).sorted().forEach(a->System.out.println(a));
		
//		Sort the names
		System.out.println("************** Sort the names and convert into Uppercase Letters *******************************************************");
		names.stream().sorted().map(a->a.toUpperCase()).forEach(a->System.out.println(a));

		
//		Print the names after index 2
		System.out.println("************** Names after index 2 *******************************************************");
		names.stream().filter(n->n.length()>1).limit(9).sorted().forEach(n->System.out.println(n));
		
//		Print the distict names
		System.out.println("************** Distinct Names *******************************************************");
		names.stream().distinct().forEach(a->System.out.println(a));
		
//		Print the names based on the index
		System.out.println("************** Print the names based on the index *******************************************************");
		List <String> ls = names.stream().distinct().collect(Collectors.toList());
		System.out.println(ls.get(4));

		
	}
}
