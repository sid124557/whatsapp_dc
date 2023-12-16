package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.92e  reason: invalid class name and case insensitive filesystem */
public class C1896692e implements C834048g, AnonymousClass4GQ {
    public Object A00;
    public final int A01;

    public final Object invoke(Object obj) {
        C105425Uw r4;
        C114825nf r1;
        Object obj2 = obj;
        switch (this.A01) {
            case 0:
                C108145cU r2 = (C108145cU) this.A00;
                r2.A0n = false;
                r2.A0J(r2.A02(), (String) obj2, Math.max(r2.A00(), 50000), true, true);
                break;
            case 1:
                r1 = (C114825nf) this.A00;
                r4 = (C105425Uw) obj2;
                break;
            case 2:
                r4 = (C105425Uw) obj2;
                r1 = (C114825nf) ((AnonymousClass694) this.A00).A00;
                break;
            case 3:
                ((SearchViewModel) this.A00).A0a((C95814uZ) obj2);
                return null;
            case 4:
                ((SearchViewModel) this.A00).A0Z((C108875dh) obj2);
                return null;
            default:
                ((AnonymousClass5ZT) this.A00).A1Q.set(((Number) obj2).intValue());
                return null;
        }
        r1.A0G.A03();
        r1.BbR(r4);
        return C59022wD.A00;
    }

    public C1896692e(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
