package com.emsi.qatarat.controller;

import com.emsi.qatarat.dto.CharityActionDto;
import com.emsi.qatarat.exception.ApiError;
import com.emsi.qatarat.model.CharityAction;
import com.emsi.qatarat.service.CharityActionService;
import com.emsi.qatarat.service.CharityActionServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/actions")
@RestController
public class CharityActionController {

    @Autowired
    private CharityActionService charityActionService;

    @PostMapping
    public ResponseEntity<Object> createAction(@RequestBody CharityActionDto charityActionDto) {
        CharityActionDto createdAction = charityActionService.createAction(charityActionDto);
        return new ResponseEntity<>(new ApiError(201,"Action created succesfully"), HttpStatus.CREATED);
    }

    @GetMapping
    public List<CharityActionDto> getAllActions() {
        return charityActionService.getAllActions();
    }

    @GetMapping("/{id}")
    public CharityActionDto getActionById(@PathVariable Long id) {
        return charityActionService.getActionById(id);
    }

    @PutMapping("/{id}")
    public CharityActionDto updatedAction(@PathVariable Long id, @RequestBody CharityActionDto updatedAction){
        return charityActionService.updateAction(id,updatedAction);
    }
    void deleteAction(@PathVariable Long id ){
        charityActionService.deleteActionById(id);
    }

   /* @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        if (CharityActionService.findById(id).isPresent()) {
            CharityActionService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/}
