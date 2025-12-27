package ex;

public class LinearList {
	private String strArray[];
	private int size;
	public static int MAX = 100;

	public LinearList() {
		size = 0;
		strArray = new String[MAX];
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int length() {
		return size;
	}

	public String retrieve(int i) {
		return strArray[i];
	}

	public int find(String str) {
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}

	public void replace(int i, String str) {
		strArray[i] = str;
	}

	public void replace(String str1, String str2) {
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(str1)) {
				strArray[i] = str2;
			}
		}
	}

	public void delete(int i) {
		for (int j = i; j < size; j++) {
			strArray[j] = strArray[j + 1];
		}
		size--;
	}

	public void delete(String str) {
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(str)) {
				size--;
			}
		}

	}

	public void insert(String str) {
		strArray[size] = str;
		size++;
	}

	public void printArray() {
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] : " + strArray[i]);
		}
	}
}
