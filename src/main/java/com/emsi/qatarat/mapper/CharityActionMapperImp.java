package com.emsi.qatarat.mapper;

import com.emsi.qatarat.dto.CharityActionDto;
import com.emsi.qatarat.model.CharityAction;
import org.springframework.stereotype.Component;

@Component
public class CharityActionMapperImp implements CharityActionMapper {


    @Override
    public CharityActionDto toDto(CharityAction charityAction) {
        return CharityActionDto.builder()
                .id(charityAction.getId())
                .title(charityAction.getTitle())
                .description(charityAction.getDescription())
                .date(charityAction.getDate())
                .location(charityAction.getLocation())
                .targetAmount(charityAction.getTargetAmount())
                .collectedAmount(charityAction.getCollectedAmount())
                .archived(charityAction.isArchived())
                .build();
}

    private void build() {
    }
}
