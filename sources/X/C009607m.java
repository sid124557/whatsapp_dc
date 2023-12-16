package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.07m  reason: invalid class name and case insensitive filesystem */
public class C009607m extends C04090Mt {
    public final /* synthetic */ C15530rW A00;
    public final /* synthetic */ C04520Op A01;
    public final /* synthetic */ C15630rg A02;
    public final /* synthetic */ C08310eF A03;
    public final /* synthetic */ AtomicReference A04;

    public C009607m(C15530rW r1, C04520Op r2, C15630rg r3, C08310eF r4, AtomicReference atomicReference) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = atomicReference;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        C08310eF r5 = this.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fragment_");
        A0o.append(r5.A0V);
        A0o.append("_rq#");
        String A0h = AnonymousClass000.A0h(A0o, r5.A0o.getAndIncrement());
        this.A04.set(((AnonymousClass0US) this.A02.apply((Object) null)).A00(this.A00, this.A01, r5, A0h));
    }
}
