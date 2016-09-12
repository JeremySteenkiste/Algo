package tp1;

import java.util.Random;

/**
 * SDD Seance TP 1 :
 *
 * @author <a href="mailto:Frederic.Guyomarch@univ-lille1.fr">FrÃ©dÃ©ric Guyomarch</a>
 * IUT-A, Universite de Lille, Sciences et TEchnologies
 */
public class Sort {


	public static int [] generateRdmIntArray(int n, int min, int max){
		int [] tab = new int[n];
		Random r = new Random();

		for(int i=0;i<n;i++){
			tab[i] = r.nextInt(max-min)+min;
		}
		return tab;
	}

	public static int idxMin(int[] tab, int b, int e){
		int idx = b;
		for(int i=b+1;i<e;i++){
			if(tab[i]<tab[idx]){
				idx=i;
			}
		}
		return idx;
	}

	public static void insertSort(int [] tab) {
		int j;
		for (int i = 1; i < tab.length; ++i) {
			int elem = tab[i];
			for (j = i; j > 0 && tab[j-1] > elem; j--){
				tab[j] = tab[j-1];
			}
			tab[j] = elem;
		}
	}

	public static void selectSort(int [] tab){
		for(int i=0;i<tab.length;i++){
			swap(tab, i, idxMin(tab, i, tab.length));
		}

	}

	public static void printArray(int [] tab){
		tab.toString();    	
	}

	public static void swap(int [] tab, int idx, int idx2){
		int tmp = tab[idx];
		tab[idx] = tab[idx2];
		tab[idx2] = tmp;
	}

	public static void bubbleSort(int [] tab){
		for(int i = 0;i<tab.length-1;i++){
			for(int j=0;j<tab.length-1;j++){
				if(tab[j]>tab[j+1]){
					swap(tab,j,j+1);
				}
			}
		}
	}


}
