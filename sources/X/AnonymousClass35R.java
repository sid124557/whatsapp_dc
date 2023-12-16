package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.35R  reason: invalid class name */
public class AnonymousClass35R {
    public final AnonymousClass2R3 A00;
    public final C72303dV A01;
    public final C617332a A02;
    public final AnonymousClass26C A03;

    public static AnonymousClass39S A00(C617332a r26, JSONObject jSONObject) {
        byte[] bArr;
        AnonymousClass390 r7;
        AnonymousClass39L A002;
        ArrayList A0s;
        String str = null;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject2.optString("thumb");
        if (!TextUtils.isEmpty(optString)) {
            bArr = Base64.decode(optString, 0);
        } else {
            bArr = null;
        }
        String optString2 = jSONObject2.optString("title");
        AnonymousClass39G A012 = C626535y.A01(jSONObject2.optJSONObject("total_amount"));
        String string = jSONObject2.getString("reference_id");
        String optString3 = jSONObject2.optString("order_request_id", (String) null);
        C85204Fi A013 = r26.A01(jSONObject2.optString("currency"));
        String optString4 = jSONObject2.optString("payment_configuration");
        String optString5 = jSONObject2.optString("payment_type");
        String optString6 = jSONObject2.optString("transaction_id");
        if (TextUtils.isEmpty(optString6)) {
            optString6 = null;
        }
        String optString7 = jSONObject2.optString("payment_status", (String) null);
        String optString8 = jSONObject2.optString("payment_method");
        if (TextUtils.isEmpty(optString8)) {
            optString8 = null;
        }
        long optLong = jSONObject2.optLong("payment_timestamp");
        String optString9 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (!TextUtils.isEmpty(optString9)) {
            str = optString9;
        }
        boolean optBoolean = jSONObject2.optBoolean("is_interactive");
        String optString10 = jSONObject2.optString("additional_note");
        JSONObject optJSONObject = jSONObject2.optJSONObject("installment");
        if (optJSONObject == null) {
            r7 = null;
        } else {
            r7 = new AnonymousClass390(optJSONObject.getInt("max_installment_count"));
        }
        AnonymousClass39H A003 = C626535y.A00(jSONObject2.getJSONObject("order"));
        List A04 = C626535y.A04(jSONObject2.optJSONArray("beneficiaries"));
        List A05 = C626535y.A05(jSONObject2.optJSONArray("external_payment_configurations"));
        boolean optBoolean2 = jSONObject2.optBoolean("maybe_paid_externally");
        List A06 = C626535y.A06(jSONObject2.optJSONArray("payment_settings"));
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("paid_amount");
        if (optJSONObject2 == null) {
            A002 = null;
        } else {
            A002 = C60042xu.A00(optJSONObject2);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("native_payment_methods");
        if (optJSONArray == null) {
            A0s = null;
        } else {
            A0s = AnonymousClass001.A0s();
            for (int i = 0; i < optJSONArray.length(); i++) {
                A0s.add(optJSONArray.getString(i));
            }
        }
        return new AnonymousClass39S(A013, A002, A003, r7, A012, optString2, string, optString3, str, optString4, optString5, optString6, optString7, optString8, optString10, A04, A05, A06, A0s, bArr, optLong, optBoolean, optBoolean2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 != 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C31901p2 r10) {
        /*
            r9 = this;
            r2 = r9
            android.content.ContentValues r3 = r9.A05(r10)
            X.C624134x.A0F(r3, r10)
            java.lang.String r4 = "message_ui_elements_reply"
            java.lang.String r5 = "MessageUIElementsStore/insertOrUpdateResponseMessage"
            long r7 = r10.A1L
            X.39N r0 = r10.A00
            if (r0 == 0) goto L_0x001d
            int r1 = r0.A05
            r6 = 1
            if (r1 == r6) goto L_0x001e
            r0 = 2
            r6 = 8
            if (r1 == r0) goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            r2.A06(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35R.A0C(X.1p2):void");
    }

    public int A04(AnonymousClass39W r6) {
        if (r6 == null) {
            return 0;
        }
        int i = r6.A00;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 6) {
            return 3;
        }
        if (i == 3) {
            AnonymousClass39S r0 = r6.A01;
            if (r0 == null || r0.A07.A09.isEmpty()) {
                return 7;
            }
            return 4;
        } else if (i == 4) {
            return 5;
        } else {
            if (i == 5) {
                return 6;
            }
            if (i != 7) {
                return 0;
            }
            return 9;
        }
    }

    public final void A06(ContentValues contentValues, String str, String str2, int i, long j) {
        C85284Fq A04 = this.A01.A04();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A04).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18270x1.A1O(A1Z, i);
            C18270x1.A1R(A1Z, j);
            if (r3.A05(contentValues, str, "element_type = ? AND message_row_id = ?", str2, A1Z) == 0) {
                r3.A08(str, str2, contentValues);
            }
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A07(C624134x r19, String str, long j) {
        AnonymousClass398 r13;
        String str2;
        AnonymousClass4GK A032 = this.A01.get();
        try {
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", C18260x0.A1b(j));
            try {
                if (A0E.moveToFirst()) {
                    int A04 = AnonymousClass0x2.A04(A0E, "element_type");
                    String A0Z = AnonymousClass0x2.A0Z(A0E, "element_content");
                    if (A04 == 2 && !TextUtils.isEmpty(A0Z)) {
                        C626936e.A06(A0Z);
                        JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                        ArrayList A0s = AnonymousClass001.A0s();
                        JSONArray optJSONArray = A1H.optJSONArray("buttons");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                                JSONObject optJSONObject = jSONObject.optJSONObject("native_flow_info");
                                if (optJSONObject != null) {
                                    String string = optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                                    if (optJSONObject2 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = optJSONObject2.toString();
                                    }
                                    r13 = new AnonymousClass398(string, str2);
                                } else {
                                    r13 = null;
                                }
                                A0s.add(new C46532bn(r13, jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.optString("displayText"), jSONObject.optInt("button_type", 0), jSONObject.optBoolean("selected")));
                            }
                        }
                        r19.A1U(new C42592Ot(A1H.optString("content"), A1H.optString("footer"), A0s));
                    }
                }
            } catch (JSONException e) {
                Log.w("ButtonsConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A0E != null) {
                    A0E.close();
                }
                throw th;
            }
            A0E.close();
            A032.close();
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void A08(C42592Ot r15, String str, long j) {
        String str2;
        if (r15 != null) {
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            C18270x1.A0a(A06, j2);
            A06.put("element_type", C18280x3.A0S());
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("content", r15.A00);
                A1G.put("footer", r15.A01);
                JSONArray A1F = AnonymousClass0x9.A1F();
                for (C46532bn r2 : r15.A02) {
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A04);
                    String str3 = r2.A03;
                    if (str3 != null) {
                        A1G2.put("displayText", str3);
                    }
                    A1G2.put("selected", r2.A00);
                    A1G2.put("button_type", r2.A01);
                    AnonymousClass398 r22 = r2.A02;
                    if (r22 != null) {
                        JSONObject A1G3 = AnonymousClass0x9.A1G();
                        A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r22.A00);
                        String str4 = r22.A01;
                        if (str4 != null && str4.length() > 0) {
                            A1G3.put("params", AnonymousClass0x9.A1H(str4));
                        }
                        A1G2.put("native_flow_info", A1G3);
                    }
                    A1F.put(A1G2);
                }
                A1G.put("buttons", A1F);
                str2 = A1G.toString();
            } catch (JSONException e) {
                Log.w("ButtonsConverter/toJSONObject/serialization error", e);
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                A06.put("element_content", str2);
            }
            A06(A06, str, "MessageUIElementsStore/insertOrUpdateQuotedButtonMessageElement", 2, j2);
        }
    }

    public final void A0B(C31911p3 r8, String str, String str2) {
        Cursor A032;
        C624134x.A0V(r8, "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0Y(r8, strArr, 0);
        AnonymousClass4GK A033 = this.A01.get();
        try {
            A032 = C56862sg.A03(A033, str, str2, strArr);
            if (A032.moveToLast()) {
                String A0Z = AnonymousClass0x2.A0Z(A032, "reply_values");
                String A0Z2 = AnonymousClass0x2.A0Z(A032, "reply_description");
                r8.A1Z(A0Z);
                r8.A00 = A0Z2;
            }
            A032.close();
            A033.close();
            return;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0E(C31901p2 r11, String str, String str2) {
        int i;
        AnonymousClass39N r2;
        AnonymousClass22W r0;
        C624134x.A0V(r11, "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r11.A1L > 0 ? 1 : (r11.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0Y(r11, strArr, 0);
        AnonymousClass4GK A032 = this.A01.get();
        try {
            Cursor A033 = C56862sg.A03(A032, str, str2, strArr);
            try {
                if (A033.moveToLast()) {
                    int A04 = AnonymousClass0x2.A04(A033, "element_type");
                    if (A04 == 1) {
                        i = 1;
                    } else {
                        i = 0;
                        if (A04 == 8) {
                            i = 2;
                        }
                    }
                    String A0Z = AnonymousClass0x2.A0Z(A033, "reply_description");
                    if (1 == i || i == 0) {
                        r2 = new AnonymousClass39N(AnonymousClass0x2.A0Z(A033, "reply_values"), A0Z, (String) null, i);
                    } else {
                        AnonymousClass397 r7 = null;
                        if (!TextUtils.isEmpty(A0Z)) {
                            JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                            if (2 == A1H.optInt("response_message_type")) {
                                String optString = A1H.optString("description", "");
                                JSONObject optJSONObject = A1H.optJSONObject("native_flow_response_content");
                                if (optJSONObject != null) {
                                    r7 = new AnonymousClass397(optJSONObject.optString("native_flow_response_name", ""), optJSONObject.optString("native_flow_response_params_json", ""));
                                }
                                int optInt = A1H.optInt("native_flow_response_body_format", 0);
                                if (optInt == 0) {
                                    r0 = AnonymousClass22W.DEFAULT;
                                } else if (optInt != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass22W.EXTENSIONS_1;
                                }
                                r2 = new AnonymousClass39N(r0, r7, optString);
                            }
                        }
                    }
                    r11.A00 = r2;
                }
            } catch (JSONException e) {
                Log.w("InteractiveResponseMessageConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A033 != null) {
                    A033.close();
                }
                throw th;
            }
            A033.close();
            A032.close();
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0F(AnonymousClass4DV r20, long j) {
        AnonymousClass4DV r3 = r20;
        if (r3.B5s() != null) {
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            Long valueOf = Long.valueOf(j2);
            A06.put("message_row_id", valueOf);
            A06.put("element_type", Integer.valueOf(A04(r3.B5s())));
            String A0q = AnonymousClass0x7.A0q(A03(r3.B5s()));
            if (!TextUtils.isEmpty(A0q)) {
                A06.put("element_content", A0q);
            }
            A06(A06, "message_ui_elements", "MessageUIElementsStore/insertMessageMultiElement", A04(r3.B5s()), j2);
            if (A04(r3.B5s()) == 9) {
                AnonymousClass2R3 r9 = this.A00;
                if ((r3 instanceof C30791n7) && r9.A03.A0Y(C58422vE.A02, 4668) && AnonymousClass36V.A07((C624134x) r3)) {
                    List list = ((C30791n7) r3).A01;
                    for (int i = 0; i < list.size(); i++) {
                        C624134x A0R = C18320x8.A0R(list, i);
                        if (A0R instanceof C30471mV) {
                            C30471mV r10 = (C30471mV) A0R;
                            C85284Fq A04 = r9.A02.A04();
                            try {
                                ContentValues A062 = AnonymousClass0x9.A06();
                                AnonymousClass33C r2 = r10.A01;
                                if (r2 != null) {
                                    C626936e.A06(r2);
                                    A062.put("file_size", Long.valueOf(r2.A0A));
                                    AnonymousClass33C.A01(A062, r2);
                                    C621833x.A02(A062, "direct_path", r2.A0G);
                                    File file = r2.A0F;
                                    if (file != null) {
                                        A062.put("file_path", r9.A00.A08(file));
                                    } else {
                                        A062.putNull("file_path");
                                    }
                                    C621833x.A02(A062, "partial_media_hash", r2.A0L);
                                    C621833x.A02(A062, "partial_media_enc_hash", r2.A0K);
                                    C621833x.A04(A062, "scans_sidecar", r2.A0T);
                                    C621833x.A03(A062, "transferred", r2.A0R);
                                }
                                long A07 = r9.A01.A07(AnonymousClass2z0.A00(r10));
                                String str = r10.A07;
                                String str2 = r10.A05;
                                long j3 = r10.A00;
                                String str3 = r10.A04;
                                String str4 = r10.A03;
                                A062.put("message_row_id", valueOf);
                                C18270x1.A0b(A062, "addon_message_index", i);
                                C18270x1.A0c(A062, "chat_row_id", A07);
                                C621833x.A02(A062, "message_url", str);
                                C621833x.A02(A062, "mime_type", str2);
                                C18270x1.A0c(A062, "file_length", j3);
                                C621833x.A02(A062, "file_hash", str3);
                                C621833x.A02(A062, "enc_file_hash", str4);
                                C614630w A0y = r10.A0y();
                                if (A0y != null && A0y.A06()) {
                                    C621833x.A04(A062, "thumbnail", A0y.A09());
                                }
                                C55592qb r22 = r10.A0l;
                                if (r22 != null) {
                                    C621833x.A02(A062, "thumbnail_direct_path", r22.A04);
                                    C621833x.A02(A062, "thumbnail_hash", r22.A08);
                                    C621833x.A02(A062, "enc_thumbnail_hash", r22.A05);
                                }
                                C56862sg r102 = ((AnonymousClass3H0) A04).A03;
                                String[] A1Z = AnonymousClass0x9.A1Z();
                                C18260x0.A1X(A1Z, j2);
                                C18270x1.A1P(A1Z, i);
                                if (r102.A05(A062, "addon_message_media", "message_row_id = ? AND addon_message_index = ?", "UPDATE_SECONDARY_MESSAGE_MEDIA_SQL", A1Z) == 0) {
                                    r102.A08("addon_message_media", "INSERT_SECONDARY_MESSAGE_MEDIA_SQL", A062);
                                }
                                A04.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A0H(AnonymousClass4DV r35, String str, long j) {
        AnonymousClass39E r5;
        AnonymousClass39W r22;
        AnonymousClass39B r4;
        AnonymousClass4DV r21 = r35;
        AnonymousClass4GK A032 = this.A01.get();
        try {
            long j2 = j;
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", C18260x0.A1b(j2));
            try {
                if (A0E.moveToFirst()) {
                    Cursor cursor = A0E;
                    int A04 = AnonymousClass0x2.A04(cursor, "element_type");
                    String A0Z = AnonymousClass0x2.A0Z(cursor, "element_content");
                    if (A04 == 1 || A04 == 3 || A04 == 4 || A04 == 7 || A04 == 5 || A04 == 6 || A04 == 9) {
                        C617332a r222 = this.A02;
                        if (!TextUtils.isEmpty(A0Z)) {
                            JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                            int optInt = A1H.optInt("selectListType");
                            if (optInt == 5) {
                                AnonymousClass39P A022 = A02(A1H.getString("native_flow_content"));
                                if (A022 != null) {
                                    r22 = new AnonymousClass39W(A01(A1H), A022, A1H.optString("description"), A1H.optString("footerText", (String) null), A1H.optString("buttonText"));
                                }
                            } else if (optInt == 4) {
                                String optString = A1H.optString("shops_info");
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        C626936e.A06(optString);
                                        JSONObject A1H2 = AnonymousClass0x9.A1H(optString);
                                        C632938r r6 = new C632938r(A1H2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A1H2.optInt("shop_surface"), A1H2.optInt("message_version"));
                                        int i = A1H.getInt("selectListType");
                                        AnonymousClass39A A012 = A01(A1H);
                                        String optString2 = A1H.optString("description");
                                        if (i == 4) {
                                            r22 = new AnonymousClass39W(A012, r6, optString2);
                                        } else {
                                            throw AnonymousClass000.A0G("Not a shop content: ", AnonymousClass001.A0o(), i);
                                        }
                                    } catch (JSONException e) {
                                        Log.w("ShopInfoContentConverter/parseJSON error", e);
                                    }
                                }
                            } else if (optInt == 3) {
                                AnonymousClass39A A013 = A01(A1H);
                                String optString3 = A1H.optString("description");
                                String optString4 = A1H.optString("footerText", (String) null);
                                AnonymousClass39S A002 = A00(r222, A1H.optJSONObject("checkout_info"));
                                C626936e.A06(A002);
                                r22 = new AnonymousClass39W(A002, A013, A02(A1H.optString("native_flow_content")), optString3, optString4);
                            } else if (optInt == 7) {
                                String string = A1H.getString("carousel_content");
                                if (!TextUtils.isEmpty(string)) {
                                    try {
                                        C626936e.A06(string);
                                        JSONObject A1H3 = AnonymousClass0x9.A1H(string);
                                        ArrayList A0s = AnonymousClass001.A0s();
                                        JSONArray optJSONArray = A1H3.optJSONArray("cards");
                                        if (optJSONArray != null) {
                                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                                JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                                                if (jSONObject != null) {
                                                    A0s.add(new AnonymousClass39W(A01(jSONObject), A02(jSONObject.getString("native_flow_content")), jSONObject.optString("description"), jSONObject.optString("footerText"), jSONObject.optString("buttonText")));
                                                }
                                            }
                                        }
                                        r22 = new AnonymousClass39W(A01(A1H), new C631638e(A0s), A1H.optString("description", (String) null), A1H.optString("footerText", (String) null));
                                    } catch (JSONException e2) {
                                        Log.w("CarouselMessageConverter/parseJSON/deserialization error", e2);
                                    }
                                }
                            } else {
                                AnonymousClass39A A014 = A01(A1H);
                                String optString5 = A1H.optString("description");
                                String optString6 = A1H.optString("footerText", (String) null);
                                String optString7 = A1H.optString("buttonText");
                                JSONArray optJSONArray2 = A1H.optJSONArray("sections");
                                ArrayList A0s2 = AnonymousClass001.A0s();
                                if (optJSONArray2 != null) {
                                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i3);
                                        JSONArray optJSONArray3 = jSONObject2.optJSONArray("items");
                                        String optString8 = jSONObject2.optString("title");
                                        ArrayList A0s3 = AnonymousClass001.A0s();
                                        if (optJSONArray3 != null) {
                                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                                JSONObject jSONObject3 = optJSONArray3.getJSONObject(i4);
                                                String optString9 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                                String optString10 = jSONObject3.optString("title");
                                                String optString11 = jSONObject3.optString("description");
                                                C18260x0.A0Q(optString9, optString10);
                                                A0s3.add(new C108785dY(optString9, (String) null, optString10, optString11));
                                            }
                                        }
                                        C162457s7.A0J(optString8, 1);
                                        A0s2.add(new C108725dS(optString8, (String) null, A0s3));
                                    }
                                }
                                JSONObject optJSONObject = A1H.optJSONObject("product_info");
                                byte[] bArr = null;
                                if (optJSONObject == null) {
                                    r5 = null;
                                } else {
                                    String optString12 = optJSONObject.optString("business_owner_jid");
                                    try {
                                        UserJid A09 = AnonymousClass32Y.A09(optString12);
                                        ArrayList A0s4 = AnonymousClass001.A0s();
                                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("product_sections");
                                        if (optJSONArray4 != null) {
                                            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                                JSONObject optJSONObject2 = optJSONArray4.optJSONObject(i5);
                                                JSONArray optJSONArray5 = optJSONObject2.optJSONArray("product_section_products");
                                                ArrayList A0s5 = AnonymousClass001.A0s();
                                                if (optJSONArray5 != null) {
                                                    for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                                        A0s5.add(new AnonymousClass392(optJSONArray5.optJSONObject(i6).optString("product_id")));
                                                    }
                                                }
                                                A0s4.add(new AnonymousClass396(optJSONObject2.optString("product_sections_title"), A0s5));
                                            }
                                        }
                                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("product_header_info");
                                        if (optJSONObject3 != null) {
                                            String optString13 = optJSONObject3.optString("product_header_info_thumb");
                                            if (!TextUtils.isEmpty(optString13)) {
                                                bArr = Base64.decode(optString13, 0);
                                            }
                                            r4 = new AnonymousClass39B(bArr, optJSONObject3.optString("product_header_info_id"), optJSONObject3.optBoolean("product_header_is_rejected", false));
                                        } else {
                                            r4 = new AnonymousClass39B((byte[]) null, "", false);
                                        }
                                        r5 = new AnonymousClass39E(A09, r4, A0s4);
                                    } catch (AnonymousClass24P e3) {
                                        C18260x0.A0u("MultiElementConverter/parseProductListInfo/Invalid jid: ", optString12, AnonymousClass001.A0o(), e3);
                                        r5 = null;
                                    }
                                }
                                r22 = new AnonymousClass39W(A00(r222, A1H.optJSONObject("checkout_info")), A014, r5, optString5, optString6, optString7, A0s2, optInt);
                            }
                            r22.A0A = A1H.optString("templateId", (String) null);
                            r21.Blz(r22);
                        }
                        if (A04 == 9) {
                            AnonymousClass2R3 r42 = this.A00;
                            if ((r21 instanceof C30791n7) && r42.A03.A0Y(C58422vE.A02, 4668) && AnonymousClass36V.A07((C624134x) r21)) {
                                String[] A1Y = AnonymousClass0x9.A1Y();
                                C18280x3.A1R(A1Y, 0, j2);
                                r42.A04.BkM(new C70613am((C30791n7) r21, r42, AnonymousClass001.A0s(), A1Y, 1, j2));
                            }
                        }
                    }
                }
            } catch (JSONException e4) {
                Log.w("MultiElementConverter/parseJSON/deserialization error", e4);
            } catch (Throwable th) {
                if (A0E != null) {
                    A0E.close();
                }
                throw th;
            }
            A0E.close();
            A032.close();
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public AnonymousClass35R(AnonymousClass2R3 r1, C72303dV r2, C617332a r3, AnonymousClass26C r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass39A A01(JSONObject jSONObject) {
        byte[] bArr;
        String str = null;
        String optString = jSONObject.optString("title");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        String str2 = null;
        String optString2 = jSONObject.optString("sub_title");
        if (!TextUtils.isEmpty(optString2)) {
            str2 = optString2;
        }
        String str3 = null;
        String optString3 = jSONObject.optString("header_thumbnail");
        if (!TextUtils.isEmpty(optString3)) {
            str3 = optString3;
        }
        if (!TextUtils.isEmpty(str3)) {
            bArr = Base64.decode(str3, 0);
        } else {
            bArr = null;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || bArr != null) {
            return new AnonymousClass39A(str, bArr, str2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[Catch:{ JSONException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ JSONException -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass39P A02(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r8 = 0
            if (r0 == 0) goto L_0x0008
            return r8
        L_0x0008:
            X.C626936e.A06(r14)     // Catch:{ JSONException -> 0x00a2 }
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r14)     // Catch:{ JSONException -> 0x00a2 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "content_of_nfm"
            r7 = 0
            int r14 = r6.optInt(r0, r7)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "buttons"
            org.json.JSONArray r5 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "message_params_json"
            java.lang.String r11 = r6.optString(r0)     // Catch:{ JSONException -> 0x00a2 }
            if (r5 == 0) goto L_0x005a
        L_0x0029:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x00a2 }
            if (r7 >= r0) goto L_0x005a
            org.json.JSONObject r1 = r5.getJSONObject(r7)     // Catch:{ JSONException -> 0x00a2 }
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "name"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "params"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "selected"
            boolean r2 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x00a2 }
            X.398 r1 = new X.398     // Catch:{ JSONException -> 0x00a2 }
            r1.<init>(r4, r3)     // Catch:{ JSONException -> 0x00a2 }
            X.395 r0 = new X.395     // Catch:{ JSONException -> 0x00a2 }
            r0.<init>(r1, r2)     // Catch:{ JSONException -> 0x00a2 }
            r12.add(r0)     // Catch:{ JSONException -> 0x00a2 }
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x005a:
            java.lang.String r0 = "form_state"
            org.json.JSONObject r3 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x00a2 }
            r0 = 2
            if (r14 != r0) goto L_0x008e
            if (r3 == 0) goto L_0x006c
            java.lang.String r0 = "form_elements_values"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00a2 }
            goto L_0x006d
        L_0x006c:
            r2 = r8
        L_0x006d:
            if (r11 == 0) goto L_0x0089
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x00a2 }
            if (r0 != 0) goto L_0x0089
            X.2Y8 r1 = new X.2Y8     // Catch:{ JSONException -> 0x0083 }
            r1.<init>()     // Catch:{ JSONException -> 0x0083 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r11)     // Catch:{ JSONException -> 0x0083 }
            java.util.List r13 = r1.A00(r0, r2)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x008a
        L_0x0083:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseDynamicMessageElements/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00a2 }
        L_0x0089:
            r13 = r8
        L_0x008a:
            if (r3 != 0) goto L_0x0091
            r10 = r8
            goto L_0x009c
        L_0x008e:
            r13 = r8
            r10 = r8
            goto L_0x009c
        L_0x0091:
            java.lang.String r0 = "is_form_disabled"
            boolean r0 = r3.optBoolean(r0)     // Catch:{ JSONException -> 0x00a2 }
            X.391 r10 = new X.391     // Catch:{ JSONException -> 0x00a2 }
            r10.<init>((boolean) r0)     // Catch:{ JSONException -> 0x00a2 }
        L_0x009c:
            X.39P r9 = new X.39P     // Catch:{ JSONException -> 0x00a2 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x00a2 }
            return r9
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35R.A02(java.lang.String):X.39P");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b0 A[SYNTHETIC, Splitter:B:119:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x035e A[SYNTHETIC, Splitter:B:149:0x035e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject A03(X.AnonymousClass39W r14) {
        /*
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()
            X.39A r3 = r14.A02     // Catch:{ JSONException -> 0x0391 }
            r2 = 0
            if (r3 != 0) goto L_0x000b
            r0 = r2
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x0391 }
        L_0x000d:
            java.lang.String r6 = "title"
            r7.put(r6, r0)     // Catch:{ JSONException -> 0x0391 }
            if (r3 != 0) goto L_0x0017
            r1 = r2
            goto L_0x0019
        L_0x0017:
            java.lang.String r1 = r3.A00     // Catch:{ JSONException -> 0x0391 }
        L_0x0019:
            java.lang.String r0 = "sub_title"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            if (r3 == 0) goto L_0x002a
            byte[] r1 = r3.A02     // Catch:{ JSONException -> 0x0391 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x002a:
            java.lang.String r0 = "header_thumbnail"
            r7.put(r0, r2)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r11 = "description"
            java.lang.String r0 = r14.A08     // Catch:{ JSONException -> 0x0391 }
            r7.put(r11, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "templateId"
            java.lang.String r0 = r14.A0A     // Catch:{ JSONException -> 0x0391 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "footerText"
            java.lang.String r0 = r14.A09     // Catch:{ JSONException -> 0x0391 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "buttonText"
            java.lang.String r0 = r14.A07     // Catch:{ JSONException -> 0x0391 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "selectListType"
            int r0 = r14.A00     // Catch:{ JSONException -> 0x0391 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r10 = "sections"
            org.json.JSONArray r9 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0391 }
            java.util.List r0 = r14.A0B     // Catch:{ JSONException -> 0x0391 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x0391 }
        L_0x0061:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r13.next()     // Catch:{ JSONException -> 0x0391 }
            X.5dS r1 = (X.C108725dS) r1     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = r1.A01     // Catch:{ JSONException -> 0x0391 }
            r8.put(r6, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r5 = "items"
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0391 }
            java.util.List r0 = r1.A02     // Catch:{ JSONException -> 0x0391 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0391 }
        L_0x0082:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r3 = r12.next()     // Catch:{ JSONException -> 0x0391 }
            X.5dY r3 = (X.C108785dY) r3     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = r3.A02     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = r3.A03     // Catch:{ JSONException -> 0x0391 }
            r2.put(r6, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = r3.A00     // Catch:{ JSONException -> 0x0391 }
            r2.put(r11, r0)     // Catch:{ JSONException -> 0x0391 }
            r4.put(r2)     // Catch:{ JSONException -> 0x0391 }
            goto L_0x0082
        L_0x00a7:
            r8.put(r5, r4)     // Catch:{ JSONException -> 0x0391 }
            r9.put(r8)     // Catch:{ JSONException -> 0x0391 }
            goto L_0x0061
        L_0x00ae:
            r7.put(r10, r9)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r5 = "product_info"
            X.39E r8 = r14.A04     // Catch:{ JSONException -> 0x0391 }
            if (r8 != 0) goto L_0x00bb
            r4 = 0
            goto L_0x014a
        L_0x00bb:
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONArray r10 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0391 }
            java.util.List r0 = r8.A02     // Catch:{ JSONException -> 0x0391 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0391 }
        L_0x00c9:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r2 = r12.next()     // Catch:{ JSONException -> 0x0391 }
            X.396 r2 = (X.AnonymousClass396) r2     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = r2.A00     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "product_sections_title"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONArray r9 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0391 }
            java.util.List r0 = r2.A01     // Catch:{ JSONException -> 0x0391 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ JSONException -> 0x0391 }
        L_0x00eb:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r3.next()     // Catch:{ JSONException -> 0x0391 }
            X.392 r0 = (X.AnonymousClass392) r0     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r0.A00     // Catch:{ JSONException -> 0x0391 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            r9.put(r2)     // Catch:{ JSONException -> 0x0391 }
            goto L_0x00eb
        L_0x0107:
            java.lang.String r0 = "product_section_products"
            r11.put(r0, r9)     // Catch:{ JSONException -> 0x0391 }
            r10.put(r11)     // Catch:{ JSONException -> 0x0391 }
            goto L_0x00c9
        L_0x0111:
            java.lang.String r0 = "product_sections"
            r4.put(r0, r10)     // Catch:{ JSONException -> 0x0391 }
            com.whatsapp.jid.UserJid r0 = r8.A00     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "business_owner_jid"
            org.json.JSONObject r3 = X.C18300x5.A0z(r1, r0, r4)     // Catch:{ JSONException -> 0x0391 }
            X.39B r2 = r8.A01     // Catch:{ JSONException -> 0x0391 }
            byte[] r1 = r2.A02     // Catch:{ JSONException -> 0x0391 }
            if (r1 == 0) goto L_0x0134
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "product_header_info_thumb"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x0134:
            java.lang.String r1 = r2.A01     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "product_header_info_id"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            boolean r1 = r2.A00     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "product_header_is_rejected"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "product_header_info"
            r4.put(r0, r3)     // Catch:{ JSONException -> 0x0391 }
        L_0x014a:
            r7.put(r5, r4)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r4 = "checkout_info"
            X.39S r5 = r14.A01     // Catch:{ JSONException -> 0x0391 }
            r2 = 0
            if (r5 == 0) goto L_0x0277
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            byte[] r1 = r5.A0M     // Catch:{ JSONException -> 0x0391 }
            if (r1 == 0) goto L_0x0167
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "thumb"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x0167:
            java.lang.String r0 = r5.A0F     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x016e
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x016e:
            X.39G r0 = r5.A09     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x017c
            java.lang.String r1 = "total_amount"
            org.json.JSONObject r0 = X.AnonymousClass35U.A04(r0)     // Catch:{ JSONException -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x017c:
            java.lang.String r1 = "reference_id"
            java.lang.String r0 = r5.A0E     // Catch:{ JSONException -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "order_request_id"
            java.lang.String r0 = r5.A0B     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x018e
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x018e:
            X.4Fi r0 = r5.A06     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x019b
            java.lang.String r1 = "currency"
            X.3H6 r0 = (X.AnonymousClass3H6) r0     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = r0.A04     // Catch:{ JSONException -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x019b:
            X.390 r0 = r5.A08     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r8 = "installment"
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "max_installment_count"
            int r0 = r0.A00     // Catch:{ JSONException -> 0x0391 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            r3.put(r8, r6)     // Catch:{ JSONException -> 0x0391 }
        L_0x01af:
            java.lang.String r1 = "payment_configuration"
            java.lang.String r0 = r5.A04()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01bb
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01bb:
            java.lang.String r1 = "payment_type"
            java.lang.String r0 = r5.A0D     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01c5
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01c5:
            java.lang.String r1 = "transaction_id"
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01cf
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01cf:
            java.lang.String r1 = "payment_method"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01d9
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01d9:
            java.lang.String r1 = "payment_status"
            java.lang.String r0 = r5.A03     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01e3
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01e3:
            long r0 = r5.A00     // Catch:{ JSONException -> 0x0391 }
            r8 = 0
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x01f1
            java.lang.String r6 = "payment_timestamp"
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01f1:
            java.lang.String r1 = "type"
            java.lang.String r0 = r5.A0G     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x01fb
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x01fb:
            java.util.List r0 = r5.A0I     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONArray r1 = X.AnonymousClass35U.A00(r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "external_payment_configurations"
            if (r1 == 0) goto L_0x0208
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x0208:
            java.util.List r0 = r5.A0H     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONArray r1 = X.AnonymousClass35U.A02(r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "beneficiaries"
            if (r1 == 0) goto L_0x0215
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x0215:
            X.39H r0 = r5.A07     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONObject r1 = X.AnonymousClass35U.A03(r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "order"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "is_interactive"
            boolean r0 = r5.A0L     // Catch:{ JSONException -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r1 = "maybe_paid_externally"
            boolean r0 = r5.A05     // Catch:{ JSONException -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
            java.util.List r0 = r5.A0K     // Catch:{ JSONException -> 0x0391 }
            org.json.JSONArray r1 = X.AnonymousClass35U.A01(r0)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r0 = "payment_settings"
            if (r1 == 0) goto L_0x023d
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x023d:
            java.lang.String r1 = "additional_note"
            java.lang.String r0 = r5.A0A     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x0246
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0391 }
        L_0x0246:
            X.39L r0 = r5.A01     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x024e
            org.json.JSONObject r2 = r0.A01()     // Catch:{ JSONException -> 0x0391 }
        L_0x024e:
            java.lang.String r0 = "paid_amount"
            if (r2 == 0) goto L_0x0256
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x0391 }
        L_0x0256:
            java.util.List r0 = r5.A0J     // Catch:{ JSONException -> 0x0391 }
            if (r0 != 0) goto L_0x025c
            r2 = 0
            goto L_0x026e
        L_0x025c:
            org.json.JSONArray r2 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0391 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0391 }
        L_0x0264:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x026e
            X.AnonymousClass0x7.A1L(r1, r2)     // Catch:{ JSONException -> 0x0391 }
            goto L_0x0264
        L_0x026e:
            java.lang.String r0 = "native_payment_methods"
            if (r2 == 0) goto L_0x0276
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x0391 }
        L_0x0276:
            r2 = r3
        L_0x0277:
            r7.put(r4, r2)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r4 = "shops_info"
            X.38r r3 = r14.A06     // Catch:{ JSONException -> 0x0391 }
            r8 = 0
            if (r3 == 0) goto L_0x02a4
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x029e }
            java.lang.String r1 = "id"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x029e }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029e }
            java.lang.String r1 = "shop_surface"
            int r0 = r3.A00     // Catch:{ JSONException -> 0x029e }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029e }
            java.lang.String r1 = "message_version"
            int r0 = r3.A01     // Catch:{ JSONException -> 0x029e }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029e }
            goto L_0x02a5
        L_0x029e:
            r1 = move-exception
            java.lang.String r0 = "ShopInfoContentConverter/toJsonObject error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x02a4:
            r2 = r8
        L_0x02a5:
            r7.put(r4, r2)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r6 = "native_flow_content"
            X.39P r3 = r14.A03     // Catch:{ JSONException -> 0x0391 }
            r5 = 0
            if (r3 == 0) goto L_0x0355
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0350 }
            org.json.JSONArray r9 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "content_of_nfm"
            int r0 = r3.A01     // Catch:{ JSONException -> 0x0350 }
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "message_params_json"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x0350 }
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0350 }
            java.util.List r0 = r3.A03     // Catch:{ JSONException -> 0x0350 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x0350 }
        L_0x02cd:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0350 }
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r10 = r11.next()     // Catch:{ JSONException -> 0x0350 }
            X.395 r10 = (X.AnonymousClass395) r10     // Catch:{ JSONException -> 0x0350 }
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "name"
            X.398 r2 = r10.A01     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r0 = r2.A00     // Catch:{ JSONException -> 0x0350 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "params"
            java.lang.String r0 = r2.A01     // Catch:{ JSONException -> 0x0350 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "selected"
            boolean r0 = r10.A00     // Catch:{ JSONException -> 0x0350 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0350 }
            r9.put(r4)     // Catch:{ JSONException -> 0x0350 }
            goto L_0x02cd
        L_0x02fb:
            java.lang.String r0 = "buttons"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r4 = "form_state"
            java.util.List r2 = r3.A04     // Catch:{ JSONException -> 0x0350 }
            X.391 r0 = r3.A00     // Catch:{ JSONException -> 0x0350 }
            if (r0 != 0) goto L_0x030a
            r3 = r5
            goto L_0x034c
        L_0x030a:
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0350 }
            java.lang.String r1 = "is_form_disabled"
            boolean r0 = r0.A00     // Catch:{ JSONException -> 0x0346 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0346 }
            if (r2 == 0) goto L_0x034c
            java.util.HashMap r9 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x0346 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ JSONException -> 0x0346 }
        L_0x031f:
            boolean r0 = r10.hasNext()     // Catch:{ JSONException -> 0x0346 }
            if (r0 == 0) goto L_0x033b
            java.lang.Object r2 = r10.next()     // Catch:{ JSONException -> 0x0346 }
            X.7xe r2 = (X.C165797xe) r2     // Catch:{ JSONException -> 0x0346 }
            boolean r0 = r2 instanceof X.C97584yn     // Catch:{ JSONException -> 0x0346 }
            if (r0 == 0) goto L_0x031f
            X.4yn r2 = (X.C97584yn) r2     // Catch:{ JSONException -> 0x0346 }
            java.lang.String r1 = r2.A01     // Catch:{ JSONException -> 0x0346 }
            X.7xf r0 = r2.A00     // Catch:{ JSONException -> 0x0346 }
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x0346 }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x0346 }
            goto L_0x031f
        L_0x033b:
            java.lang.String r1 = "form_elements_values"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0346 }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x0346 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0346 }
            goto L_0x034c
        L_0x0346:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/toJSONObject/error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0350 }
        L_0x034c:
            r8.put(r4, r3)     // Catch:{ JSONException -> 0x0350 }
            goto L_0x0355
        L_0x0350:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x0391 }
            r8 = r5
        L_0x0355:
            r7.put(r6, r8)     // Catch:{ JSONException -> 0x0391 }
            java.lang.String r4 = "carousel_content"
            X.38e r0 = r14.A05     // Catch:{ JSONException -> 0x0391 }
            if (r0 == 0) goto L_0x038d
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0387 }
            org.json.JSONArray r2 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x0387 }
            java.util.List r0 = r0.A00     // Catch:{ JSONException -> 0x0387 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0387 }
        L_0x036c:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0387 }
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0387 }
            X.39W r0 = (X.AnonymousClass39W) r0     // Catch:{ JSONException -> 0x0387 }
            org.json.JSONObject r0 = A03(r0)     // Catch:{ JSONException -> 0x0387 }
            r2.put(r0)     // Catch:{ JSONException -> 0x0387 }
            goto L_0x036c
        L_0x0380:
            java.lang.String r0 = "cards"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x0387 }
            r5 = r3
            goto L_0x038d
        L_0x0387:
            r1 = move-exception
            java.lang.String r0 = "CarouselMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0391 }
        L_0x038d:
            r7.put(r4, r5)     // Catch:{ JSONException -> 0x0391 }
            return r7
        L_0x0391:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35R.A03(X.39W):org.json.JSONObject");
    }

    public final ContentValues A05(C31901p2 r10) {
        String str;
        JSONObject jSONObject;
        int i;
        ContentValues A06 = AnonymousClass0x9.A06();
        AnonymousClass39N r8 = r10.A00;
        if (r8 != null) {
            int i2 = r8.A05;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 0;
                if (i2 == 2) {
                    i3 = 8;
                }
            }
            C18270x1.A0b(A06, "element_type", i3);
            String str2 = r8.A04;
            A06.put("reply_values", str2);
            if (i3 == 8) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                try {
                    A1G.put("description", str2);
                    A1G.put("footer_text", r8.A02);
                    A1G.put("response_message_type", r8.A05);
                    AnonymousClass397 r3 = r8.A01;
                    if (r3 == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = AnonymousClass0x9.A1G();
                        jSONObject.put("native_flow_response_name", r3.A00);
                        jSONObject.put("native_flow_response_params_json", r3.A01);
                    }
                    A1G.put("native_flow_response_content", jSONObject);
                    AnonymousClass22W r0 = r8.A00;
                    if (r0 != null) {
                        i = r0.value;
                    } else {
                        i = 0;
                    }
                    A1G.put("native_flow_response_body_format", i);
                } catch (JSONException e) {
                    Log.w("InteractiveResponseMessageConverter/toJSONObject/serialization error", e);
                    A1G = null;
                }
                str = AnonymousClass0x7.A0q(A1G);
            } else {
                str = r8.A02;
            }
            A06.put("reply_description", str);
        }
        return A06;
    }

    public void A09(C31911p3 r9) {
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("element_type", C18280x3.A0S());
        A06.put("reply_values", r9.A13());
        A06.put("reply_description", r9.A00);
        C624134x.A0F(A06, r9);
        A06(A06, "message_ui_elements_reply", "MessageUIElementsStore/insertOrUpdateButtonsResponseMessage", 2, r9.A1L);
    }

    public void A0A(C31911p3 r9, long j) {
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("element_type", C18280x3.A0S());
        A06.put("reply_values", r9.A13());
        A06.put("reply_description", r9.A00);
        C18270x1.A0a(A06, j);
        A06(A06, "message_quoted_ui_elements_reply", "MessageUIElementsStore/insertOrUpdateQuoteButtonsResponseMessage", 2, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 != 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C31901p2 r10, long r11) {
        /*
            r9 = this;
            java.lang.String r4 = "message_quoted_ui_elements_reply"
            r2 = r9
            android.content.ContentValues r3 = r9.A05(r10)
            r7 = r11
            X.C18270x1.A0a(r3, r11)
            java.lang.String r5 = "MessageUIElementsStore/insertOrUpdateQuoteResponseMessage"
            X.39N r0 = r10.A00
            if (r0 == 0) goto L_0x001c
            int r1 = r0.A05
            r6 = 1
            if (r1 == r6) goto L_0x001d
            r0 = 2
            r6 = 8
            if (r1 == r0) goto L_0x001d
        L_0x001c:
            r6 = 0
        L_0x001d:
            r2.A06(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35R.A0D(X.1p2, long):void");
    }

    public void A0G(AnonymousClass4DV r11, long j) {
        C85284Fq A04;
        String str;
        if (r11.B5s() != null) {
            try {
                A04 = this.A01.A04();
                ContentValues A06 = AnonymousClass0x9.A06();
                long j2 = j;
                C18270x1.A0a(A06, j);
                C18270x1.A0b(A06, "element_type", A04(r11.B5s()));
                JSONObject A032 = A03(r11.B5s());
                if (A032 != null) {
                    str = A032.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    A06.put("element_content", str);
                }
                A06(A06, "message_quoted_ui_elements", "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage", A04(r11.B5s()), j2);
                A04.close();
                return;
            } catch (SQLiteConstraintException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/fail to insert. Error quotedMessage is: ", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }
}
