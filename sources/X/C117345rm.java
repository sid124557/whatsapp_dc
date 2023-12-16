package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5rm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117345rm implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass5ZT A02;
    public final /* synthetic */ AnonymousClass5TQ A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        AnonymousClass5ZT r4 = this.A02;
        AnonymousClass5TQ r3 = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        boolean z = this.A04;
        Log.d("voicenote/stopandreleasevoicerecorder/stop in background ");
        r4.A0F(r3, j, false);
        File file = r3.A08;
        File file2 = r3.A09;
        long length = file.length();
        long j3 = r3.A01;
        r4.A0E(j2, "cacheVoiceNoteAndPreview on worker thread");
        r4.A0g.A0S(new AnonymousClass8MT(r4, file, file2, j3, length, j, z));
    }

    public /* synthetic */ C117345rm(AnonymousClass5ZT r1, AnonymousClass5TQ r2, long j, long j2, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
    }
}
