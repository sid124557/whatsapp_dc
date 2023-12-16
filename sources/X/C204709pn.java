package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.9pn  reason: invalid class name and case insensitive filesystem */
public class C204709pn implements C182888p9 {
    public Object A00;
    public final int A01;

    public C204709pn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BKQ(TextEmojiLabel textEmojiLabel) {
        AnonymousClass1VX r10;
        C69263Wi r7;
        C111095hX r6;
        C620633i r9;
        String str;
        String string;
        int i = this.A01;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        Context context = textEmojiLabel.getContext();
        if (i != 0) {
            C89644eZ r3 = (C89644eZ) this.A00;
            r10 = r3.A0D;
            r7 = r3.A05;
            r6 = r3.A00;
            r9 = r3.A08;
            str = "learn-more";
            string = AnonymousClass002.A0F(r3, str, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        } else {
            C190959Am r0 = (C190959Am) this.A00;
            r10 = r0.A0B;
            r7 = r0.A02;
            r6 = r0.A01;
            r9 = r0.A07;
            C54292oU r32 = r0.A05;
            Object[] A0L = AnonymousClass002.A0L();
            str = "learn-more";
            A0L[0] = str;
            string = C54292oU.A00(r32).getString(R.string.f11nameremoved, A0L);
        }
        C107635bd.A0E(context, Uri.parse("https://faq.whatsapp.com/1516690435411169/?cms_platform=android&country=BR"), r6, r7, textEmojiLabel2, r9, r10, string, str);
    }
}
