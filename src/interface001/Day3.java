package interface001;

public class Day3 {
	
		public static void main(String[] args) {

			int[] a = {  3, 199, 5, 9, 13, 15, 17 };
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "-");
			}
			System.out.println();
			// ///////////////--Ã°ÅÝÅÅÐò--////////////////

		for (int j = 0; j < a.length-1; j++) {
			for (int i = 0; i < a.length - 1 - j; i++) {
				if (a[i] > a[i + 1]) {
					int c = a[i];
					a[i] = a[i + 1];
					a[i + 1] = c;

				}

		}

		}

			// ////////////////////////////////////////
			// ////////////
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "-");
			}
			System.out.println();
		}
	}


