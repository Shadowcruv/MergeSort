import java.util.ArrayList;

public class DynamicArray {

    public int size;
    public int capacity;
    Object[] array;
    int ind;
    public DynamicArray() {
        capacity = 5;
        this.array = new Object[capacity];

        size = 0;
        ind = 0;
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        ind = 0;
    }

    public void add(Object data) {
        if(size == capacity){
            grow();
        }
        array[size] = data;
        size++;
        if(size <= (int) (capacity / 1.5)){
           shrink();
        }
    }

    private void shrink(){
        int newCapacity = (int)(capacity/1.5);
        Object[] updatedArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            updatedArray[i] = array[i];
        }
        capacity = newCapacity;
        array = updatedArray;
    }

    public void insert(int index, Object data){

        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;

    }


    public void insert2(int index, Object data) {
        int y = 1;
        array[size] = array[size - 1];

        for(int i = 1; (size - i) > index; i++){
            y++;
            array[size - i] = array[size - y];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        search(data);
        if (ind == -1) {
            //nothing will happen
        }
        for (int i = ind; i < (capacity-1); i++) {
            array[ind] = array[ind + 1];
            ind++;
        }
        size--;
    }

    public int search(Object data) {
        for(int i=0; i < capacity; i++){
            if(array[i] == data){
                ind = i;
                return i;
            }
        }
        ind = -1;
        return -1;
    }
    private void grow(){
        int newCapacity = (int)(capacity * 2);
        Object[] updatedArray =  new Object[newCapacity];
        for(int i = 0; i< capacity; i++){
            updatedArray[i] =array[i];
        }
        capacity = newCapacity;
        array = updatedArray;
    }


    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public String toString(){
        String string = "";

        for(int i = 0; i < capacity; i++){
            string += array[i] + ", ";

        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() - 2) +"]";
        } else{
            string = "[]";
        }

        return string;
    }



}
