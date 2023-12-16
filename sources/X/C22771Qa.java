package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Qa  reason: invalid class name and case insensitive filesystem */
public class C22771Qa extends C22781Qb {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public C22771Qa(C624134x r6, String str, int i) {
        super(i, str, "interactive");
        AnonymousClass39W r3;
        String str2;
        AnonymousClass39N r0;
        String str3;
        if (r6 instanceof C30791n7) {
            r3 = ((C30791n7) r6).A00;
            if (r3 != null) {
                AnonymousClass39A r1 = r3.A02;
                if (r1 != null) {
                    this.A0B = true;
                    if (r1.A02 != null) {
                        str3 = "image";
                    } else {
                        str3 = "text";
                    }
                    this.A01 = str3;
                    this.A0C = A00(r1.A00);
                }
                this.A09 = C18320x8.A1U(r3.A08);
                this.A07 = A00(r3.A08);
                this.A0A = C18320x8.A1U(r3.A09);
                this.A08 = A00(r3.A09);
            }
        } else {
            r3 = null;
        }
        if (r6 instanceof C31911p3) {
            this.A00 = C22781Qb.A01(((C31911p3) r6).A00);
        }
        if ((r6 instanceof C31901p2) && (r0 = ((C31901p2) r6).A00) != null) {
            this.A03 = C22781Qb.A01(r0.A03);
        }
        if (C40802Hu.A01(r6) != null) {
            List<C46532bn> list = C40802Hu.A01(r6).A02;
            boolean z = false;
            this.A09 = AnonymousClass000.A1W(C40802Hu.A01(r6).A00);
            this.A07 = A00(C40802Hu.A01(r6).A00);
            this.A0A = C40802Hu.A01(r6).A01 != null ? true : z;
            this.A08 = A00(C40802Hu.A01(r6).A01);
            if (!list.isEmpty()) {
                this.A05 = AnonymousClass001.A0s();
                for (C46532bn r02 : list) {
                    this.A05.add(C22781Qb.A01(r02.A04));
                }
            }
        }
        byte b = r6.A1I;
        if (b == 0 || b == 1) {
            if (C40802Hu.A01(r6) != null) {
                str2 = "button";
            } else {
                C624134x A0w = r6.A0w();
                if (A0w == null || A0w.A1I != 54) {
                    str2 = "unsupported";
                }
            }
            this.A02 = str2;
        }
        if (b == 23) {
            str2 = "product";
        } else if (b == 49) {
            str2 = "button_reply";
        } else if (b == 52) {
            str2 = "product_list";
        } else if (b == 54) {
            str2 = "order_details";
        } else if (b == 45) {
            this.A02 = "list";
            if (r3 != null && !r3.A0B.isEmpty()) {
                this.A06 = AnonymousClass001.A0s();
                for (C108725dS r03 : r3.A0B) {
                    List<C108785dY> list2 = r03.A02;
                    if (!list2.isEmpty()) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (C108785dY r04 : list2) {
                            String A012 = C22781Qb.A01(r04.A02);
                            if (A012 != null) {
                                A0s.add(A012);
                            }
                        }
                        this.A06.add(A0s);
                    }
                }
                return;
            }
            return;
        } else if (b != 46) {
            str2 = "unsupported";
            if (r3 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ConversationSketchInteractiveEvent: getInteractiveMessageType interactive message type: ");
                int i2 = r3.A00;
                C18260x0.A1F(A0o, i2);
                if (i2 == 5 && r3.A01() != null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("ConversationSketchInteractiveEvent: getInteractiveMessageType native param action type: ");
                    C18260x0.A1J(A0o2, r3.A01());
                    String A013 = r3.A01();
                    if (A013.equals("address_message")) {
                        str2 = "address_message";
                    } else if (A013.equals("review_order")) {
                        String A022 = r3.A02();
                        if (!TextUtils.isEmpty(A022)) {
                            this.A04 = C624935g.A02(A022);
                        }
                    }
                }
            }
        } else {
            str2 = "list_reply";
        }
        this.A02 = str2;
        str2 = "order_status";
        this.A02 = str2;
    }

    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("https?://\\S+").matcher(str).find();
    }

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A02 = A1H.optString("interactive_type", "unknown");
            boolean optBoolean = A1H.optBoolean("has_header");
            this.A0B = optBoolean;
            if (optBoolean) {
                this.A01 = A1H.optString("header_type", "unknown");
                this.A0C = A1H.optBoolean("header_contains_url");
            }
            this.A09 = A1H.optBoolean("has_body");
            this.A07 = A1H.optBoolean("body_contains_url");
            this.A0A = A1H.optBoolean("has_footer");
            this.A08 = A1H.optBoolean("footer_contains_url");
            JSONArray optJSONArray = A1H.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A05 = AnonymousClass001.A0s();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A05.add(optJSONArray.get(i).toString());
                }
            }
            JSONArray optJSONArray2 = A1H.optJSONArray("row_id_hashes");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                this.A06 = AnonymousClass001.A0s();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONArray jSONArray = (JSONArray) optJSONArray2.get(i2);
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        AnonymousClass0x7.A1D(jSONArray.get(i3), A0s);
                    }
                    this.A06.add(A0s);
                }
            }
            if (A1H.has("list_reply_id_hash")) {
                this.A03 = A1H.optString("list_reply_id_hash");
            }
            if (A1H.has("button_reply_id_hash")) {
                this.A00 = A1H.optString("button_reply_id_hash");
            }
            if (!A1H.has("order_status")) {
                return true;
            }
            this.A04 = A1H.getString("order_status");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchInteractiveEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public C22771Qa() {
        super(-1, "unknown", "interactive");
        this.A02 = "unknown";
    }
}
