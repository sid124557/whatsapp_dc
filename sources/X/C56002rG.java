package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rG  reason: invalid class name and case insensitive filesystem */
public class C56002rG {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences.Editor A00() {
        return A01().edit();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("user_notice_cms_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public synchronized void A04(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C60222yC r6 = (C60222yC) it.next();
            AnonymousClass7NA r5 = r6.A05;
            int i = r5.A00;
            String valueOf = String.valueOf(i);
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
                A1G.put("text", r5.A03);
                A1G.put("action", r5.A02);
                A1G.put("badgeExpirationInHours", r6.A04);
                A1G.put("enabled_time", r6.A02);
                A1G.put("selected_time", r6.A03);
                A1G.put("stage", r6.A01);
                A1G.put("policy_version", r6.A00);
                C61202zs r52 = r5.A01;
                AnonymousClass5RT r0 = r52.A02;
                if (r0 != null) {
                    A1G.put("start_time", r0.A00);
                }
                C104635Rt r02 = r52.A00;
                if (r02 != null) {
                    A1G.put("static_duration", r02.A00);
                }
                AnonymousClass5RT r03 = r52.A01;
                if (r03 != null) {
                    A1G.put("end_time", r03.A00);
                }
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
                C18270x1.A0e(A00(), A1G, AnonymousClass000.A0V("badged_notice_", valueOf, AnonymousClass001.A0o()));
            } catch (JSONException e) {
                Log.e("UserNoticeBadgeContent/toJSON exception: ", e);
            }
        }
    }

    public synchronized void A05(Collection collection) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C53722nY r2 = (C53722nY) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            int i = r2.A00;
            A1G.put("notice_id", i);
            A1G.put("policyVersion", r2.A01);
            A1G.put("channel", r2.A06);
            AnonymousClass1kT r8 = r2.A02;
            if (r8 != null) {
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put("text", r8.A04);
                A1G2.put("iconDescription", r8.A04);
                A1G2.put("action", r8.A01);
                A1G2.put("light", r8.A03);
                A1G2.put("dark", r8.A02);
                A1G2.put("iconRole", r8.A02);
                A1G2.put("iconStyle", r8.A03);
                A1G2.put("timing", r8.A00.A01());
                A1G.put("banner", A1G2);
            }
            AnonymousClass1kU r0 = r2.A04;
            if (r0 != null) {
                A1G.put("modal", r0.A02());
            }
            AnonymousClass1kU r02 = r2.A03;
            if (r02 != null) {
                A1G.put("blocking-modal", r02.A02());
            }
            C53012mP r5 = r2.A05;
            if (r5 != null) {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G3.put("text", r5.A03);
                A1G3.put("action", r5.A02);
                A1G3.put("badgeExpirationInHours", r5.A00);
                A1G3.put("timing", r5.A01.A01());
                A1G.put("badged-notice", A1G3);
            }
            A0t.put(String.valueOf(i), A1G.toString());
        }
        C18270x1.A0e(A00(), new JSONObject(A0t), "user_notices_content");
    }

    public synchronized void A06(Collection collection) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C622234e r0 = (C622234e) it.next();
            JSONObject A012 = C622234e.A01(r0);
            if (A012 != null) {
                A0t.put(String.valueOf(r0.A01), A012.toString());
            }
        }
        C18270x1.A0e(A00(), new JSONObject(A0t), "user_notices_metadata");
    }

    public C56002rG(C60152y5 r1) {
        this.A01 = r1;
    }

    public List A02() {
        C60222yC r13;
        AnonymousClass5RT r9;
        C104635Rt r1;
        AnonymousClass5RT r0;
        Map<String, ?> all = A01().getAll();
        ArrayList A0s = AnonymousClass001.A0s();
        if (all != null) {
            Iterator A0q = AnonymousClass000.A0q(all);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (A0w.getValue() != null && (A0w.getValue() instanceof String) && C18310x6.A0q(A0w).startsWith("badged_notice_")) {
                    try {
                        JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass0x9.A12(A0w));
                        try {
                            long optLong = A1H.optLong("start_time", -1);
                            long optLong2 = A1H.optLong("static_duration", -1);
                            long optLong3 = A1H.optLong("end_time", -1);
                            if (optLong == -1) {
                                r9 = null;
                            } else {
                                r9 = new AnonymousClass5RT(optLong);
                            }
                            if (optLong2 == -1) {
                                r1 = null;
                            } else {
                                r1 = new C104635Rt((long[]) null, optLong2);
                            }
                            if (optLong3 == -1) {
                                r0 = null;
                            } else {
                                r0 = new AnonymousClass5RT(optLong3);
                            }
                            int A002 = C100475Bb.A00(A1H);
                            int i = A1H.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            r13 = new C60222yC(new C61202zs(r1, r9, r0, "onDemand"), A1H.getString("text"), A1H.getString("action"), i, A1H.getInt("stage"), A1H.getInt("policy_version"), A002, A1H.getLong("enabled_time"), A1H.getLong("selected_time"));
                        } catch (JSONException e) {
                            Log.e("UserNoticeBadgeContent/fromJSON exception: ", e);
                            r13 = null;
                        }
                    } catch (JSONException e2) {
                        Log.e("UserNoticeBadgeSharedPreferences/convertJsonStringToUserNoticeBadgeContent/parsing failed", e2);
                        r13 = null;
                    }
                    if (r13 != null) {
                        A0s.add(r13);
                    }
                }
            }
        }
        return A0s;
    }

    public List A03() {
        AnonymousClass1kT r10;
        AnonymousClass1kU r16;
        AnonymousClass1kU r17;
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        String A0Z = C18280x3.A0Z(A01(), "user_notices_content");
        if (A0Z != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String obj = A1H.get(AnonymousClass001.A0m(keys)).toString();
                    C162457s7.A0J(obj, 0);
                    JSONObject A1H2 = AnonymousClass0x9.A1H(obj);
                    int i = A1H2.getInt("notice_id");
                    int i2 = A1H2.getInt("policyVersion");
                    String string = A1H2.getString("channel");
                    JSONObject optJSONObject = A1H2.optJSONObject("banner");
                    C53012mP r0 = null;
                    if (optJSONObject != null) {
                        String string2 = optJSONObject.getString("text");
                        String string3 = optJSONObject.getString("iconDescription");
                        String string4 = optJSONObject.getString("action");
                        String string5 = optJSONObject.getString("light");
                        String string6 = optJSONObject.getString("dark");
                        String str2 = null;
                        if (optJSONObject.has("iconRole")) {
                            str = optJSONObject.getString("iconRole");
                        } else {
                            str = null;
                        }
                        if (optJSONObject.has("iconStyle")) {
                            str2 = optJSONObject.getString("iconStyle");
                        }
                        r10 = new AnonymousClass1kT(C61202zs.A00(optJSONObject.getJSONObject("timing")), AnonymousClass752.A00(str), AnonymousClass753.A00(str2), string2, string5, string6, string3, string4);
                    } else {
                        r10 = null;
                    }
                    JSONObject optJSONObject2 = A1H2.optJSONObject("modal");
                    if (optJSONObject2 != null) {
                        r16 = AnonymousClass1kU.A00(optJSONObject2);
                    } else {
                        r16 = null;
                    }
                    JSONObject optJSONObject3 = A1H2.optJSONObject("blocking-modal");
                    if (optJSONObject3 != null) {
                        r17 = AnonymousClass1kU.A00(optJSONObject3);
                    } else {
                        r17 = null;
                    }
                    JSONObject optJSONObject4 = A1H2.optJSONObject("badged-notice");
                    if (optJSONObject4 != null) {
                        String string7 = optJSONObject4.getString("text");
                        String string8 = optJSONObject4.getString("action");
                        int A002 = C100475Bb.A00(optJSONObject4);
                        C61202zs A003 = C61202zs.A00(optJSONObject4.getJSONObject("timing"));
                        C162457s7.A0H(string7);
                        C162457s7.A0H(string8);
                        r0 = new C53012mP(A003, string7, string8, A002);
                    }
                    C162457s7.A0H(string);
                    A0s.add(new C53722nY(r10, r16, r17, r0, string, i, i2));
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return A0s;
    }
}
