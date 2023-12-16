package X;

/* renamed from: X.9SD  reason: invalid class name */
public class AnonymousClass9SD {
    public AnonymousClass9Q0 A00;
    public C160757oG A01 = C160757oG.A00("BrazilNetworkManager", "onboarding", "BR");
    public boolean A02;
    public boolean A03;
    public final C69263Wi A04;
    public final C56972sr A05;
    public final C29441ip A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final AnonymousClass8EA A09;
    public final AnonymousClass31C A0A;
    public final C1906799k A0B;
    public final C194929Vc A0C;
    public final C40602Ha A0D;
    public final C620933l A0E;
    public final AnonymousClass9U5 A0F;
    public final AnonymousClass9VU A0G;
    public final C194029Rh A0H;

    public void A00(String str) {
        AnonymousClass9Q0 r3 = this.A00;
        if (r3 == null) {
            String A082 = this.A0E.A08();
            if (A082 == null) {
                this.A01.A06("No wallet Id stored on client, ELO node cannot be inserted in request");
            }
            r3 = new AnonymousClass9Q0((String) null, str, A082, 5);
            this.A00 = r3;
        }
        r3.A02 = str;
    }

    public AnonymousClass9SD(C69263Wi r4, C56972sr r5, C29441ip r6, C56612sH r7, C54292oU r8, AnonymousClass8EA r9, AnonymousClass31C r10, C1906799k r11, C194929Vc r12, C40602Ha r13, C620933l r14, AnonymousClass9U5 r15, AnonymousClass9VU r16, C194029Rh r17) {
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = r10;
        this.A0E = r14;
        this.A0F = r15;
        this.A0H = r17;
        this.A0C = r12;
        this.A0D = r13;
        this.A06 = r6;
        this.A0G = r16;
        this.A0B = r11;
    }
}
