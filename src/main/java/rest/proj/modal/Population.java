package rest.proj.modal;

public class Population {

	public static String COL_ID = "ID";
	public static String COL_YEAR = "YEAR";
	public static String COL_STATE = "STATE";
	public static String COL_POPULATION = "POPULATION";
	public static String COL_POPULATION_CHANGE = "POPULATION_CHANGE";
	
	private int id;
	private String year;
	private String state;
	private String population;
	private String populationChange;
	
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
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getPopulationChange() {
		return populationChange;
	}
	public void setPopulationChange(String populationChange) {
		this.populationChange = populationChange;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Population [id=");
		builder.append(id);
		builder.append(", year=");
		builder.append(year);
		builder.append(", state=");
		builder.append(state);
		builder.append(", population=");
		builder.append(population);
		builder.append(", populationChange=");
		builder.append(populationChange);
		builder.append("]");
		return builder.toString();
	}
	
}
