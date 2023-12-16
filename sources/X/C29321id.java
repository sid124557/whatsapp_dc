package X;

import java.util.Iterator;

/* renamed from: X.1id  reason: invalid class name and case insensitive filesystem */
public class C29321id extends C29451iq {
    public final C620633i A00;
    public volatile Boolean A01;

    public void A08(boolean z) {
        if (this.A01 == null || z != this.A01.booleanValue()) {
            this.A01 = Boolean.valueOf(z);
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                ((AnonymousClass4BJ) A03.next()).Bap(A09());
            }
        }
    }

    public boolean A09() {
        if (this.A01 == null) {
            this.A01 = Boolean.valueOf(C18520xo.A00(this.A00));
        }
        return this.A01.booleanValue();
    }

    public C29321id(C620633i r1) {
        this.A00 = r1;
    }
}
