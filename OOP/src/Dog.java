
public class Dog extends Animal {
	
	@Override // Data Annotation ใช้สำหรับอธิบายเพิ่มเติม อย่างที่นี่หมายถึง method นี้ได้ทำการ override มา 
	void speak() {
		System.out.println("Woof!");
	}
}
