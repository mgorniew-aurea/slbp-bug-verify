package org.aurea.slbp.verify;

abstract class BaseCode {

    protected static final int VALUE_ONE = 0;
    protected static final int VALUE_TWO = 1;

    boolean someCheck(String value) {
        return value.length() == 15;
    }

}
