package com.facebook.flexlayout.layoutoutput;

import X.C140946um;
import X.C140956un;

public class LayoutOutput {
    public float[] arr;
    public Object[] measureResults;

    public LayoutOutput(int i) {
        this.measureResults = new Object[i];
        this.arr = new float[(C140956un.values().length + (i * C140946um.values().length))];
    }
}
