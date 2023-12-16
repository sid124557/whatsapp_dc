package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.32j  reason: invalid class name and case insensitive filesystem */
public class C618232j {
    public final C64393Dh A00;
    public final AnonymousClass310 A01;
    public final C56512s6 A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final AnonymousClass5ZR A05;
    public final AnonymousClass33p A06;
    public final C61072zf A07;
    public final AnonymousClass2QW A08;
    public final C29191iQ A09;

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r20.A0b().equals(X.C18300x5.A0B(r5).getString("registration_sibling_app_phone_number", (java.lang.String) null)) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r21 = this;
            java.lang.String r0 = "MediaMigrationUtil/moveMediaIfNeeded/moveMediaFromSisterApp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r21
            X.33p r0 = r3.A06
            r20 = r0
            java.lang.String r2 = r20.A0Z()
            X.8qC r5 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r5)
            java.lang.String r0 = "registration_sibling_app_country_code"
            r4 = 0
            java.lang.String r0 = r1.getString(r0, r4)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r20.A0b()
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r5)
            java.lang.String r0 = "registration_sibling_app_phone_number"
            java.lang.String r0 = r1.getString(r0, r4)
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaMigrationUtil/shouldMoveAllMediaFromOtherApp/samePhoneNumberAsOtherApp= "
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 != 0) goto L_0x0056
            X.2QW r1 = r3.A08
            r0 = 3
            X.1au r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/did-not-move-phone-number-not-matched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0056:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving media from sister app"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Dh r0 = r3.A00
            r0.A0Y()
            java.lang.String r4 = "Media"
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp Business"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            java.io.File r2 = X.AnonymousClass002.A0A(r0, r4)
            X.310 r0 = r3.A01
            r19 = r0
            java.io.File r0 = X.AnonymousClass310.A00(r19)
            java.io.File r9 = X.AnonymousClass002.A0A(r0, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving from= "
            X.AnonymousClass000.A10(r2, r0, r1)
            java.lang.String r0 = " and to= "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r9, r0, r1)
            X.C18260x0.A1L(r1, r0)
            X.5ZR r6 = r3.A05
            boolean r0 = r6.A0E()
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2QW r1 = r3.A08
            r0 = 6
        L_0x009e:
            X.1au r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            return
        L_0x00a7:
            X.2oU r0 = r3.A04
            android.content.Context r8 = r0.A00
            java.lang.String[] r7 = X.C107035aa.A04()
            int r5 = r7.length
            r1 = 0
        L_0x00b1:
            if (r1 >= r5) goto L_0x00c7
            r0 = r7[r1]
            boolean r0 = X.AnonymousClass5ZR.A01(r8, r0)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2QW r1 = r3.A08
            r0 = 5
            goto L_0x009e
        L_0x00c4:
            int r1 = r1 + 1
            goto L_0x00b1
        L_0x00c7:
            boolean r0 = A01(r9)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-folder-not-empty-did-not-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2QW r1 = r3.A08
            r0 = 2
            goto L_0x009e
        L_0x00d6:
            boolean r0 = X.AnonymousClass310.A01()
            if (r0 != 0) goto L_0x00eb
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2QW r1 = r3.A08
            r0 = 4
            goto L_0x009e
        L_0x00eb:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/all-conditions-are-met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.C627536m.A0G(r9, r0)
            java.io.File r0 = X.AnonymousClass310.A00(r19)
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r4)
            r0.mkdir()
            boolean r0 = X.AnonymousClass310.A01()
            if (r0 != 0) goto L_0x011a
            boolean r0 = r6.A0E()
            if (r0 == 0) goto L_0x011a
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x011a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x011a
            r2.listFiles()
        L_0x011a:
            java.lang.String r1 = r20.A0Z()
            java.lang.String r0 = r20.A0b()
            r5 = 0
            android.net.Uri r7 = A00(r1, r0, r5)
            r2 = 0
            X.33i r0 = r3.A03     // Catch:{ Exception -> 0x0265 }
            r18 = r0
            X.5UR r6 = r18.A0R()     // Catch:{ Exception -> 0x0265 }
            r9 = r5
            r10 = r5
            r11 = r5
            r8 = r5
            android.database.Cursor r7 = r6.A03(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0265 }
            if (r7 == 0) goto L_0x0269
            int r9 = r7.getCount()     // Catch:{ all -> 0x025b }
            if (r9 != 0) goto L_0x0147
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025b }
            goto L_0x0257
        L_0x0147:
            X.1iQ r11 = r3.A09     // Catch:{ all -> 0x025b }
            X.3Wi r8 = r11.A03     // Catch:{ all -> 0x025b }
            java.lang.Runnable r6 = r11.A02     // Catch:{ all -> 0x025b }
            r0 = 500(0x1f4, double:2.47E-321)
            r8.A0T(r6, r0)     // Catch:{ all -> 0x025b }
            r13 = 0
            r12 = 0
        L_0x0154:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x0242
            java.lang.String r10 = r7.getString(r2)     // Catch:{ all -> 0x025b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/file = "
            X.C18260x0.A0s(r0, r10, r1)     // Catch:{ all -> 0x025b }
            java.io.File r0 = X.AnonymousClass310.A00(r19)     // Catch:{ all -> 0x025b }
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r4)     // Catch:{ all -> 0x025b }
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r10)     // Catch:{ all -> 0x025b }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x025b }
            r17 = 0
            if (r0 == 0) goto L_0x0199
            boolean r0 = r1.delete()     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x0199
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFile/file = "
            r14.append(r0)     // Catch:{ all -> 0x025b }
            r14.append(r1)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = " already exists"
            r14.append(r0)     // Catch:{ all -> 0x025b }
        L_0x0192:
            X.C18280x3.A14(r14)     // Catch:{ all -> 0x025b }
            if (r17 != 0) goto L_0x023a
            goto L_0x022f
        L_0x0199:
            X.5UR r15 = r18.A0R()     // Catch:{ IOException | SecurityException -> 0x0205 }
            java.lang.String r14 = r20.A0Z()     // Catch:{ IOException | SecurityException -> 0x0205 }
            java.lang.String r0 = r20.A0b()     // Catch:{ IOException | SecurityException -> 0x0205 }
            android.net.Uri r14 = A00(r14, r0, r10)     // Catch:{ IOException | SecurityException -> 0x0205 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r16 = r15.A05(r14, r0)     // Catch:{ IOException | SecurityException -> 0x0205 }
            if (r16 == 0) goto L_0x022f
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x01f7
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x01fb }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x01fb }
            r0.mkdirs()     // Catch:{ all -> 0x01fb }
            java.io.FileOutputStream r15 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ all -> 0x01fb }
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x01ed }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x01ed }
            r14.<init>(r0)     // Catch:{ all -> 0x01ed }
            java.nio.channels.FileChannel r1 = r14.getChannel()     // Catch:{ all -> 0x01e3 }
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r15)     // Catch:{ all -> 0x01e3 }
            X.C627536m.A0J(r1, r0)     // Catch:{ all -> 0x01e3 }
            r14.close()     // Catch:{ all -> 0x01ed }
            r15.close()     // Catch:{ all -> 0x01fb }
            r17 = 1
            goto L_0x01f7
        L_0x01e3:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01e8 }
            goto L_0x01ec
        L_0x01e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ed }
        L_0x01ec:
            throw r1     // Catch:{ all -> 0x01ed }
        L_0x01ed:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x01f2 }
            goto L_0x01f6
        L_0x01f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fb }
        L_0x01f6:
            throw r1     // Catch:{ all -> 0x01fb }
        L_0x01f7:
            r16.close()     // Catch:{ IOException | SecurityException -> 0x0205 }
            goto L_0x0209
        L_0x01fb:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0200 }
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | SecurityException -> 0x0205 }
        L_0x0204:
            throw r1     // Catch:{ IOException | SecurityException -> 0x0205 }
        L_0x0205:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x025b }
        L_0x0209:
            if (r17 == 0) goto L_0x022f
            X.5UR r14 = r18.A0R()     // Catch:{ all -> 0x025b }
            java.lang.String r1 = r20.A0Z()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r20.A0b()     // Catch:{ all -> 0x025b }
            android.net.Uri r0 = A00(r1, r0, r10)     // Catch:{ all -> 0x025b }
            int r0 = r14.A01(r0, r5, r5)     // Catch:{ all -> 0x025b }
            if (r0 > 0) goto L_0x023a
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "MediaMigrationUtil/deleteMediaFile/Could not delete "
            r14.append(r0)     // Catch:{ all -> 0x025b }
            r14.append(r10)     // Catch:{ all -> 0x025b }
            goto L_0x0192
        L_0x022f:
            int r13 = r13 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/Failed to move file = "
            X.C18260x0.A0t(r0, r10, r1)     // Catch:{ all -> 0x025b }
        L_0x023a:
            int r12 = r12 + 1
            r11.A00 = r12     // Catch:{ all -> 0x025b }
            r11.A01 = r9     // Catch:{ all -> 0x025b }
            goto L_0x0154
        L_0x0242:
            float r1 = (float) r13     // Catch:{ all -> 0x025b }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch:{ all -> 0x025b }
            float r1 = r1 / r0
            double r4 = (double) r1     // Catch:{ all -> 0x025b }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0257
            r7.close()     // Catch:{ Exception -> 0x0265 }
            r8.A0R(r6)
            r2 = 1
            goto L_0x0273
        L_0x0257:
            r7.close()     // Catch:{ Exception -> 0x0265 }
            goto L_0x0269
        L_0x025b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0260 }
            goto L_0x0264
        L_0x0260:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0265 }
        L_0x0264:
            throw r1     // Catch:{ Exception -> 0x0265 }
        L_0x0265:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0282 }
        L_0x0269:
            X.1iQ r0 = r3.A09
            X.3Wi r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0R(r0)
            r2 = 0
        L_0x0273:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/successfully-renamed = "
            X.C18260x0.A1E(r0, r1, r2)
            X.2QW r1 = r3.A08
            r0 = r2 ^ 1
            goto L_0x009e
        L_0x0282:
            r2 = move-exception
            X.1iQ r0 = r3.A09
            X.3Wi r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0R(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618232j.A02():void");
    }

    public C618232j(C64393Dh r1, AnonymousClass310 r2, C56512s6 r3, C620633i r4, C54292oU r5, AnonymousClass5ZR r6, AnonymousClass33p r7, C61072zf r8, AnonymousClass2QW r9, C29191iQ r10) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = r9;
        this.A09 = r10;
    }

    public static boolean A01(File file) {
        StringBuilder A0o;
        String str;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ", file);
        } else {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory() && !A01(file2)) {
                    A0o = AnonymousClass001.A0o();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ";
                } else if (file2.isDirectory() || ".nomedia".equals(file2.getName())) {
                    i++;
                } else {
                    A0o = AnonymousClass001.A0o();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ";
                }
                C18260x0.A1R(A0o, str, file2);
                return false;
            }
        }
        return true;
    }
}
