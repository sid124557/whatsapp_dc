package X;

import android.os.Handler;
import com.whatsapp.R;
import java.util.AbstractMap;

/* renamed from: X.7id  reason: invalid class name and case insensitive filesystem */
public class C157637id {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = AnonymousClass000.A0A();
    public final AnonymousClass0ME A04;
    public final Runnable A05;
    public final boolean A06;

    public void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        AnonymousClass0ME r1 = this.A04;
        C153427bI r2 = (C153427bI) r1.A03.get();
        if (r2 != null) {
            ((AbstractMap) r2.A02(R.id.bk_context_key_timers)).remove(r1.A02);
        }
    }

    public C157637id(AnonymousClass0ME r3, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A00 = false;
        this.A01 = true;
        this.A04 = r3;
        this.A05 = new C172668Mf(this, 48);
    }
}
