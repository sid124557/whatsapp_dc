package X;

import java.util.ArrayList;

/* renamed from: X.81o  reason: invalid class name and case insensitive filesystem */
public abstract class C1675681o implements C185788uF {
    public int A00;
    public C161387pX A01;
    public final ArrayList A02 = AnonymousClass002.A0I(1);
    public final boolean A03;

    public final void A01() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A03(C161387pX r5) {
        this.A01 = r5;
        for (int i = 0; i < this.A00; i++) {
            ((C184768sU) this.A02.get(i)).Beb(r5, this, this.A03, false);
        }
    }

    public final void A00() {
        C161387pX r3 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((C184768sU) this.A02.get(i)).BeX(r3, this, this.A03);
        }
        this.A01 = null;
    }

    public final void A02(int i) {
        C161387pX r3 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((C184768sU) this.A02.get(i2)).BO0(r3, this, i, this.A03);
        }
    }

    public /* synthetic */ void cancel() {
    }

    public C1675681o(boolean z) {
        this.A03 = z;
    }

    public final void Awq(C184768sU r3) {
        r3.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
            this.A00++;
        }
    }
}
