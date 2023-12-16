package X;

import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;

/* renamed from: X.5zr  reason: invalid class name and case insensitive filesystem */
public final class C121215zr extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121215zr(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C162457s7.A0H(arrayList);
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A07;
        if (mediaCardGrid == null) {
            throw C18270x1.A0S("mediaCard");
        }
        mediaCardGrid.A09(arrayList, Integer.MAX_VALUE);
        return C59022wD.A00;
    }
}
