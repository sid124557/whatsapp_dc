package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.0QS  reason: invalid class name */
public abstract class AnonymousClass0QS {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public abstract void A04(Intent intent);

    public void A00() {
    }

    public void A01() {
    }

    public void A02() {
    }

    public void A03(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 != i) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Given job ID ");
            A0o.append(i);
            throw AnonymousClass000.A0G(" is different than previous ", A0o, i2);
        }
    }

    public AnonymousClass0QS(ComponentName componentName) {
        this.A02 = componentName;
    }
}
