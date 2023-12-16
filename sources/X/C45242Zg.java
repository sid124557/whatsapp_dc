package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.2Zg  reason: invalid class name and case insensitive filesystem */
public class C45242Zg {
    public final AnonymousClass5WY A00;
    public final C53602nM A01;
    public final C53202mi A02;

    public C45242Zg(AnonymousClass5WY r1, C53602nM r2, C53202mi r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(C89654ea r12, C27991fJ r13) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid", r13);
        r12.startActivity(this.A00.A00(r12, A08, (C631938h) null, (Integer) null, "group-suspend-appeal", (String) null, (ArrayList) null, (ArrayList) null, this.A02.A00()));
    }
}
