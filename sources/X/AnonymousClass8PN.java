package X;

import java.util.Iterator;

/* renamed from: X.8PN  reason: invalid class name */
public final class AnonymousClass8PN implements AnonymousClass4C5 {
    public final int A00;
    public final CharSequence A01;
    public final AnonymousClass4GR A02;

    public Iterator iterator() {
        return new AnonymousClass8OG(this);
    }

    public AnonymousClass8PN(CharSequence charSequence, AnonymousClass4GR r2, int i) {
        this.A01 = charSequence;
        this.A00 = i;
        this.A02 = r2;
    }
}
