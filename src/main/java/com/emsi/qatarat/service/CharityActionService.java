package com.emsi.qatarat.service;

import com.emsi.qatarat.dto.CharityActionDto;
import com.emsi.qatarat.model.CharityAction;

import java.util.List;
import java.util.Optional;

public interface CharityActionService {
    CharityActionDto createAction(CharityActionDto charityActionDto);
    List<CharityActionDto> getAllActions();
    public CharityActionDto getActionById(Long id);
    CharityActionDto updateAction(Long id, CharityActionDto updatedAction);
    void deleteActionById(Long id);
}
