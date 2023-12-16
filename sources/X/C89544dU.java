package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.4dU  reason: invalid class name and case insensitive filesystem */
public abstract class C89544dU extends C89644eZ {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this;
            C64333Db r2 = ((C88834as) AnonymousClass4SG.A2U(this)).A4Z;
            AnonymousClass4SG.A3W(r2, statusPlaybackActivity);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, statusPlaybackActivity, AnonymousClass4SG.A2t(r2, r1, statusPlaybackActivity));
            statusPlaybackActivity.A09 = C86634Kw.A0h(r2);
            statusPlaybackActivity.A0B = C86634Kw.A0p(r2);
            statusPlaybackActivity.A0I = (C105855Wr) r1.AAH.get();
            statusPlaybackActivity.A08 = C64333Db.A2r(r2);
            statusPlaybackActivity.A0C = C86634Kw.A0q(r2);
            statusPlaybackActivity.A0F = (AnonymousClass5U7) r1.ABG.get();
            statusPlaybackActivity.A0H = C86604Kt.A0f(r2);
            statusPlaybackActivity.A0G = (AnonymousClass5R1) r1.ABI.get();
        }
    }

    public C89544dU() {
        AnonymousClass68W.A00(this, 106);
    }
}
