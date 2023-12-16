package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.10d  reason: invalid class name */
public class AnonymousClass10d extends C05550Ty {
    public AnonymousClass3ZH A00;
    public Set A01 = AnonymousClass002.A0K();
    public final C55682qk A02;
    public final C55052pi A03;
    public final C66473Lo A04;
    public final C66493Lq A05;
    public final C30191m3 A06;
    public final AnonymousClass107 A07 = new AnonymousClass107(AnonymousClass002.A0K());
    public final AnonymousClass107 A08 = new AnonymousClass107(AnonymousClass002.A0K());
    public final AnonymousClass107 A09 = new AnonymousClass107(AnonymousClass002.A0K());
    public final AnonymousClass4FS A0A;
    public final Collection A0B;
    public final Set A0C = AnonymousClass002.A0K();

    public AnonymousClass10d(C55682qk r3, C55052pi r4, C66473Lo r5, C66493Lq r6, C30191m3 r7, AnonymousClass4FS r8, Collection collection) {
        this.A02 = r3;
        this.A0A = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A0B = collection;
    }

    public final void A0D() {
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass3ZH r0 = this.A00;
        if (r0 != null) {
            A0K.add(r0);
        }
        A0K.addAll(this.A01);
        A0K.addAll(this.A0C);
        this.A07.A0G(Collections.unmodifiableSet(A0K));
    }
}
