
public class Person {
	private String lastname;
	private String firstame;
	private String gender;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getGender()+' '+this.getFirstame()+' '+this.getLastname();
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the firstame
	 */
	public String getFirstame() {
		return firstame;
	}
	/**
	 * @param firstame the firstame to set
	 */
	public void setFirstame(String firstame) {
		this.firstame = firstame;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
