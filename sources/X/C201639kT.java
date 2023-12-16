package X;

import java.util.ArrayList;

/* renamed from: X.9kT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201639kT implements AnonymousClass4GQ {
    public final /* synthetic */ C41182Jg A00;
    public final /* synthetic */ C41182Jg A01;

    public final Object invoke(Object obj) {
        Runnable A07;
        C41182Jg r1 = this.A00;
        C41182Jg r2 = this.A01;
        C192829Lu r6 = (C192829Lu) obj;
        if (r6 instanceof AnonymousClass9GA) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(((AnonymousClass9GA) r6).A00);
            A07 = new C70323aJ(r1.A00, r1.A01, A0s, 1);
        } else {
            A07 = AnonymousClass8DJ.A07(r2.A01, r2.A00);
        }
        A07.run();
        return C59022wD.A00;
    }

    public /* synthetic */ C201639kT(C41182Jg r1, C41182Jg r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
