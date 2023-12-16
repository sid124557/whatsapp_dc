package X;

import android.os.Parcel;

/* renamed from: X.1pB  reason: invalid class name and case insensitive filesystem */
public class C31971pB extends C31981pC implements AnonymousClass4B9 {
    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r14) {
        AnonymousClass2z0 r3 = r14;
        if (this instanceof C31941p8) {
            C31941p8 r5 = (C31941p8) this;
            C162457s7.A0J(r14, 0);
            if (C624134x.A0e(r5)) {
                Parcel obtain = Parcel.obtain();
                C162457s7.A0D(obtain);
                AnonymousClass39W r1 = r5.A00;
                if (r1 != null) {
                    r1.writeToParcel(obtain, 0);
                }
                obtain.setDataPosition(0);
                long j = r5.A0K;
                AnonymousClass33C r2 = r5.A01;
                C162457s7.A0H(r2);
                return new C31941p8(r2, r3, (AnonymousClass39W) AnonymousClass39W.CREATOR.createFromParcel(obtain), r5, j);
            }
            long j2 = r5.A0K;
            AnonymousClass33C r7 = r5.A01;
            C162457s7.A0H(r7);
            return new C31941p8(r7, r14, r5, j2);
        } else if (this instanceof AnonymousClass1p7) {
            AnonymousClass1p7 r52 = (AnonymousClass1p7) this;
            return new AnonymousClass1p7(r52.A01, r14, r52, r52.A0K);
        } else {
            return new C31971pB(this.A01, r14, this, this.A0K, true);
        }
    }

    public C31971pB(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public C31971pB(AnonymousClass33C r9, AnonymousClass2z0 r10, C31971pB r11, long j, boolean z) {
        super(r9, r10, r11, r11.A1I, j, z);
    }

    public C31971pB(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 3, j);
    }

    public C31971pB(AnonymousClass33C r9, AnonymousClass2z0 r10, C31971pB r11, long j) {
        super(r9, r10, r11, (byte) 3, j, false);
    }
}
