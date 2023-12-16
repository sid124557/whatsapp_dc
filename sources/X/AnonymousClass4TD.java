package X;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.4TD  reason: invalid class name */
public class AnonymousClass4TD extends AnonymousClass0WH {
    public final /* synthetic */ View A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass4TD(View view, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = view;
        this.A03 = z;
    }

    public void A0D(View view, C05650Ui r9) {
        super.A0D(view, r9);
        r9.A0C("Button");
        AccessibilityNodeInfo accessibilityNodeInfo = r9.A01;
        accessibilityNodeInfo.setSelected(false);
        r9.A09(this.A02);
        String str = this.A01;
        if (str != null) {
            C86644Kx.A1B(r9, str, 16);
        }
        View view2 = (View) this.A00.getParent();
        if (this.A03 && view2 != null) {
            int[] A1Z = C86664Kz.A1Z();
            view2.getLocationOnScreen(A1Z);
            int i = A1Z[0];
            accessibilityNodeInfo.setBoundsInScreen(new Rect(i, A1Z[1], view2.getWidth() + i, C86634Kw.A09(view2, A1Z)));
        }
    }
}
