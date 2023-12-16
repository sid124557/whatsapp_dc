package X;

import java.util.HashMap;

/* renamed from: X.3bf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71163bf implements Runnable {
    public final /* synthetic */ C55552qX A00;
    public final /* synthetic */ C54662p5 A01;
    public final /* synthetic */ C84594Cy A02;
    public final /* synthetic */ C46202bF A03;
    public final /* synthetic */ AnonymousClass39C A04;
    public final /* synthetic */ C84724Dl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public final void run() {
        String str;
        C59842xa r3;
        String str2;
        C55552qX r5 = this.A00;
        AnonymousClass39C r8 = this.A04;
        String str3 = this.A07;
        String str4 = this.A08;
        C46202bF r7 = this.A03;
        String str5 = this.A09;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        C84724Dl r9 = this.A05;
        C84594Cy r1 = this.A02;
        C54662p5 r6 = this.A01;
        String str6 = this.A06;
        HashMap hashMap = null;
        if (r8 != null) {
            str = r8.A01;
        } else {
            str = "PRELOAD";
        }
        String str7 = (String) r5.A09.A01(r5.A03.A00(str3, str4), str);
        if (str7 != null) {
            r7.A03 = true;
            int length = str7.length();
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("EVENT_PARAM_UNCOMPRESSED_SIZE", String.valueOf(length));
            r5.A06.A02(str5, "PAYLOAD_SIZE", A0t);
            if (z) {
                r5.A02(r7, r9, str7, z2);
                return;
            }
            return;
        }
        if (z) {
            r3 = r5.A06;
            str2 = "REQUEST_START";
        } else {
            hashMap = AnonymousClass001.A0t();
            hashMap.put("EVENT_PARAM_APP_ID", str3);
            hashMap.put("EVENT_PARAM_BLOKS_PARAMS", str4);
            r3 = r5.A06;
            str2 = "PREFETCH_REQUEST_START";
        }
        r3.A02(str5, str2, hashMap);
        r1.Bh4(new C67273Oq(r5, r6, r7, r8, r9, str5, str3, str4, str6, z, z2));
    }

    public /* synthetic */ C71163bf(C55552qX r1, C54662p5 r2, C84594Cy r3, C46202bF r4, AnonymousClass39C r5, C84724Dl r6, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = r4;
        this.A09 = str3;
        this.A0A = z;
        this.A0B = z2;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str4;
    }
}
