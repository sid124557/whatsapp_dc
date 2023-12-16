package X;

import java.util.List;

/* renamed from: X.09G  reason: invalid class name */
public abstract class AnonymousClass09G extends AnonymousClass0R6 {
    public final C15180qu A00;
    public final C05460Tk A01;

    public int A0G() {
        return this.A01.A02.size();
    }

    public Object A0K(int i) {
        return this.A01.A02.get(i);
    }

    public void A0L(List list) {
        this.A01.A00(list);
    }

    public AnonymousClass09G(AnonymousClass0O4 r5) {
        C08470eX r3 = new C08470eX(this);
        this.A00 = r3;
        C05460Tk r0 = new C05460Tk(new C05360Ta(r5).A00(), new C08490eZ(this));
        this.A01 = r0;
        r0.A06.add(r3);
    }

    public AnonymousClass09G(AnonymousClass0LC r4) {
        C08470eX r2 = new C08470eX(this);
        this.A00 = r2;
        C05460Tk r0 = new C05460Tk(r4, new C08490eZ(this));
        this.A01 = r0;
        r0.A06.add(r2);
    }
}
