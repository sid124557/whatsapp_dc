package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.4xe  reason: invalid class name and case insensitive filesystem */
public class C97114xe extends C29451iq {
    public void A08(C624134x r9) {
        Log.i("messageaudio/play");
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C113245l7 r5 = ((C155817fY) A03.next()).A00;
            AnonymousClass5ZT r0 = r5.A5q;
            if (r0 != null) {
                boolean A0U = r0.A0U();
                AnonymousClass5ZT r02 = r5.A5q;
                if (A0U) {
                    r02.A05();
                } else {
                    AnonymousClass5ZQ r03 = r02.A0K;
                    if (r03 != null && r03.A0F()) {
                        r5.A5q.A06();
                    }
                }
            }
            C113245l7.A0J(r5);
            for (AnonymousClass7ND r2 : r5.A5k.A00.A0A) {
                C86604Kt.A1V(AnonymousClass001.A0o(), "ExoPlayerVideoPlayerPoolManager/requestVideoPlayerInstance requestAudioRelease videoPlayerId=", r2);
                C147207Df r04 = r2.A00;
                if (r04 != null) {
                    AnonymousClass566 r4 = r04.A00;
                    C106015Xh r3 = r4.A00;
                    if (!r3.A06) {
                        AnonymousClass566.A00(r4, r3.A03, r3, r3.A02, false);
                    }
                }
            }
            C113895mA messageAudioPlayerProvider = r5.A2z.getMessageAudioPlayerProvider();
            if (messageAudioPlayerProvider.A00 != null && !messageAudioPlayerProvider.A0D(r9)) {
                messageAudioPlayerProvider.A00.A0H(false, false);
            }
        }
    }
}
