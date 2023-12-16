package X;

import android.view.MenuItem;

/* renamed from: X.92p  reason: invalid class name and case insensitive filesystem */
public class C1897792p implements C15930sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C1897792p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void BOf(Object obj) {
        boolean z;
        C06270Wx r3;
        Object Ax9;
        switch (this.A04) {
            case 0:
                C90514ha r6 = (C90514ha) this.A00;
                MenuItem menuItem = (MenuItem) this.A01;
                MenuItem menuItem2 = (MenuItem) this.A02;
                MenuItem menuItem3 = (MenuItem) this.A03;
                if (!AnonymousClass001.A1Z(obj) || r6.A0x == null) {
                    z = false;
                    menuItem.setShowAsAction(1);
                    menuItem2.setShowAsAction(1);
                } else {
                    z = true;
                    menuItem.setShowAsAction(0);
                    menuItem2.setShowAsAction(0);
                }
                menuItem3.setVisible(z);
                r6.A75();
                return;
            case 1:
                r3 = (C06270Wx) this.A03;
                C183248pj r2 = (C183248pj) this.A02;
                Object A07 = ((C06270Wx) this.A00).A07();
                Object A072 = ((C06270Wx) this.A01).A07();
                if (obj != null && A07 != null && A072 != null) {
                    Ax9 = r2.Ax9(obj, A07, A072);
                    break;
                } else {
                    return;
                }
                break;
            case 2:
                r3 = (C06270Wx) this.A03;
                C183248pj r22 = (C183248pj) this.A02;
                Object A073 = ((C06270Wx) this.A00).A07();
                Object A074 = ((C06270Wx) this.A01).A07();
                if (A073 != null && obj != null && A074 != null) {
                    Ax9 = r22.Ax9(A073, obj, A074);
                    break;
                } else {
                    return;
                }
                break;
            default:
                r3 = (C06270Wx) this.A03;
                C183248pj r23 = (C183248pj) this.A02;
                Object A075 = ((C06270Wx) this.A00).A07();
                Object A076 = ((C06270Wx) this.A01).A07();
                if (A075 != null && A076 != null && obj != null) {
                    Ax9 = r23.Ax9(A075, A076, obj);
                    break;
                } else {
                    return;
                }
        }
        r3.A0H(Ax9);
    }
}
