package linkedlist;
public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){this.value=value;}
    }
    private Node first;
    private Node last;
    private int size;
    public void addFirst(int value){
        Node node=new Node(value);
        if (first==null){first=last=node;}
        else{node.next=first;first=node;}
        size++;
    }
    public void addLast(int value){
        Node node=new Node(value);
        if (first==null){first=last=node;}
        else{last.next=node;last=node;}
        size++;
    }
    public int indexOf(int value){
        int count=0;
        Node node=first;
        while(node!=null){
            if(node.value==value){return count;}
            count++;
            node=node.next;
        }
        return -1;
    }
    public boolean contains(int value){
    return indexOf(value)!=-1;
    }
    public void deleteFirst(){
        if (first==null){return;}
        if (first.next==null){first=null;size=0;return;}
        Node newFirst=first.next;
        first.next=null;
        first=newFirst;
        size--;
    }
    public void deleteLast(){
        if (first==null){return;}
        if (first.next==null){first=null;size=0;return;}
        Node node=first;
        while(node.next!=last){node=node.next;}
        node.next=null;
        last=node;   
        size--;
    }
    public int size(){return size;}
    public int[] toArray(){
        int[] arr=new int[size];
        int index=0;
        Node node=first;
        while(node!=null){
            arr[index++]=node.value;
            node=node.next;
        }
        return arr;
    }
    public void reverse(){
        if(first==null){return;}
        Node p=first;
        Node c=first.next;
        while (c!=null){
            Node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        last=first;
        last.next=null;
        first=p;
    }
    public int kthFromEnd(int value){
        int count=0;
        boolean check=false;
        Node node=first;
        while(node!=null){
            if(node.value==value){count=0;check=true;}
            count++;
            node=node.next;
        }
        if(check){return count;}
        return -1;
    }
}
