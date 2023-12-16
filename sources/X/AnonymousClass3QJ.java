package X;

import java.util.HashMap;

/* renamed from: X.3QJ  reason: invalid class name */
public class AnonymousClass3QJ implements AnonymousClass4EV {
    public final /* synthetic */ AnonymousClass1I7 A00;
    public final /* synthetic */ C620133d A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3QJ(AnonymousClass1I7 r1, C620133d r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public /* synthetic */ void BRU(long j) {
    }

    public void BRW(boolean z) {
        AnonymousClass1I7 r1;
        C620133d r4 = this.A01;
        HashMap hashMap = r4.A0m;
        synchronized (hashMap) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mediadownloadmanager/queueexpresspathdownload Download canceled for media job: ");
            r1 = this.A00;
            A0o.append(r1);
            A0o.append(" enc hash: ");
            String str = this.A02;
            C18260x0.A1L(A0o, str);
            hashMap.remove(str);
        }
        C620133d.A01(r4, r1.A0e);
    }

    public void BRX(C625435m r6, C56902sk r7) {
        AnonymousClass1I7 r1;
        C620133d r4 = this.A01;
        HashMap hashMap = r4.A0m;
        synchronized (hashMap) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mediadownloadmanager/queueexpresspathdownload Download finishes for media job: ");
            r1 = this.A00;
            C18260x0.A0o(r1, A0o);
            hashMap.remove(this.A02);
        }
        C620133d.A01(r4, r1.A0e);
    }
}
