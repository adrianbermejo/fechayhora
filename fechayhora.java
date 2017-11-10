
/**
 * Write a description of class fechayhora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fechayhora
{
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
   
    
    public fechayhora()
    {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(2099);
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        }
         /**
    *metodo para obtener la fecha
    */
    public String getFechaYHoraa()
    {
      
        return  dia.getTextoDelDisplay()+ "-"+ mes.getTextoDelDisplay()+ "-" 
        + ano.getTextoDelDisplay()+ "-" + hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
   
}
