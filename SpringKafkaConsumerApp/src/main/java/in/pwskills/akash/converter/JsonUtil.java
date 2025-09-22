package in.pwskills.akash.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.pwskills.akash.bean.StockApi;

public class JsonUtil {

	public static StockApi convertJsonToObject(String message) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(message, StockApi.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}