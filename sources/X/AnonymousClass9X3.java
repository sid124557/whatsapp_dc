package X;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.9X3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass9DA A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9DA r5 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        dialogInterface.dismiss();
        AnonymousClass4FS r1 = r5.A04;
        AnonymousClass9H2 r0 = r5.A0T;
        if (r0 != null && r0.A06() == 1) {
            r5.A0T.A0D(false);
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("com.whatsapp.support.DescribeProblemActivity.from", str);
        C56492s4 r8 = r5.A05;
        AnonymousClass9H2 r3 = new AnonymousClass9H2(A08, r5, r5.A04, r5.A06, r8, r5.A00, (C166587yw) null, (C624034w) null, r5.A0D, r5.A0N, str);
        r5.A0T = r3;
        C18270x1.A0w(r3, r1);
        r5.A0S.BKB(AnonymousClass001.A0f(), 26, str2, (String) null);
    }

    public /* synthetic */ AnonymousClass9X3(AnonymousClass9DA r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
