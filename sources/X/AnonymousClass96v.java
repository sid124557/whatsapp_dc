package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: X.96v  reason: invalid class name */
public class AnonymousClass96v extends AnonymousClass9My {
    public AnonymousClass96p A00;
    public AnonymousClass9WH A01;

    public void A02() {
        A04(this.A00.A00());
    }

    public void A03() {
        List A03 = C194899Ux.A03(C194899Ux.A0k, this.A00);
        int i = 4;
        if (!AnonymousClass0x7.A1U(A03, 4)) {
            i = 1;
            if (!AnonymousClass0x7.A1U(A03, 1)) {
                i = 6;
                if (!AnonymousClass0x7.A1U(A03, 6)) {
                    return;
                }
            }
        }
        this.A00.A01(C195049Vr.A0C, Integer.valueOf(i));
    }

    public void A04(AnonymousClass9SE r8) {
        AnonymousClass96s r5;
        boolean z;
        String str;
        this.A00 = new C194429Sv();
        AnonymousClass9WH r4 = this.A01;
        try {
            r5 = (AnonymousClass96s) r4.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            r5 = null;
        }
        if (r8.A0x) {
            z = r4.A02(C195049Vr.A0C, Integer.valueOf(r8.A0C));
        } else {
            z = false;
        }
        if (r8.A0a) {
            z = A00(r4, C195049Vr.A00, r8.A06, z);
        }
        if (r8.A0o) {
            z = A00(r4, C195049Vr.A06, r8.A08, z);
        }
        if (r8.A0v) {
            z = A00(r4, C195049Vr.A0A, r8.A0B, z);
        }
        if (r8.A0r) {
            z = A00(r4, C195049Vr.A08, r8.A0A, z);
        }
        if (r8.A0w) {
            z = A01(r4, C195049Vr.A0B, r8.A0Y, z);
        }
        if (r8.A1E) {
            z = A00(r4, C195049Vr.A0Y, r8.A0E, z);
        }
        if (r8.A1F) {
            z = A00(r4, C195049Vr.A0Z, r8.A0F, z);
        }
        if (r8.A1G) {
            z = A01(r4, C195049Vr.A0a, r8.A0R, z);
        }
        if (r8.A1I) {
            z = A01(r4, C195049Vr.A0c, r8.A0Z, z);
        }
        if (r8.A1M) {
            z = A00(r4, C195049Vr.A0f, r8.A0H, z);
        }
        if (r8.A1N) {
            z = A01(r4, C195049Vr.A0h, r8.A0S, z);
        }
        if (r8.A1O) {
            z = A00(r4, C195049Vr.A0j, r8.A0I, z);
        }
        if (r8.A1Q) {
            z = A00(r4, C195049Vr.A0l, r8.A0J, z);
        }
        if (r8.A1P) {
            z = A01(r4, C195049Vr.A0k, r8.A1i, z);
        }
        if (r8.A1R) {
            z = A01(r4, C195049Vr.A0n, r8.A0T, z);
        }
        if (r8.A1W) {
            z = A00(r4, C195049Vr.A0p, r8.A0K, z);
        }
        if (r8.A1c) {
            z = A01(r4, C195049Vr.A0X, Boolean.valueOf(r8.A1b), z);
        }
        if (r8.A1a) {
            z = A01(r4, C195049Vr.A0u, r8.A0U, z);
        }
        if (r8.A1d) {
            z = A00(r4, C195049Vr.A0v, r8.A0M, z);
        }
        if (r8.A1f) {
            z = A00(r4, C195049Vr.A0x, r8.A0N, z);
        }
        if (r8.A18) {
            z = A01(r4, C195049Vr.A0T, Boolean.valueOf(r8.A17), z);
        }
        if (r8.A1V) {
            z = A01(r4, C195049Vr.A0o, Boolean.valueOf(r8.A1U), z);
        }
        if (r8.A10) {
            z = A01(r4, C195049Vr.A0D, Double.valueOf(r8.A00), z);
        }
        if (r8.A11) {
            z = A01(r4, C195049Vr.A0E, Double.valueOf(r8.A01), z);
        }
        if (r8.A12) {
            z = A01(r4, C195049Vr.A0F, Double.valueOf(r8.A02), z);
        }
        if (r8.A13) {
            z = A01(r4, C195049Vr.A0G, r8.A0W, z);
        }
        if (r8.A14) {
            z = A01(r4, C195049Vr.A0H, Long.valueOf(r8.A0P), z);
        }
        if (r8.A1L) {
            z = A00(r4, C195049Vr.A0d, r8.A0G, z);
        }
        if (r8.A1Z) {
            z = A00(r4, C195049Vr.A0t, r8.A0L, z);
        }
        if (r8.A1D) {
            z = A00(r4, C195049Vr.A0J, r8.A0D, z);
        }
        if (r8.A0q) {
            z = A01(r4, C195049Vr.A0i, (Object) null, z);
        }
        if (r8.A1A) {
            z = A01(r4, C195049Vr.A0S, Boolean.valueOf(r8.A19), z);
        }
        if (r8.A0g) {
            z = A01(r4, C195049Vr.A0L, Boolean.valueOf(r8.A0f), z);
        }
        if (z) {
            AnonymousClass9WH.A05.incrementAndGet();
            try {
                AnonymousClass9WT.A00();
                if (C194989Vk.A02(AnonymousClass9UX.A01)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("applyModifications: [modification] ");
                    Log.i("ParametersModificationApplier", AnonymousClass000.A0X(r8.A00(), A0o));
                }
                r4.A02.setParameters(r4.A01);
                AnonymousClass9WT.A00();
            } catch (RuntimeException e2) {
                AnonymousClass9WT.A00();
                Object[] objArr = new Object[4];
                if (r5 != null) {
                    str = r5.A09();
                } else {
                    str = "null";
                }
                objArr[0] = str;
                objArr[1] = r4.A04.A09();
                objArr[2] = r4.A01.flatten();
                objArr[3] = r8.A00();
                throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", objArr), e2);
            }
        }
    }

    public AnonymousClass96v(Camera.Parameters parameters, Camera camera, AnonymousClass96p r9, AnonymousClass96s r10, int i) {
        this.A00 = r9;
        this.A01 = new AnonymousClass9WH(parameters, camera, r9, r10, i);
    }

    public static boolean A00(AnonymousClass9WH r1, AnonymousClass9Mx r2, int i, boolean z) {
        return z | r1.A02(r2, Integer.valueOf(i));
    }

    public static boolean A01(AnonymousClass9WH r0, AnonymousClass9Mx r1, Object obj, boolean z) {
        return z | r0.A02(r1, obj);
    }
}
