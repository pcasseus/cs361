/**
 * 
 */
package mystack;

/**
 * @author Patrick Casseus 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null) {
		return null;
	}
	T val = theStack.val;
	theStack = theStack.next;
	return val;
} 

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> inStack = new MyStack<>();
		// Push 1 and 2
		inStack.push(1);
		inStack.push(2);
		// Pop
		System.out.println("Popped from Integer stack: " + inStack.pop());
		// Push 5
		inStack.push(5);
		System.out.println("Popped from Integer stack: " + inStack.pop());
		
		// TODO To complete
		class Person {
			String name;

			Person(String name) {
				this.name = name;
			}

			public String toString() {
				return name;
			}
		}

		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		Person p1 = new Person("Patrick");
		Person p2 = new Person("Christelle");
		// Push a person p1 with your name
		personStack.push(p1);
		// Push a person p2 with my name
		personStack.push(p2);
		System.out.println("Popped from Person stack: " + personStack.pop());
	}
}
