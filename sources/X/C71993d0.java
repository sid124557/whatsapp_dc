package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3d0  reason: invalid class name and case insensitive filesystem */
public abstract class C71993d0 implements Iterator, C834348j {
    public Object A00;
    public AnonymousClass21I A01 = AnonymousClass21I.NotReady;

    public void A00() {
        AnonymousClass21I r0;
        if (this instanceof C73633fp) {
            C73633fp r3 = (C73633fp) this;
            while (true) {
                Iterator it = r3.A01;
                if (!it.hasNext()) {
                    r0 = AnonymousClass21I.Done;
                    break;
                }
                Object next = it.next();
                if (r3.A00.add(r3.A02.invoke(next))) {
                    r3.A00 = next;
                    r0 = AnonymousClass21I.Ready;
                    break;
                }
            }
            r3.A01 = r0;
            return;
        }
        C73623fo r4 = (C73623fo) this;
        int i = r4.A00;
        if (i == 0) {
            r4.A01 = AnonymousClass21I.Done;
            return;
        }
        C73673ft r2 = r4.A02;
        Object[] objArr = r2.A03;
        int i2 = r4.A01;
        r4.A00 = objArr[i2];
        r4.A01 = AnonymousClass21I.Ready;
        r4.A01 = (i2 + 1) % r2.A02;
        r4.A00 = i - 1;
    }

    public boolean hasNext() {
        AnonymousClass21I r0 = this.A01;
        AnonymousClass21I r3 = AnonymousClass21I.Failed;
        if (r0 != r3) {
            int ordinal = r0.ordinal();
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 0) {
                this.A01 = r3;
                A00();
                if (this.A01 == AnonymousClass21I.Ready) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw AnonymousClass001.A0c("Failed requirement.");
    }

    public Object next() {
        if (hasNext()) {
            this.A01 = AnonymousClass21I.NotReady;
            return this.A00;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
