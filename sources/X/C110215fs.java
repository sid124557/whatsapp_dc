package X;

import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: X.5fs  reason: invalid class name and case insensitive filesystem */
public class C110215fs implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public final /* synthetic */ C93544ok A02;

    public C110215fs(C93544ok r1) {
        this.A02 = r1;
    }

    public final void A00(int i, int i2) {
        C624134x B8h;
        C93544ok r4 = this.A02;
        int count = r4.A05.getCount();
        while (i <= i2) {
            ListView listView = r4.getListView();
            C626936e.A04(listView);
            int headerViewsCount = i - listView.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (B8h = r4.A05.B8h(headerViewsCount)) != null && B8h.A1I == 13) {
                r4.A00.A0K.A02(B8h.A1J);
            }
            i++;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        if (!(i2 == 0 || (i4 = this.A01) == 0)) {
            int i5 = i + i2;
            int i6 = this.A00;
            int i7 = i4 + i6;
            if (i6 < i) {
                A00(i6, i - 1);
            } else if (i5 < i7) {
                A00(i5 + 1, i7);
            }
        }
        this.A00 = i;
        this.A01 = i2;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
