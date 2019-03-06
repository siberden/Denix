package Learneasy;

public class Javawrapper {
	public static void main(String[] args) {
		// This is boxing and unboxing 
		int i = 10;// SIngle Value Container
		Integer iRef = new Integer(i);//Boxed (Constructing the Object)
		
		Int j = iRef.intValue();// Unboxing(Extracting the value from Object)
		
		// Autoboxing and unboxing 
		 integer kRef = i; // AUtoboxing (Integer kRef = new Integer (i);
		 
		 int l = kRef; // (Autounboxing)	
		 
          System.out.println();		 
	}

}
