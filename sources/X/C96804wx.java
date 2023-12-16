package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.4wx  reason: invalid class name and case insensitive filesystem */
public class C96804wx extends AnonymousClass6mM implements C184148rK {
    public C135986lf A00;
    public final AnonymousClass7KS A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C135986lf r10 = (C135986lf) obj;
        this.A00 = r10;
        AnonymousClass7KS r3 = this.A01;
        Queue queue = r10.A01;
        AnonymousClass4W5 r8 = r3.A01;
        LinkedList A18 = AnonymousClass0x9.A18();
        boolean isEmpty = queue.isEmpty();
        RecyclerView recyclerView = r3.A00;
        String string = recyclerView.getContext().getString(R.string.f11nameremoved);
        C184148rK r4 = r3.A02;
        A18.add(new C132516fT(r4, string, isEmpty));
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            A18.add(new C132506fS(r4, (C152287Yh) it.next(), !it.hasNext()));
        }
        r8.A0L(A18);
        if (queue.size() > 1) {
            recyclerView.A0a(queue.size());
        }
    }

    public void BUo(C152287Yh r2) {
        this.A00.A00.BUo(r2);
    }

    public void Baf() {
        this.A00.A00.Baf();
    }

    public C96804wx(View view) {
        super(view);
        this.A01 = new AnonymousClass7KS(C86654Ky.A0P(view, R.id.bread_crumbs_list), this);
    }
}
