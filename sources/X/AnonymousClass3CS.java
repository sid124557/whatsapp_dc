package X;

import android.util.LruCache;
import java.util.Queue;

/* renamed from: X.3CS  reason: invalid class name */
public final class AnonymousClass3CS implements C835548w, C83894Af {
    public final LruCache A00 = new C19030ye();
    public final C49642gr A01;
    public final AnonymousClass2MO A02;
    public final AnonymousClass4FS A03;
    public final Queue A04 = AnonymousClass0x9.A18();
    public final AnonymousClass66R A05 = C154517dI.A01(new C79003vv(this));
    public volatile boolean A06;
    public volatile boolean A07;

    public synchronized String BDJ() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A0o.append("FcsConfigInMemoryCache: ");
        return AnonymousClass000.A0h(A0o, this.A00.size());
    }

    public synchronized void Bej(boolean z) {
        this.A00.evictAll();
    }

    public final void A00(AnonymousClass4GP r4) {
        if (this.A06) {
            this.A04.add(C71263bp.A00(r4, 20));
            return;
        }
        this.A06 = true;
        this.A04.add(C71263bp.A00(r4, 21));
        AnonymousClass2MO r1 = this.A02;
        r1.A01.A06(this);
        C44062Un r2 = r1.A00;
        synchronized (r2) {
            r2.A00.add(AnonymousClass0x9.A14(this));
        }
        ((C72173dI) this.A05.getValue()).execute(C71263bp.A00(this, 22));
    }

    public AnonymousClass3CS(C49642gr r2, AnonymousClass2MO r3, AnonymousClass4FS r4) {
        C18260x0.A0V(r4, r2, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
