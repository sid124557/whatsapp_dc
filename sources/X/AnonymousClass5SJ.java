package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5SJ  reason: invalid class name */
public class AnonymousClass5SJ {
    public final C624134x A00;
    public final /* synthetic */ StatusPlaybackBaseFragment A01;
    public final /* synthetic */ StatusPlaybackContactFragment A02;

    public AnonymousClass5SJ(C624134x r1, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        this.A02 = statusPlaybackContactFragment;
        this.A01 = statusPlaybackContactFragment;
        this.A00 = r1;
    }

    public void A00(C624134x r6) {
        long j;
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
        if (C627636p.A0U(statusPlaybackContactFragment.A05, statusPlaybackContactFragment.A03, r6, statusPlaybackContactFragment.A0V)) {
            statusPlaybackContactFragment.A0U = r6;
            AnonymousClass5PH r4 = new AnonymousClass5PH(statusPlaybackContactFragment.A1D());
            r4.A09 = true;
            r4.A01 = r6.A1J.A00;
            byte b = r6.A1I;
            AnonymousClass5PH.A02(r4, b);
            if (b == 3) {
                j = C18290x4.A0A(((C30471mV) r6).A0B);
            } else {
                j = 0;
            }
            r4.A0R = Integer.valueOf(AnonymousClass5PH.A00(r4, r6, b, j));
            statusPlaybackContactFragment.startActivityForResult(AnonymousClass5PH.A01(r4), 2);
            return;
        }
        statusPlaybackContactFragment.A00.A0F(R.string.f11nameremoved, 1);
    }

    public void A01(C624134x r8, Integer num, boolean z, boolean z2) {
        if (z) {
            StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
            if (statusPlaybackContactFragment.A08.A02()) {
                AnonymousClass30E r0 = statusPlaybackContactFragment.A0g;
                Context A0G = statusPlaybackContactFragment.A0G();
                int A0K = C86664Kz.A0K(num);
                r0.A03(A0G, AnonymousClass223.FACEBOOK, "status_playback_fragment", Collections.singletonList(r8), A0K);
            } else if (statusPlaybackContactFragment.A0k.A00()) {
                AnonymousClass5YA r1 = statusPlaybackContactFragment.A0i;
                Context A0G2 = statusPlaybackContactFragment.A0G();
                List singletonList = Collections.singletonList(r8);
                Integer A0e = C18310x6.A0e();
                C162457s7.A0J(singletonList, 1);
                ((C106955aR) r1.A07.get()).A00(A0G2, new C116815qu(A0G2, r1, A0e, "status_playback_fragment"), A0e, "status_playback_fragment", singletonList);
            }
        }
        StatusPlaybackContactFragment statusPlaybackContactFragment2 = this.A02;
        if (statusPlaybackContactFragment2.A08.A02() && z2) {
            AnonymousClass30E r02 = statusPlaybackContactFragment2.A0g;
            Context A0G3 = statusPlaybackContactFragment2.A0G();
            int A0K2 = C86664Kz.A0K(num);
            r02.A03(A0G3, AnonymousClass223.INSTAGRAM, "status_playback_fragment", Collections.singletonList(r8), A0K2);
        }
    }
}
