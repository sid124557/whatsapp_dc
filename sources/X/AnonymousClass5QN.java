package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.5QN  reason: invalid class name */
public class AnonymousClass5QN {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass5YB A03;
    public final SelectionCheckView A04;

    public void A00(String str, boolean z) {
        this.A00.setEnabled(z);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(str);
        C18320x8.A11(textEmojiLabel.getResources(), textEmojiLabel, R.color.f5nameremoved);
        textEmojiLabel.A09();
        AnonymousClass5YB.A03(this.A03, textEmojiLabel.getResources().getColor(R.color.f5nameremoved));
        this.A01.setAlpha(0.5f);
        SelectionCheckView selectionCheckView = this.A04;
        C86654Ky.A18(selectionCheckView.A0B, selectionCheckView, 4);
    }

    public void A01(boolean z) {
        this.A00.setEnabled(true);
        this.A01.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.A0A();
        C18320x8.A11(textEmojiLabel.getResources(), textEmojiLabel, R.color.f5nameremoved);
        AnonymousClass5YB.A03(this.A03, textEmojiLabel.getResources().getColor(AnonymousClass5Yj.A02(textEmojiLabel.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        this.A04.A06(z, false);
    }

    public AnonymousClass5QN(View view, AnonymousClass64J r3) {
        this.A00 = C06560Yg.A02(view, R.id.row_container);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.contact_photo);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r3, R.id.chat_able_contacts_row_name);
        this.A03 = A002;
        AnonymousClass5YB.A02(A002);
        this.A02 = AnonymousClass0x7.A0K(view, R.id.chat_able_contacts_row_status);
        this.A04 = (SelectionCheckView) C06560Yg.A02(view, R.id.selection_check);
    }
}
