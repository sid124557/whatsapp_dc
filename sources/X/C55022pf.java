package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2pf  reason: invalid class name and case insensitive filesystem */
public class C55022pf {
    public SharedPreferences A00;
    public final AnonymousClass4F5 A01 = new C86174Jc(this, 1);
    public final C28951i2 A02;
    public final C56612sH A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass30N A06;
    public final C60152y5 A07;
    public final C55832qz A08;
    public final C72173dI A09;

    public final void A03() {
        SharedPreferences.Editor A0E;
        long A0B = AnonymousClass0x2.A0B(A00(), "logs_last_sent");
        long currentTimeMillis = System.currentTimeMillis();
        boolean A1W = AnonymousClass001.A1W((currentTimeMillis > (259200000 + A0B) ? 1 : (currentTimeMillis == (259200000 + A0B) ? 0 : -1)));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConversationSketchLogger: sendFieldStatAndClearStoreIfNeeded isForced, lastSent, currentTS : ");
        A0o.append(false);
        A0o.append(", ");
        A0o.append(A0B);
        C18260x0.A10(", ", A0o, currentTimeMillis);
        if (A1W) {
            AnonymousClass1QV A022 = A02();
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A022.A00.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                C18260x0.A0q("ConversationSketchLogger: sendFieldStatAndClearStoreIfNeeded saving completed conversations for merchantJID :", A0m, AnonymousClass001.A0o());
                AnonymousClass1QW A012 = A01(A0m);
                C22791Qc r12 = A012.A00;
                if (r12 != null && r12.A00 + 86400000 < currentTimeMillis) {
                    A012.A01.add(r12);
                    A012.A00 = null;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("ConversationSketchLogger: sendFieldStatAndClearStoreIfNeeded number of completed conversations for merchantJID :");
                A0o2.append(A0m);
                A0o2.append(" : ");
                C18260x0.A1F(A0o2, A012.A01.size());
                for (C22791Qc r10 : A012.A01) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    for (AnonymousClass2UV r14 : r10.A04) {
                        String obj = A1F.toString();
                        A1F.put(r14.A03());
                        if (A1F.toString().length() > 1000) {
                            A0s2.add(obj);
                            A1F = AnonymousClass0x9.A1F();
                            A1F.put(r14.A03());
                        }
                    }
                    if (A1F.toString().length() > 0) {
                        AnonymousClass0x7.A1D(A1F, A0s2);
                    }
                    Iterator it2 = A0s2.iterator();
                    while (it2.hasNext()) {
                        String A0m2 = AnonymousClass001.A0m(it2);
                        C24751Yp r11 = new C24751Yp();
                        r11.A01 = r10.A03;
                        r11.A03 = r10.A02;
                        r11.A00 = r10.A01;
                        r11.A02 = A0m2;
                        this.A05.BhB(r11);
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C18260x0.A1J(A0o3, C18300x5.A0k(r11, "ConversationSketchLogger: sendFieldStatAndClearStoreIfNeeded posting event :", A0o3));
                    }
                }
                A012.A01 = AnonymousClass001.A0s();
                C22791Qc r0 = A012.A00;
                if (r0 == null || r0.A04.isEmpty()) {
                    C18260x0.A0q("ConversationSketchManager/sendFieldStatAndClearStoreIfNeeded clearing list for :", A0m, AnonymousClass001.A0o());
                    A0E = C18310x6.A0E(A00(), A0m);
                } else {
                    A0s.add(A0m);
                    A0E = A00().edit().putString(A0m, C18270x1.A0T(A012.A03()));
                }
                A0E.apply();
            }
            if (A0s.size() != A022.A00.size()) {
                A022.A00 = A0s;
                C18270x1.A0j(A00().edit(), "merchant_jid_list", C18270x1.A0T(A022.A03()));
            }
            C18270x1.A0o(A00(), "logs_last_sent", currentTimeMillis);
        }
    }

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A032 = this.A07.A03("conversationSketch");
        this.A00 = A032;
        return A032;
    }

    public C55022pf(C28951i2 r3, C56612sH r4, AnonymousClass1VX r5, AnonymousClass4FV r6, AnonymousClass30N r7, C60152y5 r8, C55832qz r9, AnonymousClass4FS r10) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = C72173dI.A00(r10);
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r1.A04(r0) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1QW A01(java.lang.String r7) {
        /*
            r6 = this;
            android.content.SharedPreferences r1 = r6.A00()
            java.lang.String r0 = "{}"
            java.lang.String r0 = r1.getString(r7, r0)
            X.1QW r5 = new X.1QW
            r5.<init>()
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r0 = "current_conversation"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0067 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0067 }
            X.1Qc r1 = new X.1Qc     // Catch:{ JSONException -> 0x0067 }
            r1.<init>()     // Catch:{ JSONException -> 0x0067 }
            boolean r0 = r1.A04(r0)     // Catch:{ JSONException -> 0x0067 }
            if (r0 == 0) goto L_0x003a
        L_0x002b:
            r5.A00 = r1     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r0 = "completed_conversations"
            org.json.JSONArray r4 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x0067 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0067 }
            r5.A01 = r0     // Catch:{ JSONException -> 0x0067 }
            goto L_0x003c
        L_0x003a:
            r1 = 0
            goto L_0x002b
        L_0x003c:
            r3 = 0
            if (r4 == 0) goto L_0x0082
        L_0x003f:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0067 }
            if (r3 >= r0) goto L_0x0082
            java.lang.Object r2 = r4.get(r3)     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0067 }
            X.1Qc r1 = new X.1Qc     // Catch:{ JSONException -> 0x0067 }
            r1.<init>()     // Catch:{ JSONException -> 0x0067 }
            boolean r0 = r1.A04(r0)     // Catch:{ JSONException -> 0x0067 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0067 }
            r1.A04(r0)     // Catch:{ JSONException -> 0x0067 }
            java.util.List r0 = r5.A01     // Catch:{ JSONException -> 0x0067 }
            r0.add(r1)     // Catch:{ JSONException -> 0x0067 }
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversationMerchantList: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            X.30N r0 = r6.A06
            java.lang.String r2 = r0.A04(r7)
            X.2sH r0 = r6.A03
            long r0 = r0.A0H()
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "defaultThreadID"
        L_0x007d:
            X.1QW r5 = new X.1QW
            r5.<init>(r0, r7, r2)
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55022pf.A01(java.lang.String):X.1QW");
    }

    public final AnonymousClass1QV A02() {
        String string = A00().getString("merchant_jid_list", "{}");
        AnonymousClass1QV r4 = new AnonymousClass1QV();
        try {
            r4.A00 = AnonymousClass001.A0s();
            JSONArray optJSONArray = AnonymousClass0x9.A1H(string).optJSONArray("merchant_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    r4.A00.add(optJSONArray.get(i));
                }
            }
        } catch (JSONException e) {
            Log.w("ConversationSketchMerchantJIDKeyList: fromJsonString threw: ", e);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConversationSketchLogger/getMerchantJIDListFromStore merchantList : ");
        C18260x0.A1J(A0o, C18270x1.A0T(r4.A03()));
        return r4;
    }
}
