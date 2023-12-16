package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.5Uh  reason: invalid class name and case insensitive filesystem */
public abstract class C105285Uh {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final Rect A06 = AnonymousClass001.A0N();

    public void A01() {
        this.A01 = false;
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onDestroy page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }

    public void A02() {
        this.A03 = false;
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onPause page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }

    public void A03() {
        this.A03 = true;
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onResume page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }

    public void A04() {
        this.A04 = true;
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onViewActive page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }

    public void A05() {
        this.A04 = false;
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onViewInactive page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }

    public void A06(Rect rect) {
        this.A06.set(rect);
    }

    public void A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onConfigurationChanged page=", this);
        C18260x0.A0o(((AnonymousClass51x) this).A0T.A01, A0o);
    }
}
