/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FileType.
 */
public enum FileType {
    /** Enum value Assembly. */
    ASSEMBLY("Assembly"),

    /** Enum value Resource. */
    RESOURCE("Resource");

    /** The actual serialized value for a FileType instance. */
    private String value;

    FileType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FileType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FileType object, or null if unable to parse.
     */
    @JsonCreator
    public static FileType fromString(String value) {
        FileType[] items = FileType.values();
        for (FileType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
