import java.util.Stack;

public class Ques4 {

	public static int cal(int op1,String oper, int op2)
	{
		switch (oper) {
		case "+": return op1+op2;
		case "-": return op1-op2;
		case "*": return op1*op2;
		case "/": return op1/op2;
		case "$": return (int) Math.pow(op1, op2);
			
		}
		return 0;
	}
	public static  String evaluationOfPrefix(String prefix)
	{
		String output = null;
		Stack<Object> st=new Stack<>();
		String[] stinfix=prefix.split(" ");
		
		for (int i = stinfix.length-1; i >=0 ; i--) {
			String ele=stinfix[i];
			try
			{
				int e=(Integer.parseInt(ele));
				 st.push(e);
			}
			catch (Exception e) {
				int op1=(int) st.pop();
				int op2=(int) st.pop();
				st.push(cal(op1, ele, op2));
				
			}
		  
						
		}
		//output=(String) st.pop();
		output=String.valueOf(st.pop());
		return output;
	}
	public static  String evaluationOfPostfix(String Postfix)
	{
		String output = null;
		Stack<Object> st=new Stack<>();
		String[] stinfix=Postfix.split(" ");
		
		for (int i = 0; i < stinfix.length; i++) {
			String ele=stinfix[i];
			try
			{
				int e=(Integer.parseInt(ele));
				 st.push(e);
			}
			catch (Exception e) {
				int op2=(int) st.pop();
				int op1=(int) st.pop();
				st.push(cal(op1, ele, op2));
				
			}
		  
						
		}
		//output=(String) st.pop();
		output=String.valueOf(st.pop());
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Prefix : * / 12 4 + 25 3 : "+ evaluationOfPrefix("* / 12 4 + 25 3"));
		 System.out.println("Postfix : 12 4 / 25 3 + * : "+ evaluationOfPostfix("12 4 / 25 3 + *"));
           
		
		

	}

}
