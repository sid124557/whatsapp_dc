package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.whatsapp.SerializablePoint;
import org.json.JSONObject;

/* renamed from: X.4vH  reason: invalid class name and case insensitive filesystem */
public final class C95984vH extends C105425Uw implements C184488ru {
    public final int A00;
    public final C372721p A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public void A0P(JSONObject jSONObject) {
        Integer num;
        C162457s7.A0J(jSONObject, 0);
        super.A0P(jSONObject);
        jSONObject.put("skipConfirmation", this.A04);
        jSONObject.put("newsletterJid", this.A02);
        jSONObject.put("serverMessageId", this.A00);
        jSONObject.put("newsletterName", this.A03);
        C372721p r0 = this.A01;
        if (r0 != null) {
            num = Integer.valueOf(r0.value);
        } else {
            num = null;
        }
        jSONObject.put("contentType", num);
    }

    public SerializablePoint[] BEG(Matrix matrix, PointF pointF, RectF rectF) {
        RectF rectF2 = this.A02;
        rectF2.sort();
        Matrix A05 = AnonymousClass002.A05();
        A05.preConcat(matrix);
        RectF rectF3 = rectF;
        A05.preTranslate(-rectF3.left, -rectF3.top);
        A05.preRotate(this.A00, rectF2.centerX(), rectF2.centerY());
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = rectF2.right;
        float f4 = rectF2.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        A05.mapPoints(fArr);
        float f5 = fArr[0];
        PointF pointF2 = pointF;
        float f6 = pointF2.x;
        double d = (double) (f5 / f6);
        float f7 = fArr[1];
        float f8 = pointF2.y;
        return new SerializablePoint[]{new SerializablePoint(d, (double) (f7 / f8)), C105425Uw.A05(fArr, f6, f8, 2, 3), C105425Uw.A05(fArr, f6, f8, 4, 5), new SerializablePoint((double) (fArr[6] / f6), (double) (fArr[7] / f8))};
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
    }

    public boolean BpN() {
        return this.A04;
    }

    public C95984vH(JSONObject jSONObject) {
        super.A0O(jSONObject);
        this.A04 = jSONObject.getBoolean("skipConfirmation");
        String string = jSONObject.getString("newsletterJid");
        C162457s7.A0D(string);
        this.A02 = string;
        this.A00 = jSONObject.getInt("serverMessageId");
        String string2 = jSONObject.getString("newsletterName");
        C162457s7.A0D(string2);
        this.A03 = string2;
        this.A01 = AnonymousClass28U.A00(Integer.valueOf(jSONObject.getInt("contentType")));
    }

    public C95984vH(C372721p r2, String str, String str2, int i, boolean z) {
        C162457s7.A0J(str, 2);
        this.A04 = z;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = r2;
    }
}
