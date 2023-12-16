package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;

/* renamed from: X.4kc  reason: invalid class name and case insensitive filesystem */
public class C91644kc extends C89084bS {
    public final /* synthetic */ StatusPlaybackActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91644kc(C08270df r1, StatusPlaybackActivity statusPlaybackActivity) {
        super(r1);
        this.A00 = statusPlaybackActivity;
    }

    public int A0C() {
        StatusPlaybackActivity statusPlaybackActivity = this.A00;
        C104025Pi r1 = statusPlaybackActivity.A0D;
        if (r1 == null || !statusPlaybackActivity.A0L) {
            return 0;
        }
        return r1.A01.size();
    }

    public /* bridge */ /* synthetic */ int A0G(Object obj) {
        C08310eF r5 = (C08310eF) obj;
        if (r5 instanceof StatusPlaybackFragment) {
            StatusPlaybackActivity statusPlaybackActivity = this.A00;
            int A002 = statusPlaybackActivity.A0D.A00(C18300x5.A0i(((StatusPlaybackContactFragment) ((StatusPlaybackFragment) r5)).A0R));
            if (A002 < 0 || A002 >= statusPlaybackActivity.A0D.A01.size()) {
                return -2;
            }
            return A002;
        }
        return -2;
    }
}
