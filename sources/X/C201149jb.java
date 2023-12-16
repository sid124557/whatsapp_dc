package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9jb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201149jb implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C202849mg A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        Context context = this.A00;
        boolean z = this.A02;
        C202849mg r3 = this.A01;
        C19340zH A002 = AnonymousClass5V0.A00(context);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        A002.A0U(i);
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        A002.A0T(i2);
        C204219p0.A00(A002, r3, 94, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public /* synthetic */ C201149jb(Context context, C202849mg r2, boolean z) {
        this.A00 = context;
        this.A02 = z;
        this.A01 = r2;
    }
}
