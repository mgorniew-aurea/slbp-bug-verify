package org.aurea.slbp.verify;

import java.util.Collections;
import java.util.Objects;

class ExampleUser extends BaseCode {

    void methodOne() {
        String sampleValue = "SAMPLE";
        String otherValue = "SAMPLE";
        ExampleCollection<ExampleValue> myCollection = new ExampleCollection<ExampleValue>(Collections.emptyList());
        if (myCollection.isEmpty() && Objects.nonNull(myCollection.contains(sampleValue))
            || myCollection.contains(otherValue).someCheck()) {
            if (myCollection.getSize().compareTo(15) < 120L) {
                System.out.println("VALUE");
            }
            if (someCheck(sampleValue) && myCollection.contains(otherValue).someCheck()) {
                System.out.println("HAS_VALUE");
            }
        }
    }

}
