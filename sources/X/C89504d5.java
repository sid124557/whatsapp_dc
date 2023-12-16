package X;

import com.whatsapp.polls.PollCreatorActivity;

/* renamed from: X.4d5  reason: invalid class name and case insensitive filesystem */
public abstract class C89504d5 extends C89644eZ {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            PollCreatorActivity pollCreatorActivity = (PollCreatorActivity) this;
            C88834as r4 = (C88834as) AnonymousClass4SG.A2U(this);
            C64333Db r2 = r4.A4Z;
            AnonymousClass4SG.A3W(r2, pollCreatorActivity);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, pollCreatorActivity, AnonymousClass4SG.A2t(r2, r1, pollCreatorActivity));
            pollCreatorActivity.A0E = (C617532c) r1.A9D.get();
            pollCreatorActivity.A0F = AnonymousClass4SG.A2s(r1);
            pollCreatorActivity.A08 = (C101085Dk) r4.A1h.get();
            pollCreatorActivity.A09 = (C101095Dl) r4.A1i.get();
            pollCreatorActivity.A0A = C107695bk.A15(r1);
        }
    }

    public C89504d5() {
        AnonymousClass68W.A00(this, 68);
    }
}
