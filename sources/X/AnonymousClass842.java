package X;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.842  reason: invalid class name */
public class AnonymousClass842 implements C187558xP {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public boolean AyV(C166567yu r3, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((C187558xP) it.next()).AyV(r3, file)) {
                return false;
            }
        }
        return true;
    }

    public void BZ5(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BZ5(r3);
        }
    }

    public void BZ6(C166567yu r3, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BZ6(r3, i);
        }
    }

    public void BeI(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BeI(r3);
        }
    }

    public void BeJ(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BeJ(i, i2, i3, i4);
        }
    }

    public void BeK(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BeK(r3);
        }
    }

    public void BeL(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BeL(r3);
        }
    }

    public void BeM(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C187558xP) it.next()).BeM(r3);
        }
    }

    public void BeN(C166567yu r3, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185308tQ) it.next()).BeN(r3, i);
        }
    }

    public void BeO(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185308tQ) it.next()).BeO(r3);
        }
    }

    public void BeP(C166567yu r3, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185308tQ) it.next()).BeP(r3, th);
        }
    }

    public void BeQ(C166567yu r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185308tQ) it.next()).BeQ(r3);
        }
    }
}
