package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.54f  reason: invalid class name and case insensitive filesystem */
public class C990454f extends AnonymousClass5ZM {
    public final long A00;
    public final C56762sW A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.d("FetchCallLogByRowIdTask/doInBackground ");
        return this.A01.A01(this.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3ZF r2 = (AnonymousClass3ZF) obj;
        C1224164h r0 = (C1224164h) this.A02.get();
        if (r0 != null) {
            r0.BO4(r2);
        }
    }

    public C990454f(C1224164h r2, C56762sW r3, long j) {
        this.A01 = r3;
        this.A02 = AnonymousClass0x9.A14(r2);
        this.A00 = j;
    }
}
