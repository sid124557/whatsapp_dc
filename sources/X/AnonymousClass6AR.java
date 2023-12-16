package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.6AR  reason: invalid class name */
public class AnonymousClass6AR implements C182438oP {
    public Object A00;
    public final int A01;

    public AnonymousClass6AR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRp(C106655Zv r3) {
        AnonymousClass4CE r1;
        switch (this.A01) {
            case 0:
                r1 = ((SharedTextPreviewDialogFragment) this.A00).A0Y;
                break;
            case 1:
                r1 = ((EditMessageActivity) this.A00).A07;
                break;
            case 2:
                ReactionsTrayViewModel reactionsTrayViewModel = ((C93334oL) this.A00).A00.A0v;
                C626936e.A06(reactionsTrayViewModel);
                reactionsTrayViewModel.A0G(C107345b9.A06(r3.A00));
                return;
            case 3:
                r1 = ((EmojiEditTextBottomSheetDialogFragment) this.A00).A0V;
                break;
            case 4:
                r1 = ((C89014bL) this.A00).A0F;
                break;
            case 5:
                r1 = ((PopupNotification) this.A00).A0H;
                break;
            case 6:
                r1 = ((ProfilePhotoReminder) this.A00).A0L;
                break;
            case 7:
                r1 = ((RegisterName) this.A00).A1j;
                break;
            case 8:
                r1 = (AnonymousClass4CE) this.A00;
                C162457s7.A0J(r3, 1);
                break;
            case 9:
                r1 = ((MessageReplyActivity) this.A00).A1X;
                break;
            default:
                r1 = ((TextStatusComposerActivity) this.A00).A16;
                break;
        }
        r1.BRo(r3.A00);
    }
}
