package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaViewPager;

/* renamed from: X.6JF  reason: invalid class name */
public class AnonymousClass6JF extends AnonymousClass0R4 {
    public final AnonymousClass0R4 A00;
    public final C620733j A01;

    public float A01(int i) {
        AnonymousClass0R4 r2 = this.A00;
        return r2.A01(WaViewPager.A00(this.A01, i, r2.A0C()));
    }

    public int A02(Object obj) {
        AnonymousClass0R4 r3 = this.A00;
        int A02 = r3.A02(obj);
        if (A02 == -2 || A02 == -1) {
            return A02;
        }
        return WaViewPager.A00(this.A01, A02, r3.A0C());
    }

    public CharSequence A04(int i) {
        AnonymousClass0R4 r2 = this.A00;
        return r2.A04(WaViewPager.A00(this.A01, i, r2.A0C()));
    }

    public void A09(ViewGroup viewGroup) {
        this.A00.A09(viewGroup);
    }

    public void A0B(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass0R4 r2 = this.A00;
        r2.A0B(viewGroup, obj, WaViewPager.A00(this.A01, i, r2.A0C()));
    }

    public int A0C() {
        return this.A00.A0C();
    }

    public Object A0D(ViewGroup viewGroup, int i) {
        AnonymousClass0R4 r2 = this.A00;
        return r2.A0D(viewGroup, WaViewPager.A00(this.A01, i, r2.A0C()));
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass0R4 r2 = this.A00;
        int A0C = r2.A0C();
        if (i == A0C) {
            A0C++;
        }
        r2.A0E(viewGroup, obj, WaViewPager.A00(this.A01, i, A0C));
    }

    public boolean A0F(View view, Object obj) {
        return this.A00.A0F(view, obj);
    }

    public AnonymousClass6JF(AnonymousClass0R4 r2, C620733j r3) {
        this.A01 = r3;
        this.A00 = r2;
        r2.A06(new AnonymousClass6Cm(this));
    }
}
