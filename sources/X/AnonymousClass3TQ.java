package X;

import com.whatsapp.util.Log;

/* renamed from: X.3TQ  reason: invalid class name */
public class AnonymousClass3TQ implements AnonymousClass4EZ {
    public C49752h2 A00;
    public final C56972sr A01;
    public final AnonymousClass30i A02;
    public final C42772Pl A03;
    public final C64663Ek A04;
    public final C64673El A05;
    public final C56272ri A06;
    public final AnonymousClass31C A07;
    public final AnonymousClass4FS A08;

    public final synchronized C49752h2 A00() {
        C49752h2 r1;
        r1 = this.A00;
        C626936e.A06(r1);
        this.A00 = null;
        return r1;
    }

    public AnonymousClass3TQ(C56972sr r1, AnonymousClass30i r2, C42772Pl r3, C64663Ek r4, C64673El r5, C56272ri r6, AnonymousClass31C r7, AnonymousClass4FS r8) {
        this.A01 = r1;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void BQs(String str) {
        C18260x0.A0r("sync-request-handler/onDeliveryFailure iqId:", str, AnonymousClass001.A0o());
        this.A08.BkM(C71313bu.A00(this, 49));
    }

    public void BSN(AnonymousClass36K r10, String str) {
        C18260x0.A0r("sync-request-handler/onError iqId:", str, AnonymousClass001.A0o());
        AnonymousClass36K A0l = r10.A0l("error");
        if (A0l != null) {
            int A0b = A0l.A0b("code", -1);
            if (A0b != -1) {
                String A0L = AnonymousClass36K.A0L(A0l, "text");
                Long l = null;
                try {
                    long A0e = A0l.A0e("backoff", -1);
                    if (A0e != -1) {
                        l = Long.valueOf(A0e * 1000);
                    }
                } catch (AnonymousClass24Y e) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e);
                }
                this.A08.BkM(new C70473aY(this, l, A0L, A0b, 3));
                return;
            }
            throw AnonymousClass24Y.A01(AnonymousClass000.A0P(r10, "Expected attribute code in ", AnonymousClass001.A0o()));
        }
        throw AnonymousClass24Y.A01(AnonymousClass000.A0P(r10, "Expected child error in ", AnonymousClass001.A0o()));
    }

    public void BdM(AnonymousClass36K r4, String str) {
        C18260x0.A0s("sync-request-handler/onSuccess iqId:", str, AnonymousClass001.A0o());
        try {
            C70193a6.A01(this.A08, this, new AnonymousClass34Y(r4), 29);
        } catch (C23331Se | C23341Sf e) {
            A00();
            C70193a6.A01(this.A08, this, e, 30);
        }
    }
}
