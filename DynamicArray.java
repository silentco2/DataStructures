package array;
    public class Array {
  private int[] arr;
  private int count;
  public Array(int length) {
    arr = new int[length];
    
  }
    public void insert(int value){
        if (count==arr.length){int[] temp= new int[count+1];
            System.arraycopy(arr, 0, temp, 0, count);
            temp[count++]=value;
            arr=temp;}
        else{arr[count++]=value;}
    }
 public void print(){
    for (int i=0; i<count;i++){System.out.println(arr[i]);}
 }
 public void remove(int index){
    if (index>=0&&index<=count){
        for (int i=index+1; i<=count;i++){arr[i-1]=arr[i];}
        count--;
 }
 }
 public int indexof(int value){
    for (int i=0;i<count;i++){if (value==arr[i]){return i;}}
    return-1;
 }
 public int max(){
     int max=arr[0];
    for (int i=0;i<=count;i++){if (arr[i]>max){max=arr[i];}}
    return max;
 }
 public Array intersect(int[] arr1){
     Array inter =new Array(count-1);
    for (int i : arr){
        for (int j : arr1){
            if (i==j && inter.indexof(i)==-1){inter.insert(i);}
            }        
        }
    return inter;
 }
 public Array reverse() {
     Array rev=new Array(count);
    for(int i=count;i>=0;i--){rev.insert(arr[i]);}
    return rev;
 }
 public void insert(int value,int index){
     if (arr.length==count){int[] temp= new int[++count];
        System.arraycopy(arr, 0, temp, 0, index);
        temp[index]=value;
        System.arraycopy(arr, index, temp, index+1, arr.length-index);
        arr=temp;}
     else{
     System.arraycopy(arr, index, arr, index+1, count-index);
     arr[index]=value;
     count++;
     }
         
     }
 }    
