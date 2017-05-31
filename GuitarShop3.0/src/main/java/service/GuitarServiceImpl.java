package service;
import java.util.List;
import dao.BaseDaoFactory;
import dao.InstrumentDao;
import model.Guitar;
import service.GuitarService;

public class GuitarServiceImpl implements GuitarService{
	private InstrumentDao inventoryDao;

	public void setInventoryDao(InstrumentDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}

	@Override
	public List<Guitar> Search(Guitar searchGuitar) {
		// TODO Auto-generated method stub
		InstrumentDao InventoryDao = BaseDaoFactory.getInstance().getInstrumentDao();
		setInventoryDao(InventoryDao);
		return inventoryDao.Search(searchGuitar);
	}

	@Override
	public boolean add(Guitar guitar) {
		// TODO Auto-generated method stub
		InstrumentDao InventoryDao = BaseDaoFactory.getInstance().getInstrumentDao();
		setInventoryDao(InventoryDao);
		return inventoryDao.add(guitar);
	}

	@Override
	public boolean del(String serialNumber) {
		// TODO Auto-generated method stub
		InstrumentDao InventoryDao = BaseDaoFactory.getInstance().getInstrumentDao();
		setInventoryDao(InventoryDao);
		return inventoryDao.del(serialNumber);
}
}	