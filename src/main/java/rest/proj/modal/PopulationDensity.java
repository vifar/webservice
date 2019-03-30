package rest.proj.modal;

public class PopulationDensity {

	public static String COL_ID = "ID";
	public static String COL_STATE = "STATE";
	public static String COL_POPULATION = "POPULATION";
	public static String COL_DENSITY = "DENSITY";
	public static String COL_YEAR = "YEAR";
	public static String COL_RANK = "RANK";
	
	private int id;
	private String state;
	private String population;
	private String density;
	private String year;
	private String rank;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String populaiton) {
		this.population = populaiton;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PopulationDensity [id=");
		builder.append(id);
		builder.append(", state=");
		builder.append(state);
		builder.append(", population=");
		builder.append(population);
		builder.append(", density=");
		builder.append(density);
		builder.append(", year=");
		builder.append(year);
		builder.append(", rank=");
		builder.append(rank);
		builder.append("]");
		return builder.toString();
	}
	
}
