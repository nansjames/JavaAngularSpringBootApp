package com.econocom.threedivisibles.service;

import org.springframework.stereotype.Service;

@Service
public class ThreeDivisiblesService {
    public Integer getResult(Integer id) {
        System.out.println("threeDivisiblesService");
        if((id % 3 == 0) && (id % 5 ==0)) {
            return 35;
        }
        else if(id % 5 == 0){
            return 5;
        }
        else if(id % 3 == 0){
            return 3;
        }
        else {
            return 0;
        }
    }
}
