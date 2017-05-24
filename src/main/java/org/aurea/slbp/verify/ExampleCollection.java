package org.aurea.slbp.verify;

import java.util.Collection;

class ExampleCollection<T> {

    private final Collection<T> wrappedCollection;

    ExampleCollection(Collection<T> wrappedCollection) {
        this.wrappedCollection = wrappedCollection;
    }

    Integer getSize() {
        return wrappedCollection.size();
    }

    boolean isEmpty() {
        return wrappedCollection.isEmpty();
    }

    T contains(String value) {
        return wrappedCollection.iterator().next();
    }

}
