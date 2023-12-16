package X;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: X.4Of  reason: invalid class name and case insensitive filesystem */
public class C87154Of extends BaseAdapter {
    public static final int A03 = ((C86664Kz.A1O().getMaximum(5) + C86664Kz.A1O().getMaximum(7)) - 1);
    public static final int A04 = C86664Kz.A1O().getMaximum(4);
    public C102775Kf A00;
    public final C108625dI A01;
    public final C117045rI A02;

    public int A00() {
        C117045rI r4 = this.A02;
        int i = this.A01.A01;
        Calendar calendar = r4.A06;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + r4.A02;
        }
        return i3;
    }

    public int getCount() {
        return A03;
    }

    public long getItemId(int i) {
        return (long) (i / this.A02.A02);
    }

    public boolean hasStableIds() {
        return true;
    }

    public C87154Of(C108625dI r2, C117045rI r3) {
        this.A02 = r3;
        this.A01 = r2;
        throw AnonymousClass001.A0g("getSelectedDays");
    }

    /* renamed from: A01 */
    public Long getItem(int i) {
        if (i < A00()) {
            return null;
        }
        int A002 = A00();
        C117045rI r1 = this.A02;
        if (i > (A002 + r1.A01) - 1) {
            return null;
        }
        Calendar A012 = C161097oz.A01(r1.A06);
        A012.set(5, (i - A00()) + 1);
        return Long.valueOf(A012.getTimeInMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r1 = r10.getContext()
            X.5Kf r0 = r7.A00
            if (r0 != 0) goto L_0x000f
            X.5Kf r0 = new X.5Kf
            r0.<init>(r1)
            r7.A00 = r0
        L_0x000f:
            r5 = r9
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 0
            if (r9 != 0) goto L_0x0022
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131625460(0x7f0e05f4, float:1.8878129E38)
            android.view.View r5 = r1.inflate(r0, r10, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x0022:
            int r0 = r7.A00()
            int r2 = r8 - r0
            if (r2 < 0) goto L_0x0057
            X.5rI r1 = r7.A02
            int r0 = r1.A01
            if (r2 >= r0) goto L_0x0057
            r4 = 1
            int r3 = r2 + 1
            r5.setTag(r1)
            android.content.res.Configuration r0 = X.C86634Kw.A0E(r5)
            java.util.Locale r2 = r0.locale
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r1, r3, r6)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r5.setText(r0)
            r5.setVisibility(r6)
            r5.setEnabled(r4)
        L_0x0050:
            java.lang.Long r0 = r7.getItem(r8)
            if (r0 != 0) goto L_0x0060
            return r5
        L_0x0057:
            r0 = 8
            r5.setVisibility(r0)
            r5.setEnabled(r6)
            goto L_0x0050
        L_0x0060:
            r5.getContext()
            java.util.Calendar r0 = X.C161097oz.A00()
            r0.getTimeInMillis()
            java.lang.String r0 = "getSelectedRanges"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87154Of.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
