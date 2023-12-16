package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2sP  reason: invalid class name and case insensitive filesystem */
public abstract class C56692sP {
    public static String A01(AnonymousClass398 r2) {
        String str;
        if (r2 == null || (str = r2.A01) == null) {
            return null;
        }
        return new JSONObject(str).optString("display_text");
    }

    public static boolean A02(C56952sp r2) {
        C162457s7.A0J(r2, 1);
        return !r2.A0Y(C58422vE.A02, 4001);
    }

    public void A09(Intent intent, C66543Lv r11, C55832qz r12, AnonymousClass4FS r13, int i) {
        String str;
        if (this instanceof AnonymousClass1QM) {
            if (intent == null || intent.getExtras() == null) {
                str = "SendLocationAction/handleResult/notHandled";
            } else {
                Bundle extras = intent.getExtras();
                C626936e.A06(extras);
                if (extras.getSerializable("carry_forward_extras") instanceof Map) {
                    Map map = (Map) extras.getSerializable("carry_forward_extras");
                    String A0o = C18310x6.A0o("message_id", map);
                    String A0o2 = C18310x6.A0o("chat_id", map);
                    if (i == -1 && !TextUtils.isEmpty(A0o) && !TextUtils.isEmpty(A0o2)) {
                        r13.BkM(new C70663ar(this, r11, r12, A0o, A0o2, 4));
                        return;
                    }
                    return;
                }
                str = "SendLocationAction/handleResult/intentExtrasNotFound";
            }
            Log.e(str);
        }
    }

    public int A03() {
        if (this instanceof AnonymousClass1QM) {
            return R.drawable.vec_ic_location_pin_blue;
        }
        if (this instanceof AnonymousClass1QL) {
            return R.drawable.ic_settings_notification;
        }
        if (this instanceof AnonymousClass1QH) {
            return R.drawable.ic_notifications_off;
        }
        if (this instanceof AnonymousClass1QF) {
            return R.drawable.ic_settings_phone;
        }
        if (this instanceof AnonymousClass1QI) {
            return R.drawable.ic_link_action;
        }
        if (this instanceof AnonymousClass1Q1) {
            return R.drawable.ic_format_list_bulleted;
        }
        if (this instanceof AnonymousClass1Q2) {
            return R.drawable.ic_action_reply;
        }
        if (this instanceof AnonymousClass1QG) {
            return R.drawable.ic_action_call;
        }
        if (this instanceof AnonymousClass1QD) {
            return R.drawable.ic_link_action;
        }
        if (this instanceof AnonymousClass1QJ) {
            return R.drawable.ic_settings_phone;
        }
        if (this instanceof AnonymousClass1QE) {
            return R.drawable.ic_action_copy;
        }
        return -1;
    }

    public Integer A04() {
        if (this instanceof AnonymousClass1QM) {
            return 904;
        }
        return null;
    }

    public String A05() {
        if (this instanceof AnonymousClass1QL) {
            return "cta_reminder";
        }
        if (this instanceof AnonymousClass1QH) {
            return "cta_cancel_reminder";
        }
        if (this instanceof AnonymousClass1QK) {
            return "catalog_message";
        }
        if (this instanceof AnonymousClass1QF) {
            return "voice_call";
        }
        if (this instanceof AnonymousClass1Q7) {
            return "wa_payment_transaction_details";
        }
        if (this instanceof AnonymousClass1Q6) {
            return "wa_payment_fbpin_reset";
        }
        if (this instanceof AnonymousClass1Q5) {
            return "wa_payment_learn_more";
        }
        if (this instanceof AnonymousClass1Q4) {
            return "payments_care_csat";
        }
        if (this instanceof AnonymousClass1QI) {
            return "cta_url";
        }
        if (this instanceof AnonymousClass1QG) {
            return "cta_call";
        }
        if (this instanceof AnonymousClass1QD) {
            return "open_webview";
        }
        if (this instanceof AnonymousClass1Q9) {
            return "form_message";
        }
        if (this instanceof AnonymousClass1Q3) {
            return "mpm";
        }
        if (this instanceof AnonymousClass1QB) {
            return "menu_options";
        }
        if (this instanceof AnonymousClass1QJ) {
            return "landline_call";
        }
        if (this instanceof AnonymousClass1QE) {
            return "cta_copy";
        }
        if (this instanceof AnonymousClass1QC) {
            return "cta_catalog";
        }
        if (this instanceof AnonymousClass1Q8) {
            return ((AnonymousClass1Q8) this).A00;
        }
        if (this instanceof AnonymousClass1QM) {
            return "send_location";
        }
        if (this instanceof AnonymousClass1QP) {
            return "galaxy_message";
        }
        return "address_message";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0192, code lost:
        if (r1 == 0) goto L_0x0194;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(android.content.Context r6, X.AnonymousClass398 r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass1QL
            if (r0 == 0) goto L_0x002b
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            if (r7 == 0) goto L_0x0020
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0020
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "display_text"
            java.lang.String r3 = r1.optString(r0)
            if (r3 == 0) goto L_0x0020
            int r0 = r3.length()
            if (r0 != 0) goto L_0x002a
        L_0x0020:
            r0 = 2131896151(0x7f122757, float:1.9427155E38)
        L_0x0023:
            java.lang.String r3 = r6.getString(r0)
            X.C162457s7.A0H(r3)
        L_0x002a:
            return r3
        L_0x002b:
            boolean r0 = r5 instanceof X.AnonymousClass1QH
            if (r0 == 0) goto L_0x004f
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            if (r7 == 0) goto L_0x004b
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x004b
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "display_text_secondary"
            java.lang.String r3 = r1.optString(r0)
            if (r3 == 0) goto L_0x004b
            int r0 = r3.length()
            if (r0 != 0) goto L_0x002a
        L_0x004b:
            r0 = 2131896140(0x7f12274c, float:1.9427133E38)
            goto L_0x0023
        L_0x004f:
            boolean r0 = r5 instanceof X.AnonymousClass1QK
            if (r0 == 0) goto L_0x005f
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r0 = 2131895048(0x7f122308, float:1.9424918E38)
            java.lang.String r0 = X.C18290x4.A0l(r6, r0)
            return r0
        L_0x005f:
            boolean r0 = r5 instanceof X.AnonymousClass1QF
            if (r0 == 0) goto L_0x0084
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r1 = 0
            if (r7 == 0) goto L_0x0072
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0072
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)
        L_0x0072:
            r0 = 2131887372(0x7f12050c, float:1.940935E38)
            java.lang.String r3 = X.C18290x4.A0l(r6, r0)
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "display_text"
            java.lang.String r0 = r1.optString(r0, r3)
            if (r0 == 0) goto L_0x002a
            return r0
        L_0x0084:
            boolean r0 = r5 instanceof X.AnonymousClass1Q7
            if (r0 == 0) goto L_0x0090
            r0 = 2131890919(0x7f1212e7, float:1.9416543E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x0090:
            boolean r0 = r5 instanceof X.AnonymousClass1Q6
            if (r0 == 0) goto L_0x009c
            r0 = 2131890915(0x7f1212e3, float:1.9416535E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x009c:
            boolean r0 = r5 instanceof X.AnonymousClass1Q5
            if (r0 == 0) goto L_0x00a8
            r0 = 2131890914(0x7f1212e2, float:1.9416533E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x00a8:
            boolean r0 = r5 instanceof X.AnonymousClass1Q4
            if (r0 == 0) goto L_0x00b4
            r0 = 2131890913(0x7f1212e1, float:1.9416531E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x00b4:
            boolean r0 = r5 instanceof X.AnonymousClass1QI
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = A01(r7)
            return r0
        L_0x00bd:
            boolean r0 = r5 instanceof X.AnonymousClass1QG
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = A01(r7)
            return r0
        L_0x00c6:
            boolean r0 = r5 instanceof X.AnonymousClass1QD
            if (r0 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x01d5
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x01d5
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r1 = "title"
            r0 = 0
            java.lang.String r0 = X.C57282tO.A00(r1, r2, r0)
            return r0
        L_0x00dd:
            boolean r0 = r5 instanceof X.AnonymousClass1Q9
            if (r0 == 0) goto L_0x00ed
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r0 = 2131890918(0x7f1212e6, float:1.9416541E38)
            java.lang.String r0 = X.C18290x4.A0l(r6, r0)
            return r0
        L_0x00ed:
            boolean r0 = r5 instanceof X.AnonymousClass1Q3
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "View items"
            return r0
        L_0x00f4:
            boolean r0 = r5 instanceof X.AnonymousClass1QB
            if (r0 == 0) goto L_0x012f
            r0 = r5
            X.1QB r0 = (X.AnonymousClass1QB) r0
            boolean r0 = r0 instanceof X.AnonymousClass1Q2
            if (r0 == 0) goto L_0x011b
            r1 = 0
            if (r7 == 0) goto L_0x011a
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x011a
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "title"
            r1 = 0
            java.lang.String r3 = X.C57282tO.A00(r0, r2, r1)
            java.lang.String r0 = "display_text"
            java.lang.String r1 = X.C57282tO.A00(r0, r2, r1)
            if (r3 != 0) goto L_0x002a
        L_0x011a:
            return r1
        L_0x011b:
            r3 = 0
            if (r7 == 0) goto L_0x002a
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x002a
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r1 = "title"
            r0 = 0
            java.lang.String r3 = X.C57282tO.A00(r1, r2, r0)
            return r3
        L_0x012f:
            boolean r0 = r5 instanceof X.AnonymousClass1QJ
            if (r0 == 0) goto L_0x0150
            r4 = r5
            X.1QJ r4 = (X.AnonymousClass1QJ) r4
            r3 = 0
            X.C162457s7.A0J(r6, r3)
            r2 = 2131887376(0x7f120510, float:1.9409357E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            if (r7 == 0) goto L_0x014e
            java.lang.String r0 = r7.A01
        L_0x0145:
            java.lang.String r0 = r4.A0C(r0)
            java.lang.String r0 = X.C18300x5.A0e(r6, r0, r1, r3, r2)
            return r0
        L_0x014e:
            r0 = 0
            goto L_0x0145
        L_0x0150:
            boolean r0 = r5 instanceof X.AnonymousClass1QE
            if (r0 == 0) goto L_0x0159
            java.lang.String r0 = A01(r7)
            return r0
        L_0x0159:
            boolean r0 = r5 instanceof X.AnonymousClass1QC
            if (r0 == 0) goto L_0x019f
            r2 = r5
            X.1QC r2 = (X.AnonymousClass1QC) r2
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            if (r7 == 0) goto L_0x016c
            java.lang.String r0 = r7.A01
        L_0x0168:
            r4 = 0
            if (r0 == 0) goto L_0x0189
            goto L_0x016e
        L_0x016c:
            r0 = 0
            goto L_0x0168
        L_0x016e:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0179 }
            java.lang.String r0 = "catalog_product_id"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x0179 }
            goto L_0x0189
        L_0x0179:
            X.66R r0 = r2.A02
            java.lang.Object r3 = r0.getValue()
            X.2qk r3 = (X.C55682qk) r3
            java.lang.String r2 = "malformed json"
            r1 = 0
            java.lang.String r0 = "CatalogCtaAction/extractProductId"
            r3.A0A(r0, r1, r2)
        L_0x0189:
            if (r4 == 0) goto L_0x0194
            int r1 = r4.length()
            r0 = 2131895050(0x7f12230a, float:1.9424922E38)
            if (r1 != 0) goto L_0x0197
        L_0x0194:
            r0 = 2131895049(0x7f122309, float:1.942492E38)
        L_0x0197:
            java.lang.String r0 = r6.getString(r0)
            X.C162457s7.A0H(r0)
            return r0
        L_0x019f:
            boolean r0 = r5 instanceof X.AnonymousClass1Q8
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r5 instanceof X.AnonymousClass1QM
            if (r0 == 0) goto L_0x01af
            r0 = 2131890916(0x7f1212e4, float:1.9416537E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x01af:
            boolean r0 = r5 instanceof X.AnonymousClass1QP
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = r7.A01
            java.util.Map r2 = X.AnonymousClass31O.A01(r0)
            java.lang.String r1 = "flow_cta"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = X.C18320x8.A0Z(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x01ca:
            java.lang.String r0 = ""
            return r0
        L_0x01cd:
            r0 = 2131890917(0x7f1212e5, float:1.941654E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x01d5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56692sP.A06(android.content.Context, X.398):java.lang.String");
    }

    public void A07(Activity activity, AnonymousClass2z0 r12, AnonymousClass398 r13) {
        JSONObject optJSONObject;
        if (this instanceof AnonymousClass1QH) {
            C18260x0.A0P(activity, r12);
            C19340zH A00 = AnonymousClass5V0.A00(activity);
            A00.A0T(R.string.f11nameremoved);
            C19340zH.A09(A00, r12, this, 11, R.string.f11nameremoved);
            A00.A0W(new AnonymousClass4I1(7), R.string.f11nameremoved);
            C18280x3.A0q(A00);
        } else if (this instanceof AnonymousClass1QA) {
            throw C18320x8.A0m();
        } else if (this instanceof AnonymousClass1QK) {
            AnonymousClass1QK r3 = (AnonymousClass1QK) this;
            C162457s7.A0J(activity, 0);
            C18260x0.A0Q(r13, r12);
            String A0C = r3.A0C(r13.A01);
            if (A0C == null || C175738Zn.A0V(A0C)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("malformed phone=");
                A0o.append(A0C);
                ((C55682qk) r3.A01.getValue()).A0A("ViewCatalogAction/execute", false, AnonymousClass000.A0X(" passed through ViewCatalogAction::isValid", A0o));
                return;
            }
            ((C85244Fm) r3.A02.getValue()).BkW(activity, Uri.parse(C58262uy.A00(AnonymousClass000.A0V("c/", A0C, AnonymousClass001.A0o())).A00.toString()), (C624134x) null);
            if (((C56952sp) r3.A00.getValue()).A0Y(C58422vE.A02, 3754)) {
                C42812Pp r32 = (C42812Pp) r3.A03.getValue();
                r32.A03.BkM(new C117715sN(r32, r12, A0C, 35));
            }
        } else if (this instanceof AnonymousClass1QF) {
            AnonymousClass1QF r5 = (AnonymousClass1QF) this;
            C18270x1.A10(activity, 0, r12);
            C95814uZ r1 = r12.A00;
            if (r1 != null) {
                AnonymousClass3ZH A07 = r5.A00.A07(r1);
                AnonymousClass1X8 r2 = new AnonymousClass1X8();
                r2.A00 = 1;
                r2.A01 = 0;
                C18280x3.A0t(r2, r5.A01, true);
                ((C1230066r) r5.A02.get()).Bpk(activity, A07, 36, false);
            }
        } else if (this instanceof AnonymousClass1QD) {
            C162457s7.A0J(activity, 0);
            C18260x0.A0Q(r13, r12);
            C53262mo r4 = ((AnonymousClass1QD) this).A01;
            C95814uZ r52 = r12.A00;
            r4.A00(r52, "link_to_webview", (String) null, 0, 4);
            String str = r13.A01;
            String str2 = null;
            if (str == null || (optJSONObject = AnonymousClass0x9.A1H(str).optJSONObject("link")) == null) {
                Log.e("CheckoutFromLinkAction/execute: unsupported link type");
            } else if (optJSONObject.optBoolean("in_app_webview")) {
                Intent A14 = C627736r.A14(activity, optJSONObject.getString("url"), optJSONObject.optString("success_url"), optJSONObject.optString("cancel_url"));
                A14.putExtra("message_cta_type", "link_to_webview");
                if (r52 != null) {
                    str2 = r52.getRawString();
                }
                A14.putExtra("webview_receiver_jid", str2);
                activity.startActivity(A14);
            } else {
                activity.startActivity(C18300x5.A08(optJSONObject.getString("url")));
            }
        } else if (this instanceof AnonymousClass1QJ) {
            AnonymousClass1QJ r6 = (AnonymousClass1QJ) this;
            boolean A1Y = AnonymousClass0x2.A1Y(activity, r13);
            String str3 = r13.A01;
            String A0C2 = r6.A0C(str3);
            Integer valueOf = Integer.valueOf(A1Y ? 1 : 0);
            if (A0C2 == null || C175738Zn.A0V(A0C2)) {
                r6.A01.A0A("LandLineCallAction/execute", false, "number in params json is INVALID but it pass VALID check");
                return;
            }
            AnonymousClass1X8 r14 = new AnonymousClass1X8();
            r14.A00 = valueOf;
            r14.A01 = valueOf;
            C18280x3.A0t(r14, r6.A02, A1Y);
            C111095hX r22 = r6.A00;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("tel:");
            C18310x6.A0y(activity, r22, AnonymousClass000.A0X(r6.A0C(str3), A0o2));
        } else {
            A08(activity, r12, r13, (Class) null);
        }
    }

    public void A08(Activity activity, AnonymousClass2z0 r6, AnonymousClass398 r7, Class cls) {
        String str;
        if (this instanceof AnonymousClass1QH) {
            C162457s7.A0J(activity, 0);
            C18260x0.A0Q(r7, r6);
            A07(activity, r6, r7);
        } else if (this instanceof AnonymousClass1QA) {
        } else {
            if (this instanceof AnonymousClass1QK) {
                C162457s7.A0J(activity, 0);
                C18260x0.A0Q(r7, r6);
                A07(activity, r6, r7);
            } else if (this instanceof AnonymousClass1QF) {
                C162457s7.A0J(activity, 0);
                C18260x0.A0Q(r7, r6);
                A07(activity, r6, r7);
            } else {
                if (this instanceof AnonymousClass1Q7) {
                    Intent A08 = AnonymousClass0x9.A08(activity, cls);
                    C626936e.A06(r7);
                    String str2 = r7.A01;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "{}";
                    }
                    String optString = AnonymousClass0x9.A1H(str2).optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (TextUtils.isEmpty(optString)) {
                        str = "[NFM]: WaViewTransactionAction - ConversationRow -- transaction-id is unavailable";
                    } else {
                        A08.putExtra("referral_screen", "chat");
                        A08.putExtra("extra_transaction_id", optString);
                        activity.startActivity(A08);
                        return;
                    }
                } else if (this instanceof AnonymousClass1Q6) {
                    Intent A082 = AnonymousClass0x9.A08(activity, cls);
                    C626936e.A06(r7);
                    A082.putExtra("screen_name", "brpay_p_pin_change_verify");
                    activity.startActivity(A082);
                    return;
                } else if (this instanceof AnonymousClass1Q5) {
                    Intent A083 = AnonymousClass0x9.A08(activity, cls);
                    C626936e.A06(r7);
                    String str3 = r7.A01;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "{}";
                    }
                    String optString2 = AnonymousClass0x9.A1H(str3).optString("url");
                    if (TextUtils.isEmpty(optString2)) {
                        str = "[NFM]: ConversationRow -- NFM url is unavailable to redirect.";
                    } else {
                        A083.putExtra("webview_url", optString2);
                        A083.putExtra("webview_hide_url", true);
                        A083.putExtra("webview_javascript_enabled", true);
                        A083.putExtra("webview_avoid_external", true);
                        activity.startActivity(A083);
                        return;
                    }
                } else if (this instanceof AnonymousClass1Q4) {
                    C626936e.A06(r7);
                    String str4 = r7.A01;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "{}";
                    }
                    JSONObject A1H = AnonymousClass0x9.A1H(str4);
                    Intent A084 = AnonymousClass0x9.A08(activity, cls);
                    A084.putExtra("survey_id", A1H.optString("survey_id"));
                    A084.putExtra("entry_point", A1H.optString("entry_point"));
                    A084.putExtra("session_id", A1H.optString("session_id"));
                    activity.startActivity(A084);
                    return;
                } else if (this instanceof AnonymousClass1QI) {
                    throw C18320x8.A0m();
                } else if (this instanceof AnonymousClass1QG) {
                    throw C18320x8.A0m();
                } else if (this instanceof AnonymousClass1QD) {
                    C162457s7.A0J(activity, 0);
                    C18260x0.A0Q(r7, r6);
                    A07(activity, r6, r7);
                    return;
                } else if (this instanceof AnonymousClass1Q9) {
                    ((AnonymousClass1Q9) this).A00.A0A("InteractiveMessage/FormMessage/execute", false, "Form message doesn't support execute action");
                    return;
                } else if (this instanceof AnonymousClass1Q3) {
                    return;
                } else {
                    if (this instanceof AnonymousClass1QB) {
                        throw C18320x8.A0m();
                    } else if (this instanceof AnonymousClass1QJ) {
                        C162457s7.A0J(activity, 0);
                        C18260x0.A0Q(r7, r6);
                        A07(activity, r6, r7);
                        return;
                    } else if (this instanceof AnonymousClass1QE) {
                        throw C18320x8.A0m();
                    } else if (this instanceof AnonymousClass1QC) {
                        throw C18320x8.A0m();
                    } else {
                        return;
                    }
                }
                Log.e(str);
            }
        }
    }

    public boolean A0A(AnonymousClass1VX r3) {
        if (this instanceof AnonymousClass1QP) {
            return r3.A0Y(C58422vE.A02, 2885);
        }
        if (this instanceof AnonymousClass1QK) {
            C162457s7.A0J(r3, 1);
            return C56952sp.A0J(r3, 3921);
        } else if (this instanceof AnonymousClass1QI) {
            return A02(r3);
        } else {
            if (this instanceof AnonymousClass1Q2) {
                return A02(r3);
            }
            if (this instanceof AnonymousClass1QG) {
                return A02(r3);
            }
            if (this instanceof AnonymousClass1QE) {
                return A02(r3);
            }
            if (!(this instanceof AnonymousClass1QC)) {
                return false;
            }
            C162457s7.A0J(r3, 1);
            return C56952sp.A0J(r3, 4957);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if (X.C175728Zm.A0S(r1, "display_text", false) == false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(X.AnonymousClass1VX r5, X.AnonymousClass1EU r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass1QL
            if (r0 == 0) goto L_0x000f
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 5075(0x13d3, float:7.112E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x000f:
            boolean r0 = r4 instanceof X.AnonymousClass1QH
            if (r0 == 0) goto L_0x001e
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 5075(0x13d3, float:7.112E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x001e:
            boolean r0 = r4 instanceof X.AnonymousClass1QK
            if (r0 == 0) goto L_0x002d
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 3457(0xd81, float:4.844E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x002d:
            boolean r0 = r4 instanceof X.AnonymousClass1QF
            if (r0 == 0) goto L_0x003c
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 4037(0xfc5, float:5.657E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x003c:
            boolean r0 = r4 instanceof X.AnonymousClass1QI
            if (r0 == 0) goto L_0x0045
            boolean r0 = A02(r5)
            return r0
        L_0x0045:
            boolean r0 = r4 instanceof X.AnonymousClass1QG
            if (r0 == 0) goto L_0x004e
            boolean r0 = A02(r5)
            return r0
        L_0x004e:
            boolean r0 = r4 instanceof X.AnonymousClass1QD
            if (r0 == 0) goto L_0x005d
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 3051(0xbeb, float:4.275E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x005d:
            boolean r0 = r4 instanceof X.AnonymousClass1Q9
            if (r0 == 0) goto L_0x006e
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r1 = 5124(0x1404, float:7.18E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            return r0
        L_0x006e:
            boolean r0 = r4 instanceof X.AnonymousClass1QB
            if (r0 == 0) goto L_0x00c7
            r0 = r4
            X.1QB r0 = (X.AnonymousClass1QB) r0
            boolean r0 = r0 instanceof X.AnonymousClass1Q2
            if (r0 == 0) goto L_0x00bc
            r2 = 0
            X.C18270x1.A14(r6, r5)
            boolean r0 = X.C625235k.A03(r6)
            if (r0 == 0) goto L_0x00b5
            X.1ER r0 = X.C625235k.A00(r6)
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x00b5
            X.1ER r0 = X.C625235k.A00(r6)
            X.1C7 r0 = r0.A0N()
            X.8ya r0 = r0.buttons_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00b5
            X.1ER r0 = X.C625235k.A00(r6)
            X.1C7 r0 = r0.A0N()
            java.lang.String r1 = X.C18300x5.A0j(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "display_text"
            boolean r1 = X.C175728Zm.A0S(r1, r0, r2)
            r0 = 4001(0xfa1, float:5.607E-42)
            if (r1 != 0) goto L_0x00b7
        L_0x00b5:
            r0 = 2960(0xb90, float:4.148E-42)
        L_0x00b7:
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x00bc:
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 2960(0xb90, float:4.148E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x00c7:
            boolean r0 = r4 instanceof X.AnonymousClass1QJ
            if (r0 == 0) goto L_0x00d6
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 4037(0xfc5, float:5.657E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x00d6:
            boolean r0 = r4 instanceof X.AnonymousClass1QE
            if (r0 == 0) goto L_0x00df
            boolean r0 = A02(r5)
            return r0
        L_0x00df:
            boolean r0 = r4 instanceof X.AnonymousClass1QC
            if (r0 == 0) goto L_0x00ee
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            r0 = 4957(0x135d, float:6.946E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x00ee:
            boolean r0 = r4 instanceof X.AnonymousClass1QM
            if (r0 == 0) goto L_0x00f9
            r0 = 2386(0x952, float:3.343E-42)
            boolean r0 = X.C56952sp.A0J(r5, r0)
            return r0
        L_0x00f9:
            boolean r0 = r4 instanceof X.AnonymousClass1QP
            if (r0 == 0) goto L_0x014e
            r0 = 1694(0x69e, float:2.374E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r2, r0)
            if (r0 != 0) goto L_0x014c
            X.1ER r0 = X.C625235k.A00(r6)
            X.1C7 r0 = r0.A0N()
            java.lang.String r0 = X.C18300x5.A0j(r0)
            java.util.Map r0 = X.AnonymousClass31O.A01(r0)
            java.lang.String r1 = X.C57142tA.A01(r0)
            if (r1 == 0) goto L_0x014c
            java.lang.String r0 = "2.23.26.14"
            X.2y6 r3 = X.C60162y6.A00(r0)
            r0 = 2306(0x902, float:3.231E-42)
            java.lang.String r0 = r5.A0R(r2, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0141
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0141 }
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch:{ JSONException -> 0x0141 }
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "min_android_app_supported_version"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0141 }
            X.2y6 r2 = X.C60162y6.A00(r0)     // Catch:{ JSONException -> 0x0141 }
        L_0x0141:
            if (r3 == 0) goto L_0x014c
            if (r2 == 0) goto L_0x014c
            int r0 = r3.A01(r2)
            r1 = 0
            if (r0 >= 0) goto L_0x014d
        L_0x014c:
            r1 = 1
        L_0x014d:
            return r1
        L_0x014e:
            boolean r0 = r4 instanceof X.AnonymousClass1QQ
            if (r0 == 0) goto L_0x015b
            r1 = 1538(0x602, float:2.155E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            return r0
        L_0x015b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56692sP.A0B(X.1VX, X.1EU):boolean");
    }
}
