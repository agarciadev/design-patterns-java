/*
 * Copyright (c) 2018 @alxgcrz <alxgcrz@outlook.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package behavioral.iterator;

import behavioral.iterator.example.IteradorVector;
import behavioral.iterator.example.Vector2;


/**
 * Project: Learning_Design_Patterns_Java
 * Date: 28/09/15
 *
 * @author "Álex García (@alxgcrz) <alxgcrz@outlook.com"
 *
 *
 * Patrones de COMPORTAMIENTO
 * --------------------
 * Son los patrones de diseño software que se centran en cómo diseñar los sistemas para obtener cierta funcioanlidad y,
 * al mismo tiempo, un diseño escalable.
 *
 *
 * Pattern [Iterator] (Iterador)
 *
 * Se utiliza para ofrecer una interfaz de acceso secuencial a una determinada estructura ocultando la representación interna
 * y la forma en que realmente se accede.
 */
public class Iterator {

    public static void main( String[] args ) {
        Vector2 vector = new Vector2( 5 );

        //Creación del iterador
        IteradorVector iterador = vector.iterador();

        //Recorrido con el iterador
        while ( iterador.hasNext() )
            System.out.println( iterador.next() );
    }
}
