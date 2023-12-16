package X;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Xp  reason: invalid class name and case insensitive filesystem */
public final class C06420Xp {
    public static final C06180Wo A01 = new C06180Wo();
    public static final String A02 = C06420Xp.class.getSimpleName();
    public final C02180Fe A00;

    public C06420Xp(C02180Fe r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass0O7 A00(C16090sS r1, C02180Fe r2, Object obj, String str) {
        C162457s7.A0J(r2, 2);
        return new C01330Ae(r1, r2, obj, str);
    }

    public final C15310r8 A03(SidecarDeviceState sidecarDeviceState, SidecarDisplayFeature sidecarDisplayFeature) {
        AnonymousClass0TX r3;
        AnonymousClass0TW r2;
        C162457s7.A0J(sidecarDisplayFeature, 0);
        String str = A02;
        C162457s7.A0F(str);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A00(C08810f9.A00, this.A00, sidecarDisplayFeature, str).A01("Type must be either TYPE_FOLD or TYPE_HINGE", C14350pR.A00).A01("Feature bounds must not be 0", C14360pS.A00).A01("TYPE_FOLD must have 0 area", AnonymousClass0pT.A00).A01("Feature be pinned to either left or top", C14370pU.A00).A02();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type == 1) {
                r3 = AnonymousClass0TX.A01;
            } else if (type == 2) {
                r3 = AnonymousClass0TX.A02;
            }
            int A03 = A01.A03(sidecarDeviceState);
            if (A03 == 0 || A03 == 1) {
                return null;
            }
            if (A03 == 2) {
                r2 = AnonymousClass0TW.A02;
            } else if (A03 != 3) {
                return null;
            } else {
                r2 = AnonymousClass0TW.A01;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            C162457s7.A0D(rect);
            return new C08880fG(new AnonymousClass0Pg(rect), r2, r3);
        }
        return null;
    }

    public final List A05(SidecarDeviceState sidecarDeviceState, List list) {
        C162457s7.A0J(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15310r8 A03 = A03(sidecarDeviceState, (SidecarDisplayFeature) it.next());
            if (A03 != null) {
                A0s.add(A03);
            }
        }
        return A0s;
    }

    public final AnonymousClass0P8 A04(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List A05;
        if (sidecarWindowLayoutInfo == null) {
            A05 = AnonymousClass8UF.A0n();
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            C06180Wo.A02(sidecarDeviceState2, A01.A03(sidecarDeviceState));
            A05 = A05(sidecarDeviceState2, C06180Wo.A01(sidecarWindowLayoutInfo));
        }
        return new AnonymousClass0P8(A05);
    }

    public static final boolean A01(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C162457s7.A0P(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        C06180Wo r0 = A01;
        if (r0.A03(sidecarDeviceState) != r0.A03(sidecarDeviceState2)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C162457s7.A0P(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C162457s7.A0P(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean A06(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (!C162457s7.A0P(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
                return false;
            }
            List A012 = C06180Wo.A01(sidecarWindowLayoutInfo);
            List A013 = C06180Wo.A01(sidecarWindowLayoutInfo2);
            if (A012 != A013) {
                if (A012 == null || A013 == null || A012.size() != A013.size()) {
                    return false;
                }
                int size = A012.size();
                for (int i = 0; i < size; i++) {
                    if (!A02((SidecarDisplayFeature) A012.get(i), (SidecarDisplayFeature) A013.get(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public C06420Xp() {
        this(C02180Fe.QUIET);
    }
}
