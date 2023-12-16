package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8DE  reason: invalid class name */
public class AnonymousClass8DE implements C184968sq {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void BMI(C157967jD r3, C835248t r4, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C184968sq) it.next()).BMI(r3, r4, obj, str);
            }
        }
    }

    public void BNc(C157967jD r3, C835248t r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C184968sq) it.next()).BNc(r3, r4, str);
            }
        }
    }

    public void Bar(C835248t r3, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C184968sq) it.next()).Bar(r3, str);
            }
        }
    }
}
