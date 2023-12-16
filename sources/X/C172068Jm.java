package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.8Jm  reason: invalid class name and case insensitive filesystem */
public final class C172068Jm implements C187958y5 {
    public final PackageManager A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03;

    public C172068Jm(Context context, AnonymousClass1VX r4) {
        C162457s7.A0J(r4, 1);
        this.A01 = r4;
        this.A00 = context.getPackageManager();
        AnonymousClass58H r1 = AnonymousClass58H.PUBLICATION;
        this.A02 = C154517dI.A00(r1, new C174888Wg(this));
        this.A03 = C154517dI.A00(r1, new C174898Wh(this));
    }

    public boolean BFD() {
        return C18270x1.A1V(this.A02);
    }

    public boolean BHB() {
        if (this.A01.A0N(6598) <= 0 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public boolean BIC() {
        if (this.A01.A0N(3510) < 1) {
            return false;
        }
        return true;
    }

    public boolean BIo() {
        if (this.A01.A0N(3171) < 1) {
            return false;
        }
        return true;
    }
}
