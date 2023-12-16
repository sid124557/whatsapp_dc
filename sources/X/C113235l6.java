package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5l6  reason: invalid class name and case insensitive filesystem */
public final class C113235l6 implements C1229266j {
    public final C45852ag A00;
    public final AnonymousClass1VX A01;
    public final C55852r1 A02;
    public final C52532ld A03;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_hd_label);
    }

    public String BDk(AnonymousClass66W r6) {
        int i;
        C162457s7.A0J(r6, 0);
        Collection BCf = r6.BCf();
        if (BCf != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : BCf) {
                if (A00((C624134x) next)) {
                    A0s.add(next);
                }
            }
            i = A0s.size();
        } else {
            i = 0;
        }
        return C18300x5.A0e(r6.getContext(), Integer.valueOf(i), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
    }

    public final boolean A00(C624134x r4) {
        C30471mV r0;
        AnonymousClass33C r1;
        boolean A002;
        if (r4 instanceof C30471mV) {
            r0 = (C30471mV) r4;
        } else {
            r0 = null;
        }
        if (r0 == null || (r1 = r0.A01) == null || r1.A0c || r1.A0R) {
            return false;
        }
        if (r4 instanceof AnonymousClass1n2) {
            A002 = this.A02.A02(r1, false);
        } else {
            A002 = C624234y.A00(this.A01, this.A03, r4);
        }
        if (A002) {
            return true;
        }
        return false;
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 30;
    }

    public C113235l6(C45852ag r1, AnonymousClass1VX r2, C55852r1 r3, C52532ld r4) {
        C18260x0.A0c(r2, r3, r4, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public boolean BoM(Collection collection) {
        if (AnonymousClass0x7.A1T(collection)) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (A00(C18300x5.A0T(it))) {
                if (this.A01.A0X(4048)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
