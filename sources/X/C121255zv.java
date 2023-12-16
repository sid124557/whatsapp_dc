package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.5zv  reason: invalid class name and case insensitive filesystem */
public final class C121255zv extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C112195jL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121255zv(C112195jL r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BotCommandsPickerView botCommandsPickerView;
        AnonymousClass5XT r12 = (AnonymousClass5XT) obj;
        List list = r12.A02;
        if (list == null) {
            BotCommandsPickerView botCommandsPickerView2 = this.this$0.A01;
            if (botCommandsPickerView2 != null) {
                botCommandsPickerView2.A0A(0);
            }
        } else {
            if (C18310x6.A1X(list)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BotCommandsUIHelper/uiStateLiveData/observer matchingBotCommandsSize=");
                C18260x0.A1F(A0o, list.size());
            }
            C112195jL r9 = this.this$0;
            Bitmap bitmap = r12.A00;
            UserJid userJid = r12.A01;
            r9.A02 = userJid;
            if (r9.A01 == null) {
                MentionableEntry mentionableEntry = r9.A05;
                LayoutInflater A0D = C18280x3.A0D(mentionableEntry);
                ViewGroup viewGroup = r9.A03;
                View A0R = AnonymousClass001.A0R(A0D, viewGroup, R.layout.f8nameremoved);
                C162457s7.A0D(A0R);
                if (A0R instanceof BotCommandsPickerView) {
                    r9.A01 = (BotCommandsPickerView) A0R;
                    if (viewGroup != null) {
                        viewGroup.addView(A0R);
                    }
                }
                C179108ic r7 = r9.A00;
                if (!(r7 == null || (botCommandsPickerView = r9.A01) == null)) {
                    botCommandsPickerView.setupView(list, bitmap, r7, mentionableEntry.A05, r9, userJid);
                }
            }
            BotCommandsPickerView botCommandsPickerView3 = this.this$0.A01;
            if (botCommandsPickerView3 != null) {
                botCommandsPickerView3.setCommandList(list, bitmap);
            }
        }
        return C59022wD.A00;
    }
}
