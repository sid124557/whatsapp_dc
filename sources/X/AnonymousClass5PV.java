package X;

import android.util.Pair;
import android.util.TypedValue;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.5PV  reason: invalid class name */
public class AnonymousClass5PV {
    public final /* synthetic */ MessageReplyActivity A00;

    public AnonymousClass5PV(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public void A00(File file) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (AnonymousClass4SG.A43(messageReplyActivity) && messageReplyActivity.A0z.A01()) {
            int applyDimension = (int) TypedValue.applyDimension(1, 28.0f, C18290x4.A0G(messageReplyActivity.A08).getDisplayMetrics());
            messageReplyActivity.A7B(C107245ax.A06(new AnonymousClass5WB(applyDimension, applyDimension), file).A02);
        }
    }

    public void A01(List list) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (AnonymousClass4SG.A43(messageReplyActivity) && messageReplyActivity.A0z.A01()) {
            if (list.size() != 6) {
                Log.e("MessageReplyActivity/setStatusReactionsAvatarList/invalid avatar reaction list size");
                return;
            }
            for (Pair pair : C105535Vj.A00) {
                int A03 = C18280x3.A03(pair);
                C100705By r1 = (C100705By) list.get(C18290x4.A03(pair));
                ImageView A0E = AnonymousClass0x9.A0E(messageReplyActivity.A08, A03);
                if (r1 instanceof C984751a) {
                    Log.e("MessageReplyActivity/setAvatar/AvatarReactionData returned Error");
                } else if (!(r1 instanceof C984951c)) {
                    if (r1 instanceof C984851b) {
                        AnonymousClass39M r7 = ((C984851b) r1).A01;
                        messageReplyActivity.A17.A05(A0E, r7, new AnonymousClass6BM(A0E, 0), 1, r7.A03, r7.A02, true, false);
                        A0E.setOnClickListener(new C109505ej(new C109525el(messageReplyActivity, A0E, r7, 7), messageReplyActivity.A06));
                    }
                }
                A0E.setImageResource(R.drawable.sticker_loading_indicator);
            }
        }
    }
}
