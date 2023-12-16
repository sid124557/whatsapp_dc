package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.7zI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166807zI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C112455jl A03;
    public final /* synthetic */ GroupJid A04;
    public final /* synthetic */ List A05;

    public final void onClick(View view) {
        C112455jl r3 = this.A03;
        List list = this.A05;
        Context context = this.A02;
        int i = this.A00;
        GroupJid groupJid = this.A04;
        int i2 = this.A01;
        r3.A0A.A00(4, 38);
        r3.A07(context, groupJid, list, i, i2, false);
    }

    public /* synthetic */ C166807zI(Context context, C112455jl r2, GroupJid groupJid, List list, int i, int i2) {
        this.A03 = r2;
        this.A05 = list;
        this.A02 = context;
        this.A00 = i;
        this.A04 = groupJid;
        this.A01 = i2;
    }
}
