
public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player,"Mağaza");
	}
	
	public boolean GetLocation() {
		
		System.out.println("Para: "+ player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		System.out.print("Seçiminiz:");
		int selTool=scan.nextInt();
		int selItemId;
		switch (selTool) {
		case 1:
			selItemId=weaponMenu();
			buyWeapon(selItemId);
			break;
		case 2:
			selItemId=armorMenu();
			buyArmor(selItemId);
			break;
		case 3:
			break;
		default:
			System.out.println("Geçersiz işlem");
           break;
           
		}
		
		return true;
	}
	
	public int armorMenu() {
		System.out.println("1. Hafif <Para:15 - Hasar:1>");
		System.out.println("2. Orta <Para:25 - Hasar:3>");
		System.out.println("3. Ağır <Para:40 - Hasar:5>");
		System.out.println("4. Çıkış");
		System.out.println("Silah Seçiniz:");
		int selArmorId=scan.nextInt();
		return selArmorId; 
	}
	
	public void buyArmor(int ItemId ) {
		int avoid=0,price=0;
		String aName=null;
		switch(ItemId) {
		case 1:
			avoid=1;
			price=15;
			aName="Hafif";
			break;
		case 2:
			avoid=3;
			price=25;
			aName="Orta";
			break;
		case 3:
			avoid=5;
			price=40;
			aName="Ağır";
			break;
		case 4:
			break;
			default:
				
				System.out.println("Geçersiz işlem");
				break;
		}
		if(player.getMoney()>=price) {
			if(avoid==0)
				System.out.println();
			else {
     player.getInv().setArmor(avoid);
     player.getInv().setaName(aName);
     player.setMoney(player.getMoney()-price);
     System.out.println( aName+"satın aldınız, Engellenen hasar: "+player.getInv().getArmor());
     System.out.println("Kalan para: "+ player.getMoney());
			}
	}
		else {
			System.out.println("Bakiye Yetersiz.");
		}
     
		
	}
	
	public int weaponMenu() {
		System.out.println("1. Tabanca <Para:25 - Hasar:2>");
		System.out.println("2. Kılıç <Para:35 - Hasar:3>");
		System.out.println("3. Tüfek <Para:45 - Hasar:7>");
		System.out.println("4. Çıkış");
		System.out.println("Silah Seçiniz:");
		int selWeaponId=scan.nextInt();
		return selWeaponId;
	}
	
	public void buyWeapon(int ItemId) {
		
		int damage=0,price=0;
		String wName=null;
		switch(ItemId) {
		case 1:
			damage=2;
			price=25;
			wName="Tabanca";
			break;
		case 2:
			damage=3;
			price=35;
			wName="Kılıç";
			break;
		case 3:
			damage=7;
			price=45;
			wName="Tüfek";
			break;
		case 4:
			break;
			default:
				
				System.out.println("Geçersiz işlem");
				break;
		}
		if(player.getMoney()>=price) {
			if(damage==0)
				System.out.println();
			else {
     player.getInv().setDamage(damage);
     player.getInv().setwName(wName);
     player.setMoney(player.getMoney()-price);
     System.out.println( wName+"satın aldınız, Önceki hasar: "+ player.getDamage()+" Yeni hasar: "+player.getTotalDamage());
     System.out.println("Kalan para: "+ player.getMoney());
			}
	}
		else {
			System.out.println("Bakiye Yetersiz.");
		}
     
		
		 
	}

}
