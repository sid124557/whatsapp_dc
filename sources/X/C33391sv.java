package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1sv  reason: invalid class name and case insensitive filesystem */
public class C33391sv extends AnonymousClass5ZM {
    public final AnonymousClass5IP A00;
    public final C56762sW A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C53312mt A04;
        Log.d("FetchCallLogByCallIdForJoinableCallTask/doInBackground ");
        AnonymousClass5IP r1 = this.A00;
        String str = ((String[]) objArr)[0];
        long j = -1;
        if (!(str == null || (A04 = r1.A02.A04(C627436k.A08(str))) == null)) {
            j = A04.A00;
        }
        AnonymousClass3ZF A012 = this.A01.A01(j);
        if (C18320x8.A1T(this)) {
            return null;
        }
        return A012;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3ZF r2 = (AnonymousClass3ZF) obj;
        AnonymousClass49Q r0 = (AnonymousClass49Q) this.A02.get();
        if (r0 != null) {
            r0.BO4(r2);
        }
    }

    public C33391sv(AnonymousClass49Q r2, AnonymousClass5IP r3, C56762sW r4) {
        this.A02 = AnonymousClass0x9.A14(r2);
        this.A01 = r4;
        this.A00 = r3;
    }
}
