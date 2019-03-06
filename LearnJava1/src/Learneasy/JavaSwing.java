package Learneasy;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwing {
	
	@SuppressWarnings("null")
	public static void main ( String[] args )
	 {
	 JFrame pencere = new JFrame ("Ilk Dosyam Nasil Olmus");

	/* jFrame sınıfından pencere isimli bir nesne oluşturduk ve ekrana penceremiz ismiyle geldi */

	 pencere.setSize(1000,400);

	// en boy olarak pixel cinsinden girdik

	 pencere.setLocationRelativeTo(null);
	// pencere ekranda nerede görülecek. null dersek ortalar

	 pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// pencere kapatıldığında uygulamadan çıkılsın

	 pencere.setVisible(true);
	// penceremizin ekranda görünmesi için

	JButton buton = new JButton("SELAM MILLET COK GUZEL BIR JAVA PROGRAMI YAZDIM SIMDI CALISTIRIYORUM");
	// JButon sınıfından bir buton nesnesi oluşturduk

	pencere.add(buton);
	// butonu add metodu ile penceremize ekliyoruz
	
//	{ 
//		AbstractButton txtAdi = null;
//		String adi = txtAdi.getText();
//		AbstractButton txtParola = null;
//		String parola = txtParola.getText();
//
//		AbstractButton lblYaz = null;
//		if ("".equals(parola) && "".equals(adi)) {
//		lblYaz.setText("Adınızı ve Parolanızı Boş geçemezsiniz");
//		txtAdi.requestFocusInWindow();
//
//		} else if ("".equals(adi)) {
//		lblYaz.setText("Adınızı Boş geçemezsiniz");
//		txtAdi.requestFocusInWindow();
//
//		} else if ("".equals(parola)) {
//		lblYaz.setText("Parolanızı Boş geçemezsiniz");
//		txtParola.requestFocusInWindow();
//
//		} else {
//		lblYaz.setText(adi + "-" + parola);
//		} }
	 }

}
