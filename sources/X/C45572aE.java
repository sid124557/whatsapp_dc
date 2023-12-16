package X;

import java.util.List;

/* renamed from: X.2aE  reason: invalid class name and case insensitive filesystem */
public final class C45572aE {
    public boolean A00;
    public final AnonymousClass2TY A01;
    public final List A02 = AnonymousClass001.A0s();

    public final void A00() {
        synchronized (this) {
            if (!this.A00) {
                AnonymousClass45D r2 = AnonymousClass45D.A00;
                C26481cC r1 = (C26481cC) this.A01.A08.get();
                r1.A01 = C60362yR.A00;
                r1.A04();
                r2.invoke(r1);
                C50922iz.A02(r1);
                this.A02.add(r1);
                this.A00 = true;
            }
        }
    }

    public C45572aE(AnonymousClass2TY r2) {
        this.A01 = r2;
    }
}
