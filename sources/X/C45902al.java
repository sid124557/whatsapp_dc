package X;

/* renamed from: X.2al  reason: invalid class name and case insensitive filesystem */
public class C45902al {
    public final Integer A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;

    public C45902al(Integer num, Long l, Long l2, boolean z) {
        this.A03 = z;
        this.A02 = l;
        this.A01 = l2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[success=");
        StringBuilder A0A = C18330xA.A0A(C18300x5.A0m(A0o, this.A03));
        Long l = this.A02;
        if (l != null) {
            A0A.append(" refresh=");
            A0A.append(l);
        }
        Long l2 = this.A01;
        if (l2 != null) {
            A0A.append(" backoff=");
            A0A.append(l2);
        }
        Integer num = this.A00;
        if (num != null) {
            A0A.append(" errorCode=");
            A0A.append(num);
        }
        return AnonymousClass000.A0f(A0A);
    }
}
