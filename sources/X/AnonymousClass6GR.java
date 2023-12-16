package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.WaTabLayout;

/* renamed from: X.6GR  reason: invalid class name */
public class AnonymousClass6GR extends AnonymousClass0WH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ WaTabLayout A02;

    public AnonymousClass6GR(View view, WaTabLayout waTabLayout, int i) {
        this.A02 = waTabLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public void A0D(View view, C05650Ui r5) {
        super.A0D(view, r5);
        r5.A05(this.A01);
        r5.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A00, 1, false)));
    }
}
