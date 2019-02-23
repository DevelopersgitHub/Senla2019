package iOS.Task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Consonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alphabetRu = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
		String alphabetEn = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
		
		/**
		 * ways enter of data with (file(press number 1), console(press number 2))
		 * @then(enter string by select language - ru(1),en(2))
		 **/
		boolean cont = true;
		while(cont) {
			System.out.println('\n' + "Select way download of data (file/console): \n1. file\n2. console");
			Integer way = scanner.nextInt();	
			
			if(way.equals(2)) {
				System.out.println("Select language (ru/en): \n1. ru\n2. en");
				Integer str = scanner.nextInt();		
				if(str.equals(1)){
					System.out.println("Ââåäèòå ñòðîêó (ru): ");
					String temp = scanner.next();
					char[] chArray = temp.toCharArray();
					Map<Character, Integer> mapping = findChars(chArray, alphabetRu, temp);
					if(!mapping.isEmpty()) {
						System.out.println("Исходный текст: " + temp + '\n' + mapping);
					} else {
						System.out.println("В введённой строке нет согласных букв. Пожалуйста, проверьте раскладку клавиатуры.");
					}
				
					 LinkedHashMap<Character, Integer> sortedMap = sorting(mapping);
					 printAll(sortedMap);
				} else {
					System.out.println("Enter string (en): ");
					String temp = scanner.next();
					
					char[] chArray = temp.toCharArray();
					Map<Character, Integer> mapping = findChars(chArray, alphabetEn, temp);
					if(!mapping.isEmpty()) {
						System.out.println("String: " + temp + '\n' + mapping);
					} else {
						System.out.println("The entered string contains no consonant letters. Please check the keyboard layout.");
					}
				
					 LinkedHashMap<Character, Integer> sortedMap = sorting(mapping);
					 printAll(sortedMap);
				}
			} else {
				String str = readFromFile();
				char[] chArray = str.toCharArray();
				Map<Character, Integer> mapping = findChars(chArray, alphabetRu, str);
				if(!mapping.isEmpty()) {
					System.out.println("Èñõîäíûé òåêñò: " + str + '\n' + mapping);
				} else {
					System.out.println("В введённой строке нет согласных букв. Пожалуйста, проверьте раскладку клавиатуры.");
				}
			
				 LinkedHashMap<Character, Integer> sortedMap = sorting(mapping);
				 printAll(sortedMap);
			}
			System.out.println('\n' + "Continue: \n1. yes\n2. no");
			Integer str = scanner.nextInt();	
			if(str.equals(2)) {
				cont = false;
			}
		}
	}
	
	public static void printAll(LinkedHashMap<Character, Integer> sortedMap) {
		for ( Character key : sortedMap.keySet() ) {
		    System.out.print(key + " ");
		}
	}
	
	public static LinkedHashMap<Character, Integer> sorting(Map<Character, Integer> map) {
		LinkedHashMap<Character, Integer> sortedMap =
		        new LinkedHashMap<>();
		List<Character> mapKeys = new ArrayList<>(map.keySet());
	    List<Integer> mapValues = new ArrayList<>(map.values());
	    Collections.sort(mapValues);
	    Collections.reverse(mapValues);
	    Collections.sort(mapKeys);
	    Collections.reverse(mapKeys);
		    Iterator<Integer> valueIt = mapValues.iterator();
		    while (valueIt.hasNext()) {
		    	Integer val = valueIt.next();
		        Iterator<Character> keyIt = mapKeys.iterator();
		        while (keyIt.hasNext()) {
		            Character key = keyIt.next();
		            Integer comp1 = map.get(key);
		            Integer comp2 = val;
		            if (comp1.equals(comp2)) {
		                keyIt.remove();
		                sortedMap.put(key, val);
		                break;
		            }
		        }
		    }
		    return sortedMap;
	}
	
	public static Map<Character, Integer> findChars(char[] chArray, String alphabet, String temp) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < chArray.length; i++) {
			if(alphabet.indexOf(temp.charAt(i)) > -1) {
				Integer value = map.get(temp.charAt(i));
				if (value != null) {
					map.put(temp.charAt(i), map.get(temp.charAt(i)) + 1);
				} else {
					map.put(temp.charAt(i), 1);
				}
			}
		}
		return map;
	}
	public static String readFromFile() {
		
		/*
		 * task restriction works only for reading from files
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of word (example: 10, 15 -> where 10 - min, 15 - max): ");
		String limit = sc.nextLine();
		String[] size = limit.split(", ", 2);
		int[] sizeInt = new int[size.length];
		for (int i = 0; i < size.length; i++) {
		    int n = Integer.parseInt(size[i]);
		    sizeInt[i] = n;
		}
		
		
		/**
		 * @method - reading a file with one text (union by lines)
		 */
		String str = "";
		try{
			   FileInputStream fstream = new FileInputStream("C:/file.txt");
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			   String strLine;
			   while ((strLine = br.readLine()) != null){
				   if(strLine.length() > sizeInt[0] || strLine.length() < sizeInt[1]) {
					   str = str.concat(strLine);
				   }
			   }
			}catch (IOException e){
			   System.out.println(e.getMessage());
			}
		return str;
	}
}
