package interviews.IHS_Markit;

public class SandwichString {

	

	public static String getSandwich(String str) {

		int len=str.length();
		String tempValue ="";
		int count=0;
		int begin=0;
		boolean isPresent=false;
		String middleString="";


		for (int i=0; i< len -4; i++){
		tempValue= str.substring(i,i+5);

		if(tempValue.equals("bread") && isPresent ==true)
			count=i;

		if(tempValue.equals("bread") && isPresent ==false){
			count=i+5;
		isPresent=true;

		}


		}

		middleString=str.substring(begin,count);
		System.out.println(middleString);
		return middleString;


}

	
	public static String getSandwich1(String str) {
		
		String result="";
		int start= str.indexOf("bread");
		int end= str.lastIndexOf("bread");
		
		if(start==end) {
			System.out.println("No String"+result);
			return result;
		}
		else {
			result= str.substring(start+5,end);
			System.out.println(result);
			return result;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String s="bread";
		String s1="breadbreadbreadbread";
		
		getSandwich1(s);
		//getSandwich(s);
		
	}
	
}
