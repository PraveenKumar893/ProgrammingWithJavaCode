package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

	
class threadState1 implements Runnable {
	private static int count = 0;
	
    private final int threadId ;

	private  static final int intValuess = 10;
		
	private static final  Object lock = new Object();

	

	public threadState1(int threadId) {
		this.threadId = threadId;
	}
	
    public void run() {
        while (true) {
            synchronized (lock) {
                if (count >= intValuess) {
                	break;
                }
                if (count % 3 == threadId) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    lock.notifyAll(); 
                } else {
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class interfacevalues implements interfaceconcepts {

	public void methodswrite() {
		
		System.out.println(" Concreatte method Called  ");
		
	}

	}

	
public class winsenTechnologyQuestions  {
	
	 static void addingArrayBetweenNumbers() { // [0,3,0,4,4,0,9,0] [3,8,9]

		 int [] num1 = {0,3,0,4,4,0,9,0,8,2,0};
		 int total = 0; int j = -1;
		 
		 for(int i = 0 ;i<num1.length-1;i++) {
			 
			 if(num1[i+1] == 0) {
				 j++;
				 num1[j] = total;
				 total = 0;
			 } else {
				 total = total + num1[i+1];
			 }
			 
		 }
		 
		 System.out.println(Arrays.toString(num1));
		 
		 System.out.println(Arrays.toString(Arrays.copyOfRange(num1, 0,j+1)));
	}

	 // input : [33,6,99] output : 99633 input : [33,6,31] output : 63331

	 
	 static void possiblityMatchingNumbers () {
		 int num23 [] = {33,9,31,99} ;
		 StringBuilder sdf = new StringBuilder();
		 
	//	 Arrays.sort(num23);
		 
		List<Integer> sds =  Arrays.stream(num23).boxed().sorted((s1,s2) -> s2%10-s1%10).toList();
		 
		 System.out.println(sds);
		 
		 for(int jkl : sds) {
			 sdf.append(jkl);
		 }
		 System.out.println(sdf.toString());
 	 }

	 static void  printListValuesByMultiply () {
		 //1,2,3,4,5 - multiple by 5 in each element and sum them
		 
		 Function<Integer, Integer> dsds = jk -> jk*5 ;
		 
		 List<Integer> ds = new ArrayList<>();
		 ds.add(1);
		 ds.add(2);
		 ds.add(3);
		 ds.add(4);
		 ds.add(5);
		 
		int total = 0;
		total = ds.stream().map(dsds).reduce(0 , Integer :: sum);

		 System.out.println(" Total values  " + total);
		 int totalValue = 0;
		 int ssdds = ds.stream().mapToInt(op -> op*5 + totalValue).sum();
		 
		 System.out.println(" Totalll Valuessasa " + ssdds);

	 }
	 
	 static void finsdListOfStrings() {
		 
		 List<List<String>> skillset = Arrays.asList(Arrays.asList("Java" ,"Springboot" ,"Spring"),
				   Arrays.asList("react" , "Frontend" ,"javaScript")
				 );
		 
			List<String>dsds =  skillset.stream().flatMap(op -> op.stream()).toList();
			
			System.out.println(dsds);
			
			System.out.println(dsds.stream().filter(po -> po.startsWith("S")).toList());
	 }
	 
	 
	 static void renamingarrayValues() {
		 
		 int [] num = {9} ;
		 StringBuffer sdf = new StringBuffer();
		 
		 for(int i = 0 ; i<num.length;i++) {
			 sdf.append(num[i]);
		 }
		 int hj = Integer.parseInt(sdf.toString())+1;
		 
		 String.valueOf(hj).split(" ");
		 		 
	 }
	 
	 static boolean parenthesis () {
		 
		 String str = "(()"; // {[]}()
		 
		 Stack<Character> stack = new Stack<>();
		 
		 for(char hj :  str.toCharArray()) {
			 
			 if(hj == '{' || hj == '[' || hj == '(') {
				 stack.push(hj);
			 }  else {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 stack.pop();
			 }		 
		 }
		return stack.isEmpty();
		 
	 }
	 
	 static void optionalClasses() {
		 
		 Optional<String> dsds = Optional.of("Praveen Kumar");
		 
		 if(dsds.isPresent()) {
			 System.out.println(dsds.get());
		 }
		 
	 }
	 
	 static void abcClasseswith() {
		 int num1 = 24;
		 System.out.println(num1/26 + "  " + num1%26);
		 StringBuilder builder = new StringBuilder();
		 while(num1 > 0) {
			 num1--;
	            char ch = (char) ('A' + (num1 % 26));
	            builder.insert(0, ch);  
	            num1 /= 26;
		 }
		 System.out.println(builder.toString());

	 }
	 
	 static void removeZerosValues() {
		 int [] arrs = {3, 2, 0, 0, 4, 0, 6}; 
		 int j = 0;
		 for(int i = 0 ; i<arrs.length;i++) {
			 if(arrs[i] != 0) {
				 int temp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j]  = temp;
					j++;
				 
			 }
		 }
		 System.out.println(Arrays.toString(Arrays.copyOfRange(arrs, 0, j)));

	 }
	 
	    public static int sumOfDigits(int n) {
	        if (n == 0)
				return 0;
	        System.out.println(n % 10 + "sdssdsdds" + n/10 );
	        return (n % 10) + sumOfDigits(n / 10);
	    }
	    
	    public static int sumofPrimenumbers(int limit) {
	        int sum = 0;
	        for (int num = 2; num <= limit; num++) {
	            if (isPrime(num)) {
	                sum += num;
	            }
	        }
	        return sum;
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num <= 3) return true;
	        if (num % 2 == 0 || num % 3 == 0) return false;

	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    
	    public static void getprimenumbersfunction() {
	    	
	    	System.out.println(" Prime Number finded started ");
	    	int limit  = 50 ; // 2,3,5,7,11,13,17,19
	    	List<Integer> primeList = new ArrayList<>();
	    	for(int i = 2 ; i<=limit;i++) {
	    		if(i<=3) {
	    			primeList.add(i);
	    		} else if(i == 5) {
	    			primeList.add(i);
	    		} else if(i%2 != 0 && i%3 != 0 && i%5 != 0) {
	    			primeList.add(i);
	    		}
	    	}
	    	
	    	primeList.forEach(op -> System.out.print(op + " "));
	    	System.out.println(" Added Prime Numberss ");
	    	int totalvalue = 0 ; int finalSum = 0;
	    	finalSum = primeList.stream().mapToInt(ko -> ko + totalvalue).sum();
	    	System.out.println( " Final Output Valuess " + finalSum);
	    }
	    
		public static void findfirstnonrepeatingCharacters() {

			String str = "PPrraveen";
			
			Map<Character, Integer> jdkal = new LinkedHashMap<>();
			
			for(Character ch : str.toCharArray()) {
				jdkal.put(ch, jdkal.getOrDefault(ch, 0)+1);
			}
			
			char sdsdaas = jdkal.entrySet().stream().filter(op -> op.getValue() == 1).findFirst().get().getKey();

			System.out.println(" findfirstnonrepeatingCharacters  " + sdsdaas);
		//	 List<Character> dsds = str.chars().mapToObj(c->(char)c)
			// sorted((s1,s2) -> s1.compareTo(s2)).toList();
			 

		}
		
		static void anagram() {
			
			String str1 = "Silent";
			String str2 = "listen" ;
			List<Character> dsd = new ArrayList<>();
			
			if(str1.toUpperCase().length() != str2.toUpperCase().length()) {
				System.out.println("length mismatch");
			} else {
			
			// to check anagram or not 
			
			for(int i = 0 ; i<str1.length();i++) {
				
				for(int j = 0 ; j<str2.length();j++) {
					if(str1.toUpperCase().charAt(i) == str2.toUpperCase().charAt(j)) {
						dsd.add(str1.charAt(i));
					}
				}
			}
		}
			System.out.println(dsd.toString());
			
			char [] char1 = str1.toUpperCase().toCharArray();
			char [] char2 = str2.toUpperCase().toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
				
		   boolean sdsdsd = 	Arrays.equals(char1,char2);
			
			System.out.println( " Is anagram or not  " + sdsdsd );
									
		}
		
		static void Panagram() {
			
	        String sentence = "The quick brown fox jumps over the lazy dog";
	        
	       int sizevalues =    sentence.toUpperCase().chars()
	            .filter(Character :: isAlphabetic)
	            .map(c -> (char) c)
	            .collect(HashSet::new, Set::add, Set::addAll)
	            .size();
	       
	       if(sizevalues == 26) {
	    	   System.out.println(" The panagramm program " + true);
	       }
		}
		
		static void SubStringProgramwithVowels() {
			
			String str1 = "pravepn" ;
			List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
			
			String fix = " " ;
			String jkl = "";
			StringBuffer vowelss = new StringBuffer();
			
			int max = str1.length()-2;
			
			for (int i = 0; i < max; i++) {
				fix = str1.substring(i, i + 3);
				vowelss = new StringBuffer();
				for (int j = 0; j < fix.length(); j++) {
					if (vowels.contains(fix.charAt(j))) {
						vowelss.append(fix.charAt(j));
					}
				}
				if(vowelss.toString().length() >= jkl.length()) {
					jkl = vowelss.toString();
					vowelss = new StringBuffer();
					vowelss.append(fix);
				}
			}			
			
			System.out.println(" The Vowelsss " + vowelss.toString());
			
			List<String> hjk = new ArrayList<>();
			
			for(int i = 0 ; i<=2;i++) {
				String dsds = str1.substring(i, i+3);
				hjk.add(dsds);
			}
			
			System.out.println(hjk.toString() + " " + vowels.toString());
			
			Map<Character, Integer> vowelMap = new HashMap<>();
			
			for(String sf : hjk) {
				
				for(char ch : sf.toCharArray()) {
					
					if(vowels.contains(ch)) {
						vowelMap.put(ch, vowelMap.getOrDefault(ch, 0)+1);
					}
				}
				
			}
			
			System.out.println(" Vowelss   " + vowelMap.toString());
			
			// using java 8 methods
			
			System.out.println( IntStream.range(0, str1.length()-2).mapToObj(i -> str1.substring(i, i+3)).toList());
			
			Map<Object, Long> vowelsMap = new HashMap<>();
			
			vowelsMap = 	hjk.stream().flatMapToInt(String :: chars).mapToObj(c -> (char) c)
			  .filter(vowels :: contains)
			  .collect(Collectors.groupingBy(c->c , Collectors.counting()));
			
			System.out.println(" Vowelss   " + vowelsMap.toString());

		}
		
		static void AlternateSubStringProgramWithVowels () {
			
			String str = "Praveen" ;
			String subString = "";
			int count =  0;
			int maxcount = 0;
			String currentString = "";
			
			int max = str.length()-2;
			
			List<Character> vowelss = new ArrayList<>(List.of('a','e','i','o','u'));
			
			for(int i = 0; i<max;i++) {
				subString = str.substring(i, i+3);
				count = 0;
				for(int j = 0; j<subString.length();j++) {
					
					if(vowelss.contains(subString.charAt(j))) {
						count++;
					}
				}
				
				if(count >= maxcount) {
					maxcount = count;
					currentString = subString;
				}
				
			}
			
			System.out.println(" The SubString Valuesss   " + currentString);
		}

		public static void main(String[] args) throws InterruptedException {
		
			interfacevalues objwe = new interfacevalues();
			objwe.methodswrite();
			objwe.scope();
			interfaceconcepts.display();
			
        Thread th1 = new Thread(new threadState1(0), "Thread21");
        Thread th2 = new Thread(new threadState1(1), "Thread22");
        Thread th3 = new Thread(new threadState1(2), "Thread23");
      //  Thread th4 = new Thread(new threadState1(3), "Thread24");


		th1.start();		
		th2.start();
		th3.start();
	//	th4.start();
 //       [1,2,3] 1,2,4
        addingArrayBetweenNumbers();
        possiblityMatchingNumbers();
        printListValuesByMultiply();
        renamingarrayValues();
        finsdListOfStrings();
       boolean isparentesis =  parenthesis();
       System.out.println(" sdsdds  " + isparentesis);
       optionalClasses();
		abcClasseswith();
		removeZerosValues();
		System.out.println(sumOfDigits(12345));
		System.out.println(sumofPrimenumbers(50));
		getprimenumbersfunction();
		findfirstnonrepeatingCharacters();
		anagram();
		Panagram();
		SubStringProgramwithVowels();
		AlternateSubStringProgramWithVowels();
		
	}

}
