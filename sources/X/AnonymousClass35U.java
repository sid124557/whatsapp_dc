package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.35U  reason: invalid class name */
public class AnonymousClass35U {
    public static JSONObject A05(AnonymousClass39S r8, boolean z) {
        JSONArray A1F;
        JSONObject jSONObject = null;
        JSONObject A1G = AnonymousClass0x9.A1G();
        C85204Fi r0 = r8.A06;
        if (r0 != null) {
            A1G.put("currency", ((AnonymousClass3H6) r0).A04);
        }
        AnonymousClass390 r02 = r8.A08;
        if (r02 != null) {
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("max_installment_count", r02.A00);
            A1G.put("installment", A1G2);
        }
        JSONArray A00 = A00(r8.A0I);
        if (A00 != null) {
            A1G.put("external_payment_configurations", A00);
        }
        JSONArray A02 = A02(r8.A0H);
        if (A02 != null) {
            A1G.put("beneficiaries", A02);
        }
        String A04 = r8.A04();
        if (A04 != null) {
            A1G.put("payment_configuration", A04);
        }
        String str = r8.A0D;
        if (str != null) {
            A1G.put("payment_type", str);
        }
        String str2 = r8.A04;
        if (str2 != null) {
            A1G.put("transaction_id", str2);
        }
        if (!z) {
            AnonymousClass39G r03 = r8.A09;
            if (r03 != null) {
                A1G.put("total_amount", A04(r03));
            }
            A1G.put("reference_id", r8.A0E);
            String str3 = r8.A0B;
            if (str3 != null) {
                A1G.put("order_request_id", str3);
            }
        }
        String str4 = r8.A0G;
        if (str4 != null) {
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        }
        String str5 = r8.A02;
        if (str5 != null) {
            A1G.put("payment_method", str5);
        }
        String str6 = r8.A03;
        if (str6 != null) {
            A1G.put("payment_status", str6);
        }
        long j = r8.A00;
        if (j > 0) {
            A1G.put("payment_timestamp", j);
        }
        A1G.put("order", A03(r8.A07));
        JSONArray A01 = A01(r8.A0K);
        if (A01 != null) {
            A1G.put("payment_settings", A01);
        }
        String str7 = r8.A0A;
        if (str7 != null) {
            A1G.put("additional_note", str7);
        }
        AnonymousClass39L r04 = r8.A01;
        if (r04 != null) {
            jSONObject = r04.A01();
        }
        if (jSONObject != null) {
            A1G.put("paid_amount", jSONObject);
        }
        List list = r8.A0J;
        if (list == null) {
            A1F = null;
        } else {
            A1F = AnonymousClass0x9.A1F();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass0x7.A1L(it, A1F);
            }
        }
        if (A1F != null) {
            A1G.put("native_payment_methods", A1F);
        }
        return A1G;
    }

    public static JSONArray A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass399 r3 = (AnonymousClass399) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("uri", r3.A02);
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A01);
            A1G.put("payment_instruction", r3.A00);
            A1F.put(A1G);
        }
        return A1F;
    }

    public static JSONArray A01(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass394 r1 = (AnonymousClass394) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            String str = r1.A01;
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            C85184Fg r2 = r1.A00;
            if (r2 != null) {
                String str2 = "payment_gateway";
                if (!str.equals(str2)) {
                    str2 = "payment_link";
                    if (!str.equals(str2)) {
                        str2 = "pix_static_code";
                        if (!str.equals(str2)) {
                            str2 = "pix_dynamic_code";
                            if (!str.equals(str2)) {
                                str2 = "upi_merchant_configuration";
                                if (!str.equals(str2)) {
                                }
                            }
                        }
                    }
                }
                A1G.put(str2, r2.Bqs());
            }
            A1F.put(A1G);
        }
        return A1F;
    }

    public static JSONArray A02(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass38Y r2 = (AnonymousClass38Y) it.next();
            AnonymousClass38Y.A00(r2, r2.A04, A1F, AnonymousClass0x9.A1G());
        }
        return A1F;
    }

    public static JSONObject A03(AnonymousClass39H r7) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("status", r7.A01);
        String str = r7.A00;
        if (str != null) {
            A1G.put("description", str);
        }
        AnonymousClass39G r0 = r7.A05;
        if (r0 != null) {
            A1G.put("subtotal", A04(r0));
        }
        AnonymousClass39G r02 = r7.A06;
        if (r02 != null) {
            A1G.put("tax", A04(r02));
        }
        AnonymousClass39G r03 = r7.A03;
        if (r03 != null) {
            String str2 = r7.A07;
            JSONObject A04 = A04(r03);
            if (!TextUtils.isEmpty(str2)) {
                A04.put("discount_program_name", str2);
            }
            A1G.put("discount", A04);
        }
        AnonymousClass39G r04 = r7.A04;
        if (r04 != null) {
            A1G.put("shipping", A04(r04));
        }
        AnonymousClass393 r1 = r7.A02;
        if (r1 != null) {
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("timestamp", r1.A00);
            String str3 = r1.A01;
            if (!TextUtils.isEmpty(str3)) {
                A1G2.put("description", str3);
            }
            A1G.put("expiration", A1G2);
        }
        String str4 = r7.A08;
        if (str4 != null) {
            A1G.put("order_type", str4);
        }
        List<AnonymousClass39F> list = r7.A09;
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (AnonymousClass39F r5 : list) {
            JSONObject A1G3 = AnonymousClass0x9.A1G();
            A1G3.put("retailer_id", r5.A05);
            String str5 = r5.A04;
            if (!TextUtils.isEmpty(str5)) {
                A1G3.put("product_id", str5);
            }
            A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A03);
            A1G3.put("amount", A04(r5.A01));
            A1G3.put("quantity", r5.A00);
            AnonymousClass39G r05 = r5.A02;
            if (r05 != null) {
                A1G3.put("sale_amount", A04(r05));
            }
            A1F.put(A1G3);
        }
        A1G.put("items", A1F);
        return A1G;
    }

    public static JSONObject A04(AnonymousClass39G r4) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("value", r4.A01);
        A1G.put("offset", r4.A00);
        String str = r4.A02;
        if (!TextUtils.isEmpty(str)) {
            A1G.put("description", str);
        }
        return A1G;
    }
}
