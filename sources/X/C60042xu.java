package X;

import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.2xu  reason: invalid class name and case insensitive filesystem */
public final class C60042xu {
    public int A00;
    public long A01;
    public C85204Fi A02;

    public static AnonymousClass39L A00(JSONObject jSONObject) {
        C60042xu r1 = new C60042xu();
        r1.A02 = AnonymousClass1S3.A06;
        r1.A01();
        return new C60042xu(jSONObject).A01();
    }

    public AnonymousClass39L A01() {
        int i = this.A00;
        long j = this.A01;
        if (i <= 0) {
            return new AnonymousClass39L(this.A02, 1, j);
        }
        return new AnonymousClass39L(this.A02, i, j);
    }

    public void A02(AnonymousClass39Q r7) {
        BigDecimal bigDecimal = r7.A00;
        int pow = (int) Math.pow(10.0d, (double) bigDecimal.scale());
        this.A01 = (long) (bigDecimal.doubleValue() * ((double) pow));
        this.A00 = pow;
    }

    public C60042xu(JSONObject jSONObject) {
        C85204Fi r0;
        if (jSONObject != null) {
            this.A01 = jSONObject.optLong("value", -1);
            this.A00 = jSONObject.optInt("offset", -1);
            jSONObject.optInt("currencyType", -1);
            JSONObject optJSONObject = jSONObject.optJSONObject("currency");
            if (optJSONObject != null) {
                r0 = new AnonymousClass1S3(optJSONObject);
            } else {
                r0 = AnonymousClass1S3.A06;
            }
            this.A02 = r0;
        }
    }

    public C60042xu() {
    }
}
