package X;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView;

/* renamed from: X.6BK  reason: invalid class name */
public class AnonymousClass6BK implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public Object A01;
    public final int A02 = 1;

    public AnonymousClass6BK(C113245l7 r2) {
        this.A01 = r2;
        this.A00 = r2.A0P.getHeight();
    }

    public void onGlobalLayout() {
        int i;
        if (this.A02 != 0) {
            C102825Kk r6 = (C102825Kk) this.A01;
            RecipientsView recipientsView = r6.A06;
            C86604Kt.A1G(recipientsView, this);
            int[] iArr = r6.A07;
            recipientsView.getLocationInWindow(iArr);
            int i2 = iArr[0] + r6.A01;
            int height = iArr[1] - (recipientsView.getHeight() / 2);
            PopupWindow popupWindow = r6.A03;
            popupWindow.setOutsideTouchable(true);
            WaTextView waTextView = r6.A04;
            int i3 = this.A00;
            if (i3 != 1) {
                i = R.string.f11nameremoved;
                if (i3 != 2) {
                    i = R.string.f11nameremoved;
                    if (i3 != 3) {
                        i = R.string.f11nameremoved;
                    }
                }
            } else {
                i = R.string.f11nameremoved;
            }
            waTextView.setText(i);
            C620733j r3 = r6.A05;
            waTextView.setBackground(new C131666dx(C02680He.A00((Resources.Theme) null, r6.A02.getResources(), R.drawable.recipient_tooltip_background), r3));
            AnonymousClass5CS.A00(waTextView, r6, 5);
            int i4 = 8388659;
            if (C102805Ki.A00(r3)) {
                i4 = 8388661;
            }
            popupWindow.showAtLocation(recipientsView, i4, i2, height);
            recipientsView.postDelayed(new C70013Zn(r6, 0), 5000);
            return;
        }
        C113245l7 r1 = (C113245l7) this.A01;
        int height2 = r1.A0P.getHeight() - this.A00;
        this.A00 = r1.A0P.getHeight();
        if (height2 > 0) {
            r1.A2f.smoothScrollBy(height2, 0);
        }
    }

    public AnonymousClass6BK(C102825Kk r2, int i) {
        this.A01 = r2;
        this.A00 = i;
    }
}
