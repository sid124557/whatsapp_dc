package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.comments.MessageText;

/* renamed from: X.5kd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112945kd implements C182198o1 {
    public final /* synthetic */ MessageText A00;
    public final /* synthetic */ C624134x A01;
    public final /* synthetic */ boolean A02;

    public final void BjS(Spannable spannable) {
        String string;
        String url;
        MessageText messageText = this.A00;
        C624134x r13 = this.A01;
        boolean z = this.A02;
        Spannable spannable2 = spannable;
        long A002 = (long) messageText.getSuspiciousLinkHelper().A00(C18290x4.A0F(messageText), spannable2, r13);
        URLSpan[] A1b = C86624Kv.A1b(spannable2);
        C162457s7.A0H(A1b);
        for (URLSpan uRLSpan : A1b) {
            if (!(uRLSpan == null || (url = uRLSpan.getURL()) == null)) {
                int spanStart = spannable2.getSpanStart(uRLSpan);
                int spanEnd = spannable2.getSpanEnd(uRLSpan);
                int spanFlags = spannable2.getSpanFlags(uRLSpan);
                C88944b3 A012 = messageText.getPhoneLinkHelper().A01(messageText.getContext(), r13, url);
                if (A012 == null) {
                    A012 = messageText.getGroupLinkHelper().A00(C18290x4.A0F(messageText), r13, url);
                }
                messageText.getLinkifierUtils();
                Object[] spans = spannable2.getSpans(spanStart, spanEnd, AnonymousClass54J.class);
                C162457s7.A0D(spans);
                AnonymousClass54J[] r15 = (AnonymousClass54J[]) spans;
                int length = r15.length;
                int i = 0;
                if (length != 0) {
                    A012.A05 = true;
                    do {
                        r15[i].A02 = true;
                        i++;
                    } while (i < length);
                }
                spannable2.setSpan(A012, spanStart, spanEnd, spanFlags);
            }
        }
        if (r12 != 0 && !z) {
            C107295b4.A07(messageText, messageText.A09, messageText.getAbProps());
        }
        AnonymousClass5UY r1 = messageText.A0E;
        if (r1 != null) {
            if (A002 > 0) {
                WaTextView waTextView = (WaTextView) AnonymousClass5UY.A00(r1, 0);
                if (A002 > 1) {
                    C620733j whatsAppLocale = waTextView.getWhatsAppLocale();
                    Object[] A0L = AnonymousClass002.A0L();
                    AnonymousClass000.A1Q(A0L, 0, A002);
                    string = whatsAppLocale.A0L(A0L, R.plurals.f9nameremoved, A002);
                } else {
                    string = waTextView.getContext().getString(R.string.f11nameremoved);
                }
                waTextView.setText(string);
            } else {
                r1.A06(8);
            }
        }
        C86664Kz.A1T(messageText, spannable2);
    }

    public /* synthetic */ C112945kd(MessageText messageText, C624134x r2, boolean z) {
        this.A00 = messageText;
        this.A01 = r2;
        this.A02 = z;
    }
}
