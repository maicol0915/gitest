package dagachi.dto.customer;

import java.util.Date;
import lombok.*;

@Setter @Getter
public class CboardDTO {

	private int customer_writeNo;
	private String customer_writeTitle;
	private String customer_name;
	private Date date_Created;
	private int customer_num;
	
	//QnADTO
	private int customer_QnANum;
	private String customer_QnA_Title;
	private String customer_QnA_Content;
	
}