/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author JoseA
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments+
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        
       /* JSONObject fugas = new JSONObject();
        fugas.clear();
        fugas.get(fugas.toString());
        System.out.println(fugas);
        JSONObject obj = api.apicall(fugas);
        System.out.println(obj.get("idfugas"));*/

        
     /* JSONObject aceleracion = new JSONObject();
        aceleracion.put("d", 300);
        aceleracion.put("t", 2);  */
        
        /*JSONObject fugas = new JSONObject();
        String zonas [] = {"cocina", "sala", "patio", "baño", "recamara1", "recamara2"};
        fugas.clear();
        Random random = new Random();
        int posicion =  random.nextInt(5);
        System.out.println(posicion);
        fugas. put("fechayhora", LocalDateTime.now().toString());
        fugas. put("area", zonas [posicion]);
        fugas. put("niveldegas", random.nextInt((11))+30);*/
        //JSONObject fugas;
         
        
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(10);
            String solicitud_url = "http://192.168.1.67/ProyectoSensores/public/api/fugasdegas";
        curl api = new curl(solicitud_url, "GET");
        JSONObject obj = api.apicall(null); 
        String idfuga = obj.get("idfuga").toString();
            System.out.println("Este ahora ya vale: "+idfuga);
        }
       

    }

}
