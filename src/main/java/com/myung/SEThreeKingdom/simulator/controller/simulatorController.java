package com.myung.SEThreeKingdom.simulator.controller;

import com.myung.SEThreeKingdom.simulator.domain.SimulatorInfoDTO;
import com.myung.SEThreeKingdom.simulator.domain.SimulatorResultDTO;
import com.myung.SEThreeKingdom.simulator.service.SimulatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/simulator")
@Slf4j
@RequiredArgsConstructor
public class simulatorController {

    private final SimulatorService simulatorService;

    @GetMapping("/result")
    @ResponseBody
    public HashMap<String, String> getSimulatorResult(@ModelAttribute SimulatorInfoDTO simulatorInfoDTO) {
        SimulatorResultDTO simulatorResult = simulatorService.getSimulatorResult(simulatorInfoDTO);
    }

}
