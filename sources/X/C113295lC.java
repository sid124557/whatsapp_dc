package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.5lC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C113295lC implements C182328oE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C113035km A01;
    public final /* synthetic */ C624134x A02;

    public final void BUt(C108785dY r6) {
        Context context = this.A00;
        C113035km r0 = this.A01;
        C624134x r4 = this.A02;
        AnonymousClass67A A012 = AnonymousClass31N.A01(context);
        if (r6 == null || A012 == null) {
            Log.e("OpenSelectListAction/perform/error: not click in Conversation");
        } else {
            r0.A00.A0T(new C70333aK(A012, r6, r4, 28), 400);
        }
    }

    public /* synthetic */ C113295lC(Context context, C113035km r2, C624134x r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }
}
