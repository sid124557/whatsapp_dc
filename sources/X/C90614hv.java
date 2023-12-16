package X;

import com.whatsapp.Me;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4hv  reason: invalid class name and case insensitive filesystem */
public class C90614hv extends C95444tg {
    public final AnonymousClass5ZO A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass5GZ A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90614hv(X.C55682qk r13, X.C181668n8 r14, X.C111525iE r15, X.AnonymousClass5ZO r16, X.C54292oU r17, X.C57162tC r18, X.C620733j r19, X.AnonymousClass1VX r20, X.C184408rk r21, X.C59722xN r22, X.AnonymousClass8E9 r23, X.AnonymousClass5GZ r24, X.AnonymousClass4FS r25) {
        /*
            r12 = this;
            r10 = 0
            r11 = r25
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = r22
            r4 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r20
            r12.A02 = r0
            r0 = r17
            r12.A01 = r0
            r0 = r16
            r12.A00 = r0
            r0 = r24
            r12.A03 = r0
            java.lang.String r0 = "1.0"
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90614hv.<init>(X.2qk, X.8n8, X.5iE, X.5ZO, X.2oU, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.8E9, X.5GZ, X.4FS):void");
    }

    public String A06() {
        return "unified_home";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        throw X.AnonymousClass002.A0G(X.AnonymousClass000.A0V("UnifiedHomeRequest/parseDynamicWidget: widget not supported: ", r6, X.AnonymousClass001.A0o()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A05(org.json.JSONObject r18) {
        /*
            r17 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "widgets_order"
            r1 = r18
            org.json.JSONArray r3 = r1.getJSONArray(r0)
            java.lang.String r0 = "widgets"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            r1 = 0
        L_0x0013:
            int r0 = r3.length()
            if (r1 >= r0) goto L_0x00d3
            java.lang.String r6 = r3.getString(r1)
            org.json.JSONObject r7 = r2.getJSONObject(r6)
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.String r5 = r6.toLowerCase(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            int r0 = r5.hashCode()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            switch(r0) {
                case -1049482625: goto L_0x0052;
                case -805635793: goto L_0x003d;
                case 1594529602: goto L_0x0097;
                case 2000104852: goto L_0x00aa;
                default: goto L_0x002e;
            }     // Catch:{ UnsupportedOperationException -> 0x00c7 }
        L_0x002e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.String r0 = "UnifiedHomeRequest/parseDynamicWidget: widget not supported: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r5)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x00c7 }
        L_0x003d:
            java.lang.String r0 = "frequently_contacted_biz"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r5 = "max_items"
            r0 = 3
            int r0 = r7.optInt(r5, r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.6fU r5 = new X.6fU     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            r5.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            goto L_0x00c3
        L_0x0052:
            java.lang.String r0 = "nearby"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            if (r0 == 0) goto L_0x002e
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.String r0 = "businesses"
            org.json.JSONArray r6 = r7.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            r5 = 0
        L_0x0065:
            int r0 = r6.length()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            if (r5 >= r0) goto L_0x0070
            int r5 = X.C109065e1.A00(r15, r6, r5)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            goto L_0x0065
        L_0x0070:
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.util.ArrayList r16 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.String r9 = ""
            r8 = 0
            java.lang.String r0 = "csvm_config"
            java.lang.String r12 = r7.optString(r0, r9)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.7jr r7 = new X.7jr     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            r7.<init>()     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.5TI r6 = new X.5TI     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            r10 = r9
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.6fV r5 = new X.6fV     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            goto L_0x00c3
        L_0x0097:
            java.lang.String r0 = "popular_categories"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "categories"
            org.json.JSONArray r0 = r7.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.6fX r5 = X.C132546fX.A00(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            goto L_0x00c3
        L_0x00aa:
            java.lang.String r0 = "popular_businesses"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            if (r0 == 0) goto L_0x002e
            r0 = 0
            X.C162457s7.A0J(r7, r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            java.lang.String r0 = "businesses"
            org.json.JSONArray r0 = r7.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.C162457s7.A0D(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            X.6fW r5 = X.C1450373x.A00(r0)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
        L_0x00c3:
            r4.add(r5)     // Catch:{ UnsupportedOperationException -> 0x00c7 }
            goto L_0x00cf
        L_0x00c7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x00d3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90614hv.A05(org.json.JSONObject):java.lang.Object");
    }

    public Map A07() {
        String str;
        Double d;
        Double d2;
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("module_config_ver", this.A02.A0Q(4385));
        A0t.put("flavour", "DIRECTORY");
        if (AnonymousClass000.A0B(this.A01.A00).densityDpi <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        A0t.put("icon_spec", str);
        C56972sr r0 = this.A03.A00.A00;
        r0.A0P();
        Me me = r0.A00;
        C626936e.A06(me);
        A0t.put("country_code", AnonymousClass0x9.A0w(me));
        AnonymousClass5ZO r3 = this.A00;
        String str2 = r3.A09;
        A0t.put("location_type", str2);
        if (!str2.equals("country_default")) {
            boolean A08 = r3.A08();
            if (A08) {
                d = r3.A04;
            } else {
                d = r3.A02;
            }
            A0t.put("latitude", d);
            if (A08) {
                d2 = r3.A05;
            } else {
                d2 = r3.A03;
            }
            A0t.put("longitude", d2);
            A0t.put("radius", r3.A06);
        }
        return A0t;
    }
}
