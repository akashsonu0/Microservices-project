package in.pwskills.akash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockApi {
	private Integer stkId;
	private String stkCode;
	private Double stkCost;

}