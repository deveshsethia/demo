import java.util.Arrays;

public class MapClass<K,V> {
	
	
	private int size=4;
    private int count=0;
    private String[][] newarr;
     
	/*public boolean  isempty() {
		if(newarr[0][0]==null)
		return true;
		else
		return false;
	};*/



	public int addMap(K key ,V value) {
		lengthIncrease();
		if( checkUnquiness(key)<0) {
		return (-(count));
		}
		 
		newarr[count][0]  =key.toString();
		newarr[count++][1]=value.toString();
			
		return ((count));
		
	}
		
			
		

	private int  checkUnquiness(K key) {
		if(count>0) {
			for(int i=0 ;i<count; i++) {
				if(newarr[i][0].equals(key.toString())) {
					return (-1);
				       }
			    }
			}
		return 0;
	}
	private void lengthIncrease()
	{   	    
	  
		if((count)==0)
		{
			String[][]  newarr1= new String[4][2];
			newarr=newarr1;
			
			 
		}		
	else if((count)==(size-1))
		{ String[][] newArray= new String[size*2][2];
			for(int i=0 ;i<size; i++) {
				newArray[i][0]=newarr[i][0];
				newArray[i][1]=newarr[i][1];
		     }	
		newarr=newArray;
		size=2*size;
			
		}
	
		
		

		}
			
	public int length() {
 return newarr.length;	}



	public String getValue(K key) throws NullPointerException{
		
		for(int i=0;i<count;i++)
		{
			if(newarr[i][0]==key.toString())
				return newarr[i][1];
		}
		throw new NullPointerException();
		
		
	}



	public String deletekey (K key) throws NullPointerException {
		
		
		for(int i=0;i<count;i++)
		{
			if(newarr[i][0]==key.toString())
			{    int j=0;
				for( j=i;j<count-1;j++)
				{
					newarr[j][0]=newarr[j+1][0];
					newarr[j][1]=newarr[j+1][1];
					
				}
				newarr[j][0]=null;
				newarr[j][1]=null;
				return --count+":updatedsize";
			}
				
		}
		throw new NullPointerException();
	}



	public int getSize() {
	
		return count;
	}
	
	}
	