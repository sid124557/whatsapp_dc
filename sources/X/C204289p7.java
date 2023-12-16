package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9p7  reason: invalid class name and case insensitive filesystem */
public class C204289p7 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204289p7(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) this.A02);
            ((C105655Vw) this.A00).A00.A0A((Context) this.A01, intent);
            return;
        }
        AnonymousClass39M r2 = (AnonymousClass39M) this.A01;
        Integer num = (Integer) this.A02;
        C196409an r0 = ((PaymentView) this.A00).A0z;
        if (r0 != null) {
            r0.A00(r2, num);
        }
    }
}
