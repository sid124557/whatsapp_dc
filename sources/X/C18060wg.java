package X;

import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

/* renamed from: X.0wg  reason: invalid class name and case insensitive filesystem */
public class C18060wg implements C15650ri {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public C18060wg(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = remoteUtils$SurfaceCallbackStub;
        this.A00 = f;
        this.A01 = f2;
    }

    public final Object B1v() {
        switch (this.A03) {
            case 0:
                throw AnonymousClass001.A0g("onScroll");
            case 1:
                throw AnonymousClass001.A0g("onFling");
            default:
                throw AnonymousClass001.A0g("onClick");
        }
    }
}
