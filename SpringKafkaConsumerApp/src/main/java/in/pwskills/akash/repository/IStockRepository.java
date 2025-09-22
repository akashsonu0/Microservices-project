package in.pwskills.akash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.akash.bean.StockApi;

public interface IStockRepository extends JpaRepository<StockApi,Integer>{
	

}
