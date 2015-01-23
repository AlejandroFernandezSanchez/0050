

public class Test0050
{
    public Test0050()
    {
        
    }
    
    public int multip(int factor1, int factor2)
    {
        int result = 0;
        int cont = 0;        
               
        while (!(cont==factor2))
        {
            result += factor1;
            cont++;
        }        
        
        return result;
    }
    
    public int divi(int dividendo, int divisor)
    {
        int cociente = 0;                  
        while (dividendo>=divisor)
        {
            dividendo= dividendo - divisor;
            cociente++;
        }  
        return cociente;
    }
    
    public int modulo(int dividendo, int divisor)
    {        
        while (dividendo>=divisor)
        {
            dividendo= dividendo - divisor;
        }  
        return dividendo;
    }
    
    public int potencia(int raiz, int exp)
    {

        int result = 1;
        int expo = exp;
        
        while (expo >= 1)
        {            
            result = (multip(result, raiz));
            expo= expo -1;
        }              
              
        return result;
    }
    
    public int raizCuadrada(int raiz)
    {
        int cont=32;        
        boolean found = false;
        
        while (cont>0 && found==false)
        {
            cont= cont-1;
            if ((potencia(cont, 2)==raiz))
            {
                found=true;
            }
            
        }
        
        if(cont==0 || cont==32)
            {
                cont = -1;
            }
            
        return cont;
    }
    

}
