package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.9bV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C196639bV implements C202499m7 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C166557yt A01;
    public final /* synthetic */ C194759Uj A02;
    public final /* synthetic */ C193139Nh A03;

    public final void BaS(UserJid userJid, C166557yt r11, C166557yt r12, C166557yt r13, AnonymousClass34V r14, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C193639Pk r2;
        AnonymousClass4UC r0;
        String str4;
        BigDecimal bigDecimal;
        int i;
        C194759Uj r02 = this.A02;
        C193139Nh r1 = this.A03;
        Activity activity = this.A00;
        C166557yt r6 = this.A01;
        if (!z || r14 != null) {
            r2 = new C193639Pk(1);
            r2.A01 = r14;
            r0 = r1.A00.A00;
        } else {
            boolean z6 = z2;
            if (z3) {
                r02.A00.A00(activity, new C196089aH(r1, z6), userJid, r6, true, false);
                return;
            }
            AnonymousClass94u r3 = r1.A00;
            C195179Wl A0D = r3.A0D();
            A0D.A0P = z6;
            A0D.A09 = (String) C1899593h.A0X(r11);
            String str5 = str3;
            if (str3 != null) {
                A0D.A06 = str5;
            }
            if (!TextUtils.isEmpty(A0D.A0A) && (str4 = A0D.A02) != null && (str4.contentEquals("DEEP_LINK") || str4.contentEquals("GALLERY_QR_CODE"))) {
                String str6 = A0D.A0A;
                C85204Fi r4 = AnonymousClass1S3.A05;
                AnonymousClass39Q A0B = C1899693i.A0B(r4, str6);
                String A002 = r3.A06.A00(A0D.A06, A0D.A0C, z6);
                if (!C107575bX.A0F(A002)) {
                    bigDecimal = new BigDecimal(A002);
                    if (A0B != null && A0B.A00.compareTo(bigDecimal) > 0) {
                        i = 9;
                        if (z2) {
                            i = 8;
                        }
                    }
                } else {
                    bigDecimal = new BigDecimal(AnonymousClass9WY.A00(r3.A04, A0D));
                    if (A0B != null && A0B.A00.compareTo(bigDecimal) > 0) {
                        i = 7;
                    }
                }
                r2 = new C193639Pk(i);
                r2.A02 = r4.B3W(r3.A05, bigDecimal);
                r0 = r3.A00;
            }
            r3.A03.A0H(A0D);
            AnonymousClass94u.A00(r3);
            return;
        }
        r0.A0H(r2);
    }

    public /* synthetic */ C196639bV(Activity activity, C166557yt r2, C194759Uj r3, C193139Nh r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = r2;
    }
}
