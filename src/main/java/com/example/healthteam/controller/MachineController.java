package com.example.healthteam.controller;

import com.example.healthteam.entity.Machine;
import com.example.healthteam.service.MachineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/machines")
@AllArgsConstructor
public class MachineController {
    MachineService machineService;

    @GetMapping("")
    public List<Machine> getMachines(@RequestParam(value = "category", required = false) Integer categoryId){
        /*
        List<Machine> returnMachine = new ArrayList<>();

        Machine latpullDown = new Machine("랫풀다운", "등을 아주 조져줍니다. 풀업 못하면 하세요", "https://youtube.com");
        Machine armCurlMachine = new Machine("암컬머신", "이두 운동 팔이 커집니다.", "https://youtube.com");

        returnMachine.add(latpullDown);
        returnMachine.add(armCurlMachine);

        return returnMachine;
         */
        if(categoryId == null){
            return machineService.getMachines();
        }
        return machineService.getMachinesByCategory(categoryId);

    }

    @GetMapping("/{machineId}")
    public Machine getMachine(@PathVariable("machineId") Long machineId){
        return machineService.getMachineid(machineId);
    }
}
