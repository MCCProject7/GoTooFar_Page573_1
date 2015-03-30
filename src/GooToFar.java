
public class GooToFar {

	public static void main(String[] args) {
		
		String[] fiveValues = {"100", "200", "300" , "400", "500"};
		
		try {
			
			for(int i = 0; i < fiveValues.length; i++)
			{
				System.out.println(fiveValues[i]);
			}
			
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			throw new ArrayIndexOutOfBoundsException("Now you have gone to far\n");
			
		} finally {
			
			String finalstr = "The application is done running";
			System.out.print(finalstr);
		}

	}
	
	public void MyE (){
		
		
	}
	
}
