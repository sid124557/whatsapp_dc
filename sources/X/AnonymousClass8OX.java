package X;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.8OX  reason: invalid class name */
public class AnonymousClass8OX implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C158897kj A01;
    public final /* synthetic */ C153537bV A02;

    public AnonymousClass8OX(C158897kj r1, C153537bV r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass720 r6;
        C153007aW A002;
        C153537bV r3 = this.A02;
        boolean z = false;
        if (!(r3 == null || (A002 = r3.A00(C142366x5.AUDIO, this.A00)) == null)) {
            try {
                z = AnonymousClass726.A00(AnonymousClass6C9.A0T(A002.A02).A02.getCanonicalPath(), C142616xU.CODEC_ANDROID_AUDIO_AAC.value).equals(C142616xU.CODEC_AUDIO_MP3.value);
            } catch (IOException e) {
                AnonymousClass7VY r0 = new AnonymousClass7VY();
                r0.A00(e);
                Throwable th = r0.A01;
                if (th != null) {
                    throw new Exception(th);
                }
            }
        }
        C158897kj r1 = this.A01;
        AnonymousClass7UB r02 = r1.A0H;
        AnonymousClass7QR r7 = r1.A08;
        C151867Wp r32 = r1.A0F;
        C1445471z r5 = r02.A04;
        C180608lL r4 = r02.A03;
        if (z) {
            r6 = new AnonymousClass720();
        } else {
            r6 = r02.A05;
        }
        C1684585m r2 = new C1684585m(r32, r4, r5, r6, r7);
        try {
            r2.AzQ(this.A00);
            return r2;
        } catch (Throwable th2) {
            AnonymousClass7VY r12 = new AnonymousClass7VY();
            r12.A00(th2);
            AnonymousClass7RG.A00(new C188878zd(r12, (C186348v9) r2));
            Throwable th3 = r12.A01;
            if (th3 == null) {
                return r2;
            }
            throw new Exception(th3);
        }
    }
}
