package com.facebook.flexlayout.layoutoutput;

import X.AnonymousClass6C9;
import X.C140966uo;

public class MeasureOutput {
    public float[] arr;
    public Object measureResult;

    public MeasureOutput(float f, float f2, float f3, Object obj) {
        float[] fArr = new float[C140966uo.values().length];
        this.arr = fArr;
        AnonymousClass6C9.A1J(fArr, f, f2);
        fArr[2] = Float.NaN;
        this.measureResult = obj;
    }
}
