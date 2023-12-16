package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.9kE  reason: invalid class name and case insensitive filesystem */
public class C201499kE implements Callable {
    public final /* synthetic */ AnonymousClass9WQ A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C201499kE(AnonymousClass9WQ r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A09(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new C201699ka(AnonymousClass000.A0a("Could not start preview: ", AnonymousClass001.A0o(), e));
        }
    }
}
