package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4tx  reason: invalid class name and case insensitive filesystem */
public final class C95604tx extends C67303Ot {
    public final AnonymousClass5T9 A00;
    public final AnonymousClass3FI A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95604tx(X.C56492s4 r14, X.AnonymousClass5T9 r15, X.AnonymousClass33p r16, X.AnonymousClass1VX r17, X.AnonymousClass28T r18, X.AnonymousClass3FI r19, X.C183538qC r20, X.AnonymousClass4C1 r21, X.AnonymousClass4C1 r22) {
        /*
            r13 = this;
            r2 = r14
            r3 = r16
            r4 = r17
            r0 = r19
            X.C18260x0.A0e(r4, r14, r0, r3)
            r6 = r20
            r9 = r21
            r10 = r22
            X.C18260x0.A0W(r6, r9, r10)
            r11 = 6809176452507902(0x1830e8efaa28fe, double:3.3641801616553246E-308)
            java.lang.String r7 = X.C58172up.A07
            r8 = 0
            r1 = r13
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A00 = r15
            r13.A01 = r0
            java.lang.String r0 = "search"
            r13.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95604tx.<init>(X.2s4, X.5T9, X.33p, X.1VX, X.28T, X.3FI, X.8qC, X.4C1, X.4C1):void");
    }

    public String A02() {
        return this.A01.A05(A05());
    }

    public String A03() {
        String A03 = super.A03();
        Map A05 = A05();
        if (!A05.containsKey(A03)) {
            return A03;
        }
        String A0o = C18310x6.A0o(A03, A05);
        if (A0o == null) {
            return "en_US";
        }
        return A0o;
    }

    public void A07(JSONObject jSONObject) {
        Double d;
        Double d2;
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        AnonymousClass5T9 r3 = this.A00;
        String str = r3.A06;
        A0l.put("query_type", str);
        A0l.put("country_code", r3.A01);
        A0l.put("search_query", r3.A04);
        AnonymousClass1VX r4 = this.A04;
        JSONObject A0z = C18300x5.A0z(r4.A0Q(5857), "experiment_flag", A0l);
        AnonymousClass5ZO r7 = r3.A00;
        if (!r7.A07() && C162457s7.A0P(str, "business_search")) {
            boolean A08 = r7.A08();
            if (A08) {
                d = r7.A04;
            } else {
                d = r7.A02;
            }
            A0z.put("latitude", d);
            if (A08) {
                d2 = r7.A05;
            } else {
                d2 = r7.A03;
            }
            A0z.put("longitude", d2);
            A0z.put("has_accurate_location", r7.A09());
            A0z.put("radius", r7.A06);
            A0z.put("location_type", r7.A09);
            A0l.put("location", A0z);
        }
        if (r4.A0X(6743)) {
            A0l.put("token", r4.A0Q(6744));
        }
        A0l.put("is_test", r3.A07);
        A0l.put("query_id", r3.A02);
        A0l.put("search_id", r3.A03);
        JSONObject A0z2 = C18300x5.A0z(r3.A05, "search_session_id", A0l);
        A0z2.put("args", A0l);
        jSONObject.put("variables", A0z2);
    }
}
