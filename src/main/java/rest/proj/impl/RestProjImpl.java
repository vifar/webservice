package rest.proj.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import rest.proj.ConnectToDatabase;
import rest.proj.modal.Apportionment;
import rest.proj.modal.Population;
import rest.proj.modal.PopulationDensity;
import rest.proj.service.RestProjService;

@Component("restProjService")
public class RestProjImpl implements RestProjService {

	
	@Override
	public List<Apportionment> getApportionmentDataByState(Apportionment apportionment) throws Exception {
		
		List<Apportionment> list = new ArrayList<Apportionment>();
		Statement statement = null;
		String query = "SELECT * FROM APPORTIONMENT WHERE STATE = '" + apportionment.getState() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	Apportionment temp = new Apportionment();
	        	
	            temp.setId(result.getInt(Apportionment.COL_ID));
	            temp.setNumOfRepresentatives(result.getString(Apportionment.COL_NUM_OF_REPRESENTATIVES));
	            temp.setPeoplePerRepresentative(result.getString(Apportionment.COL_PEOPLE_PER_REPRESENTATIVE));
	            temp.setState(result.getString(Apportionment.COL_STATE));
	            temp.setYear(result.getString(Apportionment.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	            
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
	}

	@Override
	public List<Population> getPopChangeByState(Population population) throws Exception {
		
		List<Population> list = new ArrayList<Population>();
		Statement statement = null;
		String query = "SELECT * FROM POPULATION WHERE STATE = '" + population.getState() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	Population temp = new Population();
	        	
	            temp.setId(result.getInt(Population.COL_ID));
	            temp.setPopulation(result.getString(Population.COL_POPULATION));
	            temp.setPopulationChange(result.getString(Population.COL_POPULATION_CHANGE));
	            temp.setState(result.getString(Population.COL_STATE));
	            temp.setYear(result.getString(Population.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	            
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
		
	}

	@Override
	public List<PopulationDensity> getDensityByState(PopulationDensity populationDensity) throws Exception {
		
		List<PopulationDensity> list = new ArrayList<PopulationDensity>();
		Statement statement = null;
		String query = "SELECT * FROM POPULATION_DENSITY WHERE STATE = '" + populationDensity.getState() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	PopulationDensity temp = new PopulationDensity();
	        	
	            temp.setId(result.getInt(PopulationDensity.COL_ID));
	            temp.setPopulation(result.getString(PopulationDensity.COL_POPULATION));
	            temp.setRank(result.getString(PopulationDensity.COL_RANK));
	            temp.setDensity(result.getString(PopulationDensity.COL_DENSITY));
	            temp.setState(result.getString(PopulationDensity.COL_STATE));
	            temp.setYear(result.getString(PopulationDensity.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	            
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
		
	}

	@Override
	public List<Apportionment> getApportionMentDataByYear(Apportionment apportionment) throws Exception {
		
		List<Apportionment> list = new ArrayList<Apportionment>();
		Statement statement = null;
		String query = "SELECT * FROM APPORTIONMENT WHERE YEAR = '" + apportionment.getYear() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	Apportionment temp = new Apportionment();
	        	
	            temp.setId(result.getInt(Apportionment.COL_ID));
	            temp.setNumOfRepresentatives(result.getString(Apportionment.COL_NUM_OF_REPRESENTATIVES));
	            temp.setPeoplePerRepresentative(result.getString(Apportionment.COL_PEOPLE_PER_REPRESENTATIVE));
	            temp.setState(result.getString(Apportionment.COL_STATE));
	            temp.setYear(result.getString(Apportionment.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	            
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
		
	}

	@Override
	public List<Population> getPopChangeByYear(Population population) throws Exception {
		
		List<Population> list = new ArrayList<Population>();
		Statement statement = null;
		String query = "SELECT * FROM POPULATION WHERE YEAR = '" + population.getYear() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	Population temp = new Population();
	        	
	            temp.setId(result.getInt(Population.COL_ID));
	            temp.setPopulation(result.getString(Population.COL_POPULATION));
	            temp.setPopulationChange(result.getString(Population.COL_POPULATION_CHANGE));
	            temp.setState(result.getString(Population.COL_STATE));
	            temp.setYear(result.getString(Population.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
		
	}

	@Override
	public List<PopulationDensity> getDensityByRank(PopulationDensity populationDensity) throws Exception {
		
		List<PopulationDensity> list = new ArrayList<PopulationDensity>();
		Statement statement = null;
		String query = "SELECT * FROM POPULATION_DENSITY WHERE RANK = '" + populationDensity.getRank() + "'";
		System.out.println("Query is : " + query);
		
		try {
			statement = ConnectToDatabase.CONNECTION.createStatement();
	        ResultSet result = statement.executeQuery(query);
	        while (result.next()) {
	        	PopulationDensity temp = new PopulationDensity();
	        	
	        	temp.setId(result.getInt(PopulationDensity.COL_ID));
	            temp.setPopulation(result.getString(PopulationDensity.COL_POPULATION));
	            temp.setRank(result.getString(PopulationDensity.COL_RANK));
	            temp.setDensity(result.getString(PopulationDensity.COL_DENSITY));
	            temp.setState(result.getString(PopulationDensity.COL_STATE));
	            temp.setYear(result.getString(PopulationDensity.COL_YEAR));
	            
	            System.out.println("\nGot data : " + temp.toString()); 
	            
	            list.add(temp);
	        }
	    } catch (SQLException e ) {
	    	e.printStackTrace();
	    } finally {
			if (statement != null) {
				statement.close();
			}
	    }
		
		return list;
		
	}
	
}
