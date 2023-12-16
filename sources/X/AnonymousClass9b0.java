package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9b0  reason: invalid class name */
public class AnonymousClass9b0 implements C837549q {
    public final C69263Wi A00;
    public final C54292oU A01;
    public final C66543Lv A02;
    public final C617332a A03;
    public final C40602Ha A04;
    public final C620933l A05;
    public final C29271iY A06;
    public final AnonymousClass9U5 A07;
    public final AnonymousClass9U4 A08;
    public final C194639Tx A09;

    @Deprecated
    public void BlS(AnonymousClass4EY r3, String str) {
        A00(r3, this.A08.A0G(), str, false);
    }

    public void A02(C29491iu r8) {
        List list = r8.A01;
        if (list != null && list.size() > 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = r8.A01.iterator();
            while (it.hasNext()) {
                C624034w A0E = C1899693i.A0E(it);
                AnonymousClass2z0 A0R = C1899593h.A0R(A0E);
                if (A0E.A0P || A0R.A00 == null || A0R.A01 == null) {
                    A0s2.add(A0E);
                } else {
                    AnonymousClass0x2.A1G(A0R, A0E, A0s);
                }
            }
            if (!A0s2.isEmpty()) {
                C194569Tl A002 = AnonymousClass9U4.A00(this.A08);
                C626936e.A06(A002);
                List list2 = r8.A01;
                C200069hj r2 = new C200069hj(this, A0s2);
                AnonymousClass0x7.A1B(new C203869oR(A002, r2, list2), A002.A03);
            }
            if (!A0s.isEmpty()) {
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    AnonymousClass0PJ r0 = (AnonymousClass0PJ) it2.next();
                    this.A02.A0L((C624034w) r0.A01, (AnonymousClass2z0) r0.A00);
                }
            }
        }
    }

    public AnonymousClass9b0(C69263Wi r1, C54292oU r2, C66543Lv r3, C617332a r4, C40602Ha r5, C620933l r6, C29271iY r7, AnonymousClass9U5 r8, AnonymousClass9U4 r9, C194639Tx r10) {
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A09 = r10;
        this.A07 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
    }

    public void A00(AnonymousClass4EY r16, C203719oC r17, String str, boolean z) {
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        C201629kS r5 = new C201629kS(r0.generatePublicKey(B3i), B3i);
        AnonymousClass39V[] r4 = new AnonymousClass39V[4];
        boolean A0F = AnonymousClass39V.A0F("action", "get-transaction", r4);
        int A0G = AnonymousClass39V.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r4);
        if (!z) {
            A0G = 2;
        }
        r4[2] = new AnonymousClass39V("version", A0G);
        if (!r5.A00.get()) {
            AnonymousClass39V.A07("client-public-key", Base64.encodeToString(r5.A02, 10), r4);
            AnonymousClass36K A0U = C1899693i.A0U(r4);
            AnonymousClass9U5 r9 = this.A07;
            C203499no B7b = r17.B7b();
            Context context = this.A01.A00;
            C69263Wi r7 = this.A00;
            AnonymousClass4EY r2 = r16;
            r9.A0G(new C1907899v(context, r2, this.A04, this, r5, B7b, r7, A0F), A0U, "get", 0);
            return;
        }
        throw AnonymousClass001.A0e("key has been destroyed");
    }

    public void A01(AnonymousClass4EY r16, Integer num, Integer num2, String str, String str2) {
        C203719oC A0H;
        C203499no r6;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "get-transactions", A0s);
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            AnonymousClass39V.A03("after", str3, A0s);
        }
        if (num != null) {
            C1899593h.A1S("version", A0s, num.intValue());
        }
        if (num2 != null) {
            C1899593h.A1S("limit", A0s, num2.intValue());
        }
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        C201629kS r5 = new C201629kS(r0.generatePublicKey(B3i), B3i);
        if (!r5.A00.get()) {
            AnonymousClass39V.A03("client-public-key", Base64.encodeToString(r5.A02, 10), A0s);
            AnonymousClass36K A0T = C1899593h.A0T(A0s);
            String str4 = str2;
            boolean A0F = C107575bX.A0F(str4);
            AnonymousClass9U4 r02 = this.A08;
            if (A0F) {
                A0H = r02.A0G();
            } else {
                A0H = r02.A0H(str4);
                if (A0H == null) {
                    r6 = null;
                    AnonymousClass4EY r2 = r16;
                    this.A07.A0G(new C1907899v(this.A01.A00, r2, this.A04, this, r5, r6, this.A00, true), A0T, "get", 0);
                    return;
                }
            }
            r6 = A0H.B7b();
            if (r6 != null) {
                r6.Bq0();
            }
            AnonymousClass4EY r22 = r16;
            this.A07.A0G(new C1907899v(this.A01.A00, r22, this.A04, this, r5, r6, this.A00, true), A0T, "get", 0);
            return;
        }
        throw AnonymousClass001.A0e("key has been destroyed");
    }
}
