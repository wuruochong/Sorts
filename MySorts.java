/*
Ruochong Wu
APCS1 PD 10
Sorts
*/

import java.util.ArrayList;

public class MySorts {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    
    public static boolean isSorted(ArrayList<Comparable> data){
	for (int count = 0; count<data.size()-1 ; count++){
	    if (!(data.get(count).compareTo(data.get(count+1)) <= 0)){
		return false;
	    }
	}
	return true;
    }
    

    public static void bubbleSortV( ArrayList<Comparable> data ) {
	int count =0;
	while (isSorted(data)==false){
	    int x = data.size()-(count%(data.size()-1)) -1;
	    
	    int y = data.size()-(count%(data.size()-1))-2;
	    
	    if ((data.get(x)).compareTo((data.get(y))) < 0){
		data.set(x,data.set(y,data.get(x)));
	    }
	    count++;
	}
    }


    
    public static ArrayList<Comparable> bubbleSort(ArrayList<Comparable> input){
	bubbleSortV(input);
	return input;
    }

        public static void minHelper(int index, ArrayList<Comparable> data){
	int champIndex = index;
	for (int counter = index ; counter < data.size() ; counter++){
	    if ((data.get(champIndex)).compareTo(data.get(counter)) > 0){
		champIndex = counter;
	    }
	}
	data.set(index,(data.set(champIndex,data.get(index))));
    }

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	for (int x = 0 ; x<data.size() - 1 ; x++){
	    minHelper(x,data);
	}
    
	    
	    
	    
	/* your implementation UP IN HERE, UP IN HERE */
    }//end selectionSort -- O(?)


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) 
    {
	ArrayList<Comparable> temp = new ArrayList();
	for (int counter = 0 ; counter < input.size() ; counter++){
	    temp.add(input.get(counter));
	}
	selectionSortV(temp);
	return temp;
        }//end selectionSort -- O(?)



    public static ArrayList<Comparable> BogoSort(ArrayList<Comparable> input){
	while (isSorted(input)==false){
	    shuffle(input);
	}
	return input;
    }

    public static void BogoSortV(ArrayList<Comparable> input){
	while (isSorted(input)==false){
	    shuffle(input);
	}
    }
}
