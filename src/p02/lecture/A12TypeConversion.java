package p02.lecture;

public class A12TypeConversion {
	public static void main(String[] args) {
		// 실수
		float floatVar1 = 3.14F;
		double doubleVar1;
		
		// 자동 형변환
		doubleVar1 = floatVar1;
		
		// 강제 형변화 (casting)함
//		floatVar1 = doubleVar1;
		floatVar1 = (float) doubleVar1;
		
		///////////////////////////////
		// 정수 -> 실수
		int intVar1 = 3;
		float floatVar2 = intVar1; // 자동형 변환
//		double doubleVar 2= intVar1; // 자동형 변환
		
		// 실수 -> 정수
		double doubleVar3 = 3.14;
//		int intVar3 = doubleVar3;
		int intVar3 = (int) doubleVar3; // 강제 형변환(casting)
		System.out.println(intVar3);
		
		
	}
}
