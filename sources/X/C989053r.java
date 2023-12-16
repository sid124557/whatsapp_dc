package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.53r  reason: invalid class name and case insensitive filesystem */
public class C989053r extends C107655bf {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final C61072zf A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass2LH A08;
    public final WebpUtils A09;
    public final AnonymousClass306 A0A;
    public final AnonymousClass4FS A0B;

    public static boolean A06(C55682qk r18, AnonymousClass36E r19, C42162Na r20, File file, File file2, OutputStream outputStream, String str, byte[] bArr, int i, int i2, int i3, long j) {
        C140746uQ r7;
        int i4 = i2;
        long j2 = j;
        try {
            FileInputStream A0T = C107655bf.A0T(r18, file);
            try {
                r7 = new C140746uQ(outputStream, i4);
                C380925o.A00(r20, A0T, r7, bArr, 0, j - 10, 0, (long) i);
                r7.close();
                A0T.close();
                return true;
            } catch (Throwable th) {
                A0T.close();
                throw th;
            }
            throw th;
        } catch (C143306yf e) {
            C18260x0.A0u("CreateProgressiveThumbnail failed  tomatch hash for progressive jpeg thumbnail; mediaHash=", str, AnonymousClass001.A0o(), e);
            r19.A0S(AnonymousClass0x2.A0T(), new int[]{i2}, i3, j2, false);
            file2.delete();
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A09(java.io.File r8, int r9, int r10, boolean r11) {
        /*
            r2 = 0
            r3 = 0
            if (r8 != 0) goto L_0x0016
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0009:
            if (r2 == 0) goto L_0x0011
            byte[] r0 = X.C105495Ve.A00(r2, r9, r11, r3)
            if (r0 != 0) goto L_0x0015
        L_0x0011:
            byte[] r0 = X.C107085af.A04(r8)
        L_0x0015:
            return r0
        L_0x0016:
            X.C172218Kd.A04(r8)     // Catch:{ IOException -> 0x001b }
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002e
            android.graphics.Bitmap r2 = X.C172218Kd.A00(r8)     // Catch:{ IOException | IllegalArgumentException -> 0x0023, Exception -> 0x0027 }
            goto L_0x0009
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x002a:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0009
        L_0x002e:
            r4 = 0
            r6 = 1
            X.8HO r1 = new X.8HO
            r1.<init>(r8)
            r2 = r10
            r7 = r3
            android.graphics.Bitmap r2 = X.C107085af.A00(r1, r2, r3, r4, r6, r7)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989053r.A09(java.io.File, int, int, boolean):byte[]");
    }

    @Deprecated
    public Bitmap A0B(Uri uri, int i, int i2) {
        return A0C(uri, i, i2, true, true);
    }

    public static long A01(File file) {
        AnonymousClass6DM r2;
        try {
            r2 = new AnonymousClass6DM();
            r2.setDataSource(file.getAbsolutePath());
            long parseInt = (long) Integer.parseInt(r2.extractMetadata(20));
            r2.close();
            return parseInt;
        } catch (Exception unused) {
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.net.Uri.Builder r3, android.net.Uri r4, int r5) {
        /*
            java.lang.String r2 = "rotation"
            java.lang.String r0 = r4.getQueryParameter(r2)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r4.getQueryParameter(r2)     // Catch:{ NumberFormatException -> 0x0011 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/combineRotation/invalid rotation (ignored)"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0017:
            r0 = 0
        L_0x0018:
            int r0 = r0 + r5
            int r0 = r0 % 360
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.appendQueryParameter(r2, r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989053r.A03(android.net.Uri$Builder, android.net.Uri, int):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C55682qk r14, X.C64393Dh r15, X.AnonymousClass36E r16, X.C42162Na r17, X.C633138t r18, com.whatsapp.stickers.WebpUtils r19, java.io.File r20, java.lang.String r21, java.lang.String r22, byte[] r23, int r24, int r25, long r26) {
        /*
            r11 = r25
            if (r25 <= 0) goto L_0x00d7
            r9 = r23
            if (r23 == 0) goto L_0x00d7
            boolean r0 = X.AnonymousClass36O.A06(r18)
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r20
            r8 = r21
            r1 = r22
            r10 = r24
            r13 = r26
            if (r0 == 0) goto L_0x0070
            java.io.File r6 = r15.A0W(r8, r1)
            if (r6 == 0) goto L_0x00d7
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x00d7
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00cd }
            r7.<init>(r11)     // Catch:{ IOException -> 0x00cd }
            r12 = 16
            boolean r0 = A06(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0062
            byte[] r1 = r7.toByteArray()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0066 }
            r2 = r19
            r2.A04(r0, r1, r11)     // Catch:{ all -> 0x0066 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "CreateStickerThumbnail created thumbnail; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            r1.append(r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = " size="
            java.lang.String r0 = X.AnonymousClass000.A0N(r6, r0, r1)     // Catch:{ all -> 0x0066 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0066 }
            r7.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00aa
        L_0x0062:
            r7.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00d7
        L_0x0066:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00cd }
        L_0x006f:
            throw r1     // Catch:{ IOException -> 0x00cd }
        L_0x0070:
            java.io.File r6 = r15.A0V(r8, r1)
            if (r6 == 0) goto L_0x00d7
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x00d7
            java.io.FileOutputStream r7 = X.AnonymousClass0x9.A0h(r6)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ba }
            r12 = 2
            boolean r0 = A06(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00ac
            byte[] r0 = X.C107655bf.A04     // Catch:{ all -> 0x00b0 }
            r7.write(r0)     // Catch:{ all -> 0x00b0 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00ac
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "CreateProgressiveThumbnail created thumbnail; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            r1.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " size="
            java.lang.String r0 = X.AnonymousClass000.A0N(r6, r0, r1)     // Catch:{ all -> 0x00b0 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ba }
        L_0x00aa:
            r0 = 1
            return r0
        L_0x00ac:
            r7.close()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ba }
            goto L_0x00d7
        L_0x00b0:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ba }
        L_0x00ba:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CreateProgressiveThumbnail failed;mediaHash="
            goto L_0x00c9
        L_0x00c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CreateProgressiveThumbnail failed could not find file progressive jpeg thumbnail; mediaHash="
        L_0x00c9:
            X.C18260x0.A0u(r0, r8, r1, r2)
            goto L_0x00d7
        L_0x00cd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CreateStickerThumbnail failed; mediaHash="
            X.C18260x0.A0u(r0, r8, r1, r2)
        L_0x00d7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989053r.A05(X.2qk, X.3Dh, X.36E, X.2Na, X.38t, com.whatsapp.stickers.WebpUtils, java.io.File, java.lang.String, java.lang.String, byte[], int, int, long):boolean");
    }

    public static boolean A07(String str) {
        if (str.startsWith("video/") || str.startsWith("image/") || str.startsWith("audio/")) {
            return true;
        }
        return false;
    }

    public static boolean A08(String str) {
        if ("video/mp4".equals(str) || "video/x.looping_mp4".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0222, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0228, code lost:
        throw new java.io.IOException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0229, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022a, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0P(r12, "mediafileutils/getfilefrommediastore/unable to open stream; uri=", X.AnonymousClass001.A0o()), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023c, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0222 A[ExcHandler: SQLiteException | FileNotFoundException | NullPointerException (r0v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:57:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0229 A[ExcHandler: IllegalStateException | SecurityException | UnsupportedOperationException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:57:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0145 A[SYNTHETIC, Splitter:B:68:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01dc A[Catch:{ all -> 0x01fd, all -> 0x0202, all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f6 A[SYNTHETIC, Splitter:B:92:0x01f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0E(android.net.Uri r29) {
        /*
            r28 = this;
            r8 = r28
            X.306 r0 = r8.A0A
            r12 = r29
            r0.A01(r12)
            X.33i r1 = r8.A03
            X.5UR r1 = r1.A0R()
            if (r1 == 0) goto L_0x023d
            java.lang.String r3 = "mediafileutils/getfilefrommediastore"
            X.33M r2 = new X.33M
            r2.<init>((java.lang.String) r3)
            java.lang.String r3 = r12.getScheme()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00ea
            android.net.Uri$Builder r4 = r12.buildUpon()
            java.lang.String r3 = "file"
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri r3 = r3.build()
        L_0x0030:
            java.io.File r4 = X.C627536m.A04(r3)
            if (r4 == 0) goto L_0x0054
            r3 = 0
            android.util.Pair r3 = android.util.Pair.create(r4, r3)
        L_0x003b:
            java.lang.Object r7 = r3.first
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r6 = r3.second
            java.lang.String r6 = (java.lang.String) r6
            if (r7 == 0) goto L_0x00ed
            X.3Dh r3 = r8.A01
            boolean r3 = r3.A0e(r7)
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r7.exists()
            if (r3 == 0) goto L_0x00ed
            return r7
        L_0x0054:
            java.lang.String r7 = "_data"
            java.lang.String r4 = r12.getAuthority()
            java.lang.String r3 = "media"
            boolean r3 = r3.equals(r4)
            r6 = 0
            if (r3 != 0) goto L_0x006f
            java.lang.String r3 = "mediafileutils/findfileinmediastore/not media store"
            com.whatsapp.util.Log.d((java.lang.String) r3)
            java.lang.String r3 = "not_media_store"
            android.util.Pair r3 = android.util.Pair.create(r6, r3)
            goto L_0x003b
        L_0x006f:
            java.lang.String[] r13 = new java.lang.String[]{r7}     // Catch:{ Exception -> 0x00d1 }
            r15 = r6
            r16 = r6
            r11 = r1
            r14 = r6
            android.database.Cursor r5 = r11.A03(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00d1 }
            if (r5 != 0) goto L_0x008a
            java.lang.String r3 = "mediafileutils/findfileinmediastore/no cursor"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "no_cursor"
            android.util.Pair r3 = android.util.Pair.create(r6, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x003b
        L_0x008a:
            boolean r3 = r5.moveToFirst()     // Catch:{ all -> 0x00c5 }
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = "mediafileutils/findfileinmediastore/empty cursor"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "empty_cursor"
            android.util.Pair r3 = android.util.Pair.create(r6, r3)     // Catch:{ all -> 0x00c5 }
            r5.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x003b
        L_0x009f:
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r5, r7)     // Catch:{ all -> 0x00c5 }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00b8
            java.lang.String r3 = "mediafileutils/findfileinmediastore/path is empty"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "empty"
            android.util.Pair r3 = android.util.Pair.create(r6, r3)     // Catch:{ all -> 0x00c5 }
            r5.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x003b
        L_0x00b8:
            java.io.File r3 = X.AnonymousClass002.A0B(r4)     // Catch:{ all -> 0x00c5 }
            android.util.Pair r3 = android.util.Pair.create(r3, r6)     // Catch:{ all -> 0x00c5 }
            r5.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x003b
        L_0x00c5:
            r4 = move-exception
            if (r5 == 0) goto L_0x00d0
            r5.close()     // Catch:{ all -> 0x00cc }
            goto L_0x00d0
        L_0x00cc:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ Exception -> 0x00d1 }
        L_0x00d0:
            throw r4     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            r5 = move-exception
            java.lang.String r3 = "mediafileutils/findfileinmediastore/exception"
            com.whatsapp.util.Log.d(r3, r5)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "e="
            X.C18260x0.A1T(r4, r3, r5)
            java.lang.String r3 = r4.toString()
            android.util.Pair r3 = android.util.Pair.create(r6, r3)
            goto L_0x003b
        L_0x00ea:
            r3 = r12
            goto L_0x0030
        L_0x00ed:
            java.lang.String r3 = "file searched"
            long r20 = r2.A08(r3)
            if (r7 == 0) goto L_0x0107
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r23 = android.os.ParcelFileDescriptor.open(r7, r3)     // Catch:{ Exception -> 0x0107 }
            r24 = 0
            long r26 = r23.getStatSize()     // Catch:{ Exception -> 0x0107 }
            android.content.res.AssetFileDescriptor r22 = new android.content.res.AssetFileDescriptor     // Catch:{ Exception -> 0x0107 }
            r22.<init>(r23, r24, r26)     // Catch:{ Exception -> 0x0107 }
            goto L_0x012d
        L_0x0107:
            java.lang.String r9 = "r"
            android.content.ContentResolver r5 = r1.A02()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            X.2wm r4 = r1.A01     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            X.58S r3 = X.AnonymousClass58S.FILE     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            java.lang.String r1 = r12.getAuthority()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            r4.A00(r3, r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            android.content.res.AssetFileDescriptor r22 = r5.openAssetFileDescriptor(r12, r9)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            if (r22 != 0) goto L_0x012d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/unable to open fd; uri="
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r0, r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            throw r0     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
        L_0x012d:
            java.lang.String r1 = "opened"
            long r14 = r2.A08(r1)     // Catch:{ all -> 0x0218 }
            long r4 = r22.getLength()     // Catch:{ all -> 0x0218 }
            android.os.ParcelFileDescriptor r1 = r22.getParcelFileDescriptor()     // Catch:{ all -> 0x0218 }
            r0.A02(r1)     // Catch:{ all -> 0x0218 }
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r3 = r11
            goto L_0x0157
        L_0x0145:
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x0218 }
            java.lang.String r1 = X.C627536m.A08(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "gif"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r3 = ".gif"
        L_0x0157:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = X.C107655bf.A0U()     // Catch:{ all -> 0x0218 }
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x0218 }
            long r0 = r22.getLength()     // Catch:{ all -> 0x0218 }
            java.io.File r19 = r8.A0F(r3, r0)     // Catch:{ all -> 0x0218 }
            java.io.FileInputStream r13 = r22.createInputStream()     // Catch:{ IOException -> 0x0213 }
            java.io.FileOutputStream r18 = X.AnonymousClass0x9.A0h(r19)     // Catch:{ all -> 0x0207 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "copy/start; size="
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r4)     // Catch:{ all -> 0x01fd }
            long r9 = r2.A08(r0)     // Catch:{ all -> 0x01fd }
            r0 = r18
            X.C627536m.A0I(r13, r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "copy/end"
            long r2 = r2.A08(r0)     // Catch:{ all -> 0x01fd }
            r16 = 10000000(0x989680, double:4.9406565E-317)
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f1
            r16 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f1
            X.2qk r0 = r8.A00     // Catch:{ all -> 0x01fd }
            r17 = r0
            java.lang.String r16 = "mediafileutils/getfilefrommediastore/slow"
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "size="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r8.append(r4)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; find="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r0 = r20
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; open="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r8.append(r14)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; copyStart="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r8.append(r9)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; copyEnd="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r8.append(r2)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; found="
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            r3 = 0
            boolean r0 = X.AnonymousClass000.A1W(r7)
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            if (r6 == 0) goto L_0x01e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "; reason="
            java.lang.String r11 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ all -> 0x01fd }
        L_0x01e6:
            java.lang.String r2 = X.AnonymousClass000.A0X(r11, r8)     // Catch:{ all -> 0x01fd }
            r1 = r17
            r0 = r16
            r1.A0A(r0, r3, r2)     // Catch:{ all -> 0x01fd }
        L_0x01f1:
            r18.close()     // Catch:{ all -> 0x0207 }
            if (r13 == 0) goto L_0x01f9
            r13.close()     // Catch:{ IOException -> 0x0213 }
        L_0x01f9:
            r22.close()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
            return r19
        L_0x01fd:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0202 }
            goto L_0x0206
        L_0x0202:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0207 }
        L_0x0206:
            throw r1     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r1 = move-exception
            if (r13 == 0) goto L_0x0212
            r13.close()     // Catch:{ all -> 0x020e }
            goto L_0x0212
        L_0x020e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0213 }
        L_0x0212:
            throw r1     // Catch:{ IOException -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            X.C627536m.A0O(r19)     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x0218:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x021d }
            goto L_0x0221
        L_0x021d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
        L_0x0221:
            throw r1     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0229, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222, SQLiteException | FileNotFoundException | NullPointerException -> 0x0222 }
        L_0x0222:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0229:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/unable to open stream; uri="
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r0, r1)
            com.whatsapp.util.Log.w(r0, r2)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L_0x023d:
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/no content resolver"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989053r.A0E(android.net.Uri):java.io.File");
    }

    public File A0F(String str, long j) {
        long A032 = this.A06.A03();
        if (j >= 0 && A032 - j > 104857600) {
            return this.A01.A0S(str);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediafileutils/getsharedfileforsize/returning external file; size=");
        A0o.append(j);
        C18270x1.A1B("; internalAvailable=", A0o, A032);
        return C64393Dh.A00(this.A01, str);
    }

    public void A0H(Uri uri, AnonymousClass4FU r9, C1227065k r10) {
        C18270x1.A0w(new AnonymousClass55V(uri, r9, this.A02, this.A05, r10, this), this.A0B);
    }

    public void A0I(File file) {
        AnonymousClass1VX r4 = this.A07;
        if (!r4.A0X(6079) || !C615631i.A02()) {
            try {
                if (this.A01.A0f(file)) {
                    AnonymousClass4FS r3 = this.A0B;
                    Context context = this.A04.A00;
                    Uri fromFile = Uri.fromFile(file);
                    if (r4.A0X(4540)) {
                        C86634Kw.A1Q(r3, context, fromFile, 43);
                    } else {
                        context.sendBroadcast(AnonymousClass0x9.A09("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(fromFile));
                    }
                }
            } catch (IOException e) {
                C18260x0.A0k(file, "mediafileurils/broadcastscanmediaintent/unable to scan file ", AnonymousClass001.A0o(), e);
            }
        } else {
            C86634Kw.A1Q(this.A0B, this, file, 47);
        }
    }

    public void A0J(File file) {
        if (file != null) {
            try {
                if (this.A01.A0e(file)) {
                    C627536m.A0O(file);
                }
            } catch (IOException e) {
                C18260x0.A0k(file, "mediafileutils/unable to delete file ", AnonymousClass001.A0o(), e);
            }
        }
    }

    public C989053r(C55682qk r3, C64393Dh r4, C69263Wi r5, C620633i r6, C54292oU r7, C620733j r8, C61072zf r9, AnonymousClass1VX r10, AnonymousClass2LH r11, WebpUtils webpUtils, AnonymousClass306 r13, AnonymousClass4FS r14) {
        this.A07 = r10;
        this.A04 = r7;
        this.A02 = r5;
        this.A00 = r3;
        this.A0B = r14;
        this.A09 = webpUtils;
        this.A01 = r4;
        this.A06 = r9;
        this.A03 = r6;
        this.A05 = r8;
        this.A08 = r11;
        this.A0A = r13;
        r13.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public static int A00(C30471mV r3, AnonymousClass1R1 r4) {
        int i;
        C633138t A022 = AnonymousClass36O.A02(r3);
        AnonymousClass2z0 r2 = r3.A1J;
        boolean z = r2.A02;
        if (!AnonymousClass36O.A06(A022)) {
            if (z) {
                return 3;
            }
            C95814uZ r22 = r2.A00;
            C626936e.A06(r22);
            C56982ss r1 = r4.A0I;
            C64773Ex r0 = r4.A08;
            if ((r22 == null || AnonymousClass352.A00(r0, r1, r22) <= 0) && !r1.A0P(r22) && !C57362tW.A00(r4.A0O, r22) && (((i = AnonymousClass1R1.A00(r22, r4).A01) == 0 && (i = r4.A0I().A01) == 0) || i == 2)) {
                return 1;
            }
        }
        return 2;
    }

    public static Uri A02(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        ArrayList A0J = AnonymousClass002.A0J(uri.getQueryParameterNames());
        Collections.sort(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m.equals("rotation") || A0m.equals("flip-h") || A0m.equals("flip-v")) {
                buildUpon.appendQueryParameter(A0m, uri.getQueryParameter(A0m));
            }
        }
        return buildUpon.build();
    }

    public static void A04(C989053r r3, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass5YF r1 = (AnonymousClass5YF) it.next();
            if (collection.contains(r1.A07())) {
                r3.A0J(r1.A07());
                r3.A0J(r1.A05());
            }
        }
    }

    public final Bitmap A0A(BitmapFactory.Options options, Uri uri, boolean z) {
        InputStream A0G = A0G(uri, z);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(A0G, (Rect) null, options);
            if (decodeStream == null || decodeStream.getWidth() == 0 || decodeStream.getHeight() == 0) {
                throw new C1000259c();
            }
            A0G.close();
            return decodeStream;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    @Deprecated
    public Bitmap A0C(Uri uri, int i, int i2, boolean z, boolean z2) {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A0K = C107655bf.A0K(uri, this.A03.A0R());
            BitmapFactory.Options A0D = A0D(uri, i, z, z2);
            try {
                bitmap = C107655bf.A0I(A0A(A0D, uri, z), A0K, i, i2);
            } catch (OutOfMemoryError e) {
                int i3 = A0D.inSampleSize * 2;
                A0D.inSampleSize = i3;
                Log.i(AnonymousClass000.A0Y("sample_rotate_image/oom ", AnonymousClass001.A0o(), i3), e);
                bitmap = C107655bf.A0I(A0A(A0D, uri, z), A0K, i, i2);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("sample_rotate_image/mutable/");
            C18260x0.A1U(A0o, bitmap.isMutable());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C86614Ku.A17(bitmap, "sample_rotate_image/final_size:", A0o2);
            A0o2.append(" | ");
            C18260x0.A1G(A0o2, bitmap.getHeight());
            return bitmap;
        }
        throw new FileNotFoundException(AnonymousClass000.A0P(uri, "No file ", AnonymousClass001.A0o()));
    }

    @Deprecated
    public BitmapFactory.Options A0D(Uri uri, int i, boolean z, boolean z2) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A0G = A0G(uri, z);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A0G, (Rect) null, options);
                A0G.close();
                int i3 = options.outWidth;
                if (i3 <= 0 || (i2 = options.outHeight) <= 0) {
                    throw new C1000259c();
                }
                options.inSampleSize = 1;
                int i4 = 1;
                int max = Math.max(i3, i2);
                while (true) {
                    max /= 2;
                    if (max > (i * 8) / 10) {
                        i4 *= 2;
                        options.inSampleSize = i4;
                    } else {
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("sample_rotate_image/width=");
                        A0o.append(i3);
                        A0o.append(" | height=");
                        A0o.append(i2);
                        C18260x0.A0y(" | sample_size=", A0o, i4);
                        options.inPreferQualityOverSpeed = true;
                        options.inMutable = z2;
                        return options;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            throw new FileNotFoundException(AnonymousClass000.A0P(uri, "No file ", AnonymousClass001.A0o()));
        }
    }

    public final InputStream A0G(Uri uri, boolean z) {
        InputStream A062;
        Uri build = uri.buildUpon().query((String) null).build();
        File A042 = C627536m.A04(build);
        if (A042 != null) {
            A062 = new FileInputStream(A042);
        } else {
            AnonymousClass5UR A0R = this.A03.A0R();
            if (A0R != null) {
                A062 = A0R.A06(build);
                if (A062 == null) {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0P(build, "Unable to open stream for uri=", AnonymousClass001.A0o()));
                }
            } else {
                throw AnonymousClass002.A0C("Could not get content resolver");
            }
        }
        if ((A062 instanceof FileInputStream) && z) {
            this.A0A.A05((FileInputStream) A062);
        }
        return A062;
    }
}
