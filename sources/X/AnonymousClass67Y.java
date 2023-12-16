package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.67Y  reason: invalid class name */
public class AnonymousClass67Y extends C04840Qw {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67Y(C55812qx r2) {
        super(30);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        int i;
        if (this.A01 != 0) {
            C105285Uh r6 = (C105285Uh) obj2;
            C1226465e r0 = (C1226465e) ((C08310eF) this.A00).A0Q();
            if (r0 != null) {
                i = ((StatusPlaybackActivity) r0).A03;
            } else {
                i = 0;
            }
            if (r6 != null) {
                if (r6.A05) {
                    AnonymousClass51x r1 = (AnonymousClass51x) r6;
                    r1.A05 = false;
                    r1.A0I(i);
                }
                if (r6.A04) {
                    r6.A05();
                }
                if (r6.A01) {
                    if (r6.A03) {
                        r6.A02();
                    }
                    r6.A01();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass5LM r62 = (AnonymousClass5LM) obj2;
        if (z) {
            ((C55812qx) this.A00).A05(r62);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67Y(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(3);
        this.A00 = statusPlaybackContactFragment;
    }
}
