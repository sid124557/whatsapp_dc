package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.11K  reason: invalid class name */
public final class AnonymousClass11K extends C05550Ty implements C837049l {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass311 A01;
    public final Jid A02;
    public final AnonymousClass4FS A03;

    public void A0C() {
        Set set = this.A01.A07;
        synchronized (set) {
            set.remove(this);
        }
    }

    public void BY4(C60672yw r3, C27981fH r4) {
        Boolean bool;
        if (C162457s7.A0P(r4, this.A02) && (bool = r3.A01) != null) {
            this.A00.A0G(bool);
        }
    }

    public AnonymousClass11K(AnonymousClass311 r2, Jid jid, AnonymousClass4FS r4) {
        C18260x0.A0Q(r4, r2);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = jid;
    }
}
