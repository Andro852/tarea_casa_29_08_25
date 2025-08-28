package com.mycompany.tarea_casa_29_08_25;
import java.util.Scanner;


/**
 *
 * @author Jonatan
 */
public class Tarea_casa_29_08_25 {

    public static void main(String[] args) {
        int op;
        Scanner lectura=new Scanner(System.in);
        System.out.println("++++++++++++++++++Menu inicial++++++++++++++++++++++");
        System.out.println("1. Calculadora");
        System.out.println("2. Meses del año");
        System.out.println("3. Descuento de un producto");
        System.out.println("4. Calculos de geometria");
        System.out.println("5. Salir");
        op = lectura.nextInt();
        switch (op){
            case 1:{
                System.out.println("Calculadora");
                calculadora();
                break;
            }
            case 2:{
                System.out.println("Meses del anio");
                mesesaño();
                break;
            }
            case 3:{
                System.out.println("Descuento de compra");
                descom();
                break;
            }
            case 4:{
                System.out.println("Calculos geometricos");
                calgeom();
                break;
            }
            case 5:{
                System.out.println("Salir");
                break;
            }
            default :{
                System.out.println("La opcion no existe");
            }
        }
    }
    public static void calculadora(){
        double num1, num2, res ;
        char op;
        String resp="SI";
        do{
            
        System.out.println("calculadora");
        System.out.println("Escriba S para sumar, R para restar");
        System.out.println("escriba M para multiplicar, D para dividir: ");
        Scanner lectura = new Scanner(System.in);
        op = lectura.next().toLowerCase().charAt(0);
        
        if (op=='s'){
           System.out.println("Numero 1: ");
           num1 = lectura.nextDouble();
           System.out.println("Numero 2: ");
           num2 = lectura.nextDouble();
           res=num1+num2;
           System.out.println("Resultado de la suma: "+res);
        }else if(op=='r'){
           System.out.println("Numero 1: ");
           num1 = lectura.nextDouble();
           System.out.println("Numero 2: ");
           num2 = lectura.nextDouble();
           res=num1-num2;
           System.out.println("Resultado de la resta: "+res); 
        }else if(op=='m'){
           System.out.println("Numero 1: ");
           num1 = lectura.nextDouble();
           System.out.println("Numero 2: ");
           num2 = lectura.nextDouble();
           res=num1*num2;
           System.out.println("Resultado de la multiplicacion: "+res);
        }else if(op=='d'){
           System.out.println("Numero 1: ");
           num1 = lectura.nextDouble();
           System.out.println("Numero 2: ");
           num2 = lectura.nextDouble();
           res=num1/num2;
           System.out.println("Resultado de la division: "+res);
        }else{
           System.out.println("Operacion no valida (syntax error)");  
        }
           System.out.println("¿Quiere seguir utilizando la calculadora?");
           resp=lectura.next().toUpperCase();
        }while(resp.equals("SI"));
        }
    
    public static void mesesaño(){
        int mes, año;
        String resp;
        do{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Meses del anio");
        System.out.println("Ingrese el mes en numero: ");
        mes = lectura.nextInt();
        System.out.println("Ingese el anio: ");
        año = lectura.nextInt();
        if (mes==1){
            System.out.println("Enero cuenta con 31 dias para el anio "+año);
        }else if(mes==2){
            if (año % 4 == 0){
            System.out.println("El anio es bisiesto ");
            System.out.println("Febrero cuenta con 29 dias para el anio "+año);
            }else{
            System.out.println("El anio no es bisiesto ");
            System.out.println("Febrero cuenta con 28 dias para el anio "+año);
            }
        if (mes==3){
          System.out.println("Marzo cuenta con 31 dias para el anio "+año);  
        }else if(mes==4){
            System.out.println("Abril cuenta con 30 dias para el anio "+año);
        }else if(mes==5){
            System.out.println("Mayo cuenta con 31 dias para el anio "+año);
        }else if(mes==6){
            System.out.println("Junio cuenta con 30 dias para el anio "+año);
        }else if(mes==7){
            System.out.println("Julio cuenta con 31 dias para el anio "+año);
        }else if(mes==8){
            System.out.println("Agosto cuenta con 31 dias para el anio "+año);
        }else if(mes==9){
            System.out.println("Septiembre cuenta con 30 dias para el anio "+año);
        }else if(mes==10){
            System.out.println("octubre cuenta con 31 dias para el anio "+año);
        }else if(mes==11){
            System.out.println("Noviembre cuenta con 30 dias para el anio "+año);
        }else if(mes==12){
            System.out.println("Diciembre cuenta con 31 dias para el anio "+año);
        }       
        
        }else {
            System.out.println("Mes no valido");
        }
            System.out.println("Quiere continuar con los meses del anio?");
            resp=lectura.next().toUpperCase();
        }while (resp.equals("SI"));
        
        }
    public static void descom(){
        double com, des, tot ;
        String resp;
        do{
        System.out.println("Descuento en la compra");
        System.out.println("Igrese monto de la compra: ");
        Scanner lectura = new Scanner(System.in);
        com = lectura.nextDouble();
        
        if (com<500){
            System.out.println("No hay descuento");
          
        }else if(com>=500&com<=1000){ 
         des=com*0.05;
         tot=com-des;
         System.out.println("Se aplico un descuento del 5% total: "+tot);
        }else if(com>1001&com<=7000){
         des=com*0.11;
         tot=com-des;
         System.out.println("Se aplico un descuento del 11% total: "+tot); 
        }else if(com>7001&com<=15000){
         des=com*0.18;
         tot=com-des;
         System.out.println("Se aplico un descuento del 18% total: "+tot); 
        }else if(com>15000){
         des=com*0.25;
         tot=com-des;
         System.out.println("Se aplico un descuento del 25% total: "+tot);    
        }
        
        System.out.println("Quiere continuar con los descuentos en las compras?");
        resp=lectura.next().toUpperCase();
        }while (resp.equals("SI")); 
    }
    public static void calgeom(){
        double num1, num2, p, a;
        String op, resp;
        do{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Calculos geometricos");
        System.out.println("Las figuras permitidas son: Cuadrado, rectangulo y triangulo");
        System.out.println("Escriba la figura que desee: ");
        op = lectura.next().trim();
        if (op.equalsIgnoreCase("Cuadrado")){
            System.out.println("Cuadrado");
            System.out.println("Calculos a realizar perimeto y area");
            System.out.println("Ingrese un lado: ");
            num1 = lectura.nextDouble();
            p=4*num1;
            a=num1*num1;
            System.out.println("El perimetro es: "+p);
            System.out.println("El area es: "+a);   
        }else if(op.equalsIgnoreCase("Rectangulo")){
            System.out.println("Rectangulo");
            System.out.println("Calculos a realizar perimeto y area");
            System.out.println("Ingrese altura: ");
            num1 = lectura.nextDouble();
            System.out.println("Ingrese base: ");
            num2 = lectura.nextDouble();
            p=2*(num1+num2);
            a=num1*num2;
            System.out.println("El perimetro es: "+p);
            System.out.println("El area es: "+a); 
        }else if(op.equalsIgnoreCase("Triagulo")){
            System.out.println("Triagulo");
            System.out.println("Calculos a realizar area");
            System.out.println("Ingrese altura: ");
            num1 = lectura.nextDouble();
            System.out.println("Ingrese base: ");
            num2 = lectura.nextDouble();
            a=(num1*num2)/2;
            System.out.println("El area es: "+a); 
        }else {
            System.out.println("Figura no valida. Use: cuadrado, rectangulo o triangulo.");
        }
        System.out.println("Quiere continuar con los calculos geometricos?");
        resp=lectura.next().toUpperCase();
        }while (resp.equals("SI")); 
    
    }
    
}


   