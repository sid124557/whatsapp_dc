package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5R8  reason: invalid class name */
public class AnonymousClass5R8 {
    public C95814uZ A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04 = null;
    public String A05;
    public String A06;
    public String A07;
    public String A08 = null;
    public String A09;
    public List A0A;
    public JSONObject A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public C105845Wq A00() {
        String str = this.A04;
        String str2 = this.A08;
        boolean z = this.A0E;
        boolean z2 = this.A0F;
        boolean z3 = this.A0C;
        boolean z4 = this.A0G;
        boolean z5 = this.A0H;
        String str3 = this.A09;
        String str4 = this.A03;
        String str5 = this.A05;
        C95814uZ r7 = this.A00;
        UserJid userJid = this.A01;
        String str6 = this.A07;
        String str7 = this.A06;
        String str8 = this.A02;
        JSONObject jSONObject = this.A0B;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        String str9 = str2;
        return new C105845Wq(r7, userJid, str, str9, str3, str4, str5, str6, str7, str8, this.A0A, jSONObject, z6, z7, z8, z4, z5, this.A0D);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0080 A[SYNTHETIC, Splitter:B:9:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C105845Wq A01(android.os.Bundle r29) {
        /*
            r28 = this;
            java.lang.String r2 = "banner"
            r0 = r29
            java.lang.String r1 = r0.getString(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = r0.getString(r2)     // Catch:{ JSONException -> 0x0018 }
            org.json.JSONObject r21 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r1 = move-exception
            r1.printStackTrace()
        L_0x001c:
            r21 = r3
        L_0x001e:
            java.lang.String r1 = "data"
            java.lang.String r12 = r0.getString(r1, r3)
            java.lang.String r1 = "source"
            java.lang.String r13 = r0.getString(r1, r3)
            java.lang.String r1 = "has_ib"
            boolean r22 = r0.getBoolean(r1)
            java.lang.String r1 = "has_wm"
            boolean r23 = r0.getBoolean(r1)
            java.lang.String r1 = "ads_logging_requires_tos"
            boolean r24 = r0.getBoolean(r1)
            java.lang.String r1 = "show_ad_attribution"
            boolean r25 = r0.getBoolean(r1)
            java.lang.String r1 = "show_keyboard"
            boolean r26 = r0.getBoolean(r1)
            java.lang.String r1 = "source_url"
            java.lang.String r14 = r0.getString(r1)
            java.lang.String r1 = "ctwa_context"
            java.lang.String r15 = r0.getString(r1)
            java.lang.String r1 = "icebreaker"
            java.lang.String r16 = r0.getString(r1)
            java.lang.String r1 = "lid"
            X.4uZ r10 = X.C106405Yw.A02(r0, r1)
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r11 = X.C86634Kw.A0l(r0, r1)
            java.lang.String r1 = "productId"
            java.lang.String r17 = r0.getString(r1)
            java.lang.String r1 = "land_on_whatsapp_catalog"
            java.lang.String r18 = r0.getString(r1)
            java.lang.String r1 = "categoryId"
            java.lang.String r19 = r0.getString(r1)
            java.lang.String r1 = "client_filters"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            if (r1 == 0) goto L_0x00cb
            java.util.ArrayList r8 = X.C73783g4.A0c(r1)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x0088:
            boolean r1 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x00c1 }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r2 = X.AnonymousClass001.A0m(r9)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            r1 = 0
            X.C162457s7.A0J(r2, r1)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            X.21a[] r5 = X.C371221a.values()     // Catch:{ IllegalArgumentException -> 0x00c1 }
            int r7 = r5.length     // Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x009b:
            if (r1 >= r7) goto L_0x00ae
            r4 = r5[r1]     // Catch:{ IllegalArgumentException -> 0x00c1 }
            java.lang.String r6 = r4.label     // Catch:{ IllegalArgumentException -> 0x00c1 }
            boolean r6 = X.C162457s7.A0P(r6, r2)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            if (r6 == 0) goto L_0x00ab
            r8.add(r4)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            goto L_0x0088
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x00c1 }
            java.lang.String r4 = "Not a valid client filter: "
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x00bc:
            java.util.List r3 = X.C73723fy.A0F(r8)     // Catch:{ IllegalArgumentException -> 0x00c1 }
            goto L_0x00cb
        L_0x00c1:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Failed to convert client filter from string to CTWAClientFilter, message: "
            X.C18260x0.A16(r1, r2, r4)
        L_0x00cb:
            java.lang.String r1 = "consumer_disclosure"
            boolean r27 = r0.getBoolean(r1)
            X.5Wq r9 = new X.5Wq
            r20 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R8.A01(android.os.Bundle):X.5Wq");
    }
}
