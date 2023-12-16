package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5lR  reason: invalid class name and case insensitive filesystem */
public class C113445lR implements C1230266t {
    public final Context A00;
    public final C116985rC A01;
    public final AnonymousClass67D A02;
    public final Runnable A03;
    public final Runnable A04;

    public /* synthetic */ void Ayr() {
    }

    public /* synthetic */ C95814uZ B86() {
        return null;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BA9() {
        if (this instanceof C91694kj) {
            return new C109785fB((C91694kj) this);
        }
        return null;
    }

    public void BP6(ViewHolder viewHolder, C95814uZ r4, int i) {
        this.A02.BgD(this.A00, r4, i);
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void BP7(View view, ViewHolder viewHolder, ViewHolder viewHolder2, C95814uZ r6, int i, int i2) {
        this.A02.BgD(this.A00, r6, i2);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void BP8(ViewHolder viewHolder, C624134x r2) {
    }

    public void BPA(C28001fK r2) {
        Log.e("CommunityHomeActivity/pending group in search results");
    }

    public boolean BVx(ViewHolder viewHolder, ViewHolder viewHolder2, C95814uZ r5, int i) {
        if (this instanceof C91694kj) {
            ((C91694kj) this).A00.A0a = r5;
            return false;
        }
        this.A02.BgD(this.A00, r5, i);
        return true;
    }

    public C113445lR(Context context, C116985rC r2, AnonymousClass67D r3, Runnable runnable, Runnable runnable2) {
        this.A00 = context;
        this.A03 = runnable;
        this.A04 = runnable2;
        this.A01 = r2;
        this.A02 = r3;
    }

    public List BBO() {
        return Collections.emptyList();
    }

    public /* synthetic */ Set BCh() {
        return AnonymousClass002.A0K();
    }

    public /* synthetic */ boolean Bj7(Jid jid) {
        return false;
    }
}
