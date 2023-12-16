import java.util.Scanner;

public class Player {
	Scanner scan=new Scanner(System.in);
	 private String name,cName;
	 private int damage,healthy,money,rHealthy;
	 private Inventory inv;
	
public Player(String name) {
this.name=name;
this.inv=new Inventory();

}

public void SelectCha() {
	
switch (ChaMenu()) {
case 1: 
	initPlayer("Samuray", 5, 21, 15);
	break;


case 2: 
	initPlayer("Okçu", 7, 18, 20 );
	break;


case 3: 
	initPlayer("Şövalye", 8, 24, 5);
	break;
	default:
		initPlayer("Samuray", 5, 21, 15);
		break;

}
System.out.println("Karakter oluşturuldu.");
System.out.println("Karakter:"+ getcName()+"\t Hasar:"+getDamage()+"\t Sağlık:"+getHealthy()+"\t Para:"+getMoney());


}

public int getTotalDamage() {
	return this.getDamage()+this.getInv().getDamage();
}

public void initPlayer(String cName, int dmg,int hlthy,int mny ) {
	setcName(cName);
	setDamage(dmg);
	setHealthy(hlthy);
	setMoney(mny);
	setrHealthy(hlthy);
}

public int ChaMenu() {
	System.out.println("Lütfen bir karakter seçiniz.");
	System.out.println("1- Türü:Samuray \t Hasar:5 \t  Sağlık:21 \t  Para:15");
	System.out.println("2- Türü:Okçu \t \t Hasar:7 \t  Sağlık:18 \t Para:20");
	System.out.println("3- Türü:Şövalye \t Hasar:8 \t  Sağlık:24 \t  Para:5");
	System.out.println("Karakter Seçiminiz:");
	
	int ChaId=scan.nextInt();
	
	while(ChaId<1 || ChaId>3) {
		
		System.out.println("Lütfen 1-3 arası bir değer giriniz:");
		 ChaId=scan.nextInt();

	}
		
	
	return ChaId;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getcName() {
	return cName;
}

public void setcName(String cName) {
	this.cName = cName;
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	this.damage = damage;
}

public int getHealthy() {
	return healthy;
}

public void setHealthy(int healthy) {
	this.healthy = healthy;
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

public Inventory getInv() {
	return inv;
}

public void setInv(Inventory inv) {
	this.inv = inv;
}

public int getrHealthy() {
	return rHealthy;
}

public void setrHealthy(int rHealthy) {
	this.rHealthy = rHealthy;
}
	

}
