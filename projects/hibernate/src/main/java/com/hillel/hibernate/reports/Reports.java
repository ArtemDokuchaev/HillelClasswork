package com.hillel.hibernate.reports;

import org.hibernate.Session;

import org.hibernate.query.Query;
import java.util.List;

public class Reports {

    public List<ExamReport> getExamResults(String firstname, String lastname, Session session){
        /*Query query = session.createQuery("select " +
                "new com.hillel.hibernate.reports.ExamReport(s.name, st.firstname, e.grade)" +
                "from Exam e, Subject s, student st" +
                "Where e.student.id = st.id and e.subject.id = s.id" +
                "and st.firstname = :firstname and st.lastname = :lastname");
         */

        Query query = session.createQuery("Select" +
                "new com.hillel.hibernate.reports.ExamReport(e.subject.name, e.student.firstname, e.grade) " +
                "from Exam e" +
                "where e.student.firstname = :firstname and " +
                "e.student.lastname = :lastname");

        query.setParameter("firstname", firstname);
        query.setParameter("lastname", lastname);

        return query.getResultList();
    }
}
