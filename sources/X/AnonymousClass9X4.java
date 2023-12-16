package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.9X4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ AnonymousClass9dP A01;
    public final /* synthetic */ AnonymousClass4DV A02;
    public final /* synthetic */ String A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9dP r0 = this.A01;
        AnonymousClass4DV r5 = this.A02;
        String str = this.A03;
        C89644eZ r3 = this.A00;
        C197419d8 r02 = r0.A02;
        r02.A0W.A03(r5, r02.A0A, 17);
        r3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public /* synthetic */ AnonymousClass9X4(C89644eZ r1, AnonymousClass9dP r2, AnonymousClass4DV r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }
}
