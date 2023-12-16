package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1r4  reason: invalid class name and case insensitive filesystem */
public class C32521r4 extends C623834u {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public final C64393Dh A03;
    public final C69263Wi A04;
    public final C56972sr A05;
    public final C619632y A06;
    public final C23001Qx A07;
    public final C989053r A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32521r4(X.C64393Dh r13, X.C69263Wi r14, X.C56972sr r15, X.AnonymousClass0WN r16, X.AnonymousClass310 r17, X.C56512s6 r18, X.C54292oU r19, X.C48502f0 r20, X.C48092eK r21, X.C619632y r22, X.C23001Qx r23, X.C84924Eg r24, X.C48772fR r25, X.C622634i r26, X.C989053r r27) {
        /*
            r12 = this;
            r11 = r26
            r1 = r12
            r10 = r25
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A04 = r14
            r12.A05 = r15
            r12.A03 = r13
            r0 = r27
            r12.A08 = r0
            r0 = r22
            r12.A06 = r0
            r0 = r23
            r12.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32521r4.<init>(X.3Dh, X.3Wi, X.2sr, X.0WN, X.310, X.2s6, X.2oU, X.2f0, X.2eK, X.32y, X.1Qx, X.4Eg, X.2fR, X.34i, X.53r):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C137676p5 A0G(android.content.Context r11, boolean r12) {
        /*
            r10 = this;
            boolean r1 = X.C107405bG.A0D(r11)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x000c
            boolean r0 = r10.A02
            if (r1 != r0) goto L_0x000e
        L_0x000c:
            if (r12 == 0) goto L_0x0011
        L_0x000e:
            r0 = 0
            r10.A00 = r0
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r10.A00
            r7 = 5
            r6 = 4
            r5 = 1
            r9 = 0
            r4 = 2
            if (r0 != 0) goto L_0x00fb
            r10.A01 = r9
            android.content.res.Resources r8 = r11.getResources()
            java.lang.String r0 = "wallpaper/get globalWallpaper is null"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.io.File r0 = r11.getFilesDir()
            java.lang.String r1 = "wallpaper.jpg"
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r1)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass366.A03(r11, r8, r0)
            r10.A00 = r0
            r3 = 2
            if (r0 == 0) goto L_0x00a6
            r3 = 5
        L_0x003b:
            android.graphics.drawable.Drawable r1 = r10.A00
            if (r1 == 0) goto L_0x00a2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wallpaper/get "
            r2.append(r0)
            int r0 = r1.getIntrinsicWidth()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            android.graphics.drawable.Drawable r0 = r10.A00
            int r0 = r0.getIntrinsicHeight()
            r2.append(r0)
            X.AnonymousClass001.A1L(r2)
            android.graphics.drawable.Drawable r1 = r10.A00
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x009f
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            int r0 = r0.getByteCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0076:
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r2)
        L_0x007a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x007d:
            java.lang.String r8 = "DEFAULT"
            if (r3 == r5) goto L_0x008d
            if (r3 == r4) goto L_0x008d
            if (r3 == r6) goto L_0x009c
            if (r3 == r7) goto L_0x0099
            android.graphics.drawable.Drawable r0 = r10.A00
            if (r0 != 0) goto L_0x008d
            java.lang.String r8 = "NONE"
        L_0x008d:
            android.graphics.drawable.Drawable r2 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.6p5 r0 = new X.6p5
            r0.<init>(r2, r1, r8)
            return r0
        L_0x0099:
            java.lang.String r8 = "DOWNLOADED"
            goto L_0x008d
        L_0x009c:
            java.lang.String r8 = "COLOR_ONLY"
            goto L_0x008d
        L_0x009f:
            java.lang.String r0 = ""
            goto L_0x0076
        L_0x00a2:
            java.lang.String r0 = "wallpaper/get null"
            goto L_0x007a
        L_0x00a6:
            java.io.FileInputStream r0 = r11.openFileInput(r1)     // Catch:{ IOException -> 0x00ca, OutOfMemoryError -> 0x00d0 }
            int r3 = r0.read()     // Catch:{ all -> 0x00be }
            if (r3 != r6) goto L_0x00b5
            int r2 = r0.read()     // Catch:{ all -> 0x00be }
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            r0.close()     // Catch:{ IOException -> 0x00bc, OutOfMemoryError -> 0x00ba }
            goto L_0x00d5
        L_0x00ba:
            r0 = move-exception
            goto L_0x00d2
        L_0x00bc:
            r0 = move-exception
            goto L_0x00cc
        L_0x00be:
            r1 = move-exception
            if (r0 == 0) goto L_0x00c9
            r0.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00ca, OutOfMemoryError -> 0x00d0 }
        L_0x00c9:
            throw r1     // Catch:{ IOException -> 0x00ca, OutOfMemoryError -> 0x00d0 }
        L_0x00ca:
            r0 = move-exception
            r2 = 0
        L_0x00cc:
            com.whatsapp.util.Log.d((java.lang.Throwable) r0)
            goto L_0x00d5
        L_0x00d0:
            r0 = move-exception
            r2 = 0
        L_0x00d2:
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x00d5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wallpaper/get fallback to id:"
            X.C18260x0.A0w(r0, r1, r3)
            if (r3 == r4) goto L_0x00f6
            if (r3 == r5) goto L_0x00f6
            if (r3 != r6) goto L_0x00f3
            android.graphics.drawable.Drawable r0 = X.AnonymousClass366.A01(r11, r2, r9)
        L_0x00e9:
            r10.A00 = r0
            boolean r0 = X.C107405bG.A0D(r11)
            r10.A02 = r0
            r10.A01 = r5
        L_0x00f3:
            r9 = r2
            goto L_0x003b
        L_0x00f6:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass366.A02(r11, r8)
            goto L_0x00e9
        L_0x00fb:
            r3 = 2
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32521r4.A0G(android.content.Context, boolean):X.6p5");
    }

    public final void A0H(Context context, Drawable drawable) {
        FileOutputStream openFileOutput;
        try {
            openFileOutput = context.openFileOutput("wallpaper.jpg", 0);
            ((BitmapDrawable) drawable).getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, openFileOutput);
            if (openFileOutput != null) {
                openFileOutput.close();
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        this.A07.A05();
        return;
        throw th;
    }
}
