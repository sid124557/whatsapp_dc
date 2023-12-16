package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5af  reason: invalid class name and case insensitive filesystem */
public class C107085af {
    public final C106695a0 A00;

    public static Bitmap A00(C182528oZ r10, int i, int i2, long j, boolean z, boolean z2) {
        AnonymousClass6DM r6;
        Bitmap bitmap;
        Bitmap A0I;
        byte[] embeddedPicture;
        try {
            r6 = new AnonymousClass6DM();
            r10.AzM(r6);
            long j2 = j;
            int i3 = i;
            if (Build.VERSION.SDK_INT < 27 || i <= 0) {
                bitmap = null;
            } else {
                bitmap = r6.getScaledFrameAtTime(j2, 0, i3, i);
            }
            if (bitmap == null) {
                if (z2) {
                    bitmap = r6.getFrameAtTime(j, 3);
                } else {
                    bitmap = r6.getFrameAtTime(j);
                }
            }
            if (bitmap == null) {
                bitmap = r6.getFrameAtTime();
            }
            if (bitmap == null && (embeddedPicture = r6.getEmbeddedPicture()) != null) {
                bitmap = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, C107655bf.A02);
            }
            if (!(bitmap == null || i <= 0 || bitmap == (A0I = C107655bf.A0I(bitmap, (Matrix) null, i, i)))) {
                bitmap.recycle();
                bitmap = A0I;
            }
            if (!(bitmap == null || !z || bitmap.getConfig() == Bitmap.Config.ARGB_8888)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (i2 > 0) {
                    AnonymousClass75H.A00(i2, bitmap);
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                bitmap.recycle();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inInputShareable = true;
                options.inPurgeable = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, C107655bf.A02);
            }
            if (bitmap == null) {
                Log.w("mediafileutils/createVideoThumbnail/no bitmap created");
            }
            r6.close();
            return bitmap;
        } catch (RuntimeException e) {
            Log.e("mediafileutils/createVideoThumbnail/corrupt video file", e);
            return null;
        } catch (IOException e2) {
            Log.e("mediafileutils/createVideoThumbnail/unable to load video", e2);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Bitmap A01(File file) {
        boolean z;
        String str;
        if (file == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            C172218Kd.A04(file);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return A00(new AnonymousClass8HO(file), -1, 0, 0, false, false);
        }
        try {
            return C172218Kd.A00(file);
        } catch (IOException | IllegalArgumentException e) {
            e = e;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    public byte[] A05(Uri uri, int i, int i2, int i3) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap A05 = this.A00.A05(uri, i, i2, true, true);
            if (i3 > 0) {
                AnonymousClass75H.A00(i3, A05);
            }
            A05.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            A05.recycle();
            byteArrayOutputStream.close();
            return bArr;
        } catch (C143326yh e) {
            e = e;
            str = "thumbnailutils/getImageThumb/file is not an image";
            Log.e(str, e);
            return bArr;
        } catch (IOException e2) {
            e = e2;
            str = "thumbnailutils/getImageThumb/unable to load image";
            Log.e(str, e);
            return bArr;
        } catch (OutOfMemoryError e3) {
            e = e3;
            str = "thumbnailutils/getImageThumb/out of memory when generating the thumbnail";
            Log.e(str, e);
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Bitmap A02(File file, long j) {
        AnonymousClass6DM r2;
        if (j == 0) {
            return A01(file);
        }
        Bitmap bitmap = null;
        try {
            r2 = new AnonymousClass6DM();
            r2.setDataSource(file.getAbsolutePath());
            bitmap = r2.getFrameAtTime(j);
            r2.close();
            return bitmap;
        } catch (Exception | NoSuchMethodError unused) {
            return bitmap;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] A03(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C86614Ku.A17(bitmap, "orig_thumbnail/width:", A0o);
        A0o.append("/height:");
        A0o.append(bitmap.getHeight());
        C18260x0.A0y("/maxDimension:", A0o, i);
        if (bitmap.getWidth() > i || bitmap.getHeight() > i) {
            float f = (float) i;
            float max = Math.max(((float) bitmap.getWidth()) / f, ((float) bitmap.getHeight()) / f);
            Rect rect = new Rect(0, 0, (int) (((float) bitmap.getWidth()) / max), (int) (((float) bitmap.getHeight()) / max));
            rect.right = Math.max(rect.right, 1);
            rect.bottom = Math.max(rect.bottom, 1);
            Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Bitmap.Config config = bitmap.getConfig();
            try {
                int width = rect.width();
                int height = rect.height();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas A06 = AnonymousClass4L0.A06(createBitmap);
                Paint A0Z = C86664Kz.A0Z();
                A0Z.setAntiAlias(true);
                A0Z.setFilterBitmap(true);
                A0Z.setDither(true);
                A06.drawBitmap(bitmap, rect2, rect, A0Z);
                bitmap.recycle();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C86614Ku.A17(createBitmap, "rescaled_thumbnail/width:", A0o2);
                A0o2.append("/height:");
                C18260x0.A1G(A0o2, createBitmap.getHeight());
                bitmap = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("video-thumbnail/scale/out-of-memory", e);
                bitmap.recycle();
                throw e;
            }
        }
        byte[] A1Y = C18320x8.A1Y(bitmap, new ByteArrayOutputStream());
        bitmap.recycle();
        return A1Y;
    }

    public C107085af(C106695a0 r1) {
        this.A00 = r1;
    }

    public static byte[] A04(File file) {
        return A03(A01(file), 100);
    }
}
