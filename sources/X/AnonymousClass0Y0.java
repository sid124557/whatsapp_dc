package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;

/* renamed from: X.0Y0  reason: invalid class name */
public final class AnonymousClass0Y0 {
    public static float A00 = -1.0f;
    public static final float A01 = ((float) (Math.sqrt(2.0d) / 2.0d));
    public static final ThreadLocal A02 = new C13880nt();
    public static final ThreadLocal A03 = new C13910nw();
    public static final ThreadLocal A04 = new C13890nu();
    public static final ThreadLocal A05 = new C13900nv();

    public static float A00() {
        float f = A00;
        if (f != -1.0f) {
            return f;
        }
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        A00 = f2;
        return f2;
    }

    public static float A01(Matrix matrix) {
        float[] fArr = (float[]) A03.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = A01;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static void A02(Canvas canvas, Paint paint, RectF rectF, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        AnonymousClass0K1.A01();
    }

    public static void A03(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) A02.get();
        Path path2 = (Path) A04.get();
        Path path3 = (Path) A05.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && ((double) AnonymousClass002.A00(f2 - f, 1.0f)) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C06100Wg.A00(min, length);
                max = (float) C06100Wg.A00(max, length);
            }
            if (min < 0.0f) {
                min = (float) C06100Wg.A00(min, length);
            }
            if (max < 0.0f) {
                max = (float) C06100Wg.A00(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
            } else {
                if (i >= 0) {
                    min -= length;
                }
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                } else {
                    if (min < 0.0f) {
                        path3.reset();
                        pathMeasure.getSegment(min + length, length, path3, true);
                    }
                    path.set(path2);
                }
                path2.addPath(path3);
                path.set(path2);
            }
        }
        AnonymousClass0K1.A01();
    }

    public static void A04(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
