public class Stacks {
    private final int[] arr;
    private int count=0,min=999999999;
    public Stacks(int size) {arr = new int[size];}
    public void push(int value){if(value<min){min=value;}arr[count++]=value;}
    public int pop(){return arr[--count];}
    public int peek(){return arr[count-1];}
    public boolean isEmpty(){return count==0;}
    public int min(){return min;}
}
