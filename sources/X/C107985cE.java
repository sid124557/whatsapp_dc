package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.5cE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107985cE implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5SZ A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass5SZ r1 = this.A01;
        String str = this.A03;
        Context context = this.A00;
        Runnable runnable = this.A02;
        r1.A01.A0A(context, str, (String) null, (AnonymousClass4GP) null, 1, false, false);
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C107985cE(Context context, AnonymousClass5SZ r2, Runnable runnable, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = context;
        this.A02 = runnable;
    }
}
