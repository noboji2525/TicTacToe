/**
 *
 */
package model.entity;

/**
 * @author kousuke
 *
 */
public class UserBean {

	/**
	 * userID
	 */
	private String userId;

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * デフォルトコンストラクタ
	 */
	public UserBean() {
	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}



}
