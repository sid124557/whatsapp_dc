package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.EnumSet;
import java.util.Queue;

/* renamed from: X.4PH  reason: invalid class name */
public class AnonymousClass4PH extends FrameLayout implements C177678gG, C177688gH, C177698gI {
    public static final double A0n = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02 = 0.5d;
    public double A03 = 0.5d;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C = -987675;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I = SystemClock.uptimeMillis();
    public long A0J;
    public long A0K;
    public Context A0L;
    public C110885hC A0M;
    public C150067Pa A0N;
    public C110815h5 A0O;
    public C177668gF A0P;
    public AnonymousClass7TJ A0Q;
    public C117575s9 A0R;
    public C103015Ld A0S;
    public C186958wD A0T = C186958wD.A00;
    public Queue A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final BroadcastReceiver A0e = new C188678zJ(this, 0);
    public final ComponentCallbacks A0f = new C162657sX(this);
    public final Matrix A0g = AnonymousClass002.A05();
    public final Matrix A0h = AnonymousClass002.A05();
    public final Paint A0i = C86664Kz.A0a(2);
    public final RectF A0j = AnonymousClass002.A07();
    public final EnumSet A0k = EnumSet.of(C999158r.A00);
    public final float[] A0l = new float[2];
    public final float[] A0m = new float[4];

    public final void A06() {
        this.A0b = false;
        this.A0M.A0S.A06();
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    private void A01() {
        C157627ic r1 = this.A0M.A0V;
        if (r1.A04) {
            r1.A01(false);
        }
        if (this.A0W) {
            Context context = this.A0L;
            context.unregisterComponentCallbacks(this.A0f);
            try {
                context.unregisterReceiver(this.A0e);
            } catch (IllegalArgumentException unused) {
            }
            this.A0W = false;
        }
        this.A0M.A07();
        for (C158827kc A022 : C158827kc.A0Q) {
            A022.A02();
        }
    }

    private void A02(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            C110885hC r2 = this.A0M;
            A0D((int) Math.min(Math.max((float) bundle.getInt("zoom"), r2.A01), r2.A00), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1)));
            double d = bundle.getDouble("yVisibleCenter");
            C110885hC r0 = this.A0M;
            this.A03 = d - ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1)));
            this.A0A = bundle.getFloat("rotation");
            Matrix matrix = this.A0g;
            float f = this.A0B;
            matrix.setScale(f, f);
            matrix.postRotate(this.A0A);
            matrix.invert(this.A0h);
            this.A0c = false;
        }
    }

    public double A03(double d, long j) {
        double d2 = this.A01 * (((double) this.A0J) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A0G == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            X.5hC r2 = r5.A0M
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x000b
            X.4Zg r1 = r2.A0G
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.7ic r1 = r2.A0V
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0018
            r1.A01(r4)
        L_0x0018:
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0031
            android.content.Context r3 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0f
            r3.registerComponentCallbacks(r0)
            android.content.BroadcastReceiver r2 = r5.A0e
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0W = r4
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PH.A04():void");
    }

    public final void A05() {
        int size = this.A0M.A0X.size();
        for (int i = 0; i < size; i++) {
            this.A0M.A0X.get(i);
        }
        C161847qe.A02(new AnonymousClass6KZ());
    }

    public final void A07() {
        C110885hC r4 = this.A0M;
        C153297b0 r1 = r4.A0U.A0A;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        this.A0b = true;
        r4.A07();
        C117575s9 r12 = this.A0R;
        r12.A0D.removeCallbacks(r12);
        r12.A0B = false;
        r12.A07 = false;
        r12.A08 = true;
        r12.A0E.forceFinished(true);
        r12.A01 = 0.0f;
        r12.A00 = 0.0f;
    }

    public final void A08() {
        C153297b0 r1 = this.A0M.A0U.A0A;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        C117575s9 r2 = this.A0R;
        View view = r2.A0D;
        view.removeCallbacks(r2);
        r2.A08 = false;
        r2.A07 = true;
        view.postOnAnimation(r2);
    }

    public final void A09() {
        RectF rectF = this.A0j;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0D;
        Matrix matrix = this.A0h;
        matrix.mapRect(rectF);
        float[] fArr = this.A0m;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0J;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    public void A0B(float f, float f2, float f3) {
        if (this.A0Y) {
            C106725a3 r0 = this.A0M.A0S;
            float[] fArr = this.A0l;
            r0.A0A(fArr, f2, f3);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0g;
            matrix.postRotate(f - this.A0A, f2, f3);
            matrix.invert(this.A0h);
            this.A0A = f % 360.0f;
            A09();
            A0C(f2, f3, f4, f5);
        }
    }

    public final void A0C(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0l;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0h.mapVectors(fArr);
        long j = this.A0J;
        double d = (double) j;
        this.A02 = A00(((double) f3) + (((double) fArr[0]) / d));
        this.A03 = A03(((double) f4) + (((double) fArr[1]) / d), j);
    }

    public final void A0D(int i, float f) {
        this.A0G = i;
        this.A0B = f;
        int i2 = 1 << i;
        this.A0E = i2;
        this.A0J = (long) (i2 * this.A0M.A0O);
    }

    public final void A0E(Bundle bundle) {
        C150067Pa r0 = this.A0N;
        C110885hC r3 = new C110885hC(r0, this);
        this.A0M = r3;
        C166477yk r4 = r0.A02;
        if (r4 == null) {
            float f = r3.A01;
            A0D((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(r4.A02, r3.A01), r3.A00);
            A0D((int) min, (min % 1.0f) + 1.0f);
            C108975ds r2 = r4.A03;
            if (r2 != null) {
                this.A02 = C106725a3.A01(r2.A01);
                this.A03 = C106725a3.A00(r2.A00);
            }
            this.A0A = r4.A00;
        }
        this.A0Q = r3.A0T;
        Matrix matrix = this.A0g;
        float f2 = this.A0B;
        matrix.setScale(f2, f2);
        matrix.postRotate(this.A0A);
        matrix.invert(this.A0h);
        A02(bundle);
    }

    public final void A0F(Bundle bundle) {
        if (!this.A0c) {
            bundle.putDouble("xVisibleCenter", this.A02 + ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1))));
            double d = this.A03;
            C110885hC r0 = this.A0M;
            bundle.putDouble("yVisibleCenter", d + ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1))));
            bundle.putInt("zoom", this.A0G);
            bundle.putFloat("scale", this.A0B);
            bundle.putFloat("rotation", this.A0A);
            this.A0c = true;
        }
    }

    public void A0G(C180298ko r2) {
        Queue queue;
        if (!this.A0Z || ((queue = this.A0U) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0U;
            if (queue2 == null) {
                queue2 = AnonymousClass0x9.A18();
                this.A0U = queue2;
            }
            queue2.add(r2);
            return;
        }
        r2.BW1(this.A0M);
    }

    public boolean A0H(float f, float f2, float f3) {
        C106725a3 r0 = this.A0M.A0S;
        float[] fArr = this.A0l;
        r0.A0A(fArr, f2, f3);
        float f4 = fArr[0];
        float f5 = fArr[1];
        C110885hC r2 = this.A0M;
        float min = Math.min(Math.max(f, r2.A01), r2.A00);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0G;
        float f7 = f6 / this.A0B;
        this.A06 = f7;
        A0D((int) min, f6);
        Matrix matrix = this.A0g;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0h);
        A09();
        A0C(f2, f3, f4, f5);
        if (this.A0G != i) {
            return true;
        }
        return false;
    }

    public final boolean A0I(float f, float f2, float f3) {
        float f4 = this.A0B * f;
        int i = this.A0G;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        if (A0H((((float) i) + f4) - 1.0f, f2, f3)) {
            this.A0M.A04();
        }
        return AnonymousClass000.A1S((this.A06 > 1.0f ? 1 : (this.A06 == 1.0f ? 0 : -1)));
    }

    public EnumSet getCurrentAttribution() {
        return this.A0k;
    }

    @Deprecated
    public final C110885hC getMap() {
        return this.A0M;
    }

    public final C150067Pa getMapOptions() {
        return this.A0N;
    }

    public float getPixelSize() {
        return (float) this.A0J;
    }

    public float getTileScale() {
        return this.A0B;
    }

    public float getZoom() {
        return (((float) this.A0G) + this.A0B) - 1.0f;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A02(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z = this.A0c;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z) {
            return onSaveInstanceState;
        }
        Bundle A082 = AnonymousClass002.A08();
        A0F(A082);
        A082.putParcelable("parentBundle", onSaveInstanceState);
        return A082;
    }

    public final void setMapEventHandler(C186958wD r1) {
        if (r1 == null) {
            r1 = C186958wD.A00;
        }
        this.A0T = r1;
    }

    public AnonymousClass4PH(Context context, C150067Pa r6) {
        super(context);
        if ("FacebookMapOptions.java".equals(r6.A03) && "MapView.java".length() > 0) {
            r6.A03 = "MapView.java";
        }
        this.A0H = System.nanoTime();
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = r6;
        boolean z = r6.A06;
        r6.A06 = z;
        this.A0C = z ? -15789542 : -987675;
        C103015Ld r1 = new C103015Ld(context, this);
        this.A0S = r1;
        Matrix matrix = this.A0h;
        r1.A0J = matrix;
        r1.A08 = 0.87f;
        this.A0Y = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0d = true;
        C117575s9 r0 = new C117575s9(this, this);
        this.A0R = r0;
        r0.A06 = matrix;
        C161247pI.A09.add(AnonymousClass0x9.A14(this));
        C161247pI.A02(false);
    }

    public void A0A(double d, double d2) {
        this.A02 = A00(d);
        this.A03 = A03(d2, this.A0J);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A04();
            this.A0K = System.nanoTime();
            if (!this.A0a) {
                AnonymousClass6KW r3 = this.A0M.A0U.A03;
                r3.A01.set(0);
                r3.A00.set(0);
                r3.A01.set(0);
                this.A0a = true;
                return;
            }
            return;
        }
        throw new RuntimeException("MapView.onCreate() must be called!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C110885hC r2 = this.A0M;
        AnonymousClass4Zg r1 = r2.A0G;
        if (r1 != null) {
            r1.A0E.A01();
            r1.A02();
        }
        r2.A03();
        C161847qe.A02(new AnonymousClass6KZ());
        A01();
    }

    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0C);
        this.A0V = true;
        int size = this.A0M.A0X.size();
        for (int i = 0; i < size; i++) {
            C110815h5 r2 = (C110815h5) this.A0M.A0X.get(i);
            if (r2.A04) {
                r2.A0B(canvas);
                if (r2 instanceof AnonymousClass6KU) {
                    this.A0V = AnonymousClass000.A1T(((AnonymousClass6KV) r2).A06) & this.A0V;
                }
            }
        }
        if (this.A0V) {
            C110885hC r1 = this.A0M;
            if (r1.A0L != null) {
                r1.A05();
            }
            if (this.A0a) {
                C125996Kh r12 = this.A0M.A0U;
                new C118375tR(r12.A03, this.A0N.A04);
                this.A0a = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A04;
        C158827kc.A0C.A03(nanoTime2 - nanoTime);
        if (this.A0H > 0) {
            new C118385tS(this, str, nanoTime2);
            this.A0H = 0;
        }
        if (this.A0K > 0) {
            new C118395tT(this, str, nanoTime2);
            this.A0K = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bd, code lost:
        if (r1 != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            long r2 = java.lang.System.nanoTime()
            super.onLayout(r10, r11, r12, r13, r14)
            int r0 = r9.getWidth()
            r9.A0F = r0
            int r5 = r9.getHeight()
            r9.A0D = r5
            int r4 = r9.A0F
            float r0 = (float) r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r9.A04 = r0
            float r0 = (float) r5
            float r0 = r0 / r1
            r9.A05 = r0
            int r0 = java.lang.Math.max(r5, r4)
            double r4 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            X.5hC r6 = r9.A0M
            int r0 = r6.A0O
            double r0 = (double) r0
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            double r0 = (double) r0
            double r4 = java.lang.Math.log(r0)
            double r0 = A0n
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            r9.A07 = r0
            float r1 = r6.A01
            X.4PH r0 = r6.A0R
            float r0 = r0.A07
            float r4 = java.lang.Math.max(r1, r0)
            r6.A01 = r4
            int r0 = r9.A0G
            float r1 = (float) r0
            float r0 = r9.A0B
            float r1 = r1 + r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r6
            r8 = 1
            r5 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = (int) r4
            float r4 = r4 % r6
            float r4 = r4 + r6
            r9.A0D(r0, r4)
            r1 = 1
        L_0x0063:
            r9.A09()
            boolean r0 = r9.A0Z
            if (r0 != 0) goto L_0x00bd
            int r0 = r9.A0G
            float r4 = (float) r0
            float r0 = r9.A0B
            float r4 = r4 + r0
            float r4 = r4 - r6
            X.5hC r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            boolean r0 = r9.A0H(r4, r1, r0)
            if (r0 == 0) goto L_0x0086
            X.5hC r0 = r9.A0M
            r0.A04()
        L_0x0086:
            double r6 = r9.A02
            double r0 = r9.A03
            r9.A0A(r6, r0)
            float r4 = r9.A0A
            X.5hC r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0B(r4, r1, r0)
            r9.A0Z = r8
        L_0x009e:
            X.5hC r0 = r9.A0M
            r0.A04()
        L_0x00a3:
            X.5hC r0 = r9.A0M
            java.util.List r0 = r0.A0X
            int r1 = r0.size()
        L_0x00ab:
            if (r5 >= r1) goto L_0x00c2
            X.5hC r0 = r9.A0M
            java.util.List r0 = r0.A0X
            java.lang.Object r0 = r0.get(r5)
            X.5h5 r0 = (X.C110815h5) r0
            r0.A03()
            int r5 = r5 + 1
            goto L_0x00ab
        L_0x00bd:
            if (r1 == 0) goto L_0x00a3
            goto L_0x009e
        L_0x00c0:
            r1 = 0
            goto L_0x0063
        L_0x00c2:
            java.util.Queue r0 = r9.A0U
            if (r0 == 0) goto L_0x00d0
            X.6Ka r1 = new X.6Ka
            r1.<init>(r9)
            android.os.Handler r0 = X.C161847qe.A02
            r0.post(r1)
        L_0x00d0:
            X.7kc r0 = X.C158827kc.A0E
            X.C86614Ku.A1N(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PH.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0364, code lost:
        if (X.AnonymousClass002.A00(r3.A0C, r3.A0A) <= r6) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0372, code lost:
        if (r11 != 0.0f) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ac, code lost:
        if (r7 <= (r1 + r4)) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (X.AnonymousClass002.A00(r8, r3.A01) <= r5) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.AnonymousClass002.A00(r8, r3.A0A) <= r11) goto L_0x0264;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0332 A[Catch:{ all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0369 A[Catch:{ all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0376 A[Catch:{ all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0417 A[Catch:{ all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132 A[Catch:{ all -> 0x0480 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            long r16 = java.lang.System.nanoTime()
            r0 = r22
            X.5Ld r3 = r0.A0S     // Catch:{ all -> 0x0480 }
            r15 = r23
            int r5 = r15.getActionMasked()     // Catch:{ all -> 0x0480 }
            int r14 = r15.getPointerCount()     // Catch:{ all -> 0x0480 }
            long r0 = r15.getEventTime()     // Catch:{ all -> 0x0480 }
            float r9 = r15.getX()     // Catch:{ all -> 0x0480 }
            float r8 = r15.getY()     // Catch:{ all -> 0x0480 }
            boolean r4 = r3.A0Q     // Catch:{ all -> 0x0480 }
            java.lang.String r6 = "longPressTimeout"
            r10 = 2
            r7 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0049
            if (r5 != r10) goto L_0x0042
            if (r14 > r2) goto L_0x0042
            float r4 = r3.A09     // Catch:{ all -> 0x0480 }
            float r12 = X.AnonymousClass002.A00(r9, r4)     // Catch:{ all -> 0x0480 }
            int r4 = r3.A0R     // Catch:{ all -> 0x0480 }
            float r11 = (float) r4     // Catch:{ all -> 0x0480 }
            int r4 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            float r4 = r3.A0A     // Catch:{ all -> 0x0480 }
            float r4 = X.AnonymousClass002.A00(r8, r4)     // Catch:{ all -> 0x0480 }
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0264
        L_0x0042:
            r3.A0Q = r7     // Catch:{ all -> 0x0480 }
            android.os.Handler r4 = X.C161847qe.A02     // Catch:{ all -> 0x0480 }
            r4.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0480 }
        L_0x0049:
            if (r5 == r10) goto L_0x0264
            if (r5 != 0) goto L_0x00db
            r3.A0N = r7     // Catch:{ all -> 0x0480 }
            r3.A0M = r7     // Catch:{ all -> 0x0480 }
            boolean r4 = r3.A0O     // Catch:{ all -> 0x0480 }
            if (r4 == 0) goto L_0x0077
            long r4 = r3.A0G     // Catch:{ all -> 0x0480 }
            long r11 = r0 - r4
            int r4 = r3.A0E     // Catch:{ all -> 0x0480 }
            long r4 = (long) r4     // Catch:{ all -> 0x0480 }
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x0077
            float r4 = r3.A00     // Catch:{ all -> 0x0480 }
            float r10 = X.AnonymousClass002.A00(r9, r4)     // Catch:{ all -> 0x0480 }
            int r4 = r3.A0D     // Catch:{ all -> 0x0480 }
            float r5 = (float) r4     // Catch:{ all -> 0x0480 }
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0077
            float r4 = r3.A01     // Catch:{ all -> 0x0480 }
            float r4 = X.AnonymousClass002.A00(r8, r4)     // Catch:{ all -> 0x0480 }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x007f
        L_0x0077:
            r3.A0O = r7     // Catch:{ all -> 0x0480 }
            r3.A00 = r9     // Catch:{ all -> 0x0480 }
            r3.A01 = r8     // Catch:{ all -> 0x0480 }
            r3.A0G = r0     // Catch:{ all -> 0x0480 }
        L_0x007f:
            r3.A09 = r9     // Catch:{ all -> 0x0480 }
            r3.A0A = r8     // Catch:{ all -> 0x0480 }
            r3.A0Q = r2     // Catch:{ all -> 0x0480 }
            X.8Mo r11 = r3.A0T     // Catch:{ all -> 0x0480 }
            long r4 = r3.A0S     // Catch:{ all -> 0x0480 }
            android.os.Handler r10 = X.C161847qe.A02     // Catch:{ all -> 0x0480 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0480 }
            long r0 = r0 + r4
            r10.postAtTime(r11, r6, r0)     // Catch:{ all -> 0x0480 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x00b1
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch:{ all -> 0x0480 }
            r3.A0K = r0     // Catch:{ all -> 0x0480 }
        L_0x009d:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0480 }
            X.8gH r10 = r3.A0L     // Catch:{ all -> 0x0480 }
            X.4PH r10 = (X.AnonymousClass4PH) r10     // Catch:{ all -> 0x0480 }
            r10.A0X = r7     // Catch:{ all -> 0x0480 }
            X.5hC r0 = r10.A0M     // Catch:{ all -> 0x0480 }
            java.util.List r7 = r0.A0X     // Catch:{ all -> 0x0480 }
            int r6 = X.AnonymousClass002.A03(r7)     // Catch:{ all -> 0x0480 }
            goto L_0x00b5
        L_0x00b1:
            r0.clear()     // Catch:{ all -> 0x0480 }
            goto L_0x009d
        L_0x00b5:
            r5 = 0
            r4 = 0
        L_0x00b7:
            if (r6 < 0) goto L_0x00d1
            java.lang.Object r3 = r7.get(r6)     // Catch:{ all -> 0x0480 }
            X.5h5 r3 = (X.C110815h5) r3     // Catch:{ all -> 0x0480 }
            boolean r0 = r3.A04     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x00ce
            int r1 = r3.A01(r9, r8)     // Catch:{ all -> 0x0480 }
            r0 = 2
            if (r1 == r0) goto L_0x00d2
            if (r1 <= r4) goto L_0x00ce
            r5 = r3
            r4 = r1
        L_0x00ce:
            int r6 = r6 + -1
            goto L_0x00b7
        L_0x00d1:
            r3 = r5
        L_0x00d2:
            r10.A0O = r3     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0478
            r3.A07(r9, r8)     // Catch:{ all -> 0x0480 }
            goto L_0x0478
        L_0x00db:
            if (r5 != r2) goto L_0x023d
            r3.A0F = r7     // Catch:{ all -> 0x0480 }
            long r4 = r3.A0I     // Catch:{ all -> 0x0480 }
            long r10 = r0 - r4
            int r4 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x0480 }
            long r4 = (long) r4     // Catch:{ all -> 0x0480 }
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0137
            X.8gH r5 = r3.A0L     // Catch:{ all -> 0x0480 }
            X.4PH r5 = (X.AnonymousClass4PH) r5     // Catch:{ all -> 0x0480 }
            r5.A06()     // Catch:{ all -> 0x0480 }
            X.7TJ r0 = r5.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x010e
            X.5hC r6 = r5.A0M     // Catch:{ all -> 0x0480 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.7UM r4 = new X.7UM     // Catch:{ all -> 0x0480 }
            r4.<init>()     // Catch:{ all -> 0x0480 }
            r4.A02 = r0     // Catch:{ all -> 0x0480 }
            X.90V r1 = new X.90V     // Catch:{ all -> 0x0480 }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x0480 }
        L_0x0109:
            r0 = 200(0xc8, float:2.8E-43)
            r6.A0B(r4, r1, r0)     // Catch:{ all -> 0x0480 }
        L_0x010e:
            boolean r0 = r3.A0O     // Catch:{ all -> 0x0480 }
            r0 = r0 ^ 1
            r3.A0O = r0     // Catch:{ all -> 0x0480 }
            X.8gH r5 = r3.A0L     // Catch:{ all -> 0x0480 }
            float r4 = r3.A09     // Catch:{ all -> 0x0480 }
            float r1 = r3.A0A     // Catch:{ all -> 0x0480 }
            X.4PH r5 = (X.AnonymousClass4PH) r5     // Catch:{ all -> 0x0480 }
            r5.A06()     // Catch:{ all -> 0x0480 }
            boolean r0 = r5.A0X     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x012e
            X.5s9 r0 = r5.A0R     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A07     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x012e
            X.5hC r0 = r5.A0M     // Catch:{ all -> 0x0480 }
            r0.A04()     // Catch:{ all -> 0x0480 }
        L_0x012e:
            X.5h5 r0 = r5.A0O     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0478
            r0.A08(r4, r1)     // Catch:{ all -> 0x0480 }
            goto L_0x0478
        L_0x0137:
            boolean r4 = r3.A0O     // Catch:{ all -> 0x0480 }
            java.lang.String r6 = "clickTimeout"
            if (r4 == 0) goto L_0x0198
            long r4 = r3.A0G     // Catch:{ all -> 0x0480 }
            long r10 = r0 - r4
            int r4 = r3.A0E     // Catch:{ all -> 0x0480 }
            long r4 = (long) r4     // Catch:{ all -> 0x0480 }
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0198
            float r4 = r3.A00     // Catch:{ all -> 0x0480 }
            float r7 = X.AnonymousClass002.A00(r9, r4)     // Catch:{ all -> 0x0480 }
            int r4 = r3.A0D     // Catch:{ all -> 0x0480 }
            float r5 = (float) r4     // Catch:{ all -> 0x0480 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0198
            float r4 = r3.A01     // Catch:{ all -> 0x0480 }
            float r4 = X.AnonymousClass002.A00(r8, r4)     // Catch:{ all -> 0x0480 }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0198
            android.os.Handler r0 = X.C161847qe.A02     // Catch:{ all -> 0x0480 }
            r0.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0480 }
            X.8gH r5 = r3.A0L     // Catch:{ all -> 0x0480 }
            float r4 = r3.A00     // Catch:{ all -> 0x0480 }
            float r1 = r3.A01     // Catch:{ all -> 0x0480 }
            X.4PH r5 = (X.AnonymousClass4PH) r5     // Catch:{ all -> 0x0480 }
            r5.A06()     // Catch:{ all -> 0x0480 }
            X.7TJ r0 = r5.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x010e
            int r4 = (int) r4     // Catch:{ all -> 0x0480 }
            int r0 = (int) r1     // Catch:{ all -> 0x0480 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x0480 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0480 }
            X.5hC r6 = r5.A0M     // Catch:{ all -> 0x0480 }
            r0 = 1065353216(0x3f800000, float:1.0)
            X.7UM r4 = new X.7UM     // Catch:{ all -> 0x0480 }
            r4.<init>()     // Catch:{ all -> 0x0480 }
            r4.A02 = r0     // Catch:{ all -> 0x0480 }
            int r0 = r1.x     // Catch:{ all -> 0x0480 }
            float r0 = (float) r0     // Catch:{ all -> 0x0480 }
            r4.A03 = r0     // Catch:{ all -> 0x0480 }
            int r0 = r1.y     // Catch:{ all -> 0x0480 }
            float r0 = (float) r0     // Catch:{ all -> 0x0480 }
            r4.A04 = r0     // Catch:{ all -> 0x0480 }
            X.90V r1 = new X.90V     // Catch:{ all -> 0x0480 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0480 }
            goto L_0x0109
        L_0x0198:
            boolean r4 = r3.A0N     // Catch:{ all -> 0x0480 }
            if (r4 != 0) goto L_0x01b1
            boolean r4 = r3.A0Q     // Catch:{ all -> 0x0480 }
            if (r4 != 0) goto L_0x01b1
            X.8Mo r8 = r3.A0U     // Catch:{ all -> 0x0480 }
            int r0 = r3.A0E     // Catch:{ all -> 0x0480 }
            long r4 = (long) r0     // Catch:{ all -> 0x0480 }
            android.os.Handler r7 = X.C161847qe.A02     // Catch:{ all -> 0x0480 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0480 }
            long r0 = r0 + r4
            r7.postAtTime(r8, r6, r0)     // Catch:{ all -> 0x0480 }
            goto L_0x010e
        L_0x01b1:
            long r4 = r3.A0H     // Catch:{ all -> 0x0480 }
            long r0 = r0 - r4
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x0480 }
            long r4 = (long) r4     // Catch:{ all -> 0x0480 }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01dc
            boolean r0 = r3.A0M     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x01dc
            X.8gH r1 = r3.A0L     // Catch:{ all -> 0x0480 }
            X.4PH r1 = (X.AnonymousClass4PH) r1     // Catch:{ all -> 0x0480 }
            X.7TJ r0 = r1.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x01dc
            r0 = 0
            r1.A0b = r0     // Catch:{ all -> 0x0480 }
            X.5s9 r0 = r1.A0R     // Catch:{ all -> 0x0480 }
            r0.A09 = r2     // Catch:{ all -> 0x0480 }
            r1.A08()     // Catch:{ all -> 0x0480 }
            X.8wD r1 = r1.A0T     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "zoom"
            r1.BlT(r0)     // Catch:{ all -> 0x0480 }
        L_0x01dc:
            boolean r0 = r3.A0N     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x010e
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0480 }
            android.view.VelocityTracker r1 = r3.A0K     // Catch:{ all -> 0x0480 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)     // Catch:{ all -> 0x0480 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            float r5 = r0.getXVelocity()     // Catch:{ all -> 0x0480 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            float r6 = r0.getYVelocity()     // Catch:{ all -> 0x0480 }
            float r1 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0480 }
            float r0 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0480 }
            float r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0480 }
            float r0 = r3.A07     // Catch:{ all -> 0x0480 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x010e
            X.8gH r4 = r3.A0L     // Catch:{ all -> 0x0480 }
            float r1 = r3.A08     // Catch:{ all -> 0x0480 }
            float r5 = r5 * r1
            float r1 = r1 * r6
            X.4PH r4 = (X.AnonymousClass4PH) r4     // Catch:{ all -> 0x0480 }
            X.7TJ r0 = r4.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x010e
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x0480 }
            X.5s9 r0 = r4.A0R     // Catch:{ all -> 0x0480 }
            int r6 = r4.A0F     // Catch:{ all -> 0x0480 }
            int r7 = r4.A0D     // Catch:{ all -> 0x0480 }
            int r8 = (int) r5     // Catch:{ all -> 0x0480 }
            int r9 = (int) r1     // Catch:{ all -> 0x0480 }
            android.widget.OverScroller r5 = r0.A0E     // Catch:{ all -> 0x0480 }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r10
            r13 = r11
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0480 }
            r0.A0A = r2     // Catch:{ all -> 0x0480 }
            r4.A08()     // Catch:{ all -> 0x0480 }
            X.8wD r1 = r4.A0T     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "pan"
            r1.BlT(r0)     // Catch:{ all -> 0x0480 }
            goto L_0x010e
        L_0x023d:
            r4 = 5
            if (r5 != r4) goto L_0x0244
            r3.A0I = r0     // Catch:{ all -> 0x0480 }
            goto L_0x0478
        L_0x0244:
            r4 = 6
            if (r5 != r4) goto L_0x0253
            if (r14 != r10) goto L_0x0478
            r3.A0H = r0     // Catch:{ all -> 0x0480 }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x0478
            r3.A0M = r7     // Catch:{ all -> 0x0480 }
            goto L_0x0478
        L_0x0253:
            r0 = 3
            if (r5 != r0) goto L_0x0478
            r3.A0F = r7     // Catch:{ all -> 0x0480 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0478
            r0.recycle()     // Catch:{ all -> 0x0480 }
            r0 = 0
            r3.A0K = r0     // Catch:{ all -> 0x0480 }
            goto L_0x0478
        L_0x0264:
            r1 = 0
            r13 = 0
            r10 = 0
        L_0x0267:
            if (r1 >= r14) goto L_0x0276
            float r0 = r15.getX(r1)     // Catch:{ all -> 0x0480 }
            float r13 = r13 + r0
            float r0 = r15.getY(r1)     // Catch:{ all -> 0x0480 }
            float r10 = r10 + r0
            int r1 = r1 + 1
            goto L_0x0267
        L_0x0276:
            float r12 = (float) r14     // Catch:{ all -> 0x0480 }
            float r13 = r13 / r12
            float r10 = r10 / r12
            r11 = 0
            r6 = 0
        L_0x027b:
            if (r11 >= r14) goto L_0x0296
            float r0 = r15.getX(r11)     // Catch:{ all -> 0x0480 }
            float r0 = r0 - r13
            double r0 = (double) r0     // Catch:{ all -> 0x0480 }
            r20 = r0
            float r0 = r15.getY(r11)     // Catch:{ all -> 0x0480 }
            float r0 = r0 - r10
            double r0 = (double) r0     // Catch:{ all -> 0x0480 }
            r4 = r20
            double r0 = java.lang.Math.hypot(r4, r0)     // Catch:{ all -> 0x0480 }
            float r4 = (float) r0     // Catch:{ all -> 0x0480 }
            float r6 = r6 + r4
            int r11 = r11 + 1
            goto L_0x027b
        L_0x0296:
            float r6 = r6 / r12
            r3.A0B = r13     // Catch:{ all -> 0x0480 }
            r3.A0C = r10     // Catch:{ all -> 0x0480 }
            android.graphics.Matrix r1 = r3.A0J     // Catch:{ all -> 0x0480 }
            if (r1 == 0) goto L_0x02ac
            float[] r0 = r3.A0V     // Catch:{ all -> 0x0480 }
            r0[r7] = r13     // Catch:{ all -> 0x0480 }
            r0[r2] = r10     // Catch:{ all -> 0x0480 }
            r1.mapPoints(r0)     // Catch:{ all -> 0x0480 }
            r13 = r0[r7]     // Catch:{ all -> 0x0480 }
            r10 = r0[r2]     // Catch:{ all -> 0x0480 }
        L_0x02ac:
            int r1 = r3.A0F     // Catch:{ all -> 0x0480 }
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r14 == r1) goto L_0x02ba
            r3.A02 = r6     // Catch:{ all -> 0x0480 }
            r3.A06 = r0     // Catch:{ all -> 0x0480 }
            if (r14 <= r2) goto L_0x046b
            goto L_0x0454
        L_0x02ba:
            float r4 = r3.A06     // Catch:{ all -> 0x0480 }
            if (r14 <= r2) goto L_0x0337
            float r5 = r3.A02     // Catch:{ all -> 0x0480 }
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x02c8
            float r12 = r6 / r5
            goto L_0x02ca
        L_0x02c8:
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x02ca:
            float r11 = r12 / r4
            float r0 = X.AnonymousClass002.A00(r11, r0)     // Catch:{ all -> 0x0480 }
            double r0 = (double) r0
            r18 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            boolean r18 = X.AnonymousClass001.A1W(r4)
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0311
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x0480 }
            float r8 = r8 - r0
            double r4 = (double) r8     // Catch:{ all -> 0x0480 }
            float r0 = r15.getX(r2)     // Catch:{ all -> 0x0480 }
            float r9 = r9 - r0
            double r0 = (double) r9     // Catch:{ all -> 0x0480 }
            double r0 = java.lang.Math.atan2(r4, r0)     // Catch:{ all -> 0x0480 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0480 }
            float r4 = (float) r0     // Catch:{ all -> 0x0480 }
            int r0 = r3.A0F     // Catch:{ all -> 0x0480 }
            if (r0 == r14) goto L_0x02fb
            r3.A05 = r4     // Catch:{ all -> 0x0480 }
        L_0x02fb:
            float r0 = r3.A05     // Catch:{ all -> 0x0480 }
            float r5 = r4 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0309
            float r5 = r5 - r1
            goto L_0x0314
        L_0x0309:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0314
            float r5 = r5 + r1
            goto L_0x0314
        L_0x0311:
            r0 = 0
            goto L_0x0325
        L_0x0314:
            r3.A05 = r4     // Catch:{ all -> 0x0480 }
            float r0 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0480 }
            double r0 = (double) r0     // Catch:{ all -> 0x0480 }
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0311
            r0 = 0
            r3.A0I = r0     // Catch:{ all -> 0x0480 }
        L_0x0325:
            float r4 = r3.A02     // Catch:{ all -> 0x0480 }
            float r5 = X.AnonymousClass002.A00(r6, r4)     // Catch:{ all -> 0x0480 }
            int r4 = r3.A0R     // Catch:{ all -> 0x0480 }
            float r4 = (float) r4     // Catch:{ all -> 0x0480 }
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0334
            r3.A0I = r0     // Catch:{ all -> 0x0480 }
        L_0x0334:
            r0 = r11
            r4 = r12
            goto L_0x0339
        L_0x0337:
            r18 = 0
        L_0x0339:
            float r1 = r3.A03     // Catch:{ all -> 0x0480 }
            float r12 = r13 - r1
            float r1 = r3.A04     // Catch:{ all -> 0x0480 }
            float r11 = r10 - r1
            boolean r1 = r3.A0N     // Catch:{ all -> 0x0480 }
            if (r1 != 0) goto L_0x035d
            float r5 = r3.A0B     // Catch:{ all -> 0x0480 }
            float r1 = r3.A09     // Catch:{ all -> 0x0480 }
            float r5 = X.AnonymousClass002.A00(r5, r1)     // Catch:{ all -> 0x0480 }
            int r1 = r3.A0R     // Catch:{ all -> 0x0480 }
            float r6 = (float) r1     // Catch:{ all -> 0x0480 }
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0374
            float r5 = r3.A0C     // Catch:{ all -> 0x0480 }
            float r1 = r3.A0A     // Catch:{ all -> 0x0480 }
            float r1 = X.AnonymousClass002.A00(r5, r1)     // Catch:{ all -> 0x0480 }
            goto L_0x0362
        L_0x035d:
            boolean r1 = r3.A0M     // Catch:{ all -> 0x0480 }
            if (r1 != 0) goto L_0x0366
            goto L_0x036b
        L_0x0362:
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0374
        L_0x0366:
            r1 = 0
        L_0x0367:
            if (r18 == 0) goto L_0x0376
            goto L_0x041d
        L_0x036b:
            r5 = 0
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0374
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0366
        L_0x0374:
            r1 = 1
            goto L_0x0367
        L_0x0376:
            r3.A0M = r7     // Catch:{ all -> 0x0480 }
            if (r1 == 0) goto L_0x0451
            X.8gH r9 = r3.A0L     // Catch:{ all -> 0x0480 }
            float r1 = r3.A0B     // Catch:{ all -> 0x0480 }
            float r7 = r3.A0C     // Catch:{ all -> 0x0480 }
            float r8 = r3.A08     // Catch:{ all -> 0x0480 }
            float r12 = r12 * r8
            float r8 = r8 * r11
            X.4PH r9 = (X.AnonymousClass4PH) r9     // Catch:{ all -> 0x0480 }
            X.5h5 r6 = r9.A0O     // Catch:{ all -> 0x0480 }
            if (r6 == 0) goto L_0x03b4
            boolean r0 = r6 instanceof X.AnonymousClass4Zf     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x03b4
            X.4Zf r6 = (X.AnonymousClass4Zf) r6     // Catch:{ all -> 0x0480 }
            boolean r0 = r6.A0D     // Catch:{ all -> 0x0480 }
            r5 = 0
            if (r0 == 0) goto L_0x03b4
            float r0 = r6.A04     // Catch:{ all -> 0x0480 }
            float r4 = r6.A05     // Catch:{ all -> 0x0480 }
            float r11 = r0 - r4
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x03ae
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x03ae
            float r1 = r6.A06     // Catch:{ all -> 0x0480 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03ae
            float r1 = r1 + r4
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b4
        L_0x03ae:
            r6.A0D = r5     // Catch:{ all -> 0x0480 }
            r6.A02()     // Catch:{ all -> 0x0480 }
            goto L_0x0413
        L_0x03b4:
            X.7TJ r0 = r9.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0413
            r9.requestDisallowInterceptTouchEvent(r2)     // Catch:{ all -> 0x0480 }
            r9.A07()     // Catch:{ all -> 0x0480 }
            double r0 = r9.A02     // Catch:{ all -> 0x0480 }
            long r4 = r9.A0J     // Catch:{ all -> 0x0480 }
            float r11 = (float) r4     // Catch:{ all -> 0x0480 }
            float r6 = r12 / r11
            double r6 = (double) r6     // Catch:{ all -> 0x0480 }
            double r0 = r0 - r6
            double r0 = A00(r0)     // Catch:{ all -> 0x0480 }
            r9.A02 = r0     // Catch:{ all -> 0x0480 }
            double r0 = r9.A03     // Catch:{ all -> 0x0480 }
            float r6 = r8 / r11
            double r6 = (double) r6     // Catch:{ all -> 0x0480 }
            double r0 = r0 - r6
            double r0 = r9.A03(r0, r4)     // Catch:{ all -> 0x0480 }
            r9.A03 = r0     // Catch:{ all -> 0x0480 }
            r9.invalidate()     // Catch:{ all -> 0x0480 }
            X.5hC r6 = r9.A0M     // Catch:{ all -> 0x0480 }
            X.8kk r0 = r6.A09     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x03ec
            java.util.ArrayList r0 = r6.A0W     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x0411
        L_0x03ec:
            float r0 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0480 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x03fe
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0480 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0411
        L_0x03fe:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0480 }
            long r0 = r9.A0I     // Catch:{ all -> 0x0480 }
            long r11 = r4 - r0
            r7 = 200(0xc8, double:9.9E-322)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0411
            r6.A04()     // Catch:{ all -> 0x0480 }
            r9.A0I = r4     // Catch:{ all -> 0x0480 }
        L_0x0411:
            r9.A0X = r2     // Catch:{ all -> 0x0480 }
        L_0x0413:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x041a
            r0.addMovement(r15)     // Catch:{ all -> 0x0480 }
        L_0x041a:
            r3.A0N = r2     // Catch:{ all -> 0x0480 }
            goto L_0x0472
        L_0x041d:
            X.8gH r6 = r3.A0L     // Catch:{ all -> 0x0480 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r8 = r3.A0B     // Catch:{ all -> 0x0480 }
            float r5 = r3.A0C     // Catch:{ all -> 0x0480 }
            X.4PH r6 = (X.AnonymousClass4PH) r6     // Catch:{ all -> 0x0480 }
            X.7TJ r0 = r6.A0Q     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x044d
            r6.A07()     // Catch:{ all -> 0x0480 }
            r6.A08 = r8     // Catch:{ all -> 0x0480 }
            r6.A09 = r5     // Catch:{ all -> 0x0480 }
            boolean r0 = r6.A0I(r1, r8, r5)     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x044a
            boolean r0 = r6.A0d     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x044a
            X.5s9 r5 = r6.A0R     // Catch:{ all -> 0x0480 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r5.A01 = r1     // Catch:{ all -> 0x0480 }
            r0 = 0
            r5.A05 = r0     // Catch:{ all -> 0x0480 }
        L_0x044a:
            r6.invalidate()     // Catch:{ all -> 0x0480 }
        L_0x044d:
            r3.A06 = r4     // Catch:{ all -> 0x0480 }
            r3.A0M = r2     // Catch:{ all -> 0x0480 }
        L_0x0451:
            r3.A0N = r7     // Catch:{ all -> 0x0480 }
            goto L_0x0472
        L_0x0454:
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x0480 }
            float r8 = r8 - r0
            double r0 = (double) r8     // Catch:{ all -> 0x0480 }
            float r4 = r15.getX(r2)     // Catch:{ all -> 0x0480 }
            float r9 = r9 - r4
            double r4 = (double) r9     // Catch:{ all -> 0x0480 }
            double r0 = java.lang.Math.atan2(r0, r4)     // Catch:{ all -> 0x0480 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0480 }
            float r4 = (float) r0     // Catch:{ all -> 0x0480 }
            r3.A05 = r4     // Catch:{ all -> 0x0480 }
        L_0x046b:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0472
            r0.clear()     // Catch:{ all -> 0x0480 }
        L_0x0472:
            r3.A03 = r13     // Catch:{ all -> 0x0480 }
            r3.A04 = r10     // Catch:{ all -> 0x0480 }
            r3.A0F = r14     // Catch:{ all -> 0x0480 }
        L_0x0478:
            X.7kc r3 = X.C158827kc.A0N
            r0 = r16
            X.C86614Ku.A1N(r3, r0)
            return r2
        L_0x0480:
            r3 = move-exception
            X.7kc r2 = X.C158827kc.A0N
            r0 = r16
            X.C86614Ku.A1N(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A04();
        } else {
            A01();
        }
    }

    public void setOnFirstTileLoadedCallback(C177668gF r1) {
        this.A0P = r1;
    }
}
