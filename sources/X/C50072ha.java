package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2ha  reason: invalid class name and case insensitive filesystem */
public class C50072ha {
    public String A00;
    public final C56972sr A01;
    public final C64663Ek A02;
    public final C56612sH A03;
    public final C61072zf A04;
    public final C621133n A05;
    public final AnonymousClass4FV A06;

    public final String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        DeviceJid primaryDevice = C56972sr.A05(this.A01).getPrimaryDevice();
        C64663Ek r2 = this.A02;
        String A042 = C64663Ek.A04(r2.A03.A00.A04().A01, this.A05.A08(AnonymousClass36G.A02(primaryDevice)));
        this.A00 = A042;
        if (A042 == null) {
            Log.w("CompanionSyncStatsLogger/getBootstrapSessionId MD session ID is null");
        }
        return this.A00;
    }

    public void A01(AnonymousClass1DW r7, C21891Do r8, String str, long j, boolean z) {
        C25421aU r4 = new C25421aU();
        int i = 1;
        r4.A01 = Integer.valueOf(C18280x3.A01(z ? 1 : 0));
        r4.A07 = A00();
        long j2 = 0;
        if (r7 != null) {
            j2 = 0 + r7.fileSizeBytes_;
        }
        if (r8 != null) {
            j2 += (long) r8.A0D((C186358vA) null);
            if ((r8.bitField0_ & 2) != 0) {
                AnonymousClass1DW r0 = r8.externalMutations_;
                if (r0 == null) {
                    r0 = AnonymousClass1DW.DEFAULT_INSTANCE;
                }
                j2 += r0.fileSizeBytes_;
            }
        }
        r4.A02 = Long.valueOf(j2);
        if (!AnonymousClass33W.A09.contains(str)) {
            i = 2;
        }
        r4.A00 = Integer.valueOf(i);
        long A0H = this.A03.A0H();
        r4.A06 = Long.valueOf(A0H);
        r4.A03 = C18310x6.A0f(A0H, j);
        C61072zf r1 = this.A04;
        long A052 = r1.A05();
        r4.A04 = Long.valueOf(A052);
        r4.A05 = C18310x6.A0f(A052, r1.A03());
        this.A06.BhD(r4);
    }

    public C50072ha(C56972sr r1, C64663Ek r2, C56612sH r3, C61072zf r4, C621133n r5, AnonymousClass4FV r6) {
        this.A03 = r3;
        this.A01 = r1;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r5;
    }
}
