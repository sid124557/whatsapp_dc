package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jU  reason: invalid class name */
public final class AnonymousClass1jU extends C55212pz implements AnonymousClass4G9, AnonymousClass4GA {
    public AnonymousClass4DK A00;
    public String A01;
    public final C69263Wi A02;
    public final C54292oU A03;
    public final AnonymousClass9U4 A04;
    public final AnonymousClass4FS A05;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A01 = str;
    }

    public void B3J(Map map) {
        if (map == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(new AnonymousClass25K(AnonymousClass0x9.A1E(AnonymousClass1jU.class), 0));
            C18260x0.A1K(A0o, "/finish: result is null");
            this.A00 = null;
            return;
        }
        AnonymousClass4DK r0 = this.A00;
        this.A00 = null;
        if (r0 != null) {
            r0.BdH(map);
        } else {
            Log.e("FcsNativeFlowNpciCommonLibraryResource/finish: callback is null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jU(C69263Wi r1, C54292oU r2, AnonymousClass9U4 r3, AnonymousClass1j2 r4, AnonymousClass4FS r5) {
        super(r4);
        C18260x0.A0f(r1, r2, r5, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r5;
        this.A04 = r3;
    }
}
