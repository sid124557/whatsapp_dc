package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.5gw  reason: invalid class name and case insensitive filesystem */
public class C110735gw implements C16960uJ {
    public int A00 = -1;
    public final AnonymousClass0R6 A01;
    public final /* synthetic */ AnonymousClass4XH A02;

    public C110735gw(AnonymousClass0R6 r2, AnonymousClass4XH r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BOg(Object obj, int i, int i2) {
        this.A01.A01.A04(obj, i, i2);
    }

    public void BUd(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 >= i) {
            this.A00 = i;
            if (i == 0) {
                SearchViewModel searchViewModel = this.A02.A10;
                AnonymousClass08M r1 = searchViewModel.A0d;
                if (r1.A07() == null || C86604Kt.A05(r1) == 0) {
                    C06270Wx.A03(searchViewModel.A1D, 0);
                }
            }
        }
        this.A01.A01.A02(i, i2);
    }

    public void BWn(int i, int i2) {
        this.A01.A01.A01(i, i2);
    }

    public void BZo(int i, int i2) {
        this.A01.A01.A03(i, i2);
    }
}
