package X;

import java.util.Iterator;

/* renamed from: X.8Ns  reason: invalid class name and case insensitive filesystem */
public class C172978Ns implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ AnonymousClass8TC A03;

    public /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        AnonymousClass8TC r1 = this.A03;
        if (i < r1.A00.size()) {
            return r1.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass000.A0q(r1.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public C172978Ns(AnonymousClass8TC r2) {
        this.A03 = r2;
    }

    public boolean hasNext() {
        int i = this.A00 + 1;
        AnonymousClass8TC r1 = this.A03;
        if (i >= r1.A00.size()) {
            if (r1.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A0q(r1.A01);
                this.A01 = it;
            }
            if (it.hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void remove() {
        if (this.A02) {
            this.A02 = false;
            AnonymousClass8TC r2 = this.A03;
            r2.A05();
            if (this.A00 < r2.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                r2.A01(i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A0q(r2.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass001.A0e("remove() was called before next()");
    }
}
