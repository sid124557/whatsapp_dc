package X;

/* renamed from: X.5oD  reason: invalid class name and case insensitive filesystem */
public final class C115155oD implements AnonymousClass8s5, C184278rX {
    public final AnonymousClass1VX A00;
    public final C56592sF A01;
    public final C113995mK A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C120285yL(this));

    public final void A00() {
        if (C18270x1.A1V(this.A03)) {
            this.A01.A07("StatusesFragment_onCreate");
        }
        AnonymousClass8JP r3 = this.A02.A0A;
        r3.markerStart(453128091, 1);
        r3.markerPoint(453128091, 1, "CREATE_START");
    }

    public boolean BMG() {
        if (!C18270x1.A1V(this.A03)) {
            return false;
        }
        this.A01.A06("StatusesFragment_onDraw");
        return false;
    }

    public boolean BMH() {
        if (!C18270x1.A1V(this.A03)) {
            return false;
        }
        this.A01.A06("StatusesFragment_onLayout");
        return false;
    }

    public void BNZ() {
        if (C18270x1.A1V(this.A03)) {
            this.A01.A07("StatusesFragment_onDraw");
        }
    }

    public void BNa() {
        if (C18270x1.A1V(this.A03)) {
            this.A01.A07("StatusesFragment_onLayout");
        }
    }

    public C115155oD(AnonymousClass1VX r2, C56592sF r3, C113995mK r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
