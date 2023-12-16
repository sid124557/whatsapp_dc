package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import java.util.Map;

/* renamed from: X.1QP  reason: invalid class name */
public abstract class AnonymousClass1QP extends AnonymousClass1QA {
    public final C56422rx A00;
    public final C620633i A01;
    public final AnonymousClass33p A02;
    public final C620733j A03;
    public final C53412n3 A04;
    public final AnonymousClass2YC A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass2Q6 A07;

    public void A0E(Activity activity, Intent intent, String str, Map map, long j) {
        intent.putExtra("chat_id", C627336j.A06((AnonymousClass4FC) activity));
        intent.putExtra("message_id", str);
        intent.putExtra("action_name", "galaxy_message");
        intent.putExtra("message_row_id", j);
        intent.putExtra("user_locale", this.A03.A08());
        intent.putExtra("flow_id", (String) C18320x8.A0Z(map, "flow_id"));
        intent.putExtra("flow_token", C18310x6.A0o("flow_token", map));
        intent.putExtra("flow_message_version", C18310x6.A0o("flow_message_version", map));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r3.mediaCase_ != 8) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df A[Catch:{ JSONException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9 A[Catch:{ JSONException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(com.whatsapp.jid.UserJid r19, X.AnonymousClass1EU r20, X.AnonymousClass3ST r21, boolean r22) {
        /*
            r18 = this;
            r2 = r18
            X.2rx r0 = r2.A00
            r11 = r19
            X.2qS r0 = r0.A01(r11)
            int r9 = X.AnonymousClass30C.A00(r0)
            java.lang.String r4 = "galaxy_message"
            X.1ER r1 = X.C625235k.A00(r20)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0097
            X.1DR r0 = r1.header_
            r3 = r0
            r1 = r0
            if (r0 != 0) goto L_0x0022
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0022:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0050
            if (r3 != 0) goto L_0x002c
            X.1DR r1 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x002c:
            int r1 = r1.mediaCase_
            r0 = 3
            if (r1 != r0) goto L_0x0050
            r17 = 8
        L_0x0033:
            X.1ER r0 = X.C625235k.A00(r20)
            X.1C7 r0 = r0.A0N()
            java.lang.String r8 = X.C18300x5.A0j(r0)
            java.lang.String r1 = "flow_id"
            r7 = r21
            X.2z0 r0 = r7.A0Q
            java.lang.String r6 = r0.A01
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            goto L_0x009a
        L_0x0050:
            r0 = r3
            r1 = r3
            if (r3 != 0) goto L_0x0056
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0056:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0068
            if (r3 != 0) goto L_0x0060
            X.1DR r1 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0060:
            int r1 = r1.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x0068
            r17 = 2
            goto L_0x0033
        L_0x0068:
            r0 = r3
            r1 = r3
            if (r3 != 0) goto L_0x006e
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x006e:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0080
            if (r3 != 0) goto L_0x0078
            X.1DR r1 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0078:
            int r1 = r1.mediaCase_
            r0 = 7
            if (r1 != r0) goto L_0x0080
            r17 = 3
            goto L_0x0033
        L_0x0080:
            r0 = r3
            if (r3 != 0) goto L_0x0085
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0085:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0097
            if (r3 != 0) goto L_0x008f
            X.1DR r3 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x008f:
            int r1 = r3.mediaCase_
            r0 = 8
            r17 = 6
            if (r1 == r0) goto L_0x0033
        L_0x0097:
            r17 = 1
            goto L_0x0033
        L_0x009a:
            java.lang.String r0 = "cta"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x00bb }
            java.util.Map r5 = X.AnonymousClass31O.A01(r8)     // Catch:{ JSONException -> 0x00bb }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x00bb }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r1 = "extensions_message_id"
            java.lang.String r0 = X.C57142tA.A00(r6)     // Catch:{ JSONException -> 0x00bb }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r0 = "is_flow_message_with_payload"
            r1 = r22
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00c1
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "ExtensionsLogger/ExtensionsAction/sendMessageReceiveWamEvent()  exception in parsing json"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00c1:
            boolean r4 = r20.A0M()
            java.lang.String r1 = r7.A0p
            java.lang.String r0 = "is_template"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "hsm_tag"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00d6:
            java.lang.String r0 = "mode"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r1 = r0.toUpperCase()     // Catch:{ JSONException -> 0x00ec }
        L_0x00e3:
            java.lang.String r0 = "extension_status"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x00ec }
            goto L_0x00f0
        L_0x00e9:
            java.lang.String r1 = "PUBLISHED"
            goto L_0x00e3
        L_0x00ec:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00f0:
            X.2n3 r0 = r2.A04
            X.2wd r0 = r0.A01
            X.2pe r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x011b
            java.lang.String r15 = r0.A06
            java.lang.String r1 = r0.A05
        L_0x00fe:
            X.2Q6 r10 = r2.A07
            java.lang.String r14 = r3.toString()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            X.2YC r0 = r2.A05
            java.lang.Integer r13 = r0.A00(r11)
            X.4FS r0 = r10.A03
            X.3cD r9 = new X.3cD
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.BkM(r9)
            return
        L_0x011b:
            r15 = 0
            r1 = r15
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QP.A0F(com.whatsapp.jid.UserJid, X.1EU, X.3ST, boolean):void");
    }

    public AnonymousClass1QP(C194449Sx r1, C56422rx r2, C620633i r3, AnonymousClass33p r4, C620733j r5, C53412n3 r6, AnonymousClass2YC r7, AnonymousClass1VX r8, AnonymousClass2Q6 r9) {
        super(r1);
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = r9;
        this.A04 = r6;
        this.A05 = r7;
    }

    public void A0D(Activity activity, AnonymousClass398 r5, String str, String str2, long j) {
        super.A0D(activity, r5, str, str2, j);
        if (Build.VERSION.SDK_INT == 26) {
            new AnonymousClass7SI().A00(activity);
        }
        InputMethodManager A0Q = this.A01.A0Q();
        if (A0Q != null && activity.getCurrentFocus() != null) {
            A0Q.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }
}
