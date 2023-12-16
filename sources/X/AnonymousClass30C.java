package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.30C  reason: invalid class name */
public class AnonymousClass30C {
    public Map A00;
    public final C56422rx A01;
    public final C44352Vs A02;
    public final AnonymousClass2R0 A03;
    public final C53412n3 A04;
    public final C66543Lv A05;
    public final AnonymousClass2O2 A06;
    public final C50312hy A07;
    public final AnonymousClass4FV A08;
    public final AnonymousClass2Ze A09;
    public final AnonymousClass9U4 A0A;
    public final C55832qz A0B;
    public final AnonymousClass4FS A0C;
    public final Set A0D;
    public final Set A0E;

    public static int A00(C55502qS r4) {
        if (r4 != null) {
            int i = r4.A01;
            boolean A022 = r4.A02();
            if (i == 2) {
                if (A022) {
                    return 4;
                }
                Log.w("NativeFlowActionUtilsImpl/getBizPlatform: unexpected combination of isCloudApi and isEnterprise results");
            } else if (A022) {
                return 3;
            } else {
                if (r4.A03()) {
                    return 2;
                }
            }
        }
        return 1;
    }

    public C56692sP A01(AnonymousClass1EU r6) {
        C56692sP A002;
        if ((r6.bitField1_ & 1) != 0) {
            C21801Df r0 = r6.buttonsMessage_;
            C21801Df r1 = r0;
            if (r0 == null) {
                r0 = C21801Df.DEFAULT_INSTANCE;
            }
            if (r0.buttons_ != null) {
                if (r1 == null) {
                    r1 = C21801Df.DEFAULT_INSTANCE;
                }
                for (C21591Ck r12 : r1.buttons_) {
                    if ((r12.bitField0_ & 8) != 0) {
                        AnonymousClass1BB r13 = r12.nativeFlowInfo_;
                        AnonymousClass1BB r02 = r13;
                        if (r13 == null) {
                            r13 = AnonymousClass1BB.DEFAULT_INSTANCE;
                        }
                        String str = r13.name_;
                        if (r02 == null) {
                            r02 = AnonymousClass1BB.DEFAULT_INSTANCE;
                        }
                        C56692sP A003 = this.A02.A00(str, r02.paramsJson_);
                        if (A003 != null) {
                            return A003;
                        }
                    }
                }
                return null;
            }
        }
        if (!C625235k.A03(r6) || C625235k.A00(r6).interactiveMessageCase_ != 6) {
            return null;
        }
        AnonymousClass1C7 A0N = C625235k.A00(r6).A0N();
        for (AnonymousClass1BH r14 : A0N.buttons_) {
            if ((r14.bitField0_ & 1) != 0 && (A002 = this.A02.A00(r14.name_, r14.buttonParamsJson_)) != null) {
                return A002;
            }
        }
        if ((A0N.bitField0_ & 1) == 0) {
            return null;
        }
        String str2 = A0N.messageParamsJson_;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            C56692sP A004 = this.A02.A00(AnonymousClass0x9.A1H(str2).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), str2);
            if (A004 != null) {
                return A004;
            }
            return null;
        } catch (JSONException unused) {
            Log.e("NativeFlowActionUtils/getNativeFlowAction. NFM message has invalid params json");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f9, code lost:
        if (r9.length() != 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027f, code lost:
        if (r6.length() == 0) goto L_0x0281;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.app.Activity r25, X.C624134x r26, X.AnonymousClass398 r27, int r28) {
        /*
            r24 = this;
            r6 = r27
            r1 = r25
            X.C626936e.A06(r6)
            java.lang.String r8 = r6.A00
            r11 = r24
            X.2Vs r0 = r11.A02
            java.lang.String r3 = r6.A01
            X.2sP r0 = r0.A00(r8, r3)
            if (r0 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NativeFlowActionUtils/handleRequest -- can not recognize NFM action: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r1)
        L_0x001f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0022:
            return
        L_0x0023:
            java.util.Set r2 = r11.A0D
            boolean r2 = r2.contains(r8)
            r4 = r26
            if (r2 == 0) goto L_0x0039
            X.2me r7 = new X.2me
            r7.<init>(r4)
            boolean r2 = r0 instanceof X.AnonymousClass1QA
            if (r2 != 0) goto L_0x048e
            java.lang.String r0 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction."
            goto L_0x001f
        L_0x0039:
            X.2O2 r9 = r11.A06
            X.2z0 r2 = r4.A1J
            java.lang.String r7 = r2.A01
            r5 = 0
            r12 = 0
            X.2iZ r10 = new X.2iZ
            r10.<init>()
            X.C162457s7.A0J(r7, r5)
            java.util.HashMap r9 = r9.A01
            r9.put(r7, r10)
            java.util.Set r9 = r11.A0E
            boolean r9 = r9.contains(r8)
            r14 = r28
            if (r9 == 0) goto L_0x01a2
            boolean r5 = r0 instanceof X.AnonymousClass1QB
            if (r5 != 0) goto L_0x005f
            java.lang.String r0 = "NativeFlowActionUtils/processMenuOptionsNativeFlow. Base class for action should be MenuOptionsNativeFlowAction."
            goto L_0x001f
        L_0x005f:
            if (r3 == 0) goto L_0x0022
            int r23 = X.C624134x.A05(r4)
            java.lang.String r20 = X.C18280x3.A0Y()
            java.lang.String r5 = "menu_options"
            X.4uZ r8 = r2.A00
            r16 = r0
            r17 = r8
            r18 = r4
            r19 = r6
            r21 = r5
            r22 = r7
            r15 = r11
            r15.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.1QB r0 = (X.AnonymousClass1QB) r0
            boolean r2 = r0 instanceof X.AnonymousClass1Q1
            if (r2 == 0) goto L_0x012a
            X.1Q1 r0 = (X.AnonymousClass1Q1) r0
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            org.json.JSONObject r9 = X.AnonymousClass0x9.A1H(r3)
            X.C626936e.A06(r9)
            X.C162457s7.A0D(r9)
            X.39W r6 = new X.39W
            r6.<init>()
            java.lang.String r2 = "sections"
            java.lang.String r2 = r9.getString(r2)
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>(r2)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            int r20 = r10.length()
            r7 = 0
        L_0x00ad:
            r2 = r20
            if (r7 >= r2) goto L_0x010c
            org.json.JSONObject r3 = r10.getJSONObject(r7)
            java.lang.String r13 = "title"
            java.lang.String r19 = X.C18300x5.A0l(r13, r3)
            java.lang.String r2 = "highlight_label"
            java.lang.String r18 = r3.optString(r2)
            java.lang.String r2 = "rows"
            org.json.JSONArray r17 = r3.getJSONArray(r2)
            java.util.ArrayList r11 = X.C18300x5.A0t(r17)
            int r16 = r17.length()
            r12 = 0
        L_0x00d2:
            r2 = r16
            if (r12 >= r2) goto L_0x00fd
            r2 = r17
            org.json.JSONObject r3 = r2.getJSONObject(r12)
            java.lang.String r2 = "id"
            java.lang.String r15 = X.C18290x4.A0r(r2, r3)
            java.lang.String r2 = "header"
            java.lang.String r14 = r3.optString(r2)
            java.lang.String r5 = X.C18290x4.A0r(r13, r3)
            java.lang.String r2 = "description"
            java.lang.String r3 = r3.optString(r2)
            X.5dY r2 = new X.5dY
            r2.<init>(r15, r14, r5, r3)
            r11.add(r2)
            int r12 = r12 + 1
            goto L_0x00d2
        L_0x00fd:
            X.5dS r5 = new X.5dS
            r3 = r19
            r2 = r18
            r5.<init>(r3, r2, r11)
            r8.add(r5)
            int r7 = r7 + 1
            goto L_0x00ad
        L_0x010c:
            r6.A0B = r8
            java.lang.String r2 = "title"
            java.lang.String r2 = r9.getString(r2)
            r6.A07 = r2
            X.67A r2 = X.AnonymousClass31N.A01(r1)
            if (r2 == 0) goto L_0x0126
            X.3FA r1 = new X.3FA
            r1.<init>(r2, r0, r4)
            r2.BgN(r1, r6)
            return
        L_0x0126:
            java.lang.String r0 = "SingleSelectAction/execute/error: not a click in Conversation"
            goto L_0x001f
        L_0x012a:
            X.1Q2 r0 = (X.AnonymousClass1Q2) r0
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            boolean r2 = X.C624134x.A0e(r4)
            if (r2 == 0) goto L_0x0153
            r0 = 2131892832(0x7f121a60, float:1.9420423E38)
            java.lang.String r0 = X.C18290x4.A0l(r1, r0)
            X.0zH r4 = X.C19340zH.A00(r1, r0)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            X.0sA r1 = (X.C15910sA) r1
            r2 = 1
            X.4K6 r0 = new X.4K6
            r0.<init>(r2)
            r4.A0d(r1, r0, r3)
            X.C18280x3.A0q(r4)
            return
        L_0x0153:
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r3)
            X.C626936e.A06(r7)
            X.C162457s7.A0D(r7)
            java.lang.String r3 = "display_text"
            boolean r2 = r7.has(r3)
            if (r2 == 0) goto L_0x04bf
            X.67A r2 = X.AnonymousClass31N.A01(r1)
            if (r2 == 0) goto L_0x019e
            boolean r1 = r4 instanceof X.AnonymousClass4DV
            if (r1 == 0) goto L_0x0022
            java.lang.String r9 = r7.optString(r3)
            java.lang.String r1 = "id"
            java.lang.String r10 = r7.optString(r1)
            java.lang.String r11 = ""
            r13 = 1
            r15 = 0
            java.lang.Integer r8 = X.AnonymousClass36V.A03(r4)
            X.2w3 r7 = new X.2w3
            r16 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.BlW(r4, r7)
            r0.A0C(r4, r14)
            X.4FS r1 = r0.A08
            r8 = 8
            X.3c6 r3 = new X.3c6
            r5 = r0
            r6 = r7
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r1.BkM(r3)
            return
        L_0x019e:
            java.lang.String r0 = "QuickReplyAction/executeTemplateAction/error: not clicked in Conversation activity"
            goto L_0x001f
        L_0x01a2:
            java.lang.String r9 = "open_webview"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "catalog_message"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "voice_call"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "landline_call"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "cta_reminder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "cta_cancel_reminder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x05fc
            java.lang.String r9 = "cta_catalog"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x02b2
            X.1QC r0 = (X.AnonymousClass1QC) r0
            X.C162457s7.A0J(r1, r5)
            java.lang.String r8 = "CatalogCtaAction/extractBizPhone"
            r7 = 0
            if (r3 == 0) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r9 = r12
            goto L_0x01fb
        L_0x01e9:
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ JSONException -> 0x020a }
            java.lang.String r2 = "business_phone_number"
            java.lang.String r9 = r6.getString(r2)     // Catch:{ JSONException -> 0x020a }
            if (r9 == 0) goto L_0x01fb
            int r2 = r9.length()     // Catch:{ JSONException -> 0x020a }
            if (r2 != 0) goto L_0x0208
        L_0x01fb:
            X.66R r2 = r0.A02     // Catch:{ JSONException -> 0x020a }
            java.lang.Object r6 = r2.getValue()     // Catch:{ JSONException -> 0x020a }
            X.2qk r6 = (X.C55682qk) r6     // Catch:{ JSONException -> 0x020a }
            java.lang.String r2 = "malformed phone number"
            r6.A0A(r8, r5, r2)     // Catch:{ JSONException -> 0x020a }
        L_0x0208:
            r7 = r9
            goto L_0x0217
        L_0x020a:
            X.66R r2 = r0.A02
            java.lang.Object r6 = r2.getValue()
            X.2qk r6 = (X.C55682qk) r6
            java.lang.String r2 = "malformed json"
            r6.A0A(r8, r5, r2)
        L_0x0217:
            r6 = 0
            if (r3 == 0) goto L_0x0234
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ JSONException -> 0x0225 }
            java.lang.String r2 = "catalog_product_id"
            java.lang.String r6 = r3.getString(r2)     // Catch:{ JSONException -> 0x0225 }
            goto L_0x0234
        L_0x0225:
            X.66R r2 = r0.A02
            java.lang.Object r8 = r2.getValue()
            X.2qk r8 = (X.C55682qk) r8
            java.lang.String r3 = "malformed json"
            java.lang.String r2 = "CatalogCtaAction/extractProductId"
            r8.A0A(r2, r5, r3)
        L_0x0234:
            if (r7 == 0) goto L_0x02a2
            int r2 = r7.length()
            if (r2 == 0) goto L_0x02a2
            if (r6 == 0) goto L_0x0298
            int r2 = r6.length()
            if (r2 == 0) goto L_0x0298
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "/p/"
            r3.append(r2)
            r3.append(r6)
            r2 = 47
            r3.append(r2)
        L_0x0255:
            java.lang.String r2 = X.AnonymousClass000.A0X(r7, r3)
            X.2uy r2 = X.C58262uy.A00(r2)
            android.net.Uri r2 = r2.A00
            java.lang.String r2 = r2.toString()
            android.net.Uri r3 = android.net.Uri.parse(r2)
            X.66R r2 = r0.A03
            java.lang.Object r2 = r2.getValue()
            X.4Fm r2 = (X.C85244Fm) r2
            r2.BkW(r1, r3, r12)
        L_0x0272:
            boolean r1 = X.C624134x.A0f(r4)
            if (r1 == 0) goto L_0x0022
            if (r6 == 0) goto L_0x0281
            int r1 = r6.length()
            r9 = 4
            if (r1 != 0) goto L_0x0282
        L_0x0281:
            r9 = 3
        L_0x0282:
            X.2oz r3 = r0.A00
            r2 = 2
            X.20x[] r1 = new X.C370920x[r2]
            X.2kE r1 = X.C370920x.A00(r1)
            X.3cL r5 = new X.3cL
            r6 = r0
            r7 = r14
            r8 = r4
            r10 = r2
            r5.<init>((java.lang.Object) r6, (int) r7, (java.lang.Object) r8, (int) r9, (int) r10)
            r3.A01(r1, r4, r5)
            return
        L_0x0298:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "c/"
            r3.append(r2)
            goto L_0x0255
        L_0x02a2:
            X.66R r1 = r0.A02
            java.lang.Object r3 = r1.getValue()
            X.2qk r3 = (X.C55682qk) r3
            java.lang.String r2 = "CatalogCtaAction/execute"
            java.lang.String r1 = "malformed phone passed through"
            r3.A0A(r2, r5, r1)
            goto L_0x0272
        L_0x02b2:
            java.lang.String r9 = "cta_call"
            boolean r10 = r9.equals(r8)
            if (r10 == 0) goto L_0x034b
            boolean r8 = r0 instanceof X.AnonymousClass1QG
            if (r8 != 0) goto L_0x02c2
            java.lang.String r0 = "NativeFlowActionUtils/processPhoneCallNativeFlow. Base class for action should be PhoneCallAction."
            goto L_0x001f
        L_0x02c2:
            if (r3 == 0) goto L_0x0022
            int r23 = X.C624134x.A05(r4)
            java.lang.String r20 = X.C18280x3.A0Y()
            X.4uZ r2 = r2.A00
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r6
            r21 = r9
            r22 = r7
            r15 = r11
            r15.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.1QG r0 = (X.AnonymousClass1QG) r0
            X.C162457s7.A0J(r1, r5)
            r19 = 3
            boolean r2 = r4 instanceof X.AnonymousClass4DV
            if (r2 == 0) goto L_0x0022
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r3)
            java.lang.String r2 = "phone_number"
            java.lang.String r6 = r3.optString(r2)
            if (r6 == 0) goto L_0x0022
            java.lang.String r16 = ""
            X.2w3 r15 = new X.2w3
            r18 = r16
            r20 = r14
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            boolean r2 = X.C18300x5.A1T(r4)
            if (r2 == 0) goto L_0x031d
            X.4FS r3 = r0.A05
            r21 = 7
            X.3c6 r2 = new X.3c6
            r16 = r2
            r17 = r0
            r18 = r4
            r19 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r3.BkM(r2)
        L_0x031d:
            boolean r2 = X.C624134x.A0f(r4)
            if (r2 == 0) goto L_0x0336
            X.2oz r7 = r0.A01
            r2 = 2
            X.20x[] r2 = new X.C370920x[r2]
            X.2kE r5 = X.C370920x.A00(r2)
            r3 = 30
            X.3ca r2 = new X.3ca
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r0, (int) r14, (int) r3)
            r7.A01(r5, r4, r2)
        L_0x0336:
            X.5hX r3 = r0.A00
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.BkW(r1, r0, r12)
            return
        L_0x034b:
            java.lang.String r9 = "cta_url"
            boolean r10 = r9.equals(r8)
            if (r10 == 0) goto L_0x040c
            boolean r8 = r0 instanceof X.AnonymousClass1QI
            if (r8 != 0) goto L_0x035b
            java.lang.String r0 = "NativeFlowActionUtils/processUrlNativeFlow. Base class for action should be UrlAction."
            goto L_0x001f
        L_0x035b:
            if (r3 == 0) goto L_0x0022
            int r23 = X.C624134x.A05(r4)
            java.lang.String r20 = X.C18280x3.A0Y()
            X.4uZ r2 = r2.A00
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r6
            r21 = r9
            r22 = r7
            r15 = r11
            r15.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.1QI r0 = (X.AnonymousClass1QI) r0
            X.C162457s7.A0J(r1, r5)
            r7 = 2
            boolean r2 = r4 instanceof X.AnonymousClass4DV
            if (r2 == 0) goto L_0x0022
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r3)
            java.lang.String r3 = "url"
            java.lang.String r17 = r2.optString(r3)
            if (r17 != 0) goto L_0x0390
            java.lang.String r17 = ""
        L_0x0390:
            java.lang.String r3 = "merchant_url"
            java.lang.String r8 = r2.optString(r3)
            java.lang.String r3 = "consented_users_url"
            java.lang.String r3 = r2.optString(r3)
            java.lang.String r16 = ""
            X.2w3 r15 = new X.2w3
            r20 = r14
            r18 = r3
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            X.1VX r10 = r0.A02
            r6 = 5970(0x1752, float:8.366E-42)
            X.2vE r9 = X.C58422vE.A02
            boolean r11 = r10.A0Y(r9, r6)
            r6 = 1
            if (r11 == 0) goto L_0x03c9
            java.lang.String r11 = "webview_presentation"
            java.lang.String r11 = r2.optString(r11)
            if (r11 == 0) goto L_0x03c9
            boolean r2 = X.C175738Zn.A0V(r11)
            r2 = r2 ^ 1
            if (r2 != r6) goto L_0x03c9
            r15.A03 = r11
        L_0x03c9:
            boolean r2 = X.C624134x.A0f(r4)
            if (r2 != 0) goto L_0x0526
            boolean r2 = X.C624134x.A0e(r4)
            if (r2 != 0) goto L_0x0526
            boolean r2 = X.C18300x5.A1T(r4)
            if (r2 == 0) goto L_0x03ef
            X.4FS r5 = r0.A08
            r21 = 9
            X.3c6 r2 = new X.3c6
            r16 = r2
            r17 = r0
            r18 = r4
            r19 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r5.BkM(r2)
        L_0x03ef:
            com.whatsapp.jid.UserJid r5 = r4.A0o()
            X.2qi r7 = r0.A01
            boolean r2 = r7.A04(r4)
            if (r2 == 0) goto L_0x0503
            r8 = r1
            r9 = r12
            r10 = r4
            r11 = r15
            r12 = r3
            r13 = r6
            r7.A02(r8, r9, r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0022
            X.2q9 r0 = r0.A06
            r0.A00(r5)
            return
        L_0x040c:
            java.lang.String r9 = "cta_copy"
            boolean r5 = r9.equals(r8)
            if (r5 == 0) goto L_0x046c
            boolean r5 = r0 instanceof X.AnonymousClass1QE
            if (r5 != 0) goto L_0x041c
            java.lang.String r0 = "NativeFlowActionUtils/processCopyCodeNativeFlow. Base class for action should be CopyCodeAction."
            goto L_0x001f
        L_0x041c:
            if (r3 == 0) goto L_0x0022
            int r23 = X.C624134x.A05(r4)
            java.lang.String r20 = X.C18280x3.A0Y()
            X.4uZ r2 = r2.A00
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r6
            r21 = r9
            r22 = r7
            r15 = r11
            r15.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.1QE r0 = (X.AnonymousClass1QE) r0
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            boolean r2 = r4 instanceof X.AnonymousClass4DV
            if (r2 == 0) goto L_0x0022
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r3)
            java.lang.String r2 = "copy_code"
            java.lang.String r3 = r3.optString(r2)
            if (r3 != 0) goto L_0x0450
            java.lang.String r3 = ""
        L_0x0450:
            X.2nH r2 = r0.A01
            r2.A01(r3)
            boolean r2 = X.C18300x5.A1T(r4)
            if (r2 == 0) goto L_0x0462
            X.4FS r3 = r0.A02
            r2 = 29
            X.C71733ca.A01(r3, r4, r0, r14, r2)
        L_0x0462:
            X.67A r0 = X.AnonymousClass31N.A01(r1)
            if (r0 == 0) goto L_0x0022
            r0.BiX()
            return
        L_0x046c:
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r3 = "nfm_action"
            r5.putString(r3, r8)
            X.9U4 r3 = r11.A0A
            X.9oC r3 = r3.A0G()
            java.lang.Class r5 = r3.B9x(r5)
            if (r5 != 0) goto L_0x05e3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NativeFlowActionUtils/handleRequest/processPaymentNativeFlow -- NFM action support class not found: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r1)
            goto L_0x001f
        L_0x048e:
            X.2O2 r2 = r11.A06
            java.lang.String r5 = r7.A04
            X.2iZ r3 = r7.A01
            java.util.HashMap r2 = r2.A01
            r2.put(r5, r3)
            r4 = r0
            X.1QA r4 = (X.AnonymousClass1QA) r4
            X.34x r3 = r7.A03
            int r19 = X.C624134x.A05(r3)
            java.lang.String r16 = X.C18280x3.A0Y()
            X.4uZ r2 = r7.A02
            r12 = r0
            r13 = r2
            r14 = r3
            r15 = r6
            r17 = r8
            r18 = r5
            r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            long r2 = r7.A00
            r12 = r4
            r13 = r1
            r14 = r6
            r15 = r5
            r17 = r2
            r12.A0D(r13, r14, r15, r16, r17)
            return
        L_0x04bf:
            X.35J r1 = r0.A05
            X.2z0 r3 = X.AnonymousClass35J.A01(r8, r1)
            X.2sH r1 = r0.A00
            long r1 = r1.A0H()
            X.1p2 r6 = new X.1p2
            r6.<init>(r3, r1)
            X.2Wx r1 = r0.A06
            r1.A00(r6, r4)
            java.lang.String r3 = "id"
            java.lang.String r2 = r7.optString(r3)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            org.json.JSONObject r2 = r1.put(r3, r2)
            java.lang.String r1 = "title"
            java.lang.String r3 = r7.getString(r1)
            java.lang.String r1 = r2.toString()
            X.397 r2 = new X.397
            r2.<init>(r5, r1)
            X.39N r1 = new X.39N
            r1.<init>(r12, r2, r3)
            r6.A00 = r1
            X.3Lv r1 = r0.A01
            r1.A0V(r6)
            r0.A0C(r4, r14)
            return
        L_0x0503:
            if (r3 == 0) goto L_0x0522
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0522
            if (r5 == 0) goto L_0x0522
            X.8qC r2 = r0.A09
            java.lang.Object r2 = r2.get()
            X.2zw r2 = (X.C61242zw) r2
            boolean r2 = r2.A04(r5)
            if (r2 == 0) goto L_0x0522
            r15.A01 = r3
            X.2q9 r0 = r0.A06
            r0.A00(r5)
        L_0x0522:
            r7.A03(r1, r4, r15)
            return
        L_0x0526:
            if (r8 == 0) goto L_0x052e
            boolean r2 = X.C175738Zn.A0V(r8)
            if (r2 == 0) goto L_0x0530
        L_0x052e:
            java.lang.String r8 = r15.A01
        L_0x0530:
            X.C162457s7.A0H(r8)
            java.lang.String r13 = r15.A01
            X.C162457s7.A0C(r13)
            java.lang.String r3 = "UrlAction"
            r2 = 6626(0x19e2, float:9.285E-42)
            java.lang.String r11 = X.C56952sp.A08(r10, r2)
            boolean r2 = X.C162457s7.A0P(r8, r13)
            if (r2 != 0) goto L_0x0583
            boolean r2 = X.C175738Zn.A0V(r11)
            if (r2 != 0) goto L_0x0583
            java.net.URI r12 = new java.net.URI     // Catch:{ URISyntaxException -> 0x057b }
            r12.<init>(r13)     // Catch:{ URISyntaxException -> 0x057b }
            java.lang.String r13 = r12.getScheme()     // Catch:{ URISyntaxException -> 0x057b }
            java.lang.String r2 = "https"
            if (r13 == 0) goto L_0x0573
            boolean r2 = r13.equalsIgnoreCase(r2)     // Catch:{ URISyntaxException -> 0x057b }
            if (r2 == 0) goto L_0x0573
            java.lang.String r2 = r12.getHost()     // Catch:{ URISyntaxException -> 0x057b }
            if (r2 == 0) goto L_0x056b
            boolean r2 = r2.equalsIgnoreCase(r11)     // Catch:{ URISyntaxException -> 0x057b }
            if (r2 != 0) goto L_0x0583
        L_0x056b:
            X.2qk r2 = r0.A00     // Catch:{ URISyntaxException -> 0x057b }
            java.lang.String r1 = "Trackable link domain mismatch"
            r2.A0A(r3, r5, r1)     // Catch:{ URISyntaxException -> 0x057b }
            return
        L_0x0573:
            X.2qk r2 = r0.A00     // Catch:{ URISyntaxException -> 0x057b }
            java.lang.String r1 = "Trackable link protocol mismatch"
            r2.A0A(r3, r5, r1)     // Catch:{ URISyntaxException -> 0x057b }
            return
        L_0x057b:
            X.2qk r1 = r0.A00
            java.lang.String r0 = "Trackable link uri syntax invalid"
            r1.A0A(r3, r5, r0)
            return
        L_0x0583:
            r2 = 5044(0x13b4, float:7.068E-42)
            boolean r2 = r10.A0Y(r9, r2)
            if (r2 == 0) goto L_0x05df
            r2 = 6693(0x1a25, float:9.379E-42)
            boolean r2 = r10.A0Y(r9, r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 2131894910(0x7f12227e, float:1.9424638E38)
            java.lang.String r3 = X.C18290x4.A0l(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r8
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            X.C162457s7.A0D(r2)
            android.text.Spanned r2 = X.C02890Hz.A00(r2)
        L_0x05ad:
            X.C162457s7.A0H(r2)
            X.0zH r6 = X.C19340zH.A00(r1, r2)
            r3 = 2131894908(0x7f12227c, float:1.9424634E38)
            r5 = r1
            X.0sA r5 = (X.C15910sA) r5
            X.4K6 r2 = new X.4K6
            r2.<init>(r7)
            r6.A0c(r5, r2, r3)
            r3 = 2131894911(0x7f12227f, float:1.942464E38)
            X.3AZ r2 = new X.3AZ
            r7 = r2
            r8 = r1
            r9 = r0
            r10 = r4
            r11 = r15
            r12 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A0d(r5, r2, r3)
            X.C18280x3.A0q(r6)
            return
        L_0x05d7:
            r2 = 2131894909(0x7f12227d, float:1.9424636E38)
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r1, r8, r6, r2)
            goto L_0x05ad
        L_0x05df:
            r0.A0C(r1, r4, r15, r14)
            return
        L_0x05e3:
            int r19 = X.C624134x.A05(r4)
            java.lang.String r16 = X.C18280x3.A0Y()
            X.4uZ r3 = r2.A00
            r12 = r0
            r13 = r3
            r14 = r4
            r15 = r6
            r17 = r8
            r18 = r7
            r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A08(r1, r2, r6, r5)
            return
        L_0x05fc:
            r0.A07(r1, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30C.A02(android.app.Activity, X.34x, X.398, int):void");
    }

    public boolean A04(C30791n7 r5, String str) {
        AnonymousClass39P r0;
        AnonymousClass39W r3 = r5.A00;
        if (r3 == null || (r0 = r3.A03) == null || r0.A03.size() != 1 || !str.equals(((AnonymousClass395) r3.A03.A03.get(0)).A01.A00)) {
            return false;
        }
        return true;
    }

    public AnonymousClass30C(C56422rx r1, C44352Vs r2, AnonymousClass2R0 r3, C53412n3 r4, C66543Lv r5, AnonymousClass2O2 r6, C50312hy r7, AnonymousClass4FV r8, AnonymousClass2Ze r9, AnonymousClass9U4 r10, C55832qz r11, AnonymousClass4FS r12, Map map, Set set, Set set2) {
        this.A0C = r12;
        this.A08 = r8;
        this.A0A = r10;
        this.A05 = r5;
        this.A0B = r11;
        this.A0D = set;
        this.A01 = r1;
        this.A0E = set2;
        this.A00 = map;
        this.A09 = r9;
        this.A07 = r7;
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
    }

    public void A03(C56692sP r19, C95814uZ r20, C624134x r21, AnonymousClass398 r22, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        C55012pe A012;
        JSONObject A1G = AnonymousClass0x9.A1G();
        C56692sP r3 = r19;
        C624134x r7 = r21;
        try {
            A1G.put("cta", str2);
            if (r3 instanceof AnonymousClass1QP) {
                A1G.put("flow_id", AnonymousClass31O.A01(r22.A01).get("flow_id"));
                A1G.put("extensions_message_id", C57142tA.A00(r7.A1J.A01));
                A1G.put("session_id", C57142tA.A00(str));
            }
        } catch (JSONException e) {
            C18260x0.A17("NativeFlowActionUtils/sendWamEvent/", AnonymousClass001.A0o(), e);
        }
        Integer num = null;
        C95814uZ r6 = r20;
        if (r3 instanceof AnonymousClass1QN) {
            boolean z = r6 instanceof UserJid;
            if (!z || (A012 = this.A04.A01.A01((UserJid) r6)) == null) {
                str4 = null;
                str5 = null;
            } else {
                str4 = A012.A06;
                str5 = A012.A05;
            }
            C50312hy r5 = this.A07;
            String obj = A1G.toString();
            if (z) {
                num = Integer.valueOf(A00(this.A01.A01((UserJid) r6)));
            }
            r5.A01(r6, r7, num, obj, str4, str5, str3, 0);
        } else if (!(r3 instanceof AnonymousClass1QO)) {
            AnonymousClass2Ze r9 = this.A09;
            String obj2 = A1G.toString();
            if (r6 instanceof UserJid) {
                num = Integer.valueOf(A00(this.A01.A01((UserJid) r6)));
            }
            r9.A00(r6, num, obj2, (String) null, 0, 4, i, true);
        }
    }
}
