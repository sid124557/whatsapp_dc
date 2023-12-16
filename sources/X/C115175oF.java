package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5oF  reason: invalid class name and case insensitive filesystem */
public final class C115175oF implements C1229366k {
    public final WeakReference A00;
    public final AnonymousClass4GP A01;
    public final AnonymousClass4GP A02;
    public final AnonymousClass4GP A03;
    public final AnonymousClass4GQ A04;

    public void BXB() {
        Log.d("Disclosure Not Eligible");
        AnonymousClass4GP r0 = this.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void BZv(AnonymousClass58O r3) {
        Log.d("Disclosure Rendering Failed");
        AnonymousClass4GP r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
        C89654ea A0F = C18320x8.A0F(this.A00);
        if (A0F != null) {
            A0F.Bot(R.string.f11nameremoved);
        }
    }

    public void Bf5() {
        Log.d("Disclosure Acknowledged");
        this.A04.invoke(Boolean.TRUE);
    }

    public void Bf6() {
        Log.d("Disclosure Approved");
        this.A04.invoke(Boolean.TRUE);
    }

    public void Bf7() {
        AnonymousClass4GP r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
        }
        Log.d("Disclosure Denied");
    }

    public void Bf9() {
        Log.d("Disclosure Dismissed");
    }

    public C115175oF(C89654ea r2, AnonymousClass4GP r3, AnonymousClass4GP r4, AnonymousClass4GP r5, AnonymousClass4GQ r6) {
        C18260x0.A0Q(r2, r6);
        this.A04 = r6;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
