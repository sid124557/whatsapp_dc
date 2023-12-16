package X;

import android.os.Handler;
import java.util.concurrent.CancellationException;

/* renamed from: X.46g  reason: invalid class name and case insensitive filesystem */
public final class C831346g extends C831446h implements C84824Dv {
    public final Handler A00;
    public final C831346g A01;
    public final boolean A02;
    public volatile C831346g _immediate;

    public C831346g(Handler handler, boolean z) {
        C831346g r0 = null;
        this.A00 = handler;
        this.A02 = z;
        this._immediate = z ? this : r0;
        C831346g r1 = this._immediate;
        if (r1 == null) {
            r1 = new C831346g(handler, true);
            this._immediate = r1;
        }
        this.A01 = r1;
    }

    public void Bkq(AnonymousClass4GW r6, long j) {
        C70163a3 r4 = new C70163a3(this, 10, r6);
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(r4, j)) {
            r6.BGs(new C825443z(r4, this));
        } else {
            A05(r4, r6.B5w());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C831346g) || ((C831346g) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        String str;
        AnonymousClass46A r0;
        AnonymousClass46A r02 = AnonymousClass788.A00;
        if (this == r02) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                r0 = r02.A04();
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String obj = this.A00.toString();
        if (this.A02) {
            return AnonymousClass000.A0X(".immediate", AnonymousClass000.A0l(obj));
        }
        return obj;
    }

    public final void A05(Runnable runnable, C85494Gl r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("The task was rejected, the handler underlying the dispatcher '");
        A0o.append(this);
        CancellationException cancellationException = new CancellationException(AnonymousClass000.A0X("' was closed", A0o));
        C85474Gj A0v = C18310x6.A0v(r4);
        if (A0v != null) {
            A0v.AyX(cancellationException);
        }
        AnonymousClass34M.A01.A01(runnable, r4);
    }
}
