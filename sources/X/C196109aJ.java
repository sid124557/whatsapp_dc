package X;

import com.whatsapp.R;
import java.util.HashMap;

/* renamed from: X.9aJ  reason: invalid class name and case insensitive filesystem */
public class C196109aJ implements AnonymousClass8nX {
    public final C69263Wi A00;
    public final C54292oU A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass4FS A03;

    public C196109aJ(C69263Wi r1, C54292oU r2, AnonymousClass33p r3, AnonymousClass4FS r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void B4j(C184128rI r4, String str, HashMap hashMap) {
        C626936e.A0E(!C627536m.A0T(str), AnonymousClass000.A0V("BloksPayloadHelperImpl/getBloks/invalid screen name: ", str, AnonymousClass001.A0o()));
        this.A00.A0G(0, R.string.f11nameremoved);
        this.A03.BkP(new AnonymousClass9j5(this, r4, str));
    }
}
