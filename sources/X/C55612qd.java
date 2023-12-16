package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2qd  reason: invalid class name and case insensitive filesystem */
public class C55612qd {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C621033m A02;
    public final C56962sq A03;
    public final AnonymousClass5TW A04;
    public final C56512s6 A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final AnonymousClass5ZR A08;
    public final C61072zf A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final AnonymousClass4FS A0C;
    public final C45182Yz A0D;

    public void A01(AnonymousClass5TQ r9, long j, boolean z) {
        this.A0C.BkP(new C71413c4(this, r9, 1, j, z));
    }

    public void A00(AnonymousClass3QO r4, C30721mu r5, File file) {
        if (file == null || !this.A0A.A0Y(C58422vE.A02, 746)) {
            this.A02.A0N(r4, r5);
            if (file != null) {
                this.A0C.BkM(new C71273bq((Object) file, 24));
                return;
            }
            return;
        }
        this.A0C.BkO(new AnonymousClass1t9(this.A02, r4, r5, file), new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.getCallState() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass4FU r5) {
        /*
            r4 = this;
            X.33i r0 = r4.A06
            android.telephony.TelephonyManager r3 = r0.A0N()
            r2 = 0
            if (r3 == 0) goto L_0x0015
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 >= r0) goto L_0x0022
            int r0 = r3.getCallState()
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            X.5TW r0 = r4.A04
            boolean r1 = r0.A01()
            r0 = 2131889133(0x7f120bed, float:1.941292E38)
            if (r1 != 0) goto L_0x0034
            r0 = 1
            return r0
        L_0x0022:
            X.5ZR r0 = r4.A08     // Catch:{ SecurityException -> 0x0015 }
            boolean r0 = r0.A0F()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 == 0) goto L_0x0015
            int r0 = r3.getCallStateForSubscription()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            r0 = 2131889134(0x7f120bee, float:1.9412923E38)
        L_0x0034:
            r5.Bot(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55612qd.A04(X.4FU):boolean");
    }

    public C55612qd(C64393Dh r1, C69263Wi r2, C621033m r3, C56962sq r4, AnonymousClass5TW r5, C56512s6 r6, C620633i r7, C56612sH r8, AnonymousClass5ZR r9, C61072zf r10, AnonymousClass1VX r11, AnonymousClass4FV r12, AnonymousClass4FS r13, C45182Yz r14) {
        this.A07 = r8;
        this.A0A = r11;
        this.A01 = r2;
        this.A0C = r13;
        this.A00 = r1;
        this.A0B = r12;
        this.A02 = r3;
        this.A09 = r10;
        this.A0D = r14;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
    }

    public void A02(AnonymousClass5TQ r6, long j, boolean z) {
        try {
            r6.A01();
        } catch (Exception e) {
            if (!z || j < 1000) {
                C18260x0.A1L(AnonymousClass000.A0l("pttutils/stopaudiorecordandvisualization/stopaudiorecord "), e.toString());
            } else {
                Log.e("pttutils/stopaudiorecordandvisualization/stopaudiorecord ", e);
            }
        } catch (Throwable th) {
            A01(r6, j, z);
            throw th;
        }
        A01(r6, j, z);
    }

    public boolean A03(C003203q r8, AnonymousClass4FU r9, C95814uZ r10) {
        if (A04(r9)) {
            Log.i("voicenote/startvoicenote");
            if (this.A05.A08(new C86554Ko(r8, 0, this))) {
                if (this.A09.A02() < C56952sp.A06(this.A0A, 3657) * 1048576) {
                    AnonymousClass35X.A05(r8, r9, this.A0B, 7);
                } else if (!this.A03.A0P(AnonymousClass32Y.A03(r10))) {
                    return true;
                } else {
                    C621433s.A01(r8, 106);
                    return false;
                }
            }
        }
        return false;
    }
}
