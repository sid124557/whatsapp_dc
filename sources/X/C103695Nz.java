package X;

import com.whatsapp.WaNetworkResourceImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.5Nz  reason: invalid class name and case insensitive filesystem */
public final class C103695Nz {
    public final C55682qk A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FS A03;

    public final void A00(WaNetworkResourceImageView waNetworkResourceImageView, String str, int i, int i2, boolean z) {
        int i3 = i;
        if (i != 0) {
            int i4 = i2;
            if (i2 != 0) {
                WeakReference A14 = AnonymousClass0x9.A14(waNetworkResourceImageView);
                if (this.A02.A0X(3005)) {
                    this.A03.BkM(new C117395rr(this, str, A14, i3, i4, z));
                }
            }
        }
    }

    public C103695Nz(C55682qk r1, C54292oU r2, AnonymousClass1VX r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r2, r3, r4, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
