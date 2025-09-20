package in.pwskills.akash.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.bean.StockApi;
import in.pwskills.akash.converter.JsonUtil;
import in.pwskills.akash.producer.ProducerService;

@RestController
@RequestMapping("/v1/api/stock")
public class StockRestController {
	
	@Autowired
	private ProducerService service;
	
	/*
	 * METHOD : GET
	 * INPUT  : code,cost(@RequestParam)
	 * OUTPUT : String
	 * PATH   : /send
	 */
	
	@GetMapping("/send")
	public String readInput(
			@RequestParam String code,
			@RequestParam Double cost	
			) {
		
		//Create an object holding cost and code
		StockApi api = new StockApi();
		api.setSktCode(code);
		api.setSktCost(cost);
		
		//Convert object to jsonString format and send it to Service
		String message = JsonUtil.convertObjectToJson(api);
		
		if(message != null) {
			service.sendMessage(message);		
			return "SUCCESS";
			
		}else {
			return "FAILURE";
		}
	 
	}

}
