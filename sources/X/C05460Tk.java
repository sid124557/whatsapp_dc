package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.0Tk  reason: invalid class name and case insensitive filesystem */
public class C05460Tk {
    public static final Executor A07 = new C13670nY();
    public int A00;
    public List A01;
    public List A02 = Collections.emptyList();
    public Executor A03;
    public final AnonymousClass0LC A04;
    public final C16960uJ A05;
    public final List A06 = new CopyOnWriteArrayList();

    public void A00(List list) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A01;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.A01 = null;
                this.A02 = Collections.emptyList();
                this.A05.BZo(0, size);
            } else if (list2 == null) {
                this.A01 = list;
                this.A02 = Collections.unmodifiableList(list);
                this.A05.BUd(0, list.size());
            } else {
                this.A04.A01.execute(new C12950mO(this, list2, list, i));
                return;
            }
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public C05460Tk(AnonymousClass0LC r2, C16960uJ r3) {
        this.A05 = r3;
        this.A04 = r2;
        this.A03 = A07;
    }
}
