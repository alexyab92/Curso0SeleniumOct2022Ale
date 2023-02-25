package com.java;

public class Arrays {

    /*
    1. Unidimensional
    2. Bidimensional
    3. Multidimensional
     */
    public static void main(String[] args){
        String[] diaSemana= {"L","M","Mi","J","V","S","D"};
        System.out.println("El dia de hoy es: " + diaSemana[3]);

        String[] diaSemana2 = new String[7];
        diaSemana2[0] = "L";
        diaSemana2[1] = "M";

        int[] num= new int[1];
        num[0]= 15;

        String[][] nombres = new String[4][4];
        nombres[0][0] = "Adilene";
        nombres[0][1] = "Alejandra";
        nombres[0][2] = "Victor";
        nombres[0][3] = "Jose";
        nombres[1][0] = "Ernesto";

        System.out.println("Mi nombre es: "+ nombres[0][1]);

        //Actividad: Crear un arreglo unidimensional de 4 posiciones
        //1 First Name
        //2 last name
        //3 Age
        //4 Email
        // Imprimir el arreglo concatenando cada uno de los valores

        String[] DatosPersonales = new String[7];
        DatosPersonales[0] = "Alejandra";
        DatosPersonales[1] = "Vallejo";
        DatosPersonales[2] = "30";
        DatosPersonales[3] = "alejandra@mail.com";

        for (int i=0; i<4; i++)
        {
            System.out.print(DatosPersonales[i] + " ");
        }

    }

}
