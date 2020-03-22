package exportPDFAndExcel;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class createPDF {
    /*public static PdfPTable createTable(PdfWriter writer) throws DocumentException, IOException {
        PdfPTable table = new PdfPTable(2);//生成一个两列的表格
        PdfPCell cell;
        int size = 15;
        cell = new PdfPCell(new Phrase("one"));
        cell.setFixedHeight(size);//设置高度
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        List<NoticeInfo> manList = new ArrayList<>();
        for(NoticeInfo man:manList) {
            //document.add(new Chunk("\n"));
            cell = new PdfPCell(new Paragraph(man.getPersonName() + ""));
            // 居中对齐
            cell.setHorizontalAlignment(1);
            table.addCell(cell);
            cell = new PdfPCell(new Paragraph(man.getNoticeTitle() + ""));
            // 居中对齐
            cell.setHorizontalAlignment(1);
            table.addCell(cell);
            cell = new PdfPCell(new Paragraph(man.getPublishTime().toString()));
            // 居中对齐
            cell.setHorizontalAlignment(1);
            table.addCell(cell);
        }
        // 文档中加入表格
        //document.add(table);
        return table;
    }

    public void createPDF(String filename) throws IOException {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.addTitle("example of PDF");
            document.open();
            PdfPTable table = createTable(writer);
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }

    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 告诉浏览器用什么软件可以打开此文件
        response.setHeader("content-Type", "application/pdf");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=user.pdf");

        Document document = new Document();
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();
        List<User> list = userRepository.findAll();
        for (User user : list) {
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell = new PdfPCell();
            cell.setPhrase(new Paragraph(user.getId().toString()));
            table.addCell(cell);
            document.add(table);

            cell = new PdfPCell();
            cell.setPhrase(new Paragraph(user.getName().toString()));
            table.addCell(cell);
            document.add(table);

            cell = new PdfPCell();
            cell.setPhrase(new Paragraph(user.getAge().toString()));
            table.addCell(cell);
            document.add(table);
        }
        document.close();
    }
}*/
}
