package X;

import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5pp  reason: invalid class name and case insensitive filesystem */
public class C116155pp implements C179728jc {
    public static final long A0M;
    public static final long A0N;
    public static final long A0O;
    public static final long A0P;
    public int A00 = -1;
    public long A01;
    public long A02 = -1;
    public PowerManager.WakeLock A03;
    public C33331sp A04;
    public C33331sp A05;
    public C179738jd A06 = null;
    public C86874Me A07;
    public C116175pr A08;
    public File A09;
    public File A0A;
    public boolean A0B = false;
    public byte[] A0C;
    public final AnonymousClass5M5 A0D;
    public final AnonymousClass5E1 A0E;
    public final AnonymousClass4FU A0F;
    public final AnonymousClass1VX A0G;
    public final C113995mK A0H;
    public final C185148tA A0I;
    public final C183198pe A0J;
    public final C104995Td A0K;
    public final AnonymousClass4FS A0L;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0O = timeUnit.toMillis(30);
        A0M = timeUnit.toMillis(3);
        A0P = timeUnit.toMillis(5);
        A0N = C86654Ky.A09(timeUnit);
    }

    public final long A00() {
        int A0N2 = this.A0G.A0N(6845);
        if (A0N2 <= 0) {
            return A0O;
        }
        return ((long) A0N2) * A0N;
    }

    public void A01() {
        C179738jd r3 = this.A06;
        if (r3 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r3;
            C116145po r2 = textStatusComposerActivity.A0k;
            if (r2 != null && r2.A05.A00 == AnonymousClass58Q.SEND_VOICE) {
                r2.A05 = new C985752a(r2);
                r2.A09 = false;
                r2.A0L.Awz(300);
            }
            textStatusComposerActivity.A76();
        }
        C116175pr r0 = this.A08;
        if (r0 != null) {
            r0.A00 = null;
            this.A08 = null;
        }
        A04(this.A09);
        this.A09 = null;
        A04(this.A0A);
        this.A0A = null;
        AnonymousClass5Z9 r22 = this.A0H.A0C;
        if (r22.A04.A00()) {
            C95044sW.A00(r22.A01(), r22, 32);
        }
    }

    public final void A02() {
        this.A0I.BEh();
        C113995mK r0 = this.A0H;
        long j = this.A01;
        AnonymousClass5Z9 r5 = r0.A0C;
        if (r5.A04.A00()) {
            C95044sW A012 = r5.A01();
            A012.A03 = 30;
            A012.A01 = C18290x4.A0d();
            long j2 = (long) 1000;
            A012.A07 = Long.valueOf((j / j2) * j2);
            r5.A02.BhB(A012);
        }
    }

    public void A03(long j) {
        TextView textView;
        int i;
        this.A01 = j;
        if (j < A00()) {
            long millis = TimeUnit.SECONDS.toMillis(1);
            long A002 = (((A00() - j) + millis) - 1) / millis;
            C185148tA r5 = this.A0I;
            r5.setRemainingSeconds((int) A002);
            long A003 = A00();
            long j2 = A0M;
            if (A003 > j2) {
                A003 -= j2;
            }
            if (j < A003 || j % TimeUnit.SECONDS.toMillis(1) <= 500) {
                textView = ((VoiceRecordingView) r5).A03;
                i = 0;
            } else {
                textView = ((VoiceRecordingView) r5).A03;
                i = 4;
            }
            textView.setVisibility(i);
            return;
        }
        C86874Me r2 = this.A07;
        if (r2 != null) {
            C117095rN.A00(r2.A03, r2, 3);
            A05(false);
        }
        A02();
        AnonymousClass5Z9 r22 = this.A0H.A0C;
        if (r22.A04.A00()) {
            C95044sW.A00(r22.A01(), r22, 29);
        }
        C179738jd r3 = this.A06;
        if (r3 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r3;
            C116145po r23 = textStatusComposerActivity.A0k;
            if (r23 != null && r23.A05.A00 == AnonymousClass58Q.RECORDING) {
                r23.A05 = new AnonymousClass52Z(r23);
                C185948uV r0 = r23.A0L;
                r0.BFf();
                r0.Awy();
            }
            textStatusComposerActivity.A74();
        }
    }

    public final void A04(File file) {
        if (file != null) {
            this.A0L.BkM(new C117635sF(file, 47));
        }
    }

    public final void A05(boolean z) {
        C86874Me r3 = this.A07;
        if (r3 != null) {
            r3.A03.post(new C71363bz(14, r3, z));
            this.A07 = null;
            this.A0K.A00();
            PowerManager.WakeLock wakeLock = this.A03;
            if (wakeLock != null) {
                wakeLock.release();
            }
            this.A0B = false;
            C111095hX.A04((View) this.A0I).setRequestedOrientation(-1);
        }
    }

    public C116155pp(AnonymousClass5M5 r4, AnonymousClass5E1 r5, AnonymousClass4FU r6, C620633i r7, AnonymousClass1VX r8, C113995mK r9, VoiceRecordingView voiceRecordingView, C104995Td r11, AnonymousClass4FS r12) {
        this.A0G = r8;
        this.A0K = r11;
        this.A0L = r12;
        this.A0I = voiceRecordingView;
        this.A0J = voiceRecordingView;
        this.A0F = r6;
        this.A0H = r9;
        this.A0D = r4;
        this.A0E = r5;
        PowerManager A0J2 = r7.A0J();
        if (A0J2 != null) {
            this.A03 = AnonymousClass75K.A00(A0J2, "voice-status-recording", 6);
        }
        voiceRecordingView.A0B = this;
    }
}
