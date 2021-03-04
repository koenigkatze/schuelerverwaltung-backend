package com.koenigkatze.schuelerverwaltung.teilnehmer.repository;

import com.koenigkatze.schuelerverwaltung.teilnehmer.model.Teilnehmer;
import org.springframework.data.repository.CrudRepository;

public interface TeilnehmerRepository extends CrudRepository<Teilnehmer, Integer> {
}
