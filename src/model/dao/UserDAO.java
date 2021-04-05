/**
 *
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.UserBean;

/**
 * @author kousuke
 *
 */
public class UserDAO {

	public List<UserBean> selectUser() throws SQLException{
		List<UserBean> list = new ArrayList<UserBean>();
		String sql = "SELECT * FROM user_tbl";

		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				UserBean user = new UserBean();
				user.setUserId(rs.getString("user_id"));
				user.setUserName(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
		}


		return list;
	}

}
