package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: X.5a0  reason: invalid class name and case insensitive filesystem */
public class C106695a0 {
    public C72173dI A00;
    public final C64393Dh A01;
    public final C620633i A02;
    public final AnonymousClass306 A03;
    public final AnonymousClass4FS A04;

    public void A08(File file, byte b) {
        Uri uri;
        C72173dI r2;
        if (b == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (b == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (b == 3 || b == 13) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = null;
        }
        synchronized (this) {
            r2 = this.A00;
            if (r2 == null) {
                r2 = C72173dI.A00(this.A04);
                this.A00 = r2;
            }
        }
        r2.execute(new C70343aL(this, uri, file, 42));
    }

    public static String A01(C30471mV r3) {
        String A022 = A02(r3.A05);
        Locale locale = Locale.US;
        String upperCase = A022.toUpperCase(locale);
        if (!TextUtils.isEmpty(upperCase) || TextUtils.isEmpty(r3.A1x())) {
            return upperCase;
        }
        return C627536m.A08(r3.A1x()).toUpperCase(locale);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(java.lang.String r5) {
        /*
            java.lang.String r4 = ""
            if (r5 == 0) goto L_0x0108
            int r0 = r5.hashCode()
            r1 = 0
            r3 = -1
            switch(r0) {
                case -1487394660: goto L_0x00d8;
                case -1487018032: goto L_0x00cd;
                case -1248334925: goto L_0x00c2;
                case -1248332507: goto L_0x00b7;
                case -1073633483: goto L_0x00ac;
                case -1071817359: goto L_0x00a1;
                case -1050893613: goto L_0x0096;
                case -1004747228: goto L_0x008b;
                case -1004732798: goto L_0x0080;
                case -879258763: goto L_0x0075;
                case -366307023: goto L_0x006a;
                case 817335912: goto L_0x005f;
                case 904647503: goto L_0x0054;
                case 1993842850: goto L_0x0049;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r2 = "rtf"
            switch(r3) {
                case 0: goto L_0x0105;
                case 1: goto L_0x0102;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00f3;
                case 8: goto L_0x00e3;
                case 9: goto L_0x00f0;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00ea;
                case 12: goto L_0x00e7;
                case 13: goto L_0x00e4;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.String r2 = X.C162397rz.A0A(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = "3gp"
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00e3
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getExtensionFromMimeType(r5)
            if (r0 == 0) goto L_0x0108
            return r0
        L_0x0046:
            java.lang.String r2 = "mp4"
            goto L_0x0035
        L_0x0049:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 13
            goto L_0x000d
        L_0x0054:
            java.lang.String r0 = "application/msword"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 12
            goto L_0x000d
        L_0x005f:
            java.lang.String r0 = "text/plain"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 11
            goto L_0x000d
        L_0x006a:
            java.lang.String r0 = "application/vnd.ms-excel"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 10
            goto L_0x000d
        L_0x0075:
            java.lang.String r0 = "image/png"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 9
            goto L_0x000d
        L_0x0080:
            java.lang.String r0 = "text/rtf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 8
            goto L_0x000d
        L_0x008b:
            java.lang.String r0 = "text/csv"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 7
            goto L_0x000d
        L_0x0096:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 6
            goto L_0x000d
        L_0x00a1:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 5
            goto L_0x000d
        L_0x00ac:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 4
            goto L_0x000d
        L_0x00b7:
            java.lang.String r0 = "application/rtf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 3
            goto L_0x000d
        L_0x00c2:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 2
            goto L_0x000d
        L_0x00cd:
            java.lang.String r0 = "image/webp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000d
        L_0x00d8:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r3 = 0
            goto L_0x000d
        L_0x00e3:
            return r2
        L_0x00e4:
            java.lang.String r0 = "xlsx"
            return r0
        L_0x00e7:
            java.lang.String r0 = "doc"
            return r0
        L_0x00ea:
            java.lang.String r0 = "txt"
            return r0
        L_0x00ed:
            java.lang.String r0 = "xls"
            return r0
        L_0x00f0:
            java.lang.String r0 = "png"
            return r0
        L_0x00f3:
            java.lang.String r0 = "csv"
            return r0
        L_0x00f6:
            java.lang.String r0 = "docx"
            return r0
        L_0x00f9:
            java.lang.String r0 = "ppt"
            return r0
        L_0x00fc:
            java.lang.String r0 = "pptx"
            return r0
        L_0x00ff:
            java.lang.String r0 = "pdf"
            return r0
        L_0x0102:
            java.lang.String r0 = "webp"
            return r0
        L_0x0105:
            java.lang.String r0 = "jpg"
            return r0
        L_0x0108:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106695a0.A02(java.lang.String):java.lang.String");
    }

    public static boolean A03(C633138t r2) {
        if (r2 == C633138t.A09 || r2 == C633138t.A0c) {
            return true;
        }
        return false;
    }

    public C106695a0(C64393Dh r1, C620633i r2, AnonymousClass306 r3, AnonymousClass4FS r4) {
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "chat_personal";
            case 2:
                return "chat_group";
            case 3:
                return "status_user";
            case 4:
                return "status_ads";
            case 5:
                return "product_catalog";
            case 6:
                return "gdpr";
            case 7:
                return "sticker_picker";
            case 8:
                return "profile_picture";
            case 9:
                return "bloks";
            case 10:
                return "p2b";
            case 11:
                return "message_history_sync";
            case 12:
                return "community";
            case 13:
                return "channel";
            case 14:
                return "broadcast";
            default:
                return "unknown";
        }
    }

    public final Bitmap A04(BitmapFactory.Options options, Uri uri, boolean z) {
        InputStream A07 = A07(uri, z);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(A07, (Rect) null, options);
            if (decodeStream == null || decodeStream.getWidth() == 0 || decodeStream.getHeight() == 0) {
                throw new C143326yh();
            }
            A07.close();
            return decodeStream;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Bitmap A05(Uri uri, int i, int i2, boolean z, boolean z2) {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A0K = C107655bf.A0K(uri, this.A02.A0R());
            BitmapFactory.Options A06 = A06(uri, i, z, z2);
            try {
                bitmap = C107655bf.A0I(A04(A06, uri, z), A0K, i, i2);
            } catch (OutOfMemoryError e) {
                int i3 = A06.inSampleSize * 2;
                A06.inSampleSize = i3;
                Log.i(AnonymousClass000.A0Y("sample_rotate_image/oom ", AnonymousClass001.A0o(), i3), e);
                bitmap = C107655bf.A0I(A04(A06, uri, z), A0K, i, i2);
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

    public BitmapFactory.Options A06(Uri uri, int i, boolean z, boolean z2) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A07 = A07(uri, z);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A07, (Rect) null, options);
                A07.close();
                int i3 = options.outWidth;
                if (i3 <= 0 || (i2 = options.outHeight) <= 0) {
                    throw new C143326yh();
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

    public InputStream A07(Uri uri, boolean z) {
        InputStream A06;
        Uri build = uri.buildUpon().query((String) null).build();
        File A042 = C627536m.A04(build);
        if (A042 != null) {
            A06 = new FileInputStream(A042);
        } else {
            AnonymousClass5UR A0R = this.A02.A0R();
            if (A0R != null) {
                A06 = A0R.A06(build);
                if (A06 == null) {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0P(build, "Unable to open stream for uri=", AnonymousClass001.A0o()));
                }
            } else {
                throw AnonymousClass002.A0C("Could not get content resolver");
            }
        }
        if ((A06 instanceof FileInputStream) && z) {
            this.A03.A05((FileInputStream) A06);
        }
        return A06;
    }
}
