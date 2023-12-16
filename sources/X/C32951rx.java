package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import com.whatsapp.R;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onInput$2;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.1rx  reason: invalid class name and case insensitive filesystem */
public final class C32951rx extends C166677z5 {
    public final /* synthetic */ CommentsBottomSheet A00;
    public final /* synthetic */ MentionableEntry A01;

    public void afterTextChanged(Editable editable) {
        Object value;
        C60932zP r1;
        Object value2;
        C60932zP r12;
        Editable editable2 = editable;
        C162457s7.A0J(editable, 0);
        String obj = editable.toString();
        CommentsBottomSheet commentsBottomSheet = this.A00;
        C194510y r5 = (C194510y) commentsBottomSheet.A0U.getValue();
        C162457s7.A0J(obj, 0);
        if (C107575bX.A0F(obj)) {
            C85524Gp r3 = r5.A0V;
            do {
                value2 = r3.getValue();
                r12 = (C60932zP) value2;
            } while (!r3.AzD(value2, new C60932zP(r12.A01, r12.A02, r12.A03, r12.A04, r12.A00, false)));
        } else {
            C616131n.A02((C85494Gl) null, new CommentsBottomSheetViewModel$onInput$2(r5, (C84814Du) null), AnonymousClass0IV.A00(r5), (AnonymousClass20D) null, 3);
            C85524Gp r32 = r5.A0V;
            do {
                value = r32.getValue();
                r1 = (C60932zP) value;
            } while (!r32.AzD(value, new C60932zP(r1.A01, r1.A02, r1.A03, r1.A04, r1.A00, true)));
        }
        Context A0G = commentsBottomSheet.A0G();
        AnonymousClass5Y0 r9 = commentsBottomSheet.A0H;
        if (r9 != null) {
            C620633i r8 = commentsBottomSheet.A09;
            if (r8 != null) {
                C60152y5 r10 = commentsBottomSheet.A0K;
                if (r10 != null) {
                    TextPaint paint = this.A01.getPaint();
                    if (commentsBottomSheet.A0G != null) {
                        C107635bd.A0F(A0G, editable2, paint, r8, r9, r10, R.color.f5nameremoved, C18270x1.A1V(commentsBottomSheet.A0V));
                        return;
                    }
                    throw C18270x1.A0S("emojiRichFormatterStaticCaller");
                }
                throw C18270x1.A0S("sharedPreferencesFactory");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public C32951rx(CommentsBottomSheet commentsBottomSheet, MentionableEntry mentionableEntry) {
        this.A00 = commentsBottomSheet;
        this.A01 = mentionableEntry;
    }
}
