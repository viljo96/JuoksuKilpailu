package juoksut;

import java.util.Scanner;

public class Juoksu {
	
	public static void main(String[] args) {
		int sijoitus = 10;
		int i = 0;
		int kierrokset = 5;
		Scanner lukija = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Kilpailu alkaa... \n (ohittaa = 1, k‰ytt‰‰ oikotiet‰ = 2, jatkaa samalla vauhdilla = 3)");
	
	for(i=0; i<=kierrokset;i++) {
		System.out.println("Olet sijalla " + sijoitus + " mit‰ teet?");
		int vastaus = lukija.nextInt();
		if(vastaus ==1) {
			int luku2 = (int)(Math.random() * 100+1);
			if(luku2<=57) {
				if(sijoitus==1) {
					System.out.println("Olet ensimm‰isen‰, et voi ohittaa ket‰‰n");
					sijoitus=1;
				}
				else {
				sijoitus--;
				System.out.println("ohitit kilpailijan, olet sijalla "+sijoitus );
			}}
			else if(luku2>57&&luku2<90){
				if(sijoitus==1) {
					sijoitus=1;
					System.out.println("Olet ensimm‰inen,et voi ohittaa");
				}
				else if(sijoitus==2) {
					sijoitus--;
					System.out.println("P‰‰sit ensimm‰iseksi");
				}
				else {
				sijoitus=sijoitus-2;
				System.out.println("ohitit kaksi kilpailijaa, olet sijalla "+sijoitus);
			}}
		else {
			sijoitus=16;
			System.out.println("Kompastuit ja j‰it viimeiseksi");
		}
		}
		if(vastaus==2) {
			int luku3 = (int)(Math.random()*100+1);
			
			if(luku3<=10) {
				sijoitus=1;
				System.out.println("P‰‰sit ensimm‰iseksi");
			}
			else if(luku3>10&&luku3<=55) {
				if(sijoitus<=5) {
					sijoitus=1;
					System.out.println("P‰‰sit oikaisemalla ensimm‰iseksi");
				}else {
					sijoitus=sijoitus-5;
				System.out.println("Ohitit oikaisemalla monta kilpailijaa ja p‰‰sit sijalle " + sijoitus);
				}}
			else if(luku3>55 && luku3<=80) {
				sijoitus=16;
				System.out.println("Eksyit ja jouduit viimeiseksi");
			}
			else {
				sijoitus=16;
				System.out.println("J‰it kiinni huijaamisesta, sinut diskattiin");
				break;
				
			}
		}
		if(vastaus==3) {
			int luku4 = (int)(Math.random()*100+1);
			if(luku4<=25) {
				if(sijoitus==1) {
					System.out.println("Sijoituksesi ei muuttunut");
				}
				else {
				sijoitus--;
				System.out.println("Edess‰ oleva kilpailija v‰syi ja ohitit h‰net");
			}}
			else if(luku4>25&&luku4<=50) {
				sijoitus++;
				System.out.println("Takana oleva kilpailija ohitti sinut, kun v‰istit lintua, huono tuuri");
			}
			else {
				System.out.println("Sijoituksesi ei muuttunut");
			}
		}
	
	}
	if(sijoitus==1) {
		System.out.println("Onneksi olkoon, sait kultaa ja voitit pelin!");
	}
	else if(sijoitus==2) {
		System.out.println("Onneksi olkoon, sait hopeaa ja pelasit hyvin");
	}
	else if(sijoitus==3) {
		System.out.println("Onneksi olkoon, sait pronssia ja pelasit hyvin");
	}
	else if(sijoitus>3&&sijoitus<=15) {
		System.out.println("P‰‰sit maaliin sijalla " + sijoitus +", kiitos osallistumisesta");
	}
	else {
		System.out.println("H‰visit pelin, tulit viimeiseksi");
	}
	
	
	
	
	
	
	
	}

}
