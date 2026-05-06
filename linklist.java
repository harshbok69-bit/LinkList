class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
    class ll{
        node head;
        node tail;
        
        void headadd(int x){
            node temp=new node(x);
            if (head==null){
                tail=head=temp;
            }
            else{
             temp.next=head;
             head=temp;
            }
            
        }
        void dis(){
            node temp=head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
        
        }
    }
    public class Main{
        public static void main(String [] args){
            ll lp=new ll();
            lp.headadd(10);
            lp.headadd(20);
            lp.headadd(30);
            lp.dis();
        }
    }
    
