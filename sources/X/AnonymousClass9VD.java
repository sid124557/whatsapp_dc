package X;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9VD  reason: invalid class name */
public class AnonymousClass9VD {
    public static final long[] A0K = {3, 2, 15};
    public HandlerThread A00;
    public C203039n1 A01;
    public C1901193x A02;
    public String A03;
    public String A04;
    public final C69263Wi A05;
    public final C54292oU A06;
    public final C617332a A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass9U1 A0A;
    public final C196629bS A0B;
    public final C40602Ha A0C;
    public final C153607bd A0D;
    public final AnonymousClass9U4 A0E;
    public final C197109ca A0F;
    public final AnonymousClass9B3 A0G;
    public final AnonymousClass9VY A0H;
    public final C194259Se A0I;
    public final AnonymousClass4FS A0J;

    public AnonymousClass9VD(C69263Wi r10, C54292oU r11, C617332a r12, AnonymousClass1VX r13, AnonymousClass31C r14, AnonymousClass99H r15, AnonymousClass9U1 r16, C196629bS r17, C40602Ha r18, AnonymousClass9U4 r19, C203039n1 r20, C197109ca r21, AnonymousClass9B3 r22, AnonymousClass9VY r23, C194259Se r24, AnonymousClass4FS r25) {
        String A062;
        String str;
        this.A08 = r13;
        this.A05 = r10;
        this.A06 = r11;
        this.A0J = r25;
        this.A09 = r14;
        C194259Se r7 = r24;
        this.A0I = r7;
        this.A0E = r19;
        AnonymousClass9U1 r4 = r16;
        this.A0A = r4;
        this.A07 = r12;
        this.A0C = r18;
        C196629bS r5 = r17;
        this.A0B = r5;
        this.A0H = r23;
        this.A0F = r21;
        this.A0G = r22;
        this.A0D = r4.A04;
        this.A01 = r20;
        AnonymousClass99H r3 = r15;
        this.A03 = r4.A04(r15);
        AnonymousClass99E A002 = r4.A00(r15);
        if (A002 != null) {
            Bundle bundle = A002.A00;
            if (bundle != null) {
                str = bundle.getString("transactionPrefix");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle2 = A002.A00;
                if (bundle2 != null) {
                    A062 = bundle2.getString("transactionPrefix");
                } else {
                    A062 = null;
                }
                this.A04 = A062;
                HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
                this.A00 = handlerThread;
                handlerThread.start();
                this.A02 = new C1901193x(this.A00.getLooper(), r3, r4, r5, this, r7, this.A03);
            }
        }
        A062 = r4.A0A.A06();
        this.A04 = A062;
        HandlerThread handlerThread2 = new HandlerThread("PAY: device binding iq sender");
        this.A00 = handlerThread2;
        handlerThread2.start();
        this.A02 = new C1901193x(this.A00.getLooper(), r3, r4, r5, this, r7, this.A03);
    }

    public void A00(AnonymousClass99H r25, String str) {
        String A042;
        Log.i("PAY: sendGetBankAccounts called");
        C153607bd r13 = this.A0D;
        r13.A03("upi-get-accounts");
        AnonymousClass31C r12 = this.A09;
        String A032 = r12.A03();
        C196629bS r2 = this.A0B;
        AnonymousClass99H r3 = r25;
        if (!TextUtils.isEmpty(r2.A07())) {
            A042 = r2.A07();
        } else {
            A042 = this.A0A.A04(r3);
        }
        String A012 = this.A0I.A01();
        Long A0h = C18290x4.A0h(r3.A0C);
        String str2 = r3.A0A;
        C35371wl A0X = C1899693i.A0X(A032);
        AnonymousClass9B3 r4 = null;
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-get-accounts");
        C1899593h.A1O(A0U, A012, false);
        if (C626836d.A0J(A0h, -9007199254740991L, 9007199254740991L, false)) {
            C56052rL.A0A(A0U, A0h, "code");
        }
        if (C1899693i.A0z(A042, 1, false)) {
            C56052rL.A0D(A0U, "provider-type", A042);
        }
        if (str2 != null && C1899593h.A1Z(str2, 0, true)) {
            C56052rL.A0D(A0U, "bank-ref-id", str2);
        }
        A0U.A0K(str, "account-type", C192099Ie.A00);
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A013, A0X);
        boolean A0X2 = this.A08.A0X(2227);
        String str3 = "in_upi_get_accounts_tag";
        if (A0X2) {
            this.A0G.A02(185478423, str3);
        }
        C197109ca r32 = this.A0F;
        r32.A08((AnonymousClass34V) null, 18, 0);
        Context context = this.A06.A00;
        C69263Wi r1 = this.A05;
        C40602Ha r0 = this.A0C;
        if (A0X2) {
            r4 = this.A0G;
        } else {
            str3 = null;
        }
        C69263Wi r16 = r1;
        C1899593h.A1C(r12, new C203919oW(context, r16, r0, r13, this, r32, r4, str3, 3), A033, A032);
    }
}
