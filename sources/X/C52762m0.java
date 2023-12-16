package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.2m0  reason: invalid class name and case insensitive filesystem */
public final class C52762m0 {
    public AnonymousClass0AR A00;
    public C52172l0 A01 = new C52172l0(0, false, false);
    public WeakReference A02;
    public final C198112t A03 = new C198112t(this);

    public final AnonymousClass0AR A00(Context context, int i, boolean z) {
        AnonymousClass0AR r2;
        C162457s7.A0J(context, 0);
        if (this.A01.A00 != i || (r2 = this.A00) == null) {
            C52172l0 r1 = new C52172l0(i, z, true);
            this.A01 = r1;
            A01();
            r2 = AnonymousClass0AR.A04(context, r1.A00);
            if (r2 == null) {
                r2 = null;
            } else {
                r2.A09(this.A03);
                if (r1.A02) {
                    r2.start();
                }
            }
            this.A00 = r2;
        }
        return r2;
    }

    public final void A02() {
        this.A01 = new C52172l0(0, false, false);
        WeakReference weakReference = this.A02;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A02 = null;
        A01();
    }

    public final void A01() {
        AnonymousClass0AR r0 = this.A00;
        if (r0 != null) {
            r0.A08();
        }
        AnonymousClass0AR r02 = this.A00;
        if (r02 != null) {
            r02.stop();
        }
        this.A00 = null;
    }
}
