package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Ge  reason: invalid class name */
public class AnonymousClass6Ge extends C04810Qt {
    public int A00 = -1;
    public int A01;
    public final ViewGroup A02;
    public final List A03 = AnonymousClass001.A0s();
    public final /* synthetic */ VerticalSwipeDismissBehavior A04;

    public void A06(View view, float f, float f2) {
        int i;
        boolean z;
        C185708u7 r0;
        this.A00 = -1;
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        int i2 = this.A01;
        if (Math.abs(f2) > ((float) (view.getHeight() * 2)) || Math.abs(view.getTop() - i2) >= AnonymousClass001.A07(C86664Kz.A02(view), 0.2f)) {
            int top = view.getTop();
            int i3 = this.A01;
            int height = view.getHeight();
            if (top < i3) {
                i = i3 - height;
            } else {
                i = i3 + height;
            }
            z = true;
        } else {
            i = this.A01;
            z = false;
        }
        if (!verticalSwipeDismissBehavior.A07) {
            if (!verticalSwipeDismissBehavior.A04.A0C(view.getLeft(), i)) {
                if (!z || (r0 = verticalSwipeDismissBehavior.A05) == null) {
                    return;
                }
            }
            AnonymousClass0YY.A07(view, new C117665sI(verticalSwipeDismissBehavior, view, 30, z));
            return;
        } else if (!z || (r0 = verticalSwipeDismissBehavior.A05) == null) {
            if (!verticalSwipeDismissBehavior.A04.A0C(view.getLeft(), i)) {
                return;
            }
            AnonymousClass0YY.A07(view, new C117665sI(verticalSwipeDismissBehavior, view, 30, z));
            return;
        }
        r0.BRJ(view);
    }

    public AnonymousClass6Ge(ViewGroup viewGroup, VerticalSwipeDismissBehavior verticalSwipeDismissBehavior) {
        this.A04 = verticalSwipeDismissBehavior;
        this.A02 = viewGroup;
    }

    public int A00(int i) {
        ViewGroup viewGroup = this.A02;
        int childCount = viewGroup.getChildCount();
        List list = this.A03;
        if (list.size() != childCount) {
            list.clear();
            ArrayList A0I = AnonymousClass002.A0I(childCount);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.A04.A05.BHS(viewGroup.getChildAt(i2))) {
                    C18270x1.A1K(A0I, i2);
                } else {
                    C86634Kw.A1V(list, i2);
                }
            }
            list.addAll(A0I);
        }
        return AnonymousClass000.A09(list, i);
    }

    public int A04(View view, int i, int i2) {
        return AnonymousClass6C9.A0B(this.A01 - view.getWidth(), i, this.A01 + view.getWidth());
    }

    public void A05(int i) {
        C185708u7 r0 = this.A04.A05;
        if (r0 != null) {
            r0.BRe(i);
        }
    }

    public void A07(View view, int i) {
        if (this.A00 == -1) {
            this.A00 = i;
            this.A01 = view.getTop();
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (AnonymousClass001.A0W(viewGroup.getChildAt(i2)).A0A != this.A04) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        C185708u7 r3 = this.A04.A05;
        if (r3 != null) {
            r3.Bbl(view, Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / C86664Kz.A02(view)));
        }
    }

    public boolean A09(View view, int i) {
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        if (verticalSwipeDismissBehavior.A0B || !verticalSwipeDismissBehavior.A05.BHS(view)) {
            return false;
        }
        return true;
    }

    public int A02(View view) {
        return view.getHeight();
    }

    public int A03(View view, int i, int i2) {
        return view.getLeft();
    }
}
