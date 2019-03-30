package rest.proj.service;

import java.util.List;

import org.springframework.stereotype.Component;

import rest.proj.modal.Apportionment;
import rest.proj.modal.Population;
import rest.proj.modal.PopulationDensity;

@Component("restProjService")
public interface RestProjService {

	List<Apportionment> getApportionmentDataByState(Apportionment apportionment) throws Exception;

	List<Population> getPopChangeByState(Population population) throws Exception;

	List<PopulationDensity> getDensityByState(PopulationDensity populationDensity) throws Exception;

	List<Apportionment> getApportionMentDataByYear(Apportionment apportionment) throws Exception;

	List<Population> getPopChangeByYear(Population population) throws Exception;

	List<PopulationDensity> getDensityByRank(PopulationDensity populationDensity) throws Exception;
	
}
