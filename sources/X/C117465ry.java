package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5ry  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117465ry implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass5ZT A02;
    public final /* synthetic */ AnonymousClass5TQ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        AnonymousClass5ZT r4 = this.A02;
        AnonymousClass5TQ r3 = this.A03;
        boolean z = this.A04;
        long j = this.A00;
        long j2 = this.A01;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        Log.d("voicenote/stopandreleasevoicerecorder/stop in background ");
        r4.A0F(r3, j, z);
        File file = r3.A08;
        File file2 = r3.A09;
        long length = file.length();
        r4.A0E(j2, "stopVoiceNote on worker thread");
        r4.A0g.A0S(new AnonymousClass8MY(r4, file, file2, length, j, z, z2, z3, z4));
    }

    public /* synthetic */ C117465ry(AnonymousClass5ZT r1, AnonymousClass5TQ r2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = z;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
    }
}
