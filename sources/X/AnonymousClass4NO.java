package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.4NO  reason: invalid class name */
public final class AnonymousClass4NO extends View {
    public float A00;
    public ValueAnimator A01;
    public Paint A02 = C86664Kz.A0Z();
    public Paint A03 = C86664Kz.A0Z();
    public Path A04;
    public PathMeasure A05;

    public AnonymousClass4NO(Context context) {
        super(context, (AttributeSet) null, 0);
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 0;
        A0T[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T);
        C162457s7.A0D(ofFloat);
        this.A01 = ofFloat;
        this.A01.setDuration(2000);
        C86644Kx.A0j(this.A01);
        C86634Kw.A17(this.A03);
        this.A03.setColor(-1);
        this.A03.setStrokeWidth(5.0f);
        this.A03.setShadowLayer(7.0f, 0.0f, 0.0f, -1);
        C86634Kw.A17(this.A02);
        this.A02.setColor(-14298266);
        this.A02.setStrokeWidth(5.0f);
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        super.onDraw(canvas);
        Path path = this.A04;
        if (path == null) {
            throw C18270x1.A0S("path");
        }
        canvas.drawPath(path, this.A03);
        Path path2 = this.A04;
        if (path2 == null) {
            throw C18270x1.A0S("path");
        }
        canvas.drawPath(path2, this.A02);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == i3 && i2 == i4)) {
            Path ovalPath = getOvalPath();
            this.A04 = ovalPath;
            PathMeasure pathMeasure = new PathMeasure(ovalPath, false);
            this.A05 = pathMeasure;
            float length = pathMeasure.getLength();
            this.A00 = length;
            Paint paint = this.A02;
            float[] A1b = C86654Ky.A1b(length);
            A1b[1] = length;
            float f = 0.0f * length;
            if (f < 0.0f) {
                f = 0.0f;
            }
            paint.setPathEffect(new DashPathEffect(A1b, length - f));
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final Path getOvalPath() {
        float A002 = AnonymousClass4L0.A00(this) * 0.5f;
        float A022 = C86664Kz.A02(this) * 0.7f;
        float A003 = AnonymousClass4L0.A00(this) * 0.25f;
        float A023 = C86664Kz.A02(this) * 0.15f;
        float f = (0.5f * A002) + A003;
        PointF A08 = AnonymousClass4L0.A08(f, A023);
        float f2 = (0.425f * A022) + A023;
        PointF A082 = AnonymousClass4L0.A08(A003, f2);
        PointF A083 = AnonymousClass4L0.A08(A003 + A002, f2);
        PointF A084 = AnonymousClass4L0.A08(f, A023 + A022);
        PointF A085 = AnonymousClass4L0.A08(A083.x, A08.y);
        PointF A086 = AnonymousClass4L0.A08(A083.x, A084.y);
        PointF A087 = AnonymousClass4L0.A08(A082.x, A084.y);
        PointF A088 = AnonymousClass4L0.A08(A082.x, A08.y);
        Path A06 = AnonymousClass002.A06();
        A06.moveTo(A08.x, A08.y);
        A06.quadTo(A085.x, A085.y, A083.x, A083.y);
        A06.quadTo(A086.x, A086.y, A084.x, A084.y);
        A06.quadTo(A087.x, A087.y, A082.x, A082.y);
        A06.quadTo(A088.x, A088.y, A08.x, A08.y);
        A06.close();
        return A06;
    }
}
