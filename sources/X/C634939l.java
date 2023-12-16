package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import java.util.Objects;

/* renamed from: X.39l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C634939l implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C52272lD A02;
    public final /* synthetic */ C197312i A03;
    public final /* synthetic */ GroupJid A04;

    public final void onClick(View view) {
        int i;
        C197312i r5 = this.A03;
        GroupJid groupJid = this.A04;
        Context context = this.A01;
        int i2 = this.A00;
        C52272lD r4 = this.A02;
        if (!r5.A0A.A0L(groupJid) || !r5.A0B.A0C(groupJid)) {
            C64653Ej r3 = r5.A07;
            C89654ea r2 = (C89654ea) C111095hX.A03(context, C89654ea.class);
            Objects.requireNonNull(r2);
            r3.BgF(groupJid, new C85694Hg(r2, 0), (String) null, i2);
            i = 2;
        } else {
            r5.A07.BgD(context, groupJid, i2);
            i = 1;
        }
        C71733ca.A01(r5.A0E, r4, r5, i, 23);
    }

    public /* synthetic */ C634939l(Context context, C52272lD r2, C197312i r3, GroupJid groupJid, int i) {
        this.A03 = r3;
        this.A04 = groupJid;
        this.A01 = context;
        this.A00 = i;
        this.A02 = r2;
    }
}
