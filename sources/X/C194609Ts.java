package X;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9Ts  reason: invalid class name and case insensitive filesystem */
public class C194609Ts {
    public static int A06;
    public static boolean A07;
    public static boolean A08;
    public static volatile boolean A09;
    public Map A00 = Collections.emptyMap();
    public final PackageManager A01;
    public final CameraManager A02;
    public final AnonymousClass9TX A03;
    public final C194959Vh A04;
    public volatile C193439Oq[] A05 = null;

    public final int A00(int i) {
        if (this.A05 == null) {
            A04();
        }
        if (!(this.A05 == null || this.A05.length == 0)) {
            for (int i2 = 0; i2 < this.A05.length; i2++) {
                if (this.A05[i2].A00 == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public int A01(String str) {
        if (this.A05 == null) {
            A04();
        }
        C193439Oq[] r0 = this.A05;
        r0.getClass();
        int length = r0.length;
        for (int i = 0; i < length; i++) {
            C193439Oq r1 = this.A05[i];
            if (r1.A02.equals(str)) {
                return r1.A00;
            }
        }
        AnonymousClass9WT.A01("CameraInventory", AnonymousClass000.A0V("Failed to find camera facing for id: ", str, AnonymousClass001.A0o()));
        return 0;
    }

    public final C193439Oq A02(int i) {
        if (this.A05 == null) {
            A04();
        }
        int A002 = A00(i);
        if (A002 != -1) {
            C193439Oq[] r0 = this.A05;
            r0.getClass();
            return r0[A002];
        }
        throw AnonymousClass001.A0c("Camera facing did not resolve to a camera info instance");
    }

    public final void A04() {
        if (this.A05 == null) {
            C194959Vh r2 = this.A04;
            if (r2.A09()) {
                A05();
                return;
            }
            try {
                r2.A01(new AnonymousClass96k(), new C204469pP((Object) this, 10)).get();
            } catch (InterruptedException | ExecutionException e) {
                AnonymousClass9WT.A01("CameraInventory", AnonymousClass000.A0a("failed to load camera infos: ", AnonymousClass001.A0o(), e));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.9Oq[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r14 = this;
            android.hardware.camera2.CameraManager r10 = r14.A02
            r10.getClass()
            java.lang.String[] r9 = r10.getCameraIdList()
            int r8 = r9.length
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            r13 = 0
            r6 = 0
            r12 = 0
            r11 = 0
        L_0x0012:
            r4 = 1
            if (r6 >= r8) goto L_0x0056
            r5 = r9[r6]
            android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r5)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r0.intValue()
            r2 = 0
            if (r3 == r4) goto L_0x002e
            r2 = 1
        L_0x002e:
            java.util.Map r0 = r14.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0040
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0051
        L_0x0040:
            java.util.Map r0 = r14.A00
            java.lang.String r0 = X.C18310x6.A0o(r1, r0)
            if (r0 == 0) goto L_0x0049
            r5 = r0
        L_0x0049:
            X.9Oq r0 = new X.9Oq
            r0.<init>(r2, r5, r3)
            r7.put(r1, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x0070
            r11 = 1
            if (r12 == 0) goto L_0x0074
        L_0x0056:
            int r0 = r7.size()
            X.9Oq[] r3 = new X.C193439Oq[r0]
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r7)
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = X.AnonymousClass0x2.A0W(r2)
            int r0 = r13 + 1
            r3[r13] = r1
            r13 = r0
            goto L_0x0060
        L_0x0070:
            r12 = 1
            if (r11 == 0) goto L_0x0074
            goto L_0x0056
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0012
        L_0x0077:
            A08 = r11
            A07 = r12
            if (r11 == 0) goto L_0x007f
            int r12 = r12 + 1
        L_0x007f:
            A06 = r12
            r14.A05 = r3
            A09 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194609Ts.A05():void");
    }

    public final boolean A06() {
        if (!A09) {
            PackageManager packageManager = this.A01;
            if (packageManager == null) {
                AnonymousClass9WT.A01("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A07 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A08 = true;
            }
            int i = A07;
            if (A08) {
                i++;
            }
            A06 = i;
            A09 = true;
        }
        return true;
    }

    public C194609Ts(PackageManager packageManager, CameraManager cameraManager, AnonymousClass9TX r4, C194959Vh r5) {
        this.A02 = cameraManager;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = packageManager;
    }

    public String A03(int i) {
        try {
            return A02(i).A02;
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get camera info", e);
        }
    }

    public boolean A07(int i) {
        if (!A06()) {
            if (this.A05 == null) {
                A04();
            }
            if (this.A05 == null) {
                AnonymousClass9WT.A01("CameraInventory", "Failed to detect camera, cameraInfos was null");
                return false;
            }
            int i2 = 0;
            if (i != 1) {
                i2 = 1;
            }
            if (A00(i2) == -1) {
                return false;
            }
            return true;
        } else if (i != 1) {
            return A08;
        } else {
            return A07;
        }
    }
}
