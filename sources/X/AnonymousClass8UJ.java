package X;

import java.util.Iterator;

/* renamed from: X.8UJ  reason: invalid class name */
public final class AnonymousClass8UJ extends C152977aT implements Iterator, C834348j {
    public Object next() {
        A00();
        int i = this.A01;
        AnonymousClass8OR r1 = this.A03;
        if (i < r1.length) {
            this.A01 = i + 1;
            this.A02 = i;
            Object[] objArr = r1.valuesArray;
            C162457s7.A0H(objArr);
            Object obj = objArr[this.A02];
            A01();
            return obj;
        }
        throw AnonymousClass6CA.A0c();
    }

    public AnonymousClass8UJ(AnonymousClass8OR r1) {
        super(r1);
    }
}
