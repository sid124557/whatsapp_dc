package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.4Me  reason: invalid class name and case insensitive filesystem */
public class C86874Me extends HandlerThread {
    public float A00 = 0.0f;
    public int A01 = 0;
    public long A02 = 0;
    public Handler A03;
    public AnonymousClass5TQ A04;
    public final long A05;
    public final Handler A06;
    public final C64393Dh A07;
    public final C69263Wi A08;
    public final AudioRecordFactory A09;
    public final OpusRecorderFactory A0A;
    public final C56612sH A0B;
    public final AnonymousClass1VX A0C;
    public final WeakReference A0D;

    public C86874Me(C64393Dh r3, C69263Wi r4, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C56612sH r7, AnonymousClass1VX r8, C116155pp r9, long j) {
        super("VoiceStatusRecorderThread");
        this.A0B = r7;
        this.A0C = r8;
        this.A08 = r4;
        this.A07 = r3;
        this.A05 = j;
        this.A09 = audioRecordFactory;
        this.A0A = opusRecorderFactory;
        this.A0D = AnonymousClass0x9.A14(r9);
        this.A06 = AnonymousClass000.A0A();
    }

    public void A00() {
        if (this.A03 == null) {
            start();
            Handler handler = new Handler(getLooper());
            this.A03 = handler;
            C117635sF.A00(handler, this, 48);
            this.A03.postDelayed(new C117635sF(this, 49), 16);
            C117095rN.A00(this.A03, this, 0);
            this.A03.postDelayed(new C117095rN(this, 1), this.A05);
        }
    }

    public final void A01(boolean z) {
        AnonymousClass5TQ r0;
        AnonymousClass5TQ r2 = this.A04;
        if (r2 != null) {
            try {
                OpusRecorder opusRecorder = r2.A06;
                opusRecorder.stop();
                r2.A01 = opusRecorder.getPageNumber();
                this.A04.A01();
                AnonymousClass5TQ r1 = this.A04;
                if (r1.A02()) {
                    r1.A0D.close();
                }
                if (z && (r0 = this.A04) != null) {
                    File file = r0.A09;
                    r0.A08.delete();
                    file.delete();
                }
                AnonymousClass5TQ r12 = this.A04;
                r12.A06.close();
                r12.A03.release();
            } catch (Exception unused) {
            }
            this.A04 = null;
            quit();
            interrupt();
        }
    }
}
