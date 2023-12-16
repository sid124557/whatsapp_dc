package X;

import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.5ev  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109625ev implements View.OnClickListener {
    public final /* synthetic */ BusinessProfileFieldView A00;
    public final /* synthetic */ C106185Xy A01;
    public final /* synthetic */ C108915dl A02;
    public final /* synthetic */ C28071fd A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onClick(View view) {
        C106185Xy r4 = this.A01;
        String str = this.A05;
        Integer num = this.A04;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        C108915dl r2 = this.A02;
        C28071fd r11 = this.A03;
        BusinessProfileFieldView businessProfileFieldView = this.A00;
        String str2 = this.A06;
        r4.A06((Integer) null, num, str, 3, z, z2);
        if (z3) {
            r4.A01(r2, 8);
        }
        r11.A08(businessProfileFieldView.getContext(), (String) null, str2, 0.0d, 0.0d);
    }

    public /* synthetic */ C109625ev(BusinessProfileFieldView businessProfileFieldView, C106185Xy r2, C108915dl r3, C28071fd r4, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A05 = str;
        this.A04 = num;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = businessProfileFieldView;
        this.A06 = str2;
    }
}
