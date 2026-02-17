package Mapper;

import Model.DTO.DebitDTO;
import Model.Entity.DebitEntity;
import Service.DebitService;

import java.util.List;

public class DebitMap {
    public static DebitEntity toEntity (DebitDTO debitDTO){
        return  DebitEntity.builder()
                .id(debitDTO.getId())
                .alreadyPaid(debitDTO.isAlreadyPaid())
                .category(debitDTO.getCategory())
                .dateOfRegestration(debitDTO.getDateOfRegestration())
                .build();
    }
    public List<DebitEntity> toEntityList(List<DebitDTO> debitDTOList){
    return debitDTOList.stream().map(DebitMap :: toEntity).toList();
    }
    public static DebitDTO toDTO (DebitEntity debitEntity){
        return DebitDTO.builder()
                .id(debitEntity.getId())
                .alreadyPaid(debitEntity.isAlreadyPaid())
                .category(debitEntity.getCategory())
                .dateOfRegestration(debitEntity.getDateOfRegestration())
                .build();
    }
    public List<DebitDTO> toDTOList(List<DebitEntity> debitEntityList){
        return debitEntityList.stream().map(DebitMap :: toDTO).toList();
    }
}
