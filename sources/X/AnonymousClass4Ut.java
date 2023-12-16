package X;

import java.util.List;

/* renamed from: X.4Ut  reason: invalid class name */
public final class AnonymousClass4Ut extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final C621033m A05;
    public final C56612sH A06;
    public final C56982ss A07;
    public final AnonymousClass5UP A08;
    public final AnonymousClass2SQ A09;
    public final C33141sV A0A;
    public final List A0B;
    public final C85504Gn A0C;
    public final AnonymousClass4C8 A0D;
    public final boolean A0E;

    public AnonymousClass4Ut(AnonymousClass7CO r8, C621033m r9, C56612sH r10, C56982ss r11, AnonymousClass5UP r12, C33141sV r13, List list, boolean z) {
        C18260x0.A0b(r8, r10, r9, 1);
        C18260x0.A0W(r13, r12, r11);
        this.A0B = list;
        this.A0E = z;
        this.A06 = r10;
        this.A05 = r9;
        this.A0A = r13;
        this.A08 = r12;
        this.A07 = r11;
        AnonymousClass4C6 A002 = AnonymousClass0IV.A00(this);
        C64333Db r0 = r8.A00.A04;
        C56842se A66 = C64333Db.A66(r0);
        AnonymousClass4FS A8y = C64333Db.A8y(r0);
        C64773Ex A26 = C64333Db.A26(r0);
        C56982ss A39 = C64333Db.A39(r0);
        AnonymousClass46Q r5 = AnonymousClass2C4.A01;
        C615931l.A00(r5);
        this.A09 = new AnonymousClass2SQ(A26, A39, A66, A8y, r5, A002);
        AnonymousClass8PR r02 = new AnonymousClass8PR(C58062ue.A00);
        this.A0C = r02;
        this.A0D = C154567dN.A01(r02);
    }

    public final void A0D(int i) {
        AnonymousClass08M r2 = this.A04;
        AnonymousClass7YM r0 = (AnonymousClass7YM) r2.A07();
        if (r0 == null || i != r0.A00) {
            AnonymousClass7YM r02 = (AnonymousClass7YM) r2.A07();
            AnonymousClass7YM r1 = null;
            if (r02 != null) {
                r1 = new AnonymousClass7YM(r02.A01, i);
            }
            r2.A0H(r1);
        }
    }
}
