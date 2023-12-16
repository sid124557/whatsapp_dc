package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5OH  reason: invalid class name */
public class AnonymousClass5OH {
    public C111095hX A00;
    public C55682qk A01;
    public C69263Wi A02;
    public C620633i A03;
    public AnonymousClass1VX A04;
    public C66433Lk A05;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C55682qk r3 = this.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("groupname=");
            A0o.append(str2);
            r3.A0A("BusinessDirectoryFaqLinkHelper/addDirectoryGeneralFaqLink/group name or article name are null or empty", true, AnonymousClass000.A0V(", articleName=", str3, A0o));
            return;
        }
        Uri A042 = this.A05.A04(str2, str3);
        AnonymousClass1VX r6 = this.A04;
        Context context2 = context;
        C107635bd.A0E(context2, A042, this.A00, this.A02, textEmojiLabel, this.A03, r6, str, "learn-more");
    }

    public AnonymousClass5OH(C111095hX r1, C55682qk r2, C69263Wi r3, C620633i r4, AnonymousClass1VX r5, C66433Lk r6) {
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = r4;
    }
}
