package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2xm  reason: invalid class name and case insensitive filesystem */
public final class C59962xm {
    public final C64393Dh A00;
    public final C33121sT A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A01(java.lang.String r6, byte[] r7) {
        /*
            r5 = this;
            r4 = 0
            X.1sT r3 = r5.A01     // Catch:{ OutOfMemoryError -> 0x005b }
            if (r6 != 0) goto L_0x0026
            java.io.ByteArrayInputStream r2 = X.AnonymousClass0x9.A0d(r7)     // Catch:{ OutOfMemoryError -> 0x005b }
            java.security.MessageDigest r0 = X.AnonymousClass0x7.A0t()     // Catch:{ all -> 0x001c }
            X.C615131b.A02(r2, r0)     // Catch:{ all -> 0x001c }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x001c }
            java.lang.String r6 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x001c }
            X.C162457s7.A0D(r6)     // Catch:{ all -> 0x001c }
            goto L_0x0023
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ OutOfMemoryError -> 0x005b }
            throw r0     // Catch:{ OutOfMemoryError -> 0x005b }
        L_0x0023:
            r2.close()     // Catch:{ OutOfMemoryError -> 0x005b }
        L_0x0026:
            X.0Qw r0 = r3.A00     // Catch:{ OutOfMemoryError -> 0x005b }
            java.lang.Object r1 = r0.A04(r6)     // Catch:{ OutOfMemoryError -> 0x005b }
            X.0QL r1 = (X.AnonymousClass0QL) r1     // Catch:{ OutOfMemoryError -> 0x005b }
            if (r1 != 0) goto L_0x004f
            int r0 = r7.length     // Catch:{ OutOfMemoryError -> 0x005b }
            long r1 = (long) r0     // Catch:{ OutOfMemoryError -> 0x005b }
            X.0Qw r0 = r3.A01     // Catch:{ OutOfMemoryError -> 0x005b }
            java.lang.Object r0 = r0.A04(r6)     // Catch:{ OutOfMemoryError -> 0x005b }
            if (r0 != 0) goto L_0x0045
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r7)     // Catch:{ OutOfMemoryError -> 0x005b }
            org.json.JSONObject r0 = r3.A09(r0, r6, r1)     // Catch:{ OutOfMemoryError -> 0x005b }
            if (r0 != 0) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            java.lang.String r0 = X.C18290x4.A0o(r0)     // Catch:{ OutOfMemoryError -> 0x005b }
            X.0QL r1 = r3.A06(r0, r6)     // Catch:{ OutOfMemoryError -> 0x005b }
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x005a
            X.01G r0 = new X.01G     // Catch:{ OutOfMemoryError -> 0x005b }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x005b }
            r0.A0G(r1)     // Catch:{ OutOfMemoryError -> 0x005b }
            return r0
        L_0x005a:
            return r4
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59962xm.A01(java.lang.String, byte[]):android.graphics.drawable.Drawable");
    }

    public final AnonymousClass330 A02(String str) {
        try {
            JSONObject A08 = this.A01.A08(AnonymousClass002.A0B(str), (String) null);
            if (A08 == null) {
                return null;
            }
            return AnonymousClass330.A00(A08.getJSONObject("metadata").getJSONObject("customProps"));
        } catch (JSONException e) {
            C18260x0.A17("LottieUtils/getMetadataFromPath error getting metadata json ", AnonymousClass001.A0o(), e);
            return null;
        } catch (IOException e2) {
            C18260x0.A17("LottieUtils/getMetadataFromPath exception retrieving lottie file ", AnonymousClass001.A0o(), e2);
            return null;
        }
    }

    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C162457s7.A0D(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(0);
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        canvas.save();
        canvas.scale(f / ((float) Math.max(drawable.getIntrinsicWidth(), 1)), f2 / ((float) Math.max(drawable.getIntrinsicHeight(), 1)));
        drawable.draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    public C59962xm(C64393Dh r1, C33121sT r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
