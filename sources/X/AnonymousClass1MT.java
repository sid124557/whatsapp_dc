package X;

import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.1MT  reason: invalid class name */
public final class AnonymousClass1MT extends C27351dg {
    public final C620733j A00;
    public final Set A01 = C73833g9.A05("en", "fr", "ar");

    public void A09(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        super.A09(jSONObject);
        jSONObject.put("tos_version", 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1MT(X.C56492s4 r18, X.AnonymousClass33p r19, X.C620733j r20, X.AnonymousClass1VX r21, X.AnonymousClass28T r22, X.AnonymousClass3FI r23, X.C183538qC r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.AnonymousClass4C1 r28, X.AnonymousClass4C1 r29, long r30) {
        /*
            r17 = this;
            r4 = r18
            r5 = r19
            r7 = r22
            r8 = r23
            r9 = r24
            X.C18260x0.A0f(r8, r4, r7, r5, r9)
            r13 = r28
            r14 = r29
            X.C18260x0.A0U(r13, r14)
            r0 = 9
            r1 = r20
            r6 = r21
            r11 = r25
            X.C18270x1.A15(r11, r6, r1, r0)
            r3 = r17
            r12 = r26
            r10 = r27
            r15 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A00 = r1
            java.lang.String r2 = "fr"
            java.lang.String r1 = "ar"
            java.lang.String r0 = "en"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r1}
            java.util.Set r0 = X.C73833g9.A05(r0)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MT.<init>(X.2s4, X.33p, X.33j, X.1VX, X.28T, X.3FI, X.8qC, java.lang.String, java.lang.String, java.lang.String, X.4C1, X.4C1, long):void");
    }

    public String A03() {
        C620733j r1 = this.A00;
        String languageTag = C620733j.A02(r1).toLanguageTag();
        C162457s7.A0D(languageTag);
        String A04 = C162307rf.A04(C620733j.A02(r1));
        C162457s7.A0D(A04);
        if (!this.A01.contains(A04)) {
            return "en-US";
        }
        return languageTag;
    }
}
