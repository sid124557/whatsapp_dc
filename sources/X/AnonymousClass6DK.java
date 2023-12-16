package X;

import android.media.AudioTrack;

/* renamed from: X.6DK  reason: invalid class name */
public class AnonymousClass6DK extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ AnonymousClass7WA A00;
    public final /* synthetic */ AnonymousClass86A A01;

    public AnonymousClass6DK(AnonymousClass7WA r1, AnonymousClass86A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onDataRequest(AudioTrack audioTrack, int i) {
        AnonymousClass86A r2 = this.A00.A02;
        C161487pm.A04(AnonymousClass000.A1Y(audioTrack, r2.A0C));
        C186018uc r1 = r2.A0F;
        if (r1 != null && r2.A0S) {
            r1.BXJ();
        }
    }

    public void onTearDown(AudioTrack audioTrack) {
        AnonymousClass86A r2 = this.A00.A02;
        C161487pm.A04(AnonymousClass000.A1Y(audioTrack, r2.A0C));
        C186018uc r1 = r2.A0F;
        if (r1 != null && r2.A0S) {
            r1.BXJ();
        }
    }
}
