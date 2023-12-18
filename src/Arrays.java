public class Arrays {
    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        String days[] = new String[7];                                    //mejor uso porque siempre serán los mismos

        String[][] cities = new String[4][2];                                //representación visual plana -> matriz = tabla de filas (dimensión 1) y columnas (dimensión2) (o viceversa, depende como lo defina)
                                                                             // filas -> Country         columnas -> City

//        saber cantidad de elementos que le caben al cities[4][2] multiplico = 4 * 2 = 8
//        en 'idioma' matrices sería -> i * j 😋

        int [][][] numbers = new int[2][2][2];                         //en términos prácticos, cuando voy a usar un array tridimensional, lo mejor para mí como manipuladora de esos datos es -> llevarlos a una BD
                                                                   //suelen usarse en cálculos numéricos, que es cuando suelen usarse más las matrices, en mi corta experiencia como dessarrolladora de apps
                                                                   //matrices sólo he usado hasta hoy en: álgebra en la universidad y en programación vida universitaria y profesional por decisión propia.
                                                                    // me refiero a los elementos en la 3era dimensión dentro del array tri-dimensional con nombre "localidades" "páginas"

        int [][][][] numbers4 = new int[2][2][2][2];                     //poco usado, posible uso en cálculos matemáticos de otra índole




    }
}
