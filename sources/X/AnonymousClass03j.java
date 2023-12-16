package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.whatsapp.R;

/* renamed from: X.03j  reason: invalid class name */
public class AnonymousClass03j extends RatingBar {
    public final C05520Tv A00;

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AnonymousClass03j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved);
        AnonymousClass0XB.A04(this);
        C05520Tv r0 = new C05520Tv(this);
        this.A00 = r0;
        r0.A01(attributeSet, R.attr.f3nameremoved);
    }
}
