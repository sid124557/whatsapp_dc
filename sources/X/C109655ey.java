package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.5ey  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109655ey implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C111095hX A01;
    public final /* synthetic */ BusinessProfileFieldView A02;
    public final /* synthetic */ C106185Xy A03;
    public final /* synthetic */ C108915dl A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void onClick(View view) {
        C106185Xy r6 = this.A03;
        String str = this.A06;
        boolean z = this.A07;
        Integer num = this.A05;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        boolean z4 = this.A0A;
        C108915dl r4 = this.A04;
        C111095hX r3 = this.A01;
        BusinessProfileFieldView businessProfileFieldView = this.A02;
        Uri uri = this.A00;
        r6.A06(Integer.valueOf(C18280x3.A00(z ? 1 : 0)), num, str, 2, z2, z3);
        if (z4) {
            r6.A01(r4, 10);
        }
        r3.A0A(businessProfileFieldView.getContext(), C18310x6.A0D(uri));
    }

    public /* synthetic */ C109655ey(Uri uri, C111095hX r2, BusinessProfileFieldView businessProfileFieldView, C106185Xy r4, C108915dl r5, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = r4;
        this.A06 = str;
        this.A07 = z;
        this.A05 = num;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = businessProfileFieldView;
        this.A00 = uri;
    }
}
