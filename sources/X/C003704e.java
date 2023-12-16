package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.04e  reason: invalid class name and case insensitive filesystem */
public class C003704e extends C07540bC implements C17080uX {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = AnonymousClass001.A0N();
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C003704e(Context context, AttributeSet attributeSet, AppCompatSpinner appCompatSpinner, int i) {
        super(context, attributeSet, i, 0);
        this.A04 = appCompatSpinner;
        this.A07 = appCompatSpinner;
        this.A0G = true;
        this.A0B.setFocusable(true);
        this.A08 = new C17830wJ(this, 1, appCompatSpinner);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r9 = this;
            android.widget.PopupWindow r2 = r9.A0B
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            androidx.appcompat.widget.AppCompatSpinner r5 = r9.A04
            android.graphics.Rect r6 = r5.A05
            if (r0 == 0) goto L_0x0077
            r0.getPadding(r6)
            int r1 = X.AnonymousClass0YH.A01(r5)
            r0 = 1
            if (r1 != r0) goto L_0x0073
            int r3 = r6.right
        L_0x0018:
            int r8 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r7 = r5.getWidth()
            int r1 = r5.A00
            r0 = -2
            if (r1 != r0) goto L_0x0068
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int r2 = r5.A00(r0, r1)
            android.content.Context r0 = r5.getContext()
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r1 = r0.widthPixels
            int r0 = r6.left
            int r1 = r1 - r0
            int r0 = r6.right
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0048
            r2 = r1
        L_0x0048:
            int r0 = r7 - r8
            int r0 = X.AnonymousClass001.A0C(r0, r4, r2)
        L_0x004e:
            r9.A02(r0)
        L_0x0051:
            int r1 = X.AnonymousClass0YH.A01(r5)
            r0 = 1
            if (r1 != r0) goto L_0x0063
            int r7 = r7 - r4
            int r0 = r9.A03
            int r7 = r7 - r0
            int r0 = r9.A00
            int r7 = r7 - r0
            int r3 = r3 + r7
        L_0x0060:
            r9.A01 = r3
            return
        L_0x0063:
            int r0 = r9.A00
            int r8 = r8 + r0
            int r3 = r3 + r8
            goto L_0x0060
        L_0x0068:
            r0 = -1
            if (r1 != r0) goto L_0x006f
            int r0 = r7 - r8
            int r0 = r0 - r4
            goto L_0x004e
        L_0x006f:
            r9.A02(r1)
            goto L_0x0051
        L_0x0073:
            int r0 = r6.left
            int r3 = -r0
            goto L_0x0018
        L_0x0077:
            r0 = 0
            r6.right = r0
            r6.left = r0
            r3 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003704e.A03():void");
    }

    public CharSequence B87() {
        return this.A02;
    }

    public void Boe(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A0B;
        boolean isShowing = popupWindow.isShowing();
        A03();
        popupWindow.setInputMethodMode(2);
        super.Bod();
        C002803e r1 = this.A0C;
        r1.setChoiceMode(1);
        r1.setTextDirection(i);
        r1.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C002803e r12 = this.A0C;
        if (popupWindow.isShowing() && r12 != null) {
            r12.A0B = false;
            r12.setSelection(selectedItemPosition);
            if (r12.getChoiceMode() != 0) {
                r12.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            C18180ws r13 = new C18180ws(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(r13);
            popupWindow.setOnDismissListener(new C07400ao(r13, this));
        }
    }

    public void Ble(ListAdapter listAdapter) {
        super.Ble(listAdapter);
        this.A01 = listAdapter;
    }

    public void BmO(int i) {
        this.A00 = i;
    }

    public void Bn7(CharSequence charSequence) {
        this.A02 = charSequence;
    }
}
