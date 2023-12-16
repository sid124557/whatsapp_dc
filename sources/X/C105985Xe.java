package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Xe  reason: invalid class name and case insensitive filesystem */
public final class C105985Xe {
    public final C620733j A00;
    public final C106675Zy A01;

    public static final Map A00(C108815db r6) {
        C162457s7.A0J(r6, 0);
        AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A04, r4, 0);
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09("width", Integer.valueOf(r6.A03), r3, 0);
        r3[1] = AnonymousClass3Z6.A02("height", Integer.valueOf(r6.A02));
        AnonymousClass3Z6.A09("original_dimensions", C73813g7.A0F(r3), r4, 1);
        Map A0G = C73813g7.A0G(r4);
        String str = r6.A00;
        if (str != null) {
            A0G.put("original_image_url", str);
        }
        String str2 = r6.A01;
        if (str2 != null) {
            A0G.put("request_image_url", str2);
        }
        return A0G;
    }

    public final Map A03(C43072Qq r5) {
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[4];
        AnonymousClass3Z6.A09("category_id", r5.A01, r2, 0);
        AnonymousClass3Z6.A05("is_last_level", Boolean.valueOf(r5.A04), r2);
        AnonymousClass3Z6.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A02, r2);
        C108815db r0 = r5.A00;
        C162457s7.A0C(r0);
        AnonymousClass3Z6.A07("media", C57692u3.A04("image", A00(r0)), r2);
        return C73813g7.A0F(r2);
    }

    public final Map A04(C109015dw r9) {
        String str;
        String str2;
        String str3;
        String str4;
        C162457s7.A0J(r9, 0);
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[5];
        AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9.A0F, r2, 0);
        r2[1] = AnonymousClass3Z6.A02(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r9.A05);
        int i = r9.A00;
        if (i == 0) {
            str = "IN_STOCK";
        } else if (i == 1) {
            str = "OUT_STOCK";
        } else if (i != 2) {
            str = "UNKNOWN";
        } else {
            str = "AVAILABLE_FOR_ANOTHER_POSTCODE";
        }
        AnonymousClass3Z6.A06("product_availability", str, r2);
        if (r9.A08) {
            str2 = "ISHIDDEN_TRUE";
        } else {
            str2 = "ISHIDDEN_FALSE";
        }
        AnonymousClass3Z6.A07("is_hidden", str2, r2);
        AnonymousClass3Z6.A08("max_available", Long.valueOf(r9.A09), r2);
        Map A0G = C73813g7.A0G(r2);
        String str5 = r9.A0C;
        if (str5 != null) {
            A0G.put("description", str5);
        }
        BigDecimal bigDecimal = r9.A06;
        if (bigDecimal != null) {
            A0G.put("price", String.valueOf(bigDecimal.unscaledValue()));
        }
        C160617ny r0 = r9.A04;
        if (r0 != null) {
            A0G.put("currency", r0.A00);
        }
        String str6 = r9.A0E;
        if (str6 != null) {
            A0G.put("url", str6);
        }
        String str7 = r9.A0G;
        if (str7 != null) {
            A0G.put("retailer_id", str7);
        }
        C633238u r5 = r9.A01;
        if (r5 != null) {
            AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[4];
            int i2 = r5.A00;
            if (i2 == 0) {
                str4 = "APPROVED";
            } else if (i2 == 1) {
                str4 = "REVIEWING";
            } else if (i2 == 2) {
                str4 = "REJECTED";
            } else if (i2 != 3) {
                str4 = "UNKNOWN";
            } else {
                str4 = "DELETED";
            }
            AnonymousClass3Z6.A09("status", str4, r4, 0);
            AnonymousClass3Z6.A05("can_appeal", Boolean.valueOf(r5.A04), r4);
            AnonymousClass3Z6.A06("commerce_url", r5.A01, r4);
            AnonymousClass3Z6.A07("reject_reason", r5.A02, r4);
            A0G.put("status_info", C73813g7.A0F(r4));
        }
        C108745dU r52 = r9.A02;
        if (r52 != null) {
            AnonymousClass3Z6[] r22 = new AnonymousClass3Z6[1];
            AnonymousClass3Z6.A09("price", String.valueOf(r52.A01.unscaledValue()), r22, 0);
            Map A0G2 = C73813g7.A0G(r22);
            Date date = r52.A03;
            if (date != null) {
                A0G2.put("start_date", Long.valueOf(date.getTime()));
            }
            Date date2 = r52.A02;
            if (date2 != null) {
                A0G2.put("end_date", Long.valueOf(date2.getTime()));
            }
            A0G.put("sale_price", A0G2);
        }
        String str8 = r9.A0D;
        if (str8 != null) {
            A0G.put("image_fetch_status", str8);
        }
        List<C108815db> list = r9.A07;
        C162457s7.A0C(list);
        if (C18310x6.A1X(list)) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (C108815db r02 : list) {
                C162457s7.A0H(r02);
                A0s.add(A00(r02));
            }
            A0G.put("media", C57692u3.A04("images", A0s));
        }
        C166017y0 r6 = r9.A0A;
        if (r6 != null) {
            LinkedHashMap A0r = C18320x8.A0r();
            String str9 = r6.A01;
            A0r.put("country_code_origin", str9);
            if ("N/A".equals(str9) || str9 == null) {
                str3 = null;
            } else {
                str3 = this.A01.A02(this.A00, str9);
            }
            A0r.put("country_name", str3);
            A0r.put("importer_name", r6.A02);
            C166187yH r62 = r6.A00;
            if (r62 != null) {
                AnonymousClass3Z6[] r53 = new AnonymousClass3Z6[6];
                AnonymousClass3Z6.A09("street1", r62.A04, r53, 0);
                AnonymousClass3Z6.A05("street2", r62.A05, r53);
                AnonymousClass3Z6.A06("city", r62.A00, r53);
                AnonymousClass3Z6.A07("region", r62.A03, r53);
                AnonymousClass3Z6.A08("postal_code", r62.A02, r53);
                r53[5] = AnonymousClass3Z6.A02("country_code", r62.A01);
                A0r.put("importer_address", C73813g7.A0F(r53));
            }
            A0G.put("compliance_info", A0r);
        }
        return A0G;
    }

    public C105985Xe(C620733j r1, C106675Zy r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Map A01(C64523Dv r5) {
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = r5.A02.iterator();
        while (it.hasNext()) {
            C109015dw A12 = C86664Kz.A12(it);
            C162457s7.A0H(A12);
            A0s.add(A04(A12));
        }
        A0t.put("products", A0s);
        String str = r5.A01.A00;
        if (str == null) {
            str = "-1";
        }
        A0t.put("paging", C57692u3.A04("after", str));
        return A0t;
    }

    public final Map A02(C64533Dw r5) {
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = r5.A02.A04.iterator();
        while (it.hasNext()) {
            C109015dw A12 = C86664Kz.A12(it);
            C162457s7.A0H(A12);
            A0s.add(A04(A12));
        }
        A0t.put("products", A0s);
        String str = r5.A01.A00;
        if (str == null) {
            str = "-1";
        }
        A0t.put("paging", C57692u3.A04("after", str));
        return A0t;
    }
}
