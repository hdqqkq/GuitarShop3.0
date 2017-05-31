package sqliteDao;
import java.sql.Connection;
import util.DBUtil;
import dao.InstrumentDaoImpl;

public class InstrumentDaoImplSqlite extends InstrumentDaoImpl {

		@Override
		public Connection getConnection() {
			// TODO Auto-generated method stub
			return DBUtil.getSqliteConnection();
	}

}
