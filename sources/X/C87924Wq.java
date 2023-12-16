package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4Wq  reason: invalid class name and case insensitive filesystem */
public final class C87924Wq extends AnonymousClass0R6 {
    public final Context A00;
    public final AnonymousClass66W A01;
    public final C87664Uf A02;
    public final C620733j A03;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        View inflate = C86604Kt.A0E(viewGroup, 0).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        return new AnonymousClass4YF((TextEmojiLabel) inflate, this);
    }

    public int A0G() {
        C103965Pc r0 = (C103965Pc) this.A02.A01.A07();
        if (r0 != null) {
            return r0.A00.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        AnonymousClass4YF r22 = (AnonymousClass4YF) r2;
        C162457s7.A0J(r22, 0);
        C103965Pc r0 = (C103965Pc) this.A02.A01.A07();
        if (r0 != null) {
            A0K((C1229266j) C86654Ky.A0j(r0.A00, i), r22, i);
        }
    }

    public C87924Wq(Context context, C15910sA r5, AnonymousClass66W r6, C87664Uf r7, C620733j r8) {
        this.A00 = context;
        this.A03 = r8;
        this.A01 = r6;
        this.A02 = r7;
        AnonymousClass6C6.A02(r5, r7.A01, C1001359q.A00(this, 23), 225);
    }

    public final void A0K(C1229266j r8, AnonymousClass4YF r9, int i) {
        C18260x0.A0P(r9, r8);
        String BDk = r8.BDk(this.A01);
        Context context = this.A00;
        C620733j r4 = this.A03;
        Drawable B8D = r8.B8D(context, r4);
        C109535em r3 = new C109535em(r9, this, ((float) 175) * Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f), i);
        TextEmojiLabel textEmojiLabel = r9.A00;
        textEmojiLabel.A0K((List) null, BDk);
        if (B8D == null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (C102805Ki.A00(r4)) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C131666dx(B8D, r4), (Drawable) null);
        } else {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(B8D, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        r9.A0H.setOnClickListener(r3);
    }
}
