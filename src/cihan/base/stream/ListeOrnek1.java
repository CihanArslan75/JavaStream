package cihan.base.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListeOrnek1 {
	public static void main(String[] args) {
		List<String> liste= Arrays.asList(new String[] {"Cihan","Atilla","Edanur","Bilge"});
	    //System.out.println(liste);
//	    liste.stream().forEach((s) -> {
//	    //System.out.println(s);	
//	    });
	    liste.stream().filter(s->s.contains("i")).map(s->s.toUpperCase()).sorted().forEach(System.out::println);
	    liste.stream().filter((s)->{
	    	return s.startsWith("C");
	    }).map((s)->{
	    	return s.toLowerCase();
	    }).forEach((s) -> {
	    	System.out.println(s);
	    });
	    
	    Arrays.stream(IntStream.range(65, 95).toArray()).mapToObj((s)->String.valueOf((char) s)).filter(s-> s.compareTo("H")>0).findFirst().ifPresent(System.out::println);
	 
	    
	}
	
}
