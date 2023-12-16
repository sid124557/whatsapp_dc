package X;

import android.graphics.RectF;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.4vK  reason: invalid class name and case insensitive filesystem */
public class C95994vK extends C158697kP {
    public AnonymousClass7N4 A00;

    public String A00() {
        return "undo_modify_shape";
    }

    public void A01(List list) {
        this.A00.A0N(this.A00);
    }

    public void A03(JSONObject jSONObject) {
        jSONObject.put("color", this.A00.A02);
        jSONObject.put("rotate", (double) this.A00.A00);
        jSONObject.put("strokeWidth", (double) this.A00.A01);
        jSONObject.put("left", (double) this.A00.A03.left);
        jSONObject.put("right", (double) this.A00.A03.right);
        jSONObject.put("top", (double) this.A00.A03.top);
        jSONObject.put("bottom", (double) this.A00.A03.bottom);
        AnonymousClass7N4 r3 = this.A00;
        if (r3 instanceof C135666l3) {
            C135666l3 r32 = (C135666l3) r3;
            jSONObject.put("text", r32.A04);
            jSONObject.put("text-size", (double) r32.A00);
            jSONObject.put("fontStyle", r32.A03);
            jSONObject.put("alignment", r32.A01);
            jSONObject.put("background_style", r32.A02);
        }
    }

    public C95994vK(AnonymousClass7N4 r1, C105425Uw r2) {
        super(r2);
        this.A00 = r1;
    }

    public void A02(JSONObject jSONObject) {
        RectF A07 = AnonymousClass002.A07();
        A07.left = (float) jSONObject.getDouble("left");
        A07.right = (float) jSONObject.getDouble("right");
        A07.top = (float) jSONObject.getDouble("top");
        A07.bottom = (float) jSONObject.getDouble("bottom");
        int i = jSONObject.getInt("color");
        float f = (float) jSONObject.getDouble("rotate");
        float f2 = (float) jSONObject.getDouble("strokeWidth");
        if (jSONObject.has("text")) {
            this.A00 = new C135666l3(A07, jSONObject.getString("text"), f, f2, (float) jSONObject.getDouble("text-size"), i, jSONObject.getInt("fontStyle"), jSONObject.getInt("alignment"), jSONObject.getInt("background_style"));
        } else {
            this.A00 = new AnonymousClass7N4(A07, f, f2, i);
        }
    }

    public C95994vK() {
    }
}
