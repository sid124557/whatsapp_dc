package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.2yL  reason: invalid class name and case insensitive filesystem */
public class C60312yL {
    public static final Uri A0C = Uri.parse("");
    public AnonymousClass1VX A00;
    public AnonymousClass5ZQ A01;
    public AnonymousClass2X6 A02;
    public Boolean A03 = null;
    public ExecutorService A04;
    public final Handler A05 = new AnonymousClass4MW(Looper.getMainLooper(), this);
    public final C69263Wi A06;
    public final C113895mA A07;
    public final C620633i A08;
    public final C54292oU A09;
    public final AnonymousClass2WH A0A;
    public final AnonymousClass4LY A0B;

    public void A00() {
        this.A04.submit(new C117095rN(this, 23));
    }

    public void A01(Uri uri) {
        Uri uri2 = uri;
        if (uri.compareTo(A0C) != 0) {
            Handler handler = this.A05;
            handler.removeMessages(99);
            handler.sendEmptyMessageDelayed(99, 10000);
            A00();
            if (!this.A0A.A00) {
                Context context = this.A09.A00;
                if (this.A0B.A00) {
                    AudioManager A0G = this.A08.A0G();
                    if (A0G == null || A0G.getStreamVolume(5) > 0) {
                        this.A04.submit(new C71433c6(this, context, uri2, 3, 33));
                        return;
                    }
                    return;
                }
                this.A06.A0S(new C70363aN(this, context, uri, 25));
            }
        }
    }

    public C60312yL(C69263Wi r9, C113895mA r10, C620633i r11, C54292oU r12, AnonymousClass2WH r13, AnonymousClass1VX r14, AnonymousClass4LY r15, AnonymousClass4FS r16, AnonymousClass2X6 r17) {
        this.A09 = r12;
        this.A06 = r9;
        this.A08 = r11;
        this.A0A = r13;
        this.A07 = r10;
        this.A0B = r15;
        this.A02 = r17;
        this.A00 = r14;
        this.A04 = r16.B18("AsyncAudioPlayer", new LinkedBlockingQueue(), 0, 1, 0, 60);
    }
}
