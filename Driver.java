import java.util.ArrayList;
public class Driver extends MySorts{

    public static void main(String[] args){
	ArrayList<Comparable> test = new ArrayList();
	test.add(3);
	test.add(2);
	test.add(1);
	test.add(4);
	test.add(5);
	test.add(2);
	//sort command here
	System.out.println(BogoSort(test));
    }
}
