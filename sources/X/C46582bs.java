package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bs  reason: invalid class name and case insensitive filesystem */
public class C46582bs {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final AnonymousClass3ZT A02;
    public final WeakReference A03;
    public final List A04 = AnonymousClass0x9.A18();
    public final List A05 = AnonymousClass001.A0s();

    public C46582bs(View view, AnonymousClass3ZT r3) {
        this.A03 = AnonymousClass0x9.A14(view);
        this.A02 = r3;
    }

    public void A00(List list) {
        list.clear();
        List list2 = this.A04;
        list2.clear();
        View view = (View) this.A03.get();
        if (view != null) {
            Rect rect = this.A01;
            if (view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                list2.add(rect);
                Iterator it = this.A02.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("getClipRect");
                } else {
                    list.addAll(list2);
                }
            }
        }
    }
}
