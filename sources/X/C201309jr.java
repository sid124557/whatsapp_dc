package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.9jr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201309jr implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C196249aX A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void run() {
        C196249aX r7 = this.A01;
        Activity activity = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        Intent A0I = C627736r.A0I(activity.getApplicationContext(), ((C89654ea) activity).A6D(), (Parcelable) null, false);
        A0I.putExtra("extra_custom_bloks_use_case", str);
        A0I.putExtra("extra_custom_bloks_param", str2);
        ((C69263Wi) r7.A0Q.get()).A0S(new C200789it(activity, A0I));
    }

    public /* synthetic */ C201309jr(Activity activity, C196249aX r2, String str, String str2) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = str;
        this.A03 = str2;
    }
}
