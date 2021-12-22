package assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		String file_name="D:\\Itext PDF\\ashish.pdf";
		Document document=new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		
		document.open();
		Paragraph para=new Paragraph("Ashish Damahe New PDF");
		document.add(para);
		
		
		//Add Table in PDF
		PdfPTable table=new PdfPTable(3);
		table.setSpacingAfter(20);
		table.setPaddingTop(50);
		PdfPCell c1=new PdfPCell(new Phrase("Heading 1"));
		table.addCell(c1);
		c1=new PdfPCell(new Phrase("Heading 2"));
		table.addCell(c1);
		c1=new PdfPCell(new Phrase("Heading 3"));
		table.addCell(c1);
		table.setHeaderRows(1);
		table.addCell("1.0");
		table.addCell("1.1");
		table.addCell("1.2");
		table.addCell("2.0");
		table.addCell("2.1");
		table.addCell("2.2");
		document.add(table);
		
		//add Image in pdf
		document.add(Image.getInstance("D:\\Itext PDF\\Capture2.PNG"));
		document.close();
		System.out.println("Sucessfully created");
	}

}
