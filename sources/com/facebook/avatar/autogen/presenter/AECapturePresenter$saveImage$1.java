package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass4GR;
import X.AnonymousClass82E;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1", f = "AECapturePresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$saveImage$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ byte[] $data;
    public final /* synthetic */ int $frameHeight;
    public final /* synthetic */ int $frameWidth;
    public final /* synthetic */ int $rotation;
    public int label;
    public final /* synthetic */ AnonymousClass82E this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$saveImage$1(Rect rect, AnonymousClass82E r3, C84814Du r4, byte[] bArr, int i, int i2, int i3) {
        super(r4, 2);
        this.this$0 = r3;
        this.$data = bArr;
        this.$frameWidth = i;
        this.$frameHeight = i2;
        this.$cropRect = rect;
        this.$rotation = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r2 = "AECapturePresenter"
            int r0 = r14.label
            if (r0 != 0) goto L_0x00fa
            X.C57682u2.A01(r15)
            X.82E r0 = r14.this$0
            X.7yZ r0 = r0.A03
            java.lang.String r0 = r0.A00
            byte[] r8 = r14.$data
            r9 = 17
            int r10 = r14.$frameWidth
            int r11 = r14.$frameHeight
            r12 = 0
            android.graphics.YuvImage r7 = new android.graphics.YuvImage
            r7.<init>(r8, r9, r10, r11, r12)
            java.io.ByteArrayOutputStream r6 = X.AnonymousClass0x9.A0e()
            int r3 = r14.$frameWidth
            int r1 = r14.$frameHeight
            int r1 = java.lang.Math.min(r3, r1)
            r5 = 1137180672(0x43c80000, float:400.0)
            float r1 = (float) r1
            float r5 = r5 / r1
            android.graphics.Rect r1 = r14.$cropRect     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r4 = 100
            r7.compressToJpeg(r1, r4, r6)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            byte[] r3 = r6.toByteArray()     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            X.C162457s7.A0D(r3)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r12.<init>()     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            int r1 = r14.$rotation     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            float r1 = (float) r1     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r12.postRotate(r1)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r12.postScale(r5, r5)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            int r1 = r3.length     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r8 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r3, r8, r1)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            android.graphics.Rect r1 = r14.$cropRect     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            int r10 = r1.width()     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            android.graphics.Rect r1 = r14.$cropRect     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            int r11 = r1.height()     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            r13 = 1
            r9 = r8
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            X.C162457s7.A0D(r3)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            java.io.FileOutputStream r5 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            X.82E r1 = r14.this$0     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00c3 }
            r3.compress(r0, r4, r5)     // Catch:{ all -> 0x00c3 }
            X.7lC r7 = r1.A04     // Catch:{ all -> 0x00c3 }
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x00c3 }
            X.7yZ r3 = r7.A07     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x00c3 }
            r4 = 0
            if (r0 == 0) goto L_0x0093
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x00c3 }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "selfie_photo"
            r6.put(r0, r1)     // Catch:{ all -> 0x00c3 }
        L_0x0093:
            boolean r0 = r3.A01     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b0
            X.9oA r0 = r7.A03     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x009e
            r0.pause()     // Catch:{ all -> 0x00c3 }
        L_0x009e:
            java.lang.String r0 = "onSuccessTimer"
            java.util.Timer r4 = new java.util.Timer     // Catch:{ all -> 0x00c3 }
            r4.<init>(r0, r8)     // Catch:{ all -> 0x00c3 }
            X.8Tu r3 = new X.8Tu     // Catch:{ all -> 0x00c3 }
            r3.<init>(r7, r6)     // Catch:{ all -> 0x00c3 }
            r0 = 800(0x320, double:3.953E-321)
            r4.schedule(r3, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bf
        L_0x00b0:
            X.46A r0 = X.AnonymousClass788.A00     // Catch:{ all -> 0x00c3 }
            X.4C6 r3 = X.AnonymousClass349.A02(r0)     // Catch:{ all -> 0x00c3 }
            com.facebook.avatar.autogen.view.AESelfieViewProvider$onSelfieCaptured$2 r1 = new com.facebook.avatar.autogen.view.AESelfieViewProvider$onSelfieCaptured$2     // Catch:{ all -> 0x00c3 }
            r1.<init>(r7, r6, r4)     // Catch:{ all -> 0x00c3 }
            r0 = 3
            X.C616131n.A02(r4, r1, r3, r4, r0)     // Catch:{ all -> 0x00c3 }
        L_0x00bf:
            r5.close()     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            goto L_0x00f7
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
            throw r0     // Catch:{ IOException -> 0x00ca, IllegalArgumentException -> 0x00d7 }
        L_0x00ca:
            r1 = move-exception
            java.lang.String r0 = "Failed to save image to file"
            X.C162477s9.A0A(r2, r0, r1)
            X.82E r0 = r14.this$0
            X.7lC r0 = r0.A04
            X.6xG r2 = X.C142476xG.SAVE_IMAGE
            goto L_0x00e3
        L_0x00d7:
            r1 = move-exception
            java.lang.String r0 = "Failed to create image from frame"
            X.C162477s9.A0A(r2, r0, r1)
            X.82E r0 = r14.this$0
            X.7lC r0 = r0.A04
            X.6xG r2 = X.C142476xG.CREATE_IMAGE
        L_0x00e3:
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            X.7H4 r0 = r0.A08
            java.lang.String r3 = r2.key
            X.C162457s7.A0J(r3, r1)
            X.7bI r2 = r0.A00
            X.84O r1 = r0.A01
            r0 = 36
            X.C154237cq.A00(r2, r1, r3, r0)
        L_0x00f7:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r10) {
        return new AECapturePresenter$saveImage$1(this.$cropRect, this.this$0, r10, this.$data, this.$frameWidth, this.$frameHeight, this.$rotation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
