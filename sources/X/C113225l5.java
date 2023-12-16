package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;

/* renamed from: X.5l5  reason: invalid class name and case insensitive filesystem */
public abstract class C113225l5 implements C1229266j {
    public final C47052cd A00;

    public boolean A00(C89654ea r5, Collection collection) {
        C621433s.A01(r5, 13);
        C47052cd r2 = this.A00;
        if (r2.A03 && r2.A00 == 2) {
            r2.A00 = 3;
            r2.A00(1);
        }
        return true;
    }

    public final Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_delete);
    }

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (collection.size() != 1) {
            return true;
        }
        C624134x A0b = C86654Ky.A0b(collection);
        if (!(A0b instanceof C30471mV) || !C627636p.A0z((C30471mV) A0b)) {
            return true;
        }
        return false;
    }

    public final boolean B7f() {
        return false;
    }

    public final int getId() {
        return 21;
    }

    public C113225l5(C47052cd r1) {
        this.A00 = r1;
    }

    public final String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
