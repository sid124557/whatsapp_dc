package X;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Qh  reason: invalid class name and case insensitive filesystem */
public class C22841Qh extends C140346ta {
    public int A00;
    public final List A01;

    public int A00() {
        return AnonymousClass000.A09(this.A01, this.A00);
    }

    public void A01() {
        this.A00++;
    }

    public boolean A02() {
        if (this.A00 != this.A01.size() - 1) {
            return false;
        }
        return true;
    }

    public C22841Qh(C42162Na r3, InputStream inputStream, int[] iArr) {
        super(r3, inputStream);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        A0s.addAll(C100395At.A00((Long) null, iArr));
    }
}
