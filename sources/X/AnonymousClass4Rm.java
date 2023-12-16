package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.whatsapp.R;

/* renamed from: X.4Rm  reason: invalid class name */
public class AnonymousClass4Rm extends PopupWindow {
    public View A00;
    public int[] A01 = new int[2];
    public final View A02;
    public final AnonymousClass4A4 A03;
    public final int[][] A04;

    public AnonymousClass4Rm(View view, AnonymousClass4A4 r10, AnonymousClass5Y0 r11, int[] iArr, boolean z) {
        super(new LinearLayout(view.getContext()), -2, -2);
        this.A02 = view;
        this.A03 = r10;
        LinearLayout linearLayout = (LinearLayout) getContentView();
        linearLayout.setId(R.id.single_skin_tone_selector);
        linearLayout.setOrientation(0);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        int dimensionPixelSize = C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved);
        int A09 = C86664Kz.A09(C18290x4.A0G(view), R.dimen.f6nameremoved, dimensionPixelSize) / 2;
        this.A04 = C107425bI.A0A(iArr);
        int i = 0;
        while (true) {
            int[][] iArr2 = this.A04;
            if (i < iArr2.length) {
                int[] iArr3 = iArr2[i];
                ImageView A0H = C86614Ku.A0H(view);
                A0H.setId(R.id.single_skin_tone_selector_item);
                C86624Kv.A0t(A0H, dimensionPixelSize);
                A0H.setPadding(A09, A09, A09, A09);
                AnonymousClass5Y0.A00(view.getResources(), A0H, r11, iArr3);
                A0H.setTag(Integer.valueOf(i));
                C633839a.A00(A0H, this, 15);
                A0H.setBackgroundResource(R.drawable.selector_orange_gradient);
                A0H.setContentDescription(C106655Zv.A01(iArr3));
                linearLayout.addView(A0H);
                i++;
            } else {
                C86604Kt.A19(linearLayout);
                setBackgroundDrawable(C86644Kx.A0D(view, this, z ? 1 : 0));
                linearLayout.requestFocus();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
        }
    }
}
