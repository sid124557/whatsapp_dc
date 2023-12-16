package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.68n  reason: invalid class name and case insensitive filesystem */
public class C1234668n implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1234668n(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A00 = i;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C89864fP r6 = (C89864fP) this.A01;
            AnonymousClass3ZH r5 = (AnonymousClass3ZH) this.A02;
            int i2 = this.A00;
            C56962sq r3 = r6.A0F;
            C009707r r2 = r6.A03;
            C626936e.A06(r5);
            r3.A0F(r2, r5, "chat", false);
            C621433s.A00(r2, i2);
            AnonymousClass3LP r1 = r6.A0h;
            AnonymousClass4FS r4 = r6.A0x;
            AnonymousClass31G.A01(r6.A0X, r1, r6.A0i, AnonymousClass3ZH.A01(r5), r4, C18290x4.A0b(), (Integer) null, 2);
            return;
        }
        AnonymousClass5Z5 r22 = (AnonymousClass5Z5) this.A01;
        r22.A03(1, 1, (long) this.A00, r22.A00.A01().getTime());
        C621433s.A00((Activity) this.A02, 115);
    }
}
