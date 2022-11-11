package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;

import pe.com.apiescuelanueva.entity.ParentescoEntity;

public interface ParantescoService {
	List<ParentescoEntity> findaAll();
	List<ParentescoEntity> findAllCustom();
	Optional<ParentescoEntity> findById(Long id);
	ParentescoEntity add(ParentescoEntity p);
	ParentescoEntity update(ParentescoEntity p);
	ParentescoEntity delete(ParentescoEntity p);
}
