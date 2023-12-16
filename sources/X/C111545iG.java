package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5iG  reason: invalid class name and case insensitive filesystem */
public final class C111545iG implements C181698nB {
    public Integer A00;
    public String A01;
    public final AnonymousClass4FV A02;

    public C111545iG(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
    }

    public static void A00(C111545iG r5, Integer num, int i, int i2, int i3) {
        C111545iG r0 = r5;
        Integer num2 = num;
        r0.A09(num2, Integer.valueOf(i), (Map) null, i, i2, i3);
    }

    public final void A02(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        if (num != null) {
            LinkedHashMap A0r = C18320x8.A0r();
            if (str != null) {
                AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[2];
                AnonymousClass3Z6.A04("length", Long.valueOf((long) str.length()), r2);
                int i3 = 0;
                if (AnonymousClass2AB.A00(str).length() != 0) {
                    i3 = new C116975rB("\\s+").A01(AnonymousClass2AB.A00(str), 0).toArray(new String[0]).length;
                }
                AnonymousClass3Z6.A09("words", Integer.valueOf(i3), r2, 1);
                A0r.put("query", C73813g7.A0G(r2));
            }
            LinkedHashMap A0r2 = C18320x8.A0r();
            A0r2.put("endpoint", str2);
            A0r2.put("local_biz_count", num);
            A0r2.put("api_biz_count", Integer.valueOf(i));
            A0r2.put("sub_categories", Long.valueOf(j));
            if (!A0r2.isEmpty()) {
                A0r.put("result", A0r2);
            }
            LinkedHashMap A0r3 = C18320x8.A0r();
            if (bool2 != null) {
                A0r3.put("has_catalog", Boolean.valueOf(bool2.booleanValue()));
            }
            if (bool != null) {
                A0r3.put("distance", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool3 != null) {
                A0r3.put("open_now", Boolean.valueOf(bool3.booleanValue()));
            }
            String str4 = str3;
            if (str3 != null) {
                A0r3.put("categories", str4);
            }
            if (!A0r3.isEmpty()) {
                A0r.put("filters", A0r3);
            }
            A09(Integer.valueOf(i2), 2, A0r, 2, 4, 2);
        }
    }

    public final void A05(Integer num, int i, int i2) {
        A09(num, (Integer) null, (Map) null, i, i2, 0);
    }

    public final void A07(Integer num, Integer num2, int i) {
        A09(num2, num, (Map) null, 0, i, 1);
    }

    public void BK9(Map map, int i, int i2) {
        A09((Integer) null, (Integer) null, map, i, i2, 3);
    }

    public final void A01(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, List list, float f, int i, int i2, int i3, int i4, int i5) {
        String str4 = str3;
        C162457s7.A0J(str4, 6);
        LinkedHashMap A0r = C18320x8.A0r();
        LinkedHashMap A0r2 = C18320x8.A0r();
        A0r2.put("zoom_level", Float.valueOf(f));
        A0r2.put("endpoint", "businesses");
        if (str != null) {
            A0r2.put("search_category_id", str);
        }
        if (num != null) {
            A0r2.put("biz_loaded_count", num);
        }
        if (num2 != null) {
            A0r2.put("biz_selected_count", num2);
        }
        A0r2.put("map_view_config_version", str4);
        LinkedHashMap A0r3 = C18320x8.A0r();
        AnonymousClass0x2.A1I("compact_marker_count", A0r3, i2);
        AnonymousClass0x2.A1I("regular_marker_count", A0r3, i);
        A0r2.put("biz_in_viewport", A0r3);
        List list2 = list;
        if (list != null) {
            A0r2.put("segment_biz_count", list2);
        }
        if (!A0r2.isEmpty()) {
            A0r.put("result", A0r2);
        }
        LinkedHashMap A0r4 = C18320x8.A0r();
        if (bool3 != null) {
            A0r4.put("has_catalog", Boolean.valueOf(bool3.booleanValue()));
        }
        if (bool2 != null) {
            A0r4.put("distance", Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool != null) {
            A0r4.put("open_now", Boolean.valueOf(bool.booleanValue()));
        }
        String str5 = str2;
        if (str2 != null) {
            A0r4.put("categories", str5);
        }
        if (!A0r4.isEmpty()) {
            A0r.put("filters", A0r4);
        }
        int i6 = i5;
        A09(Integer.valueOf(i3), Integer.valueOf(i6), A0r, i6, i4, 2);
    }

    public final void A09(Integer num, Integer num2, Map map, int i, int i2, int i3) {
        C95224sp r2 = new C95224sp();
        r2.A0U = this.A01;
        r2.A0C = this.A00;
        r2.A09 = num;
        r2.A04 = Integer.valueOf(i3);
        r2.A02 = Integer.valueOf(i2);
        r2.A03 = Integer.valueOf(i);
        r2.A01 = num2;
        if (map != null && (!map.isEmpty())) {
            r2.A0P = new JSONObject(map).toString();
        }
        r2.A05 = C18290x4.A0Z();
        r2.A0J = 2L;
        this.A02.BhD(r2);
    }

    public final void A03(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A0r = C18320x8.A0r();
        if (bool != null) {
            A0r.put("is_enabled", bool);
        }
        if (str != null) {
            A0r.put("categories", str);
        }
        A09(num, 2, A0r, 2, i, 1);
    }

    public final void A04(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A0r = C18320x8.A0r();
        if (bool != null) {
            A0r.put("is_enabled", bool);
        }
        if (str != null) {
            A0r.put("categories", str);
        }
        A09(num, 11, A0r, 11, i, 1);
    }

    public final void A06(Integer num, int i, int i2, boolean z) {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("local_biz_count", Integer.valueOf(i2));
        A0r.put("ranked_position", Integer.valueOf(i));
        A0r.put("is_business_profile_loaded", Boolean.valueOf(z));
        A09(num, (Integer) null, A0r, 11, 70, 2);
    }

    public final void A08(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, int i2, int i3) {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("position", Integer.valueOf(i3));
        if (!(num3 == null || (obj4 = num3.toString()) == null)) {
            A0r.put("click_location", obj4);
        }
        if (!(num4 == null || (obj3 = num4.toString()) == null)) {
            A0r.put("catalog_preview_status", obj3);
        }
        if (!(num5 == null || (obj2 = num5.toString()) == null)) {
            A0r.put("fbig_preview_status", obj2);
        }
        if (!(num6 == null || (obj = num6.toString()) == null)) {
            A0r.put("description_preview_status", obj);
        }
        A09(num, num2, A0r, i2, i, 1);
    }

    public final void A0A(Integer num, boolean z) {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("from_keyboard", Boolean.valueOf(z));
        A09(num, C18280x3.A0S(), A0r, 1, 15, 1);
    }
}
