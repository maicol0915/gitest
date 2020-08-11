package dagachi.dto.customer;

import java.util.Date;
import lombok.*;

@Getter @Setter
public class SignUpDTO {
	private int customer_num;
	private String customer_email;
	private String customer_name;
	private String customer_password;
	private String customer_gender;
	private String customer_phoneNumber;
	private Date birth;
	private Date Join_Date;
}