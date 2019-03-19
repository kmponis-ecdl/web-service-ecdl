package com.web.service.ecdl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.web.service.ecdl.service.ExcelService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/excel")
public class ExcelController {

  @Autowired
  private ExcelService excelService;

  @ApiOperation(value = "Open excel file")
  @PostMapping(value = "/open")
  public void open(@RequestBody String filePath) {
    excelService.openDocument(filePath);
  }

}
