package X;

import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public class C03010Im implements C180518lC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void Beq() {
        if (this.A03 != 0) {
            A01(this);
        } else {
            A00(this);
        }
    }

    public C03010Im(BloksEditText bloksEditText, C153427bI r2, AnonymousClass84O r3, int i) {
        this.A03 = i;
        this.A02 = bloksEditText;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final void A00(C03010Im r3) {
        AnonymousClass0YO.A07((BloksEditText) r3.A02, (C153427bI) r3.A00, (AnonymousClass84O) r3.A01);
    }

    public static final void A01(C03010Im r3) {
        AnonymousClass0YO.A08((BloksEditText) r3.A02, (C153427bI) r3.A00, (AnonymousClass84O) r3.A01);
    }
}
