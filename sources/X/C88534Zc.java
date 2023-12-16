package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.4Zc  reason: invalid class name and case insensitive filesystem */
public final class C88534Zc extends AnonymousClass6KS {
    public static final Matrix A0X = AnonymousClass002.A05();
    public static final Paint A0Y = C86604Kt.A0B();
    public static final Path A0Z = AnonymousClass002.A06();
    public static final C157467iL A0a = new C157467iL();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public C110885hC A0H;
    public AnonymousClass7AD A0I;
    public C108975ds A0J;
    public Object A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final float A0R;
    public final float A0S;
    public final int A0T;
    public final float[] A0U;
    public final float[] A0V;
    public final float[] A0W = new float[2];

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        if (r1 != null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r11 = this;
            r2 = 0
            r11.A0G = r2
            X.5hC r7 = r11.A09
            X.8kj r0 = r7.A08
            r6 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0013
            android.view.View r2 = r0.B8K(r11)
            r11.A0G = r2
            r11.A0Q = r6
        L_0x0013:
            r1 = -2
            if (r2 == 0) goto L_0x0054
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r11.A0G
            X.C86624Kv.A0v(r0, r1)
        L_0x0021:
            android.view.View r4 = r11.A0G
            X.4PH r3 = r7.A0R
            int r0 = r3.getWidth()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r3.getHeight()
            X.AnonymousClass001.A19(r4, r0, r2, r1)
            android.view.View r0 = r11.A0G
            int r0 = r0.getMeasuredWidth()
            r11.A0F = r0
            android.view.View r0 = r11.A0G
            int r2 = r0.getMeasuredHeight()
            r11.A0E = r2
            android.view.View r1 = r11.A0G
            int r0 = r11.A0F
            r1.layout(r6, r6, r0, r2)
            r11.A0F()
            r11.A02()
            return
        L_0x0054:
            r11.A0Q = r10
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r1, r1)
            android.content.Context r9 = r11.A08
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r9)
            r4.setLayoutParams(r5)
            r4.setOrientation(r10)
            java.lang.String r1 = r11.A0M
            r3 = 3
            if (r1 == 0) goto L_0x00c2
            java.lang.String r0 = r11.A0L
            if (r0 == 0) goto L_0x00c2
            int r8 = r11.A0T
            int r2 = r8 / r3
        L_0x0075:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r8, r8, r2)
            java.lang.String r0 = r11.A0M
            r1.setText(r0)
            X.C86664Kz.A1S(r1)
            r1.setMaxLines(r10)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r0)
            r0 = 17
            r1.setGravity(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setTextColor(r0)
            r0 = -1
            r5.width = r0
            r4.addView(r1, r5)
        L_0x009d:
            java.lang.String r0 = r11.A0L
            if (r0 == 0) goto L_0x00be
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r2, r8, r8)
            r1.setText(r0)
            r0 = 5
            r1.setMaxLines(r0)
            X.C86664Kz.A1S(r1)
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setTextColor(r0)
            r5.gravity = r3
            r4.addView(r1, r5)
        L_0x00be:
            r11.A0G = r4
            goto L_0x0021
        L_0x00c2:
            int r2 = r11.A0T
            r8 = r2
            if (r1 == 0) goto L_0x009d
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88534Zc.A0E():void");
    }

    public int A01(float f, float f2) {
        if (this.A0P) {
            Matrix matrix = A0X;
            matrix.setRotate(this.A05);
            float[] fArr = this.A0W;
            fArr[0] = this.A01 - this.A03;
            fArr[1] = this.A0A - this.A06;
            matrix.mapPoints(fArr);
            float f3 = fArr[0] + this.A0C;
            fArr[0] = f3;
            float f4 = fArr[1] + (this.A0D - this.A0R);
            fArr[1] = f4;
            int i = this.A0F;
            float f5 = (float) this.A0E;
            float f6 = f4 - f5;
            float f7 = (float) (i / 2);
            float f8 = f3 - f7;
            float f9 = f3 + f7;
            float f10 = this.A0S;
            if (f5 <= f10) {
                float f11 = this.A0B;
                f6 -= f11;
                f4 -= f11;
            }
            if (((float) i) <= f10) {
                float f12 = this.A02;
                f8 -= f12;
                f9 += f12;
            }
            if (f >= f8 && f <= f9 && f2 >= f6 && f2 <= f4) {
                this.A0N = true;
                return 2;
            }
        }
        this.A0N = false;
        if (!A0I()) {
            return 0;
        }
        long nanoTime = System.nanoTime();
        try {
            float[] fArr2 = this.A0W;
            fArr2[0] = f;
            fArr2[1] = f2;
            Matrix matrix2 = A0X;
            matrix2.setRotate(-this.A05, this.A0C, this.A0D);
            matrix2.mapPoints(fArr2);
            float f13 = fArr2[0];
            float f14 = this.A0C;
            float f15 = f14 - this.A03;
            if (f13 >= f15 && f13 <= this.A04 + f14) {
                float f16 = fArr2[1];
                float f17 = this.A0D;
                if (f16 >= f17 - this.A06 && f16 <= f17 + this.A00) {
                    return 2;
                }
            }
            float f18 = this.A02;
            if (f13 >= f15 - f18 && f13 <= f14 + this.A04 + f18) {
                float f19 = fArr2[1];
                float f20 = this.A0D;
                float f21 = this.A0B;
                if (f19 >= (f20 - this.A06) - f21 && f19 <= f20 + this.A00 + f21) {
                    C86614Ku.A1N(C158827kc.A0H, nanoTime);
                    return 1;
                }
            }
            C86614Ku.A1N(C158827kc.A0H, nanoTime);
            return 0;
        } finally {
            C86614Ku.A1N(C158827kc.A0H, nanoTime);
        }
    }

    public void A05() {
        if (this.A0P) {
            A0C();
        }
        this.A09.A0D(this);
    }

    public void A07(float f, float f2) {
        if (this.A0N) {
            this.A0O = true;
            A02();
        }
    }

    public void A08(float f, float f2) {
        if (this.A0N && this.A0O) {
            this.A0O = false;
            A02();
        }
    }

    public boolean A0A(float f, float f2) {
        Object obj;
        C110885hC r0;
        C180268kl r02;
        C110885hC r4 = this.A09;
        r4.A0R.A0T.BlT("marker_click");
        if (!this.A0N || (r0 = this.A0H) == null || (r02 = r0.A0A) == null) {
            C110885hC r03 = this.A0H;
            if (r03 != null) {
                C180288kn r3 = r03.A0C;
                if (r3 != null) {
                    C88534Zc r1 = this;
                    AnonymousClass69V r32 = (AnonymousClass69V) r3;
                    switch (r32.A01) {
                        case 0:
                            AnonymousClass4U2 r6 = ((BusinessDirectoryMapViewActivity) r32.A00).A0N;
                            if (r6 == null) {
                                throw C86604Kt.A0j();
                            }
                            C162457s7.A0H(this);
                            Object obj2 = this.A0K;
                            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.businessdirectory.viewmodel.MarkerData");
                            if (((C166297yS) obj2).A00 == 1) {
                                C166477yk r8 = r6.A02;
                                if (r8 != null) {
                                    r6.A05 = this;
                                    Object obj3 = this.A0K;
                                    C162457s7.A0K(obj3, "null cannot be cast to non-null type com.whatsapp.businessdirectory.viewmodel.MarkerData");
                                    C166047y3 r04 = ((C166297yS) obj3).A02;
                                    C162457s7.A0H(r04);
                                    C108975ds A002 = C108975ds.A00(r04.A00, r04.A01);
                                    float f3 = 15.5f;
                                    if (r6.A0J) {
                                        f3 = Math.min(r8.A02 + ((float) 4), 15.5f);
                                    }
                                    AnonymousClass7UM A012 = C153847c7.A01(A002, f3);
                                    C150797Sg r05 = new C150797Sg();
                                    r05.A02 = A002;
                                    r05.A01 = f3;
                                    r6.A02 = r05.A00();
                                    r6.A0C = "map_view";
                                    AnonymousClass4UC r33 = r6.A0h;
                                    C162457s7.A0H(A012);
                                    C86644Kx.A1E(r33, A012, 1000, false);
                                    r6.A0B = 1;
                                    r6.A0K = true;
                                }
                                C111525iE r42 = r6.A0V;
                                Integer num = r6.A0B;
                                C95224sp r12 = new C95224sp();
                                C95224sp.A01(r12, 77);
                                r12.A09 = num;
                                r12.A0B = 1;
                                r42.A04(r12);
                                return true;
                            }
                            break;
                        case 1:
                            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) r32.A00;
                            C111445i6 r06 = groupChatLiveLocationsActivity.A0N;
                            r06.A0u = true;
                            r06.A0s = false;
                            View view = r06.A0U;
                            C54942pX r34 = r06.A0m;
                            int i = 8;
                            if (r34 == null) {
                                i = 0;
                            }
                            view.setVisibility(i);
                            Object obj4 = this.A0K;
                            if (obj4 instanceof C105735We) {
                                C105735We r35 = (C105735We) obj4;
                                if (!this.A04) {
                                    r35 = groupChatLiveLocationsActivity.A0N.A09((C54942pX) r35.A04.get(0));
                                    if (r35 != null) {
                                        r1 = (C88534Zc) groupChatLiveLocationsActivity.A0S.get(r35.A03);
                                    }
                                }
                                if (r35.A00 != 1) {
                                    List list = r35.A04;
                                    if (list.size() == 1) {
                                        groupChatLiveLocationsActivity.A0N.A0S(r35, true);
                                        r1.A0D();
                                        return true;
                                    }
                                    C110885hC r07 = groupChatLiveLocationsActivity.A05;
                                    C626936e.A06(r07);
                                    if (r07.A02().A02 >= 16.0f) {
                                        groupChatLiveLocationsActivity.A0N.A0S(r35, true);
                                        return true;
                                    }
                                    groupChatLiveLocationsActivity.A78(list, true);
                                    groupChatLiveLocationsActivity.A0N.A0j = new C148197Hj(list, groupChatLiveLocationsActivity.A05.A02().A02);
                                    return true;
                                }
                            }
                            groupChatLiveLocationsActivity.A0N.A0C();
                            return true;
                        default:
                            LocationPicker locationPicker = (LocationPicker) r32.A00;
                            C108145cU r13 = locationPicker.A0P;
                            if (!r13.A0t) {
                                if (String.valueOf(this.A06) != null) {
                                    PlaceInfo placeInfo = r13.A0f;
                                    if (!(placeInfo == null || (obj = placeInfo.A0D) == null)) {
                                        C88534Zc r14 = (C88534Zc) obj;
                                        r14.A0G(locationPicker.A05);
                                        r14.A0C();
                                    }
                                    A0G(locationPicker.A06);
                                    locationPicker.A0P.A0Q(this);
                                    locationPicker.A0P.A0B.setVisibility(8);
                                    locationPicker.A0P.A0E.setVisibility(8);
                                    if (locationPicker.A0P.A0p || !locationPicker.A0H.A05()) {
                                        A0D();
                                        return true;
                                    }
                                }
                            }
                            break;
                    }
                }
                A0D();
                C108975ds r08 = this.A0J;
                AnonymousClass7UM r36 = new AnonymousClass7UM();
                r36.A06 = r08;
                r4.A0B(r36, (C183698qT) null, 500);
                return true;
            }
        } else {
            r02.BUY(this);
        }
        return true;
    }

    public void A0C() {
        if (this.A0P && this.A03 != 1) {
            this.A03 = 1;
            C110885hC r0 = this.A0H;
            if (r0 != null) {
                r0.A0D(this);
                r0.A0C(this);
            }
        }
        this.A0P = false;
    }

    public final void A0F() {
        Bitmap bitmap = this.A0I.A00;
        float width = (float) bitmap.getWidth();
        float[] fArr = this.A0U;
        float f = fArr[0] * width;
        this.A03 = f;
        this.A04 = width - f;
        float height = (float) bitmap.getHeight();
        float f2 = fArr[1] * height;
        this.A06 = f2;
        this.A00 = height - f2;
        float[] fArr2 = this.A0V;
        this.A01 = fArr2[0] * width;
        this.A0A = fArr2[1] * height;
        float f3 = this.A0S;
        if (width < f3) {
            this.A02 = (f3 - width) / 2.0f;
        } else {
            this.A02 = 0.0f;
        }
        if (height < f3) {
            this.A0B = (f3 - height) / 2.0f;
        } else {
            this.A0B = 0.0f;
        }
        Matrix matrix = A0X;
        matrix.setRotate(0.0f);
        float[] fArr3 = this.A0C;
        fArr3[0] = this.A03 - this.A01;
        fArr3[1] = this.A06 - this.A0A;
        matrix.mapPoints(fArr3);
        this.A09 = ((float) this.A0E) + this.A0R + fArr3[1];
        float f4 = (float) (this.A0F / 2);
        float f5 = fArr3[0];
        this.A07 = f4 + f5;
        this.A08 = f4 - f5;
    }

    public void A0G(AnonymousClass7AD r1) {
        if (r1 == null) {
            r1 = C106915aN.A00();
        }
        this.A0I = r1;
        A0F();
        A02();
    }

    public void A0H(C108975ds r3) {
        this.A0J = r3;
        this.A00 = C106725a3.A01(r3.A01);
        this.A01 = C106725a3.A00(r3.A00);
        A02();
    }

    public final boolean A0I() {
        boolean z;
        if (!this.A0P || (this.A0M == null && this.A0L == null)) {
            z = false;
        } else {
            z = true;
        }
        this.A05 = 0.0f + 0.0f;
        C157467iL r10 = A0a;
        double d = this.A00;
        C106725a3 r12 = this.A0A;
        double A032 = d - r12.A03(this.A03);
        r10.A01 = A032;
        double A033 = d + r12.A03(this.A04);
        r10.A02 = A033;
        double d2 = this.A01;
        double A034 = d2 - r12.A03(this.A06);
        r10.A03 = A034;
        r10.A00 = d2 + r12.A03(this.A00);
        if (z) {
            double A035 = d2 - r12.A03(this.A09);
            if (A035 < A034) {
                r10.A03 = A035;
            }
            double A036 = d - r12.A03(this.A07);
            if (A036 < A032) {
                r10.A01 = A036;
            }
            double A037 = d + r12.A03(this.A08);
            if (A033 < A037) {
                r10.A02 = A037;
            }
        }
        float[] fArr = this.A0C;
        C157467iL r4 = this.A0B;
        r12.A07(r4);
        if (r10.A00 >= r4.A03 && r10.A03 <= r4.A00) {
            fArr[0] = (float) ((int) Math.ceil(r4.A01 - r10.A02));
            float floor = (float) ((int) Math.floor(r4.A02 - r10.A01));
            fArr[1] = floor;
            float f = fArr[0];
            if (f <= floor) {
                r12.A08(fArr, d + ((double) f), d2);
                this.A0C = fArr[0];
                this.A0D = fArr[1];
                return true;
            }
        }
        return false;
    }

    public C108975ds BBX() {
        return this.A0J;
    }

    public C88534Zc(C110885hC r7, C156967hV r8) {
        super(r7);
        float[] fArr = new float[2];
        this.A0V = fArr;
        float[] fArr2 = new float[2];
        this.A0U = fArr2;
        C108975ds r2 = r8.A01;
        this.A0J = r2;
        this.A00 = C106725a3.A01(r2.A01);
        this.A01 = C106725a3.A00(r2.A00);
        AnonymousClass7AD r0 = r8.A00;
        this.A0I = r0 == null ? C106915aN.A00() : r0;
        this.A0M = r8.A03;
        this.A0L = r8.A02;
        this.A04 = true;
        this.A02 = 0.0f;
        float[] fArr3 = r8.A06;
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        float[] fArr4 = r8.A07;
        fArr[0] = fArr4[0];
        fArr[1] = fArr4[1];
        float f = this.A05;
        this.A0S = 48.0f * f;
        this.A0T = (int) (8.0f * f);
        this.A0R = f * 5.0f;
        A0F();
    }

    public void A0B(Canvas canvas) {
        boolean z;
        long nanoTime = System.nanoTime();
        try {
            Bitmap bitmap = this.A0I.A00;
            if (!this.A0P || (this.A0M == null && this.A0L == null)) {
                z = false;
            } else {
                z = true;
            }
            if (A0I()) {
                Paint paint = A0Y;
                paint.setAlpha((int) (1.0f * 255.0f));
                Matrix matrix = A0X;
                matrix.setTranslate(this.A0C - this.A03, this.A0D - this.A06);
                matrix.postRotate(this.A05, this.A0C, this.A0D);
                Canvas canvas2 = canvas;
                canvas2.drawBitmap(bitmap, matrix, paint);
                paint.setAlpha(255);
                if (z) {
                    float[] fArr = this.A0W;
                    fArr[0] = this.A01;
                    fArr[1] = this.A0A;
                    matrix.mapPoints(fArr);
                    long nanoTime2 = System.nanoTime();
                    int i = this.A0F / 2;
                    if (this.A0Q) {
                        Path path = A0Z;
                        path.reset();
                        float f = (float) i;
                        float f2 = fArr[1] - ((float) this.A0E);
                        float f3 = this.A0R;
                        float f4 = f3 * ((float) 1);
                        path.moveTo(fArr[0] - f, f2 - f4);
                        path.lineTo(fArr[0] + f, (fArr[1] - ((float) this.A0E)) - f4);
                        path.lineTo(fArr[0] + f, fArr[1] - f4);
                        path.lineTo(fArr[0] + f3, fArr[1] - f4);
                        path.lineTo(fArr[0], fArr[1]);
                        path.lineTo(fArr[0] - f3, fArr[1] - f4);
                        path.lineTo(fArr[0] - f, fArr[1] - f4);
                        path.close();
                        paint.setColor(-16777216);
                        paint.setShadowLayer(12.0f, 0.0f, 0.0f, -16777216);
                        canvas2.drawPath(path, paint);
                        int i2 = -1;
                        if (this.A0O) {
                            i2 = -2236963;
                        }
                        paint.setColor(i2);
                        canvas2.drawPath(path, paint);
                    }
                    matrix.setTranslate(fArr[0] - ((float) i), (fArr[1] - ((float) this.A0E)) - this.A0R);
                    this.A0G.setDrawingCacheEnabled(true);
                    canvas2.drawBitmap(this.A0G.getDrawingCache(), matrix, paint);
                    C86614Ku.A1N(C158827kc.A0D, nanoTime2);
                }
            }
        } finally {
            C86614Ku.A1N(C158827kc.A0G, nanoTime);
        }
    }

    public void A0D() {
        A0E();
        if (this.A03 != 4) {
            this.A03 = 4;
            C110885hC r0 = this.A0H;
            if (r0 != null) {
                r0.A0D(this);
                r0.A0C(this);
            }
        }
        this.A0P = true;
    }

    public void A04() {
        A0C();
    }
}
