package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.2hu  reason: invalid class name and case insensitive filesystem */
public final class C50272hu {
    public HashMap A00 = AnonymousClass001.A0t();
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final C45582aF A04;
    public final AnonymousClass4FS A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C120315yO(this));
    public final AnonymousClass66R A07 = C154517dI.A01(new C120325yP(this));

    public final C45142Yv A00(int i) {
        if (!this.A02.A0Y(C58422vE.A02, 4928)) {
            return null;
        }
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        ((C72173dI) this.A07.getValue()).execute(new C70273aE(this, i, leastSignificantBits, 7));
        return new C45142Yv(this, leastSignificantBits);
    }

    public C50272hu(C56612sH r2, AnonymousClass1VX r3, AnonymousClass4FV r4, C45582aF r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r2, r3, r6, r4, r5);
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void A01(C102375Ip r6) {
        long A08 = C18280x3.A08(SystemClock.elapsedRealtime(), r6.A00);
        if (A08 > 0) {
            AnonymousClass1ZE r1 = r6.A01;
            r1.A02 = Long.valueOf(A08);
            this.A03.BhA(r1);
        }
    }
}
