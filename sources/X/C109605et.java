package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.5et  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109605et implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ C69263Wi A03;
    public final /* synthetic */ AnonymousClass1VX A04;
    public final /* synthetic */ C105055Tk A05;
    public final /* synthetic */ AnonymousClass4GP A06;

    public final void onClick(View view) {
        AnonymousClass1VX r4 = this.A04;
        C69263Wi r3 = this.A03;
        Activity activity = this.A02;
        C105055Tk r5 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass4GP r1 = this.A06;
        new C627736r();
        C100245Ad.A00(activity, r3, r4, r5, i, i2);
        if (r1 != null) {
            r1.invoke();
        }
    }

    public /* synthetic */ C109605et(Activity activity, C69263Wi r2, AnonymousClass1VX r3, C105055Tk r4, AnonymousClass4GP r5, int i, int i2) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = activity;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r5;
    }
}
