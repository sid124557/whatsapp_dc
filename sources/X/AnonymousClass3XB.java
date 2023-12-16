package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.3XB  reason: invalid class name */
public class AnonymousClass3XB implements C84134Bd {
    public Object A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final List A02 = AnonymousClass001.A0s();

    public static AnonymousClass3XB A00() {
        return new AnonymousClass3XB();
    }

    public Object A01() {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
        }
        return obj;
    }

    public void A02() {
        synchronized (this.A01) {
            this.A02.clear();
        }
    }

    public void A03(C84134Bd r4) {
        synchronized (this.A01) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                if (((C84134Bd) AnonymousClass0x9.A0D(it).first).equals(r4)) {
                    it.remove();
                }
            }
        }
    }

    public void A04(C84134Bd r5, Executor executor) {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
            this.A02.add(Pair.create(r5, executor));
        }
        if (obj == null) {
            return;
        }
        if (executor == null) {
            r5.AwB(obj);
        } else {
            executor.execute(new C117165rU(r5, 23, obj));
        }
    }

    public void A05(Object obj) {
        ArrayList A0J;
        synchronized (this.A01) {
            this.A00 = obj;
            A0J = AnonymousClass002.A0J(this.A02);
        }
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            Pair A0D = AnonymousClass0x9.A0D(it);
            C84134Bd r3 = (C84134Bd) A0D.first;
            Executor executor = (Executor) A0D.second;
            if (executor == null) {
                r3.AwB(obj);
            } else {
                executor.execute(new C117165rU(r3, 23, obj));
            }
        }
    }

    public void AwB(Object obj) {
        A05(obj);
    }
}
