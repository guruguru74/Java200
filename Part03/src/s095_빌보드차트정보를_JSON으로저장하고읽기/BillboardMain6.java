package s095_빌보드차트정보를_JSON으로저장하고읽기;

public class BillboardMain6 {
	public static void main(String[] args) {
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		System.out.println(rs);
		
		
		rfw.getBillboardData(a+rs);
		rfw.printBillboard();

		//BillboardPrint.printToCSV(rfw.getBillboards(), "billboard/"+rs+".csv");
		BillboardPrint.printToJSON(rfw.getBillboards(), "billboard/"+rs+".json");
		//BillboardPrint.printToXML(rfw.getBillboards(), "billboard/"+rs+".xml");
	}
}