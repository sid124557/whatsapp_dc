package com.whatsapp.status.playback.fragment;

import X.AnonymousClass001;
import X.AnonymousClass51x;
import X.C105285Uh;
import X.C18260x0;
import android.content.res.Configuration;
import android.graphics.Rect;

public abstract class StatusPlaybackFragment extends Hilt_StatusPlaybackFragment {
    public boolean A00;
    public final Rect A01 = AnonymousClass001.A0N();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1.A0q != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1I() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            X.0Qw r0 = r4.A0u
            java.util.Map r0 = r0.A06()
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r0)
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r3.next()
            X.5Uh r2 = (X.C105285Uh) r2
            boolean r0 = r4 instanceof com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment
            if (r0 == 0) goto L_0x003a
            r1 = r4
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0029
            boolean r1 = r1.A0q
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            r2.A02 = r0
            X.51x r2 = (X.AnonymousClass51x) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0036
            r2.A0B()
            goto L_0x000d
        L_0x0036:
            r2.A0C()
            goto L_0x000d
        L_0x003a:
            boolean r0 = r4.A06
            goto L_0x002a
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackFragment.A1I():void");
    }

    public void A1J() {
        this.A00 = true;
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onViewActive ", this);
    }

    public void A1K() {
        this.A00 = false;
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onViewInactive ", this);
    }

    public void A1L(int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A0o == null) {
            statusPlaybackContactFragment.A01 = i;
            return;
        }
        C105285Uh A1Q = statusPlaybackContactFragment.A1Q();
        if (A1Q != null && !A1Q.A05) {
            AnonymousClass51x r1 = (AnonymousClass51x) A1Q;
            r1.A05 = true;
            r1.A0J(i, r1.A07);
        }
    }

    public void A1M(Rect rect) {
        this.A01.set(rect);
    }

    public void A0a() {
        super.A0a();
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onDestroy ", this);
    }

    public void A0e() {
        super.A0e();
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onPause ", this);
    }

    public void A0f() {
        super.A0f();
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onResume ", this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C18260x0.A1R(AnonymousClass001.A0o(), "playbackFragment/onConfigurationChanged ", this);
    }
}
