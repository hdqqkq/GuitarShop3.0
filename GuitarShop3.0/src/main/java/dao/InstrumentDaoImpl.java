package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import model.Guitar;
import model.GuitarSpec;


public abstract class InstrumentDaoImpl implements InstrumentDao {

	private List<Guitar> guitars;
	private String sql;
	private PreparedStatement pstmt;
	public InstrumentDaoImpl() {
		guitars=new LinkedList<Guitar>();
	}
	public List<Guitar> getGuitarLinkedList(){
		sql="select * from guitar;"; 
			try {
				pstmt =getConnection().prepareStatement(sql);      			
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()){
					String serialNumber = rs.getString("serialNumber");
			        Double price = rs.getDouble("price");
			        String builder = rs.getString("builder");
			        String model = rs.getString("model");
			        String type = rs.getString("type");
			        String backWood = rs.getString("backWood");
			        String topWood = rs.getString("topWood");
			        Guitar guitar=new Guitar(serialNumber,price,new GuitarSpec(builder,model,type,backWood,topWood));
			        guitars.add(guitar);
				}
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return guitars;
		
	}

	@Override
	public List<Guitar> Search(Guitar searchGuitar) {
		// TODO Auto-generated method stub
		guitars=getGuitarLinkedList();
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSpec().matches(searchGuitar.getSpec()))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  
}
	public abstract Connection getConnection();
	@Override
	public boolean add(Guitar guitar) {
		sql = "insert into guitar values(?,?,?,?,?,?,?);";
		try {
			pstmt = getConnection().prepareStatement(sql);
			pstmt.setString(1, guitar.getSerialNumber());
			pstmt.setDouble(2, guitar.getPrice());
			pstmt.setString(3, guitar.getSpec().getBuilder());
			pstmt.setString(4, guitar.getSpec().getModel());
			pstmt.setString(5, guitar.getSpec().getType());
			pstmt.setString(6, guitar.getSpec().getBackWood());
			pstmt.setString(7, guitar.getSpec().getTopWood());
			pstmt.executeUpdate();
			pstmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean del(String serialNumber) {		
		sql = "DELETE FROM guitar where serialNumber=?;";
		try {
			pstmt = getConnection().prepareStatement(sql);
			pstmt.setString(1, serialNumber);
			pstmt.executeUpdate();
			pstmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}
}

