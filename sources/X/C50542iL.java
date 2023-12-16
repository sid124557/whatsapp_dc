package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.view.View;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2iL  reason: invalid class name and case insensitive filesystem */
public class C50542iL {
    public C34141uI A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C64393Dh A02;
    public final C54292oU A03;
    public final C620733j A04;
    public final C61072zf A05;
    public final AnonymousClass5Y0 A06;
    public final AnonymousClass1VX A07;
    public final C66843Mz A08;
    public final C55972rD A09;
    public final AnonymousClass33O A0A;
    public final AnonymousClass33Q A0B;
    public final AnonymousClass7IT A0C = new AnonymousClass7IT(this);
    public final AtomicInteger A0D = new AtomicInteger();

    public synchronized void A01(View view, C624134x r14, AnonymousClass7O7 r15, C185528tp r16, Object obj, boolean z) {
        View view2;
        C50172hk r4;
        C624134x r6 = r14;
        synchronized (this) {
            LinkedBlockingDeque linkedBlockingDeque = this.A0C.A00;
            Iterator it = linkedBlockingDeque.iterator();
            while (true) {
                view2 = view;
                if (!it.hasNext()) {
                    break;
                }
                C50172hk r2 = (C50172hk) it.next();
                if (r2.A00 == view) {
                    linkedBlockingDeque.remove(r2);
                }
            }
            Iterator it2 = linkedBlockingDeque.iterator();
            while (true) {
                Object obj2 = obj;
                if (it2.hasNext()) {
                    C50172hk r3 = (C50172hk) it2.next();
                    if (r3.A01.A1J.equals(r14.A1J) && r3.A04.equals(obj2) && r3.A00 == view) {
                        break;
                    }
                } else {
                    AnonymousClass7O7 r7 = r15;
                    C185528tp r8 = r16;
                    boolean z2 = z;
                    if (r14 instanceof C30471mV) {
                        C30471mV r62 = (C30471mV) r6;
                        AnonymousClass33C r42 = r62.A01;
                        if (r42 != null) {
                            if (!r42.A0R || r42.A0F == null || r42.A03()) {
                                r42.A0Z = false;
                            } else if (!r42.A0Z) {
                                r42.A0Z = true;
                                Handler handler = this.A01;
                                Objects.requireNonNull(r15);
                                handler.post(new C117095rN(r15, 30));
                            }
                            if (r42.A0F != null || (r62 instanceof AnonymousClass1nE) || (r62 instanceof AnonymousClass1n2) || (r62 instanceof C31951p9) || (r62 instanceof C31971pB)) {
                                if (!(r62 instanceof AnonymousClass4DU)) {
                                    r4 = new C50172hk(view2, r62, r7, r8, this, obj2, z2);
                                }
                            }
                        }
                    } else if (r14 instanceof C30481mW) {
                        if (r14.A0l == null) {
                            if (r14.A0r() != null) {
                                if (r14.A0r().A05 == null) {
                                }
                            }
                        }
                        r4 = new C50172hk(view2, r6, r7, r8, this, obj2, z2);
                    }
                    linkedBlockingDeque.offer(r4);
                    if (this.A00 == null) {
                        C34141uI r43 = new C34141uI(this.A02, this.A04, this.A06, this.A0B, this);
                        this.A00 = r43;
                        r43.start();
                    }
                }
            }
        }
    }

    public final Bitmap A00(AnonymousClass33C r23, C50172hk r24, File file, int[] iArr) {
        double sqrt;
        int i;
        InputStream inputStream;
        AnonymousClass5LM r0;
        C50172hk r5 = r24;
        int BD5 = r5.A03.BD5();
        float f = AnonymousClass000.A0B(r5.A00.getContext()).density;
        if (f < 1.0f) {
            sqrt = 1.0d;
        } else {
            sqrt = Math.sqrt((double) (f - 0.75f)) + 0.5d;
        }
        if (BD5 == 0) {
            Log.e("MessageThumbsThread/ getting thumb for 0 size");
            i = Integer.MAX_VALUE;
        } else {
            i = (int) (((double) BD5) / sqrt);
        }
        Bitmap bitmap = null;
        boolean z = false;
        long j = 0;
        int i2 = 4;
        int[] iArr2 = iArr;
        AnonymousClass33C r9 = r23;
        if (iArr != null) {
            C55972rD r02 = this.A09;
            String str = r9.A0I;
            if (str == null || (r0 = r02.A0J.A02(str, 1)) == null) {
                r0 = null;
            }
            if (r0 != null) {
                long j2 = r0.A0A;
                for (int i3 = 0; i3 < iArr2.length; i3++) {
                    int i4 = iArr[i3];
                    if (((long) i4) + j >= j2) {
                        break;
                    }
                    j += (long) i4;
                }
                if (j <= ((long) iArr[0])) {
                    if (r5.A05) {
                        i2 = 16;
                    }
                    z = true;
                }
            }
            return bitmap;
        }
        File file2 = file;
        if (iArr == null) {
            try {
                inputStream = AnonymousClass0x9.A0g(file2);
            } catch (IOException e) {
                Log.d("MessageThumbsThread/bitmap-decode/IOException", e);
            } catch (OutOfMemoryError e2) {
                if (!AnonymousClass34L.A01()) {
                    Log.e("MessageThumbsThread/bitmap-decode/OutOfMemory avoided");
                    return bitmap;
                }
                throw e2;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            inputStream = AnonymousClass75L.A00(file2, j);
        }
        AnonymousClass7KE A042 = C107245ax.A04((AnonymousClass5QA) null, new AnonymousClass5WB(i, 2), inputStream, false);
        bitmap = A042.A02;
        if (r9.A06 == 0 && r9.A08 == 0 && A042.A00 != 0 && A042.A01 != 0) {
            C107655bf.A0a(r9, file2);
        }
        if (bitmap != null) {
            Matrix A0J = C107655bf.A0J(new AnonymousClass0YU(file2.getAbsolutePath()).A0G(1));
            if (A0J != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A0J, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                }
                bitmap = createBitmap;
            }
            if (z && bitmap != null) {
                FilterUtils.blurNative(bitmap, i2, 2);
            }
        }
        inputStream.close();
        return bitmap;
        throw th;
    }

    public C50542iL(C64393Dh r2, C54292oU r3, C620733j r4, C61072zf r5, AnonymousClass5Y0 r6, AnonymousClass1VX r7, C66843Mz r8, C55972rD r9, AnonymousClass33O r10, AnonymousClass33Q r11) {
        this.A07 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = r6;
        this.A09 = r9;
        this.A05 = r5;
        this.A04 = r4;
        this.A0B = r11;
        this.A0A = r10;
        this.A08 = r8;
    }
}
