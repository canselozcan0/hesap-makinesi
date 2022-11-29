import java.util.Scanner;

public class driver {
public static void main(String[] args) {
//	if ile hesap makinesi
//	int n1,n2, select;
//	Scanner input = new Scanner(System.in);
//	System.out.println("İlk sayıyı giriniz: ");
//	n1=input.nextInt();
//	System.out.println("İkinci sayıyı giriniz: ");
//	
//	n2 = input.nextInt();
//	System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
//	System.out.println("Seçiminiz: ");
//	select = input.nextInt();
//	System.out.println(select);
//	
//	if(select==1) {
//		System.out.println("toplam: " + (n1 + n2));
//	}else if(select==2) {
//		System.out.println("Çıkarma: " + (n1-n2));
//		
//	}else if(select==3) {
//		System.out.println("çarpma: " + (n1*n2));
//	}else if(select==4) {
//		if(n2!=0) {
//		System.out.println("bölme : " + (n1/n2));}
//		else {System.out.println("sayı 0a bölünemez");}
//	}else {
//		System.out.println("Tekrar deneyiniz");
//	}
//	
	// switch ile hesap makinesi

	Scanner input = new Scanner(System.in);
	System.out.println("İlk sayıyı giriniz");
	float a = Float.parseFloat(input.nextLine());
	System.out.print("2. sayı:");
	float b = Float.parseFloat(input.nextLine()) ;
	System.out.println("işlem seçiniz: ");
char işlem = input.nextLine().charAt(0);
	
	switch (işlem) {
	case '+':
		System.out.println("Sonuç : " + (a + b));
		
		break;
	case '-':
		System.out.println("Sonuç:" + (a - b));
	break;
	case '*':
	System.out.println("Sonuç: " + (a * b));
	break;
	case '/':
		System.out.println("Sonuç: " + (a / b));
		break;
	default:
		System.out.println("Bilinmeyen operatör");
	
		break;
	
	}
	
	
	
	
	
}
}
