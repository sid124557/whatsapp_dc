package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.biz.profile.TrustSignalItem;

/* renamed from: X.5ew  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109635ew implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C111095hX A01;
    public final /* synthetic */ TrustSignalItem A02;
    public final /* synthetic */ C106185Xy A03;
    public final /* synthetic */ C108915dl A04;
    public final /* synthetic */ C108775dX A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onClick(View view) {
        Uri uri = this.A00;
        C111095hX r5 = this.A01;
        TrustSignalItem trustSignalItem = this.A02;
        C108775dX r0 = this.A05;
        C106185Xy r7 = this.A03;
        String str = this.A07;
        Integer num = this.A06;
        boolean z = this.A08;
        boolean z2 = this.A09;
        C108915dl r2 = this.A04;
        Context context = trustSignalItem.getContext();
        r7.A05(num, Integer.valueOf(r0.A00), str, 15, trustSignalItem.A00, z);
        r5.A0A(context, C18310x6.A0D(uri));
        if (z2) {
            r7.A01(r2, 11);
        }
    }

    public /* synthetic */ C109635ew(Uri uri, C111095hX r2, TrustSignalItem trustSignalItem, C106185Xy r4, C108915dl r5, C108775dX r6, Integer num, String str, boolean z, boolean z2) {
        this.A00 = uri;
        this.A01 = r2;
        this.A02 = trustSignalItem;
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = str;
        this.A06 = num;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = r5;
    }
}
