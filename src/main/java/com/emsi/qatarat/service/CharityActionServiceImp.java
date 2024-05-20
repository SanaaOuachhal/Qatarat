package com.emsi.qatarat.service;

import com.emsi.qatarat.dto.CharityActionDto;
import com.emsi.qatarat.exception.ActionNotFoundException;
import com.emsi.qatarat.mapper.CharityActionMapper;
import com.emsi.qatarat.model.CharityAction;
import com.emsi.qatarat.repository.CharityActionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CharityActionServiceImp implements CharityActionService {
    @Autowired
    private CharityActionRepo charityActionRepo;

    @Autowired
    private CharityActionMapper actionMapper;

    @Override
    public CharityActionDto createAction(CharityActionDto charityActionDto) {

        CharityAction charityAction=new CharityAction();

        charityAction.setArchived(charityActionDto.isArchived());
        charityAction.setDate(charityActionDto.getDate());
        charityAction.setLocation(charityActionDto.getLocation());
        charityAction.setDescription(charityActionDto.getDescription());
        charityAction.setTitle(charityActionDto.getTitle());
        charityAction.setCollectedAmount(charityActionDto.getCollectedAmount());
        charityAction.setTargetAmount(charityActionDto.getTargetAmount());

        charityActionRepo.save(charityAction);
        return actionMapper.toDto(charityAction);
    }

    @Override
    public List<CharityActionDto> getAllActions() {
        List<CharityAction> charityActions = charityActionRepo.findAll();
        return charityActions.stream().map(actionMapper::toDto).toList();
    }

    @Override
    public CharityActionDto getActionById(Long id) {

        Optional<CharityAction> charityAction = charityActionRepo.findById(id);
        return charityAction.map(actionMapper::toDto).orElseThrow(()->new ActionNotFoundException(id));
    }

    @Override
    public CharityActionDto updateAction(Long id, CharityActionDto updatedAction) {
        CharityAction charityAction= charityActionRepo.findById(id).orElseThrow(()->new ActionNotFoundException(id));

        charityAction.setArchived(updatedAction.isArchived());
        charityAction.setDate(updatedAction.getDate());
        charityAction.setLocation(updatedAction.getLocation());
        charityAction.setDescription(updatedAction.getDescription());
        charityAction.setTitle(updatedAction.getTitle());
        charityAction.setCollectedAmount(updatedAction.getCollectedAmount());
        charityAction.setTargetAmount(updatedAction.getTargetAmount());
        CharityAction savedAction= charityActionRepo.save(charityAction);

        return actionMapper.toDto(savedAction);
    }

    @Override
    public void deleteActionById(Long id) {
        charityActionRepo.findById(id).orElseThrow(()->new ActionNotFoundException(id));
        charityActionRepo.deleteById(id);
    }
    /* public List<CharityAction> findAll() {
        return CharityActionRepo.findAll();
    }

    public Optional<CharityAction> findById(Long id) {
        return CharityActionRepo.findById(id);
    }

    public CharityAction createCharityAction(CharityAction charityActionDto) {
        CharityAction charityAction=new CharityAction();

        charityAction.setArchived(charityActionDto.isArchived());
        charityAction.setDate(charityActionDto.getDate());
        charityAction.setLocation(charityActionDto.getLocation());
        charityAction.setDescription(charityActionDto.getDescription());
        charityAction.setTitle(charityActionDto.getTitle());
        charityAction.setCollectedAmount(charityActionDto.getCollectedAmount());
        charityAction.setTargetAmount(charityActionDto.getTargetAmount());


        return CharityActionRepo.save(charityAction);
    }

    public List<CharityAction> saveAll(List<CharityAction> CharityActions) {
        return CharityActionRepo.saveAll(CharityActions);
    }

    public void deleteById(Long id) {
        CharityActionRepo.deleteById(id);
    }*/
}
