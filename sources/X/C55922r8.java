package X;

import android.net.TrafficStats;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2r8  reason: invalid class name and case insensitive filesystem */
public abstract class C55922r8 {
    public long A00 = -1;
    public WeakReference A01;
    public final C56492s4 A02;
    public final C56612sH A03;
    public final C620733j A04;
    public final C64733Es A05;
    public final AnonymousClass4FV A06;
    public final C106095Xp A07;
    public final C52512lb A08;
    public final AnonymousClass3FI A09;
    public final AnonymousClass4FS A0A;
    public final Random A0B = AnonymousClass0x9.A1C();

    public C49872hE A02(CharSequence charSequence) {
        if (this instanceof C26711ce) {
            return new AnonymousClass4HF((C26711ce) this, charSequence);
        }
        return new AnonymousClass4HF((C26701cd) this, charSequence);
    }

    public C55922r8(C56492s4 r3, C56612sH r4, C620733j r5, C64733Es r6, AnonymousClass4FV r7, C106095Xp r8, C52512lb r9, AnonymousClass3FI r10, AnonymousClass4FS r11) {
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A0A = r11;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
    }

    public static void A00(C56612sH r1, C25501ac r2, C55922r8 r3, long j) {
        r2.A05 = Long.valueOf(r1.A0H() - j);
        r3.A06.BhD(r2);
        TrafficStats.clearThreadStatsTag();
    }

    public final C49872hE A01() {
        AnonymousClass4HG r3;
        C49872hE r32;
        C626936e.A01();
        WeakReference weakReference = this.A01;
        if (weakReference != null && (r32 = (C49872hE) weakReference.get()) != null && this.A03.A0H() - this.A00 < TimeUnit.HOURS.toMillis(4) && !r32.A01) {
            return r32;
        }
        if (this instanceof C26711ce) {
            r3 = new AnonymousClass4HG((C26711ce) this);
        } else {
            r3 = new AnonymousClass4HG((C26701cd) this);
        }
        this.A01 = AnonymousClass0x9.A14(r3);
        this.A00 = this.A03.A0H();
        return r3;
    }
}
