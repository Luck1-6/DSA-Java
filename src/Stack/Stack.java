package Stack;

class MyStack{
	int stk[];
	int top;
	int size;
	MyStack(int s){
		stk= new int[s];
		size=s;
		top=-1;
	}
	void push(int item) {
		if (top==size-1) {
			System.out.println("Stack Overflow");
		}else {
			stk[++top]=item;
		}
	}
	int pop() {
		if (top==-1) {
			System.out.println("Empty Stack");
			return -1;
		}
		else {
			return stk[top--];
			}
	}
	int peek() {
		if (top==-1) {
			System.out.println("Empty Stack");
			return -1;
		}
		else {
			return  stk[top];
		}
	}
	boolean isempty() {
		return top==-1;
	}
}


public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s1=new MyStack(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);//stack overflow
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}
