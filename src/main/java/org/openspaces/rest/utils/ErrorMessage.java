/*
 * Copyright 2015 GigaSpaces Technologies Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at *
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License."
 */
package org.openspaces.rest.utils;

/**
 * @author yohana
 * @since 10.1.0
 */
public class ErrorMessage {
    protected String message;

    public ErrorMessage(String message) {
        this.message = escapeJSON(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = escapeJSON(message);
    }

    protected static String escapeJSON(String str) {
        return str.replace('\n',' ').replace('\t',' ').replace('\r',' ').replace('\"','\'');
    }
}
