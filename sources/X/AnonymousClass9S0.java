package X;

import android.content.Context;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9S0  reason: invalid class name */
public class AnonymousClass9S0 {
    public static C191879Gu A09;
    public static C191809Gn A0A;
    public final C55682qk A00;
    public final AnonymousClass9AC A01;
    public final C203309nU A02;
    public final C85134Fb A03;
    public final C620933l A04;
    public final C385127z A05;
    public final C115115o9 A06;
    public final C194259Se A07;
    public final AnonymousClass4FS A08;

    public synchronized void A00() {
        Log.d("PAY: IndiaUpiSetupCoordinator/getChallenge called");
        C194259Se r9 = this.A07;
        C115115o9 r8 = this.A06;
        C55682qk r3 = this.A00;
        boolean A1T = AnonymousClass000.A1T(this.A04.A03().getBoolean("payments_sandbox", false) ? 1 : 0);
        C203309nU r5 = this.A02;
        C191879Gu r2 = new C191879Gu(r3, this.A01, r5, this.A03, this.A05, r8, r9, A1T);
        A09 = r2;
        AnonymousClass0x7.A1B(r2, this.A08);
    }

    public AnonymousClass9S0(C55682qk r15, C69263Wi r16, C56972sr r17, C54292oU r18, AnonymousClass31C r19, C196629bS r20, C203309nU r21, C40602Ha r22, C153607bd r23, C85134Fb r24, C620933l r25, AnonymousClass9U5 r26, C385127z r27, C197109ca r28, C115115o9 r29, C194259Se r30, AnonymousClass4FS r31) {
        String str;
        this.A00 = r15;
        AnonymousClass4FS r12 = r31;
        this.A08 = r12;
        C115115o9 r10 = r29;
        this.A06 = r10;
        C194259Se r11 = r30;
        this.A07 = r11;
        this.A04 = r25;
        this.A05 = r27;
        this.A03 = r24;
        C203309nU r5 = r21;
        this.A02 = r5;
        Context context = r18.A00;
        PhoneUserJid A042 = C56972sr.A04(r17);
        if (A042 == null) {
            str = null;
        } else {
            str = A042.user;
        }
        C626936e.A06(str);
        this.A01 = new AnonymousClass9AC(context, r16, r19, r20, r5, r22, r23, r26, r28, r10, r11, r12, str);
    }
}
