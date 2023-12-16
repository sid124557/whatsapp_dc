package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.WaEditText;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.profilecheckpoint.RequestName;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatus.AddTextStatusActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.694  reason: invalid class name */
public class AnonymousClass694 implements AnonymousClass4CE {
    public Object A00;
    public final int A01;

    public AnonymousClass694(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BNH() {
        View view;
        switch (this.A01) {
            case 0:
                view = ((SharedTextPreviewDialogFragment) this.A00).A0G;
                break;
            case 1:
                view = ((EditMessageActivity) this.A00).A0I;
                break;
            case 3:
                C113245l7 r1 = (C113245l7) this.A00;
                if (!r1.A2z.BIc()) {
                    view = r1.A4P;
                    break;
                } else {
                    return;
                }
            case 5:
                view = ((EmojiEditTextBottomSheetDialogFragment) this.A00).A0A;
                break;
            case 6:
                view = ((C89014bL) this.A00).A03;
                break;
            case 7:
                C89224c7 r0 = (C89224c7) this.A00;
                r0.Bk0();
                AnonymousClass4CE r12 = r0.A06;
                if (r12 != null) {
                    C182408oM r02 = r0.A0A;
                    if (r02 == null || r02.BHm()) {
                        r12.BNH();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                view = ((PopupNotification) this.A00).A0c;
                break;
            case 10:
                view = ((ProfilePhotoReminder) this.A00).A05;
                break;
            case 11:
                view = ((RegisterName) this.A00).A0L;
                break;
            case 12:
                view = ((RequestName) this.A00).A02;
                if (view == null) {
                    throw C18270x1.A0S("registrationName");
                }
                break;
            case 13:
                view = ((MessageReplyActivity) this.A00).A0t;
                break;
            case 15:
                view = ((TextStatusComposerActivity) this.A00).A0j;
                break;
            default:
                return;
        }
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BRo(int[] iArr) {
        EditText editText;
        int[] iArr2 = iArr;
        switch (this.A01) {
            case 0:
                editText = ((SharedTextPreviewDialogFragment) this.A00).A0G;
                break;
            case 1:
                editText = ((EditMessageActivity) this.A00).A0I;
                break;
            case 2:
                C93334oL r2 = (C93334oL) this.A00;
                ReactionsTrayViewModel reactionsTrayViewModel = r2.A00.A0v;
                if (reactionsTrayViewModel != null && C86604Kt.A05(reactionsTrayViewModel.A0C) == 2) {
                    ReactionsTrayViewModel reactionsTrayViewModel2 = r2.A00.A0v;
                    C626936e.A06(reactionsTrayViewModel2);
                    reactionsTrayViewModel2.A0G(C107345b9.A06(iArr));
                    return;
                }
                return;
            case 3:
                C113245l7 r22 = (C113245l7) this.A00;
                if (r22.A2z.BIc()) {
                    ReactionsTrayViewModel reactionsTrayViewModel3 = r22.A2z.getReactionsTrayViewModel();
                    C626936e.A06(reactionsTrayViewModel3);
                    reactionsTrayViewModel3.A0G(C107345b9.A06(iArr));
                    AnonymousClass676 r1 = r22.A2z;
                    C624134x r0 = r1.getReactionsTrayViewModel().A0G;
                    C626936e.A06(r0);
                    r1.Bqw(r0);
                    return;
                }
                C107345b9.A09(r22.A4P, iArr, 0);
                if (!r22.A2X()) {
                    r22.A4P.callOnClick();
                    return;
                }
                return;
            case 4:
                C162457s7.A0J(iArr, 0);
                ReactionsTrayViewModel reactionsTrayViewModel4 = ((SingleSelectedMessageActivity) this.A00).A0C;
                if (reactionsTrayViewModel4 == null) {
                    throw C18270x1.A0S("reactionsTrayViewModel");
                }
                reactionsTrayViewModel4.A0G(C107345b9.A06(iArr));
                return;
            case 5:
                EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = (EmojiEditTextBottomSheetDialogFragment) this.A00;
                C107345b9.A09(emojiEditTextBottomSheetDialogFragment.A0A, iArr, emojiEditTextBottomSheetDialogFragment.A04);
                return;
            case 6:
                C89014bL r02 = (C89014bL) this.A00;
                C107345b9.A09(r02.A03, iArr, r02.A0C);
                return;
            case 7:
                C89224c7 r03 = (C89224c7) this.A00;
                r03.Bk0();
                AnonymousClass4CE r12 = r03.A06;
                if (r12 != null) {
                    C182408oM r04 = r03.A0A;
                    if (r04 == null || r04.BHm()) {
                        r12.BRo(iArr);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                C114825nf r13 = (C114825nf) this.A00;
                AnonymousClass2RP r5 = (AnonymousClass2RP) r13.A0Z.get();
                C003203q r4 = r13.A04;
                AnonymousClass08A r05 = r4.A06;
                C1896692e r7 = new C1896692e(this, 2);
                C86624Kv.A1O(r05, 2, iArr);
                C616131n.A02(r5.A03, new ExpressionsShapeCreator$createEmojiShape$1(r4, r5, (C84814Du) null, r7, iArr2), AnonymousClass0IS.A00(r05), (AnonymousClass20D) null, 2);
                return;
            case 9:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (popupNotification.A1M.A0L == null) {
                    editText = popupNotification.A0c;
                    break;
                } else {
                    return;
                }
            case 10:
                C107345b9.A09(((ProfilePhotoReminder) this.A00).A05, iArr, 25);
                return;
            case 11:
                C107345b9.A09(((RegisterName) this.A00).A0L, iArr, 25);
                return;
            case 12:
                C162457s7.A0J(iArr, 0);
                WaEditText waEditText = ((RequestName) this.A00).A02;
                if (waEditText == null) {
                    throw C18270x1.A0S("registrationName");
                }
                C107345b9.A09(waEditText, iArr, 25);
                return;
            case 13:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                AnonymousClass5ZT r06 = messageReplyActivity.A1N;
                if (r06 == null || r06.A0L == null) {
                    editText = messageReplyActivity.A0t;
                    break;
                } else {
                    return;
                }
                break;
            case 14:
                C162457s7.A0J(iArr, 0);
                AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A00;
                C89224c7 r07 = addTextStatusActivity.A06;
                if (r07 == null) {
                    throw C18270x1.A0S("emojiPopup");
                }
                r07.dismiss();
                addTextStatusActivity.A04.BkP(new C71573cK(iArr, 40, addTextStatusActivity));
                C94274qr r08 = new C94274qr(iArr);
                StringBuilder A0o = AnonymousClass001.A0o();
                for (int i : r08.A01) {
                    if (i != 65039) {
                        A0o.appendCodePoint(i);
                    }
                }
                addTextStatusActivity.A0D = A0o.toString();
                return;
            default:
                editText = ((TextStatusComposerActivity) this.A00).A0j;
                break;
        }
        C107345b9.A09(editText, iArr, 0);
    }
}
