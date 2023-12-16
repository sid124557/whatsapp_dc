package X;

/* renamed from: X.4Ib  reason: invalid class name and case insensitive filesystem */
public class C85904Ib implements AnonymousClass4EV {
    public Object A00;
    public final int A01;

    public C85904Ib(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRU(long j) {
        if (this.A01 == 0) {
            ((AnonymousClass1I7) this.A00).A0C(j);
        }
    }

    public void BRW(boolean z) {
        C72183dJ r2;
        switch (this.A01) {
            case 0:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("mediadownload/expresspathdownload/ondownloadcanceled Download cancelled for url: ");
                AnonymousClass1I7 r22 = (AnonymousClass1I7) this.A00;
                C18260x0.A1J(A0o, r22.A0e.A0L);
                r22.A0E(C625435m.A00((String) null, 13, z));
                return;
            case 1:
                r2 = ((AnonymousClass1g2) this.A00).A09;
                break;
            default:
                r2 = ((C28221fu) this.A00).A03;
                break;
        }
        int i = 13;
        if (z) {
            i = 0;
        }
        r2.BQt(new C625435m(i));
    }

    public void BRX(C625435m r3, C56902sk r4) {
        String str;
        C72183dJ r0;
        switch (this.A01) {
            case 0:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("mediadownload/expresspathdownload/ondownloadcomplete Complete download for url: ");
                A0o.append(((AnonymousClass1I7) this.A00).A0e.A0L);
                A0o.append(" result is: ");
                if (AnonymousClass000.A1T(r3.A01)) {
                    str = "success";
                } else {
                    str = "failure";
                }
                C18260x0.A1J(A0o, str);
                return;
            case 1:
                r0 = ((AnonymousClass1g2) this.A00).A09;
                break;
            default:
                r0 = ((C28221fu) this.A00).A03;
                break;
        }
        r0.BQt(r3);
    }
}
