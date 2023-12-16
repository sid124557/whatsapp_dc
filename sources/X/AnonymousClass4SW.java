package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4SW  reason: invalid class name */
public abstract class AnonymousClass4SW extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A00(PhotoView photoView) {
        photoView.A0B = new Matrix();
        photoView.A0C = new Matrix();
        photoView.A0T = false;
        photoView.A0V = true;
        photoView.A02 = Float.MAX_VALUE;
        photoView.A0D = new Paint();
        photoView.A0F = new Rect();
        photoView.A09 = 0;
        photoView.A08 = 0.8f;
        photoView.A0H = new RectF();
        photoView.A0G = new RectF();
        photoView.A0I = new RectF();
        photoView.A0E = new PointF();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4SW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AnonymousClass4SW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AnonymousClass4SW(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
