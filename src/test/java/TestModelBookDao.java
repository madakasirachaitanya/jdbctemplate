import com.reddy.Model.ModelBook;
import com.reddy.ModelDao.ModelBookDao;

public class TestModelBookDao {
	public static void main(String[] args) throws Exception {
		ModelBookDao book= new ModelBookDao();
		ModelBook modelBook= new ModelBook();
		
		modelBook.setIsbn(9);
		modelBook.setAuthor("bbroy");
	
		book.bookDetails(modelBook);
	}

}
