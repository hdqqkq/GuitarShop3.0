package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseDaoFactory {
	private static InstrumentDao instrumentDao = null;// ע��˾�������ʵ��������������֮ǰ�����߻�������ʱ����Ϊnull
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
			throw new ExceptionInInitializerError(e);// ������ǳ�����
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

