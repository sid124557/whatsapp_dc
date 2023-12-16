package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5if  reason: invalid class name and case insensitive filesystem */
public class C111775if implements AnonymousClass4CO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass3XA A03;
    public final /* synthetic */ AnonymousClass5T7 A04;
    public final /* synthetic */ UserJid A05;

    public C111775if(Context context, AnonymousClass3XA r2, AnonymousClass5T7 r3, UserJid userJid, int i, int i2) {
        this.A04 = r3;
        this.A05 = userJid;
        this.A02 = context;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
    }

    public void BT5(UserJid userJid, int i) {
        if (AnonymousClass75J.A00(this.A05, userJid)) {
            AnonymousClass5T7 r2 = this.A04;
            C117115rP.A00(r2.A01, this, 12);
            this.A03.AwB(Boolean.FALSE);
            r2.A07.A06("catalog_collections_view_tag", false);
        }
    }

    public void BT6(UserJid userJid, boolean z, boolean z2) {
        UserJid userJid2 = this.A05;
        if (AnonymousClass75J.A00(userJid2, userJid)) {
            AnonymousClass5T7 r4 = this.A04;
            C117115rP.A00(r4.A01, this, 11);
            r4.A02.A0a(userJid2);
            Context context = this.A02;
            Intent A0c = C627736r.A0c(context, userJid2, Integer.valueOf(this.A01), this.A00);
            A0c.putExtra("is_prefetched_catalog", true);
            r4.A00.A0A(context, A0c);
            this.A03.AwB(Boolean.TRUE);
        }
    }
}
