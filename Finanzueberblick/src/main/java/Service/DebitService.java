package Service;

import Mapper.DebitMap;
import Model.DTO.DebitDTO;
import Model.Entity.DebitEntity;
import Repository.DebitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DebitService {

    @Autowired
    DebitEntity debitEntity;
    @Autowired
    private DebitMap debitMap;
    private DebitRepository debitRepo;
public List<DebitDTO> saveNewDebits(List<DebitDTO> allInputDebits)
{
    List<DebitEntity> debitEntityList= debitMap.toEntityList(allInputDebits);
   debitRepo.saveAll(debitEntityList);
   return debitMap.toDTOList(debitEntityList);
}
public DebitDTO getDebitById(Long id)
{
   debitEntity = debitRepo.findById(id).orElseThrow(()-> new RuntimeException());
   return DebitMap.toDTO(debitEntity);
}
}
