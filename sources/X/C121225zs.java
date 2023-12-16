package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.5zs  reason: invalid class name and case insensitive filesystem */
public final class C121225zs extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121225zs(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C162457s7.A0H(map);
        int A0K = AnonymousClass001.A0K(C73723fy.A02(map.keySet()));
        View view = (View) C73723fy.A02(map.values());
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A07;
        if (mediaCardGrid == null) {
            throw C18270x1.A0S("mediaCard");
        }
        Context context = mediaCardGrid.getContext();
        UserJid userJid = linkedIGPostsSummaryViewActivity.A03;
        if (userJid == null) {
            throw C18270x1.A0S("bizJid");
        }
        AnonymousClass4UW r1 = linkedIGPostsSummaryViewActivity.A02;
        if (r1 == null) {
            throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
        }
        ArrayList arrayList = r1.A0A;
        LinkedAccountMediaView.A0C(context, view, (C108915dl) null, userJid, AnonymousClass000.A0V("thumb-transition-", ((C108855df) arrayList.get(A0K)).A01.A04, AnonymousClass001.A0o()), arrayList, A0K, 1, 1, true);
        AnonymousClass2XT r12 = linkedIGPostsSummaryViewActivity.A01;
        if (r12 != null) {
            UserJid userJid2 = linkedIGPostsSummaryViewActivity.A03;
            if (userJid2 == null) {
                throw C18270x1.A0S("bizJid");
            }
            r12.A00(userJid2, 1);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("linkedIGPostsLoggingHelper");
    }
}
