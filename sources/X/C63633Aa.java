package X;

/* renamed from: X.3Aa  reason: invalid class name and case insensitive filesystem */
public class C63633Aa implements C15930sC {
    public AnonymousClass0QU A00;
    public final C72173dI A01;
    public final /* synthetic */ C15630rg A02;
    public final /* synthetic */ AnonymousClass08J A03;
    public final /* synthetic */ C103315Mk A04;

    public C63633Aa(C15630rg r4, AnonymousClass08J r5, C103315Mk r6) {
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = new C72173dI(r6.A00, true);
    }

    public void BOf(Object obj) {
        AnonymousClass0QU r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        C71573cK r1 = new C71573cK(this, obj);
        this.A00 = ((AnonymousClass5I3) r1.A00).A00;
        C72173dI r02 = this.A01;
        r02.A02();
        r02.execute(r1);
    }
}
