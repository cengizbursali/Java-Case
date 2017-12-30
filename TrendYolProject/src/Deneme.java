import config.ConfiguraitonReader;

public class Deneme {

	public static void main(String[] args) {
		ConfiguraitonReader configuraitonReader= new ConfiguraitonReader("SERVICE-A", "mongodb://cengizbursali:cengizbursali1@ds133077.mlab.com:33077/trendyoldb", 1000);
		System.out.println(configuraitonReader.GetValue("SiteName")!=null ? configuraitonReader.GetValue("SiteName").toString():"sonuc dönmüyor");
	}
}
