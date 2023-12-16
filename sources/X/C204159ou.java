package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.9ou  reason: invalid class name and case insensitive filesystem */
public class C204159ou implements DialogInterface.OnClickListener {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204159ou(Object obj, Object obj2, int i, long j) {
        this.A03 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C197419d8 r5 = (C197419d8) this.A01;
            long j = this.A00;
            Intent A1N = new C627736r().A1N(r5.A01, (C95814uZ) this.A02);
            A1N.putExtra("extra_quoted_message_row_id", j);
            r5.A01.startActivity(A1N);
            return;
        }
        Context context = (Context) this.A01;
        long j2 = this.A00;
        Intent A1N2 = new C627736r().A1N(context, (C95814uZ) this.A02);
        A1N2.putExtra("extra_quoted_message_row_id", j2);
        context.startActivity(A1N2);
    }
}
