package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.9A3  reason: invalid class name */
public class AnonymousClass9A3 extends C191819Go {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final C29441ip A05;
    public final C56612sH A06;
    public final C617332a A07;
    public final AnonymousClass31C A08;
    public final C40602Ha A09;
    public final C620933l A0A;
    public final AnonymousClass9U5 A0B;
    public final AnonymousClass9U4 A0C;
    public final C160757oG A0D = C160757oG.A00("BaseTokenAddCardAction", "network", "COMMON");
    public final AnonymousClass9SD A0E;
    public final AnonymousClass9TJ A0F;
    public final AnonymousClass9R4 A0G;
    public final C194259Se A0H;
    public final C193119Nf A0I;
    public final AnonymousClass28X A0J;
    public final AnonymousClass4FS A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        C160757oG r1;
        String str2;
        AnonymousClass0PJ r0 = (AnonymousClass0PJ) obj;
        AnonymousClass34V r2 = null;
        if (r0 != null) {
            String str3 = (String) r0.A00;
            r2 = (AnonymousClass34V) r0.A01;
            if (str3 != null) {
                Log.i("PAY: BrazilAddCardAction sendAddCard token success");
                String A022 = AnonymousClass35J.A02(this.A04, this.A06);
                AnonymousClass31C r24 = this.A08;
                String A032 = r24.A03();
                String A012 = this.A0H.A01();
                Locale locale = Locale.US;
                Object[] A0L2 = AnonymousClass002.A0L();
                int i = this.A00;
                AnonymousClass000.A1L(A0L2, i);
                String format = String.format(locale, "%02d", A0L2);
                int i2 = this.A01;
                String num = Integer.toString(i2);
                Boolean bool = this.A0L;
                if (bool == null || bool.booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                AnonymousClass9SD r6 = this.A0E;
                String str4 = this.A0M;
                AnonymousClass9Q0 r02 = r6.A00;
                AnonymousClass9IF r7 = null;
                if (r02 != null && r02.A00 == 5) {
                    String str5 = r02.A02;
                    r02.A02 = null;
                    String A002 = r6.A0H.A00(5);
                    String A082 = r6.A0E.A08();
                    StringBuilder A0m = AnonymousClass000.A0m(str5, A002);
                    A0m.append(A082);
                    A0m.append(str4.replaceAll("\\s", ""));
                    A0m.append(i);
                    Locale locale2 = Locale.US;
                    Object[] A0L3 = AnonymousClass002.A0L();
                    AnonymousClass000.A1L(A0L3, i2 % 100);
                    String A0X = AnonymousClass000.A0X(String.format(locale2, "%02d", A0L3), A0m);
                    C194929Vc r03 = r6.A0C;
                    String A052 = r03.A05(A0X);
                    if (A052 == null) {
                        r1 = r6.A01;
                        str2 = "device_signature is null";
                    } else {
                        String A062 = r03.A06(A0X);
                        if (A062 == null) {
                            r1 = r6.A01;
                            str2 = "wallet_signature is null";
                        } else if (str5 == null) {
                            r1 = r6.A01;
                            str2 = "challenge_id is null";
                        } else {
                            r7 = new AnonymousClass9IF(A052, A062, str5);
                        }
                    }
                    r1.A05(str2);
                }
                C35351wj A0W = C1899693i.A0W(A032);
                C56052rL A013 = C56052rL.A01();
                C1899593h.A1M(A013);
                C56052rL A0U = C1899593h.A0U();
                C56052rL.A0D(A0U, "action", "br-add-card");
                C1899593h.A1O(A0U, A012, false);
                C1899593h.A1N(A0U, A022);
                if (C626836d.A0M(format, 2, 2, false)) {
                    C56052rL.A0D(A0U, "card-expiry-month", format);
                }
                if (C626836d.A0M(num, 4, 4, false)) {
                    C56052rL.A0D(A0U, "card-expiry-year", num);
                }
                if (C1899693i.A10(str3, 1, false)) {
                    C56052rL.A0D(A0U, "token", str3);
                }
                A0U.A0K(str, "is_first_card", C192069Ib.A00);
                if (r7 != null) {
                    A0U.A0H(r7.A00);
                }
                r24.A0D(new C203889oT(this.A02, this.A09, this.A03, this, 0), C41032Ir.A03(A0U, A013, A0W), A032, 204, 0);
                return;
            }
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilAddCardAction token error: ", r2);
        this.A0G.A00((C133736hr) null, r2, (ArrayList) null, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9A3(android.content.Context r14, X.C69263Wi r15, X.C56972sr r16, X.C29441ip r17, X.C56612sH r18, X.C617332a r19, X.AnonymousClass31C r20, X.C40602Ha r21, X.C620933l r22, X.AnonymousClass9U5 r23, X.AnonymousClass9U4 r24, X.AnonymousClass9SD r25, X.AnonymousClass9TJ r26, X.AnonymousClass9R4 r27, X.C194259Se r28, X.C193119Nf r29, X.AnonymousClass28X r30, X.AnonymousClass4FS r31, java.lang.Boolean r32, java.lang.String r33, java.lang.String r34, int r35, int r36) {
        /*
            r13 = this;
            r3 = r31
            r11 = r29
            r4 = r28
            r5 = r24
            X.C18260x0.A0f(r15, r3, r11, r4, r5)
            r10 = r23
            r9 = r22
            r6 = r21
            r8 = r17
            r12 = r30
            X.C18260x0.A0g(r9, r12, r10, r8, r6)
            r0 = 11
            r2 = r33
            X.C162457s7.A0J(r2, r0)
            r0 = 12
            r1 = r34
            X.C162457s7.A0J(r1, r0)
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A03 = r15
            r13.A0K = r3
            r13.A0I = r11
            r13.A0H = r4
            r13.A0C = r5
            r13.A0A = r9
            r13.A0J = r12
            r13.A0B = r10
            r13.A05 = r8
            r13.A09 = r6
            r13.A0M = r2
            r13.A0N = r1
            r0 = r35
            r13.A00 = r0
            r0 = r36
            r13.A01 = r0
            java.lang.String r2 = "network"
            java.lang.String r1 = "COMMON"
            java.lang.String r0 = "BaseTokenAddCardAction"
            X.7oG r0 = X.C160757oG.A00(r0, r2, r1)
            r13.A0D = r0
            r0 = r18
            r13.A06 = r0
            r13.A02 = r14
            r0 = r16
            r13.A04 = r0
            r0 = r20
            r13.A08 = r0
            r0 = r26
            r13.A0F = r0
            r0 = r25
            r13.A0E = r0
            r0 = r19
            r13.A07 = r0
            r0 = r32
            r13.A0L = r0
            r0 = r27
            r13.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9A3.<init>(android.content.Context, X.3Wi, X.2sr, X.1ip, X.2sH, X.32a, X.31C, X.2Ha, X.33l, X.9U5, X.9U4, X.9SD, X.9TJ, X.9R4, X.9Se, X.9Nf, X.28X, X.4FS, java.lang.Boolean, java.lang.String, java.lang.String, int, int):void");
    }
}
