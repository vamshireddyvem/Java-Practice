package Exceptional_handling;
class stackOverFlowExceptiion extends Exception{
    public String toString(){
        return "Stack OverFlow there is no Space in Array/Stack";
    }
}
class stackUnderFlowExceptiion extends Exception{
    public String toString(){
        return "Stack UnderFlow there nothing in Array/Stack";
    }
}

class stack{
    int size;
    int top=-1;
    int arr[];
    stack(int sz){
        size=sz;
        arr=new int[sz];
    }
    public void push(int x) throws stackOverFlowExceptiion{
        if(top==size-1){
            throw new stackOverFlowExceptiion();
        }
        top++;
        arr[top]=x;
    }
    public void pop(int x)throws stackUnderFlowExceptiion{
        if(top==-1)
            throw new stackUnderFlowExceptiion();
        x=arr[top];
        top--;
    }
}

public class student_excerise {
    public static void main(String[] args) throws stackOverFlowExceptiion, stackUnderFlowExceptiion {
        stack n= new stack(5);
        n.pop(2);
        n.push(1);
        n.push(1);
        n.push(1);
        n.push(1);
        n.push(1);
        n.push(1);
        
    }
}
