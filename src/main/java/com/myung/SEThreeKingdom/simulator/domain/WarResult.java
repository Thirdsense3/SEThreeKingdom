package com.myung.SEThreeKingdom.simulator.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class WarResult {
    Boolean result; // 왼쪽팀 결과

    BattleResult homeTroops1; // 왼쪽 장수1 결과
    BattleResult homeTroops2; // 왼쪽 장수2 결과
    BattleResult homeTroops3; // 왼쪽 장수3 결과

    BattleResult awayTroops1; // 오른쪽 장수1 결과
    BattleResult awayTroops2; // 오른쪽 장수2 결과
    BattleResult awayTroops3; // 오른쪽 장수3 결과

    List<WarDetail> warDetailList; // 전투 상세 내용
}
