package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.animated.webp.WebPImage;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.33Q  reason: invalid class name */
public class AnonymousClass33Q {
    public final C54292oU A00;
    public final WebpUtils A01;
    public volatile C172228Ke A02;
    public volatile boolean A03;

    public static WebPImage A00(byte[] bArr) {
        try {
            return WebPImage.createFromByteArray(bArr, (AnonymousClass7Z5) null);
        } catch (UnsatisfiedLinkError e) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e2);
            return null;
        }
    }

    public Bitmap A03(File file, String str, int i, int i2) {
        ByteArrayOutputStream A0e;
        String A012 = A01(str, i, i2);
        Bitmap A04 = A04(A012);
        if (A04 == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outHeight = i2;
            options.outWidth = i;
            WebpInfo A022 = this.A01.A02(file.getAbsolutePath());
            if (A022 == null || A022.numFrames != 1) {
                A04 = null;
            } else {
                options.inSampleSize = C107245ax.A00(A022.width, A022.height, i, i2, 1);
                A04 = WebpBitmapFactoryImpl.hookDecodeFile(file.getAbsolutePath(), options);
            }
            if (A04 != null) {
                A07(A04, A012);
            } else {
                try {
                    FileInputStream A0g = AnonymousClass0x9.A0g(file);
                    try {
                        A0e = AnonymousClass0x9.A0e();
                        C627536m.A0I(A0g, A0e);
                        Bitmap A05 = A05(str, A0e.toByteArray(), i, i2);
                        A0e.close();
                        A0g.close();
                        return A05;
                    } catch (Throwable th) {
                        A0g.close();
                        throw th;
                    }
                } catch (FileNotFoundException | IOException e) {
                    C18260x0.A0u("loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:", str, AnonymousClass001.A0o(), e);
                    return null;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return A04;
        throw th;
    }

    public final C172228Ke A06() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    File A0A = AnonymousClass002.A0A(C54292oU.A02(this.A00), "webp_static_cache");
                    if (A0A.exists() || A0A.mkdirs()) {
                        try {
                            this.A02 = C172228Ke.A00((AnonymousClass7EN) null, A0A, 2097152);
                        } catch (IOException e) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e);
                        }
                    } else {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    }
                    this.A03 = true;
                }
            }
        }
        return this.A02;
    }

    public AnonymousClass33Q(C54292oU r2, WebpUtils webpUtils) {
        this.A00 = r2;
        this.A01 = webpUtils;
        try {
            C155137eL.A00(r2.A00);
        } catch (IOException unused) {
        }
    }

    public static final String A01(String str, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(str.replace("/", "-"));
        A0o.append("_");
        A0o.append(i);
        return AnonymousClass000.A0Y("_", A0o, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ IllegalStateException -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A02(com.facebook.animated.webp.WebPImage r10, java.lang.String r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r10.getFrameCount()     // Catch:{ IllegalStateException -> 0x0084 }
            r3 = 0
            if (r0 <= 0) goto L_0x007d
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0062, IllegalArgumentException -> 0x0066 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x0062, IllegalArgumentException -> 0x0066 }
            r0 = 0
            com.facebook.animated.webp.WebPFrame r2 = r10.getFrame((int) r0)     // Catch:{ IllegalStateException -> 0x0084 }
            int r8 = r2.getWidth()     // Catch:{ IllegalStateException -> 0x0084 }
            int r7 = r2.getHeight()     // Catch:{ IllegalStateException -> 0x0084 }
            int r1 = r10.getWidth()     // Catch:{ IllegalStateException -> 0x0084 }
            int r0 = r10.getHeight()     // Catch:{ IllegalStateException -> 0x0084 }
            if (r0 != r7) goto L_0x002a
            if (r1 != r8) goto L_0x002a
            r2.renderFrame(r12, r13, r4)     // Catch:{ IllegalStateException -> 0x0084 }
            goto L_0x007e
        L_0x002a:
            float r5 = (float) r12     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = (float) r1     // Catch:{ IllegalStateException -> 0x0084 }
            float r5 = r5 / r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x005e }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x005e }
            float r0 = (float) r8     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x0084 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x0084 }
            int r8 = (int) r0     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = (float) r7     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x0084 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x0084 }
            int r7 = (int) r0     // Catch:{ IllegalStateException -> 0x0084 }
            r2.renderFrame(r8, r7, r6)     // Catch:{ IllegalStateException -> 0x0084 }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x0084 }
            r7.<init>(r4)     // Catch:{ IllegalStateException -> 0x0084 }
            int r0 = r2.getXOffset()     // Catch:{ IllegalStateException -> 0x0084 }
            float r1 = (float) r0     // Catch:{ IllegalStateException -> 0x0084 }
            float r1 = r1 * r5
            int r0 = r2.getYOffset()     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0084 }
            float r0 = r0 * r5
            r7.drawBitmap(r6, r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0084 }
            r6.recycle()     // Catch:{ IllegalStateException -> 0x0084 }
            goto L_0x007e
        L_0x005e:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating framebitmap"
            goto L_0x007a
        L_0x0062:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap"
            goto L_0x007a
        L_0x0066:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0084 }
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0084 }
            r1.append(r12)     // Catch:{ IllegalStateException -> 0x0084 }
            java.lang.String r0 = "x"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0084 }
        L_0x007a:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IllegalStateException -> 0x0084 }
        L_0x007d:
            r4 = r3
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r9.A07(r4, r11)     // Catch:{ IllegalStateException -> 0x0084 }
        L_0x0083:
            return r4
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33Q.A02(com.facebook.animated.webp.WebPImage, java.lang.String, int, int):android.graphics.Bitmap");
    }

    public final Bitmap A04(String str) {
        AnonymousClass8KP r0;
        InputStream inputStream;
        C172228Ke A06 = A06();
        if (A06 != null) {
            try {
                r0 = A06.A09(str);
            } catch (IOException e) {
                Log.e("WebPImageLoader/error getting bitmap from cache", e);
                r0 = null;
            }
            if (r0 == null) {
                return null;
            }
            try {
                inputStream = r0.A00[0];
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return decodeStream;
            } catch (IOException unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    public Bitmap A05(String str, byte[] bArr, int i, int i2) {
        String A012 = A01(str, i, i2);
        Bitmap A04 = A04(A012);
        if (A04 != null) {
            return A04;
        }
        WebPImage A002 = A00(bArr);
        if (A002 == null) {
            return null;
        }
        return A02(A002, A012, i, i2);
    }

    public final void A07(Bitmap bitmap, String str) {
        ByteArrayOutputStream A0e;
        C172228Ke A06 = A06();
        if (A06 != null) {
            try {
                AnonymousClass7WJ A08 = A06.A08(str);
                if (A08 != null) {
                    OutputStream A002 = A08.A00();
                    try {
                        A0e = AnonymousClass0x9.A0e();
                        C18310x6.A12(bitmap, A0e);
                        byte[] byteArray = A0e.toByteArray();
                        A002.write(byteArray, 0, byteArray.length);
                        A08.A01();
                        A0e.close();
                        A002.close();
                        return;
                    } catch (Throwable th) {
                        A002.close();
                        throw th;
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                Log.e("WebPImageLoader/saving bitmap to cache", e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
