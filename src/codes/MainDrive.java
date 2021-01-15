package codes;

public class MainDrive {
	
	public static void main(String[] args) {
//		사각형 별패턴 만들기
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------");
//		삼각형 별패턴 만들기
		for (int i=0; i<6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");	
			}
			System.out.println();			
		}
		
		
		System.out.println("--------");
//		역삼각형 별패턴 만들기
		for (int i=4; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------");
//		오른쪽정렬 삼각형 별패턴 만들기
		for(int i=0; i<5; i++) {
			for( int j=4; j>i; j--) {
				System.out.print(" ");
			}
					for(int k=0; k<=i; k++) {
						System.out.print("*");
					}
			System.out.println();				
		}
		
	}

}
