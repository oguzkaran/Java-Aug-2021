/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda Kimya sınavı ortak olarak yapılıyor olsun. Kaç şube ve herbir şubede kaç öğrenci
	olduğu bilgisi klavyeden alınsın. Öğrencilerin notları rasgele belirlensin. Tüm bu işlemlerden sonra Kimya sınavı için
	herbir şubenin ayrı ayrı not ortalamaları ile okulun not ortalamasını bulan basit bir simülasyon programını yazınız.
	Programı mümkün olduğunda genel düşünerek yazmaya çalışınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation chemistrySimulation = new ExamSimulation("Kimya");
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");

        chemistrySimulation.run();
        mathSimulation.run();

        chemistrySimulation.printReport();
        mathSimulation.printReport();
    }
}
