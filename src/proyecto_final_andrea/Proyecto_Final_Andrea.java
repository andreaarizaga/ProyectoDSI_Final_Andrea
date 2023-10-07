/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_andrea;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Proyecto_Final_Andrea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        char ejercicio;

        Scanner teclado = new Scanner(System.in);
        do {
            menuprincipal();

            System.out.println("Introduzca una opción");
            ejercicio = teclado.next().charAt(0);
            System.out.println("");

            if (ejercicio == 'a') {
                do {
                    System.out.println("✦ ✦ ✦ Ejemplos secuenciales ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. Declaracion");
                    System.out.println("2. Área Terrenos");
                    System.out.println("3. Suma de dos números");
                    System.out.println("4. Egg basket");
                    System.out.println("5. Change Maker");
                    System.out.println("6. ❖ Regresar al menú principal");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: Declaración");

                            declaracion();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: Area Terrenos");
                            System.out.println("");

                            areaterreno();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: Suma de dos números");
                            System.out.println("");

                            suma();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: Eggbasket ");
                            System.out.println("");

                            eggbasket();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: Change Maker");
                            System.out.println("");

                            changemaker();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);

            }

            if (ejercicio == 'b') {
                do {
                    System.out.println("✦ ✦ ✦ if - else / switch case ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. Reto: if vocales");
                    System.out.println("2. Reto ISI");
                    System.out.println("3. Reto triangulo");
                    System.out.println("4. Reto switch");
                    System.out.println("5. Estaciones del año");
                    System.out.println("6. ❖ Regresar al menú principal");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: Reto: if vocales");

                            ifvocales();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: Reto ISI");
                            System.out.println("");

                            retoisi();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: Reto Triángulo");
                            System.out.println("");

                            retotriangulo();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: Reto Switch");
                            System.out.println("");

                            retoswitch();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: Estaciones del año");
                            System.out.println("");

                            estacionesaño();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);
            }

            if (ejercicio == 'c') {
                do {
                    System.out.println("✦ ✦ ✦ ciclo while ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. While abono");
                    System.out.println("2. While calorias");
                    System.out.println("3. While contador scanner");
                    System.out.println("4. Contador descendiente while");
                    System.out.println("5. Palindromo while");
                    System.out.println("6. ❖ Regresar al menú principal");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: while abono");

                            whileabono();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: While calorias");
                            System.out.println("");

                            whilecalorias();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: While contador scanner");
                            System.out.println("");

                            whilecontadorscanner();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: Contador descendiente");
                            System.out.println("");

                            descendientewhile();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: Palindromo while");
                            System.out.println("");

                            palindromowhile();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);

            }

            if (ejercicio == 'd') {
                do {
                    System.out.println("✦ ✦ ✦ ciclo do-while ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. Do-while abono");
                    System.out.println("2. Saludo do-while");
                    System.out.println("3. Calificación do-while");
                    System.out.println("4. Palindromo do-while");
                    System.out.println("5. Solucion do-while - average");
                    System.out.println("6. ❖ Regresar al menú principal");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: Do-while abono");

                            dowhileabono();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: Saludo do-while");
                            System.out.println("");

                            saludodowhile();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: Calificación do-while");
                            System.out.println("");

                            dowhilecalif();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: Palindromo do-while");
                            System.out.println("");

                            dowhilepalindromo();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: Solucion do-while - average");
                            System.out.println("");

                            dowhileaverage();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);
            }

            if (ejercicio == 'e') {
                do {
                    System.out.println("✦ ✦ ✦ ciclo for ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. Abono for");
                    System.out.println("2. For 2: (listado de numeros al 100)");
                    System.out.println("3. For 3: (tablas de multiplicar)");
                    System.out.println("4. For tarea: ventas");
                    System.out.println("5. For: número aleatorio");
                    System.out.println("6. ❖ Regresar al menú principal");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: Abono for");

                            abonofor();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: For 2 (listado de numeros al 100)");
                            System.out.println("");

                            for2();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: For 3 (tablas de multiplicar)");
                            System.out.println("");

                            for3();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: For tarea: ventas");
                            System.out.println("");

                            fortarea();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: For: número aleatorio");
                            System.out.println("");

                            aleatoriofor();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);
            }

            if (ejercicio == 'f') {
                do {
                    System.out.println(" ✦ ✦ ✦ arreglos ✦ ✦ ✦");
                    System.out.println("");
                    System.out.println("1. Arreglo de Materias");
                    System.out.println("2. Arreglo de Temperaturas");
                    System.out.println("3. Arreglo de número mayor");
                    System.out.println("4. Arreglo promedio");
                    System.out.println("5. Arreglo: Estacionamiento");
                    System.out.println("6. ❖ Regresar al menú principal ");
                    System.out.println("");
                    System.out.println("Ingrese el número de ejercicio.");
                    opcion = teclado.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 1: Arreglo de Materias");

                            arraymaterias();

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 2: Arreglo de Temperaturas");
                            System.out.println("");

                            arraytemp();

                            System.out.println("");

                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 3: Arreglo de número mayor");
                            System.out.println("");

                            arraynummayor();

                            System.out.println("");

                            break;

                        case 4:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 4: Arreglo promedio");
                            System.out.println("");

                            arrayprom();

                            System.out.println("");

                            break;

                        case 5:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 5: Arreglo: Estacionamiento");
                            System.out.println("");

                            arrayest();

                            System.out.println("");

                            break;

                        case 6:

                            System.out.println("");
                            System.out.println("✧ USTED HA ELEGIDO LA OPCIÓN 6: Regresar al menú principal");
                            System.out.println("");

                            System.out.println("");

                            break;
                    }
                } while (opcion != 6);
            }
            
            if (ejercicio == 'g') {
            
                System.out.println("┏━━━━━━━━━━━━━┓");
                System.out.println("  ♡∙ Adiós y gracias. ∙♡");
            System.out.println("┗━━━━━━━━━━━━━┛");
                
            }

        } while (ejercicio != 'g');

    }

    public static void menuprincipal() {

        System.out.println("");
        System.out.println("   ¡¡PROYECTO FINAL!! :D");
        System.out.println("");
        System.out.println("═════ ❀∘❀∘❀∘═════");
        System.out.println("     ❝ MENÚ PRINCIPAL ❞");
        System.out.println("═════ ❀∘❀∘❀∘═════");
        System.out.println("a) ejemplos secuenciales");
        System.out.println("b) if - else / switch case");
        System.out.println("c) ciclo while");
        System.out.println("d) ciclo do - while");
        System.out.println("e) ciclo for");
        System.out.println("f) arreglos");
        System.out.println("g) SALIR DEL MENÚ ❖");
        System.out.println("");

    }

    public static void declaracion() {
        int x, y1, y2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("A continuación, asigne tres valores enteros");

        x = teclado.nextInt();
        y1 = teclado.nextInt();
        y2 = teclado.nextInt();

        System.out.println("");
        System.out.println("Este ejercicio es sobre declaración de variables. :D");
        System.out.println("");
        System.out.println(x + "," + y1 + "," + y2);

    }

    public static void areaterreno() {

        System.out.println("");

        double h, b, c, area, areatriangulo, arearectangulo;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca el valor de la altura (h):");

        h = keyboard.nextDouble();

        System.out.println("Introduzca el valor de la base (b):");

        b = keyboard.nextDouble();

        c = Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2));

        areatriangulo = (b * (h - c) / 2);

        arearectangulo = (b * h);

        area = (areatriangulo + arearectangulo);

        System.out.println("El area es:" + area);
    }

    public static void suma() {
        System.out.println("Suma");
        int n1, n2;
        n1 = 45;
        n2 = 67;
        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
    }

    public static void eggbasket() {

        System.out.println("");

        int numberOfBaskets, eggsPerBasket, totalEggs;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of eggs in each basket:");
        eggsPerBasket = keyboard.nextInt();

        System.out.println("Enter the number of baskets:");
        numberOfBaskets = keyboard.nextInt();

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");

        System.out.println("the total number of eggs is " + totalEggs);
        System.out.println("Now we take two eggs out of each basket.");

        eggsPerBasket = eggsPerBasket - 2;

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("You now have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets.");
        System.out.println("The new total number of eggs is " + totalEggs);

    }

    public static void changemaker() {

        System.out.println("");

        int cantidad, cantidad_inicial,
                quinientos, doscientos, cien, cincuenta, veinte, diez, cinco, dos, peso;

        System.out.println("Enter a whole number from 1 to 1,000,000.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");

        Scanner keyboard = new Scanner(System.in);
        //
        cantidad = keyboard.nextInt();
        //probemos con 58

        cantidad_inicial = cantidad;

        quinientos = cantidad / 500;
        cantidad = cantidad % 500;

        doscientos = cantidad / 200;
        cantidad = cantidad % 200;

        cien = cantidad / 100;
        cantidad = cantidad % 100;

        cincuenta = cantidad / 50;
        cantidad = cantidad % 50;

        veinte = cantidad / 20;
        cantidad = cantidad % 20;

        //diez= 58/10 = 5 por que es una variable entera.
        diez = cantidad / 10;

        //cantidad= cantidad - (diez * 10)
        //cantidad= 58 - (5 * 10)= 8
        cantidad = cantidad % 10;

        //cinco= 8/5= 1
        cinco = cantidad / 5;
        //cantidad= 8 - (1 * 5)=3
        cantidad = cantidad % 5;

        //dos= 3/2= 1
        dos = cantidad / 2;
        //cantidad= 3 - (1 * 2)
        cantidad = cantidad % 2;

        peso = cantidad;

        System.out.println(cantidad_inicial
                + " distribuidos de la siguiente manera: ");

        System.out.println(quinientos + " quinientos");
        System.out.println(doscientos + " doscientos");
        System.out.println(cien + " cien");
        System.out.println(cincuenta + " cincuenta");
        System.out.println(veinte + " veinte");
        System.out.println(diez + " diez");
        System.out.println(cinco + " cinco");
        System.out.println(dos + " dos y");
        System.out.println(peso + " peso");

    }

    public static void ifvocales() {

        char generado = (char) (Math.random() * 26);
        generado += 64;
        char car = generado;

        if (car == 'A') {
            System.out.println(car + " Es una vocal");

        } else if (car == 'E') {
            System.out.println(car + " Es una vocal");
        } else if (car == 'I') {
            System.out.println(car + " Es una vocal");
        } else if (car == 'O') {
            System.out.println(car + " Es una vocal");
        } else if (car == 'U') {
            System.out.println(car + " Es una vocal");
        } else {
            System.out.println(car + " No es una vocal.");

        }

    }

    public static void retoisi() {

        int numgenerado1 = (int) (Math.random() * 10);
        int numgenerado2 = (int) (Math.random() * 10);
        int result, aux;

        if (numgenerado2 > numgenerado1) {

            aux = numgenerado1;

            numgenerado1 = numgenerado2;

            numgenerado2 = aux;

        }

        System.out.println("¿Cuánto es " + numgenerado1 + " - " + numgenerado2 + "?");

        result = numgenerado1 - numgenerado2;

        Scanner teclado = new Scanner(System.in);

        aux = teclado.nextInt();

        if (aux == result) {

            System.out.println("Correcto");

        } else {

            System.out.println("Incorrecto");
            System.out.println("La respuesta correcta es " + result);

        }

    }

    public static void retotriangulo() {

        int lado1 = (int) (Math.random() * 10);
        int lado2 = (int) (Math.random() * 10);
        int lado3 = (int) (Math.random() * 10);

        if ((lado1 == lado2) && (lado2 == lado3)) {
            System.out.println("es un equilatero");
            System.out.println("Valores generados random:" + lado1 + "," + lado2 + "," + lado3);
        }

        if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
            System.out.println("es un escaleno");
            System.out.println("Valores generados random:" + lado1 + "," + lado2 + "," + lado3);
        }

        if ((lado1 == lado2) && (lado2 != lado3) || (lado2 == lado3) && (lado3 != lado1) || (lado3 == lado1) && (lado1 != lado2)) {
            System.out.println("es un isosceles");
            System.out.println("Valores generados random:" + lado1 + "," + lado2 + "," + lado3);
        }

    }

    public static void retoswitch() {

        double dato1, dato2, dato3, perimetro, areatri, decision, areacuad;
        double r, s, areacirc;

        System.out.println("---------------- Menú ---------------- ");
        System.out.println("  1. Calcular el área de un cuadrado");
        System.out.println("  2. Calcular el área de un triangulo");
        System.out.println("  3. Calcular el área de un círculo");

        System.out.println("Eliga la opción:");

        Scanner keyboard = new Scanner(System.in);

        decision = keyboard.nextInt();

        if (decision == 1) {

            System.out.println("Ha seleccionado calcular el área de un cuadrado");

            System.out.println("Ingrese la base:");
            dato1 = keyboard.nextInt();
            System.out.println("Ingrese la altura:");
            dato2 = keyboard.nextInt();

            areacuad = dato1 * dato2;

            System.out.println("El area del cuadrado es: " + areacuad);

        }

        if (decision == 2) {

            System.out.println("Ha seleccionado calcular el área de un triangulo");

            System.out.println("Ingrese lado 1:");
            dato1 = keyboard.nextDouble();
            System.out.println("Ingrese lado 2:");
            dato2 = keyboard.nextDouble();
            System.out.println("Ingrese lado 3:");
            dato3 = keyboard.nextDouble();

            perimetro = (dato1 + dato2 + dato3);
            s = perimetro / 2;

            areatri = (double) (Math.sqrt(s * (s - dato1) * (s - dato2) * (s - dato3)));

            System.out.println("El area del triangulo es: " + areatri);

        }

        if (decision == 3) {

            System.out.println("Ha seleccionado calcular el área de un círculo");

            System.out.println("Ingrese el radio:");
            r = keyboard.nextInt();

            areacirc = (double) (Math.PI * Math.pow(r, 2));

            System.out.println("El area del círculo es: " + areacirc);

        }

    }

    public static void estacionesaño() {

        int nmes;

        System.out.println("Escriba el numero del mes:");
        Scanner keyboard = new Scanner(System.in);

        nmes = keyboard.nextInt();

        if (nmes == 1) {
            System.out.println("La estación es: Invierno.");
        } else if (nmes == 2) {
            System.out.println("La estación es: Invierno.");
        } else if (nmes == 3) {
            System.out.println("La estación es: Primavera.");
        } else if (nmes == 4) {
            System.out.println("La estación es: Primavera.");
        } else if (nmes == 5) {
            System.out.println("La estación es: Primavera.");
        } else if (nmes == 6) {
            System.out.println("La estación es: Verano.");
        } else if (nmes == 7) {
            System.out.println("La estación es: Verano.");
        } else if (nmes == 8) {
            System.out.println("La estación es: Verano.");
        } else if (nmes == 9) {
            System.out.println("La estación es: Otoño.");
        } else if (nmes == 10) {
            System.out.println("La estación es: Otoño.");
        } else if (nmes == 11) {
            System.out.println("La estación es: Otoño.");
        } else if (nmes == 12) {
            System.out.println("La estación es: Invierno.");
        } else {
            System.out.println("ERROR: mes inexistente, favor de poner del 1 al 12.");

        }

    }

//CICLO WHILE
    public static void whileabono() {

        int precio, totalad, pago = 1, abono;
        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Ingresa el precio del producto --");
        System.out.println("");
        precio = teclado.nextInt();
        abono = precio / 4;

        System.out.println("");
        System.out.println("-- USTED SOLAMENTE PUEDE PAGAR EN CUATRO ABONOS DE " + abono + " --");
        System.out.println("");
        System.out.println("-------------------------");

        totalad = precio - abono;

        while (pago <= 4) {

            System.out.println("");
            System.out.println("Pago numero " + pago);
            System.out.println("Usted abonó " + abono);
            System.out.println("Usted debe: " + totalad);
            System.out.println("");

            totalad = totalad - abono;

            System.out.println("GRACIAS :D");

            System.out.println("-------------------------");

            pago++;

        }

    }

    public static void whilecalorias() {

        int num_de_elementos, cuenta, calorias_por_alimento, calorias_total;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos alimentos ha comido hoy? ");
        num_de_elementos = teclado.nextInt();
        System.out.println("Introducir el número de calorías de" + " cada uno de los " + num_de_elementos + " alimentos tomados:");
        calorias_total = 0;
        cuenta = 1;
        while (cuenta++ <= num_de_elementos) {
            calorias_por_alimento = teclado.nextInt();
            calorias_total += calorias_por_alimento;
        }

        System.out.println("Las calorías totales consumidas hoy son = " + calorias_total);

    }

    public static void whilecontadorscanner() {

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el numero del contador ");
        numero = teclado.nextInt();
        int contador = 0; // inicializa la condición
        while (contador < numero) // condición de prueba
        {
            contador++; // cuerpo del ciclo 
            System.out.println("contador: " + contador);
        }
        System.out.println("Terminado.Contador: " + contador);

    }

    public static void descendientewhile() {

        int contador = 5;
        int vueltas = 0;

        while (contador > 0) {

            System.out.println("Contador " + contador);
            contador--;
            vueltas++;
        }

        System.out.println("Terminado. Contador: " + vueltas);

    }

    public static void palindromowhile() {

        String palabra, volteado = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        palabra = teclado.nextLine();

        int ancho = palabra.length();

        int i = ancho - 1;

        while (i >= 0) {
            volteado = volteado + palabra.charAt(i);
            i--;
        }

        if (palabra.equals(volteado)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es un palindromo");
        }

    }
//DO WHILE ABONO

    public static void dowhileabono() {

        int precio, totalad, pago = 1, abono;
        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Ingresa el precio del producto --");
        System.out.println("");
        precio = teclado.nextInt();
        abono = precio / 4;

        System.out.println("");
        System.out.println("-- USTED SOLAMENTE PUEDE PAGAR EN CUATRO ABONOS DE " + abono + " --");
        System.out.println("");
        System.out.println("-------------------------");

        totalad = precio - abono;

        do {

            System.out.println("");
            System.out.println("Pago numero " + pago);
            System.out.println("Usted abonó " + abono);
            System.out.println("Usted debe: " + totalad);
            System.out.println("");

            totalad = totalad - abono;

            System.out.println("GRACIAS :D");

            System.out.println("-------------------------");

            pago++;

        } while (pago <= 4);

    }

    public static void saludodowhile() {

        char opcion;

        do {

            System.out.println("Hola");
            System.out.println("¿Desea otro tipo de saludo?");
            System.out.println("Pulse s para si y n para no");
            System.out.println("y a continuación pulse enter:");

            Scanner teclado = new Scanner(System.in);
            opcion = teclado.next().charAt(0);

        } while (opcion == 's' || opcion == 'S');
        System.out.println("Adiós");

    }

    public static void dowhilecalif() {

        System.out.println("Ingrese las calificaciones de todos los alumnos:");
        System.out.println("Para terminar, después de haber ingresado todas");
        System.out.println("Las calificaciones, capture un número negativo");

        Scanner teclado = new Scanner(System.in);
        double max = teclado.nextDouble();

        double min = max;

        double next = teclado.nextDouble();

        while (next >= 0) {

            if (next > max) {

                max = next;
            } else if (next < min) {

                min = next;
            }

            next = teclado.nextDouble();

        }

        System.out.println("La calificación más alta es: " + max);
        System.out.println("La calificación más baja es: " + min);

    }

    public static void dowhilepalindromo() {

        String palabra, volteado = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        palabra = teclado.nextLine();

        int ancho = palabra.length();

        int i = ancho - 1;

        do {
            volteado = volteado + palabra.charAt(i);
            i--;
        } while (i >= 0);

        if (palabra.equals(volteado)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es un palindromo");
        }

    }

    public static void dowhileaverage() {

        char decision;

        do {
            int c = 0;
            float average, califs = 0, calif = 0;

            System.out.println("");
            System.out.println("    ━━━━━━ ◦ ❖ ◦ ━━━━━━ ◦ ❖ ◦ ━━━━━━ ◦ ❖ ◦ ━━━━━━");
            System.out.println("  ━              ENTER ALL THE SCORES TO BE AVERAGED                   ━");
            System.out.println("  ━    ENTER A NEGATIVE NUMBER AFTER YOU HAVE ENTERED ALL THE SCORES   ━");
            System.out.println("    ━━━━━━ ◦ ❖ ◦ ━━━━━━ ◦ ❖ ◦ ━━━━━━ ◦ ❖ ◦ ━━━━━━");
            System.out.println("");

            Scanner teclado = new Scanner(System.in);

            while (calif >= 0) {

                calif = teclado.nextFloat();

                if (calif >= 0) {

                    califs = califs + calif;
                    c++;

                }

            }

            average = (califs / c);
            System.out.println(" ");
            System.out.println("❖ THE AVERAGE IS: " + average);
            System.out.println(" ");
            System.out.println("WANT TO AVERAGE ANOTHER EXAM? (*¯︶¯*)");
            System.out.println("◦ ENTER Y = YES OR N = NO");

            Scanner keyboard = new Scanner(System.in);
            decision = keyboard.next().charAt(0);

            if (decision == 'N' || decision == 'n') {

                System.out.println("");
                System.out.println("GOODBYE!! :)");
            }

        } while (decision == 'Y' || decision == 'y');

    }

    //  CICLO FOR
    public static void abonofor() {

        int precio, totalad, pago, abono;
        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Ingresa el precio del producto --");
        System.out.println("");
        precio = teclado.nextInt();
        abono = precio / 4;

        System.out.println("");
        System.out.println("-- USTED SOLAMENTE PUEDE PAGAR EN CUATRO ABONOS DE " + abono + " --");
        System.out.println("");
        System.out.println("-------------------------");

        totalad = precio - abono;

        for (pago = 1; pago <= 4; pago++) {

            System.out.println("");
            System.out.println("Pago numero " + pago);
            System.out.println("Usted abonó " + abono);
            System.out.println("Usted debe: " + totalad);
            System.out.println("");
            System.out.println("GRACIAS :D");
            System.out.println("");
            System.out.println("-------------------------");
            totalad = totalad - abono;

        }

    }

    public static void for2() {

        for (int i = 0; i <= 100; i = i + 1) {

            System.out.println("El número es: " + i);

        }

    }

    public static void for3() {

        Scanner input = new Scanner(System.in);
        System.out.println("Valor de la tabla de multiplicar");
        int tabla = input.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(tabla + " * " + i + " = " + (tabla * i));
        }

    }

    public static void fortarea() {

        int costo_producto = 0, ventatotal = 0, numventa = 0;
        Scanner teclado = new Scanner(System.in);

        for (numventa = 0; numventa <= 4; numventa++) {

            System.out.println("Ingresa monto de la venta ");
            costo_producto = teclado.nextInt();
            ventatotal = ventatotal + costo_producto;
        }

        System.out.println("La venta total es de " + ventatotal);
        System.out.println("Total de ventas realizadas es de " + numventa);

    }

    public static void aleatoriofor() {

        int numero, i;
        int numgenerado = (int) (Math.random() * 100);

        System.out.println("ADIVINA EL NÚMERO ALEATORIO  (ENTRE 0 Y 100)");
        System.out.println("-- Ingresa un numero: --");

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i <= numgenerado; i++) {
            numero = teclado.nextInt();

            if (numero == numgenerado) {
                System.out.println("CORRECTO, ESE ES EL NÚMERO :D");
                break;

            } else if (numero < numgenerado) {

                System.out.println("Ingrese uno mayor");

            } else {

                System.out.println("Ingrese uno menor");
            }

        }

    }

    //ARREGLOS
    public static void arraymaterias() {

        String[] materia = new String[3];
        double[] calif = new double[3];
        int index;

        Scanner keyboard = new Scanner(System.in);

        for (index = 0; index < 3; index++) {
            System.out.println("");
            System.out.println("Ingrese el nombre de la materia: ");
            materia[index] = keyboard.next();

            System.out.println("Ingrese la calificación: ");
            calif[index] = keyboard.nextDouble();

        }
        System.out.println("");
        System.out.println("K A R D E X ");

        for (index = 0; index < 3; index++) {

            System.out.println(materia[index] + " " + calif[index]);

        }

    }

    public static void arraytemp() {

        double[] temperature = new double[7];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 7 temperatures: ");
        double sum = 0;

        for (int index = 0; index < 7; index++) {

            temperature[index] = keyboard.nextDouble();
            sum = sum + temperature[index];
        }
        double average = sum / 7;
        System.out.println("The average temperature is " + average);
        //Display each temperature and its relation to the average:
        System.out.println("The temperatures are: ");
        for (int index = 0; index < 7; index++) {

            if (temperature[index] < average) {
                System.out.println(temperature[index] + " below average");
            } else if (temperature[index] > average) {
                System.out.println(temperature[index] + " above average");
            } else //temperature[index] == average
            {
                System.out.println(temperature[index] + " the average");
            }

        }

        System.out.println("Have a nice week. :)");

    }

    public static void arraynummayor() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa 5 valores");
        int[] array = new int[5];
        int mayor;
        int menor;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un valor");
            array[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Los valores son:" + array[i]);
        }
        mayor = array[0];
        for (int i = 0; i < 5; i++) {
            if (mayor < array[i]) {
                mayor = array[i];
            } else {

            }

        }
        menor = array[0];
        for (int i = 0; i < 5; i++) {
            if (menor > array[i]) {
                menor = array[i];
            } else {

            }
        }
        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor menor es: " + menor);
    }

    public static void arrayprom() {

        String nombre;
        double[] prod = new double[6];

        double totalp = 0, promps = 0, mjp = 0;

        Scanner keyboard = new Scanner(System.in);

        int index, cdp = 0;

        System.out.println("Ingrese nombre del obrero: ");
        nombre = keyboard.next();

        for (index = 1; index < 6; index++) {
            System.out.println("");
            System.out.println("Ingresa tu producción, día " + index);
            prod[index] = keyboard.nextDouble();
            totalp = totalp + prod[index];

            if (mjp < prod[index]) {

                mjp = prod[index];

            }
        }

        promps = totalp / 5;

        System.out.println("");
        System.out.println("Nombre del obrero: " + nombre);

        System.out.println("Lista de producciones: ");
        for (index = 1; index < 6; index++) {

            System.out.println(prod[index]);

        }

        for (index = 0; index < 6; index++) {

            if (prod[index] > promps) {
                cdp++;
            }

        }

        System.out.println("");
        System.out.println("El total producido en las semana es: " + totalp);
        System.out.println("");
        System.out.println("El promedio de la producción semanal es: " + promps);
        System.out.println("");
        System.out.println("La mejor producción es: " + mjp);
        System.out.println("");
        System.out.println("Cantidad de producción arriba del promedio: " + cdp);

    }

    public static void arrayest() {

        int i = 0, c = 0;
        double[] pag = new double[100];
        double[] mnts = new double[100];
        int[] cliente = new int[100];
        char decision;
        double pago = 0;

        do {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("dime el numero de cliente (0...9): ");
            cliente[i] = keyboard.nextInt();

            if ((cliente[i] >= 0) && (cliente[i] <= 10)) {

                System.out.println("cuanto s minutos uso el estacionamiento: ");
                mnts[i] = keyboard.nextInt();
                System.out.println("El total a pagar es: " + Total((int) i, pago, mnts, pag));

                pago = pago + pag[i];
                c++;
                i++;

            } else {

                System.out.println("¡¡NUMERO INCORRECTO!!");

            }

            System.out.println("¿Desea capturar otro uso de estacionamiento? s = sí | n = no ");
            decision = keyboard.next().charAt(0);

        } while (decision == 's');

        System.out.println("Cliente\tMinutos\tTotal a pagar");
        System.out.println("No.");

        for (i = 0; i < c; i++) {

            System.out.println(cliente[i] + " \t " + mnts[i] + " \t " + pag[i]);

        }

    }

    public static double Total(int i, double costoT, double minT[], double cosT[]) {

        if (minT[i] < 181) {

            cosT[i] = 2;

        } else {

            double rest;
            rest = (minT[i] - 180) / 60;

            cosT[i] = Math.ceil(rest) * 0.5 + 2;

            if (cosT[i] > 10) {

                cosT[i] = 10;

            }

        }

        return (cosT[i]);

    }
}
