package X;

/* renamed from: X.8cd  reason: invalid class name and case insensitive filesystem */
public class C176208cd extends AnonymousClass8Q0 {
    public C176408cx[] A00;

    public C176208cd(C176958dq r5) {
        if (r5.A0U() >= 1) {
            this.A00 = new C176408cx[r5.A0U()];
            for (int i = 0; i != r5.A0U(); i++) {
                Object[] objArr = this.A00;
                Object A0W = r5.A0W(i);
                if (!(A0W instanceof C176408cx)) {
                    if (A0W != null) {
                        A0W = new C176408cx(C176958dq.A0C(A0W));
                    } else {
                        A0W = null;
                    }
                }
                objArr[i] = A0W;
            }
            return;
        }
        throw AnonymousClass001.A0c("sequence may not be empty");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AuthorityInformationAccess: Oid(");
        A0o.append(this.A00[0].A00.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
