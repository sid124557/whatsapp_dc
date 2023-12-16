package X;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.378  reason: invalid class name */
public final /* synthetic */ class AnonymousClass378 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ AnonymousClass5WY A01;
    public final /* synthetic */ C53202mi A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C89654ea r6 = this.A00;
        Runnable runnable = this.A03;
        AnonymousClass5WY r5 = this.A01;
        C53202mi r1 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        C621433s.A00(r6, 124);
        if (runnable != null) {
            runnable.run();
        }
        r6.startActivity(r5.A00(r6, (Bundle) null, (C631938h) null, (Integer) null, AnonymousClass000.A0U("blocked +", str, str2, AnonymousClass001.A0o()), (String) null, (ArrayList) null, (ArrayList) null, r1.A00()));
    }

    public /* synthetic */ AnonymousClass378(C89654ea r1, AnonymousClass5WY r2, C53202mi r3, Runnable runnable, String str, String str2) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A05 = str2;
    }
}
