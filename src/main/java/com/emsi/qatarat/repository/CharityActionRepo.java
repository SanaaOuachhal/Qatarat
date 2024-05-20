package com.emsi.qatarat.repository;

import com.emsi.qatarat.model.CharityAction;
import com.emsi.qatarat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharityActionRepo extends JpaRepository<CharityAction,Long> {
}
