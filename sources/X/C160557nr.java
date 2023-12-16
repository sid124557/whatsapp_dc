package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7nr  reason: invalid class name and case insensitive filesystem */
public class C160557nr {
    public static final Object A06 = AnonymousClass002.A0D();
    public static final ArrayDeque A07 = AnonymousClass6CA.A0a();
    public Handler A00;
    public boolean A01;
    public final MediaCodec A02;
    public final HandlerThread A03;
    public final C157987jF A04;
    public final AtomicReference A05 = new AtomicReference();

    public C160557nr(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C157987jF r0 = new C157987jF();
        this.A02 = mediaCodec;
        this.A03 = handlerThread;
        this.A04 = r0;
    }

    public static AnonymousClass7NT A00() {
        AnonymousClass7NT r0;
        ArrayDeque arrayDeque = A07;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                r0 = new AnonymousClass7NT();
            } else {
                r0 = (AnonymousClass7NT) arrayDeque.removeFirst();
            }
        }
        return r0;
    }

    public void A01() {
        if (this.A01) {
            try {
                Handler handler = this.A00;
                handler.getClass();
                handler.removeCallbacksAndMessages((Object) null);
                A02();
            } catch (InterruptedException e) {
                C18300x5.A11();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void A02() {
        C157987jF r2 = this.A04;
        r2.A00();
        Handler handler = this.A00;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        synchronized (r2) {
            while (!r2.A00) {
                r2.wait();
            }
        }
    }

    public void A03(C150147Pk r8, int i, long j) {
        int length;
        int length2;
        int length3;
        int length4;
        Throwable th = (Throwable) this.A05.getAndSet((Object) null);
        if (th == null) {
            AnonymousClass7NT A002 = A00();
            A002.A01 = i;
            A002.A02 = 0;
            A002.A03 = j;
            A002.A00 = 0;
            MediaCodec.CryptoInfo cryptoInfo = A002.A04;
            cryptoInfo.numSubSamples = r8.A03;
            int[] iArr = r8.A06;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, length4);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = r8.A07;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = r8.A05;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, length2);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = r8.A04;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = r8.A02;
            if (Util.A00 >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(r8.A01, r8.A00));
            }
            C18290x4.A1C(this.A00, A002, 1);
            return;
        }
        throw th;
    }
}
