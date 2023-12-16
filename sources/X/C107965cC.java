package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.5cC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107965cC implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass5Z5 A02;
    public final /* synthetic */ C50382i5 A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass5Z5 r4 = this.A02;
        int i2 = this.A00;
        Activity activity = this.A01;
        C50382i5 r2 = this.A03;
        r4.A03(C18290x4.A0Z(), 1, (long) i2, r4.A00.A01().getTime());
        C621433s.A00(activity, 115);
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
        A09.setData(r2.A00());
        activity.startActivity(A09);
    }

    public /* synthetic */ C107965cC(Activity activity, AnonymousClass5Z5 r2, C50382i5 r3, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = activity;
        this.A03 = r3;
    }
}
