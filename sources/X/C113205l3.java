package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5l3  reason: invalid class name and case insensitive filesystem */
public final class C113205l3 implements C1229266j {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final C66663Mh A02;
    public final AnonymousClass1VX A03;
    public final C52472lX A04;
    public final AnonymousClass4rH A05;
    public final C50222hp A06;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_forward);
    }

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        C95814uZ r1 = C86654Ky.A0b(collection).A1J.A00;
        if (C627336j.A0K(r1) && this.A04.A02(r1)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (!C627636p.A0U(this.A02, this.A03, A0T, this.A06)) {
                return false;
            }
        }
        return true;
    }

    public boolean B7f() {
        return false;
    }

    public int getId() {
        return 8;
    }

    public C113205l3(C116985rC r2, C69263Wi r3, C66663Mh r4, AnonymousClass1VX r5, C52472lX r6, AnonymousClass4rH r7, C50222hp r8) {
        C18260x0.A0f(r5, r3, r4, r8, r6);
        C162457s7.A0J(r7, 6);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r2;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
