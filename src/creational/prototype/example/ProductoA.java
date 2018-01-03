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

package creational.prototype.example;

/**
 * Project: Learning_Design_Patterns_Java
 * Date: 20/09/15
 *
 * @author "Álex García (@alxgcrz) <alxgcrz@outlook.com"
 *
 * Prototipo que será clonado
 */
public class ProductoA implements Producto {

    // Name
    private String name = "ProductoA";


    /**
     * Clone productA
     *
     * @return Object
     */
    @Override
    public Object clone() {
        return new ProductoA();
    }


    @Override
    public String toString() {
        return name;
    }
}
