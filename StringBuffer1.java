
class  StringBuffer1{
	public static void main (String[] args) {
	   StringBuffer sb=new StringBuffer("hello");
	   // append method
	   sb.append(" java");
	   System.out.println(sb);
	   // insert method
	   StringBuffer sb1=new StringBuffer("Hello");
	   sb1.insert(1,"Java");
	   System.out.println(sb1);
	   //replace method
	   StringBuffer sb2=new StringBuffer("Hello");
	   sb2.replace(1,3,"Java");
	   	   System.out.println(sb2);
	   //delete method
	   StringBuffer sb3=new StringBuffer("Hello");
	   sb3.delete(1,3);
	   	   System.out.println(sb3);
	   	   //reverse method
	   	   StringBuffer sb4=new StringBuffer("Hello");
	   	   sb4.reverse();
	   	   System.out.println(sb4);
	}
}