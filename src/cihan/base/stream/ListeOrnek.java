package cihan.base.stream;

import java.util.ArrayList;
import java.util.List;

public class ListeOrnek {
	
	public static void main(String[] args) {
		List<Integer> sayilar= new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			sayilar.add(i);
		}
		System.out.println(sayilar.stream());
		//Predicate<T>
		sayilar.stream().mapToInt(n ->n).average().ifPresent(System.out::println);   // sayilar.stream().mapToInt(n ->n).average() sonucunu  System.out::println veriyor ifpresent metot çalýþabilir.
		sayilar.stream().mapToInt(n->n).average().ifPresent((a)-> {
		System.out.println("Ortalama:" +a); });
		
		sayilar.stream().forEach(System.out::println);
		sayilar.stream().forEach((s)-> {
			System.out.println("Elemanların iki katı:" +(s*2));
		});
		
		sayilar.stream().forEach((s)-> {
			System.out.println("Elemanlar:" + s);
		});
	}

}
