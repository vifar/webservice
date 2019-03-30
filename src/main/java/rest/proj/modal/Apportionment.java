package rest.proj.modal;

public class Apportionment {

	public static String COL_ID = "ID";
	public static String COL_YEAR = "YEAR";
	public static String COL_STATE = "STATE";
	public static String COL_NUM_OF_REPRESENTATIVES = "NUM_OF_REPRESENTATIVES";
	public static String COL_PEOPLE_PER_REPRESENTATIVE = "PEOPLE_PER_REPRESENTATIVE";
	
	private int id;
	private String year;
	private String state;
	private String numOfRepresentatives;
	private String peoplePerRepresentative;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNumOfRepresentatives() {
		return numOfRepresentatives;
	}
	public void setNumOfRepresentatives(String numOfRepresentatives) {
		this.numOfRepresentatives = numOfRepresentatives;
	}
	public String getPeoplePerRepresentative() {
		return peoplePerRepresentative;
	}
	public void setPeoplePerRepresentative(String peoplePerRepresentative) {
		this.peoplePerRepresentative = peoplePerRepresentative;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apportionment [id=");
		builder.append(id);
		builder.append(", year=");
		builder.append(year);
		builder.append(", state=");
		builder.append(state);
		builder.append(", numOfRepresentatives=");
		builder.append(numOfRepresentatives);
		builder.append(", peoplePerRepresentative=");
		builder.append(peoplePerRepresentative);
		builder.append("]");
		return builder.toString();
	}
	
}
