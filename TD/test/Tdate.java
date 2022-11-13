
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M@nU_LP
 */
public class Tdate {
    public static void main(String[] args) throws ParseException{
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mmm-yy");
        
        System.out.println(date + " dif " + date.compareTo(sdf.parse("13-12-2002")));
    }
}
