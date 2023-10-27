package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		double min = n;
		
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//expressão lambida declarada
		
		list.removeIf(p -> p.getPrice() >= min);
		//expressão lambida inline
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
