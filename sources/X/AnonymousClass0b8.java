package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0b8  reason: invalid class name */
public class AnonymousClass0b8 implements C17050uU {
    public C07890cz A00;
    public C07910d1 A01;
    public final /* synthetic */ Toolbar A02;

    public AnonymousClass0b8(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    public boolean Az7(C07890cz r6, C07910d1 r7) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A0G;
        if (view instanceof C16450tQ) {
            ((C16450tQ) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A0G);
        toolbar.removeView(toolbar.A0H);
        toolbar.A0G = null;
        ArrayList arrayList = toolbar.A0b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView(AnonymousClass001.A0S(arrayList, size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                r7.A0N = false;
                r7.A0E.A0F(false);
                return true;
            }
        }
    }

    public boolean B2v(C07890cz r6, C07910d1 r7) {
        Toolbar toolbar = this.A02;
        toolbar.A06();
        ViewParent parent = toolbar.A0H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A0H);
            }
            toolbar.addView(toolbar.A0H);
        }
        View actionView = r7.getActionView();
        toolbar.A0G = actionView;
        this.A01 = r7;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A0G);
            }
            C001802d r2 = new C001802d();
            r2.A00 = (toolbar.A00 & 112) | 8388611;
            r2.A00 = 2;
            toolbar.A0G.setLayoutParams(r2);
            toolbar.addView(toolbar.A0G);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((C001802d) childAt.getLayoutParams()).A00 == 2 || childAt == toolbar.A0O)) {
                toolbar.removeViewAt(childCount);
                toolbar.A0b.add(childAt);
            }
        }
        toolbar.requestLayout();
        r7.A0N = true;
        C07890cz.A00(r7);
        View view = toolbar.A0G;
        if (view instanceof C16450tQ) {
            ((C16450tQ) view).onActionViewExpanded();
        }
        return true;
    }

    public boolean B3N() {
        return false;
    }

    public void BG6(Context context, C07890cz r4) {
        C07910d1 r0;
        C07890cz r1 = this.A00;
        if (!(r1 == null || (r0 = this.A01) == null)) {
            r1.A0M(r0);
        }
        this.A00 = r4;
    }

    public Parcelable Baj() {
        return null;
    }

    public void Brl(boolean z) {
        C07910d1 r4 = this.A01;
        if (r4 != null) {
            C07890cz r3 = this.A00;
            if (r3 != null) {
                int size = r3.size();
                int i = 0;
                while (i < size) {
                    if (r3.getItem(i) != r4) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            Az7(r3, r4);
        }
    }

    public int getId() {
        return 0;
    }

    public void BPH(C07890cz r1, boolean z) {
    }

    public void BaE(Parcelable parcelable) {
    }

    public boolean Bcv(AnonymousClass04J r2) {
        return false;
    }

    public void Bls(C16470tS r1) {
    }
}
