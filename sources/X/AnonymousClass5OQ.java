package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.5OQ  reason: invalid class name */
public final class AnonymousClass5OQ {
    public Long A00;
    public final WfalManager A01;
    public final AnonymousClass5UP A02;
    public final C1230166s A03;
    public final C56042rK A04;
    public final C104745Se A05;

    public final void A00(int i, long j) {
        Long l = this.A00;
        if (l != null) {
            this.A03.flowEndFail(l.longValue(), "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
        }
        boolean A022 = this.A01.A02();
        C1230166s r4 = this.A03;
        long j2 = ((long) 453118619) | (((long) 0) << 32);
        r4.B3O(new C103995Pf(C18270x1.A0T(Integer.valueOf(i)), false), j2);
        int A06 = C86664Kz.A06(j2);
        ((C115425oe) r4).A00.markerAnnotate((int) j2, A06, "status_session_id", j);
        C56042rK r7 = this.A04;
        AnonymousClass21S r6 = AnonymousClass21S.A0R;
        r4.flowAnnotate(j2, "is_fb_auto_crossposting_enabled_start", C86624Kv.A1Y(r7, r6));
        r4.flowAnnotate(j2, "is_fb_account_linked", r7.A05(r6));
        r4.flowAnnotate(j2, "is_waffle_v2_enabled", this.A05.A00());
        r4.flowAnnotate(j2, "is_waffle_v3_enabled", A022);
        r4.flowAnnotate(j2, "is_channels_enabled", C18300x5.A1S(this.A02));
        this.A00 = Long.valueOf(j2);
    }

    public AnonymousClass5OQ(WfalManager wfalManager, AnonymousClass5UP r2, C1230166s r3, C56042rK r4, C104745Se r5) {
        C18260x0.A0f(r4, r5, r3, r2, wfalManager);
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = wfalManager;
    }
}
