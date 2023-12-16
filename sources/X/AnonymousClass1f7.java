package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1f7  reason: invalid class name */
public class AnonymousClass1f7 extends AnonymousClass27S {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final C56982ss A05;
    public final AnonymousClass1VX A06;
    public final C48672fH A07;
    public final AnonymousClass2YJ A08;
    public final C106195Xz A09;
    public final C60152y5 A0A;
    public final C50222hp A0B;
    public final AnonymousClass1R1 A0C;

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0133 A[Catch:{ JSONException -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013a A[Catch:{ JSONException -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144 A[Catch:{ JSONException -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0188 A[Catch:{ JSONException -> 0x018c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject A02(X.C624134x r10, X.C54742pD r11) {
        /*
            r9 = this;
            r8 = 0
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x018c }
            X.2z0 r4 = r10.A1J     // Catch:{ JSONException -> 0x018c }
            X.4uZ r5 = r4.A00     // Catch:{ JSONException -> 0x018c }
            boolean r0 = r5 instanceof X.C135166kE     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x018b
            boolean r0 = r10 instanceof X.C30481mW     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x005f
            byte r0 = r10.A1I     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x005f
            java.lang.String r2 = "text"
            r6 = r2
            X.34w r7 = r10.A0P     // Catch:{ JSONException -> 0x018c }
            if (r7 == 0) goto L_0x0051
            int r1 = r7.A03     // Catch:{ JSONException -> 0x018c }
            r0 = 5
            if (r1 == r0) goto L_0x018b
            X.2sr r1 = r9.A00     // Catch:{ JSONException -> 0x018c }
            com.whatsapp.jid.UserJid r0 = r7.A0D     // Catch:{ JSONException -> 0x018c }
            boolean r0 = r1.A0a(r0)     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x018b
            java.lang.String r2 = "payment"
        L_0x002f:
            java.lang.String r1 = r10.A13()     // Catch:{ JSONException -> 0x018c }
            java.util.List r0 = r10.A18     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r9.A01(r1, r0)     // Catch:{ JSONException -> 0x018c }
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x018c }
        L_0x003c:
            r9.A04(r10, r3)     // Catch:{ JSONException -> 0x018c }
        L_0x003f:
            java.lang.String r0 = "type"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x018c }
        L_0x0045:
            X.4uZ r2 = r10.A0n()     // Catch:{ JSONException -> 0x018c }
            boolean r1 = X.C627336j.A0K(r5)     // Catch:{ JSONException -> 0x018c }
            if (r1 == 0) goto L_0x013a
            goto L_0x0131
        L_0x0051:
            r0 = r10
            X.1mW r0 = (X.C30481mW) r0     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r0.A06     // Catch:{ JSONException -> 0x018c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x002f
            java.lang.String r2 = "link"
            goto L_0x002f
        L_0x005f:
            boolean r0 = r10 instanceof X.C30771mz     // Catch:{ JSONException -> 0x018c }
            java.lang.String r6 = "image"
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = r10.A13()     // Catch:{ JSONException -> 0x018c }
            java.util.List r0 = r10.A18     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = r9.A01(r1, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = "text"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            r9.A03(r10, r3)     // Catch:{ JSONException -> 0x018c }
            goto L_0x00b2
        L_0x0079:
            boolean r0 = r10 instanceof X.C30761my     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x018c
            boolean r0 = r10 instanceof X.AnonymousClass4FG     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x018c
            boolean r0 = r10 instanceof X.AnonymousClass1n2     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00b9
            r9.A03(r10, r3)     // Catch:{ JSONException -> 0x018c }
            r9.A04(r10, r3)     // Catch:{ JSONException -> 0x018c }
            X.1VX r2 = r9.A06     // Catch:{ JSONException -> 0x018c }
            r1 = 6160(0x1810, float:8.632E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ JSONException -> 0x018c }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00b2
            X.30w r1 = r10.A0y()     // Catch:{ JSONException -> 0x018c }
            boolean r0 = r1.A05()     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00b2
            byte[] r1 = r1.A09()     // Catch:{ JSONException -> 0x018c }
            if (r1 == 0) goto L_0x00b2
            r0 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = "thumbnail"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
        L_0x00b2:
            java.lang.String r0 = "type"
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x00b9:
            boolean r0 = r10 instanceof X.C30721mu     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = "audio"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x00c6:
            boolean r0 = r10 instanceof X.C31971pB     // Catch:{ JSONException -> 0x018c }
            java.lang.String r2 = "video"
            if (r0 == 0) goto L_0x00ce
            goto L_0x0122
        L_0x00ce:
            boolean r0 = r10 instanceof X.AnonymousClass1nE     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "sticker"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x00dd:
            boolean r0 = r10 instanceof X.C31961pA     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x00f1
            r9.A03(r10, r3)     // Catch:{ JSONException -> 0x018c }
            r9.A04(r10, r3)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = "gif"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x00f1:
            boolean r0 = r10 instanceof X.C30361mK     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x0102
            r9.A03(r10, r3)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = "location"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x0102:
            boolean r0 = r10 instanceof X.C30421mQ     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x0127
            boolean r0 = r10 instanceof X.C30411mP     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x0127
            boolean r0 = r10 instanceof X.AnonymousClass1nF     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x0118
            java.lang.String r1 = "document"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x0118:
            boolean r0 = r10 instanceof X.AnonymousClass1n3     // Catch:{ JSONException -> 0x018c }
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r10 instanceof X.C31991pD     // Catch:{ JSONException -> 0x018c }
            if (r0 == 0) goto L_0x018b
            goto L_0x003f
        L_0x0122:
            r9.A03(r10, r3)     // Catch:{ JSONException -> 0x018c }
            goto L_0x003c
        L_0x0127:
            java.lang.String r1 = "contact"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0045
        L_0x0131:
            if (r2 == 0) goto L_0x013a
            X.3Ex r0 = r9.A01     // Catch:{ JSONException -> 0x018c }
            X.3ZH r6 = r0.A0A(r2)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0140
        L_0x013a:
            X.3Ex r0 = r9.A01     // Catch:{ JSONException -> 0x018c }
            X.3ZH r6 = X.C64773Ex.A00(r0, r5)     // Catch:{ JSONException -> 0x018c }
        L_0x0140:
            java.lang.String r2 = "group_name"
            if (r1 == 0) goto L_0x0188
            X.3ZH r1 = X.C64773Ex.A00(r0, r5)     // Catch:{ JSONException -> 0x018c }
            X.5ZU r0 = r9.A02     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r0.A0H(r1)     // Catch:{ JSONException -> 0x018c }
        L_0x014e:
            r3.putOpt(r2, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r2 = "author_name"
            X.5ZU r1 = r9.A02     // Catch:{ JSONException -> 0x018c }
            r0 = 0
            X.7HU r0 = r1.A0E(r6, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r0.A01     // Catch:{ JSONException -> 0x018c }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = "author_id"
            X.2fH r2 = r9.A07     // Catch:{ JSONException -> 0x018c }
            X.4uZ r0 = r6.A0H     // Catch:{ JSONException -> 0x018c }
            X.C626936e.A06(r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r2.A01(r0, r11)     // Catch:{ JSONException -> 0x018c }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = "chat_id"
            X.C626936e.A06(r5)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r2.A01(r5, r11)     // Catch:{ JSONException -> 0x018c }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r1 = "message_id"
            X.2YJ r0 = r9.A08     // Catch:{ JSONException -> 0x018c }
            java.lang.String r0 = r0.A00(r4, r11)     // Catch:{ JSONException -> 0x018c }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x018c }
            goto L_0x018a
        L_0x0188:
            r0 = 0
            goto L_0x014e
        L_0x018a:
            return r3
        L_0x018b:
            return r8
        L_0x018c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1f7.A02(X.34x, X.2pD):org.json.JSONObject");
    }

    public final void A04(C624134x r5, JSONObject jSONObject) {
        jSONObject.put("user_mentioned", false);
        List<AnonymousClass3ZM> list = r5.A18;
        if (list != null) {
            for (AnonymousClass3ZM r0 : list) {
                if (this.A00.A0a(r0.A00)) {
                    jSONObject.put("user_mentioned", true);
                    return;
                }
            }
        }
    }

    public final void A03(C624134x r3, JSONObject jSONObject) {
        jSONObject.put("text", A01(C66553Lw.A06(this.A04.A00, r3, this.A0B), r3.A18));
    }

    public AnonymousClass1f7(C56972sr r1, C64773Ex r2, AnonymousClass5ZU r3, C620633i r4, C54292oU r5, C56982ss r6, AnonymousClass1VX r7, C48672fH r8, AnonymousClass2YJ r9, C106195Xz r10, C60152y5 r11, C50222hp r12, AnonymousClass1R1 r13) {
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A0C = r13;
        this.A0A = r11;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r0.isBlocked() != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2LB A00(X.C624134x r7, X.C54742pD r8) {
        /*
            r6 = this;
            X.4uZ r4 = X.AnonymousClass2z0.A00(r7)
            X.1R1 r1 = r6.A0C
            boolean r0 = r1.A0h(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0045
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L_0x0046
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r1)
            X.1qy r0 = (X.C32501qy) r0
            java.lang.String r1 = r0.A0C()
            X.33i r0 = r6.A03
            android.app.NotificationManager r2 = r0.A0A()
            if (r2 == 0) goto L_0x0046
            android.app.NotificationChannel r1 = r2.getNotificationChannel(r1)
            if (r1 == 0) goto L_0x0046
            int r0 = r1.getImportance()
            if (r0 == 0) goto L_0x0045
            r0 = 28
            if (r5 < r0) goto L_0x0046
            java.lang.String r0 = r1.getGroup()
            android.app.NotificationChannelGroup r0 = r2.getNotificationChannelGroup(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.isBlocked()
            if (r0 == 0) goto L_0x0046
        L_0x0045:
            return r3
        L_0x0046:
            X.2ss r0 = r6.A05
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r1 = r6.A02(r7, r8)
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "incoming_message"
            X.2LB r3 = new X.2LB
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1f7.A00(X.34x, X.2pD):X.2LB");
    }

    public final String A01(String str, List list) {
        CharSequence A072 = C107635bd.A07(this.A03, this.A0A, C106815aD.A02(str));
        SpannableStringBuilder spannableStringBuilder = A072;
        if (list != null) {
            spannableStringBuilder = A072;
            if (!list.isEmpty()) {
                boolean isEmpty = TextUtils.isEmpty(A072);
                spannableStringBuilder = A072;
                if (!isEmpty) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(A072);
                    ArrayList A0s = AnonymousClass001.A0s();
                    this.A09.A06(valueOf, new AnonymousClass3QW(A0s), list);
                    Collections.sort(A0s, Collections.reverseOrder());
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        int A052 = C18280x3.A05(it);
                        valueOf.delete(A052, A052 + 1);
                    }
                    spannableStringBuilder = valueOf;
                }
            }
        }
        CharSequence A032 = C107575bX.A03(spannableStringBuilder);
        if (A032 == null) {
            return null;
        }
        return A032.toString();
    }
}
