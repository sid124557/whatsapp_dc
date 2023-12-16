package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.6Hc  reason: invalid class name and case insensitive filesystem */
public class C125256Hc extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ AnonymousClass8J4 A01;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = C86604Kt.A0D(viewGroup);
        if (i == 0) {
            return new C137856pN(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
        }
        return new C137846pM(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
    }

    public C125256Hc(AnonymousClass8J4 r2) {
        this.A01 = r2;
        A0E(true);
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        int i2;
        Drawable drawable;
        AnonymousClass6J1 r82 = (AnonymousClass6J1) r8;
        AnonymousClass7V0 r6 = (AnonymousClass7V0) this.A00.get(i);
        boolean A1U = AnonymousClass000.A1U(this.A01.A00, r6.A00());
        C109495ei r3 = new C109495ei(this, 11, r6);
        if (r82 instanceof C137856pN) {
            C137856pN r83 = (C137856pN) r82;
            if (r6 instanceof C137826pK) {
                WaTextView waTextView = r83.A02;
                waTextView.setText(((C137826pK) r6).A02);
                waTextView.setTypeface(r83.A00);
                if (A1U) {
                    drawable = AnonymousClass0RP.A00(waTextView.getContext(), R.drawable.shape_avatar_sticker_picker_item);
                } else {
                    drawable = null;
                }
                waTextView.setBackground(drawable);
                waTextView.setTextColor(AnonymousClass0Y8.A07(waTextView.getContext(), R.color.f5nameremoved));
                waTextView.setSelected(A1U);
                r83.A01.setOnClickListener(r3);
                return;
            }
            throw AnonymousClass001.A0c("item should be AvatarHeaderTextItem");
        }
        C137846pM r84 = (C137846pM) r82;
        if (r6 instanceof C137836pL) {
            WaImageView waImageView = r84.A01;
            C137836pL r62 = (C137836pL) r6;
            AnonymousClass6C7.A11(waImageView, r62.A00, A1U);
            waImageView.setOnClickListener(r3);
            View view = r84.A00;
            Context context = view.getContext();
            if (A1U) {
                i2 = AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
            } else {
                i2 = R.color.f5nameremoved;
            }
            C86604Kt.A0z(context, view, i2);
            waImageView.setContentDescription(r62.A02);
            return;
        }
        throw AnonymousClass001.A0c("item should be AvocadoHeaderIconItem");
    }

    public int getItemViewType(int i) {
        if (this.A00.get(i) instanceof C137826pK) {
            return 0;
        }
        return 1;
    }
}
