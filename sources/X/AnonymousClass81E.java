package X;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* renamed from: X.81E  reason: invalid class name */
public final class AnonymousClass81E implements C180188kd {
    public final C181318mZ A00;
    public final C181318mZ A01;
    public final boolean A02;

    public AnonymousClass81E(boolean z) {
        C1450573z r2 = new C1450573z(2);
        C1450573z r0 = new C1450573z(3);
        this.A00 = r2;
        this.A01 = r0;
        this.A02 = z;
    }

    public static /* synthetic */ HandlerThread A00() {
        return new HandlerThread(AnonymousClass000.A0X("Video", C18330xA.A0A("ExoPlayer:MediaCodecQueueingThread:")));
    }

    public static /* synthetic */ HandlerThread A01() {
        return new HandlerThread(AnonymousClass000.A0X("Video", C18330xA.A0A("ExoPlayer:MediaCodecAsyncAdapter:")));
    }

    public AnonymousClass81G A02(String str) {
        try {
            C153827c5.A01(AnonymousClass000.A0V("createCodec:", str, AnonymousClass001.A0o()));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            try {
                AnonymousClass81G r1 = new AnonymousClass81G(createByCodecName, (HandlerThread) this.A00.get(), (HandlerThread) this.A01.get(), this.A02);
                try {
                    C153827c5.A00();
                    return r1;
                } catch (Exception e) {
                    e = e;
                    r1.release();
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                if (createByCodecName != null) {
                    createByCodecName.release();
                    throw e;
                }
                throw e;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }
}
