package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3cv  reason: invalid class name and case insensitive filesystem */
public final class C71943cv implements Iterator, C84814Du, C834348j {
    public int A00;
    public Object A01;
    public Iterator A02;
    public C84814Du A03;

    public final Throwable A01() {
        int i = this.A00;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i != 5) {
            return AnonymousClass001.A0e(AnonymousClass000.A0Y("Unexpected state of the iterator: ", AnonymousClass001.A0o(), i));
        }
        return AnonymousClass001.A0e("Iterator has failed.");
    }

    public void A02(Object obj, C84814Du r3) {
        this.A01 = obj;
        this.A00 = 3;
        this.A03 = r3;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.A02;
                    C162457s7.A0H(it);
                    if (it.hasNext()) {
                        this.A00 = 2;
                        break;
                    }
                    this.A02 = null;
                } else if (i != 2 && i != 3) {
                    if (i == 4) {
                        return false;
                    }
                    throw A01();
                }
            }
            this.A00 = 5;
            C84814Du r1 = this.A03;
            C162457s7.A0H(r1);
            this.A03 = null;
            r1.BkD(C59022wD.A00);
        }
        return true;
    }

    public Object next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.A00 = 1;
            Iterator it = this.A02;
            C162457s7.A0H(it);
            return it.next();
        } else if (i == 3) {
            this.A00 = 0;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        } else {
            throw A01();
        }
    }

    public final Object A00(C84814Du r3, AnonymousClass4C5 r4) {
        Object obj;
        Iterator it = r4.iterator();
        if (!it.hasNext()) {
            obj = C59022wD.A00;
        } else {
            this.A02 = it;
            this.A00 = 2;
            this.A03 = r3;
            obj = AnonymousClass218.COROUTINE_SUSPENDED;
        }
        return AnonymousClass218.A00(obj);
    }

    public C85494Gl B5w() {
        return C72553du.A00;
    }

    public void BkD(Object obj) {
        C57682u2.A01(obj);
        this.A00 = 4;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
