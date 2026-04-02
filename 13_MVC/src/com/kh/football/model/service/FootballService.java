package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

// 축구선수 저장된걸 가지고 연사는 파트
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service단에서 저장
	private List<FootballPlayer> list = new ArrayList<FootballPlayer>();
	private int id;
	
	{ // 초기화 블록
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날두", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 10));
	}
	
	// View가 축구선수들 정보를 출력하기 위해서 건너건너 옴
	public List<FootballPlayer> selectAll() {
		return list;
	}
	
	// View가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto player) {
		// 비즈니스 로직 == 의사결정 코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		/*
		if(player != null && player.getName().length() >= 2) {
			// player가 정상적으로 돌아오지 못했다면
			// NullPointerException이 발생할 수 있음
			if("공격수".equals(player.getPosition()) || player.getPosition().equals("공격수") ||
					player.getPosition().equals("미드필더") ||
					player.getPosition().equals("수비수") || player.getPosition().equals("골키퍼")) {
				if(player.getPlayerNum() >= 0) {
					// 값에 대한 유효성검증 == validate
					list.add(new FootballPlayer(++id, player.getName(), player.getPosition(), player.getPlayerNum()));
					return list.get(list.size() - 1);
				}
			}
		}
		*/
		if(validateFootballPlayer(player)) {
			list.add(new FootballPlayer(++id, player.getName(), player.getPosition(), player.getPlayerNum()));
			return list.get(list.size() - 1);
		}
		return null;
	}
	
	public boolean idCheck(int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		// id값을 가지고 list를 순회해서
		// 동일한 id값을 가진 FootballPlayer의 index를 알아내야함
		/*
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		*/
		int index = indexOf(id);
		// 유효성검사
		boolean result = validateFootballPlayer(player);
		
		if(result) {
			list.set(index, new FootballPlayer(id, player.getName(), player.getPosition(), player.getPlayerNum()));
		}
	}
	
	private int indexOf(int id) {
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
		}
		return null;
	}
	
	private boolean validateFootballPlayer(FootballPlayerDto player) {
		if(player != null && player.getName().length() >= 2) {
			if("공격수".equals(player.getPosition()) || player.getPosition().equals("공격수") ||
					player.getPosition().equals("미드필더") ||
					player.getPosition().equals("수비수") || player.getPosition().equals("골키퍼")) {
				if(player.getPlayerNum() >= 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
