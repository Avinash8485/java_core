package sortpackage;
import java.util.Comparator;
public class MobileBrandComparator implements Comparator<Mobile>{
	

	
		

		@Override
		public int compare(Mobile a, Mobile b) {
			// TODO Auto-generated method stub
			return  a.brand.compareTo(b.brand);
		

	}
}
