/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy2;

/**
 *
 * @author hp
 */
public class Proxydownload implements Downloade{
    
    private RealDownloade downloader;
    private String filename;

    public Proxydownload(String filename) {
        this.filename = filename;
    }
   
    
   

    @Override
    public void Downlod() {
        if(downloader==null){
            downloader=new RealDownloade(filename);
        }
        downloader.Downlod();
    }
    
}
