package X;

/* renamed from: X.9Ax  reason: invalid class name and case insensitive filesystem */
public class C191069Ax extends C1907999w {
    public final C193849Qh A00;
    public final /* synthetic */ AnonymousClass9VB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191069Ax(C202699mR r4, AnonymousClass9VB r5, C193849Qh r6) {
        super(r5.A04.A00, r5.A02, r5.A05, r4);
        this.A01 = r5;
        this.A00 = r6;
    }

    public void A06(AnonymousClass34V r5) {
        if (r5 == null) {
            this.A01.A08.A07("changePin success");
            return;
        }
        AnonymousClass9VB r3 = this.A01;
        r3.A08.A07(AnonymousClass000.A0P(r5, "changePin error: ", AnonymousClass001.A0o()));
        int i = r5.A00;
        if (i == 1441) {
            r3.A0A.A02(r5.A02);
        } else if (i == 1448) {
            r3.A07.A02(r5, this.A00.A00.A05, "PIN");
        }
    }
}
