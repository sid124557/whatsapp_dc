package X;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.0Yl  reason: invalid class name and case insensitive filesystem */
public class C06600Yl implements TimeInterpolator {
    public int A00;
    public int A01;
    public int[] A02;

    public float getInterpolation(float f) {
        float f2 = (float) this.A01;
        int A06 = AnonymousClass001.A06(f, f2);
        int i = this.A00;
        int[] iArr = this.A02;
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            if (A06 < i3) {
                break;
            }
            A06 -= i3;
            i2++;
        }
        float f3 = 0.0f;
        if (i2 < i) {
            f3 = ((float) A06) / f2;
        }
        return (((float) i2) / ((float) i)) + f3;
    }

    public C06600Yl(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.A00 = numberOfFrames;
        int[] iArr = this.A02;
        if (iArr == null || iArr.length < numberOfFrames) {
            iArr = new int[numberOfFrames];
            this.A02 = iArr;
        }
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int i3 = i2;
            if (z) {
                i3 = (numberOfFrames - i2) - 1;
            }
            int duration = animationDrawable.getDuration(i3);
            iArr[i2] = duration;
            i += duration;
        }
        this.A01 = i;
    }
}
