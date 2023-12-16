package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1QU  reason: invalid class name */
public final class AnonymousClass1QU extends AnonymousClass4pK {
    public final C106995aW A00;
    public final C54822pL A01;

    public boolean A00(C624134x r4) {
        C162457s7.A0J(r4, 0);
        C54822pL r2 = this.A01;
        Iterable iterable = (Iterable) C18300x5.A0b(r2.A03);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C84624Db) it.next()).BIU(r4)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!r2.A01(r4) || C627336j.A0L(r4.A0o())) {
            return false;
        }
        return true;
    }

    public boolean A02(C89644eZ r4, C624134x r5) {
        C162457s7.A0J(r5, 0);
        C95814uZ A0n = r5.A0n();
        if (A0n == null) {
            return false;
        }
        A01(r4, A0n, r5, this.A00.A0I(A0n));
        return true;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_reply);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        return C18290x4.A0l(r3.getContext(), R.string.f11nameremoved);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1QU(C111095hX r1, C106995aW r2, AnonymousClass5G5 r3, C56892sj r4, C54822pL r5) {
        super(r1, r3, r4);
        C18260x0.A0f(r1, r5, r2, r4, r3);
        this.A01 = r5;
        this.A00 = r2;
    }

    public int getId() {
        return 12;
    }
}
