package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C106115Xr {
    public Canvas A00;
    public final float A01;
    public final Paint A02;
    public final List A03 = AnonymousClass001.A0s();

    public void A02(Canvas canvas) {
        AnonymousClass4vL r2 = (AnonymousClass4vL) this;
        Canvas canvas2 = canvas;
        if (canvas != null) {
            for (PointF pointF : r2.A03) {
                r2.A06(canvas2, r2.A02, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public void A04(PointF pointF, long j) {
        AnonymousClass4vL r2 = (AnonymousClass4vL) this;
        List list = r2.A03;
        if (list.isEmpty() || !C18300x5.A0c(list).equals(pointF)) {
            list.add(pointF);
            Canvas canvas = r2.A00;
            if (canvas != null) {
                r2.A06(canvas, r2.A02, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public static List A00(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("points");
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            A0s.add(AnonymousClass4L0.A08(((float) jSONArray.getInt(i)) / 100.0f, ((float) jSONArray.getInt(i + 1)) / 100.0f));
        }
        return A0s;
    }

    public void A03(PointF pointF, long j) {
    }

    public C106115Xr(Bitmap bitmap, Paint paint, PointF pointF, float f, int i) {
        if (bitmap != null) {
            Canvas A06 = AnonymousClass4L0.A06(bitmap);
            float f2 = (float) i;
            A06.scale(f2, f2);
            if (pointF != null) {
                A06.translate(-pointF.x, -pointF.y);
            }
            this.A00 = A06;
        }
        this.A01 = f;
        this.A02 = paint;
    }

    public void A01(Bitmap bitmap, PointF pointF, int i) {
        Canvas A06 = AnonymousClass4L0.A06(bitmap);
        float f = (float) i;
        A06.scale(f, f);
        if (pointF != null) {
            A06.translate(-pointF.x, -pointF.y);
        }
        this.A00 = A06;
    }

    public void A05(JSONObject jSONObject) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (PointF pointF : this.A03) {
            A1F.put((int) (pointF.x * 100.0f));
            A1F.put((int) (pointF.y * 100.0f));
        }
        jSONObject.put("points", A1F);
        jSONObject.put("width", (int) (this.A01 * 100.0f));
    }
}
