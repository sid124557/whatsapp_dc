package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.8Ct  reason: invalid class name and case insensitive filesystem */
public class C170328Ct implements C181428mk {
    public SwipeRefreshLayout A00;
    public boolean A01;

    public boolean Blj(C153427bI r3, Object obj, int i) {
        if (i != 38) {
            return false;
        }
        boolean A02 = C159427lo.A02(obj);
        this.A01 = A02;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout == null) {
            return true;
        }
        swipeRefreshLayout.setRefreshing(A02);
        return true;
    }

    public C170328Ct(boolean z) {
        this.A01 = z;
    }
}
