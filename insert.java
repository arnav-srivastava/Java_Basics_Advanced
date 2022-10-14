insert a node  at the end of a singly linked list::

ListNode newnode=new ListNode(value);
if(head==null
{
   head=newnode;
   return;
}
ListNode current=head;

while(current.next!=null){
current=current.next();
}
current.next=newnode;