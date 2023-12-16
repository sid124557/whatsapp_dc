package X;

import android.media.Image;
import android.media.ImageReader;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9S3  reason: invalid class name */
public class AnonymousClass9S3 {
    public Image A00;
    public ImageReader A01;
    public AnonymousClass9ZW A02;
    public C195049Vr A03;
    public C194959Vh A04;
    public boolean A05;
    public final ImageReader.OnImageAvailableListener A06 = new C204039oi(this, 1);
    public final C193039Ms A07 = new C193039Ms(this);
    public final C194439Sw A08 = new C194439Sw();
    public final AnonymousClass9S8 A09 = new AnonymousClass9S8();
    public final Callable A0A = new C204469pP((Object) this, 11);

    public final void A00() {
        AnonymousClass9S8 r8;
        C195049Vr r3;
        C194959Vh r0 = this.A04;
        if (r0 == null) {
            return;
        }
        if (!r0.A09()) {
            throw new C201699ka("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (this.A00 != null && this.A03 != null) {
            C194439Sw r1 = this.A08;
            if (!r1.A00.isEmpty()) {
                AnonymousClass9ZW r4 = this.A02;
                if (r4 == null || (r3 = this.A03) == null || !C195049Vr.A07(C195049Vr.A0R, r3)) {
                    r8 = this.A09;
                    r8.A00(this.A00, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, this.A05, false);
                } else {
                    long timestamp = this.A00.getTimestamp();
                    C193929Qt r7 = r4.A06;
                    if (r7 != null) {
                        int i = 0;
                        do {
                            AnonymousClass9VM r5 = r7.A01[i];
                            if (r5 != null) {
                                C193059Mz r32 = AnonymousClass9VM.A0P;
                                if (r5.A00(r32) != null && C18310x6.A0B(r5.A00(r32)) == timestamp) {
                                    try {
                                        r8 = this.A09;
                                        Image image = this.A00;
                                        boolean z = this.A05;
                                        AnonymousClass9S8 r11 = r8;
                                        r11.A00(image, (Pair) r5.A00(AnonymousClass9VM.A0N), (Float) r5.A00(AnonymousClass9VM.A0M), (Long) r5.A00(AnonymousClass9VM.A0O), (Long) r5.A00(AnonymousClass9VM.A0K), (float[]) r5.A00(AnonymousClass9VM.A0Q), z, false);
                                    } catch (RuntimeException unused) {
                                    }
                                }
                            }
                            i++;
                        } while (i < 3);
                        return;
                    }
                    return;
                }
                List list = r1.A00;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C202339lr) list.get(i2)).BYr(r8);
                }
                AnonymousClass9S8 r42 = this.A09;
                if (r42.A0C != null) {
                    int i3 = 0;
                    while (true) {
                        AnonymousClass9RE[] r12 = r42.A0C;
                        if (i3 >= r12.length) {
                            break;
                        }
                        AnonymousClass9RE r13 = r12[i3];
                        ByteBuffer byteBuffer = r13.A02;
                        if (byteBuffer != null) {
                            byteBuffer.clear();
                            r13.A02 = null;
                        }
                        i3++;
                    }
                    r42.A0C = null;
                }
                r42.A0A = null;
                r42.A0B = null;
                r42.A05 = null;
                r42.A08 = null;
                r42.A06 = null;
                r42.A07 = null;
                this.A00.close();
                this.A00 = null;
            }
        }
    }
}
