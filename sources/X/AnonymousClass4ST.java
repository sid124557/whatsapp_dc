package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.4ST  reason: invalid class name */
public class AnonymousClass4ST extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public AnonymousClass4ST(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
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
        setMeasuredDimension(defaultSize, (int) (((double) ((float) defaultSize)) * 1.5d));
    }
}
