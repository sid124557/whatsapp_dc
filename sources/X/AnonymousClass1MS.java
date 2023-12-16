package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1MS  reason: invalid class name */
public final class AnonymousClass1MS extends C27351dg {
    public final C620733j A00;

    public void A09(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        super.A09(jSONObject);
        jSONObject.put("tos_version", "1");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1MS(X.C56492s4 r17, X.AnonymousClass33p r18, X.C620733j r19, X.AnonymousClass1VX r20, X.AnonymousClass28T r21, X.AnonymousClass3FI r22, X.C183538qC r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.AnonymousClass4C1 r27, X.AnonymousClass4C1 r28, long r29) {
        /*
            r16 = this;
            r3 = r17
            r4 = r18
            r6 = r21
            r7 = r22
            r8 = r23
            X.C18260x0.A0f(r7, r3, r6, r4, r8)
            r13 = r28
            r12 = r27
            X.C18260x0.A0U(r12, r13)
            r0 = 9
            r1 = r19
            r5 = r20
            r10 = r24
            X.C18270x1.A15(r10, r5, r1, r0)
            r14 = r29
            r2 = r16
            r11 = r25
            r9 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MS.<init>(X.2s4, X.33p, X.33j, X.1VX, X.28T, X.3FI, X.8qC, java.lang.String, java.lang.String, java.lang.String, X.4C1, X.4C1, long):void");
    }

    public String A03() {
        boolean A0Y = this.A04.A0Y(C58422vE.A02, 2827);
        if (A0Y) {
            String languageTag = C620733j.A02(this.A00).toLanguageTag();
            C162457s7.A0D(languageTag);
            Map A05 = A05();
            if (!A05.containsKey(languageTag)) {
                return languageTag;
            }
            String A0o = C18310x6.A0o(languageTag, A05);
            if (A0o == null) {
                return "en_US";
            }
            return A0o;
        } else if (!A0Y) {
            String A03 = super.A03();
            C162457s7.A0D(A03);
            return A03;
        } else {
            throw C73153f1.A00();
        }
    }
}
