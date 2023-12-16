package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.lang.ref.WeakReference;

/* renamed from: X.1tJ  reason: invalid class name and case insensitive filesystem */
public final class C33551tJ extends AnonymousClass5ZM {
    public final AnonymousClass319 A00;
    public final C29431io A01;
    public final AnonymousClass1n2 A02;
    public final C989053r A03;
    public final C33141sV A04;
    public final WeakReference A05;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[Catch:{ all -> 0x00fb, all -> 0x0100, IOException -> 0x00c0, all -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc A[SYNTHETIC, Splitter:B:50:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            X.319 r7 = r15.A00     // Catch:{ IOException -> 0x010f }
            X.1n2 r6 = r15.A02     // Catch:{ IOException -> 0x010f }
            X.7EC r9 = new X.7EC     // Catch:{ IOException -> 0x010f }
            r9.<init>(r15)     // Catch:{ IOException -> 0x010f }
            X.C626936e.A00()     // Catch:{ IOException -> 0x010f }
            X.3dV r0 = r7.A0A     // Catch:{ IOException -> 0x010f }
            X.4Fq r14 = r0.A04()     // Catch:{ IOException -> 0x010f }
            X.33C r5 = X.C30471mV.A00(r6)     // Catch:{ all -> 0x0105 }
            X.2Y6 r1 = r7.A07     // Catch:{ all -> 0x0105 }
            java.io.File r0 = r5.A0F     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0105 }
            int r0 = r1.A00(r0)     // Catch:{ all -> 0x0105 }
            if (r0 <= 0) goto L_0x0042
            X.3Dh r8 = r7.A01     // Catch:{ all -> 0x0105 }
            X.2y5 r3 = r7.A0D     // Catch:{ all -> 0x0105 }
            java.io.File r2 = r5.A0F     // Catch:{ all -> 0x0105 }
            X.38t r1 = X.C633138t.A0C     // Catch:{ all -> 0x0105 }
            r0 = 2
            java.io.File r4 = X.C107655bf.A0P(r8, r3, r1, r2, r0)     // Catch:{ all -> 0x0105 }
            java.io.File r0 = r5.A0F     // Catch:{ all -> 0x0105 }
            r8.A0a(r0, r4)     // Catch:{ all -> 0x0105 }
        L_0x0036:
            X.1tJ r9 = r9.A00     // Catch:{ all -> 0x0105 }
            r3 = 0
            r1 = 1
            X.C162457s7.A0J(r4, r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r13 = "Orientation"
            java.lang.String r8 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate/recreateThumb"
            goto L_0x0045
        L_0x0042:
            java.io.File r4 = r5.A0F     // Catch:{ all -> 0x0105 }
            goto L_0x0036
        L_0x0045:
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x00c0 }
            X.0YU r12 = new X.0YU     // Catch:{ IOException -> 0x00c0 }
            r12.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00c0 }
            r11 = 1
            int r10 = r12.A0G(r1)     // Catch:{ IOException -> 0x00c0 }
            r2 = 6
            if (r10 == 0) goto L_0x0068
            if (r10 == r1) goto L_0x0068
            r1 = 8
            r0 = 3
            if (r10 == r0) goto L_0x0065
            if (r10 == r2) goto L_0x0063
            if (r10 == r1) goto L_0x0069
            r11 = r10
            goto L_0x0069
        L_0x0063:
            r11 = 3
            goto L_0x0069
        L_0x0065:
            r11 = 8
            goto L_0x0069
        L_0x0068:
            r11 = 6
        L_0x0069:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x00c0 }
            r12.A0Z(r13, r0)     // Catch:{ IOException -> 0x00c0 }
            r12.A0I()     // Catch:{ IOException -> 0x00c0 }
            java.io.ByteArrayOutputStream r10 = X.AnonymousClass0x9.A0e()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x00bb }
            X.53r r2 = r9.A03     // Catch:{ all -> 0x00b4 }
            android.net.Uri r1 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x00b4 }
            r0 = 100
            android.graphics.Bitmap r0 = r2.A0B(r1, r0, r0)     // Catch:{ all -> 0x00b4 }
            byte[] r1 = X.C18320x8.A1Y(r0, r10)     // Catch:{ all -> 0x00b4 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x00b4 }
            r0.recycle()     // Catch:{ all -> 0x00b4 }
            r10.close()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x00bb }
            X.1n2 r8 = r9.A02     // Catch:{ all -> 0x0105 }
            X.30w r0 = r8.A0y()     // Catch:{ all -> 0x0105 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0105 }
            r0.A03(r1)     // Catch:{ all -> 0x0105 }
            X.33C r2 = X.C30471mV.A00(r8)     // Catch:{ all -> 0x0105 }
            long r0 = r4.length()     // Catch:{ all -> 0x0105 }
            r2.A0A = r0     // Catch:{ all -> 0x0105 }
            r2.A02 = r3     // Catch:{ all -> 0x0105 }
            r2.A03 = r3     // Catch:{ all -> 0x0105 }
            X.C107655bf.A0a(r2, r4)     // Catch:{ all -> 0x0105 }
            X.1sV r0 = r9.A04     // Catch:{ all -> 0x0105 }
            r0.A0G(r8)     // Catch:{ all -> 0x0105 }
            r0 = 1
            goto L_0x00c7
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x00bb }
            throw r0     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00c6
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0105 }
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 != 0) goto L_0x00dc
            java.io.File r0 = r5.A0F     // Catch:{ all -> 0x0105 }
            if (r0 == r4) goto L_0x00d8
            boolean r0 = r4.delete()     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "failed to delete media file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0105 }
        L_0x00d8:
            r14.close()     // Catch:{ IOException -> 0x010f }
            goto L_0x0117
        L_0x00dc:
            X.3Yo r2 = r14.Axl()     // Catch:{ all -> 0x0105 }
            java.io.File r0 = r5.A0F     // Catch:{ all -> 0x00fb }
            if (r0 == r4) goto L_0x00eb
            X.30m r0 = r7.A06     // Catch:{ all -> 0x00fb }
            r0.A09(r6, r3, r3)     // Catch:{ all -> 0x00fb }
            r5.A0F = r4     // Catch:{ all -> 0x00fb }
        L_0x00eb:
            X.3Lv r0 = r7.A05     // Catch:{ all -> 0x00fb }
            r0.A0Y(r6)     // Catch:{ all -> 0x00fb }
            r2.A00()     // Catch:{ all -> 0x00fb }
            r2.close()     // Catch:{ all -> 0x0105 }
            r14.close()     // Catch:{ IOException -> 0x010f }
            r0 = 1
            goto L_0x0118
        L_0x00fb:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0105 }
        L_0x0104:
            throw r1     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x010f }
        L_0x010e:
            throw r1     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/doInBackground/rotate"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33551tJ.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C71643cR r0;
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A05.get();
        if (mediaViewFragment != null && !((C89654ea) mediaViewFragment.A0R()).BHW()) {
            AnonymousClass1n2 r2 = this.A02;
            mediaViewFragment.A1k.A0G(r2);
            PhotoView A1J = mediaViewFragment.A1J(r2.A1J);
            if (!(A1J == null || (r0 = mediaViewFragment.A0E) == null)) {
                r0.A01(A1J, r2);
            }
            if (AnonymousClass0x9.A1Q(obj)) {
                this.A01.A0C(r2, 9);
            }
        }
    }

    public C33551tJ(AnonymousClass319 r2, C29431io r3, MediaViewFragment mediaViewFragment, AnonymousClass1n2 r5, C989053r r6, C33141sV r7) {
        C18260x0.A0e(r5, r6, r3, r2);
        C162457s7.A0J(r7, 6);
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r7;
        this.A05 = AnonymousClass0x9.A14(mediaViewFragment);
    }
}
