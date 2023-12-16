package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.5oG  reason: invalid class name and case insensitive filesystem */
public final class C115185oG implements C1229366k {
    public final Context A00;

    public final void A00() {
        Context context = this.A00;
        Intent A02 = C627736r.A02(context);
        A02.setFlags(67108864);
        context.startActivity(A02);
    }

    public void BXB() {
        Log.d("Disclosure Not Eligible");
        A00();
    }

    public void BZv(AnonymousClass58O r2) {
        Log.d("Disclosure Rendering Failed");
        A00();
    }

    public void Bf5() {
        Log.d("Disclosure Acknowledged");
        A00();
    }

    public void Bf6() {
        Log.d("Disclosure Approved");
        A00();
    }

    public void Bf7() {
        Log.d("Disclosure Denied");
        A00();
    }

    public void Bf9() {
        Log.d("Disclosure Dismissed");
        A00();
    }

    public C115185oG(Context context) {
        this.A00 = context;
    }
}
