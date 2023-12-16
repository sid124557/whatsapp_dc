package X;

import android.os.SystemClock;

/* renamed from: X.2oC  reason: invalid class name and case insensitive filesystem */
public final class C54112oC {
    public int A00;
    public int A01;
    public long A02;
    public long A03 = -1;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public final C56612sH A07;
    public final AnonymousClass4FV A08;
    public final C45582aF A09;
    public final C45152Yw A0A;
    public final C72173dI A0B;
    public final AnonymousClass4FS A0C;
    public volatile long A0D;

    public final synchronized void A00(int i) {
        synchronized (this) {
            int i2 = this.A01;
            if (i2 <= i) {
                while (true) {
                    this.A0D = (1 << i2) | this.A0D;
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public final void A01(long j) {
        this.A06 = true;
        this.A04 = this.A0C.Bkn(new C117095rN(this, 8), "BitArrayLogger/recordInteraction", 64000);
        this.A03 = j;
        this.A0D = 0;
        C45582aF r1 = this.A09;
        this.A00 = r1.A00();
        this.A02 = this.A07.A0H() - AnonymousClass0x2.A0A(r1.A02.A00(), "session_start_timestamp");
    }

    public final synchronized void A02(long j) {
        synchronized (this) {
            if (this.A05) {
                A00((int) j);
            } else {
                this.A06 = false;
            }
            C25331aL r5 = new C25331aL();
            r5.A02 = AnonymousClass0x9.A0m((int) this.A0D);
            r5.A00 = Long.valueOf(this.A0D >> 32);
            r5.A06 = AnonymousClass0x9.A0m(this.A00);
            r5.A04 = Long.valueOf(this.A02);
            long j2 = 0;
            for (long j3 = this.A0D; j3 != 0; j3 >>>= 1) {
                j2 += 1 & j3;
            }
            C45152Yw r6 = this.A0A;
            int i = r6.A00().getInt("cumulative_bits", 0);
            C18270x1.A0h(r6.A00().edit(), "cumulative_bits", i + ((int) j2));
            r5.A03 = AnonymousClass0x9.A0m(r6.A00().getInt("cumulative_bits", 0));
            C18270x1.A0h(r6.A00().edit(), "bit_array_session_sequence", r6.A00().getInt("bit_array_session_sequence", 0) + 1);
            r5.A05 = AnonymousClass0x9.A0m(r6.A00().getInt("bit_array_session_sequence", 0));
            r5.A01 = Long.valueOf(j);
            this.A08.BhA(r5);
            if (this.A05) {
                A01(C18290x4.A0B(SystemClock.elapsedRealtime()));
                this.A01 = 0;
            }
        }
    }

    public C54112oC(C56612sH r3, AnonymousClass4FV r4, C45582aF r5, C45152Yw r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r3, r7, r4, r5, r6);
        this.A07 = r3;
        this.A0C = r7;
        this.A08 = r4;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = C72173dI.A00(r7);
    }
}
