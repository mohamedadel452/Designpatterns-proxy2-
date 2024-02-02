/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy2;

/**
 *
 * @author hp
 */
public class RealDownloade  implements Downloade{
    
    private String  tragetfile;
    private String  TargetDate;

    public RealDownloade(String tragetfile) {
        this.tragetfile = tragetfile;
        downloadefrominternaet(this.tragetfile);
    }
    @Override
    public void Downlod() {
        System.out.println(TargetDate);  
    }
    
    
    private void downloadefrominternaet(String filename){
        
        this.TargetDate="the dataof the file"+filename+"is :hello mohamed adel";
        
    }
    
}
