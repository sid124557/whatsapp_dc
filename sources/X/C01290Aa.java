package X;

import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: X.0Aa  reason: invalid class name and case insensitive filesystem */
public final class C01290Aa extends C04590Ow {
    public final List A00 = AnonymousClass002.A0I(3);

    public void A00(int i) {
        try {
            for (C04590Ow A002 : this.A00) {
                A002.A00(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public void A01(int i) {
        try {
            for (C04590Ow A01 : this.A00) {
                A01.A01(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public void A02(int i, float f, int i2) {
        try {
            for (C04590Ow A02 : this.A00) {
                A02.A02(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
