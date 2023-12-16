package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whatsapp.R;

/* renamed from: X.4ab  reason: invalid class name and case insensitive filesystem */
public class C88694ab extends C159097l7 {
    public static final int[] A02;
    public boolean A00;
    public final AccessibilityManager A01;

    static {
        int[] A1a = C86664Kz.A1a(R.attr.f3nameremoved);
        A1a[1] = R.attr.f3nameremoved;
        A02 = A1a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 == -1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r8 = (android.view.ViewGroup) r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C88694ab A02(android.view.View r8, java.lang.CharSequence r9, int r10) {
        /*
            r1 = 0
        L_0x0001:
            boolean r0 = r8 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L_0x0068
            boolean r0 = r8 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0065
            int r1 = r8.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L_0x0068
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0015:
            android.view.ViewParent r8 = r8.getParent()
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L_0x0021
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L_0x0001
        L_0x0021:
            r8 = r1
        L_0x0022:
            if (r8 == 0) goto L_0x006b
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r7)
            int[] r0 = A02
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r0)
            r4 = 0
            r3 = -1
            int r2 = r5.getResourceId(r4, r3)
            r0 = 1
            int r1 = r5.getResourceId(r0, r3)
            r5.recycle()
            if (r2 == r3) goto L_0x0047
            r0 = 2131625471(0x7f0e05ff, float:1.887815E38)
            if (r1 != r3) goto L_0x004a
        L_0x0047:
            r0 = 2131624742(0x7f0e0326, float:1.8876672E38)
        L_0x004a:
            android.view.View r0 = r6.inflate(r0, r8, r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            X.4ab r1 = new X.4ab
            r1.<init>(r7, r0, r8, r0)
            X.6FH r0 = r1.A0J
            android.view.View r0 = r0.getChildAt(r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            android.widget.TextView r0 = r0.A02
            r0.setText(r9)
            r1.A00 = r10
            return r1
        L_0x0065:
            if (r8 == 0) goto L_0x0021
            goto L_0x0015
        L_0x0068:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0022
        L_0x006b:
            java.lang.String r0 = "No suitable parent found from the given view. Please provide a valid view."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88694ab.A02(android.view.View, java.lang.CharSequence, int):X.4ab");
    }

    public int A0C() {
        int i = this.A00;
        if (i == -2) {
            return -2;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.A00;
        if (i2 >= 29) {
            return this.A01.getRecommendedTimeoutMillis(i, AnonymousClass0x9.A00(z ? 1 : 0) | 1 | 2);
        } else if (!z || !this.A01.isTouchExplorationEnabled()) {
            return i;
        } else {
            return -2;
        }
    }

    public void A0D(int i) {
        ((SnackbarContentLayout) C86644Kx.A0G(this.A0J)).A01.setTextColor(i);
    }

    public void A0E(View.OnClickListener onClickListener, int i) {
        A0F(this.A0G.getText(i), onClickListener);
    }

    public void A0F(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.A0J.getChildAt(0)).A01;
        if (!TextUtils.isEmpty(charSequence)) {
            this.A00 = true;
            button.setVisibility(0);
            button.setText(charSequence);
            C109705f3.A00(button, this, onClickListener, 3);
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener((View.OnClickListener) null);
        this.A00 = false;
    }

    public C88694ab(Context context, View view, ViewGroup viewGroup, C178908iI r6) {
        super(context, view, viewGroup, r6);
        this.A01 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C88694ab A00(View view, int i, int i2) {
        return A02(view, view.getResources().getText(i), i2);
    }

    public static C88694ab A01(View view, CharSequence charSequence, int i) {
        return A02(view, charSequence, i);
    }
}
