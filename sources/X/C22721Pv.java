package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Pv  reason: invalid class name and case insensitive filesystem */
public final class C22721Pv extends C113175l0 {
    public final C69263Wi A00;
    public final C153167am A01;
    public final C65203Gp A02;
    public final C55622qe A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FS A05;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_unstar);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        return C18290x4.A0l(r3.getContext(), R.string.f11nameremoved);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22721Pv(C69263Wi r1, C153167am r2, C65203Gp r3, C55622qe r4, AnonymousClass1VX r5, AnonymousClass1VX r6, AnonymousClass5U1 r7, AnonymousClass4FS r8) {
        super(r5, r7);
        C18260x0.A0f(r5, r7, r1, r8, r3);
        C18260x0.A0U(r4, r6);
        this.A00 = r1;
        this.A05 = r8;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r6;
        this.A01 = r2;
    }

    public boolean BoM(Collection collection) {
        if (!AnonymousClass0x7.A1T(collection)) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C18300x5.A0T(it).A1F) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (A00(collection)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return 3;
    }
}
