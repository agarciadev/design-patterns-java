/*
 * Copyright (c) 2016 @DroidMaxMan. All rights reserved.
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

package behavioral.state.example;

/**
 * Project: Learning_Design_Patterns_Java
 * Date: 4/10/15
 *
 * @author DroidMaxMan
 *
 * Interfaz común que todos los estados deberán implementar.
 */
public abstract class CharacterState {

    /** Implementar **/
    public void walk() {}

    /** Implementar **/
    public void getUp() {}

    /** Implementar **/
    public void getDown() {}

    /** Implementar **/
    public void jump() {}

}
