package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.0pR  reason: invalid class name and case insensitive filesystem */
public final class C14350pR extends C829045j implements AnonymousClass4GQ {
    public static final C14350pR A00 = new C14350pR();

    public C14350pR() {
        super(1);
    }

    public static final Boolean A00(SidecarDisplayFeature sidecarDisplayFeature) {
        C162457s7.A0J(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00((SidecarDisplayFeature) obj);
    }
}
