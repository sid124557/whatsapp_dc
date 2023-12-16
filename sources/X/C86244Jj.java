package X;

/* renamed from: X.4Jj  reason: invalid class name and case insensitive filesystem */
public class C86244Jj implements C84134Bd {
    public int A00 = -1;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C86244Jj(AnonymousClass30M r2, C56232re r3, AnonymousClass3QO r4, int i) {
        this.A05 = i;
        this.A02 = r3;
        this.A04 = r2;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        C56232re r4;
        AnonymousClass30M r3;
        int i = this.A05;
        Number number = (Number) obj;
        int intValue = number.intValue();
        int i2 = this.A00;
        if (i != 0) {
            if (intValue != i2) {
                this.A00 = intValue;
                if (intValue >= this.A01 + 5) {
                    this.A01 = intValue;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("mediajobmanager/upload/progress for ");
                    C18320x8.A1O(A0o, ((AnonymousClass30M) this.A04).A02);
                    A0o.append(" messages: ");
                    A0o.append(number);
                    A0o.append("; job=");
                    C18260x0.A0m(this.A03, A0o);
                }
                r4 = (C56232re) this.A02;
                C618132i r2 = r4.A0E;
                r3 = (AnonymousClass30M) this.A04;
                C618132i.A00(r3, new AnonymousClass92T(r2, 5), number);
            } else {
                return;
            }
        } else if (intValue != i2) {
            this.A00 = intValue;
            if (intValue >= this.A01 + 5) {
                this.A01 = intValue;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("mediajobmanager/processmedia/progress for ");
                C18320x8.A1O(A0o2, ((AnonymousClass30M) this.A04).A02);
                A0o2.append(" messages; job=");
                C18260x0.A0m(this.A03, A0o2);
            }
            r4 = (C56232re) this.A02;
            C618132i r22 = r4.A0E;
            r3 = (AnonymousClass30M) this.A04;
            if (!C618132i.A00(r3, new AnonymousClass92T(r22, 1), number)) {
                return;
            }
        } else {
            return;
        }
        r4.A07.A0E(r3.A02, 8);
    }
}
