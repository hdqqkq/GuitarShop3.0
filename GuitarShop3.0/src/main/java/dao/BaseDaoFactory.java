package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseDaoFactory {
	private static InstrumentDao instrumentDao = null;// 注意此句必须放在实例化工厂类的语句之前，否者会在运行时被置为null
	private static BaseDaoFactory baseDaoFactory = new BaseDaoFactory();

	private BaseDaoFactory() {
		Properties properties = new Properties();
		InputStream inStream = BaseDaoFactory.class.getClassLoader()
			     .getResourceAsStream("Access.properties");
		try {
			properties.load(inStream);
			String userDaoImpl = properties.getProperty("dataAccess1");
			instrumentDao = (InstrumentDao) Class.forName(userDaoImpl).newInstance();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);// 此问题非常严重
		} finally {
			try {
				inStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static BaseDaoFactory getInstance() {
		return baseDaoFactory;
	}

	public InstrumentDao getInstrumentDao() {
		return instrumentDao;
	}
}

