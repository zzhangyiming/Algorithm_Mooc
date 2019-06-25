package Arrays;

public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {//无参构造函数
        this(10);
    }//无参构造函数

    public int getCapacity() {
        return data.length;
    }//获取数组的容量和

    public int getSize() {
        return size;
    }//获取元素的个数

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e){

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        if(size == data.length)
            resize(2 * data.length);

        for(int i = size - 1; i >= index ; i --)
            data[i + 1] = data[i];

        data[index] = e;

        size ++;
    }
    public  void addLast(E e){
        add(size,e);
    }

    public  void addFirst(E e){
        add(0,e);
    }

    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    public E getLast(){
        return get(size-1);

    }

    public E getFirst(){
        return get(0);
    }

    public E set(int index,E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        data[index] = e;
        return data[index];
    }

    public boolean contains(E e){
        for(int i = 0;i <size; i++){
            if(data[i] == e)
                return true;
        }
        return false;
    }

    public E remove(int index){
        if(index <0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = data[index];
        for(int i = index+1; i < size; i++){
            data[i-1]  =data[i];
        }
        size--;
        data[size] = null;
        if(size == data.length/2)
            resize(data.length/2);
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    public int find(E e){
        for(int i = 0; i <size; i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }


    private void resize( int newCapacity){
            E[] newData = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            data = newData;
        }

}