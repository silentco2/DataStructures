public class ArrayQueue {
private final int[] arr;
private int front,rear,count;
public ArrayQueue (int size){arr=new int[size];}
    public void add(int value){
    if (isFull())throw new ArrayStoreException("OverFlow");
    arr[rear]=value;
    rear=(rear+1)%arr.length;
    count++;
}
    public int remove(){
    if (isEmpty())throw new ArrayStoreException("UnderFlow");
    count--;
    int value = arr[front];
    front=(front+1)%arr.length;
    return value;

}
    public int peek(){if (isEmpty())throw new ArrayStoreException("UnderFlow");return arr[rear];}
    public boolean isEmpty(){return count==0;}
    public boolean isFull(){return count == arr.length;}
