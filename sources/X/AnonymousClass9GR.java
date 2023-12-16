package X;

import java.util.List;

/* renamed from: X.9GR  reason: invalid class name */
public class AnonymousClass9GR extends AnonymousClass5ZM {
    public final AnonymousClass9U4 A00;
    public final AnonymousClass9NR A01;

    public AnonymousClass9GR(C89644eZ r2, AnonymousClass9U4 r3, AnonymousClass9NR r4) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A08 = AnonymousClass9U4.A08(this.A00);
        if (A08.isEmpty()) {
            return null;
        }
        C133796hx r1 = C1899693i.A0D(A08, C195169Wk.A01(A08)).A08;
        if (r1 instanceof AnonymousClass99H) {
            return r1;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass99H r5 = (AnonymousClass99H) obj;
        AnonymousClass9Bb r3 = this.A01.A00;
        if (r5 != null) {
            r3.BjL();
            r3.A7W(r5);
            return;
        }
        r3.A0M.A08(new C204539pW(r3, 1));
    }
}
