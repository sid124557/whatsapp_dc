package X;

import com.google.android.exoplayer2.Timeline;
import java.util.List;

/* renamed from: X.5hI  reason: invalid class name and case insensitive filesystem */
public final class C110945hI implements C186488vR, C180748lZ, C178308hK {
    public final /* synthetic */ C138426qL A00;

    public C110945hI(C138426qL r1) {
        this.A00 = r1;
    }

    public void BQU(List list) {
        this.A00.A02.BQU(list);
    }

    public /* synthetic */ void BW7(C151877Wq r1, int i) {
    }

    public /* synthetic */ void BYA(boolean z, int i) {
    }

    public /* synthetic */ void Bb4() {
    }

    public void BeS(C166387yb r1, C151537Ve r2) {
    }

    public /* synthetic */ void BSZ(boolean z) {
    }

    public /* synthetic */ void BUm(boolean z) {
    }

    public /* synthetic */ void BUn(boolean z) {
    }

    public void BYE(C158477k2 r1) {
    }

    public /* synthetic */ void BYI(int i) {
    }

    public /* synthetic */ void BYJ(int i) {
    }

    public void BYK(C143886zd r1) {
    }

    public void BYM(boolean z, int i) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WAExoPlayerView/playbackstate=");
        if (i == 1) {
            str = "STATE_IDLE";
        } else if (i == 2) {
            str = "STATE_BUFFERING";
        } else if (i == 3) {
            str = "STATE_READY";
        } else if (i != 4) {
            str = "STATE_INVALID";
        } else {
            str = "STATE_ENDED";
        }
        A0o.append(str);
        C18260x0.A1D(", playWhenReady=", A0o, z);
        C138426qL r2 = this.A00;
        r2.A00 = i;
        if (i != 3) {
            AnonymousClass561 r1 = r2.A02;
            if (r1 != null && i == 4) {
                if (!C86604Kt.A1Y(r1.A0E)) {
                    r2.A02.A05();
                }
                C53302ms r0 = r2.A01;
                if (r0 != null) {
                    r0.A00();
                }
                AnonymousClass6OD r12 = r2.A00;
                C626936e.A06(r12);
                r12.Bmw(false);
                AnonymousClass6OD r3 = r2.A00;
                r3.Bl1(r3.B6d(), 0);
                return;
            } else if (i == 2) {
                C53302ms r13 = r2.A01;
                if (r13 == null) {
                    return;
                }
                if (r2.A05) {
                    r13.A02(r2.A04);
                    return;
                } else {
                    r13.A01();
                    return;
                }
            }
        }
        C53302ms r02 = r2.A01;
        if (r02 != null) {
            r02.A00();
        }
    }

    public /* synthetic */ void BYS(int i) {
    }

    public /* synthetic */ void BcO(List list) {
    }

    public /* synthetic */ void Be6(Timeline timeline, Object obj, int i) {
    }

    public /* synthetic */ void Be5(Timeline timeline, int i) {
        AnonymousClass727.A00(this, timeline, i);
    }
}
