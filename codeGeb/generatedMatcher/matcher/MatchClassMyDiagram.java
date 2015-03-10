package matcher; 

import model.*; 
import model.util.*;	
import de.uniks.networkparser.logic.Condition;

@SuppressWarnings("all")
public class MatchClassMyDiagram {
	
	/**
	* finds a match from a given start 
	*/
	public StoreSet findMatch(Store start){					
		StoreSet startSet = new StoreSet().with(start);
		StorePO thisPO = startSet.hasStorePO();
		
		//matching objects 
		ItemPO i1PO = thisPO.hasHas();
		ItemPO i2PO = i1PO.hasNext().hasValue(3);
		
		//matching missing links to known					
		i2PO.hasNext(i1PO);
		thisPO.hasHas(i2PO);
		
		//update modasdel asd.
		i2PO.startCreate().hasItem(i1PO).endCreate();
		
		return thisPO.allMatches();
	}
	
}  
