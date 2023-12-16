package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4oG  reason: invalid class name and case insensitive filesystem */
public class C93284oG extends C92444mh {
    public final TextEmojiLabel A00 = C86644Kx.A0M(this, R.id.message_text);

    public void A22() {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setText(getMessageString());
        C86964Mo.A00(this.A0O, textEmojiLabel);
        if (this.A0n.BHf(getFMessage())) {
            View view = this.A0l;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public C93284oG(Context context, AnonymousClass677 r3, C30441mS r4) {
        super(context, r3, r4);
        A22();
    }

    public int A19(int i) {
        if (!C87094Nz.A0g(this)) {
            return 0;
        }
        return R.drawable.message_unsent;
    }

    public int A1A(int i) {
        if (!C87094Nz.A0g(this)) {
            return 0;
        }
        return R.color.f5nameremoved;
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public String getMessageString() {
        int i;
        boolean A0C = AnonymousClass2z0.A0C(getFMessage());
        if (C87094Nz.A0g(this)) {
            i = R.string.f11nameremoved;
            if (A0C) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (A0C) {
                i = R.string.f11nameremoved;
            }
        }
        return C86624Kv.A0b(this, i);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
