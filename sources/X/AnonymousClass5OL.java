package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.5OL  reason: invalid class name */
public class AnonymousClass5OL {
    public C994455t A00;
    public final C04840Qw A01 = new C04840Qw(32);
    public final C69263Wi A02;
    public final C147187Dd A03 = new C147187Dd();
    public final AnonymousClass33p A04;
    public final C106715a2 A05;

    public AnonymousClass5OL(C69263Wi r3, AnonymousClass33p r4, C106715a2 r5) {
        this.A02 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void A00(TextView textView, C182198o1 r13, C624134x r14, CharSequence charSequence) {
        textView.setTag(r14);
        Spannable spannable = (Spannable) this.A01.A04(charSequence.toString());
        if (spannable != null) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            if (valueOf != null) {
                C86984Mq[] r10 = (C86984Mq[]) spannable.getSpans(0, spannable.length(), C86984Mq.class);
                URLSpan[] A1b = C86624Kv.A1b(spannable);
                if (r10 != null) {
                    for (C86984Mq r3 : r10) {
                        AnonymousClass75N.A00(valueOf, spannable, r3, new C86984Mq(r3.A00, r3.A01));
                    }
                }
                if (A1b != null) {
                    for (URLSpan uRLSpan : A1b) {
                        AnonymousClass75N.A00(valueOf, spannable, uRLSpan, new URLSpan(uRLSpan.getURL()));
                    }
                }
                r13.BjS(valueOf);
                return;
            }
            return;
        }
        C147187Dd r4 = this.A03;
        LinkedBlockingDeque linkedBlockingDeque = r4.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            AnonymousClass5J7 r1 = (AnonymousClass5J7) it.next();
            if (r1.A00 == textView) {
                linkedBlockingDeque.remove(r1);
            }
        }
        linkedBlockingDeque.add(new AnonymousClass5J7(textView, r13, r14, charSequence));
        if (this.A00 == null) {
            C994455t r0 = new C994455t(r4, this, this.A04.A0Z());
            this.A00 = r0;
            r0.start();
        }
    }
}
