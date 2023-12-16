package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jP  reason: invalid class name */
public final class AnonymousClass1jP extends C55212pz implements AnonymousClass4G9 {
    public AnonymousClass4DK A00;
    public final C54292oU A01;
    public final AnonymousClass5ZR A02;

    public void B3J(Map map) {
        if (map == null) {
            Log.e("request_permission/finish: result is null");
            this.A00 = null;
            return;
        }
        AnonymousClass4DK r3 = this.A00;
        if (r3 != null) {
            if (C162457s7.A0P(map.get("permission_result"), "null_permission")) {
                r3.BSv(new C60752z6((Integer) null, "no_valid_permission", "FcsRequestPermissionActivity: permission provided is null"), (Map) null);
            } else {
                r3.BdH(map);
            }
            this.A00 = null;
            return;
        }
        Log.e("request_permission/finish: callback is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jP(C54292oU r1, AnonymousClass5ZR r2, AnonymousClass1j2 r3) {
        super(r3);
        C18260x0.A0V(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
    }
}
