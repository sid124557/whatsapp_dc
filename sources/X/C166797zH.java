package X;

import android.view.View;
import com.whatsapp.biz.BusinessHoursView;

/* renamed from: X.7zH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166797zH implements View.OnClickListener {
    public final /* synthetic */ BusinessHoursView A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(View view) {
        BusinessHoursView businessHoursView = this.A00;
        String str = this.A02;
        Integer num = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A04;
        if (!businessHoursView.A06) {
            businessHoursView.A02.A06((Integer) null, num, str, 4, z, z2);
        }
        businessHoursView.A06 = !businessHoursView.A06;
        businessHoursView.A02();
    }

    public /* synthetic */ C166797zH(BusinessHoursView businessHoursView, Integer num, String str, boolean z, boolean z2) {
        this.A00 = businessHoursView;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
        this.A04 = z2;
    }
}
