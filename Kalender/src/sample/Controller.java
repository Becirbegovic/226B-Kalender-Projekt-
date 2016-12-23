package sample;

import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.itextpdf.text.Image.getInstance;

public class Controller implements Initializable {

    //Variablen/Arrays
    private ArrayList Januar = new ArrayList();
    private ArrayList Februar = new ArrayList();
    private ArrayList Maerz = new ArrayList();
    private ArrayList April = new ArrayList();
    private ArrayList Mai = new ArrayList();
    private ArrayList Juni = new ArrayList();
    private ArrayList Juli = new ArrayList();
    private ArrayList August = new ArrayList();
    private ArrayList September = new ArrayList();
    private ArrayList Oktober = new ArrayList();
    private ArrayList November = new ArrayList();
    private ArrayList Dezember = new ArrayList();

    //Zugriffe
    @FXML
    private CheckBox chk_Template1;
    @FXML
    private CheckBox chk_Template2;
    //Status Chekboxen der Monate
    @FXML
    private CheckBox chk_Januar;
    @FXML
    private CheckBox chk_Februar;
    @FXML
    private CheckBox chk_Maerz;
    @FXML
    private CheckBox chk_April;
    @FXML
    private CheckBox chk_Mai;
    @FXML
    private CheckBox chk_Juni;
    @FXML
    private CheckBox chk_Juli;
    @FXML
    private CheckBox chk_August;
    @FXML
    private CheckBox chk_September;
    @FXML
    private CheckBox chk_Oktober;
    @FXML
    private CheckBox chk_November;
    @FXML
    private CheckBox chk_Dezember;
    //Textbox
    @FXML
    private TextField tb_Jahr;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Create_PDF(ActionEvent keyEvent) throws IOException, DocumentException {
        System.out.println("CreatePDF");
        createPdf();
        openPDF();

    }

    public void Template1_Checked(ActionEvent actionEvent) {
        //Checkbox 2 dekativiern
        if (chk_Template1.isSelected()) {
            chk_Template2.setSelected(false);
        }
    }

    public void Template2_Checked(ActionEvent actionEvent) {
        //Checkbox 1 deaktivieren
        if (chk_Template2.isSelected()) {
            chk_Template1.setSelected(false);
        }
    }

    public void Erstellen_Januar(ActionEvent actionEvent) throws IOException {
        //Bei Klick Reset des Monats
        Januar.clear();
        chk_Januar.setSelected(false);

        if (chk_Template1.isSelected()) {
            Januar.add(GetImageURL());
        } else {
            Januar.add(GetImageURL());
            Januar.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Januar.contains("CANCEL");
        if (Canceled) {
            Januar.clear();
            chk_Januar.setSelected(false);
        } else {
            chk_Januar.setSelected(true);
        }
    }

    public void Erstellen_Februar(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Februar.clear();
        chk_Februar.setSelected(false);

        if (chk_Template1.isSelected()) {
            Februar.add(GetImageURL());
        } else {
            Februar.add(GetImageURL());
            Februar.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Februar.contains("CANCEL");
        if (Canceled) {
            Februar.clear();
            chk_Februar.setSelected(false);
        } else {
            chk_Februar.setSelected(true);
        }
    }

    public void Erstellen_Maerz(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Maerz.clear();
        chk_Maerz.setSelected(false);

        if (chk_Template1.isSelected()) {
            Maerz.add(GetImageURL());
        } else {
            Maerz.add(GetImageURL());
            Maerz.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Maerz.contains("CANCEL");
        if (Canceled) {
            Maerz.clear();
            chk_Maerz.setSelected(false);
        } else {
            chk_Maerz.setSelected(true);
        }
    }

    public void Erstellen_April(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        April.clear();
        chk_April.setSelected(false);

        if (chk_Template1.isSelected()) {
            April.add(GetImageURL());
        } else {
            April.add(GetImageURL());
            April.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = April.contains("CANCEL");
        if (Canceled) {
            April.clear();
            chk_April.setSelected(false);
        } else {
            chk_April.setSelected(true);
        }
    }

    public void Erstellen_Mai(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Mai.clear();
        chk_Mai.setSelected(false);

        if (chk_Template1.isSelected()) {
            Mai.add(GetImageURL());
        } else {
            Mai.add(GetImageURL());
            Mai.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Mai.contains("CANCEL");
        if (Canceled) {
            Mai.clear();
            chk_Mai.setSelected(false);
        } else {
            chk_Mai.setSelected(true);
        }
    }

    public void Erstellen_Juni(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Juni.clear();
        chk_Juni.setSelected(false);

        if (chk_Template1.isSelected()) {
            Juni.add(GetImageURL());
        } else {
            Juni.add(GetImageURL());
            Juni.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Juni.contains("CANCEL");
        if (Canceled) {
            Juni.clear();
            chk_Juni.setSelected(false);
        } else {
            chk_Juni.setSelected(true);
        }
    }

    public void Erstellen_Juli(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Juli.clear();
        chk_Juli.setSelected(false);

        if (chk_Template1.isSelected()) {
            Juli.add(GetImageURL());
        } else {
            Juli.add(GetImageURL());
            Juli.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Juli.contains("CANCEL");
        if (Canceled) {
            Juli.clear();
            chk_Juli.setSelected(false);
        } else {
            chk_Juli.setSelected(true);
        }
    }

    public void Erstellen_August(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        August.clear();
        chk_August.setSelected(false);

        if (chk_Template1.isSelected()) {
            August.add(GetImageURL());
        } else {
            August.add(GetImageURL());
            August.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = August.contains("CANCEL");
        if (Canceled) {
            August.clear();
            chk_August.setSelected(false);
        } else {
            chk_August.setSelected(true);
        }
    }

    public void Erstellen_September(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        September.clear();
        chk_September.setSelected(false);

        if (chk_Template1.isSelected()) {
            September.add(GetImageURL());
        } else {
            September.add(GetImageURL());
            September.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = September.contains("CANCEL");
        if (Canceled) {
            September.clear();
            chk_September.setSelected(false);
        } else {
            chk_September.setSelected(true);
        }
    }

    public void Erstellen_Oktober(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Oktober.clear();
        chk_Oktober.setSelected(false);

        if (chk_Template1.isSelected()) {
            Oktober.add(GetImageURL());
        } else {
            Oktober.add(GetImageURL());
            Oktober.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Oktober.contains("CANCEL");
        if (Canceled) {
            Oktober.clear();
            chk_Oktober.setSelected(false);
        } else {
            chk_Oktober.setSelected(true);
        }
    }

    public void Erstellen_November(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        November.clear();
        chk_November.setSelected(false);

        if (chk_Template1.isSelected()) {
            November.add(GetImageURL());
        } else {
            November.add(GetImageURL());
            November.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = November.contains("CANCEL");
        if (Canceled) {
            November.clear();
            chk_November.setSelected(false);
        } else {
            chk_November.setSelected(true);
        }
    }

    public void Erstellen_Dezember(ActionEvent actionEvent) {
        //Bei Klick Reset des Monats
        Dezember.clear();
        chk_Dezember.setSelected(false);

        if (chk_Template1.isSelected()) {
            Dezember.add(GetImageURL());
        } else {
            Dezember.add(GetImageURL());
            Dezember.add(GetImageURL());
        }
        //Checken ob Bilderauswahl nicht unterbrochen wurde
        boolean Canceled = Dezember.contains("CANCEL");
        if (Canceled) {
            Dezember.clear();
            chk_Dezember.setSelected(false);
        } else {
            chk_Dezember.setSelected(true);
        }
    }

    public String GetImageURL() {
        final JFileChooser chooser = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        chooser.addChoosableFileFilter(imageFilter);
        chooser.setAcceptAllFileFilterUsed(false);
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
            return "CANCEL";
        }
        return chooser.getSelectedFile().toString();
    }

    public void createPdf() throws IOException, DocumentException {

        //Prüfe ob alle Monate bereit sind
        if (CheckStatus()) {

            // Initialize document
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Kalender.pdf"));

            //Öffne Dokument fürs Editieren
            document.open();

            //Januar
            document.newPage();
            document.add(new Paragraph("Januar"));
            ErstelleMonat(Januar,document);

            //Februar
            document.newPage();
            document.add(new Paragraph("Februar"));
            ErstelleMonat(Februar,document);

            //Maerz
            document.newPage();
            document.add(new Paragraph("Maerz"));
            ErstelleMonat(Maerz,document);

            //April
            document.newPage();
            document.add(new Paragraph("April"));
            ErstelleMonat(April,document);

            //Mai
            document.newPage();
            document.add(new Paragraph("Mai"));
            ErstelleMonat(Mai,document);

            //Juni
            document.newPage();
            document.add(new Paragraph("Juni"));
            ErstelleMonat(Juni,document);

            //Juli
            document.newPage();
            document.add(new Paragraph("Juli"));
            ErstelleMonat(Juli,document);

            //August
            document.newPage();
            document.add(new Paragraph("August"));
            ErstelleMonat(August,document);

            //September
            document.newPage();
            document.add(new Paragraph("September"));
            ErstelleMonat(September,document);

            //Oktober
            document.newPage();
            document.add(new Paragraph("Oktober"));
            ErstelleMonat(Oktober,document);

            //November
            document.newPage();
            document.add(new Paragraph("November"));
            ErstelleMonat(November,document);

            //Dezember
            document.newPage();
            document.add(new Paragraph("Dezember"));
            ErstelleMonat(Dezember,document);

            document.close();
        }
    }

    private void openPDF() {
    	if (CheckStatus()) {
	        if (Desktop.isDesktopSupported()) {
	            try {
	                File myFile = new File("Kalender.pdf");
	                Desktop.getDesktop().open(myFile);
	            } catch (IOException ex) {
	                // no application registered for PDFs
	            }
	        }
    	}
    }

    private void ErstelleMonat(ArrayList Monat, Document document) throws IOException, DocumentException {
        if (Monat.size() == 1) {
            Image img = getInstance((String) Monat.get(0));
            img.scaleAbsolute(520, 600);
            document.add(img);
        }else
        {
            Image img1 = getInstance((String) Monat.get(0));
            img1.scaleAbsolute(520, 300);
            document.add(img1);
            Image img2 = getInstance((String) Monat.get(1));
            img2.scaleAbsolute(520, 300);
            document.add(img2);
        }
        document.add(createFirstTable(1, 10));
        document.add(createFirstTable(11, 20));
        document.add(createFirstTable(21, 30));
    }

    private boolean CheckStatus() {
        boolean ready = true;
        if (!(chk_Januar.isSelected())) {
            ready = false;
        }
        if (!(chk_Februar.isSelected())) {
            ready = false;
        }
        if (!(chk_Maerz.isSelected())) {
            ready = false;
        }
        if (!(chk_April.isSelected())) {
            ready = false;
        }
        if (!(chk_Mai.isSelected())) {
            ready = false;
        }
        if (!(chk_Juni.isSelected())) {
            ready = false;
        }
        if (!(chk_Juli.isSelected())) {
            ready = false;
        }
        if (!(chk_August.isSelected())) {
            ready = false;
        }
        if (!(chk_September.isSelected())) {
            ready = false;
        }
        if (!(chk_Oktober.isSelected())) {
            ready = false;
        }
        if (!(chk_November.isSelected())) {
            ready = false;
        }
        if (!(chk_Dezember.isSelected())) {
            ready = false;
        }
        return ready;
    }

    public static PdfPTable createFirstTable(int fromINT, int toINT) {
        PdfPTable table = new PdfPTable(10);
        for (int aw = fromINT; aw <= toINT; aw++) {
            table.addCell(String.valueOf(aw));
        }
        return table;
    }

}
