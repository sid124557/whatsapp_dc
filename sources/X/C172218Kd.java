package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8Kd  reason: invalid class name and case insensitive filesystem */
public class C172218Kd implements Closeable {
    public static final AnonymousClass7Z5 A04;
    public static final AnonymousClass7Z5 A05;
    public static final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public static final AtomicBoolean A07 = C18280x3.A0l();
    public final ParcelFileDescriptor A00;
    public final GifImage A01;
    public final C152947aQ A02;
    public final AnonymousClass6MY A03;

    public static Bitmap A00(File file) {
        C172218Kd A012 = A01(ParcelFileDescriptor.open(file, 268435456), true);
        try {
            Bitmap A052 = A012.A05(0);
            A012.close();
            return A052;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static AnonymousClass7L1 A03(ParcelFileDescriptor parcelFileDescriptor) {
        C172218Kd A012 = A01(parcelFileDescriptor, true);
        try {
            GifImage gifImage = A012.A01;
            AnonymousClass7L1 r0 = new AnonymousClass7L1(gifImage.getWidth(), gifImage.getHeight(), gifImage.isAnimated());
            A012.close();
            return r0;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Bitmap A05(int i) {
        boolean z = true;
        C626936e.A0B(AnonymousClass001.A1U(i));
        GifImage gifImage = this.A01;
        if (i >= gifImage.getFrameCount()) {
            z = false;
        }
        C626936e.A0B(z);
        Bitmap A0Y = C86664Kz.A0Y(gifImage.getWidth(), gifImage.getHeight());
        this.A02.A00(i, A0Y);
        return A0Y;
    }

    static {
        C149227Ln r1 = new C149227Ln();
        r1.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.A03 = true;
        A05 = new AnonymousClass7Z5(r1);
        C149227Ln r12 = new C149227Ln();
        r12.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        A04 = new AnonymousClass7Z5(r12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[SYNTHETIC, Splitter:B:47:0x008b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C172218Kd A01(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = A07
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.ExecutorService r2 = A06
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L_0x0037
            X.8OS r0 = new X.8OS     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            r0.<init>()     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            java.lang.Object r0 = r0.get()     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            boolean r1 = X.AnonymousClass001.A1Z(r0)     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            r0 = 0
            r3.compareAndSet(r0, r1)     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            r2.shutdown()     // Catch:{ RejectedExecutionException -> 0x0032, InterruptedException | ExecutionException -> 0x0029 }
            goto L_0x0037
        L_0x0029:
            r2 = move-exception
            java.lang.String r1 = "Failed to initialize Fresco"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0032:
            java.lang.String r0 = "FrescoGifDecoder.ensureFrescoInitialized(): executor shutdown"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0037:
            boolean r0 = r3.get()
            if (r0 == 0) goto L_0x0099
            r4 = 0
            int r3 = r5.getFd()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            if (r6 == 0) goto L_0x004a
            X.7Z5 r2 = A05     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
        L_0x0046:
            java.lang.Class<com.facebook.animated.gif.GifImage> r1 = com.facebook.animated.gif.GifImage.class
            monitor-enter(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            goto L_0x004d
        L_0x004a:
            X.7Z5 r2 = A04     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            goto L_0x0046
        L_0x004d:
            boolean r0 = com.facebook.animated.gif.GifImage.sInitialized     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            com.facebook.animated.gif.GifImage.sInitialized = r0     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "c++_shared"
            X.C159587m8.A01(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "gifimage"
            X.C159587m8.A01(r0)     // Catch:{ all -> 0x0079 }
        L_0x005e:
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            boolean r0 = r2.A03     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            com.facebook.animated.gif.GifImage r3 = com.facebook.animated.gif.GifImage.nativeCreateFromFileDescriptor(r3, r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            X.7AP r0 = new X.7AP     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007f }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007f }
            X.6MY r2 = new X.6MY     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007f }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007f }
            X.8Kd r0 = new X.8Kd     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0077 }
            r0.<init>(r5, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0077 }
            return r0
        L_0x0077:
            r1 = move-exception
            goto L_0x0081
        L_0x0079:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007c }
        L_0x007c:
            r1 = move-exception
            r2 = r4
            goto L_0x0086
        L_0x007f:
            r1 = move-exception
            r2 = r4
        L_0x0081:
            if (r3 == 0) goto L_0x0086
            r3.dispose()
        L_0x0086:
            X.C624535b.A03(r2)
            if (r5 == 0) goto L_0x0093
            r5.close()     // Catch:{ all -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0093:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0099:
            java.lang.String r0 = "Fresco failed to initialize"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172218Kd.A01(android.os.ParcelFileDescriptor, boolean):X.8Kd");
    }

    public static AnonymousClass7L1 A02(Uri uri, AnonymousClass306 r4, AnonymousClass5UR r5) {
        ParcelFileDescriptor A052;
        if (r5 != null) {
            r4.A01(uri);
            try {
                A052 = r5.A05(uri, "r");
                if (A052 != null) {
                    r4.A02(A052);
                    AnonymousClass7L1 A032 = A03(A052);
                    A052.close();
                    return A032;
                }
                throw AnonymousClass002.A0C(AnonymousClass000.A0P(uri, "gifdecoder/getmetadata/cannot open uri, pfd=null, uri=", AnonymousClass001.A0o()));
            } catch (SecurityException e) {
                Log.e(AnonymousClass000.A0P(uri, "gifdecoder/getmetadata/failed to read uri ", AnonymousClass001.A0o()), e);
                throw new IOException(e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw AnonymousClass002.A0C("gifdecoder/getmetadata/cannot open uri, cr=null");
        }
        throw th;
    }

    public static AnonymousClass7L1 A04(File file) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        try {
            AnonymousClass7L1 A032 = A03(open);
            if (open != null) {
                open.close();
            }
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.82q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.82o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.82q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.82q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.82q} */
    /* JADX WARNING: type inference failed for: r11v5, types: [X.82p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6D4 A06(android.content.Context r23) {
        /*
            r22 = this;
            java.lang.Class<X.7PY> r4 = X.AnonymousClass7PY.class
            monitor-enter(r4)
            X.7PY r0 = X.AnonymousClass7PY.A08     // Catch:{ all -> 0x0340 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0043
            android.content.Context r2 = r23.getApplicationContext()
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.7Lo r1 = new X.7Lo
            r1.<init>(r2)
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A01 = r0
            X.7QO r3 = new X.7QO
            r3.<init>(r1)
            monitor-enter(r4)
            X.7PY r0 = X.AnonymousClass7PY.A08     // Catch:{ all -> 0x0340 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."
            X.8vJ r1 = X.C161577py.A00     // Catch:{ all -> 0x0340 }
            r0 = 5
            boolean r0 = r1.BI0(r0)     // Catch:{ all -> 0x0340 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r4.getSimpleName()     // Catch:{ all -> 0x0340 }
            r1.BsJ(r0, r2)     // Catch:{ all -> 0x0340 }
        L_0x003b:
            X.7PY r0 = new X.7PY     // Catch:{ all -> 0x0340 }
            r0.<init>(r3)     // Catch:{ all -> 0x0340 }
            X.AnonymousClass7PY.A08 = r0     // Catch:{ all -> 0x0340 }
            monitor-exit(r4)
        L_0x0043:
            X.7PY r8 = X.AnonymousClass7PY.A08
            java.lang.String r0 = "ImagePipelineFactory was not initialized!"
            X.C153877cA.A00(r8, r0)
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r4 = r8.A00
            if (r4 != 0) goto L_0x0136
            X.7iw r14 = r8.A01
            if (r14 != 0) goto L_0x0084
            X.7QO r1 = r8.A06
            X.7FW r5 = r1.A0F
            X.7FX r0 = r8.A04
            if (r0 != 0) goto L_0x0064
            X.7JB r0 = r1.A0D
            X.7cC r0 = r0.A02
            X.7FX r0 = X.AnonymousClass71Q.A00(r5, r0)
            r8.A04 = r0
        L_0x0064:
            X.7AS r4 = r8.A05
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            X.6Mb r3 = r5.A00
            if (r3 != 0) goto L_0x007d
            X.7PM r0 = r5.A01
            X.8gM r2 = r0.A00
            X.7gp r1 = r0.A01
            X.8vf r0 = r0.A05
            X.6Mb r3 = new X.6Mb
            r3.<init>(r2, r1, r0)
            r5.A00 = r3
        L_0x007d:
            X.6MX r14 = new X.6MX
            r14.<init>(r4, r3)
            r8.A01 = r14
        L_0x0084:
            X.7QO r0 = r8.A06
            X.8gU r13 = r0.A0C
            X.8xM r12 = r8.A03
            if (r12 != 0) goto L_0x009e
            X.71L r3 = r0.A07
            X.8kt r2 = r0.A03
            X.8gT r1 = r0.A09
            X.83k r0 = new X.83k
            r0.<init>(r3)
            X.83g r12 = new X.83g
            r12.<init>(r2, r1, r0)
            r8.A03 = r12
        L_0x009e:
            r0 = 40
            X.7NO r11 = r8.A02
            if (r11 != 0) goto L_0x00bf
            long r1 = X.AnonymousClass6C8.A0K()
            r3 = 100
            long r1 = r1 / r3
            long r3 = (long) r0
            long r1 = r1 * r3
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 / r3
            int r0 = (int) r1
            X.7NO r11 = X.AnonymousClass7NO.A04
            if (r11 != 0) goto L_0x00bd
            X.7NO r11 = new X.7NO
            r11.<init>(r0)
            X.AnonymousClass7NO.A04 = r11
        L_0x00bd:
            r8.A02 = r11
        L_0x00bf:
            r20 = 0
            r19 = 0
            r10 = 10000(0x2710, float:1.4013E-41)
            r9 = 30
            r18 = 3
            boolean r0 = X.C1441970k.A01
            if (r0 != 0) goto L_0x0129
            r17 = 1
            java.lang.Class<com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl> r2 = com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.class
            r7 = 9
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ all -> 0x0123 }
            java.lang.Class<X.7iw> r0 = X.C157827iw.class
            r1[r19] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class<X.8gU> r0 = X.C177808gU.class
            r1[r17] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class<X.8xM> r0 = X.C187528xM.class
            r16 = 2
            r1[r16] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class<X.7NO> r0 = X.AnonymousClass7NO.class
            r1[r18] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0123 }
            r15 = 4
            r1[r15] = r0     // Catch:{ all -> 0x0123 }
            r6 = 5
            r1[r6] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0123 }
            r5 = 6
            r1[r5] = r0     // Catch:{ all -> 0x0123 }
            r4 = 7
            r1[r4] = r0     // Catch:{ all -> 0x0123 }
            java.lang.Class<X.8yb> r0 = X.C188258yb.class
            r3 = 8
            r1[r3] = r0     // Catch:{ all -> 0x0123 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ all -> 0x0123 }
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0V(r14, r13, r7)     // Catch:{ all -> 0x0123 }
            r1[r16] = r12     // Catch:{ all -> 0x0123 }
            r1[r18] = r11     // Catch:{ all -> 0x0123 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0123 }
            r1[r15] = r0     // Catch:{ all -> 0x0123 }
            r1[r6] = r0     // Catch:{ all -> 0x0123 }
            X.C86604Kt.A1X(r1, r10, r5, r9, r4)     // Catch:{ all -> 0x0123 }
            r1[r3] = r20     // Catch:{ all -> 0x0123 }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x0123 }
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r1 = (com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl) r1     // Catch:{ all -> 0x0123 }
            X.C1441970k.A00 = r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r0 = X.C1441970k.A00
            if (r0 == 0) goto L_0x0129
            X.C1441970k.A01 = r17
        L_0x0129:
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r4 = X.C1441970k.A00
            r8.A00 = r4
            if (r4 != 0) goto L_0x0136
            java.lang.String r0 = "Failed to create gif drawable, no drawable factory"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0136:
            X.7QH r7 = r4.A03
            if (r7 != 0) goto L_0x01b4
            r1 = 2
            X.72w r9 = new X.72w
            r9.<init>(r1)
            X.8yb r3 = r4.A01
            if (r3 != 0) goto L_0x014f
            X.8gU r0 = r4.A09
            X.83m r0 = (X.C1679683m) r0
            java.util.concurrent.Executor r0 = r0.A01
            X.6Kw r3 = new X.6Kw
            r3.<init>(r0)
        L_0x014f:
            r0 = 3
            X.72w r10 = new X.72w
            r10.<init>(r0)
            X.8kt r11 = X.AnonymousClass78I.A00
            X.741 r8 = new X.741
            r8.<init>(r4, r1)
            X.7AN r2 = r4.A02
            if (r2 != 0) goto L_0x0167
            X.7AN r2 = new X.7AN
            r2.<init>(r4)
            r4.A02 = r2
        L_0x0167:
            X.3fW r21 = X.C73453fW.A01
            if (r21 != 0) goto L_0x0172
            X.3fW r21 = new X.3fW
            r21.<init>()
            X.C73453fW.A01 = r21
        L_0x0172:
            com.facebook.common.time.RealtimeSinceBootClock r16 = com.facebook.common.time.RealtimeSinceBootClock.A00
            X.7iw r6 = r4.A06
            X.8xM r1 = r4.A08
            boolean r0 = r4.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5 = 1
            X.741 r12 = new X.741
            r12.<init>(r0, r5)
            boolean r0 = r4.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.741 r13 = new X.741
            r13.<init>(r0, r5)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.741 r14 = new X.741
            r14.<init>(r0, r5)
            int r0 = r4.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.741 r15 = new X.741
            r15.<init>(r0, r5)
            X.7QH r7 = new X.7QH
            r17 = r2
            r18 = r6
            r19 = r1
            r20 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.A03 = r7
        L_0x01b4:
            r0 = r22
            X.6MY r1 = r0.A03
            monitor-enter(r1)
            monitor-exit(r1)
            monitor-enter(r1)
            X.7AP r2 = r1.A00     // Catch:{ all -> 0x033d }
            monitor-exit(r1)
            r2.getClass()
            r11 = 0
            r12 = 0
            X.8v8 r0 = r2.A00
            int r4 = r0.getWidth()
            int r1 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0, r0, r4, r1)
            X.7AN r0 = r7.A0A
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r0 = r0.A00
            X.71K r1 = r0.A04
            if (r1 != 0) goto L_0x01e2
            X.71K r1 = new X.71K
            r1.<init>()
            r0.A04 = r1
        L_0x01e2:
            boolean r0 = r0.A0A
            X.7kJ r4 = new X.7kJ
            r4.<init>(r3, r2, r1, r0)
            X.82j r9 = new X.82j
            r9.<init>(r4)
            X.8kt r3 = r7.A07
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x02d0
            X.8kt r0 = r7.A01
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass001.A0K(r0)
            X.7R7 r1 = new X.7R7
            r1.<init>(r0)
            X.8kt r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.7NO r0 = (X.AnonymousClass7NO) r0
            X.82m r10 = new X.82m
            r10.<init>(r1, r2, r0)
        L_0x0216:
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            X.7Ti r13 = new X.7Ti
            r13.<init>(r10, r4, r0)
            X.8kt r0 = r7.A05
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 <= 0) goto L_0x023f
            X.82p r11 = new X.82p
            r11.<init>(r0)
            X.7iw r2 = r7.A0B
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.concurrent.ExecutorService r0 = r7.A0D
            X.7NW r12 = new X.7NW
            r12.<init>(r1, r13, r2, r0)
        L_0x023f:
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0279
            X.8kt r1 = r7.A02
            java.lang.Object r0 = r1.get()
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 == 0) goto L_0x02af
            java.lang.Object r0 = r1.get()
            int r18 = X.AnonymousClass001.A0K(r0)
            X.7iw r0 = r7.A0B
            X.7FR r1 = new X.7FR
            r1.<init>(r13, r0)
            X.8kt r0 = r7.A04
            java.lang.Object r0 = r0.get()
            boolean r19 = X.AnonymousClass001.A1Z(r0)
            X.82q r11 = new X.82q
            r14 = r11
            r15 = r9
            r16 = r10
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0279:
            X.7iw r14 = r7.A0B
            java.lang.Object r0 = r3.get()
            boolean r15 = X.AnonymousClass001.A1Z(r0)
            X.82i r8 = new X.82i
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.8qV r2 = r7.A09
            java.util.concurrent.ScheduledExecutorService r0 = r7.A0E
            X.82h r1 = new X.82h
            r1.<init>(r2, r8, r8, r0)
            X.8kt r0 = r7.A08
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x02a9
            X.6D3 r2 = new X.6D3
            r2.<init>(r1)
        L_0x02a2:
            boolean r0 = r2 instanceof X.AnonymousClass6D4
            if (r0 == 0) goto L_0x032e
            X.6D4 r2 = (X.AnonymousClass6D4) r2
            return r2
        L_0x02a9:
            X.6D4 r2 = new X.6D4
            r2.<init>(r1)
            goto L_0x02a2
        L_0x02af:
            X.7iw r2 = r7.A0B
            X.8kt r0 = r7.A01
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass001.A0K(r0)
            X.7g9 r1 = new X.7g9
            r1.<init>(r2, r0)
            X.8kt r0 = r7.A04
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            X.82o r11 = new X.82o
            r11.<init>(r9, r1, r13, r0)
            goto L_0x0279
        L_0x02d0:
            X.8kt r0 = r7.A03
            java.lang.Object r0 = r0.get()
            int r1 = X.AnonymousClass001.A0K(r0)
            r5 = 1
            if (r1 == r5) goto L_0x030d
            r0 = 2
            if (r1 == r0) goto L_0x02f1
            r0 = 3
            if (r1 == r0) goto L_0x02ea
            X.82k r10 = new X.82k
            r10.<init>()
            goto L_0x0216
        L_0x02ea:
            X.82l r10 = new X.82l
            r10.<init>()
            goto L_0x0216
        L_0x02f1:
            int r2 = r2.hashCode()
            X.8kt r0 = r7.A06
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            X.82C r1 = new X.82C
            r1.<init>(r2, r0)
            X.8xM r0 = r7.A0C
            X.7Lm r2 = new X.7Lm
            r2.<init>(r1, r0)
            r5 = 0
            goto L_0x0327
        L_0x030d:
            int r2 = r2.hashCode()
            X.8kt r0 = r7.A06
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            X.82C r1 = new X.82C
            r1.<init>(r2, r0)
            X.8xM r0 = r7.A0C
            X.7Lm r2 = new X.7Lm
            r2.<init>(r1, r0)
        L_0x0327:
            X.82n r10 = new X.82n
            r10.<init>(r2, r5)
            goto L_0x0216
        L_0x032e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to create gif drawable, incorrect type or null: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x033d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0340:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172218Kd.A06(android.content.Context):X.6D4");
    }

    public void close() {
        this.A01.dispose();
        C624535b.A03(this.A03);
        ParcelFileDescriptor parcelFileDescriptor = this.A00;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public C172218Kd(ParcelFileDescriptor parcelFileDescriptor, GifImage gifImage, AnonymousClass6MY r9) {
        this.A00 = parcelFileDescriptor;
        this.A03 = r9;
        this.A01 = gifImage;
        AnonymousClass71K r5 = new AnonymousClass71K();
        this.A02 = new C152947aQ(new C158637kJ(new Rect(0, 0, gifImage.getWidth(), gifImage.getHeight()), new AnonymousClass7AP(gifImage), r5, false), new AnonymousClass91O(this, 1), false);
    }

    public C172218Kd() {
    }
}
