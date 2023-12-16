package X;

import android.os.SystemClock;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.1ti  reason: invalid class name and case insensitive filesystem */
public class C33801ti extends AnonymousClass5ZM {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C621033m A01;
    public final C95814uZ A02;
    public final WeakReference A03;
    public final boolean A04;

    public C33801ti(C89654ea r3, C621033m r4, C95814uZ r5, boolean z) {
        super(r3, true);
        this.A03 = AnonymousClass0x9.A14(r3);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        this.A01.A0K(this.A02, this.A04);
        C89654ea.A4P(this.A00, 300);
        return null;
    }

    public void A0A() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            C18320x8.A0F(weakReference).Bp9(R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null) {
            A0F.BjL();
            A0F.A6T(C627736r.A00(A0F.getApplicationContext()), false);
        }
    }
}
