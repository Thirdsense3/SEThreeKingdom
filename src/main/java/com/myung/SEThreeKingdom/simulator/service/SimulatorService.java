package com.myung.SEThreeKingdom.simulator.service;

import com.myung.SEThreeKingdom.simulator.domain.SimulatorInfoDTO;
import com.myung.SEThreeKingdom.simulator.domain.SimulatorResultDTO;

public interface SimulatorService {
    SimulatorResultDTO getSimulatorResult(SimulatorInfoDTO simulatorInfoDTO);
}
