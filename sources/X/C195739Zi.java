package X;

/* renamed from: X.9Zi  reason: invalid class name and case insensitive filesystem */
public class C195739Zi implements C202909mo {
    public final AnonymousClass9Mu A00;
    public final C202369lu A01;
    public final AnonymousClass9T9 A02;
    public volatile int A03;
    public volatile C203429ng A04;
    public volatile Boolean A05;

    public void Ay4() {
        this.A02.A00();
    }

    public /* bridge */ /* synthetic */ Object BCH() {
        if (this.A05 == null) {
            throw AnonymousClass001.A0e("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new C201699ka("Failed to configure preview.");
        }
    }

    public C195739Zi(AnonymousClass9Mu r3) {
        this.A03 = 0;
        AnonymousClass9UG r1 = new AnonymousClass9UG(this, 1);
        this.A01 = r1;
        this.A00 = r3;
        AnonymousClass9T9 r0 = new AnonymousClass9T9();
        this.A02 = r0;
        r0.A01 = r1;
    }

    public C195739Zi() {
        this((AnonymousClass9Mu) null);
    }
}
