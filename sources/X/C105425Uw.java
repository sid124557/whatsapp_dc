package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.SerializablePoint;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5Uw  reason: invalid class name and case insensitive filesystem */
public abstract class C105425Uw {
    public static float A03 = 12.0f;
    public static float A04 = 24.0f;
    public static float A05 = 32.0f;
    public static float A06 = 96.0f;
    public float A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass002.A07();

    public void A0I(float f, int i) {
        A0H(f, 2);
    }

    public static SerializablePoint A05(float[] fArr, float f, float f2, int i, int i2) {
        return new SerializablePoint((double) (fArr[i] / f), (double) (fArr[i2] / f2));
    }

    public static void A06(RectF rectF, float f, float f2, float f3, float f4) {
        rectF.set(f - ((f - rectF.left) * f2), f3 - ((f3 - rectF.top) * f4), f - (f2 * (f - rectF.right)), f3 - (f4 * (f3 - rectF.bottom)));
    }

    public static void A07(C105425Uw r5, float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        float min = Math.min(f5, f6);
        RectF rectF = r5.A02;
        float f7 = (f5 - min) / 2.0f;
        float f8 = (f6 - min) / 2.0f;
        rectF.set(f2 + f7, f4 + f8, f - f7, f3 - f8);
        rectF.sort();
    }

    public float A08() {
        float strokeWidth;
        float f;
        if (this instanceof C95974vG) {
            strokeWidth = this.A01.getStrokeWidth() * 5.0f;
            f = 3.0f;
        } else if (!(this instanceof AnonymousClass4vD) && !(this instanceof AnonymousClass4vC)) {
            return this.A01.getStrokeWidth();
        } else {
            strokeWidth = this.A01.getStrokeWidth() * 3.0f;
            f = 2.0f;
        }
        return strokeWidth / f;
    }

    public Drawable A09() {
        return null;
    }

    public AnonymousClass7N4 A0A() {
        if (this instanceof C95964vF) {
            C95964vF r1 = (C95964vF) this;
            RectF rectF = r1.A02;
            float f = r1.A00;
            int color = r1.A01.getColor();
            return new C135666l3(rectF, r1.A0A, f, r1.A08(), r1.A05, color, r1.A07, r1.A06, r1.A09.A02);
        }
        return new AnonymousClass7N4(this.A02, this.A00, A08(), this.A01.getColor());
    }

    public String A0B() {
        if (this instanceof C95974vG) {
            return "thinking-bubble";
        }
        if (this instanceof C95964vF) {
            return "text";
        }
        if (this instanceof AnonymousClass4vD) {
            return "speech-bubble-rect";
        }
        if (this instanceof AnonymousClass4vC) {
            return "speech-bubble-oval";
        }
        if (this instanceof C95944vB) {
            return "rect";
        }
        if (this instanceof C95954vE) {
            return "pen";
        }
        if (this instanceof AnonymousClass4vA) {
            return "oval";
        }
        if (this instanceof C95984vH) {
            return "newsletter";
        }
        if (this instanceof AnonymousClass4v8) {
            return "circular-mask";
        }
        return "arrow";
    }

    public String A0C(Context context) {
        int i;
        if (this instanceof C95974vG) {
            i = R.string.f11nameremoved;
        } else if (this instanceof C95964vF) {
            return ((C95964vF) this).A0A;
        } else {
            if (this instanceof AnonymousClass4vD) {
                i = R.string.f11nameremoved;
            } else if (this instanceof AnonymousClass4vC) {
                i = R.string.f11nameremoved;
            } else if (this instanceof C95944vB) {
                i = R.string.f11nameremoved;
            } else if (this instanceof C95954vE) {
                return "";
            } else {
                if (this instanceof AnonymousClass4vA) {
                    i = R.string.f11nameremoved;
                } else if ((this instanceof C95984vH) || (this instanceof AnonymousClass4v8)) {
                    return "";
                } else {
                    i = R.string.f11nameremoved;
                }
            }
        }
        return context.getString(i);
    }

    public void A0D() {
        RectF rectF = this.A02;
        if (rectF.width() < A03) {
            rectF.set(rectF.centerX() - (A03 / 2.0f), rectF.top, rectF.centerX() + (A03 / 2.0f), rectF.bottom);
        }
        if (rectF.height() < A03) {
            rectF.set(rectF.left, rectF.centerY() - (A03 / 2.0f), rectF.right, rectF.centerY() + (A03 / 2.0f));
        }
    }

    public void A0E() {
    }

    public void A0F(float f) {
        RectF rectF = this.A02;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - ((centerX - rectF.left) * f), centerY - ((centerY - rectF.top) * f), centerX - ((centerX - rectF.right) * f), centerY - (f * (centerY - rectF.bottom)));
        A0D();
    }

    public void A0G(float f) {
        this.A01.setStrokeWidth(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r8 == 2) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r8 == 2) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r8 == 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(float r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass4vD
            if (r0 == 0) goto L_0x0024
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r8 == 0) goto L_0x0015
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r2) goto L_0x0016
        L_0x0015:
            r1 = r7
        L_0x0016:
            r0 = 1
            if (r8 == r0) goto L_0x001d
            if (r8 == r2) goto L_0x001d
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            A06(r5, r4, r1, r3, r7)
            r6.A0D()
            return
        L_0x0024:
            boolean r0 = r6 instanceof X.C95944vB
            if (r0 == 0) goto L_0x0048
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r8 == 0) goto L_0x0039
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r2) goto L_0x003a
        L_0x0039:
            r1 = r7
        L_0x003a:
            r0 = 1
            if (r8 == r0) goto L_0x0041
            if (r8 == r2) goto L_0x0041
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0041:
            A06(r5, r4, r1, r3, r7)
            r6.A0D()
            return
        L_0x0048:
            boolean r0 = r6 instanceof X.AnonymousClass4vA
            if (r0 == 0) goto L_0x006c
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r8 == 0) goto L_0x005d
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r2) goto L_0x005e
        L_0x005d:
            r1 = r7
        L_0x005e:
            r0 = 1
            if (r8 == r0) goto L_0x0065
            if (r8 == r2) goto L_0x0065
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0065:
            A06(r5, r4, r1, r3, r7)
            r6.A0D()
            return
        L_0x006c:
            r6.A0F(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105425Uw.A0H(float, int):void");
    }

    public void A0J(int i) {
        if (this instanceof C95964vF) {
            C95964vF r1 = (C95964vF) this;
            r1.A01.setColor(i);
            AnonymousClass5X6 r12 = r1.A09;
            r12.A03 = i;
            r12.A01(i, r12.A02);
            return;
        }
        this.A01.setColor(i);
    }

    public void A0K(Canvas canvas) {
        float degrees;
        float f;
        float f2;
        float width;
        Canvas canvas2 = canvas;
        if (this instanceof C95974vG) {
            C95974vG r2 = (C95974vG) this;
            RectF rectF = r2.A02;
            rectF.sort();
            canvas2.save();
            Matrix matrix = r2.A00;
            RectF rectF2 = r2.A05;
            matrix.setRectToRect(AnonymousClass4L0.A09(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom), rectF, Matrix.ScaleToFit.CENTER);
            Path path = r2.A04;
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r2.A02.transform(matrix, path);
            Paint paint = r2.A01;
            AnonymousClass001.A10(paint);
            paint.setColor(-31);
            path.close();
            canvas2.drawPath(path, paint);
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r2.A03.transform(matrix, path);
            Paint paint2 = r2.A01;
            C86634Kw.A17(paint2);
            canvas2.drawPath(path, paint2);
            canvas2.restore();
            r2.A0X(canvas2, 1.3f, 1.0f);
            r2.A0X(canvas2, 1.7f, 0.5f);
            return;
        }
        if (this instanceof C95964vF) {
            C95964vF r22 = (C95964vF) this;
            if (!TextUtils.isEmpty(r22.A0A)) {
                RectF rectF3 = r22.A02;
                rectF3.sort();
                canvas2.save();
                float f3 = r22.A00;
                if (Math.abs(f3) < 3.0f) {
                    f3 = 0.0f;
                }
                C86604Kt.A16(canvas2, rectF3, f3);
                TextPaint textPaint = r22.A0C;
                AnonymousClass5X6 r4 = r22.A09;
                textPaint.setColor(r4.A01);
                textPaint.setAlpha((int) (r4.A00 * 255.0f));
                Context context = r22.A0B;
                List A002 = C106835aF.A00(context, r22.A08, r22.A05 / 2.0f);
                if (r22.A07 == 2) {
                    A002 = C106835aF.A01(context, r22.A08, r22.A05 / 2.0f);
                }
                float width2 = rectF3.width() / r22.A00;
                int i = r22.A06;
                if (i != 1) {
                    if (i != 2) {
                        f2 = rectF3.centerX();
                        width = (((float) r22.A08.getWidth()) * width2) / 2.0f;
                    } else {
                        f2 = rectF3.right;
                        width = ((float) r22.A08.getWidth()) * width2;
                    }
                    f = f2 - width;
                } else {
                    f = rectF3.left;
                }
                canvas2.translate(f, rectF3.top);
                canvas2.scale(width2, width2, 0.0f, 0.0f);
                textPaint.setPathEffect(new CornerPathEffect(r22.A05 / 2.0f));
                for (int i2 = 0; i2 < A002.size(); i2++) {
                    canvas2.drawPath((Path) A002.get(i2), textPaint);
                }
                textPaint.setPathEffect((PathEffect) null);
                textPaint.setColor(r4.A04);
                r22.A08.draw(canvas2);
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass4vC) {
            AnonymousClass4vC r23 = (AnonymousClass4vC) this;
            RectF rectF4 = r23.A02;
            rectF4.sort();
            Paint paint3 = r23.A01;
            C86634Kw.A17(paint3);
            Matrix matrix2 = r23.A00;
            matrix2.reset();
            matrix2.setRotate(r23.A00, 0.0f, 0.0f);
            matrix2.postScale(rectF4.width() / 2000.0f, rectF4.height() / 2000.0f);
            matrix2.postTranslate(rectF4.centerX(), rectF4.centerY());
            Path path2 = r23.A03;
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            Path path3 = r23.A02;
            path3.transform(matrix2, path2);
            Paint paint4 = r23.A01;
            AnonymousClass001.A10(paint4);
            paint4.setColor(-31);
            path2.close();
            canvas2.drawPath(path2, paint4);
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            path3.transform(matrix2, path2);
            canvas2.drawPath(path2, paint3);
            return;
        } else if (this instanceof C95944vB) {
            RectF rectF5 = this.A02;
            rectF5.sort();
            canvas2.save();
            C86604Kt.A16(canvas2, rectF5, this.A00);
            canvas2.drawRect(rectF5, this.A01);
        } else if (this instanceof C95954vE) {
            C95954vE r24 = (C95954vE) this;
            if (r24.A05) {
                r24.A03.A02(canvas2);
                return;
            }
            return;
        } else if (this instanceof AnonymousClass4vA) {
            RectF rectF6 = this.A02;
            rectF6.sort();
            canvas2.save();
            C86604Kt.A16(canvas2, rectF6, this.A00);
            canvas2.drawOval(rectF6, this.A01);
        } else if (this instanceof C95984vH) {
            return;
        } else {
            if (this instanceof AnonymousClass4v8) {
                RectF rectF7 = this.A02;
                rectF7.sort();
                canvas2.save();
                Path A062 = AnonymousClass002.A06();
                float width3 = rectF7.width();
                float height = rectF7.height();
                Path.Direction direction = Path.Direction.CW;
                A062.addCircle(width3 / 2.0f, height / 2.0f, (1.05f * Math.min(width3, height)) / 2.0f, direction);
                RectF A0b = C86664Kz.A0b(width3, height);
                Path A063 = AnonymousClass002.A06();
                A063.addRect(A0b, direction);
                A063.op(A062, Path.Op.DIFFERENCE);
                Paint A0B = C86604Kt.A0B();
                C86604Kt.A0u(-16777216, A0B);
                canvas2.drawPath(A063, A0B);
            } else {
                canvas2.save();
                float f4 = this.A00;
                RectF rectF8 = this.A02;
                C86604Kt.A16(canvas2, rectF8, f4);
                float f5 = rectF8.left;
                float f6 = rectF8.bottom;
                float f7 = rectF8.right;
                float f8 = rectF8.top;
                Paint paint5 = this.A01;
                Paint paint6 = paint5;
                canvas2.drawLine(f5, f6, f7, f8, paint6);
                if (f7 == f5) {
                    degrees = 90.0f;
                } else {
                    degrees = (float) Math.toDegrees(Math.atan((double) ((f8 - f6) / (f7 - f5))));
                }
                canvas2.save();
                canvas2.translate(f7, f8);
                int i3 = (f5 > f7 ? 1 : (f5 == f7 ? 0 : -1));
                int i4 = 150;
                if (i3 > 0) {
                    i4 = 30;
                }
                canvas2.rotate(degrees + ((float) i4));
                canvas2.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint6);
                int i5 = 60;
                if (i3 > 0) {
                    i5 = -60;
                }
                canvas2.rotate((float) i5);
                canvas2.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint6);
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    public void A0L(Canvas canvas) {
        if ((this instanceof C95974vG) || (this instanceof C95964vF) || (this instanceof AnonymousClass4vD) || (this instanceof AnonymousClass4vC) || (this instanceof C95944vB) || (this instanceof C95954vE) || (this instanceof AnonymousClass4vA) || !(this instanceof C95984vH)) {
            A0K(canvas);
        }
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        if (f == f3) {
            f3 += 1.0f;
        }
        if (f2 == f4) {
            f4 += 1.0f;
        }
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0D();
    }

    public void A0N(AnonymousClass7N4 r3) {
        this.A02.set(r3.A03);
        this.A00 = r3.A00;
        A0J(r3.A02);
        A0G(r3.A01);
    }

    public void A0O(JSONObject jSONObject) {
        float A002 = C86644Kx.A00(this.A02, jSONObject);
        this.A00 = ((float) jSONObject.optInt("rotate", 0)) / A002;
        A0J(jSONObject.getInt("color"));
        A0G(((float) jSONObject.getInt("stroke")) / A002);
    }

    public void A0P(JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0B());
        RectF rectF = this.A02;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f = this.A00;
        if (f != 0.0f) {
            jSONObject.put("rotate", (int) (f * 100.0f));
        }
        jSONObject.put("color", this.A01.getColor());
        jSONObject.put("stroke", (int) (A08() * 100.0f));
    }

    public boolean A0Q() {
        if ((this instanceof C95964vF) || (this instanceof C95954vE)) {
            return false;
        }
        return true;
    }

    public boolean A0R() {
        if ((this instanceof C95964vF) || (this instanceof C95954vE)) {
            return false;
        }
        return true;
    }

    public boolean A0S() {
        return false;
    }

    public boolean A0T() {
        return false;
    }

    public boolean A0U() {
        return false;
    }

    public boolean A0V() {
        return false;
    }

    public boolean A0W() {
        return false;
    }

    public C105425Uw() {
        Paint A0B = C86604Kt.A0B();
        this.A01 = A0B;
        C86634Kw.A17(A0B);
        A0B.setStrokeJoin(Paint.Join.ROUND);
        A0B.setStrokeCap(Paint.Cap.ROUND);
    }
}
