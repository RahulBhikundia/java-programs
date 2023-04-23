class Stack
{
    private int stack[];
    private int tos;

    // Allocate and initialize stack class
    Stack(int length)
    {
        stack = new int[length];
        tos = -1;
    }

    // Push an item onto the Stack
    void push(int item)
    {
        if(tos == stack.length - 1)
            System.out.println("Stack is Full!!");
        else
            stack[++tos] = item;
    }

    // Pop an item from the stack
    int pop()
    {
        if(tos == -1)
        {
            System.out.println("Stack is Empty!!");
            return 0;
        }
        else
            return stack[tos--];
    }
}

class TestStack 
{
    public static void main(String args[])
    {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        // Push some numbers onto the stack
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);

        // pop those numbers of the stack
        System.out.println("Stack in mystack1:");
        for(int i=0; i<5; i++) System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i=0; i<8; i++) System.out.println(mystack2.pop());

    }        
}
