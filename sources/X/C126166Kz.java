package X;

import java.util.ArrayList;

/* renamed from: X.6Kz  reason: invalid class name and case insensitive filesystem */
public final class C126166Kz extends AnonymousClass7WU {
    public final ArrayList A00 = AnonymousClass002.A0I(16);

    public void A03(AnonymousClass7WU r2) {
        if (this.A03) {
            r2.A01();
            A04(r2);
            r2.A01();
            r2.A00 = this;
            return;
        }
        throw AnonymousClass001.A0e("Expected object to be mutable");
    }

    public final void A04(Object obj) {
        if (this.A03) {
            this.A00.add(obj);
            return;
        }
        throw AnonymousClass001.A0e("Expected object to be mutable");
    }
}
