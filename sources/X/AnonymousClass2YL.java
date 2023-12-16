package X;

import org.json.JSONException;

/* renamed from: X.2YL  reason: invalid class name */
public final class AnonymousClass2YL {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;

    public final int A00(String str, int i) {
        String A08 = C56952sp.A08(this.A01, 3982);
        try {
            return AnonymousClass0x9.A1H(A08).optInt(str, i);
        } catch (JSONException unused) {
            this.A00.A0A("WABISurveyFeatureConfigParse", false, A08);
            return i;
        }
    }

    public AnonymousClass2YL(C55682qk r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
