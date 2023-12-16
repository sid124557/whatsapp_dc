package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.1v5  reason: invalid class name and case insensitive filesystem */
public final class C34391v5 extends AnonymousClass9HZ {
    public AnonymousClass49I A00;

    public void A02(AnonymousClass49G r4) {
        C162457s7.A0J(r4, 0);
        super.A02(r4);
        C43432Sc r2 = new C43432Sc(r4.B3p().A0K(40));
        this.A00 = null;
        if (r2.A00 != null) {
            this.A00 = new C86034Io(r2, 30);
        }
        String A0O = r4.B3p().A0O(36);
        this.A01 = A0O;
        if (C107575bX.A0F(A0O)) {
            this.A01 = r2.A05;
        }
        C18310x6.A1E(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C162457s7.A0J(activity, 0);
        super.onActivityCreated(activity, bundle);
        AnonymousClass34K.A03(activity, this);
    }

    public void A00() {
        if (this.A00 != null) {
            AnonymousClass8DJ.A0B(this.A03.BEP(), this.A00);
        }
    }

    public boolean A03() {
        return AnonymousClass000.A1W(this.A00);
    }

    public void A01(Intent intent, Bundle bundle) {
        super.A01(intent, bundle);
        C18310x6.A1E(this);
    }

    public C34391v5(C620733j r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }
}
