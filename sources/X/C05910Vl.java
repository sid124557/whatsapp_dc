package X;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
public final class C05910Vl {
    public static final C05910Vl A00 = new C05910Vl();

    public final C17330vM A01(Activity activity, FoldingFeature foldingFeature) {
        AnonymousClass0TX r3;
        AnonymousClass0TW r2;
        C162457s7.A0J(foldingFeature, 1);
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                r3 = AnonymousClass0TX.A02;
            }
            return null;
        }
        r3 = AnonymousClass0TX.A01;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                r2 = AnonymousClass0TW.A02;
            }
            return null;
        }
        r2 = AnonymousClass0TW.A01;
        Rect bounds = foldingFeature.getBounds();
        C162457s7.A0D(bounds);
        AnonymousClass0Pg r7 = new AnonymousClass0Pg(bounds);
        Rect A002 = C08940fM.A00.AzJ(activity).A00();
        int i = r7.A00 - r7.A03;
        if (!(i == 0 && r7.A02 - r7.A01 == 0)) {
            int i2 = r7.A02 - r7.A01;
            if (i2 != A002.width() && i != A002.height()) {
                return null;
            }
            if (i2 < A002.width() && i < A002.height()) {
                return null;
            }
            if (i2 == A002.width() && i == A002.height()) {
                return null;
            }
            Rect bounds2 = foldingFeature.getBounds();
            C162457s7.A0D(bounds2);
            return new C08880fG(new AnonymousClass0Pg(bounds2), r2, r3);
        }
        return null;
    }

    public static final AnonymousClass0P8 A00(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C162457s7.A0D(displayFeatures);
        ArrayList A0s = AnonymousClass001.A0s();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C05910Vl r0 = A00;
                C162457s7.A0B(foldingFeature);
                C17330vM A01 = r0.A01(activity, foldingFeature);
                if (A01 != null) {
                    A0s.add(A01);
                }
            }
        }
        return new AnonymousClass0P8(A0s);
    }
}
