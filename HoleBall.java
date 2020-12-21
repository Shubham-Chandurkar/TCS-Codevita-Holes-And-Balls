package DailyProgram;

public class HoleBall {

	public static void main(String[] args) {

		int[] H = { 21, 3, 6 };
		int[] B = { 20, 15, 5, 7, 10, 4, 2, 1, 3, 6, 8 };

		// Cap array for Hole capacity
		int[] Cap = new int[H.length];

		for (int i = 0; i < H.length; i++) {
			Cap[i] = i + 1;
		}

		// flag to check which ball is not going into any hole
		int flag = 0;

		// loop to iterate ball diameters
		for (int i = 0; i < B.length; i++) {

			// loop to iterate hole diameters
			for (int j = H.length - 1; j >= 0; j--) {

				if (H[j] >= B[i] && Cap[j] > 0) {
					System.out.print(j + 1 + " ");
					Cap[j] = Cap[j] - 1;
					break;
				} else {
					flag++;
				}
			}
			if (flag == H.length) {
				System.out.print("0 ");
			}
			flag = 0;

		}

	}
}
