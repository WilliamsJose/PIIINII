package view;

import model.File;
import model.Folder;

public class Test {

	public static void main(String[] args) {
		File file1 = new File("First Yohoooo", 10);
		File file2 = new File("Second Ieeeeei", 20);
		
		Folder folder1 = new Folder("First Foolder");
		folder1.add(file1);
		folder1.add(file2);
		
		Folder folder2 = new Folder("Second Foolder");
		
		File file3 = new File("The Third Ieeeeei", (float) 22.6);
		
		folder2.add(file3);
		folder2.add(folder1);
		folder2.add(new File("The Fourth hm", (float) 11.8));
		
		System.out.println(folder2.toString());
		
		System.out.println("\n----------------------------\n");
		
		Folder folder3 = new Folder("Third Folder");
		folder1.add(folder3);
		
		//remove old folder1
		folder2.remove(folder1);
		
		folder2.add(folder1);
		
		System.out.println(folder2.toString());
		
		System.out.println("\n----------------------------\n");
		
		folder2.clear();
		System.out.println(folder2.toString());
		
	}

}
