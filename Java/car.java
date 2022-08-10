

public class car
{
    String m_color;
    int m_mileage;
    float m_fuel;
    boolean m_lowPressure;
    int m_MPG;
    
    // Constructor (default)
    public car(String color,
    int mileage,
    float fuel,
    boolean lowPressure,
    int MPG)
    
    {
        m_color = color;
        m_mileage = mileage;
        m_fuel = fuel;
        m_lowPressure = lowPressure;
        m_MPG = MPG;
    
    }
    public void drive(int velocity, int distance)
    {
        m_mileage = m_mileage + distance;
        System.out.println("Driving");
    }
}
