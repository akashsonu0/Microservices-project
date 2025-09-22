package in.pwskills.akash.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.akash.bean.StockApi;
import in.pwskills.akash.converter.JsonUtil;
import in.pwskills.akash.repository.IStockRepository;

@Component
public class MessageStore {
	
	@Autowired
	private IStockRepository repo;
	
	public void add(String message) {
		//JSON TO Object
		StockApi si = JsonUtil.convertJsonToObject(message);
		repo.save(si);
	}
	
	public List<StockApi> getAll(){
		return repo.findAll();
	}
}
