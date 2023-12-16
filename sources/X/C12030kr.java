package X;

/* renamed from: X.0kr  reason: invalid class name and case insensitive filesystem */
public class C12030kr implements Runnable {
    public final /* synthetic */ C13340n1 A00;
    public final /* synthetic */ C188268yc A01;

    public C12030kr(C13340n1 r1, C188268yc r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C13340n1 r5 = this.A00;
        AnonymousClass0BT r4 = r5.A0F;
        if (!r4.isCancelled()) {
            try {
                this.A01.get();
                C06240Wu A002 = C06240Wu.A00();
                String str = C13340n1.A0I;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Starting work for ");
                C06240Wu.A03(A002, r5.A08.A0G, str, A0o);
                r4.A08(r5.A03.A09());
            } catch (Throwable th) {
                r4.A0A(th);
            }
        }
    }
}
