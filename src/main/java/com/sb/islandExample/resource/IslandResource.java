package com.sb.islandExample.resource;

import com.sb.islandExample.request.InputRequest;
import com.sb.islandExample.service.IslandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IslandResource {

    @Autowired
    private IslandService islandService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity getIslands(@RequestBody InputRequest request) {

        if(isValidRequest(request)) {
            return ResponseEntity.ok().body(islandService.getIslandCountByStrategy(request));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public boolean isValidRequest(InputRequest request){
        if(request == null) return false;

        if(request.getStrategy()== null) return false;

        if(request.getGrid() == null) return false;

        return true;
    }
}
