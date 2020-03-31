/**
 *
 * @author bifronte
 */

import java.util.Scanner;

public class UserInterface {
    private final Scanner reader;
    private final PointManager pmanager;
    private final GradesDistribution grades;
    
    public UserInterface(Scanner reader, PointManager pmanager) {
        this.reader = reader;
        this.pmanager = pmanager;
        this.grades = new GradesDistribution();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");        
        
        while(true) {
            int points = Integer.valueOf(reader.nextLine());
            
            if(points == -1) {
                break;
            }
            
            if(points >= 0 && points <= 100) {
                pmanager.add(points);
                grades.add(points);
                if(points >= 50) {
                    pmanager.addPassingGrades(points);
                }
            }
        }
        
        pmanager.printGlobalAverage();
        pmanager.printPassingAverage();
        pmanager.printPassPercentage();
        grades.printGradeDistribution();
    }
}
