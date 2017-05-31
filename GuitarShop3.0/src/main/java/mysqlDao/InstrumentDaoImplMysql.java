package mysqlDao;

import java.sql.Connection;
import dao.InstrumentDaoImpl;
import util.DBUtil;

public class InstrumentDaoImplMysql extends InstrumentDaoImpl{
		@Override
		public Connection getConnection() {
			// TODO Auto-generated method stub
			return DBUtil.getMysqlConnection();
		}


}
