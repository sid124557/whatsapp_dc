package X;

import com.whatsapp.R;

/* renamed from: X.4Uq  reason: invalid class name */
public class AnonymousClass4Uq extends C05550Ty {
    public boolean A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02;
    public final C69263Wi A03;
    public final AnonymousClass2ZS A04;
    public final C29441ip A05;
    public final AnonymousClass4UC A06 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A07 = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A08;

    public AnonymousClass4Uq(C69263Wi r4, AnonymousClass2ZS r5, C29441ip r6, AnonymousClass33p r7, AnonymousClass4FS r8) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A02 = A012;
        this.A03 = r4;
        this.A08 = r8;
        this.A00 = true;
        this.A04 = r5;
        this.A05 = r6;
        C18320x8.A18(A012, r7.A2B());
    }

    public final void A0D() {
        if (!this.A05.A0F()) {
            this.A07.A0H(new C100215Aa());
            return;
        }
        C06270Wx.A03(this.A01, R.string.f11nameremoved);
        this.A08.BkM(new C69963Zi(this, 3));
        this.A00 = false;
        this.A03.A0T(new C69963Zi(this, 4), 1000);
    }
}
