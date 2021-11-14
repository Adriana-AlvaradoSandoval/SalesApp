package Sales;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SalesSlip {
	
	public ArrayList<SalesItem> list = new ArrayList<SalesItem>();
	
	public void addItem(SalesItem a) {
		list.add(a);
	}
	
	public String totalSales() {
		double total = 0;
		
		for (SalesItem each : list) {
			total += each.performCalculations();
		}
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return "$" + numberFormat.format(total);
	}
	
	public String listToString() {
		String temp = "";
		for(SalesItem each : list) {
			temp += each.toString() + "\n";
		}
		return temp;
	}
}
