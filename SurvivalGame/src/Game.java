import java.util.Scanner;




public class Game {
Player player;
Location location;

Scanner scan=new Scanner(System.in);
public void Login() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Macera Oyununa hoşgeldiniz.");
	System.out.println("Oyuna başlamadan önce adınızı giriniz.");
    String playerName=scan.nextLine();
	player=new Player(playerName);
	player.SelectCha();
	start();
}
public void start() {
	while(true) {
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		System.out.println("Eylem gerçekleştirmek için bir yer seçiniz");
		System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düşman yok!");
		System.out.println("2. Mağara --> Karşınıza belki zombi çıkabilir!");
		System.out.println("3. Orman --> Karşınıza belki vampir çıkabilir!");
		System.out.println("4. Nehir --> Karşınıza belki ayı çıkabilir!");
		System.out.println("5. Mağaza --> Silah veya zırh alabilirsiniz!");

		System.out.print("Gitmek istediğiniz yer:");
		int SelLoc=scan.nextInt();
		while(SelLoc<0 || SelLoc>5){
			System.out.println("Lütfen geçerli bir değer giriniz.");
			SelLoc=scan.nextInt();
		}
	
		switch (SelLoc) {
		case 1:
			location=new SafeHouse(player);
			break;
		case 2:
			location=new Cave(player);
			break;
		case 3:
			location=new Forest(player);
			break;
		case 4:
			location=new River(player);
			break;
			
		case 5:
			location=new ToolStore(player);
			break;
			default:
				location=new SafeHouse(player);	
				break;
				

	    }
		if(location.getClass().getName().equals("SafeHouse")) {
			if(player.getInv().isFirewood() && player.getInv().isFood()&&player.getInv().isWater()) {
				System.out.println("Tebrikler Oyunu kazandınız.");
				break;
			}
		}
		if(!location.GetLocation()) {
			System.out.println("Oyun bitti");
			break;
		}
			
		
	}

  }

}
