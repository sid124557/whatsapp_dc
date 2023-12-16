package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.0Wo  reason: invalid class name and case insensitive filesystem */
public final class C06180Wo {
    public static final int A00(SidecarDeviceState sidecarDeviceState) {
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0K = AnonymousClass000.A0K(SidecarDeviceState.class, sidecarDeviceState, "getPosture");
                C162457s7.A0K(A0K, "null cannot be cast to non-null type kotlin.Int");
                return AnonymousClass001.A0K(A0K);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static final void A02(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            Class<SidecarDeviceState> cls = SidecarDeviceState.class;
            try {
                Method A0r = AnonymousClass001.A0r(cls, Integer.TYPE, "setPosture", new Class[1], 0);
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                A0r.invoke(sidecarDeviceState, objArr);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static final List A01(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return AnonymousClass8UF.A0n();
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0K = AnonymousClass000.A0K(SidecarWindowLayoutInfo.class, sidecarWindowLayoutInfo, "getDisplayFeatures");
                C162457s7.A0K(A0K, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) A0K;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return AnonymousClass8UF.A0n();
            }
        }
    }

    public final int A03(SidecarDeviceState sidecarDeviceState) {
        int A00 = A00(sidecarDeviceState);
        if (A00 < 0 || A00 > 4) {
            return 0;
        }
        return A00;
    }
}
