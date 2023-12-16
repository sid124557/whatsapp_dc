package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.7kJ  reason: invalid class name and case insensitive filesystem */
public class C158637kJ {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A03 = AnonymousClass001.A0N();
    public final Rect A04 = AnonymousClass001.A0N();
    public final Rect A05;
    public final C186338v8 A06;
    public final AnonymousClass7AP A07;
    public final AnonymousClass71K A08;
    public final boolean A09;
    public final int[] A0A;
    public final AnonymousClass7OK[] A0B;

    public static Rect A00(Rect rect, C186338v8 r5) {
        int min;
        int min2;
        if (rect == null) {
            min = r5.getWidth();
            min2 = r5.getHeight();
        } else {
            min = Math.min(rect.width(), r5.getWidth());
            min2 = Math.min(rect.height(), r5.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public final synchronized Bitmap A01(int i, int i2) {
        Bitmap bitmap;
        synchronized (this) {
            Bitmap bitmap2 = this.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || this.A00.getHeight() < i2)) {
                Bitmap bitmap3 = this.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    this.A00 = null;
                }
            }
            Bitmap bitmap4 = this.A00;
            if (bitmap4 == null) {
                bitmap4 = C86664Kz.A0Y(i, i2);
                this.A00 = bitmap4;
            }
            bitmap4.eraseColor(0);
            bitmap = this.A00;
        }
        return bitmap;
    }

    public void A02(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        C186338v8 r6 = this.A06;
        C185798uG frame = r6.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (r6.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double width2 = ((double) rect.width()) / ((double) r6.getWidth());
                    double height2 = ((double) rect.height()) / ((double) r6.getHeight());
                    int round = (int) Math.round(((double) frame.getWidth()) * width2);
                    int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                    int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                    int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                    synchronized (this) {
                        try {
                            int width3 = rect.width();
                            int height3 = rect.height();
                            A01(width3, height3);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(round, round2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, width3, height3);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    if (this.A09) {
                        float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                        width = (int) (((float) frame.getWidth()) / max);
                        height = (int) (((float) frame.getHeight()) / max);
                        xOffset = (int) (((float) frame.getXOffset()) / max);
                        yOffset = (int) (((float) frame.getYOffset()) / max);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap A012 = A01(width, height);
                            this.A00 = A012;
                            frame.renderFrame(width, height, A012);
                            canvas.save();
                            canvas.translate((float) xOffset, (float) yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public final void A03(Canvas canvas, AnonymousClass7OK r7, float f, float f2) {
        if (r7.A05 == C141386vU.DISPOSE_TO_BACKGROUND) {
            int A042 = AnonymousClass6C9.A04((float) r7.A01, f);
            int A043 = AnonymousClass6C9.A04((float) r7.A00, f2);
            int A044 = AnonymousClass6C9.A04((float) r7.A02, f);
            int A045 = AnonymousClass6C9.A04((float) r7.A03, f2);
            canvas.drawRect(new Rect(A044, A045, A042 + A044, A043 + A045), this.A02);
        }
    }

    public C158637kJ(Rect rect, AnonymousClass7AP r8, AnonymousClass71K r9, boolean z) {
        int length;
        this.A08 = r9;
        this.A07 = r8;
        C186338v8 r5 = r8.A00;
        this.A06 = r5;
        int[] frameDurations = r5.getFrameDurations();
        this.A0A = frameDurations;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
            i++;
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < length; i4++) {
        }
        this.A05 = A00(rect, r5);
        this.A09 = z;
        this.A0B = new AnonymousClass7OK[r5.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint paint = new Paint();
        this.A02 = paint;
        C86634Kw.A18(paint, PorterDuff.Mode.CLEAR);
    }
}
