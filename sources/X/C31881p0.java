package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1p0  reason: invalid class name and case insensitive filesystem */
public abstract class C31881p0 extends C31891p1 {
    public final List A00 = AnonymousClass001.A0s();

    public C31881p0(AnonymousClass2z0 r8, int i, long j) {
        super(r8, (AnonymousClass39T) null, i, j);
    }

    public GroupJid A1x(int i) {
        for (C52662lq r1 : this.A00) {
            if (r1.A00 == i) {
                return r1.A01;
            }
        }
        return null;
    }

    public String A1y(int i) {
        for (C52662lq r1 : this.A00) {
            if (r1.A00 == i) {
                return r1.A02;
            }
        }
        return null;
    }

    public List A1z(int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (C52662lq r1 : this.A00) {
            if (r1.A00 == i) {
                A0s.add(r1);
            }
        }
        return A0s;
    }

    public C31881p0(AnonymousClass2z0 r2, AnonymousClass39T r3, int i, long j) {
        super(r2, r3, i, j);
    }

    public C31881p0(C620833k r2, AnonymousClass39T r3, int i, long j) {
        super(r2, r3, i, j);
    }
}
