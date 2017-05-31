package dao;
import java.util.List;

import model.Guitar;

public interface InstrumentDao {
	
		List<Guitar> Search(Guitar searchGuitar);	
		boolean add(Guitar guitar);
		boolean del(String serialNumber);

	}

