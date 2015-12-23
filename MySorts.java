/*
Ruochong Wu
APCS1 PD 10
HW51 -- Dat Bubbly Tho
2015-12-21
*/

import java.util.ArrayList;

public class BubbleSort {

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
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
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
    
    //Unfinished
    /*    public static ArrayList<Comparable> bubbleSortHelper(ArrayList<Comparable> input , int index){
	  input.set(index,input.set(index-1,input(index)));
	return input;
	}
    
    
    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
    if (isSorted(input)==true){
	return input;
	    }
	else {
	return bubbleSort(bubbleSortHelper(input,
	    }//end bubbleSort -- O(?)
    */
    
    public static ArrayList<Comparable> bubbleSort(ArrayList<Comparable> input){
	bubbleSortV(input);
	return input;
    }

    public static ArrayList<Comparable> BogoSort(ArrayList<Comparable> input){
	while (isSorted(input)==false){
	    shuffle(input);
	}
    }
