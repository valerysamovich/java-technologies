/**
 * @file HashMapForEach.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/20
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Valery Samovich
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.samovich.technologies.basics.collections.interfaces.map;

import java.util.HashMap;

public class HashMapForEach {

    public static void main(String[] args) {

        // initialize hashmap for cloud services.
        HashMap<String, Integer> cloudFreeStorage = new HashMap<String, Integer>();

        // add cloud services
        cloudFreeStorage.put("OneDrive", 5);
        cloudFreeStorage.put("DropBox", 2);
        cloudFreeStorage.put("OneDrive", 15);
        cloudFreeStorage.put("Box", 10);
        cloudFreeStorage.put("Amazon Cloud Drive", 0);

        // print the size of the hashmap
        System.out.println("Size of the HashMap: " + cloudFreeStorage.size());

        // loop over keys and values
        for(String cloud : cloudFreeStorage.keySet()){
            System.out.println("A " + cloud + " give a " + cloudFreeStorage
                    .get(cloud) + "GB of free storage.");
        }
    }
}
