package org.aurea.slbp.verify;

import java.util.Collections;

class ExampleUser extends BaseCode {

    void methodOne() {
        String sampleValue = "SAMPLE";
        String otherValue = "SAMPLE";
        ExampleCollection<ExampleValue> myCollection = new ExampleCollection<ExampleValue>(Collections.emptyList());
        if (myCollection.isEmpty()) {
            if (myCollection.getSize().compareTo(15) < new Long(VALUE_ONE)) {
                System.out.println("VALUE");
            }
            if (myCollection.contains(sampleValue).someCheck() && someCheck(otherValue)) {
                System.out.println("HAS_VALUE");
            }
        }
    }

}
