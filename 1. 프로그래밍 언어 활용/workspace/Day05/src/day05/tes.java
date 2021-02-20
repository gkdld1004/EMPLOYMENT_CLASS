package day05;

public class tes {

	public static void main(String[] args) {
		int count = 5;
		int total = count * count;
		int arr[][] = new int[count][count];
		int i = 0, Ystart = 0, Yend = count + 1; // Y
		int j = -1, Xstart = -1, Xend = count + 1; // X
		int n = 0; // VALUE

		while (n <= total) {
			Xend--;
			for (j = j + 1; j < Xend; j++) {
				arr[i][j] = ++n;
			}
			if (n == total)
				break;
			j--;
			Yend--;
			for (i = i + 1; i < Yend; i++) {
				arr[i][j] = ++n;
			}
			i--;
			Xstart++;
			if (n == total)
				break;
			for (j = j - 1; j >= Xstart; j--) {
				arr[i][j] = ++n;
			}
			j++;
			Ystart++;
			if (n == total)
				break;
			for (i = i - 1; i >= Ystart; i--) {
				arr[i][j] = ++n;
			}
			i++;
			if (n < total)
				continue;
			else
				break;
		}

		for (i = 0; i < count; i++) {
			for (j = 0; j < count; j++) {
				System.out.printf("[%03d]", arr[i][j]);
			}
			System.out.println("");
		}

	}
}
