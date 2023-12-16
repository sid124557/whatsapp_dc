package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.6pX  reason: invalid class name and case insensitive filesystem */
public class C137956pX extends C150477Qw {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public /* bridge */ /* synthetic */ CharSequence A00(Context context) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof C150477Qw) {
                obj = ((C150477Qw) obj).A00(context);
            }
            objArr2[i] = obj;
        }
        return context.getResources().getQuantityString(this.A01, this.A00, objArr2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C137956pX)) {
            return false;
        }
        C137956pX r4 = (C137956pX) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && Arrays.equals(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public C137956pX(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A01);
        AnonymousClass000.A1M(A0M, this.A00);
        return (Arrays.hashCode(A0M) * 31) + Arrays.hashCode(this.A02);
    }
}
