package com.votingage.income.persistence;

import com.votingage.income.model.VoteTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteTableRepository extends JpaRepository<VoteTable, Long> {
}
