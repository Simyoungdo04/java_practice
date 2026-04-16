package com.kh.animal.view;

import java.util.List;
import java.util.Scanner;

import com.kh.animal.controller.AnimalController;
import com.kh.animal.model.dto.AnimalDto;

public class AnimalView {
	private Scanner sc = new Scanner(System.in);
	private AnimalController ac = new AnimalController();
	/*
	 * ANIMAL
	 * 
	 * insertAnimal
	 * selectAnimalList
	 * selectAnimal
	 * updateAnimal
	 * deleteAnimal
	 * 
	 * ==================
	 * 
	 * save
	 * findAll
	 * findByXXX
	 * update
	 * deleteByXXX
	 */
	public void mainMenu() {
		while(true) {
			System.out.println("동물 관리 프로그램입니다");
			System.out.println("1. 동물 추가하기");
			System.out.println("2. 동물 전체조회");
			System.out.println("3. 동물 단일조회");
			System.out.println("4. 동물 이름 키워드 조회");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴 번호 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : save(); break;
			case "2" : findAll(); break;
			case "3" : findById(); break;
			case "4" : findByKeyword(); break;
			case "0" : System.out.println("프로그램 종료"); sc.close(); return;
			}
		}
	}
	/*
	 * mybatis-config.xml -> DB접속정보, 환경설정 등이 들어감
	 * 						 .getConnection()을 호출 시 전달했던 인자값을 대체
	 * mapper.xml 		  -> SQL이 들어가는 파일
	 * 						 보편적으로 테이블 당 하나씩 만들어줌
	 * SqlSesstionFactory -> DB세션을 만들어주는 공장 -> 프로그램 시작할 때 한 번만 만들어줌
	 * 
	 * SqlSesstion		  -> 실제로 SQL을 실행시키는 객체 -> JDBC의 Connection + Statement
	 * 
	 * 우리가 작성한 mapper.xml파일을 읽어서 PreparedStatement를 만들고
	 * 파라미터를 자동으로 바인딩하고 ResultSet순회나 close도 다 알아서 처리
	 * => 
	 * pstmt.setString(1, animalName);
	 * #{animalId}
	 * 
	 * 개발자는 SQL작성 및 호출코드 작성
	 */
	private void save() {
		System.out.println("동물 추가 서비스");
		System.out.print("동물 이름 입력 > ");
		String name = sc.nextLine();
		
		System.out.print("동물 종 번호 입력 > ");
		String speciesId = sc.nextLine();
		
		System.out.print("동물 구역번호 입력 > ");
		String zoneId = sc.nextLine();
		
		System.out.print("동물 사육사번호 입력 > ");
		String keeperId = sc.nextLine();
		
		System.out.print("동물 성별 입력(M, F) > ");
		String gender = sc.nextLine();
		
		System.out.print("동물 몸무계 입력 > ");
		double kg = sc.nextDouble();
		sc.nextLine();
		
		int result = ac.save(new AnimalDto(name, speciesId, zoneId, keeperId, gender, kg));
		
		if(result > 0) {
			System.out.println(name + "추가 성공");
		} else {
			System.out.println(name + "추가 실패");
		}
	}
	
	private void findAll() {
		System.out.println("동물 전체조회");
		List<AnimalDto> animals = ac.findAll();
		
		if(animals.isEmpty()) {
			System.out.println("조회 결과가 없습니다.");
		} else {
			for(AnimalDto animal : animals) {
				System.out.println("동물번호 : " + animal.getAnimalId() 
								 + "\n동물이름 : " + animal.getAnimalName() + "\t|\t 종 이름 : " + animal.getSpeciesId() 
								 + "\n구역이름 : " + animal.getZoneId() + "\t|\t 사육사 이름 : " + animal.getKeeperId() 
								 + "\n성별 : " + animal.getGender() + "\t\t|\t 몸무게 : " + animal.getWeightKg() + "kg");
				System.out.println();
			}
		}
	}
	
	private void findById() {
		System.out.println("동물 단일조회");
		System.out.print("검색하실 동물의 ID를 입력해주세요 > ");
		String id = sc.nextLine();
		
		AnimalDto animal = ac.findById(id);
		
		if(animal != null) {
			System.out.println("ID : " + animal.getAnimalId());
			System.out.println("동물 이름 : " + animal.getAnimalName());
			System.out.println("종 이름 : " + animal.getSpeciesId());
			System.out.println("구역 이름 : " + animal.getZoneId());
			System.out.println("사육사 이름 : " + animal.getKeeperId());
			System.out.println("성별 : " + animal.getGender());
			System.out.println("몸무게 : " + animal.getWeightKg() + "kg");
		} else {
			System.out.println("조회할 수 없습니다.");
		}
	}
	
	private void findByKeyword() {
		System.out.println("동물 이름 키워드 조회");
		System.out.print("검색할 키워드 입력 > ");
		String keyword = sc.nextLine();
		
		List<AnimalDto> animals = ac.findByKeyword(keyword);
		
		if(animals.isEmpty()) {
			System.out.println("조회 결과가 없습니다.");
		} else {
			System.out.println();
			for(AnimalDto animal : animals) {
				System.out.println("ID : " + animal.getAnimalId() 
								 + "\n동물 이름 : " + animal.getAnimalName() + ", 종 ID : " + animal.getSpeciesId()
								 + "\n구역 ID : " + animal.getZoneId() + ", 사육사 ID : " + animal.getKeeperId());
				System.out.println();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
