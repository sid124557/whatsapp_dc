package X;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5iD  reason: invalid class name and case insensitive filesystem */
public final class C111515iD implements AnonymousClass8r5 {
    public final AnonymousClass5OJ A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;

    public static boolean A00(C111515iD r1) {
        AnonymousClass1VX r12 = r1.A01;
        C162457s7.A0J(r12, 0);
        return r12.A0X(5957);
    }

    public final void A01(C94924sJ r11) {
        SharedPreferences.Editor putLong;
        AnonymousClass5OJ r7 = this.A00;
        r11.A08 = r7.A01;
        C96194vx r9 = r7.A04;
        String A0Z = C18280x3.A0Z(r9.A01(), "pref_saved_fs_search_session_id");
        if (!(A0Z == null || A0Z.length() == 0)) {
            long j = r9.A01().getLong("pref_saved_fs_search_session_ts", 0);
            if (j != 0 && AnonymousClass0x9.A05(j) < 1800000) {
                putLong = AnonymousClass5NA.A00(r9).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
                putLong.apply();
                r11.A05 = A0Z;
                r11.A07 = r7.A00;
            }
        }
        A0Z = C86604Kt.A0k();
        C18270x1.A0j(AnonymousClass5NA.A00(r9), "pref_saved_fs_search_session_id", A0Z);
        putLong = AnonymousClass5NA.A00(r9).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
        putLong.apply();
        r11.A05 = A0Z;
        r11.A07 = r7.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r1 == 0) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.Boolean r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
            r6 = this;
            X.5XN r0 = X.AnonymousClass5ZL.A0L
            X.1VX r1 = r6.A01
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0072
            r0 = 6329(0x18b9, float:8.869E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0072
            X.4sM r3 = new X.4sM
            r3.<init>()
            r3.A08 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3.A00 = r0
            r3.A09 = r10
            r0 = 20
            boolean r0 = X.AnonymousClass000.A1U(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            boolean r0 = X.AnonymousClass0x9.A1Q(r7)
            if (r0 == 0) goto L_0x0073
            r2 = 3
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0038:
            r3.A02 = r0
            X.5OJ r1 = r6.A00
            java.lang.String r0 = r1.A03
            r3.A04 = r0
            java.lang.String r0 = r1.A00()
            r3.A07 = r0
            java.lang.String r0 = r1.A02
            r3.A06 = r0
            X.4vx r5 = r1.A04
            android.content.SharedPreferences r0 = r5.A01()
            java.lang.String r4 = "pref_saved_search_session_action_order"
            int r0 = X.C18280x3.A02(r0, r4)
            long r1 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A03 = r0
            if (r0 == 0) goto L_0x0069
            int r0 = (int) r1
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = r5.A01()
            X.C86604Kt.A15(r0, r4, r1)
        L_0x0069:
            if (r11 == 0) goto L_0x006d
            r3.A05 = r11
        L_0x006d:
            X.4FV r0 = r6.A02
            r0.BhD(r3)
        L_0x0072:
            return
        L_0x0073:
            if (r8 == 0) goto L_0x0085
            int r1 = r8.intValue()
            r0 = 5
            r2 = 2
            if (r1 == r0) goto L_0x0034
            r2 = 1
            if (r1 != r2) goto L_0x0082
            r2 = 0
            goto L_0x0034
        L_0x0082:
            if (r1 != 0) goto L_0x0085
            goto L_0x0034
        L_0x0085:
            r0 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111515iD.A03(java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public void BJx(Integer num, Integer num2) {
    }

    public C111515iD(AnonymousClass5OJ r1, AnonymousClass1VX r2, AnonymousClass4FV r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A02(C94924sJ r3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list) {
        LinkedHashMap A0r = C18320x8.A0r();
        if (num != null) {
            A0r.put("query_length", num);
        }
        if (num4 != null) {
            A0r.put("serp_size", num4);
        }
        if (num5 != null) {
            A0r.put("error_type", num5);
        }
        if (list != null) {
            A0r.put("error_code", list);
        }
        if (num2 != null) {
            A0r.put("item_rank", num2);
        }
        if (num3 != null) {
            A0r.put("local_serp_size", num3);
        }
        if (str != null) {
            A0r.put("location_type", str);
        }
        r3.A06 = C18290x4.A0o(new JSONObject(A0r));
    }

    public void BKM(Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i) {
    }
}
