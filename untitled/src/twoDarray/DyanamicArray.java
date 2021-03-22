package twoDarray;
import java.util.ArrayList;
public class DyanamicArray {   //array is homogenous(either str or string or bool...) and arraylist is a heterogenous
    public static void main(String[] args) {
        ArrayList soft = new ArrayList();  //arraylist initialised
        //size of the ArrayList
        System.out.println("Size of Soft: "+soft.size());
        // data in ArrayList
        soft.add("Batch 28");
        soft.add("Batch 27");
        soft.add(12);
        soft.add(1.5);
        soft.add(true);
        soft.add(0,"Batch 29");

        System.out.println("Size of soft after add operations: "+ soft.size());

        //find the index of data
        System.out.println("Batch 28 index in soft: "+soft.indexOf("Batch 28"));

        //get method
        System.out.println("Value in 2 index: "+soft.get(3));
        System.out.println("");
        //loop through
        for(int i=0; i<soft.size();i++){
            System.out.println("Batch in soft: "+ soft.get(i));
        }
        System.out.println("");

        //for each loop in ArrayList

        //Object newArray[] = soft.toArray();//       Object to type casting of elements

        for(Object i: soft){
            System.out.println("Batch in soft: "+ i);
        }

        //remove
        soft.remove("Batch 29");
        System.out.println(soft);
        System.out.println("Batch 28 index in soft: "+soft.indexOf("Batch 28"));

        //clone
        Object newArrayList = soft.clone();
        System.out.println("Clone of soft ArrayList: "+ newArrayList);

        //clear
        soft.clear();
        System.out.println(soft);
    }
}
