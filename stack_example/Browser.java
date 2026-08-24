package stack_example;

import java.util.ListIterator;
import java.util.Stack;

public class Browser {
	Stack<String> history = new Stack<>();
	void visit(String url)
	{
		history.push(url);
	}
	
	void back()
	{
		if(history.isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		else
		{
			history.pop();
		}
	}
	
	String getCurrentPage()
	{
		if(history.isEmpty())
		{
			return "Stack is empty";
		}
		else
		{
			return history.peek();
		}
	}
	
	void showAllHistory()
	{
//		for(String s: history)
//		{
//			if(s.isEmpty())
//			{
//				System.out.println("History is empty");
//			}
//			else
//			{
//				System.out.println(s);
//			}
//		}
		
		ListIterator<String> lit = history.listIterator(history.size());
		while(lit.hasPrevious())
		{
			String url = lit.previous();
			System.out.println(url);
		}
	}
}

