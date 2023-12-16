package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public class C18870yO extends Handler {
    public long A00;
    public final long A01;
    public final C378124c A02;
    public final C621033m A03;
    public final C56612sH A04;
    public final C116635qb A05;
    public final C183398py A06;
    public final C183398py A07;
    public final C183398py A08;
    public final C183398py A09;
    public final C101975Gz A0A;
    public final C84144Be A0B;
    public final C84144Be A0C;

    public void handleMessage(Message message) {
        C95814uZ r2;
        AnonymousClass5TQ r0;
        AnonymousClass5ZT r9 = this.A0A.A00;
        if (r9.A0L != null) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - r9.A06) + r9.A05;
            this.A0C.AyM(Integer.valueOf((int) C18290x4.A0B(elapsedRealtime)));
            if (r9.A02 % 2 == 0) {
                C378124c r02 = this.A02;
                double longBitsToDouble = Double.longBitsToDouble(r02.A00.getAndSet(Double.doubleToRawLongBits(Double.MIN_VALUE)));
                if (longBitsToDouble == -1.0d) {
                    this.A07.AyL();
                } else if (longBitsToDouble != Double.MIN_VALUE) {
                    float f = (float) longBitsToDouble;
                    VoiceVisualizer voiceVisualizer = this.A05.A0G;
                    C626936e.A0B(voiceVisualizer.A0K.isEmpty());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = voiceVisualizer.A06;
                    if (j != 0) {
                        voiceVisualizer.A07 = Math.max(elapsedRealtime2 - j, 0);
                    }
                    voiceVisualizer.A06 = elapsedRealtime2;
                    voiceVisualizer.A0I.add(Float.valueOf(f));
                    if (!voiceVisualizer.A0A) {
                        voiceVisualizer.A0A = true;
                        voiceVisualizer.invalidate();
                    }
                }
            }
            this.A06.AyL();
            sendEmptyMessageDelayed(0, 50);
            if (r9.A0F == null && !(r9.A0E instanceof C95804uY) && elapsedRealtime > 1000 && (r0 = r9.A0L) != null && r0.A08.length() > 0) {
                this.A09.AyL();
                this.A0B.AyM(r9.A0L.A08);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.A00 + 1250 < currentTimeMillis && (r2 = r9.A0E) != null) {
                this.A00 = currentTimeMillis;
                this.A03.A0F(r2, 1);
                AnonymousClass5TQ r03 = r9.A0L;
                if (r03 != null && r03.A08.length() > this.A01) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("voicenote/filelimit ");
                    C18260x0.A1I(A0o, r9.A0L.A08.length());
                    this.A08.AyL();
                }
            }
        }
    }

    public C18870yO(C378124c r2, C621033m r3, C56612sH r4, C116635qb r5, C183398py r6, C183398py r7, C183398py r8, C183398py r9, C101975Gz r10, C84144Be r11, C84144Be r12, long j) {
        super(Looper.getMainLooper());
        this.A04 = r4;
        this.A03 = r3;
        this.A0A = r10;
        this.A05 = r5;
        this.A02 = r2;
        this.A0B = r11;
        this.A0C = r12;
        this.A08 = r6;
        this.A09 = r7;
        this.A07 = r8;
        this.A06 = r9;
        this.A01 = j;
    }
}
