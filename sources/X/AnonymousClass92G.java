package X;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;

/* renamed from: X.92G  reason: invalid class name */
public class AnonymousClass92G implements C181208mN {
    public Object A00;
    public final int A01;

    public AnonymousClass92G(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass0XY BMY(View view, AnonymousClass0XY r8, C156617gv r9) {
        boolean A0B;
        boolean A0B2;
        if (this.A01 != 0) {
            NavigationRailView navigationRailView = (NavigationRailView) this.A00;
            Boolean bool = navigationRailView.A02;
            if (bool != null) {
                A0B = bool.booleanValue();
            } else {
                A0B = AnonymousClass0YY.A0B(navigationRailView);
            }
            if (A0B) {
                r9.A03 += r8.A00.A0C(7).A03;
            }
            Boolean bool2 = navigationRailView.A01;
            if (bool2 != null) {
                A0B2 = bool2.booleanValue();
            } else {
                A0B2 = AnonymousClass0YY.A0B(navigationRailView);
            }
            if (A0B2) {
                r9.A00 += r8.A00.A0C(7).A00;
            }
            boolean A08 = AnonymousClass0YH.A08(view);
            int A03 = r8.A03();
            int A04 = r8.A04();
            int i = r9.A02;
            if (A08) {
                A03 = A04;
            }
            int i2 = i + A03;
            r9.A02 = i2;
            AnonymousClass0YH.A07(view, i2, r9.A03, r9.A01, r9.A00);
            return r8;
        }
        r9.A00 += r8.A02();
        boolean A082 = AnonymousClass0YH.A08(view);
        int A032 = r8.A03();
        int A042 = r8.A04();
        int i3 = r9.A02;
        int i4 = A032;
        if (A082) {
            i4 = A042;
        }
        int i5 = i3 + i4;
        r9.A02 = i5;
        int i6 = r9.A01;
        if (!A082) {
            A032 = A042;
        }
        int i7 = i6 + A032;
        r9.A01 = i7;
        AnonymousClass0YH.A07(view, i5, r9.A03, i7, r9.A00);
        return r8;
    }
}
