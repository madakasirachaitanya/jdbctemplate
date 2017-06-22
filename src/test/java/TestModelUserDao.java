import com.reddy.Model.ModelUser;
import com.reddy.ModelDao.ModelUserDao;

public class TestModelUserDao {
public static void main(String[] args)  throws Exception{
	ModelUserDao userdao= new ModelUserDao();
	ModelUser modeluser= new ModelUser();
	modeluser.setUsername("pavan");
	modeluser.setPassward("pavani");
	//System.out.println("passward");
	userdao.upDateuser(modeluser);
}
}
