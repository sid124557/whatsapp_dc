package X;

/* renamed from: X.1MV  reason: invalid class name */
public final class AnonymousClass1MV extends C196279aa implements C84224Bn {
    public final C57162tC A00;

    public AnonymousClass1MV(C57162tC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean A00() {
        return false;
    }

    public void Ax0(String str, Object obj) {
        C18260x0.A0O(str, obj);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaffleClientAndBloksAcFlowLoggerImpl/annotateUserFlow: marker=");
        A0o.append(C379224o.A00(891960492));
        A0o.append(", key=");
        A0o.append(str);
        C18260x0.A1P(A0o, ", value=", obj);
    }

    public void Bq2(Object obj, String str, int i, int i2, boolean z) {
        StringBuilder A0X = C18270x1.A0X(obj);
        A0X.append("WaffleClientAndBloksAcFlowLoggerImpl/startUserFlow: marker=");
        C18260x0.A1J(A0X, C379224o.A00(i));
    }
}
