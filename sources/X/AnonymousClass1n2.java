package X;

import android.os.Parcel;

/* renamed from: X.1n2  reason: invalid class name */
public class AnonymousClass1n2 extends AnonymousClass1nA implements AnonymousClass4B9 {
    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r13) {
        AnonymousClass2z0 r3 = r13;
        if (this instanceof C30771mz) {
            C30771mz r4 = (C30771mz) this;
            return new C30771mz(r4.A01, r3, r4, r4.A0K, true);
        } else if (this instanceof AnonymousClass1n1) {
            AnonymousClass1n1 r42 = (AnonymousClass1n1) this;
            C162457s7.A0J(r13, 0);
            if (C624134x.A0e(r42)) {
                Parcel obtain = Parcel.obtain();
                C162457s7.A0D(obtain);
                AnonymousClass39W r1 = r42.A00;
                if (r1 != null) {
                    r1.writeToParcel(obtain, 0);
                }
                obtain.setDataPosition(0);
                long j = r42.A0K;
                AnonymousClass33C r6 = r42.A01;
                C162457s7.A0H(r6);
                return new AnonymousClass1n1(r6, r13, (AnonymousClass39W) AnonymousClass39W.CREATOR.createFromParcel(obtain), r42, j);
            }
            long j2 = r42.A0K;
            AnonymousClass33C r62 = r42.A01;
            C162457s7.A0H(r62);
            return new AnonymousClass1n1(r62, r13, r42, j2, true);
        } else if (this instanceof AnonymousClass1n0) {
            AnonymousClass1n0 r43 = (AnonymousClass1n0) this;
            return new AnonymousClass1n0(r43.A01, r3, r43, r43.A0K);
        } else if (this instanceof C30761my) {
            C30761my r44 = (C30761my) this;
            return new C30761my(r44.A01, r3, r44, r44.A0K, true);
        } else {
            return new AnonymousClass1n2(this.A01, r3, this, this.A0K, true);
        }
    }

    public AnonymousClass1n2(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public AnonymousClass1n2(AnonymousClass33C r9, AnonymousClass2z0 r10, AnonymousClass1n2 r11, long j, boolean z) {
        super(r9, r10, r11, r11.A1I, j, z);
    }

    public AnonymousClass1n2(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 1, j);
    }

    public AnonymousClass1n2(AnonymousClass33C r9, AnonymousClass2z0 r10, AnonymousClass1n2 r11, long j) {
        super(r9, r10, r11, (byte) 1, j, false);
    }
}
