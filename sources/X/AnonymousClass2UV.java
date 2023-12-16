package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2UV  reason: invalid class name */
public abstract class AnonymousClass2UV {
    public static JSONObject A02(C22781Qb r3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seq_id", r3.A00);
        jSONObject.put("event_type", r3.A01);
        jSONObject.put("message_type", r3.A02);
        return jSONObject;
    }

    public JSONObject A03() {
        String str;
        String str2;
        if (this instanceof AnonymousClass1QV) {
            AnonymousClass1QV r0 = (AnonymousClass1QV) this;
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                JSONArray A1F = AnonymousClass0x9.A1F();
                Iterator it = r0.A00.iterator();
                while (it.hasNext()) {
                    AnonymousClass0x7.A1L(it, A1F);
                }
                A1G.put("merchant_list", A1F);
                return A1G;
            } catch (JSONException e) {
                Log.e("ConversationSketchMerchantJIDKeyList: toJsonString threw: ", e);
                return null;
            }
        } else if (this instanceof C22781Qb) {
            C22781Qb r3 = (C22781Qb) this;
            if (r3 instanceof AnonymousClass1QY) {
                AnonymousClass1QY r32 = (AnonymousClass1QY) r3;
                try {
                    JSONObject A02 = A02(r32);
                    A02.put("contains_url", r32.A00);
                    return A02;
                } catch (JSONException e2) {
                    e = e2;
                    str = "ConversationSketchTextEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r3 instanceof C22771Qa) {
                C22771Qa r33 = (C22771Qa) r3;
                try {
                    JSONObject A022 = A02(r33);
                    A022.put("interactive_type", r33.A02);
                    A022.put("has_header", r33.A0B);
                    if (r33.A0B) {
                        A022.put("header_type", r33.A01);
                        A022.put("header_contains_url", r33.A0C);
                    }
                    A022.put("has_body", r33.A09);
                    if (r33.A09) {
                        A022.put("body_contains_url", r33.A07);
                    }
                    A022.put("has_footer", r33.A0A);
                    if (r33.A0A) {
                        A022.put("footer_contains_url", r33.A08);
                    }
                    List list = r33.A05;
                    if (list != null && list.size() > 0) {
                        JSONArray A1F2 = AnonymousClass0x9.A1F();
                        Iterator it2 = r33.A05.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass0x7.A1L(it2, A1F2);
                        }
                        A022.put("button_id_hashes", A1F2);
                    }
                    List list2 = r33.A06;
                    if (list2 != null && list2.size() > 0) {
                        JSONArray A1F3 = AnonymousClass0x9.A1F();
                        for (List it3 : r33.A06) {
                            JSONArray A1F4 = AnonymousClass0x9.A1F();
                            Iterator it4 = it3.iterator();
                            while (it4.hasNext()) {
                                AnonymousClass0x7.A1L(it4, A1F4);
                            }
                            A1F3.put(A1F4);
                        }
                        A022.put("row_id_hashes", A1F3);
                    }
                    String str3 = r33.A03;
                    if (str3 != null) {
                        A022.put("list_reply_id_hash", str3);
                    }
                    String str4 = r33.A00;
                    if (str4 != null) {
                        A022.put("button_reply_id_hash", str4);
                    }
                    String str5 = r33.A04;
                    if (str5 == null) {
                        return A022;
                    }
                    A022.put("order_status", str5);
                    return A022;
                } catch (JSONException e3) {
                    e = e3;
                    str = "ConversationSketchInteractiveEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r3 instanceof AnonymousClass1QZ) {
                AnonymousClass1QZ r34 = (AnonymousClass1QZ) r3;
                try {
                    JSONObject A023 = A02(r34);
                    String str6 = r34.A01;
                    if (str6 != null) {
                        A023.put("header_type", str6);
                    }
                    String str7 = r34.A02;
                    if (str7 != null) {
                        A023.put("template_id_hash", str7);
                    }
                    List list3 = r34.A03;
                    if (list3 != null && list3.size() > 0) {
                        JSONArray A1F5 = AnonymousClass0x9.A1F();
                        Iterator it5 = r34.A03.iterator();
                        while (it5.hasNext()) {
                            AnonymousClass0x7.A1L(it5, A1F5);
                        }
                        A023.put("button_id_hashes", A1F5);
                    }
                    String str8 = r34.A00;
                    if (str8 == null) {
                        return A023;
                    }
                    A023.put("template_button_reply_selected_id_hash", str8);
                    return A023;
                } catch (JSONException e4) {
                    e = e4;
                    str = "ConversationSketchHSMEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else {
                try {
                    return A02(r3);
                } catch (JSONException e5) {
                    e = e5;
                    str = "ConversationSketchEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            }
        } else if (this instanceof AnonymousClass1QW) {
            AnonymousClass1QW r35 = (AnonymousClass1QW) this;
            try {
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                C22791Qc r02 = r35.A00;
                if (r02 != null) {
                    A1G2.put("current_conversation", r02.A03());
                }
                JSONArray A1F6 = AnonymousClass0x9.A1F();
                for (AnonymousClass2UV A03 : r35.A01) {
                    A1F6.put(A03.A03());
                }
                A1G2.put("completed_conversations", A1F6);
                return A1G2;
            } catch (JSONException e6) {
                e = e6;
                str = "ConversationSketchConversationMerchantList: toJsonString threw: ";
                Log.w(str, e);
                return null;
            }
        } else {
            C22791Qc r4 = (C22791Qc) this;
            try {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G3.put("start_ts", r4.A00);
                A1G3.put("conversation_id", r4.A02);
                A1G3.put("business_jid", r4.A03);
                A1G3.put("msgs_skipped_count", r4.A01);
                JSONArray A1F7 = AnonymousClass0x9.A1F();
                for (AnonymousClass2UV A032 : r4.A04) {
                    JSONObject A033 = A032.A03();
                    if (A033 == null) {
                        str2 = null;
                    } else {
                        str2 = A033.toString();
                    }
                    A1F7.put(str2);
                }
                A1G3.put("msg_events", A1F7);
                return A1G3;
            } catch (JSONException e7) {
                Log.w("ConversationSketchConversation: toJsonString threw: ", e7);
                return null;
            }
        }
    }
}
