/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Bir okulda Kimya sınavı ortak olarak yapılıyor olsun. Kaç şube olduğu ve herbir şubede kaç öğrenci
    olduğu bilgileri klavyeden alınsın. Bu işlem sonrasında öğrencilerin notları rasgele olarak belirlensin. Tüm bu
    işlemlerden Kimya sınavı için herbir şubenin ayrı ayrı not ortalamaları ve okulun not ortalamasını bulan basit bir
    simülasyon programı yazınız

    Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.application.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation chemistrySimulation = new ExamSimulation("Kimya");
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");

        chemistrySimulation.run();
        mathSimulation.run();

        chemistrySimulation.displayReport();
        mathSimulation.displayReport();
    }
}
