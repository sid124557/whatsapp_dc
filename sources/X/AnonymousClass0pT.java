package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.0pT  reason: invalid class name */
public final class AnonymousClass0pT extends C829045j implements AnonymousClass4GQ {
    public static final AnonymousClass0pT A00 = new AnonymousClass0pT();

    public AnonymousClass0pT() {
        super(1);
    }

    public static final Boolean A00(SidecarDisplayFeature sidecarDisplayFeature) {
        C162457s7.A0J(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00((SidecarDisplayFeature) obj);
    }
}
