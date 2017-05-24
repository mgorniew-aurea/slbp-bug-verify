package org.aurea.slbp.verify;

import java.util.Collections;

class ExampleCode extends BaseCode {

    void methodTwo() {
        String sampleValue = "SAMPLE_TWO";
        String otherValue = "SAMPLE_TWO";
        ExampleCollection<ExampleValue> myCollection = new ExampleCollection<ExampleValue>(Collections.emptyList());
        if (myCollection.isEmpty()) {
            if (myCollection.getSize().compareTo(15) > new Integer(VALUE_TWO)) {
                System.out.println("VALUE");
            }
            if (myCollection.contains(sampleValue).someCheck() && someCheck(otherValue)) {
                System.out.println("HAS_VALUE");
            }
        }
    }

}
