/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Calendar;

/**
 *
 * @author Sebastián Bustacara
 */
public class Compra {
    private long codigoCompra;
    private Calendar fecha;
    private boolean pagado;
    
    Compra(){};
    
    Compra(long codigoCompra, Calendar fecha, boolean pagado){
        this.codigoCompra=codigoCompra;
        this.fecha=fecha;
        this.pagado=pagado;
    }
}
