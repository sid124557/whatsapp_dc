package X;

/* renamed from: X.1FD  reason: invalid class name */
public class AnonymousClass1FD extends C59332wk implements Runnable, AnonymousClass4B6 {
    public int A00 = 60;
    public AnonymousClass1fI A01;
    public final C28891hw A02;

    public AnonymousClass1FD(C28891hw r2, AnonymousClass1fI r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BroadcastListResponseHandler/request success/");
        C18260x0.A1G(A0o, this.A00);
    }

    public void BkI(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BroadcastListResponseHandler/request failed : ");
        A0o.append(i);
        A0o.append(" | ");
        AnonymousClass1fI r2 = this.A01;
        A0o.append(r2);
        A0o.append(" | ");
        C18270x1.A1F(A0o, this.A00);
        this.A01.cancel();
        this.A02.A0C(r2, false);
    }
}
