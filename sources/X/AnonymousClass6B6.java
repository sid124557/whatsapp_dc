package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

/* renamed from: X.6B6  reason: invalid class name */
public class AnonymousClass6B6 implements C183278pm {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6B6(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BUX(View view) {
        switch (this.A02) {
            case 0:
                View view2 = (View) this.A00;
                Context context = view2.getContext();
                boolean z = ((C624134x) this.A01).A1J.A02;
                Context context2 = view2.getContext();
                int i = R.attr.f3nameremoved;
                int i2 = R.color.f5nameremoved;
                if (z) {
                    i = R.attr.f3nameremoved;
                    i2 = R.color.f5nameremoved;
                }
                view.setBackground(new AnonymousClass4Ln(AnonymousClass5Yj.A03(context2, context, i, i2)));
                return;
            case 1:
                View view3 = (View) this.A00;
                GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                gradientDrawable.mutate();
                int A04 = AnonymousClass5YI.A04(view3.getContext(), 1.0f);
                Resources resources = view3.getResources();
                boolean z2 = ((C624134x) this.A01).A1J.A02;
                int i3 = R.color.f5nameremoved;
                if (z2) {
                    i3 = R.color.f5nameremoved;
                }
                gradientDrawable.setStroke(A04, resources.getColor(i3));
                return;
            default:
                Context context3 = (Context) this.A01;
                CircularProgressBar circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                circularProgressBar.A0C = AnonymousClass0Y8.A04(context3, AnonymousClass34K.A01(((View) this.A00).getContext(), R.attr.f3nameremoved));
                circularProgressBar.A0B = AnonymousClass0Y8.A04(context3, R.color.f5nameremoved);
                return;
        }
    }
}
