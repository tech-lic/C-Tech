package util;

import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class Itest {
    public static void main(String[] args) throws Exception {
        Document document = new Document(PageSize.A4);
         try {
             System.out.print("Generating PDF");
             PdfWriter.getInstance(document, new FileOutputStream("tes.pdf"));
             document.open();
             //iText自带的中文字体
             BaseFont bf1 = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
             //自定义字体
             BaseFont bf2 = BaseFont.createFont("wqy-zenhei.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
             Font font = new Font(bf2, 12, Font.NORMAL);
             Paragraph p = new Paragraph("测试abc中文123", font);
             document.add(p);
             System.out.println("Done.");
        } finally {
             document.close();
         }
     }

}
