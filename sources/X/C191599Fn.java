package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Fn  reason: invalid class name and case insensitive filesystem */
public class C191599Fn extends C1902394t {
    public AnonymousClass9JZ A00;
    public String A01 = null;
    public final AnonymousClass5X8 A02;
    public final C194649Ty A03;

    public C191599Fn(AnonymousClass5X8 r10, C56612sH r11, C620733j r12, AnonymousClass36Y r13, AnonymousClass1VX r14, C620933l r15, AnonymousClass9U4 r16, C203499no r17, C194649Ty r18) {
        super(r11, r12, r13, r14, r15, r16, r17);
        this.A02 = r10;
        this.A03 = r18;
    }

    public void A0M(String str) {
        String A0n;
        String A0n2;
        String A0n3;
        String A0n4;
        String A0n5;
        this.A01 = null;
        if (!TextUtils.isEmpty(str) && this.A07.A09.A02()) {
            try {
                C162457s7.A0J(str, 0);
                Uri parse = Uri.parse(str);
                List<String> pathSegments = parse.getPathSegments();
                if (((pathSegments.size() == 3 && (A0n3 = AnonymousClass001.A0n(pathSegments, 0)) != null && A0n3.equalsIgnoreCase("pay") && (A0n4 = AnonymousClass001.A0n(pathSegments, 1)) != null && A0n4.equalsIgnoreCase("br") && (A0n5 = AnonymousClass001.A0n(pathSegments, 2)) != null && A0n5.equalsIgnoreCase("add-credential")) || (pathSegments.size() == 2 && (A0n = AnonymousClass001.A0n(pathSegments, 0)) != null && A0n.equalsIgnoreCase("br") && (A0n2 = AnonymousClass001.A0n(pathSegments, 1)) != null && A0n2.equalsIgnoreCase("add-credential"))) && (parse.getQueryParameterNames().contains("pushAccountData") || parse.getQueryParameterNames().contains("pushData"))) {
                    Uri parse2 = Uri.parse(str);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames.contains("pushAccountData") && this.A08.A0X(1601)) {
                        this.A01 = parse2.getQueryParameter("pushAccountData");
                        this.A00 = AnonymousClass9JZ.MASTERCARD;
                        Log.i("Push Prov deeplink received for MasterCard");
                        C06270Wx.A04(this.A00, 2);
                        return;
                    } else if (queryParameterNames.contains("pushData") && this.A08.A0X(2608)) {
                        this.A01 = parse2.getQueryParameter("pushData");
                        this.A00 = AnonymousClass9JZ.VISA;
                        Log.i("Push Prov deeplink received for VISA");
                        C06270Wx.A04(this.A00, 2);
                        return;
                    }
                }
            } catch (NullPointerException | UnsupportedOperationException unused) {
                Log.i("Unable to read query param pushAccountDataorpushData");
            }
        }
        super.A0M(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        if (r3.A09.A03().getBoolean("payment_brazil_nux_dismissed", false) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0O(int r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0016
            X.1VX r0 = r3.A08
            r2 = 0
            X.C162457s7.A0J(r0, r2)
            X.33l r0 = r3.A09
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_brazil_nux_dismissed"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x002c
        L_0x0016:
            X.9Ty r2 = r3.A03
            X.9TR r1 = r2.A05
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x002e
            X.9U4 r0 = r3.A0A
            java.util.List r0 = X.AnonymousClass9U4.A08(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002e
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        L_0x002e:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0036
            r1 = 2
            return r1
        L_0x0036:
            boolean r0 = r2.A06()
            r1 = 1
            if (r0 == 0) goto L_0x002d
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191599Fn.A0O(int):int");
    }
}
