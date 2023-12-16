package X;

import com.whatsapp.accountsync.ProfileActivity;

/* renamed from: X.1Fh  reason: invalid class name */
public abstract class AnonymousClass1Fh extends AnonymousClass1FB {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            ProfileActivity profileActivity = (ProfileActivity) this;
            C64333Db r1 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            AnonymousClass1Hf.A2G(r1, profileActivity);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, profileActivity);
            AnonymousClass1Ha.A24(r1, profileActivity);
            profileActivity.A00 = r0.ALf();
            profileActivity.A00 = C88744aj.A00;
            profileActivity.A02 = (AnonymousClass0N6) r1.A1u.get();
            profileActivity.A04 = C64333Db.A26(r1);
            AnonymousClass1FB.A1g(r1, profileActivity, C64333Db.A5A(r1));
        }
    }

    public AnonymousClass1Fh() {
        AnonymousClass1Hf.A2D(this, 6);
    }
}
