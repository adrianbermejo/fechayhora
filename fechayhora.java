
/**
 * Write a description of class fechayhora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fechayhora
{
    private NumberDisplay dia;
    private NumberDisplay mes;
    private NumberDisplay ano;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
   
    
    public fechayhora()
    {
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13);
        ano = new NumberDisplay(100);
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        }
         /**
    *metodo para obtener la fecha
    */
    public String getFechaYHoraa()
    {
      
        return  dia.getDisplayValue()+ "-"+ mes.getDisplayValue()+ "-" 
        + ano.getDisplayValue()+ "-" + hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
    /**
     * fijar fechayhora.
     */
    public void fijarFechaYHora(int dias, int mess, int anos, int hora, int minutos)
    {
       dia.setValue(dias);
       mes.setValue(mess);
       ano.setValue(anos);
       hours.setValue(hora);
       minutes.setValue(minutos);
    }
    
    
    
     public void avanzar(){
       minutes.increment();
       if (minutes. getValue() == 0){
           hours.increment();
           if (hours. getValue() == 0){
               dia.increment();
               if (dia. getValue() == 1){
                   mes.increment();
                   if (mes. getValue() == 1){
                       ano.increment();
                   }
               }
           }
       }
    }
}
