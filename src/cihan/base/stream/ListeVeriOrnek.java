package cihan.base.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListeVeriOrnek {
	
	public static void main(String[] args) {
		List<String> liste = Arrays.asList(new String[] {"hüseyin","dilan","ali","ahmet","veli"});
	    liste.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).sorted().forEach(System.out::println) ;
//	    Stream<String> ss= liste.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).sorted();
//	    System.out.println(ss);
//	   
//	    liste.stream().filter((s)->{
//	    		System.out.println("filtre:"+s);
//	    		System.out.println("************************************");
//	    		return s.startsWith("a");
//	    		
//	   }).map((s) -> {
//		    System.out.println("map:"+s);
//   			System.out.println("##############################");
//   			return s.toUpperCase();
//	   }).forEach((s) -> {
//		   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSS");
//		   System.out.println(s);
//	   });
//	    
//	    // sonuc AL� VE AHMET  buldu�unu sonuna kadar getiriyor. arrayda kald��� yerden ba�tan ba�l�yor
//	    
//	    System.out.println("--  �nt stream ba�lang�c�-------------------------");
//	   IntStream.range(1, 10).filter(new IntPredicate() {
//		
//		@Override
//		public boolean test(int value) {
//			//System.out.println("value:"+value);
//		return value%2 !=0;  // �ift say�lara false d�ner. tek say�lara true tek d�ner .
//		}
//	}).forEach(System.out::println); // ��kt�da tek say�lar d�ner.
//	    
//	   
//	   System.out.println("-------------Lamdal� hali----------------------------------");
//	   IntStream.range(1, 10).filter((s)-> {
//		 return  s%2 !=0;
//	   }).forEach(System.out::println);
//	    		
//	   System.out.println("--------------------Tek say�lar�n ortalamas�--------------------------");
//	   IntStream.range(1, 10).filter((i)->i%2!=0).average().ifPresent(System.out::println);
//	   System.out.println("----------------------------------------------");
//	 
//	   Arrays.stream(IntStream.range(65, 95).toArray()).mapToObj(s->String.valueOf((char) s)).filter(s->s.compareTo("H")>0).findFirst().ifPresent (System.out::println);
//	   Arrays.stream(IntStream.range(65, 95).toArray()).mapToObj(s->String.valueOf((char) s)).filter(s->s.compareTo("H")<0).findFirst().ifPresent (System.out::println);
//	   Arrays.stream(IntStream.range(65, 95).toArray()).mapToObj(s->String.valueOf((char) s)).filter(s->s.compareTo("H")==0).findFirst().ifPresent (System.out::println);
//	  
	   
}
}
