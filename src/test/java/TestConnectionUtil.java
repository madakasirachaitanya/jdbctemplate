import org.springframework.jdbc.core.JdbcTemplate;

import com.reddy.util.ConnectionUtil;

public class TestConnectionUtil {
public static void main(String[] args){
	JdbcTemplate jdbcTemplate =ConnectionUtil.getJdbcTemplate();
	System.out.println(jdbcTemplate);
			}
}
