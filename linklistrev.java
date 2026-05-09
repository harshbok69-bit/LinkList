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
         if(head==null){
             head=tail=temp;
         }
         else{
             temp.next=head;
             head=temp;
         }
     }
     
         
         void display(){
            node temp=head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
         }
         void insert(int id,int val){
            node temp=head;
            int x=0;
            while(temp!=null){
            if(x==id-1){
              node ins=new node(val); 
              ins.next=temp.next;
              temp.next=ins;
              return;
              
            }
            temp=temp.next;
            x++;
            }
         }
         void delete(int id){
             node temp=head;
             if(head==null) return;
             if(id==0){
               head=head.next;
               temp=null;
               return;
             }
             
             int y =0;
             while(temp!=null){
                 if(y==id-1){
                    temp.next=temp.next.next;
                    return;
                 }
                
                 temp=temp.next;
                 y++;
             }
         }
         void deletetail(){
             if(head==null)return;
             if(head==tail){
                 head=null;
                 tail=null;
                 return;
             }
             node temp=head;
             while(temp!=null){
                 
                 if(temp.next.next==null){
                    temp.next=null;
                    tail=temp;
                    return;
                 }
                 temp=temp.next;
             }
                
        }
        void rev(){
            node pre =head;
            node curr=head.next;
            node forward=curr.next;
            pre.next=null;
            while(forward!=null){
                curr.next=pre;
                pre=curr;
                curr=forward;
                forward=forward.next;
            }
            curr.next=pre;
            head=curr;
        }
    }
        
    
    public class Main{
        
     public static void main (String[] args) {
         ll lp = new ll();
         lp.headadd(10);
          lp.headadd(20);
           lp.headadd(30);
            lp.headadd(40);
            lp.display();
            System.out.println("after rev");
            lp.rev();
            lp.display();
            System.out.println("again rev");
            lp.rev();
            lp.display();
           
            
         
         
         
     }
     
    }