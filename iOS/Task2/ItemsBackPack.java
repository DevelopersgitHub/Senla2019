package iOS.Task2;

import java.util.Scanner;

public class ItemsBackPack {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		try {
			 System.out.print("Введите количество предметов: ");
			 size = scanner.nextInt();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Subject[] subjects = new Subject[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Введите наименование " + (i+1) + " предмета: ");
			String name = scanner.next();
			
			System.out.print("Введите вес " + (i+1) + " предмета: ");
			double weight = scanner.nextDouble();
			
			System.out.print("Введите стоимость " + (i+1) + " предмета: ");
			double cost = scanner.nextDouble();
			
			subjects[i] = new Subject(name, weight, cost);
		}
		
		for(int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i].toString());
		}
		
		/*
		 * next action on define border and max 
		 */
	
		 System.out.print("Введите общий вес рюкзака : ");
		 double userWeightBackPack = scanner.nextDouble();
		 
		 double totalWeightInBackPack = 0;
		 	
		 /*
		  * the program takes items sequentially from 1 to n.
		  */
		 for(int i = 0; i < subjects.length; i++) {
			 if(totalWeightInBackPack < userWeightBackPack && subjects[i].getWeight() < userWeightBackPack) {
				 totalWeightInBackPack += subjects[i].getWeight();
				 System.out.println("Положили в рюкзак: " + subjects[i].getName() + "...");
		 	 }
		 }
		 
		System.out.print(subjects[i].getName() + " ");
		 for(int i = 0; i < subjects.length; i++) {
				System.out.print(subjects[i].getName() + " ");
		 }	
	}
}
