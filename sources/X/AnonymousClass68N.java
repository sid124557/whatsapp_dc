package X;

/* renamed from: X.68N  reason: invalid class name */
public class AnonymousClass68N extends AnonymousClass5ZM {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass68N(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C833748d r5;
        C833748d r6;
        switch (this.A02) {
            case 0:
                AnonymousClass5P5 r3 = (AnonymousClass5P5) this.A00;
                C61072zf r0 = r3.A0A;
                long A04 = r0.A04();
                long A022 = r0.A02();
                r3.A0D.A00.A03(C66663Mh.A1H);
                C833748d r7 = null;
                AnonymousClass5C6 r4 = new AnonymousClass5C6();
                C90064fm r2 = r3.A06;
                if (r2.A00.A0X(3712)) {
                    r5 = r2.A01();
                } else {
                    r5 = null;
                }
                C90074fn r1 = r3.A07;
                if (r1.A02()) {
                    r6 = r1.A01();
                } else {
                    r6 = null;
                }
                C90084fo r12 = r3.A08;
                if (r12.A02()) {
                    r7 = r12.A01();
                }
                return new AnonymousClass5K6(r4, r5, r6, r7, A04, A022);
            case 1:
                C94134px r22 = (C94134px) this.A00;
                C27991fJ A012 = r22.A0A.A01((C27991fJ) this.A01);
                if (A012 != null) {
                    return r22.A05.A07(A012);
                }
                return null;
            default:
                C613630k r23 = ((AnonymousClass5SZ) this.A01).A02;
                String str = r23.A02().A00;
                if (str == null || str.length() == 0) {
                    return null;
                }
                return r23.A03(str);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        switch (this.A02) {
            case 0:
                AnonymousClass5K6 r5 = (AnonymousClass5K6) obj;
                ((AnonymousClass5P5) this.A00).A00 = r5;
                AnonymousClass64M r0 = (AnonymousClass64M) this.A01;
                if (r5 != null) {
                    r0.BQY(r5);
                    return;
                }
                return;
            case 1:
                AnonymousClass3ZH r52 = (AnonymousClass3ZH) obj;
                if (r52 != null) {
                    C94134px r02 = (C94134px) this.A00;
                    r02.A0C.A08(r02.A08.A0B, r52);
                    return;
                }
                return;
            default:
                C53892nq r53 = (C53892nq) obj;
                if (r53 != null) {
                    ((AnonymousClass65R) this.A00).BLv(r53.A07, true, ((AnonymousClass5SZ) this.A01).A01.A02(r53.A06));
                    return;
                }
                ((AnonymousClass65R) this.A00).BLv((String) null, false, (String) null);
                return;
        }
    }
}
