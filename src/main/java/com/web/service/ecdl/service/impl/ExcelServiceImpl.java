package com.web.service.ecdl.service.impl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Component;
import com.web.service.ecdl.service.ExcelService;

@Component
public class ExcelServiceImpl implements ExcelService {

  @Override
  public void openDocument(String filePath) {
    Desktop dt = Desktop.getDesktop();
    try {
      dt.open(new File(filePath));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
