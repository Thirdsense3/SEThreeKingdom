package com.myung.SEThreeKingdom.simulator.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SimulatorResultDTO {
    Float WinRate; // 왼쪽 진영 승률
    List<WarResult> warResultList; // 전투 결과
}
