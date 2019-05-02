package com.revature.intercomm;

/**
 * The Class UserClientFallback.
 * Class for managing a UserClient error
 */
public class UserClientFallback implements UserClient {

	/* (non-Javadoc)
	 * @see com.revature.intercomm.UserClient#findAll()
	 */
	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return "Unable to locate user service at this moment!";
	}

}
