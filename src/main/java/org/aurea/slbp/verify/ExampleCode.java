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
            if (someCheck(sampleValue) && myCollection.contains(otherValue).someCheck()) {
                System.out.println("HAS_VALUE");
            }
        }
    }

}
