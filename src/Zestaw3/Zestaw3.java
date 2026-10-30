package Zestaw3;


import java.util.ArrayList;
import java.util.Collections;

// Programowanie obiektowe
// ----------------------------------------
// Operacje na listach tablicowych.
// ----------------------------------------
// mgr inż. Adam Zalewski
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class Zestaw3 {

    // Zadanie 0.
    // Napisz funkcję główną (main).

    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);

        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);

        System.out.println(merge(tab1, tab2));
        System.out.println(checkDigit(tab1, 4));
    }

    // Zadanie 1.
    // Napisz funkcję 
	//		append(ArrayList<Integer> tab1, ArrayList<Integer> tab2), 
	// która tworzy nową listę tablicową poprzez 
	// dołączenie drugiej listy tablicowej do pierwszej. 

    static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<tab1.size(); i++){
            result.add(tab1.get(i));
        }
        for (int i=0; i<tab2.size(); i++){
            result.add(tab2.get(i));
        }
        return result;
    }

    // Zadanie 2.
    // Napisz funkcję 
	//		merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2), 
	// która tworzy nową listę tablicową poprzez 
	// dołączenie drugiej listy tablicowej do pierwszej w taki sposób, 
	// że elementy wstawiane są na przemian. W przypadku, gdy skończą się 
	// elementy jednej listy to do wyniku należy dołączyć pozostałe elementy. 

    static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i=0, j=0;

        while (i<tab1.size() && j<tab2.size()){
            result.add(tab1.get(i++));
            result.add(tab2.get(j++));
        }
        while (i < tab1.size()){
            result.add(tab1.get(i++));
        } 
        while (j < tab2.size()) {
            result.add(tab2.get(j++));
        }
        return result;
    }

    // Zadanie 3.
    // Napisz funkcję 
	//		mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2), 
	// która tworzy nową listę tablicową poprzez 
	// dołączenie drugiej listy tablicowej do pierwszej w taki sposób, 
	// że elementy wstawiane są w porządku rosnącym. 

    static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i=0, j=0;

        while (i<tab1.size() && j<tab2.size()){
            if (tab1.get(i) <= tab2.get(j)){
                result.add(tab1.get(i));
                i++;
            } else {
                result.add(tab2.get(j));
                j++;
            }
        }

        while (i < tab1.size()){
            result.add(tab1.get(i));
            i++;
        }
        while (j < tab2.size()){
            result.add(tab2.get(j));
            j++;
        }
        return result;
    }

    // Zadanie 4.
    // Napisz funkcje 
	//		toArrayList(String napis)
	//		toArrayList(int liczba), 
	// które z napisu/liczby tworzą listę tablicową posortowanych rosnąco znaków/cyfr. 

    static ArrayList<String> toArrayList(String napis){
        ArrayList<String> result = new ArrayList<>();
        for (char c: napis.toCharArray()){
            result.add(String.valueOf(c));
        }
        Collections.sort(result);
        return result;
    }

    static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> result = new ArrayList<>();
        int n = Math.abs(liczba);
        if (n == 0){
            result.add(0);
            return result;
        }
        while (n > 0){
            result.add(n % 10);
            n /= 10;
        }
        Collections.sort(result);
        return result;
    }

    // Zadanie 5.
    // Napisz funkcje 
	//		checkChar(ArrayList<String> tab, char znak) 
	// 		checkDigit(ArrayList<Integer> tab, int cyfra),
	// które sprawdzają czy podany znak/cyfra jest w liście 
	// tablicowej z zadania 4 i zwracają true lub false.

    static boolean checkChar(ArrayList<String> tab, char znak){
        for (int i=0; i<tab.size(); i++){
            if (tab.get(i).charAt(0) == znak){
                return true;
            }
        }
        return false;
    }

    static boolean checkDigit(ArrayList<Integer> tab, int cyfra){
        for (int i=0; i<tab.size(); i++){
            if (tab.get(i) == cyfra){
                return true;
            }
        }
        return false;
    }

    // Zadanie 6.
    // Napisz funkcje 
	//		countChar(ArrayList<String> tab, char znak) 
	// 		countDigit(ArrayList<Integer> tab, int cyfra),
	// które zliczają występowanie podanego znaku/cyfry 
	// w liście tablicowej z zadania 4 i zwracają ilość zliczonych elementów. 

    static int countChar(ArrayList<String> tab, char znak){
        int licznik = 0;
        for (int i=0; i<tab.size(); i++){
            if (tab.get(i).charAt(0) == znak){
                licznik++;
            }
        }
        return licznik;
    }

    static int countDigit(ArrayList<Integer> tab, int cyfra){
        int licznik = 0;
        for (int i=0; i<tab.size(); i++){
            if (tab.get(i) == cyfra){
                licznik++;
            }
        }
        return licznik;
    }

    // Zadanie 7.
    // Napisz funkcje 
	//		uniqueArrayList(ArrayList<String> tab)
	// 		uniqueArrayList(ArrayList<Integer> tab), 
	// które tworzą dwuwymiarową listę tablicową unikalnych wartości, 
	// a każda z wartości ma przyporządkowane 0.  
	// Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,0], [4,0], [5,0], [7,0]] 

    static ArrayList<ArrayList<String>> uniqueArrayList(ArrayList<String> tab){
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        for (int i=0; i<tab.size(); i++){
            if (tab.indexOf(tab.get(i)) == i){
                ArrayList<String> pair = new ArrayList<String>();
                pair.add(tab.get(i));
                pair.add("0");
                result.add(pair);
            }
        }
        return result;
    }

    static ArrayList<ArrayList<Integer>> uniqueArrayList2(ArrayList<Integer> tab){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<tab.size(); i++){
            if(tab.indexOf(tab.get(i)) == i){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(tab.get(i));
                pair.add(0);
                result.add(pair);
            }
        }
        return result;
    }

    // Zadanie 8.
    // Napisz funkcje 
	// 		countArrayList(ArrayList<String> tab) 
	// 		countArrayList(ArrayList<Integer> tab), 
	// które tworzą dwuwymiarową listę tablicową, w której 
	// zliczana jest ilość występujących cyfry/znaków z tablic z zadania 4 
	// Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,1], [4,1], [5,2], [7,2]] 


    static ArrayList<ArrayList<String>> countArrayList(ArrayList<String> tab){
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        for (int i=0; i<tab.size(); i++){
            if (tab.indexOf(tab.get(i)) == i){
                int count = 0;
                for (int j=0; j<tab.size(); j++){
                    if (tab.get(i).equals(tab.get(j))) count++;
                }
                ArrayList<String> pair = new ArrayList<String>();
                pair.add(tab.get(i));
                pair.add(String.valueOf(count));
                result.add(pair);
            }
        }
        return result;
    }

    static ArrayList<ArrayList<Integer>> countArrayList2(ArrayList<Integer> tab){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<tab.size(); i++){
            if (tab.indexOf(tab.get(i)) == i){
                int count = 0;
                for (int j=0; j<tab.size(); j++){
                    if (tab.get(j).equals(tab.get(i))) count++;
                }
                ArrayList<Integer> intPair = new ArrayList<Integer>();
                intPair.add(tab.get(i));
                intPair.add(count);
                result.add(intPair);
            }
        }
        return result;
    }
}


