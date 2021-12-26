package org.csystem.application.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private final String m_lectureName;
    private int [][] m_grades;
    private double [] m_averages;
    private double m_average;

    private void findAverages()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < m_grades.length; ++i) {
            int total = ArrayUtil.sum(m_grades[i]);

            m_averages[i] = (double)total / m_grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += m_grades[i].length;
        }

        m_average = (double)totalGrades / totalNumberOfStudents;
    }

    private void fillGrades()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.printf("%s sınavı için şube sayısını giriniz:", m_lectureName);
        m_grades = new int[Integer.parseInt(kb.nextLine())][];
        m_averages = new double[m_grades.length];

        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d. şube öğrenci sayısını giriniz:", i + 1);
            int n = Integer.parseInt(kb.nextLine());

            m_grades[i] = ArrayUtil.getRandomArray(r, n, 0, 99);
        }
    }


    public ExamSimulation(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public int getGrade(int i, int k)
    {
        return m_grades[i][k];
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }

    public int getNumberOfClasses()
    {
        return m_averages.length;
    }

    public int getNumberOfStudents(int i)
    {
        return m_grades[i].length;
    }

    public int [][] getGrades()
    {
        int [][] result = new int[m_grades.length][];

        for (int i = 0; i < m_grades.length; ++i)
            ArrayUtil.copy(m_grades[i], result[i]);

        return result;
    }

    public double [] getAverages()
    {
        double [] result = new double[m_averages.length];
        ArrayUtil.copy(m_averages, result);

        return result;
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void displayGrades()
    {
        System.out.printf("%s sınav notları:%n", m_lectureName);
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d. şube: ", i + 1);
            ArrayUtil.display(2, m_grades[i]);
        }
        System.out.println("----------------------------------------------------------------");
    }

    public void displayReport()
    {
        System.out.println("/////////////////////////////////////////////");
        displayGrades();
        System.out.printf("%s sınavı şubeler not ortalamaları:%n", m_lectureName);
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < m_averages.length; ++i)
            System.out.printf("%d. şube ortalaması:%f%n", i + 1, m_averages[i]);
        System.out.printf("%s sınavı okul ortalaması:%f%n", m_lectureName, m_average);
        System.out.println("/////////////////////////////////////////////");
    }
}

