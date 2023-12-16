package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5l2  reason: invalid class name and case insensitive filesystem */
public class C113195l2 implements C1229266j {
    public final int A00;
    public final C1229266j A01;

    public String BDk(AnonymousClass66W r4) {
        C162457s7.A0J(r4, 0);
        Collection BCf = r4.BCf();
        if (BCf != null) {
            if (!BCf.isEmpty()) {
                Iterator it = BCf.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next() instanceof C30471mV)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (BCf.size() >= 4) {
                return r4.getContext().getString(this.A00);
            }
        }
        return this.A01.BDk(r4);
    }

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        return this.A01.BoM(collection);
    }

    public boolean B7f() {
        return this.A01.B7f();
    }

    public int getId() {
        return this.A01.getId();
    }

    public C113195l2(C1229266j r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C18260x0.A0O(context, r3);
        return this.A01.B8D(context, r3);
    }
}
