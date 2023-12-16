package X;

import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0U3  reason: invalid class name */
public class AnonymousClass0U3 {
    public final Object A00;

    public AnonymousClass0U3(Object obj) {
        this.A00 = obj;
    }

    public C05650Ui A00(int i) {
        return null;
    }

    public C05650Ui A01(int i) {
        return null;
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        return false;
    }

    public AnonymousClass0U3() {
        Object r0;
        if (Build.VERSION.SDK_INT >= 26) {
            r0 = new AnonymousClass06M(this);
        } else {
            r0 = new AnonymousClass06N(this);
        }
        this.A00 = r0;
    }
}
