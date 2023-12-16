package X;

import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.lifecycle.CoroutineLiveData;
import java.util.concurrent.CancellationException;

/* renamed from: X.0XN  reason: invalid class name */
public final class AnonymousClass0XN {
    public C85474Gj A00;
    public C85474Gj A01;
    public final CoroutineLiveData A02;
    public final AnonymousClass4GP A03;
    public final AnonymousClass4GR A04;
    public final AnonymousClass4C6 A05;

    public final void A04() {
        if (this.A00 == null) {
            this.A00 = C616131n.A02(AnonymousClass34M.A01().A04(), new BlockRunner$cancel$1(this, (C84814Du) null), this.A05, (AnonymousClass20D) null, 2);
            return;
        }
        throw AnonymousClass001.A0e("Cancel call cannot happen without a maybeRun");
    }

    public final void A05() {
        C85474Gj r0 = this.A00;
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        this.A00 = null;
        if (this.A01 == null) {
            this.A01 = C616131n.A02((C85494Gl) null, new BlockRunner$maybeRun$1(this, (C84814Du) null), this.A05, (AnonymousClass20D) null, 3);
        }
    }

    public AnonymousClass0XN(CoroutineLiveData coroutineLiveData, AnonymousClass4GP r2, AnonymousClass4GR r3, AnonymousClass4C6 r4) {
        this.A02 = coroutineLiveData;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r2;
    }
}
