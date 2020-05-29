package model;

public class File implements CommonEl {
	private String fileName;
	private float fileSize;

	public File(String fileName, float fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;
	}

	public String getName() {
		return fileName;
	}

	public float getSize() {
		return fileSize;
	}

	public String toString() {
		return "File: {fileName=" + fileName + ", fileSize=" + fileSize + "KB}";
	}
	
}
