package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.04T  reason: invalid class name */
public final class AnonymousClass04T extends AppCompatSeekBar {
    public AnonymousClass04T(Context context) {
        super(context, (AttributeSet) null);
    }

    public static final int A00(Context context, int i) {
        return C1222663s.A01(((float) i) * (((float) AnonymousClass000.A0B(context).densityDpi) / ((float) 160)));
    }

    public final void A02(C03830Ls r3, int i) {
        List list;
        setSplitTrack(false);
        setThumb(getContext().getDrawable(R.drawable.parametric_slider_thumb));
        r3.A00 = getThumb();
        getViewTreeObserver().addOnGlobalLayoutListener(new C07220aW(this, r3, i));
        AnonymousClass0Pr r0 = r3.A02;
        if (r0 != null && (list = r0.A04) != null) {
            A03(list);
        }
    }

    public final void A03(List list) {
        setBackground((Drawable) null);
        setProgressDrawable(A01(list));
        Context context = getContext();
        C162457s7.A0D(context);
        setThumbOffset(A00(context, 10));
    }

    public final GradientDrawable A01(List list) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append('#');
            A0s.add(Integer.valueOf(Color.parseColor(AnonymousClass000.A0X(A0m, A0o))));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, C73723fy.A0V(A0s));
        gradientDrawable.setCornerRadius(100.0f);
        return gradientDrawable;
    }
}
