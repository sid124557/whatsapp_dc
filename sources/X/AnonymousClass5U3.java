package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5U3  reason: invalid class name */
public class AnonymousClass5U3 {
    public long A00;
    public final C105615Vs A01 = new C105615Vs();
    public final C105615Vs A02 = new C105615Vs();
    public final List A03 = AnonymousClass002.A0I(1);
    public final Map A04 = AnonymousClass001.A0t();

    public void A00() {
        C105615Vs r2 = this.A02;
        for (AnonymousClass5Z2 A022 : r2.A01) {
            A022.A02(this);
        }
        A03(r2);
        C105615Vs r22 = this.A01;
        for (AnonymousClass5Z2 A023 : r22.A01) {
            A023.A02(this);
        }
        A03(r22);
    }

    public void A01(AnonymousClass5Z2 r3) {
        this.A04.get(r3.A01);
    }

    public void A02(AnonymousClass5Z2 r5) {
        AnonymousClass7MR r3 = (AnonymousClass7MR) this.A04.get(r5.A01);
        if (r3 != null) {
            Rect rect = r3.A02;
            if (rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE) {
                throw AnonymousClass001.A0e("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
            }
            rect.height();
            rect.width();
            for (Rect rect2 : r3.A03) {
                rect2.height();
                rect2.width();
            }
        }
    }

    public final void A03(C105615Vs r5) {
        Iterator A0v = AnonymousClass001.A0v(r5.A00);
        while (A0v.hasNext()) {
            AnonymousClass5Z2 r2 = (AnonymousClass5Z2) A0v.next();
            AnonymousClass7MR r1 = (AnonymousClass7MR) this.A04.get(r2.A01);
            if (r1 != null) {
                r1.A01 = C141456vb.EXIT;
                r1.A03.clear();
                r2.A02(this);
            }
        }
    }

    public void A04(List list, long j) {
        this.A00 = j;
        List list2 = this.A03;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new Rect((Rect) it.next()));
        }
        C105615Vs r4 = this.A02;
        Iterator A0v = AnonymousClass001.A0v(r4.A00);
        while (A0v.hasNext()) {
            this.A04.remove(((AnonymousClass5Z2) A0v.next()).A01);
        }
        C105615Vs r3 = this.A01;
        Iterator A0v2 = AnonymousClass001.A0v(r3.A00);
        while (A0v2.hasNext()) {
            this.A04.remove(((AnonymousClass5Z2) A0v2.next()).A01);
        }
        Iterator A0v3 = AnonymousClass001.A0v(this.A04);
        while (A0v3.hasNext()) {
            ((AnonymousClass7MR) A0v3.next()).A03.clear();
        }
        C105615Vs.A00(r4);
        C105615Vs.A00(r3);
    }
}
