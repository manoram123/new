package Rivision;

public class Array {

    int i = 0;
    int size = 0;
    int []array = new int[6];

    public void insert(int value){
        array[i] = value;
        size++;
        i++;
    }

    public void delete(int index){
        int container = 0;
        for (int a=index; a<size; a++){
            array[index+1] = container;
            array[index] = array[index+1];
            container = array[index];
            index++;
        }
    }


    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Array a = new Array();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.delete(1);
        a.display();
    }
}
