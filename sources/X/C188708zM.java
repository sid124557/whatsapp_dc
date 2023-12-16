package X;

import android.util.LruCache;

/* renamed from: X.8zM  reason: invalid class name and case insensitive filesystem */
public class C188708zM extends LruCache {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188708zM(Object obj, int i, int i2) {
        super(i);
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.A01) {
            case 0:
                C162987t5 r7 = (C162987t5) obj2;
                Object[] A0L = AnonymousClass002.A0L();
                boolean A1S = AnonymousClass6C9.A1S(A0L, r7.A0k);
                C159597m9.A02("entryRemoved, playerId=%d", A0L);
                int size = size();
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass6C7.A1V(A0M, A1S ? 1 : 0, z);
                AnonymousClass000.A1P(A0M, size, 1);
                C159597m9.A00(r7, "HeroService", "removed from pool, evicted = %s, remaining size = %d", A0M);
                synchronized (r7) {
                    C162987t5.A02(r7, "Release player", A1S);
                    if (r7.A17) {
                        C162987t5.A02(r7, "Player already released", A1S);
                    } else {
                        r7.A0G(r7.A0l.obtainMessage(8));
                        r7.A0o.BZl(z);
                    }
                }
                return;
            case 1:
                synchronized (C154767di.class) {
                    C154767di.A00.offer(obj2);
                }
                return;
            default:
                AnonymousClass7JN r72 = (AnonymousClass7JN) obj2;
                C156817hG r0 = (C156817hG) this.A00;
                if (z) {
                    C159117l9 r3 = r0.A03.A00;
                    r3.A08(new C188698zL(r72, r3), r72.A01);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188708zM(C155867fe r2) {
        super(32);
        this.A01 = 1;
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188708zM(C156817hG r2) {
        super(1);
        this.A01 = 3;
        this.A00 = r2;
    }
}
