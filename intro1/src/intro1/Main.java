package intro1;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu="Internet Subesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		//Ctrl+Space e basinca acilir kutu geliyor
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar dustu resmi");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar yukseldi resmi");
		}else {
			System.out.println("Dolar esittir resmi");
		}

		String[] krediler=
		{
				"Hizli Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Ciftci Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kultur Bakanligi Kredisi"
		};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
	}

}
