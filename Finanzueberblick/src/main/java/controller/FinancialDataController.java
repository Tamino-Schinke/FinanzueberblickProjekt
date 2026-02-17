package controller;

import Model.DTO.DebitDTO;
import Service.DebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userInput")
public class FinancialDataController {
    @Autowired
    DebitService debitService;
@PostMapping
    public List<DebitDTO> savingDebits(List<DebitDTO> debitDTOList)
    {
   return debitService.saveNewDebits(debitDTOList);
    }
    @GetMapping("/api/getDebit/{id}")
    public DebitDTO getDebit(@PathVariable Long id)
    {
    return debitService.getDebitById(id);
    }
}
