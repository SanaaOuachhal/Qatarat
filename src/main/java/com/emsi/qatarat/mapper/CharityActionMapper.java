package com.emsi.qatarat.mapper;

import com.emsi.qatarat.dto.CharityActionDto;
import com.emsi.qatarat.model.CharityAction;

public interface CharityActionMapper {
    public CharityActionDto toDto(CharityAction todo);
}
