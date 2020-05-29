package model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements CommonEl {
	private String folderName;
	private float folderSize;
	private List<Object> container;
	
	public Folder(String folderName) {
		this.folderName = folderName;
		this.container = new ArrayList<>();
	}
	
	public void add(Folder folder) {
		container.add(folder);
		folderSize += folder.getSize();
	}
	
	public void add(File file) {
		container.add(file);
		folderSize += file.getSize();
	}
	
	public String getName() {
		return folderName;
	}

	public float getSize() {
		return folderSize;
	}
	
	public String toString() {
		String root = "Folder: [folderName=" + folderName + ", folderSize=" + folderSize + "KB,";
		String temp = "";
		for(int i = 0;i < container.size();i++) {
			temp += "\nContains=" + container.get(i) + ",";
		}
		return root + temp + "]";
	}
	
}
