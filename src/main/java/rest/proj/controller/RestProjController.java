package rest.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import rest.proj.modal.Apportionment;
import rest.proj.modal.Population;
import rest.proj.modal.PopulationDensity;
import rest.proj.service.RestProjService;


@RestController
@RequestMapping("/restpoj-service/services")
@Api(value = "Web Services")
public class RestProjController {

	@Autowired
	RestProjService restProjService;
	
	@RequestMapping(value = "/getApportionMentDataByState", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - State is Case Sensitive", response = Apportionment.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = Apportionment.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<Apportionment> getApportionmentDataByState(@RequestBody Apportionment data) throws Exception {
		return restProjService.getApportionmentDataByState(data);
	}
	
	@RequestMapping(value = "/getPopChangeByState", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - State is Case Sensitive", response = Population.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = Population.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<Population> getPopChangeByState(@RequestBody Population data) throws Exception {
		return restProjService.getPopChangeByState(data);

	}
	
	@RequestMapping(value = "/getDensityByState", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - State is Case Sensitive", response = PopulationDensity.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = PopulationDensity.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<PopulationDensity> getDensityByState(@RequestBody PopulationDensity data) throws Exception {
		return restProjService.getDensityByState(data);
	}
	
	@RequestMapping(value = "/getApportionMentDataByYear", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - Year is 1910 to 2010, increments of 10", response = Apportionment.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = Apportionment.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<Apportionment> getApportionMentDataByYear(@RequestBody Apportionment data) throws Exception {
		return restProjService.getApportionMentDataByYear(data);
	}
	
	@RequestMapping(value = "/getPopChangeByYear", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - Year is 1910 to 2010, increments of 10", response = Population.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = Population.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<Population> getPopChangeByYear(@RequestBody Population data) throws Exception {
		return restProjService.getPopChangeByYear(data);

	}
	
	@RequestMapping(value = "/getDensityByRank", method = RequestMethod.POST, produces =  "application/json" )
	@ApiOperation(value = "Returns output details", notes = "Rest Web Service - Rank is 1 to 50", response = PopulationDensity.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Successful retrieval service", response = PopulationDensity.class),
		@ApiResponse(code = 400, message = "Invalid input provided"),
		@ApiResponse(code = 404, message = "Data does not exist"), })
	@ResponseStatus(value = HttpStatus.OK)
	
	public List<PopulationDensity> getDensityByRank(@RequestBody PopulationDensity data) throws Exception {
		return restProjService.getDensityByRank(data);
	}
	
}
