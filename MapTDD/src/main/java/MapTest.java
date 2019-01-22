import static org.junit.Assert.*;


import org.junit.Test;

public class MapTest {

	/*@Test
    public  void validateMapwhen_isemptyRuns(){
		MapClass map1=new MapClass();
		boolean isValid= map1.isempty();
		assertTrue(isValid);

	}*/
	

	@Test
    public  void createMapwhen_addMapwithincreaseincount(){
		MapClass<String, String> map1=new MapClass<>();
		 map1.addMap("key1","value1");
		 map1.addMap("key2","value1");
		 map1.addMap("key3","value1");
		 map1.addMap("key4","value"); map1.addMap("key5","value1");
		int  isValid= map1.addMap("key6","value1");
		assertEquals(6,isValid);
	//	assertEquals(4,map1.length());
	}
	
    @Test
    public  void whenDuplicatekeyIsAdded_countIsNegativeofPreviousValue(){
		MapClass<String, String> map1=new MapClass<>();
		 map1.addMap("key1","value1");
		 map1.addMap("key2","value1");
		 map1.addMap("key3","value1");
		 
		int isValid=  map1.addMap("key1","value1");
		
		assertEquals(-3,(isValid));
    }
	
    @Test
    public void whenCounttomMaxThenlengthIsIncreseby100(){
		MapClass<String, String> map1=new MapClass<>();
		 map1.addMap("key1","value1");
		 map1.addMap("key2","value1");
		 map1.addMap("key3","value1");
		 map1.addMap("key4","value1");
		 map1.addMap("key5","value1");
		map1.addMap("key6","value1");
		map1.addMap("key7","value1");
		map1.addMap("key8","value1");
		map1.addMap("key9","value1");
		map1.addMap("key10","value1");

		int isValid=map1.length();
		assertEquals(16,(isValid));
		}
    
    @Test(expected=NullPointerException.class)
    public void whenGetIsCalledWithKey_getValue(){
		MapClass<String, String> map1=new MapClass<>();
		map1.addMap("key2","value1");
		 map1.addMap("key3","value2");
		 map1.addMap("key4","value3");
		String isValid= map1.getValue("key2");
		assertEquals("value1",isValid);

	}
    @Test(expected=NullPointerException.class)
    public void whenDeleteKeyIsCalled_giveNewSize() {
		MapClass<String, String> map1=new MapClass<>();
		map1.addMap("key2","value1");
		 map1.addMap("key3","value2");
		 map1.addMap("key4","value3");
		String isValid= map1.deletekey("key2");
		assertEquals ("2:updatedsize",isValid);
		String isValid1= map1.deletekey("key8");
		
		
		

	}
    @Test
    public void whenGetSizeIsCalled_getFilledSizeofArray(){
		MapClass<String, String> map1=new MapClass<>();
		map1.addMap("key2","value1");
		 map1.addMap("key3","value2");
		 map1.addMap("key4","value3");
		int  isValid= map1.getSize();
		//String isValid1= map1.deletekey("key1");
		int isValid2=map1.getSize();
		
		
		assertEquals (3,isValid);
		//assertEquals ("KeyNotFOUND",isValid1);
		assertEquals (3,isValid2);
    }
    @Test
    public void validateaddmap_CanAddAnyGenericIput(){
		MapClass<Integer,String> map1=new MapClass<Integer,String>();
		map1.addMap(2,"value1");
		 map1.addMap(3,"value2");
		 map1.addMap(4,"value3");
		int  isValid= map1.getSize();
		//String isValid1= map1.deletekey(1);
		int isValid2=map1.getSize();
		
		
		assertEquals (3,isValid);
		//assertEquals ("KeyNotFOUND",isValid1);
		assertEquals (3,isValid2);
    }
 
   
	  
}


