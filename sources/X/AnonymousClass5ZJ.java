package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.5ZJ  reason: invalid class name */
public class AnonymousClass5ZJ {
    public static AnonymousClass4MG A0K;
    public static final Interpolator A0L = new AccelerateDecelerateInterpolator();
    public static final C158417jw A0M = new C158417jw(64);
    public static final Object A0N = AnonymousClass002.A0D();
    public static final ArrayList A0O = AnonymousClass001.A0s();
    public static final ArrayList A0P = AnonymousClass001.A0s();
    public static final ArrayList A0Q = AnonymousClass001.A0s();
    public static final ArrayList A0R = AnonymousClass001.A0s();
    public static final ArrayList A0S = AnonymousClass001.A0s();
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public long A07 = 300;
    public long A08 = -1;
    public long A09;
    public Interpolator A0A = A0L;
    public ArrayList A0B = null;
    public ArrayList A0C = null;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];

    public static AnonymousClass5ZJ A00(float f, float f2) {
        AnonymousClass5ZJ r4 = (AnonymousClass5ZJ) A0M.A00();
        if (r4 == null) {
            r4 = new AnonymousClass5ZJ();
        }
        r4.A03 = 2;
        float[] fArr = r4.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = r4.A0J;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        r4.A0E = false;
        return r4;
    }

    public void A01() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0R.contains(this) || A0P.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C110885hC r2 = (C110885hC) this.A0B.get(i);
                    if (this == r2.A0I) {
                        r2.A0I = null;
                    } else if (this == r2.A0J) {
                        r2.A0J = null;
                    } else if (this == r2.A0K) {
                        r2.A0K = null;
                    } else if (this == r2.A0H) {
                        r2.A0H = null;
                    }
                    A02();
                    if (r2.A0I == null && r2.A0J == null && r2.A0K == null && r2.A0H == null) {
                        r2.A0M = false;
                        C183698qT r0 = r2.A07;
                        if (r0 != null) {
                            r2.A07 = null;
                            r0.BOO();
                        }
                        r2.A04();
                    }
                }
            }
            A04();
        }
    }

    public void A02() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0;
        this.A08 = -1;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300;
        this.A05 = 0;
        this.A0A = A0L;
        this.A00 = 0.0f;
        this.A0D = true;
        A0M.A02(this);
    }

    public final void A04() {
        A0O.remove(this);
        A0R.remove(this);
        A0P.remove(this);
        this.A04 = 0;
        this.A0G = false;
        if (this.A0F) {
            this.A0F = false;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C110885hC r2 = (C110885hC) this.A0B.get(i);
                    if (this == r2.A0I) {
                        r2.A0I = null;
                    } else if (this == r2.A0J) {
                        r2.A0J = null;
                    } else if (this == r2.A0K) {
                        r2.A0K = null;
                    } else if (this == r2.A0H) {
                        r2.A0H = null;
                    }
                    A02();
                    if (r2.A0M && r2.A0I == null && r2.A0J == null && r2.A0K == null && r2.A0H == null) {
                        r2.A0M = false;
                        C183698qT r0 = r2.A07;
                        if (r0 != null) {
                            r2.A07 = null;
                            r0.BTW();
                        }
                        r2.A04();
                    }
                }
            }
        }
    }

    public void A05(long j) {
        if (j >= 0) {
            this.A07 = j;
            return;
        }
        throw AnonymousClass001.A0c(AnonymousClass000.A0Z("Animators cannot have negative duration: ", AnonymousClass001.A0o(), j));
    }

    public void A06(C110885hC r2) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A0B = arrayList;
        }
        arrayList.add(r2);
    }

    public void A07(C180308kp r2) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A0C = arrayList;
        }
        arrayList.add(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 >= 1.0f) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(long r10) {
        /*
            r9 = this;
            int r0 = r9.A04
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0011
            r9.A04 = r6
            long r2 = r9.A08
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
            r9.A09 = r10
        L_0x0011:
            long r3 = r9.A07
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            long r0 = r9.A09
            long r10 = r10 - r0
            float r2 = (float) r10
            float r0 = (float) r3
            float r2 = r2 / r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00d4
        L_0x0023:
            int r7 = r9.A02
            int r1 = r9.A05
            if (r7 < r1) goto L_0x00b9
            r0 = -1
            if (r1 == r0) goto L_0x00b9
            float r2 = java.lang.Math.min(r2, r5)
        L_0x0030:
            int r1 = r9.A03
            r3 = 0
            r4 = 1
            r7 = 2
            if (r1 != r7) goto L_0x006f
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0046
            r9.A0D = r3
            float[] r0 = r9.A0J
            r1 = r0[r4]
            r0 = r0[r3]
            float r1 = r1 - r0
            r9.A01 = r1
        L_0x0046:
            android.view.animation.Interpolator r0 = r9.A0A
            float r1 = r0.getInterpolation(r2)
            float[] r0 = r9.A0J
            r3 = r0[r3]
            float r0 = r9.A01
            float r1 = r1 * r0
            float r3 = r3 + r1
        L_0x0054:
            r9.A00 = r3
            java.util.ArrayList r0 = r9.A0C
            if (r0 == 0) goto L_0x00e5
            int r2 = r0.size()
            r1 = 0
        L_0x005f:
            if (r1 >= r2) goto L_0x00e5
            java.util.ArrayList r0 = r9.A0C
            java.lang.Object r0 = r0.get(r1)
            X.8kp r0 = (X.C180308kp) r0
            r0.BMT(r9)
            int r1 = r1 + 1
            goto L_0x005f
        L_0x006f:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            android.view.animation.Interpolator r0 = r9.A0A
            float r2 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            r1 = r0[r3]
            float r2 = r2 - r1
            r0 = r0[r4]
            float r0 = r0 - r1
            float r2 = r2 / r0
            float[] r0 = r9.A0J
            r3 = r0[r3]
            r0 = r0[r4]
            float r0 = r0 - r3
            float r2 = r2 * r0
            float r3 = r3 + r2
            goto L_0x0054
        L_0x008d:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b3
            android.view.animation.Interpolator r0 = r9.A0A
            float r5 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            int r4 = r9.A03
            int r3 = r4 + -2
            r2 = r0[r3]
            float r5 = r5 - r2
            int r1 = r4 + -1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r5 = r5 / r0
            float[] r0 = r9.A0J
            r3 = r0[r3]
            r1 = r0[r1]
            int r4 = r4 - r7
            r0 = r0[r4]
            float r1 = r1 - r0
            float r5 = r5 * r1
            float r3 = r3 + r5
            goto L_0x0054
        L_0x00b3:
            float[] r0 = r9.A0J
            int r1 = r1 - r4
            r3 = r0[r1]
            goto L_0x0054
        L_0x00b9:
            java.util.ArrayList r6 = r9.A0B
            if (r6 == 0) goto L_0x00ca
            int r1 = r6.size()
            r0 = 0
        L_0x00c2:
            if (r0 >= r1) goto L_0x00ca
            r6.get(r0)
            int r0 = r0 + 1
            goto L_0x00c2
        L_0x00ca:
            int r0 = (int) r2
            int r7 = r7 + r0
            r9.A02 = r7
            float r2 = r2 % r5
            long r0 = r9.A09
            long r0 = r0 + r3
            r9.A09 = r0
        L_0x00d4:
            r6 = 0
            goto L_0x0030
        L_0x00d7:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x00db:
            long r0 = r10 - r2
            r9.A09 = r0
            r0 = -1
            r9.A08 = r0
            goto L_0x0011
        L_0x00e5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZJ.A08(long):boolean");
    }

    public void A03() {
        long j;
        AnonymousClass4MG r0;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0R.add(this);
            if (!this.A0E || this.A04 == 0) {
                j = 0;
            } else {
                j = AnimationUtils.currentAnimationTimeMillis() - this.A09;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = j;
                this.A04 = C18310x6.A02(this.A0E ? 1 : 0);
            }
            this.A09 = currentAnimationTimeMillis - j;
            this.A0E = true;
            A08(currentAnimationTimeMillis);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.get(i);
                }
            }
            synchronized (A0N) {
                r0 = A0K;
                if (r0 == null) {
                    r0 = new AnonymousClass4MG();
                    A0K = r0;
                }
            }
            r0.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }
}
