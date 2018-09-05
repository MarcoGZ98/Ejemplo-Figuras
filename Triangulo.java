public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura =unaAltura;
    }
    
    public void calcularArea()
    {
        area = base * altura / 2;
    }
}