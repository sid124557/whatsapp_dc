package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

/* renamed from: X.4SU  reason: invalid class name */
public class AnonymousClass4SU extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final /* synthetic */ AnonymousClass5LQ A05;

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.A02);
        canvas.drawRect(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this), this.A04);
        if (this.A05.A0B) {
            canvas.drawColor(this.A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4SU(Context context, AnonymousClass5LQ r6) {
        super(context, (AttributeSet) null);
        this.A05 = r6;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Paint A0a = C86664Kz.A0a(1);
        this.A04 = A0a;
        C86614Ku.A10(context, A0a, R.color.f5nameremoved);
        A0a.setStrokeWidth(C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
        C86634Kw.A17(A0a);
        A0a.setAntiAlias(true);
        this.A02 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A03 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
