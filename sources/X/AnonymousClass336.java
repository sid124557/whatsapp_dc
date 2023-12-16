package X;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.336  reason: invalid class name */
public class AnonymousClass336 {
    public final C55682qk A00;
    public final C44882Xv A01;
    public final C620633i A02;
    public final C54292oU A03;
    public final C48092eK A04;
    public final WebpUtils A05;

    public static Pair A00(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf < 0) {
            return null;
        }
        return AnonymousClass0x9.A0C(URLDecoder.decode(AnonymousClass0x7.A0r(str, indexOf)), str.substring(indexOf + 1));
    }

    public C50612iT A02(String str, String str2) {
        IllegalArgumentException th;
        C106655Zv[] r13;
        InputStream A06;
        String str3 = str;
        String str4 = str2;
        C50612iT A032 = A03(str3, str4);
        ArrayList A0s = AnonymousClass001.A0s();
        String A012 = A01(str3, str4);
        C620633i r31 = this.A02;
        Cursor A033 = r31.A0R().A03(C18320x8.A09(new Uri.Builder().scheme("content").authority(str3), "stickers", str4), new String[]{"sticker_file_name", "sticker_emoji"}, (String) null, (String[]) null, (String) null);
        if (A033 != null) {
            try {
                if (A033.getCount() < 3 || A033.getCount() > 30) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass0x9.A02(A033, "sticker count should be between 3 to 30 inclusive, it currently has ", A0o));
                    A0o.append(", sticker pack: ");
                    th = AnonymousClass000.A0F(str4, A0o);
                } else {
                    A033.moveToFirst();
                    do {
                        String A0Z = AnonymousClass0x2.A0Z(A033, "sticker_file_name");
                        String A0Z2 = AnonymousClass0x2.A0Z(A033, "sticker_emoji");
                        if (!C627536m.A0T(A0Z)) {
                            if (!TextUtils.isEmpty(A0Z2)) {
                                String[] A1b = C18320x8.A1b(A0Z2);
                                int length = A1b.length;
                                r13 = new C106655Zv[length];
                                for (int i = 0; i < length; i++) {
                                    r13[i] = C106655Zv.A00(A1b[i]);
                                }
                            } else {
                                r13 = null;
                            }
                            Uri A09 = C18320x8.A09(new Uri.Builder().scheme("content").authority(str3).appendPath("stickers_asset"), str4, A0Z);
                            AnonymousClass330 r18 = new AnonymousClass330(A012, A032.A0I, A032.A0K, A032.A0J, A032.A0F, (String) null, r13, false, false, false, false, false);
                            try {
                                A06 = C620633i.A02(r31).A06(A09);
                                if (A06 != null) {
                                    C48092eK r12 = this.A04;
                                    File A002 = r12.A00.A00(C107575bX.A0A(C18290x4.A0t(AnonymousClass29O.A01(32))));
                                    if (C627536m.A0R(A002, A06)) {
                                        A06.close();
                                        try {
                                            WebpUtils webpUtils = this.A05;
                                            String path = A09.getPath();
                                            Boolean valueOf = Boolean.valueOf(A032.A0Q);
                                            C106655Zv[] r0 = r18.A0B;
                                            if (r0 == null || r0.length <= 3) {
                                                C57582ts.A00(webpUtils, A002, valueOf, path);
                                                if (webpUtils.A03(A002, r18.A02())) {
                                                    String A003 = C615131b.A00(this.A00, A002);
                                                    if (A003 != null) {
                                                        AnonymousClass39M r14 = new AnonymousClass39M();
                                                        r14.A0F = A012;
                                                        r14.A09 = A09.toString();
                                                        r14.A01 = 3;
                                                        r14.A0D = A003;
                                                        r14.A0A = WebpUtils.A00(A002);
                                                        r14.A0C = "image/webp";
                                                        r14.A00 = (int) A002.length();
                                                        r14.A04 = r18;
                                                        A0s.add(r14);
                                                    }
                                                } else {
                                                    Log.e("ThirdPartyStickerFetcher/calculatePlainTextHash/failed to insert metadata");
                                                }
                                                C627536m.A0O(A002);
                                            } else {
                                                throw new C32651rO(AnonymousClass000.A0V("emoji count exceed limit, sticker name:", path, AnonymousClass001.A0o()));
                                            }
                                        } catch (IOException e) {
                                            Log.e("ThirdPartyStickerFetcher/fetchStickersForStickerPack/exception when operating on sticker file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            C627536m.A0O(A002);
                                        }
                                    } else {
                                        A06.close();
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("ThirdPartyStickerFetcher/saveStickerFileToTempLocation/io exception when fetching sticker", e2);
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("sticker file name: ");
                            A0o2.append(A0Z);
                            A0o2.append(" is invalid, authority: ");
                            A0o2.append(str3);
                            A0o2.append(",identifier: ");
                            th = AnonymousClass000.A0F(str4, A0o2);
                        }
                    } while (A033.moveToNext());
                    A033.close();
                    Iterator it = A0s.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        j += (long) AnonymousClass0x7.A0b(it).A00;
                    }
                    A032.A05 = A0s;
                    A032.A01 = j;
                    return A032;
                }
            } catch (Throwable th4) {
                if (A033 != null) {
                    try {
                        A033.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
                throw th4;
            }
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("could not find stickers for sticker pack: ");
            th = AnonymousClass000.A0F(A012, A0o3);
        }
        throw th;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a4, code lost:
        if (r1 <= 0) goto L_0x01a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50612iT A03(java.lang.String r36, java.lang.String r37) {
        /*
            r35 = this;
            r10 = r36
            boolean r0 = X.C627536m.A0T(r10)
            if (r0 != 0) goto L_0x02ff
            r9 = r37
            boolean r0 = X.C627536m.A0T(r9)
            if (r0 != 0) goto L_0x02f1
            int r3 = r9.length()
            r2 = 128(0x80, float:1.794E-43)
            if (r3 > r2) goto L_0x02de
            r8 = r35
            X.2oU r0 = r8.A03
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            if (r4 == 0) goto L_0x0053
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r4.resolveContentProvider(r10, r2)
            if (r2 == 0) goto L_0x0053
            java.lang.String r1 = "com.whatsapp.sticker.READ"
            java.lang.String r0 = r2.readPermission
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0053
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0043 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0043 }
            java.lang.String r7 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0043 }
            goto L_0x0059
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/package name not found, content provider:"
            r1.append(r0)
            int r0 = r10.hashCode()
            X.C18270x1.A1F(r1, r0)
        L_0x0053:
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/app may have been deleted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = 0
        L_0x0059:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x02a6
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r6)
            android.net.Uri$Builder r1 = r0.authority(r10)
            java.lang.String r0 = "metadata"
            android.net.Uri r30 = X.C18320x8.A09(r1, r0, r9)
            java.lang.String r12 = "sticker_pack_identifier"
            java.lang.String r11 = "sticker_pack_name"
            java.lang.String r5 = "sticker_pack_publisher"
            java.lang.String r1 = "sticker_pack_icon"
            java.lang.String r20 = "android_play_store_link"
            java.lang.String r0 = "ios_app_download_link"
            java.lang.String r19 = "image_data_version"
            java.lang.String r18 = "whatsapp_will_not_cache_stickers"
            java.lang.String r17 = "animated_sticker_pack"
            r25 = r20
            r26 = r0
            r27 = r19
            r28 = r18
            r29 = r17
            r23 = r5
            r24 = r1
            r21 = r12
            r22 = r11
            java.lang.String[] r31 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.lang.String r4 = "/"
            X.33i r2 = r8.A02
            X.5UR r29 = X.C620633i.A02(r2)
            r3 = 0
            r33 = r3
            r34 = r3
            r32 = r3
            android.database.Cursor r13 = r29.A03(r30, r31, r32, r33, r34)
            r2 = 0
            if (r13 == 0) goto L_0x02a6
            int r14 = r13.getCount()     // Catch:{ all -> 0x0299 }
            if (r14 <= 0) goto L_0x02a3
            r13.moveToFirst()     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = X.AnonymousClass0x2.A0Z(r13, r12)     // Catch:{ all -> 0x0299 }
            boolean r14 = r9.equals(r12)     // Catch:{ all -> 0x0299 }
            if (r14 == 0) goto L_0x027d
            java.lang.String r16 = X.AnonymousClass0x2.A0Z(r13, r11)     // Catch:{ all -> 0x0299 }
            java.lang.String r11 = X.AnonymousClass0x2.A0Z(r13, r5)     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = X.AnonymousClass0x2.A0Z(r13, r1)     // Catch:{ all -> 0x0299 }
            boolean r1 = X.C627536m.A0T(r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r5 = ", identifier: "
            java.lang.String r15 = "ThirdPartyStickerFetcher/tray image name: ("
            if (r1 == 0) goto L_0x00ff
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r15, r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = ") contains invalid characters, from authority: "
        L_0x00e7:
            r2.append(r0)     // Catch:{ all -> 0x0299 }
            r2.append(r10)     // Catch:{ all -> 0x0299 }
            X.C18260x0.A0r(r5, r9, r2)     // Catch:{ all -> 0x0299 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "tray image name invalid, tray image name: "
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r12, r1)     // Catch:{ all -> 0x0299 }
        L_0x00fe:
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x00ff:
            int r14 = r12.length()     // Catch:{ all -> 0x0299 }
            r1 = 128(0x80, float:1.794E-43)
            if (r14 <= r1) goto L_0x011e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r15, r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = ") has "
            r2.append(r0)     // Catch:{ all -> 0x0299 }
            r2.append(r14)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = " characters, limit is: "
            r2.append(r0)     // Catch:{ all -> 0x0299 }
            r2.append(r1)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = ", from authority: "
            goto L_0x00e7
        L_0x011e:
            r1 = r20
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x0299 }
            java.lang.String r5 = " is invalid"
            if (r1 <= 0) goto L_0x014b
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x0299 }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0299 }
            if (r1 != 0) goto L_0x014b
            java.lang.String r1 = "play.google.com"
            boolean r1 = X.C57582ts.A01(r3, r1)     // Catch:{ all -> 0x0299 }
            if (r1 != 0) goto L_0x014b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "play link: "
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r3, r5, r1)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x014b:
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0299 }
            if (r0 <= 0) goto L_0x017a
            java.lang.String r2 = r13.getString(r0)     // Catch:{ all -> 0x0299 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = "itunes.apple.com"
            boolean r0 = X.C57582ts.A01(r2, r0)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = "apps.apple.com"
            boolean r0 = X.C57582ts.A01(r2, r0)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x017a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "apple store link: "
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r2, r5, r1)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x017a:
            java.lang.String r14 = ""
            r0 = r19
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0299 }
            if (r0 <= 0) goto L_0x0196
            java.lang.String r14 = r13.getString(r0)     // Catch:{ all -> 0x0299 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = "image_data_version should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x0196:
            r0 = r18
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0299 }
            r15 = 0
            if (r0 <= 0) goto L_0x01a6
            short r1 = r13.getShort(r0)     // Catch:{ all -> 0x0299 }
            r0 = 1
            if (r1 > 0) goto L_0x01a7
        L_0x01a6:
            r0 = 0
        L_0x01a7:
            r1 = r17
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x0299 }
            if (r1 <= 0) goto L_0x01b6
            short r1 = r13.getShort(r1)     // Catch:{ all -> 0x0299 }
            if (r1 <= 0) goto L_0x01b6
            r15 = 1
        L_0x01b6:
            X.2db r5 = new X.2db     // Catch:{ all -> 0x0299 }
            r5.<init>()     // Catch:{ all -> 0x0299 }
            java.lang.String r1 = A01(r10, r9)     // Catch:{ all -> 0x0299 }
            r5.A0Q = r15     // Catch:{ all -> 0x0299 }
            r5.A0P = r0     // Catch:{ all -> 0x0299 }
            r5.A0E = r1     // Catch:{ all -> 0x0299 }
            r0 = r16
            r5.A0G = r0     // Catch:{ all -> 0x0299 }
            r5.A0I = r11     // Catch:{ all -> 0x0299 }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ all -> 0x0299 }
            r0.<init>()     // Catch:{ all -> 0x0299 }
            android.net.Uri$Builder r0 = r0.scheme(r6)     // Catch:{ all -> 0x0299 }
            android.net.Uri$Builder r6 = r0.authority(r10)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "stickers_asset"
            android.net.Uri$Builder r0 = r6.appendPath(r0)     // Catch:{ all -> 0x0299 }
            android.net.Uri$Builder r0 = r0.appendPath(r9)     // Catch:{ all -> 0x0299 }
            android.net.Uri$Builder r0 = r0.appendPath(r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = X.C18300x5.A0f(r0)     // Catch:{ all -> 0x0299 }
            r5.A0K = r0     // Catch:{ all -> 0x0299 }
            r0 = 1
            r5.A0V = r0     // Catch:{ all -> 0x0299 }
            r5.A0H = r3     // Catch:{ all -> 0x0299 }
            r5.A0D = r2     // Catch:{ all -> 0x0299 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = X.AnonymousClass000.A0U(r7, r4, r14, r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = X.C627236i.A05(r0)     // Catch:{ all -> 0x0299 }
            r5.A0F = r0     // Catch:{ all -> 0x0299 }
            X.2iT r4 = r5.A00()     // Catch:{ all -> 0x0299 }
            java.lang.String r2 = r4.A0G     // Catch:{ all -> 0x0299 }
            java.lang.String r1 = r4.A0K     // Catch:{ all -> 0x0299 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x026e
            int r0 = r1.length()     // Catch:{ all -> 0x0299 }
            r3 = 128(0x80, float:1.794E-43)
            if (r0 > r3) goto L_0x025f
            java.lang.String r1 = r4.A0I     // Catch:{ all -> 0x0299 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x0250
            int r0 = r1.length()     // Catch:{ all -> 0x0299 }
            if (r0 > r3) goto L_0x0241
            java.lang.String r0 = r4.A0M     // Catch:{ all -> 0x0299 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x0232
            r8.A04(r4)     // Catch:{ all -> 0x0299 }
            goto L_0x0295
        L_0x0232:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Third party sticker pack tray id is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x0241:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Third party sticker pack name cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Third party sticker pack name is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x025f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Third party sticker pack publisher cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x026e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Third party sticker pack publisher is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x027d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "the pack returned was not what was requested, request identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            r1.append(r9)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = ",result identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0299 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r12, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x00fe
        L_0x0295:
            r13.close()
            return r4
        L_0x0299:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x029e }
            throw r1
        L_0x029e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x02a3:
            r13.close()
        L_0x02a6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ThirdPartyStickerFetcher/fetchStickerPackMetadata/fetched sticker pack is null, authority: "
            r1.append(r0)
            int r0 = r10.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", thirdPartyAppVersionCode: "
            X.C18260x0.A0r(r0, r7, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Third party pack cannot be found likely because the corresponding app is restricted, sdk: "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = " ,power saving mode: "
            r1.append(r0)
            X.2Xv r0 = r8.A01
            boolean r0 = r0.A00()
            java.lang.String r0 = X.C18300x5.A0m(r1, r0)
            X.1rP r1 = new X.1rP
            r1.<init>(r0)
            throw r1
        L_0x02de:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identifier length is: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", limit is: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r1
        L_0x02f1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identifier contains invalid characters: "
            r1.append(r0)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r9, r1)
            throw r1
        L_0x02ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "authority contains invalid characters: "
            r1.append(r0)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r10, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass336.A03(java.lang.String, java.lang.String):X.2iT");
    }

    public byte[] A04(C50612iT r11) {
        InputStream A06;
        Throwable th;
        try {
            A06 = this.A02.A0R().A06(Uri.parse(r11.A0M));
            if (A06 != null) {
                byte[] bArr = new byte[51201];
                int read = A06.read(bArr, 0, 51201);
                if (read != 51201) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, read);
                    if (decodeByteArray.getWidth() <= 512) {
                        if (decodeByteArray.getHeight() >= 24) {
                            if (decodeByteArray.getHeight() > 512 || decodeByteArray.getHeight() < 24) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("tray icon height incorrect, it is currently ");
                                A0o.append(decodeByteArray.getHeight());
                                C18270x1.A19(", should be between ", " and ", A0o, 24);
                                A0o.append(512);
                                A0o.append(" pixels, sticker pack: ");
                                th = AnonymousClass000.A0F(r11.A0G, A0o);
                            } else {
                                A06.close();
                                return bArr;
                            }
                        }
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("tray icon width incorrect, it is currently ");
                    A0o2.append(decodeByteArray.getWidth());
                    C18270x1.A19(", should be between ", " and ", A0o2, 24);
                    A0o2.append(512);
                    A0o2.append(" pixels, sticker pack: ");
                    th = AnonymousClass000.A0F(r11.A0G, A0o2);
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("tray icon file size too big, limit is 50 KB, sticker pack: ");
                    th = AnonymousClass000.A0F(r11.A0G, A0o3);
                }
            } else {
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("failed to fetch sticker tray icon, inputstream is null: ");
                th = AnonymousClass002.A0C(AnonymousClass000.A0X(r11.A0G, A0o4));
            }
            throw th;
        } catch (IOException | IllegalArgumentException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("failed to fetch sticker tray icon, sticker pack:");
            throw new IOException(AnonymousClass000.A0X(r11.A0G, A0o5), e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public AnonymousClass336(C55682qk r1, C44882Xv r2, C620633i r3, C54292oU r4, C48092eK r5, WebpUtils webpUtils) {
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = webpUtils;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public static String A01(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(URLEncoder.encode(str));
        return AnonymousClass000.A0V(" ", str2, A0o);
    }
}
