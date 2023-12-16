package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.4ZR  reason: invalid class name */
public class AnonymousClass4ZR extends AnonymousClass0R4 {
    public final /* synthetic */ PopupNotification A00;

    public AnonymousClass4ZR(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public int A0C() {
        return C86614Ku.A08(this.A00.A1P);
    }

    public Object A0D(ViewGroup viewGroup, int i) {
        PopupNotification popupNotification = this.A00;
        RelativeLayout relativeLayout = new RelativeLayout(popupNotification);
        ScrollView scrollView = new ScrollView(popupNotification);
        C624134x A0R = C18320x8.A0R(popupNotification.A1P, i);
        View A6j = popupNotification.A6j(A0R);
        relativeLayout.setTag(A0R.A1J);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        scrollView.addView(A6j);
        relativeLayout.addView(scrollView, layoutParams);
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
