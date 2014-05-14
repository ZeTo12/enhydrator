package com.airhacks.enhydrator.in;

/*
 * #%L
 * enhydrator
 * %%
 * Copyright (C) 2014 Adam Bien
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class ColumnTest {

    @Test
    public void convertToString() {
        Column column = new Column(0, "name", 42);
        assertTrue(column.getValue() instanceof Integer);
        column.convertToString();
        assertTrue(column.getValue() instanceof String);
    }

    @Test
    public void convertToInteger() {
        Column column = new Column(0, "name", "42");
        column.convertToInteger();
        assertTrue(column.getValue() instanceof Integer);
    }

    @Test
    public void convertToDouble() {
        Column column = new Column(0, "name", "42.0");
        column.convertToDouble();
        assertTrue(column.getValue() instanceof Double);
    }
}
