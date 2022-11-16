public class Main {
	public int maxBlock(String str) {
		int max = 0;
		for (int i = 0, j; i < str.length(); i++) {
			String iChar = str.substring(i, i + 1);
			for (j = i + 1; j < str.length() && str.substring(j, j + 1).equals(iChar); j++);
			max = Math.max(max, j - i);
		}
		return max;
	}

	public static void main(String[] args) {
		for (int y = 1; y <= 6; y++) {
			for (int x = 0; x < y; x++)
				System.out.print(" ");
			for (int x = 0; x < y; x++)
				System.out.print("*");
			System.out.println();
		}
	}
}
