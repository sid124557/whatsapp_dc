package X;

/* renamed from: X.9eP  reason: invalid class name and case insensitive filesystem */
public class C198119eP implements C1227565p {
    public final C183538qC A00;
    public final C183538qC A01;

    public boolean BJ8() {
        C183538qC r6 = this.A01;
        int i = C18270x1.A05(r6).getInt("shops_privacy_notice", -1);
        C183538qC r2 = this.A00;
        C66663Mh r0 = ((AnonymousClass2IS) r2.get()).A00;
        C22071Ek r1 = C66663Mh.A1q;
        if (i >= r0.A03(r1)) {
            return true;
        }
        C18270x1.A05(r6).getInt("shops_privacy_notice", -1);
        ((AnonymousClass2IS) r2.get()).A00.A03(r1);
        return false;
    }

    public C198119eP(C183538qC r1, C183538qC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
