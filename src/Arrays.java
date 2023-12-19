public class Arrays {

    //ojito aquí: para correr cada parte, comentariar el resto, para proveer nitidez a la impresión en pantalla
    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        String days[] = new String[7];                                    //mejor uso (que el anterior) porque siempre serán los días de la semana siempre serán los mismos (a diferencia de la sversiones de una tecnología, que siempre tenderán a crecer)


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
                                                                //iniciando a contar los elementos de este array desde i = 0 con i < androidVersions.length   --> androidVersions.length iterará los: elem0, elem1,elem2 y elem3

        for (int i = 0; i < androidVersions.length; i++) {       // nombreArray.length -> cantidad de elementos del array => 17
            System.out.println(androidVersions[i]);                          

        }

/*
//        foreach (for abreviado): no se tiene control del índice, sólo permite iterar  (a diferencia del fori que itera pero también permite llevar el control del índice)
                                   en cada iteración, almacena el valor de la posición actual de la 'coleccion', dentro de la variable 'elemento'


En aquellos casos en los que quiera capturar el índice en las iteraciones del loop (además de iterar), uso FOR
en cambio, en aquellos en los que quiera SÓLO iterar, usaré FOREACH()

        for ( tipoDato elemento: coleccion ) {
            //instrucciones
        }
*/

        for (String androidVersion : androidVersions ) {
            System.out.println(androidVersion);
        }


        String[][] countries = new String[4][2];                                //representación visual plana -> matriz = tabla de filas (dimensión 1) y columnas (dimensión2) (o viceversa, depende como lo defina)
                                                                             // filas -> Country         columnas -> City
        System.out.println();                                               //2 saltos de línea
        System.out.println();

        countries[0][0] = "Finland";                                       //fijo fila y relleno columnas de esa fila. Luego itero filas (y así..)
        countries[0][1] = "Spain";
        countries[1][0] = "Scotland";
        countries[1][1] = "United Kingdom";
        countries[2][0] = "England";
        countries[2][1] = "Canada";                                        //ctrol + mayusc + flecha derecha                  avanzar por palabra hacia derecha
        countries[3][0] = "Swiss";
        countries[3][1] = "Sweden";

//        saber cantidad de elementos que le caben al countries[4][2] multiplico = 4 * 2 = 8
//        en 'idioma' matrices sería -> i * j 😋


        for (int i = 0; i < countries.length; i++) {                         //null valor por default de strings
            for (int j = 0; j < countries[i].length; j++) {                  
                System.out.println(countries[i][j]);
            }

        }

        for (String[] pair: countries ) {
            for (String name: pair) {
                System.out.println(name);
            }
        }

        int [][][] numbers = new int[2][2][2];                         //en términos prácticos, cuando voy a usar un array tridimensional, lo mejor para mí como manipuladora de esos datos es -> llevarlos a una BD
                                                                       //suelen usarse en cálculos numéricos, que es cuando suelen usarse más las matrices, en mi corta experiencia como dessarrolladora de apps
                                                                       //matrices sólo he usado hasta hoy en: álgebra en la universidad y en programación vida universitaria y profesional por decisión propia.
                                                                       // me refiero a los elementos en la 3era dimensión dentro del array tri-dimensional con nombre "localidades" "páginas"

                                                                        //ejm: sistema de ecuaciones de 3 x 3 (2 planos paralelos con un plano que las corta) (con 3 variables. Gauss-Jordan)
                                                                        //ejm: modelado 3D

        int [][][][] numbers4 = new int[2][2][2][2];                    //poco usado, posible uso en cálculos matemáticos de otra índole



        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Perro Labrador";

        for (int i = 0; i <= 1 ; i++) {                                    //modo de acceder a "Perro Labrador" con for anidado
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        System.out.println();
        System.out.println();

        System.out.println(animals[1][0][0][1]);


    }
}
