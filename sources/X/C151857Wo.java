package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7Wo  reason: invalid class name and case insensitive filesystem */
public class C151857Wo {
    public final LruCache A00;
    public final LruCache A01;
    public final C150157Pl A02;
    public final AnonymousClass8LG A03;
    public final AtomicLong A04 = new AtomicLong(SystemClock.elapsedRealtime());

    public void A03(long j, boolean z) {
        boolean z2;
        Long valueOf = Long.valueOf(j);
        C159597m9.A02("id [%d]: Release player", valueOf);
        if (z && j > 0 && A02(j) != null) {
            C162987t5 A022 = A02(j);
            AnonymousClass85J r3 = new AnonymousClass85J();
            AnonymousClass85L r2 = A022.A0o;
            r2.BbN(r2.A00.A0k);
            r2.A01 = r3;
        }
        if (this.A03.enableBackgroundServicePlayerReuse) {
            LruCache lruCache = this.A01;
            Number number = (Number) lruCache.get(valueOf);
            if (number != null) {
                int intValue = number.intValue();
                if (intValue <= 1) {
                    this.A00.remove(valueOf);
                    lruCache.remove(valueOf);
                    z2 = true;
                    Object[] A1X = AnonymousClass0x9.A1X();
                    A1X[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                    A1X[1] = valueOf;
                    AnonymousClass6C7.A1V(A1X, 2, z2);
                    C159597m9.A02("HeroServicePlayerPool", A1X);
                }
                lruCache.put(valueOf, Integer.valueOf(intValue - 1));
                C162987t5 A023 = A02(j);
                if (A023 != null) {
                    AnonymousClass85J r32 = new AnonymousClass85J();
                    AnonymousClass85L r22 = A023.A0o;
                    r22.BbN(r22.A00.A0k);
                    r22.A01 = r32;
                }
                z2 = false;
                Object[] A1X2 = AnonymousClass0x9.A1X();
                A1X2[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                A1X2[1] = valueOf;
                AnonymousClass6C7.A1V(A1X2, 2, z2);
                C159597m9.A02("HeroServicePlayerPool", A1X2);
            }
        }
        this.A00.remove(valueOf);
        z2 = true;
        Object[] A1X22 = AnonymousClass0x9.A1X();
        A1X22[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
        A1X22[1] = valueOf;
        AnonymousClass6C7.A1V(A1X22, 2, z2);
        C159597m9.A02("HeroServicePlayerPool", A1X22);
    }

    public C162987t5 A02(long j) {
        return (C162987t5) this.A00.get(Long.valueOf(j));
    }

    public C151857Wo(C150157Pl r4, AnonymousClass8LG r5) {
        this.A03 = r5;
        this.A02 = r4;
        int i = r5.playerPoolSize;
        i = i <= 0 ? 1 : i;
        this.A01 = new LruCache(i);
        this.A00 = new C188708zM(this, i, 0);
    }

    public static C162987t5 A00(C158967ks r1, C162997t6 r2) {
        C159117l9 A022 = r1.A02();
        return A022.A0V.A02(r2.A0O);
    }

    public static C162987t5 A01(C159117l9 r0, String str, Object[] objArr, long j) {
        C159597m9.A02(str, objArr);
        return r0.A0V.A02(j);
    }
}
