package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7Zh  reason: invalid class name and case insensitive filesystem */
public class C152547Zh {
    public int A00;
    public int A01;
    public C181328ma A02;
    public Set A03;
    public final Set A04 = AnonymousClass002.A0K();
    public final Set A05;

    public C157587iY A00() {
        C162177rO.A04("Missing required property: factory.", AnonymousClass000.A1W(this.A02));
        return new C157587iY(this.A02, AnonymousClass0x9.A15(this.A05), AnonymousClass0x9.A15(this.A04), this.A03, this.A00, this.A01);
    }

    public void A01(C152197Xy r3) {
        if (!this.A05.contains(r3.A01)) {
            this.A04.add(r3);
            return;
        }
        throw AnonymousClass6C7.A0U("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C152547Zh(Class cls, Class... clsArr) {
        HashSet A0K = AnonymousClass002.A0K();
        this.A05 = A0K;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = AnonymousClass002.A0K();
        A0K.add(cls);
        for (Class A032 : clsArr) {
            C162177rO.A03(A032, "Null interface");
        }
        Collections.addAll(this.A05, clsArr);
    }
}
