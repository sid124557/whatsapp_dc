package X;

import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5j6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112045j6 implements C181878nU {
    public final /* synthetic */ CollectionProductListActivity A00;

    public final void BYu(C109015dw r13, int i) {
        int i2;
        CollectionProductListActivity collectionProductListActivity = this.A00;
        if (collectionProductListActivity.A0D.A0X(1514) && (i2 = collectionProductListActivity.A00) != -1) {
            AnonymousClass5QB r3 = collectionProductListActivity.A0C;
            UserJid userJid = collectionProductListActivity.A0N;
            String str = collectionProductListActivity.A0S;
            int i3 = collectionProductListActivity.A01;
            r3.A00(userJid, true, Integer.valueOf(i), Integer.valueOf(i3), str, r13.A0F, i2, 3);
        }
    }

    public /* synthetic */ C112045j6(CollectionProductListActivity collectionProductListActivity) {
        this.A00 = collectionProductListActivity;
    }
}
