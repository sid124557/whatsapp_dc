package X;

/* renamed from: X.5CD  reason: invalid class name */
public class AnonymousClass5CD {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.BitmapFactory.Options r5, byte[] r6, int r7) {
        /*
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            r3 = 0
            int r0 = r6.length     // Catch:{ IllegalArgumentException -> 0x000e }
            android.graphics.BitmapFactory.decodeByteArray(r6, r3, r0, r4)     // Catch:{ IllegalArgumentException -> 0x000e }
            goto L_0x0015
        L_0x000e:
            java.lang.String r0 = "MessageThumbSafeDecoder/isValidThumbnailSize/failed to generate bitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x001e
        L_0x0015:
            int r2 = r4.outWidth
            if (r2 > r7) goto L_0x0022
            int r0 = r4.outHeight
            if (r0 > r7) goto L_0x0022
        L_0x001d:
            r0 = 1
        L_0x001e:
            r1 = 0
            if (r0 != 0) goto L_0x0037
            return r1
        L_0x0022:
            r1 = 300(0x12c, float:4.2E-43)
            if (r2 > r1) goto L_0x0030
            int r0 = r4.outHeight
            if (r0 > r1) goto L_0x0030
            java.lang.String r0 = "MessageThumbSafeDecoder/isValidThumbnailSize/potentially malicious thumb"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x001d
        L_0x0030:
            java.lang.String r0 = "MessageThumbSafeDecoder/isValidThumbnailSize/malicious thumb"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            goto L_0x001e
        L_0x0037:
            int r0 = r6.length     // Catch:{ IllegalArgumentException -> 0x003d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r6, r3, r0, r5)     // Catch:{ IllegalArgumentException -> 0x003d }
            return r0
        L_0x003d:
            java.lang.String r0 = "image-thumb/decodethumbnail/failed to generate bitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5CD.A00(android.graphics.BitmapFactory$Options, byte[], int):android.graphics.Bitmap");
    }
}
