package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9hY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199959hY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C194479Ta A01;

    public final void run() {
        String string;
        String str;
        C194479Ta r5 = this.A01;
        int i = this.A00;
        if (C1899693i.A0x(r5.A05)) {
            Context context = r5.A00.A00;
            String string2 = context.getString(R.string.f11nameremoved);
            if (i == 37) {
                string = context.getString(R.string.f11nameremoved);
                str = "DOC_VERIF_SUCCESS";
            } else {
                string = context.getString(R.string.f11nameremoved);
                str = "DOC_VERIF_FAILURE";
            }
            r5.A03(string2, string, str, (String) null);
        }
    }

    public /* synthetic */ C199959hY(C194479Ta r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
