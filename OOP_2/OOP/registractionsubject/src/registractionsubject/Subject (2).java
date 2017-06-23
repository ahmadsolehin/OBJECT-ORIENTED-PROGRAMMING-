/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registractionsubject;

/**
 *
 * @author FSK4
 */
public class Subject {
    private String subName;
    private int credit;


    public Subject(String subName, int credit) {
        this.subName = subName;
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public String getSubName() {
        return subName;
    }

   
}
