package service;
import java.util.List;
import model.Guitar;

public interface GuitarService {
	
    List<Guitar> Search(Guitar searchGuitar) ;
    boolean add(Guitar guitar);
    boolean del(String serialNumber);

		
	}

