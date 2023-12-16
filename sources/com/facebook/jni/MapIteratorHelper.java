package com.facebook.jni;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorHelper {
    public final Iterator mIterator;
    public Object mKey;
    public Object mValue;

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(this.mIterator);
            this.mKey = A0w.getKey();
            this.mValue = A0w.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = AnonymousClass000.A0q(map);
    }
}
