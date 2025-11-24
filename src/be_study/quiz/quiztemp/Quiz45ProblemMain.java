package be_study.quiz.quiztemp;

import java.util.ArrayList;

public class Quiz45ProblemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		int[] iArr = {1, 2, 3, 4, 5};
		int sum = 0;
		System.out.print(iArr[0] + " ");
		System.out.print(iArr[1] + " ");
		System.out.print(iArr[2] + " ");
		System.out.print(iArr[3] + " ");
		System.out.print(iArr[4] + " ");
		System.out.println();
		
		// 2
		iArr[2] = 50;
		System.out.println(iArr[2]);
		
		// 3
		System.out.println(iArr.length);
		
		// 4
		for(int i : iArr) {
			sum += i;
		}
		System.out.println(sum);
		
		// 5
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 6
		System.out.println(method1(iArr));
		
		// 7
		System.out.println(method2(iArr));
		
		// 8
		method3(iArr);
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 9
		int[] arr = method4(10);
 		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
 		System.out.println();
 		
 		// 10
 		int[] arr2 = method5(iArr);
 		for(int i : arr2) {
 			System.out.print(i + " ");
 		}
 		System.out.println();
 		
 		//
 		System.out.println("--------------------");
 		Person p1 = new Person();
 		
 		// 11
 		p1.name = "Hong";
 		p1.age = 26;
 		System.out.printf("name : %s, age : %d\n", p1.name, p1.age);
 		
 		// 12
 		p1.hello();
 		
 		// 13
 		method6(p1);
 		
 		// 14
 		Person p2 = method7();
 		System.out.printf("name : %s, age : %d\n", p2.name, p2.age);
 		
 		// 15
 		String result = (p1.age > p2.age) ? p1.name : (p1.age == p2.age) ? "동갑" : p2.name;
 		System.out.println(result);
 		
 		// 16
 		method7(p2);
 		System.out.println(p2.age);
 		
 		// 17
 		Person p3 = new Person();
 		String name3 = p3.name;
 		int age3 = p3.age;
 		name3 = "Lee";
 		age3 = 30;
 		System.out.printf("%s %s %d %d , ",name3, p3.name, age3, p3.age);
 		p3.name = "Park";
 		p3.age = 40;
 		System.out.printf("%s %s %d %d \n",name3, p3.name, age3, p3.age);
 		
 		// 18
 		Person[] pArr = {new Person("가",10), new Person("나",20), new Person("다", 30)};
 		for(int i=0; i<pArr.length; i++) {
 			System.out.print(pArr[i].name + " ");
 		}
 		System.out.println();
 		
 		// 19
 		method8(pArr);
 		
 		// 20
 		String senior = method9(pArr);
 		System.out.println("가장 나이가 많은 사람 : " + senior);
 		
 		//
 		System.out.println("--------------------");
 		
 		// 21
 		int leng = 10; // 입력
 		method10(leng);
 		
 		// 22
 		method11(pArr);
 		
 		// 23
 		method12(pArr);
 		System.out.println();
 		
 		// 24
 		String names[] = method13(pArr);
 		for(int i=0; i<names.length; i++) {
 			System.out.print(names[i] + " ");
 		}
 		System.out.println();
 		
 		// 25
 		Person p4 = new Person("라", 11);
 		pArr[0] = p4;
 		
// 		// 26
// 		pArr[0].name = null;
// 		pArr[2].name = null;
 		for(int i=0; i<pArr.length; i++) {
 			if(pArr[i].name == null) {
 				System.out.print("arr["+ i +"]" + "는 null 입니다. ");
 				continue;
 			}
 			System.out.print("arr[" + i +"] : " + pArr[i].name + " ");
 		}
 		System.out.println();
 		
 		// 27
 		System.out.printf("%s %d\n", method14("라",pArr).name, method14("라",pArr).age);
 		
 		// 28
 		Person[] pArr2 = new Person[5];
 		for(int i=0; i<pArr2.length; i++) {
 			pArr2[i] = new Person();
 			if(i%2 == 0) {
 				pArr2[i].name = "Temp";
 			}
 		}
 		for(int i=0; i<pArr2.length; i++) {
 			System.out.printf("%s %d\n", pArr2[i].name, pArr2[i].age);
 		}
 		
 		// 29
 		Person p5 = method15(pArr[0]);
 		System.out.printf("%s %d\n", p5.name, p5.age);
 		
 		// 30
 		pArr[1].age = 30;
 		pArr[2].age = 40;
 		Person[] pArr3 = method16(pArr);
 		for(int i=0; i<pArr3.length; i++) {
 			System.out.printf("%s %d\n", pArr3[i].name, pArr3[i].age);
 		}
 		
 		//
 		System.out.println("--------------------");
 		
 		// 31
 		printInt(iArr);
 		printPerson(pArr);
 		
 		// 32
 		printIP(iArr, pArr);
 		
 		// 33
 		int[] arr33 = method17(pArr);
 		for(int i=0; i<arr33.length; i++) {
 			System.out.printf("%d ",arr33[i]);
 		}
 		System.out.println();
 		
 		// 34
 		Person[] pArr34 = method18(arr33);
 		for(int i=0; i<pArr.length; i++) {
 			System.out.printf("%s %d ",pArr34[i].name, pArr34[i].age);
 		}
 		System.out.println();
 		
 		// 35
 		Person[] pArr35 = method19(pArr);
 		for(int i=0; i<pArr.length; i++) {
 			System.out.printf("%s %d ",pArr35[i].name, pArr35[i].age);
 		}
 		System.out.println();
 		
 		// 36
 		Person[] pArr36 = method20(pArr);
 		for(int i=0; i<pArr.length; i++) {
 			System.out.printf("%s %d ",pArr36[i].name, pArr36[i].age);
 		}
 		System.out.println();
 		
 		// 37
 		method21(pArr34);
 		
 		// 38
 		Person[] pArr38 = method22(pArr36, 2);
 		for(int i=0; i<pArr38.length; i++) {
 			System.out.printf("%s %d ",pArr38[i].name, pArr38[i].age);
 		}
 		System.out.println();
 		
 		// 39
 		Person[] pArr39 = method23(pArr38);
 		System.out.print("pArr38 : ");
 		for(int i=0; i<pArr38.length; i++) {
 			System.out.printf("%s %d ",pArr38[i].name, pArr38[i].age);
 		}
 		
 		System.out.println();
 		System.out.print("pArr39 : ");
 		for(int i=0; i<pArr39.length; i++) {
 			System.out.printf("%s %d ",pArr39[i].name, pArr39[i].age);
 		}
 		System.out.println();
 		
 		// 40
 		method24(29, pArr34[1]);
 		System.out.println();
 		
 		//
 		System.out.println("--------------------");
	}
	
	
	// 6
	static double method1(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return (double)sum/arr.length;
	}
	// 7
	static int method2(int[] arr) {
		int max = 0;
		for(int i : arr) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	// 8
	static void method3(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
	}
	// 9
	static int[] method4(int leng) {
		int[] arr = new int[leng];
		return arr;
	}
	// 10
	static int[] method5(int[] arr) {
		int revArr[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			revArr[i] = arr[arr.length-1-i]; 
		}
		return revArr;
	}
	// 13
	static void method6(Person p) {
		System.out.println("name : " + p.name);
	}
	// 14
	static Person method7() {
		Person p1 = new Person();
		p1.name = "Kim";
		p1.age = 27;
		return p1;
	}
	// 16
	static void method7(Person p) {
		p.age += 1;
	}
	// 19
	static void method8(Person[] p) {
		for(int i=0; i<p.length; i++) {
			p[i].hello();
		}
	}
	// 20
	static String method9(Person[] p) {
		int max = 0;
		int num = 0;
		for(int i=0; i<p.length; i++) {
			if(max < p[i].age) {
				max = p[i].age;
				num = i;
			}
		}
		return p[num].name;
	}
	// 21
	static Person[] method10(int leng) {
		Person[] pArr = new Person[leng];
		return pArr;
	}
	// 22
	static void method11(Person[] p) {
		int sum = 0;
		for(int i=0; i<p.length; i++) {
			sum += p[i].age;
		}
		System.out.println("모든 사람의 나이 합계 : " + sum);
	}
	// 23
	static void method12(Person[] p) {
		for(int i=0; i<p.length; i++) {
			p[i].age = 10;
		}
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i].age + " ");
		}
	}
	// 24
	static String[] method13(Person[] p) {
		String[] names = new String[p.length];
		for(int i=0; i<p.length; i++) {
			names[i] = p[i].name;
		}
		return names;
	}
	// 27
	static Person method14(String name, Person[] p) {
		Person temp = new Person();
		for(int i=0; i<p.length; i++) {
			if(p[i].name.equals(name)) {
				temp = p[i];
			}
		}
		return temp;
	}
	// 29
	static Person method15(Person p) {
		Person p1 = new Person();
		p1.name = p.name;
		return p1;
	}
	// 30
	static Person[] method16(Person[] p) {
		ArrayList<Person> p1 = new ArrayList<>();
		for(int i=0; i<p.length; i++) {
			if(p[i].age >= 30) {
				p1.add(p[i]);
			}
		}
		return p1.toArray(new Person[0]);
	}
	// 31
	static void printInt(int[] iArr) {
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void printPerson(Person[] pArr) {
		for(Person p : pArr) {
			System.out.printf("%s %d\n", p.name, p.age);
		}
	}
	// 32
	static void printIP(int[] iArr, Person[] pArr) {
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(Person p : pArr) {
			System.out.printf("%s %d\n", p.name, p.age);
		}
	}
	// 33
	static int[] method17(Person[] p) {
		int[] iArr = new int[p.length];
 		for(int i=0; i<p.length; i++) {
			iArr[i] = p[i].age;
		}
 		return iArr;
	}
	// 34
	static Person[] method18(int[] iArr) {
		Person[] pArr = new Person[iArr.length];
 		for(int i=0; i<iArr.length; i++) {
 			pArr[i] = new Person();
 			pArr[i].age = iArr[i];
		}
 		return pArr;
	}
	// 35
	static Person[] method19(Person[] p) {
		Person[] pA = p;
		return pA;
	}
	// 36
	static Person[] method20(Person[] p) {
		Person[] pA = p.clone();
		return pA;
	}
	// 37
	static void method21(Person[] p) {
		for(int i=0; i<p.length; i++) {
			if(p[i].name == null)
				System.out.print(p[i].name + " ");
		}
		System.out.println();
	}
	// 38
	static Person[] method22(Person[] p, int leng) {
		Person[] pA = new Person[leng];
		for(int i=0; i<leng; i++) {
			pA[i] = new Person();
			pA[i] = p[i];
		}
		return pA;
	}
	// 39
	static Person[] method23(Person[] p) {
		Person[] pA = p;
		for(int i=0; i<p.length; i++) {
			pA[i] = new Person();
		}
		return pA;
	}
	// 40
	static void method24(int num, Person p) {
		if(num > p.age) {
			System.out.printf("%d > %d", num, p.age);
		} else if(num == p.age) {
			System.out.printf("%d = %d", num, p.age);
		} else {
			System.out.printf("%d < %d", num, p.age);
		}
	}
}
