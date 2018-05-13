package Amazon;
import java.util.*;

class TinyURL {
	
	List<String> urls = new ArrayList<>();
	
	public String encode(String url) {
		this.urls.add(url);
		return String.valueOf(urls.size() - 1);
	}
	
	public String decode(String turl) {
		int idx = Integer.valueOf(turl);
		return (idx < urls.size()) ? urls.get(idx) : "";
	}
}

public class TinyURLSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TinyURL t = new TinyURL();
		
		String encode = t.encode("www.sampleURL.com/aaa/bbbb/ccc/ddd");
		System.out.println(encode);
		
		String decode = t.decode(encode);
		System.out.println(decode);
		

	}

}
