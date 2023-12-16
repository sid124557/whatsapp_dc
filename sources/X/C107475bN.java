package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5bN  reason: invalid class name and case insensitive filesystem */
public class C107475bN implements C836249d {
    public Object A00;
    public final int A01;

    public C107475bN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BMK(String str) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass500 r5 = (AnonymousClass500) obj;
            WaTextView waTextView = r5.A06;
            waTextView.setVisibility(0);
            int textSize = ((int) waTextView.getTextSize()) + (r5.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
            LinearLayout linearLayout = r5.A05;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            int i2 = layoutParams.height;
            int i3 = layoutParams.width;
            if (i2 < textSize) {
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i3, textSize, C86664Kz.A04(C102805Ki.A00(r5.A01) ? 1 : 0) | 80));
                return;
            }
            return;
        }
        C93214o9 r52 = (C93214o9) obj;
        C31971pB fMessage = r52.getFMessage();
        boolean A002 = C624234y.A00(r52.A0O, r52.A1b, fMessage);
        int i4 = R.drawable.mark_video;
        if (A002) {
            i4 = R.drawable.ic_hd_video_label;
        }
        Resources resources = r52.getResources();
        C31971pB fMessage2 = r52.getFMessage();
        boolean A003 = C624234y.A00(r52.A0O, r52.A1b, fMessage2);
        int i5 = R.dimen.f6nameremoved;
        if (A003) {
            i5 = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i5);
        TextView textView = r52.A0D;
        C86604Kt.A1D(textView, dimensionPixelSize, textView.getPaddingTop());
        if (C620733j.A04(r52.A0M)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C86644Kx.A0C(r52, i4), (Drawable) null);
        }
    }
}
