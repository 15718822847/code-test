package exportPDFAndExcel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class createExcel2 {
    /*public void exportExcel(HttpServletRequest request, HttpServletResponse response) {

        try {

            HSSFWorkbook wb = new HSSFWorkbook();

// 根据页面index 获取sheet页

            HSSFSheet sheet = wb.createSheet("人员基本信息");

            for (int i = 0; i < 100; i++) {

// 创建HSSFRow对象

                HSSFRow row = sheet.createRow(i + 1);

// 创建HSSFCell对象 设置单元格的值

                row.createCell(0).setCellValue("张三" + i);

                row.createCell(1).setCellValue(i);

                row.createCell(2).setCellValue("男" + i);

                row.createCell(3).setCellValue("科研" + i);

            }

// 输出Excel文件

            OutputStream output = response.getOutputStream();

            response.reset();

// 设置文件头

            response.setHeader("Content-Disposition",

                    "attchement;filename=" + new String("人员信息.xls".getBytes("gb2312"), "ISO8859-1"));

            response.setContentType("application/msexcel");

            wb.write(output);

            wb.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }*/
}
