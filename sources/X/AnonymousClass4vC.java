package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.4vC  reason: invalid class name */
public class AnonymousClass4vC extends C105425Uw {
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = (f2 + f4) / 2.0f;
        float f6 = (((f3 - f) * 2.0f) / 3.0f) / 2.0f;
        float f7 = f5 - f6;
        float f8 = f5 + f6;
        super.A0M(rectF, f, f7, f3, f8);
    }

    public void A0G(float f) {
        super.A0G((f * 2.0f) / 3.0f);
    }

    public AnonymousClass4vC(JSONObject jSONObject) {
        this();
        super.A0O(jSONObject);
    }

    public AnonymousClass4vC() {
        Path A06 = AnonymousClass002.A06();
        this.A02 = A06;
        this.A01 = C86604Kt.A0B();
        this.A00 = AnonymousClass002.A05();
        this.A03 = AnonymousClass002.A06();
        double radians = Math.toRadians(35.0d);
        float cos = (float) (Math.cos(radians) * 1000.0d);
        float sin = (float) (Math.sin(radians) * 1000.0d);
        double radians2 = Math.toRadians(55.0d);
        A06.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, 340.0f);
        A06.moveTo(cos, sin);
        A06.lineTo(1200.0f, 1200.0f);
        A06.lineTo((float) (Math.cos(radians2) * 1000.0d), (float) (Math.sin(radians2) * 1000.0d));
    }
}
