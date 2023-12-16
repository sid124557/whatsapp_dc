package X;

/* renamed from: X.0kz  reason: invalid class name and case insensitive filesystem */
public class C12110kz implements Runnable {
    public final /* synthetic */ C13350n2 A00;
    public final /* synthetic */ AnonymousClass0BT A01;

    public C12110kz(C13350n2 r1, AnonymousClass0BT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C13350n2 r6 = this.A00;
        AnonymousClass0BT r3 = r6.A04;
        if (!r3.isCancelled()) {
            try {
                AnonymousClass0PW r5 = (AnonymousClass0PW) this.A01.get();
                if (r5 != null) {
                    C06240Wu A002 = C06240Wu.A00();
                    String str = C13350n2.A06;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Updating notification for ");
                    C06240Wu.A03(A002, r6.A03.A0G, str, A0o);
                    r3.A08(r6.A01.BmK(r6.A00, r5, r6.A02.A01.A08));
                    return;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Worker was marked important (");
                A0o2.append(r6.A03.A0G);
                throw AnonymousClass000.A0I(") but did not provide ForegroundInfo", A0o2);
            } catch (Throwable th) {
                r3.A0A(th);
            }
        }
    }
}
