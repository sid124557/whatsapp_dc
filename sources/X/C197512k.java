package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.12k  reason: invalid class name and case insensitive filesystem */
public class C197512k extends C05570Ua {
    public final View A00;
    public final View A01;
    public final TextEmojiLabel A02;
    public final C53602nM A03;
    public final C620633i A04;
    public final C620733j A05;
    public final AnonymousClass1VX A06;
    public final C106715a2 A07;

    public final void A07() {
        this.A03.A01((C003203q) C111095hX.A03(this.A00.getContext(), C003203q.class), "community-examples-article");
    }

    public C197512k(View view, C64653Ej r12, C53602nM r13, C620633i r14, C620733j r15, AnonymousClass1VX r16, C106715a2 r17) {
        super(view);
        this.A01 = view;
        AnonymousClass1VX r3 = r16;
        this.A06 = r3;
        C106715a2 r5 = r17;
        this.A07 = r5;
        this.A04 = r14;
        this.A05 = r15;
        this.A03 = r13;
        this.A00 = C06560Yg.A02(view, R.id.empty_community_row_container);
        View A022 = C06560Yg.A02(view, R.id.empty_community_row_button);
        TextView A0G = C18300x5.A0G(view, R.id.empty_community_row_title);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.empty_community_row_description);
        this.A02 = A0K;
        C106905aM.A04(A0G);
        A0K.setText(r5.A05(A0K.getContext(), C71313bu.A00(this, 30), view.getContext().getString(R.string.f11nameremoved), "learn-more"));
        C18270x1.A0q(A0K, r3);
        AnonymousClass0x2.A12(A0K, r14);
        if (r3.A0Y(C58422vE.A02, 5543)) {
            A022.setVisibility(8);
        } else {
            A022.setVisibility(0);
            C18290x4.A1I(A022, r12, view, 21);
        }
        this.A02.setText(R.string.f11nameremoved);
        View view2 = this.A01;
        View A023 = C06560Yg.A02(view2, R.id.empty_community_row_see_example_communities);
        TextView A0G2 = C18300x5.A0G(view2, R.id.empty_community_row_see_example_communities_text);
        ImageView A0E = AnonymousClass0x9.A0E(view2, R.id.empty_community_row_see_example_communities_arrow);
        A0G2.setText(this.A07.A05(A0G2.getContext(), C71313bu.A00(this, 29), AnonymousClass002.A0F(view2.getContext(), "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "learn-more"));
        C18270x1.A0q(A0G2, this.A06);
        C06560Yg.A0O(A0G2, new AnonymousClass4TJ(A0G2, this.A04));
        C18270x1.A0d(view2.getContext(), A0E, this.A05, R.drawable.chevron_right);
        AnonymousClass0x2.A0z(A0E, this, 45);
        A023.setVisibility(0);
    }
}
