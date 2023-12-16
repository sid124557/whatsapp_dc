package X;

import com.whatsapp.instrumentation.service.InstrumentationFGService;
import java.util.Set;

/* renamed from: X.2fv  reason: invalid class name and case insensitive filesystem */
public class C49062fv {
    public final C54292oU A00;
    public final C54622p1 A01;
    public final Set A02 = AnonymousClass002.A0K();

    public final synchronized void A00(int i) {
        this.A02.add(Integer.valueOf(i));
        this.A01.A03(this.A00.A00, C18320x8.A07(), InstrumentationFGService.class);
    }

    public final synchronized void A01(int i) {
        Set set = this.A02;
        set.remove(Integer.valueOf(i));
        if (set.isEmpty()) {
            this.A01.A01(this.A00.A00, InstrumentationFGService.class);
        }
    }

    public C49062fv(C54292oU r2, C54622p1 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
