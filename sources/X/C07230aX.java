package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0aX  reason: invalid class name and case insensitive filesystem */
public class C07230aX implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    public C07230aX(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float f2 = 100.0f * AnonymousClass000.A0B(view.getContext()).density;
        if (f2 >= 0.0f) {
            f = f2 + 0.5f;
        } else {
            f = f2 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static int A00(View view) {
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            return point.y - view.getRootWindowInsets().getStableInsetBottom();
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    public void onGlobalLayout() {
        int i;
        Rect A0N = AnonymousClass001.A0N();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(A0N);
        if (Build.VERSION.SDK_INT >= 23) {
            i = A00(view);
        } else {
            Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - A0N.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<AnonymousClass0Pi> list = this.A03;
                synchronized (list) {
                    for (AnonymousClass0Pi r0 : list) {
                        if (r0 != null) {
                            r0.A02(i2);
                        }
                    }
                }
            }
        } else if (i2 > i3) {
            List<AnonymousClass0Pi> list2 = this.A03;
            synchronized (list2) {
                for (AnonymousClass0Pi r02 : list2) {
                    if (r02 != null) {
                        r02.A01(i2);
                    }
                }
            }
        } else if (i2 < i3) {
            this.A00 = false;
            List<AnonymousClass0Pi> list3 = this.A03;
            synchronized (list3) {
                for (AnonymousClass0Pi r03 : list3) {
                    if (r03 != null) {
                        r03.A00();
                    }
                }
            }
        }
    }
}
