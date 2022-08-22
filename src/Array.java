import java.util.Objects;

public class Array {
    private String array[];
    boolean indexFound;
    private int count;

    //To create an array of desired length
    public Array(int length) {
        array = new String[length];
    }

    public void insert(String item){
        if(count == array.length) {
            String newArray[] = new String[count * 2];
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
            array[count++] = item;

    }



    public int indexOf(String item) {
        for (int i = 0; i < count; i++) {
            if (array[i] == item)
                return i;

        }
        return -1;
    }

    public void remove(String item){
        int index=0;
        for(int i=0;i<count;i++) {
            if (array[i] == item)
                index = i;
        }
        for(int i=index;i<count;i++) {
            array[i] = array[i + 1];
        }
        count--;
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(array[i]);
        }
    }
}
