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

package behavioral.templateMethod.example;

/**
 * Project: Learning_Design_Patterns_Java
 * Date: 7/10/15
 *
 * @author "Álex García (@alxgcrz) <alxgcrz@outlook.com"
 *
 * Clase abstracta que ejecuta el algoritmo. Las clases hijas redefinen los métodos
 * para ajustarse a su algoritmo
 */
public abstract class GamePlayer {

    public void play() {
        if ( moveFirst() ) {
            doBestMove();
        }

        while ( !isOver() ) {
            // Movimiento del rival
            //....

            if ( !isOver() ) {
                doBestMove();
            }
        }
    }


    abstract void doBestMove();

    abstract boolean moveFirst();

    abstract boolean isOver();
}
