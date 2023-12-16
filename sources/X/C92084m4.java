package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4m4  reason: invalid class name and case insensitive filesystem */
public class C92084m4 extends AnonymousClass54L {
    public final C66663Mh A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final AnonymousClass1VX A03;
    public final C66493Lq A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A07 = this.A04.A07();
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            C95814uZ A0b = C86604Kt.A0b(it);
            if (A0b != null) {
                this.A00.A0U((C28011fL) A0b, 1, true);
            }
        }
        Collections.sort(A07, new AnonymousClass682(this.A00, this.A01, this, 0));
        Iterator it2 = A07.iterator();
        while (it2.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it2);
            A0R.A0y = C86644Kx.A1Y(A0R, C95814uZ.class, this.A03);
        }
        return A07;
    }

    public C92084m4(C66663Mh r4, AnonymousClass5ZU r5, C89634eX r6, C620733j r7, C56982ss r8, C56892sj r9, AnonymousClass1VX r10, C66493Lq r11, List list) {
        super(r5, r6, r7, list);
        this.A03 = r10;
        this.A00 = r4;
        this.A04 = r11;
        this.A02 = r9;
        this.A01 = r8;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(AnonymousClass4L0.A0M(C18310x6.A0R(it)));
        }
    }
}
