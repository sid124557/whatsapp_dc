package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5pv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116215pv implements C183218pg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C114705nT A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ ArrayList A03;

    public final void BPD(View view, C149947On r16) {
        C114705nT r3 = this.A01;
        UserJid userJid = this.A02;
        ArrayList arrayList = this.A03;
        int i = this.A00;
        View view2 = view;
        if (view.getTag(R.id.loaded_image_url) != null) {
            int i2 = r3.A02;
            int i3 = 21;
            if (i2 == 0) {
                i3 = 18;
            }
            C106185Xy r0 = r3.A06;
            C108915dl r6 = r3.A07;
            r0.A02(r6, i3);
            LinkedAccountMediaView.A0C(r3.A03, view2, r6, userJid, AnonymousClass000.A0V("thumb-transition-", ((C108855df) arrayList.get(i)).A01.A04, AnonymousClass001.A0o()), arrayList, i, i2, 0, r3.A0D);
        }
    }

    public /* synthetic */ C116215pv(C114705nT r1, UserJid userJid, ArrayList arrayList, int i) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A03 = arrayList;
        this.A00 = i;
    }
}
