package com.jollypet.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setName("Tommy");
		member1.setPw("1234");
		member1.setEmail("hong@naver.com");
		member1.setAge(22);
		
		
//		member1.id = "tiger";
//		member1.pw = "1234";
//		member1.name = "Tommy";
//		member1.email = "tommy@abc.com";
//		member1.age = 27;
					
		Member member2 = new Member();
//		member2.id = "iger";
//		member2.pw = "11234";
//		member2.name = "Tom";
//		member2.email = "tom@abc.com";
//		member2.age = 37;
//		
//		System.out.println("회원이름 : " + member1.name); // Tommy
		System.out.println("회원이름 : " + member1.getName()); // Tommy

		Member member3 = new Member("Whale", "122121", "Julie", "julie@email.com", 22);
		System.out.println("회원3 이메일 : " + member3.getEmail()); //		




	}

}
