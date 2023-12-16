package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;
import java.util.List;

/* renamed from: X.11w  reason: invalid class name and case insensitive filesystem */
public final class C196111w extends AnonymousClass0R6 {
    public AnonymousClass2FB A00;
    public List A01 = C72023d3.A00;
    public final C105365Uq A02;
    public final C114015mM A03;

    public C196111w(Context context, C114015mM r3) {
        C162457s7.A0J(r3, 2);
        this.A03 = r3;
        this.A02 = r3.A06(context, "group-call-psa-bottom-sheet");
    }

    public void A0D(RecyclerView recyclerView) {
        C162457s7.A0J(recyclerView, 0);
        this.A02.A00();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new AnonymousClass12Y(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A00, this.A02);
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r5, int i) {
        AnonymousClass12Y r52 = (AnonymousClass12Y) r5;
        C162457s7.A0J(r52, 0);
        C51302jb r3 = (C51302jb) this.A01.get(i);
        C162457s7.A0J(r3, 0);
        ((TextView) r52.A03.getValue()).setText(r3.A01);
        ((GroupPhotoHeader) r52.A02.getValue()).A07(r3.A00, r52.A01);
        AnonymousClass2FB r2 = r52.A00;
        if (r2 != null) {
            C18290x4.A1I(r52.A0H, r3, r2, 8);
        }
    }
}
