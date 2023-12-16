package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5kR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112825kR implements C1225764x {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public final void BRv() {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        int selectionStart = sharedTextPreviewDialogFragment.A0G.getSelectionStart();
        if (selectionStart == sharedTextPreviewDialogFragment.A0G.getSelectionEnd() && sharedTextPreviewDialogFragment.A0W) {
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0G;
            int offsetForPosition = mentionableEntry.getOffsetForPosition(mentionableEntry.getX() + AnonymousClass4L0.A00(sharedTextPreviewDialogFragment.A0G), (float) sharedTextPreviewDialogFragment.A06.getScrollY());
            int A0A = AnonymousClass001.A0A(sharedTextPreviewDialogFragment.A0G.getLayout().getLineTop(0), sharedTextPreviewDialogFragment.A0G.getLayout().getLineBottom(0));
            MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A0G;
            int offsetForPosition2 = mentionableEntry2.getOffsetForPosition(mentionableEntry2.getX() + AnonymousClass4L0.A00(sharedTextPreviewDialogFragment.A0G), (float) (C86664Kz.A0C(sharedTextPreviewDialogFragment.A06, sharedTextPreviewDialogFragment.A06.getScrollY()) - A0A));
            if (selectionStart < offsetForPosition) {
                sharedTextPreviewDialogFragment.A0G.setSelection(offsetForPosition);
            } else if (selectionStart > offsetForPosition2) {
                sharedTextPreviewDialogFragment.A0G.setSelection(offsetForPosition2);
            }
        } else if (!sharedTextPreviewDialogFragment.A0W) {
            sharedTextPreviewDialogFragment.A0W = true;
        }
        sharedTextPreviewDialogFragment.A1W();
    }

    public /* synthetic */ C112825kR(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }
}
