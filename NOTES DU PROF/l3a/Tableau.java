public class Tableau {
	public boolean equivalence(int tab1[], int tab2[]) {
		for (int i = 0; i < tab1.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < tab2.length; j++) {
				if (tab1[i] == tab2[j]) {
					isFound = true;
					break;
				}
			}

			if (!isFound)
				return false;
		}

		for (int i = 0; i < tab2.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < tab1.length; j++) {
				if (tab2[i] == tab1[j]) {
					isFound = true;
					break;
				}
			}

			if (!isFound)
				return false;
		}

		return true;
	}
}