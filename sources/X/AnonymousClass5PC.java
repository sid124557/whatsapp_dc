package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5PC  reason: invalid class name */
public class AnonymousClass5PC {
    public AnonymousClass08M A00;
    public AnonymousClass08M A01;
    public AnonymousClass08M A02;
    public AnonymousClass08M A03;
    public AnonymousClass08M A04;
    public AnonymousClass08M A05;
    public AnonymousClass08M A06;
    public AnonymousClass08M A07;
    public AnonymousClass08M A08;
    public AnonymousClass08M A09;
    public AnonymousClass08M A0A;
    public final C69263Wi A0B;
    public final C620433g A0C;
    public final AnonymousClass5UW A0D;
    public final C90184gr A0E;
    public final C29221iT A0F;
    public final C105405Uu A0G;
    public final C105145Tt A0H;
    public final C90194gs A0I;
    public final UserJid A0J;
    public final C184558s8 A0K = new C115315oT(this);
    public final C184558s8 A0L = new AnonymousClass8JK(this);
    public final AnonymousClass4FS A0M;

    public final Boolean A00(String str) {
        List A0h;
        AnonymousClass08M r0 = this.A01;
        if (r0 == null || (A0h = C86644Kx.A0h(r0)) == null) {
            return null;
        }
        Iterator it = A0h.iterator();
        while (it.hasNext()) {
            C109015dw r1 = AnonymousClass4L0.A0J(it).A02;
            if (r1.A0F.equals(str)) {
                if (r1.A0B != null) {
                    return Boolean.TRUE;
                }
                return null;
            }
        }
        return null;
    }

    public AnonymousClass5PC(C69263Wi r2, C620433g r3, AnonymousClass5UW r4, C90184gr r5, C29221iT r6, C105405Uu r7, C105145Tt r8, C90194gs r9, UserJid userJid, AnonymousClass4FS r11) {
        this.A0B = r2;
        this.A0M = r11;
        this.A0J = userJid;
        this.A0D = r4;
        this.A0F = r6;
        this.A0G = r7;
        this.A0I = r9;
        this.A0E = r5;
        this.A0H = r8;
        this.A0C = r3;
    }
}
