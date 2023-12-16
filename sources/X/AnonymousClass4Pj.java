package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.4Pj  reason: invalid class name */
public abstract class AnonymousClass4Pj extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A00(WaFrameLayout waFrameLayout) {
        waFrameLayout.A01 = 0;
        waFrameLayout.A00 = 0;
        waFrameLayout.A03 = 0;
        waFrameLayout.A02 = 0;
        waFrameLayout.A04 = false;
    }

    public void A03() {
        if (this instanceof C89754es) {
            C89754es r1 = (C89754es) this;
            if (!r1.A01) {
                r1.A01 = true;
                r1.A00 = C64333Db.A4B(((C88864av) ((C111685iW) r1.generatedComponent())).A0K);
            }
        } else if (this instanceof MentionPickerView) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            if (!mentionPickerView.A0Q) {
                mentionPickerView.A0Q = true;
                C64333Db A002 = C88864av.A00(mentionPickerView.generatedComponent());
                mentionPickerView.A04 = C64333Db.A4B(A002);
                mentionPickerView.A0B = C64333Db.A2p(A002);
                mentionPickerView.A04 = C64333Db.A04(A002);
                mentionPickerView.A0K = (C106195Xz) A002.AKJ.get();
                mentionPickerView.A05 = C64333Db.A06(A002);
                mentionPickerView.A0N = C64333Db.A8y(A002);
                mentionPickerView.A0D = C64333Db.A39(A002);
                mentionPickerView.A09 = C64333Db.A29(A002);
                mentionPickerView.A07 = C64333Db.A26(A002);
                mentionPickerView.A08 = C64333Db.A28(A002);
                mentionPickerView.A0C = C64333Db.A2t(A002);
                mentionPickerView.A0E = C86614Ku.A0Z(A002);
                mentionPickerView.A0M = C64333Db.A8F(A002);
                mentionPickerView.A0G = (C56662sM) A002.AaX.get();
                mentionPickerView.A0A = C86644Kx.A0T(A002);
                mentionPickerView.A03 = C88734ai.A00(A002.A32);
                mentionPickerView.A0F = C64333Db.A3G(A002);
                mentionPickerView.A06 = C86614Ku.A0N(A002);
            }
        } else if (this instanceof C92294mP) {
            C92294mP r2 = (C92294mP) this;
            if (!r2.A00) {
                r2.A00 = true;
                BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) r2;
                C64333Db r12 = ((C88864av) ((C111685iW) r2.generatedComponent())).A0K;
                botCommandsPickerView.A04 = C64333Db.A4B(r12);
                botCommandsPickerView.A05 = C86644Kx.A0T(r12);
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Pj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public AnonymousClass4Pj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public AnonymousClass4Pj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A03();
    }

    public AnonymousClass4Pj(Context context) {
        super(context);
        A03();
    }
}
