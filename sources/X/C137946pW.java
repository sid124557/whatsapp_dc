package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.6pW  reason: invalid class name and case insensitive filesystem */
public class C137946pW extends C150477Qw {
    public final int A00;
    public final Object[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C137946pW r5 = (C137946pW) obj;
            if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public CharSequence A00(Context context) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof C150477Qw) {
                obj = ((C150477Qw) obj).A00(context);
            }
            objArr2[i] = obj;
        }
        return context.getString(this.A00, objArr2);
    }

    public int hashCode() {
        return ((217 + this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public C137946pW(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
