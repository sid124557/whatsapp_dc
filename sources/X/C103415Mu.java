package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5Mu  reason: invalid class name and case insensitive filesystem */
public class C103415Mu {
    public final AnonymousClass5OH A00;
    public final AnonymousClass1VX A01;

    public C103415Mu(AnonymousClass5OH r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(Context context, C184218rR r12, int i) {
        Context context2 = context;
        View A0G = C86654Ky.A0G(context, R.layout.f8nameremoved);
        TextView A0G2 = C18300x5.A0G(A0G, R.id.permission_message);
        ImageView A0E = AnonymousClass0x9.A0E(A0G, R.id.permission_image);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(A0G, R.id.learn_more_view);
        if (i == 0) {
            this.A00.A00(context2, A0K, context.getString(R.string.f11nameremoved), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
            A0G2.setText(R.string.f11nameremoved);
        } else {
            A0G2.setText(R.string.f11nameremoved);
            A0K.setVisibility(8);
        }
        A0E.setImageResource(R.drawable.permission_location);
        View A02 = C06560Yg.A02(A0G, R.id.submit);
        View A022 = C06560Yg.A02(A0G, R.id.cancel);
        C19340zH A023 = AnonymousClass5V0.A02(context, A0G);
        A023.A0i(true);
        AnonymousClass043 create = A023.create();
        C86654Ky.A0u(create, r12, 3);
        if (create.getWindow() != null) {
            C18310x6.A0x(context, create.getWindow(), R.color.f5nameremoved);
        }
        C109705f3.A00(A02, r12, create, 29);
        C109705f3.A00(A022, create, r12, 30);
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
