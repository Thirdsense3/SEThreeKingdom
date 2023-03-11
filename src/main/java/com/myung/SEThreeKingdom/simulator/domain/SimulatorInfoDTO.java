package com.myung.SEThreeKingdom.simulator.domain;

import com.myung.SEThreeKingdom.simulator.domain.basciInfo.General;

public class SimulatorInfoDTO {
    General homeGeneral1; // 왼쪽 장수 1
    General homeGeneral2; // 왼쪽 장수 2
    General homeGeneral3; // 왼쪽 장수 3
    Integer homeArea; // 관도대전 진영

    General awayGeneral1; // 오른쪽 장수 1
    General awayGeneral2; // 오른쪽 장수 2
    General awayGeneral3; // 오른쪽 장수 3
    Integer awayArea; // 관도대전 진영
}
