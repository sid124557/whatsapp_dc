package com.whatsapp.payments.viewmodel;

import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass31C;
import X.AnonymousClass39Q;
import X.AnonymousClass9A6;
import X.AnonymousClass9OC;
import X.AnonymousClass9R9;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C05550Ty;
import X.C153087ae;
import X.C153607bd;
import X.C1899593h;
import X.C1899693i;
import X.C193369Of;
import X.C195179Wl;
import X.C196629bS;
import X.C203929oX;
import X.C205049qL;
import X.C35371wl;
import X.C40602Ha;
import X.C41032Ir;
import X.C54292oU;
import X.C54412og;
import X.C56052rL;
import X.C56612sH;
import X.C620933l;
import X.C626936e;
import X.C66663Mh;
import X.C69263Wi;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiSecureQrCodeViewModel extends C05550Ty {
    public final AnonymousClass08J A00;
    public final AnonymousClass08J A01;
    public final AnonymousClass08M A02;
    public final C69263Wi A03;
    public final C66663Mh A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C54412og A07;
    public final AnonymousClass31C A08;
    public final C196629bS A09;
    public final C40602Ha A0A;
    public final AnonymousClass9U5 A0B;
    public final C153087ae A0C;
    public final AnonymousClass9U4 A0D;

    public C195179Wl A0D() {
        Object A072 = this.A00.A07();
        C626936e.A06(A072);
        return (C195179Wl) A072;
    }

    public final void A0E(int i) {
        int i2 = i;
        if (this.A04.A08(C66663Mh.A0i)) {
            this.A01.A0H(new C193369Of(2, -1));
            C196629bS r8 = this.A09;
            synchronized (r8) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    C620933l r6 = r8.A03;
                    String A062 = r6.A06();
                    if (!TextUtils.isEmpty(A062)) {
                        JSONObject A1H = AnonymousClass0x9.A1H(A062);
                        for (String remove : strArr) {
                            A1H.remove(remove);
                        }
                        C1899593h.A1D(r6, A1H);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e);
                }
            }
            C195179Wl A0D2 = A0D();
            A0D2.A0I = null;
            A0D2.A04 = "02";
            this.A00.A0H(A0D2);
            AnonymousClass9A6 r82 = new AnonymousClass9A6(this.A06.A00, this.A03, this.A08, this.A0A, new C153607bd(), this.A0B);
            String A063 = A0D().A06();
            AnonymousClass9R9 r9 = new AnonymousClass9R9(this, i2);
            AnonymousClass31C r10 = r82.A02;
            String A032 = r10.A03();
            C35371wl A0X = C1899693i.A0X(A032);
            C56052rL A012 = C56052rL.A01();
            C56052rL.A0E(A012, "xmlns", "w:pay");
            C56052rL A0U = C1899593h.A0U();
            C56052rL.A0D(A0U, "action", "upi-sign-qr-code");
            if (C1899693i.A10(A063, 1, false)) {
                C56052rL.A0D(A0U, "qr-code", A063);
            }
            r10.A0D(new C203929oX(r82.A00, r82.A01, r82.A03, AnonymousClass9OC.A02(r82, "upi-sign-qr-code"), r82, r9), C41032Ir.A03(A0U, A012, A0X), A032, 204, 0);
            return;
        }
        this.A01.A0H(new C193369Of(0, i2));
        return;
    }

    public final void A0F(String str, int i) {
        C193369Of r1;
        AnonymousClass08J r5 = this.A00;
        C195179Wl r4 = (C195179Wl) r5.A07();
        if (str.equals(r4.A0A)) {
            r1 = new C193369Of(3, i);
        } else {
            C153087ae r12 = this.A0C;
            AnonymousClass39Q r3 = ((AnonymousClass1S3) r12.A01()).A01;
            AnonymousClass39Q A0B2 = C1899693i.A0B(r12.A01(), str);
            if (A0B2 == null || A0B2.A00.compareTo(r3.A00) < 0) {
                r4.A0A = null;
                r5.A0H(r4);
                r1 = new C193369Of(0, i);
            } else {
                r4.A0A = str;
                r5.A0H(r4);
                A0E(i);
                return;
            }
        }
        this.A01.A0H(r1);
    }

    public IndiaUpiSecureQrCodeViewModel(C69263Wi r7, C66663Mh r8, C56612sH r9, C54292oU r10, C54412og r11, AnonymousClass31C r12, C196629bS r13, C40602Ha r14, AnonymousClass9U5 r15, C153087ae r16, AnonymousClass9U4 r17) {
        AnonymousClass08J r5 = new AnonymousClass08J();
        this.A01 = r5;
        AnonymousClass08J r2 = new AnonymousClass08J();
        this.A00 = r2;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A02 = A012;
        this.A05 = r9;
        this.A03 = r7;
        this.A06 = r10;
        this.A04 = r8;
        this.A08 = r12;
        this.A0D = r17;
        this.A0B = r15;
        this.A0C = r16;
        this.A0A = r14;
        this.A09 = r13;
        this.A07 = r11;
        r5.A0H(new C193369Of(0, -1));
        r2.A0H(new C195179Wl());
        r2.A0J(A012, C205049qL.A00(this, 69));
    }
}
