package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6J9  reason: invalid class name */
public class AnonymousClass6J9 extends RecyclerView implements C17260vE {
    public static final int[] A05;
    public AnonymousClass0WH A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass0L7 A04 = new AnonymousClass0L7();

    public AnonymousClass6J9(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void A14(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        nestedScrollBy(i, i2);
        this.A03 = true;
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0O5) it.next()).A05(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A0y(A05, iArr2, 0, scrollX2, 0, scrollY2, i3);
    }

    public void BWv(View view, int i, int i2, int i3, int i4, int i5) {
        A14((int[]) null, i3, i4, i5);
    }

    public void Bcp(View view, int i) {
        setIsScrollEnabled(true);
        AnonymousClass0L7 r0 = this.A04;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A03 = false;
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass0O5) it.next()).A05(this, 0);
                }
            }
        }
    }

    public void A0q(AnonymousClass0O5 r2) {
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A01 = arrayList;
        }
        arrayList.add(r2);
        super.A0q(r2);
    }

    public void A0r(AnonymousClass0O5 r2) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(r2);
        }
        super.A0r(r2);
    }

    public void BWu(View view, int[] iArr, int i, int i2, int i3) {
        A13(iArr, A05, i, i2, i3);
    }

    public void BWx(View view, View view2, int i, int i2) {
        AnonymousClass0L7 r1 = this.A04;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public int getNestedScrollAxes() {
        AnonymousClass0L7 r0 = this.A04;
        return r0.A01 | r0.A00;
    }

    public int getScrollState() {
        if (this.A03) {
            return 1;
        }
        return this.A0B;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A02 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A02 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A02;
        if (z2 != z) {
            this.A02 = z;
            if (z2) {
                this.A00 = C06560Yg.A03(this);
            }
            if (this.A02) {
                C06560Yg.A0O(this, this.A00);
                this.A00 = null;
                return;
            }
            C06560Yg.A0O(this, new AnonymousClass6JB(this, this));
        }
    }

    static {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 0;
        A1Z[1] = 0;
        A05 = A1Z;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A10((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A03 = false;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean BcD(View view, View view2, int i, int i2) {
        return false;
    }

    public void BWw(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A14(iArr, i3, i4, i5);
    }
}
