package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import java.util.List;

/* renamed from: X.62O  reason: invalid class name */
public final class AnonymousClass62O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ StatusSeeAllActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62O(StatusSeeAllActivity statusSeeAllActivity) {
        super(1);
        this.this$0 = statusSeeAllActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104845So r9 = (C104845So) obj;
        TextView textView = this.this$0.A01;
        if (textView == null) {
            throw C18270x1.A0S("emptyText");
        }
        int i = 8;
        textView.setVisibility(AnonymousClass001.A08(r9.A03 ? 1 : 0));
        StatusSeeAllActivity statusSeeAllActivity = this.this$0;
        TextView textView2 = statusSeeAllActivity.A01;
        if (textView2 == null) {
            throw C18270x1.A0S("emptyText");
        }
        int i2 = r9.A00;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = r9.A01;
        AnonymousClass001.A0y(statusSeeAllActivity, textView2, A0L, i2);
        WaTextView waTextView = this.this$0.A06;
        if (waTextView == null) {
            throw C18270x1.A0S("seeAllText");
        }
        boolean z = r9.A04;
        if (z) {
            i = 0;
        }
        waTextView.setVisibility(i);
        StatusSeeAllActivity statusSeeAllActivity2 = this.this$0;
        ViewGroup viewGroup = statusSeeAllActivity2.A00;
        if (z) {
            if (viewGroup == null) {
                throw C18270x1.A0S("emptyTextContainer");
            }
            C18280x3.A0o(viewGroup, statusSeeAllActivity2, 7);
        } else if (viewGroup == null) {
            throw C18270x1.A0S("emptyTextContainer");
        } else {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
        StatusSeeAllAdapter statusSeeAllAdapter = this.this$0.A08;
        if (statusSeeAllAdapter == null) {
            throw C18270x1.A0S("adapter");
        }
        List list = r9.A02;
        C86604Kt.A1R(statusSeeAllAdapter.A00);
        AnonymousClass4q4 r3 = new AnonymousClass4q4(statusSeeAllAdapter.A01, list);
        ((C103445Mz) statusSeeAllAdapter.A06.getValue()).A02(new C1237969u(statusSeeAllAdapter, 1, list), r3);
        statusSeeAllAdapter.A00 = r3;
        return C59022wD.A00;
    }
}
