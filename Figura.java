public class Figura
{
    protected float area; //nivel de acceso intermedio
    
    public Figura()
    {
        area = 0;
    }
    
    public void calcularArea()
    {
        System.out.println("No sé cómo calcular el área...");
    }
    
    public void imprimirArea()
    {
        System.out.println("El valor del área es " + area);
    }
}