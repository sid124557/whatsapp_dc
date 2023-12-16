package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.2qX  reason: invalid class name and case insensitive filesystem */
public class C55552qX {
    public C48412er A00;
    public C48412er A01;
    public C57162tC A02;
    public final C59252wc A03;
    public final C40122Ep A04;
    public final C45792aa A05;
    public final C59842xa A06;
    public final AnonymousClass30P A07;
    public final AnonymousClass4FS A08;
    public final C55742qq A09;
    public final Set A0A;

    public void A03(AnonymousClass39C r10, C84724Dl r11, Boolean bool, String str, String str2, String str3) {
        A04(r10, r11, bool, str, str2, str3, this.A0A.contains(str));
    }

    public void A01(C46202bF r4, C84724Dl r5, String str) {
        int i = r4.A00;
        if (i != 5) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BloksLayoutFetcherImpl: status: ");
            A0o.append(i);
            C18260x0.A0q(", errorMessage: ", str, A0o);
            if (r4.A02 == null) {
                r4.A02 = AnonymousClass002.A0E(str);
            }
            r5.BaN(r4);
            return;
        }
        Log.d("BloksLayoutFetcherImpl: Layout fetching succesful");
        throw AnonymousClass001.A0e("Successful responses should not be processed as errors");
    }

    public void A02(C46202bF r3, C84724Dl r4, String str, boolean z) {
        if (z) {
            C159437lp.A00(new AnonymousClass3E8(this, r3, r4), this.A00, str);
            return;
        }
        C159437lp.A01(new AnonymousClass3E9(this, r3, r4), this.A00, str);
    }

    public void A04(AnonymousClass39C r13, C84724Dl r14, Boolean bool, String str, String str2, String str3, boolean z) {
        String str4 = str;
        C626936e.A06(str4);
        C46202bF r5 = new C46202bF();
        Iterator A0q = AnonymousClass000.A0q(this.A04.A00);
        while (true) {
            AnonymousClass39C r6 = r13;
            C84724Dl r7 = r14;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C18280x3.A1X(str4, (Pattern) A0w.getKey()) && ((C41192Jh) A0w.getValue()).A01.BHU(str4, str5)) {
                    AnonymousClass49J r4 = ((C41192Jh) A0w.getValue()).A00;
                    C18260x0.A0q("BloksLayoutFetcherImpl/executeCustomBloksRequest appId:", str4, AnonymousClass001.A0o());
                    this.A08.BkM(new C71013bQ(this, r4, r5, r6, r7, str4, str5, str6, z2));
                    return;
                }
            } else {
                A00(C54662p5.A00(), r5, r13, r14, bool, str4, str5, str6, z2);
                return;
            }
        }
    }

    public C55552qX(C59252wc r1, C48412er r2, C40122Ep r3, C45792aa r4, C59842xa r5, AnonymousClass30P r6, AnonymousClass4FS r7, C55742qq r8, Set set) {
        this.A00 = r2;
        this.A0A = set;
        this.A09 = r8;
        this.A08 = r7;
        this.A03 = r1;
        this.A06 = r5;
        this.A07 = r6;
        this.A04 = r3;
        this.A05 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r3.booleanValue() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C54662p5 r25, X.C46202bF r26, X.AnonymousClass39C r27, X.C84724Dl r28, java.lang.Boolean r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
            r24 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "REQUEST: "
            r1.append(r0)
            r12 = r30
            r1.append(r12)
            java.lang.String r0 = ", params: "
            r1.append(r0)
            r13 = r31
            r1.append(r13)
            java.lang.String r0 = ", isAsyncAction: "
            r1.append(r0)
            r2 = r33
            r1.append(r2)
            java.lang.String r0 = ", isPrefetch: "
            r3 = r29
            X.C18260x0.A1P(r1, r0, r3)
            if (r29 == 0) goto L_0x0033
            boolean r0 = r3.booleanValue()
            r16 = 0
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            r16 = 1
        L_0x0035:
            r6 = r24
            X.2aa r1 = r6.A05
            X.2Jj r5 = r1.A00(r12)
            r4 = 0
            X.2Ji r0 = r5.A01
            X.2iy r3 = r0.A01
            if (r3 != 0) goto L_0x005f
            X.2Eq r3 = r5.A00
            long r0 = r0.A00
            X.49L r3 = r3.A00
            r21 = r4
            r17 = r3
            r18 = r4
            r19 = r12
            r20 = r13
            r22 = r0
            X.1dg r8 = r17.B0z(r18, r19, r20, r21, r22)
        L_0x005a:
            r15 = r32
            if (r32 == 0) goto L_0x007e
            goto L_0x006b
        L_0x005f:
            X.4AM r1 = r1.A01
            X.3Oa r0 = new X.3Oa
            r0.<init>(r5, r12, r13)
            X.3Ou r8 = r1.B0i(r3, r4, r0)
            goto L_0x005a
        L_0x006b:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r15)     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r0 = "FDS_INSTANCE_KEY"
            java.lang.String r14 = r1.getString(r0)     // Catch:{ JSONException -> 0x0078 }
            if (r14 != 0) goto L_0x0086
            goto L_0x007e
        L_0x0078:
            java.lang.String r0 = "qpl params parsing failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007e:
            int r0 = r8.hashCode()
            java.lang.String r14 = java.lang.String.valueOf(r0)
        L_0x0086:
            X.3Xa r11 = new X.3Xa
            r19 = r28
            r17 = r11
            r18 = r6
            r20 = r14
            r21 = r13
            r22 = r16
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BloksLayoutFetcherImpl/postRequest appId:"
            X.C18260x0.A0q(r0, r12, r1)
            X.4FS r0 = r6.A08
            X.3bf r5 = new X.3bf
            r7 = r25
            r9 = r26
            r10 = r27
            r17 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.BkM(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55552qX.A00(X.2p5, X.2bF, X.39C, X.4Dl, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
