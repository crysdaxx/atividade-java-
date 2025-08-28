package dimensao.bidimensional;

public  class TrianguloRetangulo {
    
    Double cateto1;
    Double cateto2;
    Double hipotenusa;
    double alturahipotenusa;
    
    
    double CalculoArea(){
        double area;
        area = (cateto1 + cateto2) / 2;
        return area;
    }
    double CalculoPerimetro(){
        double perimetro; 
        perimetro = cateto1 + cateto2 + hipotenusa;
        return perimetro;
    }
      TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturahipotenusa){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturahipotenusa = alturahipotenusa;
    }
}
