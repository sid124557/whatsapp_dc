package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.96q  reason: invalid class name */
public final class AnonymousClass96q extends C194899Ux {
    public int A00 = -1;
    public final CameraExtensionCharacteristics A01;
    public final C194899Ux A02;
    public final List A03;
    public final Map A04 = AnonymousClass001.A0t();
    public final Map A05 = AnonymousClass001.A0t();
    public final Map A06 = AnonymousClass001.A0t();
    public final Map A07 = AnonymousClass001.A0t();
    public final Map A08 = AnonymousClass001.A0t();

    public AnonymousClass96q(CameraExtensionCharacteristics cameraExtensionCharacteristics, C194899Ux r4) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        this.A02 = r4;
        this.A01 = cameraExtensionCharacteristics;
        C18270x1.A1K(A0s, -1);
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0.contains(r1) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        if (X.C194899Ux.A04(X.C194899Ux.A0U, r10.A02) == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(X.C193049Mw r11) {
        /*
            r10 = this;
            r4 = r10
            int r2 = r10.A00
            r0 = -1
            if (r0 == r2) goto L_0x002b
            int r1 = r11.A00
            r0 = 41
            if (r1 == r0) goto L_0x00eb
            r0 = 52
            if (r1 == r0) goto L_0x00b2
            r0 = 71
            if (r1 == r0) goto L_0x0061
            r0 = 84
            if (r1 == r0) goto L_0x005e
            r0 = 89
            if (r1 == r0) goto L_0x005b
            r0 = 92
            if (r1 == r0) goto L_0x005b
            r0 = 49
            if (r1 == r0) goto L_0x00c8
            r0 = 50
            if (r1 == r0) goto L_0x0045
            switch(r1) {
                case 79: goto L_0x0032;
                case 80: goto L_0x0032;
                case 81: goto L_0x0032;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.9Ux r0 = r10.A02
            java.lang.Object r0 = r0.A05(r11)
            return r0
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.util.Map r0 = r10.A04
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005b
            goto L_0x002b
        L_0x0045:
            java.util.Map r1 = r10.A08
            boolean r0 = X.AnonymousClass0x7.A1V(r1, r2)
            if (r0 != 0) goto L_0x00e4
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 0
            X.9Mw r6 = X.C194899Ux.A0r
            r8 = 0
            goto L_0x00dd
        L_0x005b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x005e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0061:
            java.util.Map r1 = r10.A05
            boolean r0 = X.AnonymousClass0x7.A1V(r1, r2)
            if (r0 != 0) goto L_0x00e4
            java.util.Map r3 = r10.A07
            int r0 = r10.A00
            boolean r0 = X.AnonymousClass0x7.A1V(r3, r0)
            if (r0 != 0) goto L_0x0087
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 1
            r8 = 35
            X.9Mw r6 = X.C194899Ux.A0h
            java.util.List r0 = r4.A06(r5, r6, r7, r8, r9)
            r3.put(r2, r0)
        L_0x0087:
            int r0 = r10.A00
            java.lang.Object r0 = X.AnonymousClass001.A0i(r3, r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a3
            X.9Ux r2 = r10.A02
            X.9Mw r0 = X.C194899Ux.A0U
            boolean r2 = X.C194899Ux.A04(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x00e4
        L_0x00b2:
            java.util.Map r1 = r10.A07
            boolean r0 = X.AnonymousClass0x7.A1V(r1, r2)
            if (r0 != 0) goto L_0x00e4
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 1
            r8 = 35
            X.9Mw r6 = X.C194899Ux.A0h
            goto L_0x00dd
        L_0x00c8:
            java.util.Map r1 = r10.A06
            boolean r0 = X.AnonymousClass0x7.A1V(r1, r2)
            if (r0 != 0) goto L_0x00e4
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 1
            r8 = 256(0x100, float:3.59E-43)
            X.9Mw r6 = X.C194899Ux.A0n
        L_0x00dd:
            java.util.List r0 = r4.A06(r5, r6, r7, r8, r9)
            r1.put(r2, r0)
        L_0x00e4:
            int r0 = r10.A00
            java.lang.Object r0 = X.AnonymousClass001.A0i(r1, r0)
            return r0
        L_0x00eb:
            java.util.List r0 = r10.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96q.A05(X.9Mw):java.lang.Object");
    }

    public final List A06(CameraExtensionCharacteristics cameraExtensionCharacteristics, C193049Mw r10, int i, int i2, int i3) {
        List extensionSupportedSizes;
        List list;
        HashSet hashSet;
        if (i == 1) {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2);
        } else {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
        }
        if (extensionSupportedSizes == null || extensionSupportedSizes.isEmpty()) {
            list = Collections.emptyList();
        } else {
            int size = extensionSupportedSizes.size();
            ArrayList A0I = AnonymousClass002.A0I(size);
            for (int i4 = 0; i4 < size; i4++) {
                A0I.add(new AnonymousClass9T4(((Size) extensionSupportedSizes.get(i4)).getWidth(), ((Size) extensionSupportedSizes.get(i4)).getHeight()));
            }
            list = Collections.unmodifiableList(A0I);
        }
        List A032 = C194899Ux.A03(r10, this.A02);
        if (A032.size() < list.size()) {
            A032 = list;
        } else {
            hashSet = new HashSet(list);
        }
        int size2 = A032.size();
        int size3 = hashSet.size();
        ArrayList A0I2 = AnonymousClass002.A0I(size3);
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj = A032.get(i5);
            if (hashSet.contains(obj)) {
                A0I2.add(obj);
                if (A0I2.size() == size3) {
                    break;
                }
            }
        }
        return A0I2;
    }

    public void A07(int i) {
        this.A00 = i;
        if (i != -1) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
            }
        }
    }
}
