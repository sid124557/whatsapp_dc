package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* renamed from: X.6NE  reason: invalid class name */
public class AnonymousClass6NE extends C161797qU implements C184838sd {
    public static final C185318tS A0F = new AnonymousClass84X();
    public static final C185318tS A0G = new C1681184e();
    public static final C185318tS A0H = new AnonymousClass84T();
    public static final C185318tS A0I = new AnonymousClass84V();
    public static final C185318tS A0J = new C1680984c();
    public static final C185318tS A0K = new C1680884b();
    public static final C185318tS A0L = new C1681084d();
    public static final C185318tS A0M = new AnonymousClass84Y();
    public static final C185318tS A0N = new AnonymousClass84W();
    public static final C185318tS A0O = new C1681284f();
    public static final C185318tS A0P = new AnonymousClass84U();
    public static final C185318tS A0Q = new AnonymousClass84Z();
    public static final C185318tS A0R = new C1680784a();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Rect A04;
    public AnonymousClass0UY A05;
    public AnonymousClass09Z A06;
    public C146477Ak A07;
    public List A08;
    public List A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final long A0C;
    public final C152007Xe A0D;
    public final C125336Hk A0E;

    public AnonymousClass6NE(C152007Xe r7, C125336Hk r8, long j) {
        super(C141236vF.VIEW);
        this.A0C = j;
        this.A0E = r8;
        this.A0D = r7;
        C157267i1[] r2 = {new C157267i1(A0M, this), new C157267i1(A0F, this), new C157267i1(A0Q, this), new C157267i1(A0R, this), new C157267i1(A0K, this), new C157267i1(A0J, this), new C157267i1(A0L, this), new C157267i1(A0G, this), new C157267i1(A0O, this), new C157267i1(A0H, this), new C157267i1(A0P, this), new C157267i1(A0I, this), new C157267i1(A0N, this)};
        int i = 0;
        do {
            A0L(r2[i]);
            i++;
        } while (i < 13);
    }

    public void A0M(AnonymousClass0O5 r2) {
        List list = this.A09;
        if (list == null) {
            list = AnonymousClass002.A0I(4);
            this.A09 = list;
        }
        list.add(r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new AnonymousClass6J9(context);
    }

    public /* synthetic */ Class BBU() {
        return getClass();
    }
}
