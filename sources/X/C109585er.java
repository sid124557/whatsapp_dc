package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Objects;

/* renamed from: X.5er  reason: invalid class name and case insensitive filesystem */
public class C109585er implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C109585er(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public final void onClick(View view) {
        switch (this.A06) {
            case 0:
                AnonymousClass4LB r7 = (AnonymousClass4LB) this.A00;
                AnonymousClass4FV r8 = (AnonymousClass4FV) this.A02;
                C50382i5 r6 = (C50382i5) this.A04;
                Integer A0Z = C18290x4.A0Z();
                long time = ((AnonymousClass5XU) this.A03).A01().getTime();
                if (((C56952sp) this.A01).A0X(3299)) {
                    C94674rj r1 = new C94674rj();
                    r1.A02 = 1;
                    r1.A01 = A0Z;
                    r1.A00 = 1;
                    r1.A03 = Long.valueOf(time);
                    r8.BhA(r1);
                }
                Intent intent = new Intent("android.intent.action.VIEW", r6.A00());
                Activity activity = r7.A01;
                activity.startActivity(intent);
                activity.finish();
                return;
            case 1:
                ((AnonymousClass2WP) this.A04).A00(7);
                C56962sq r82 = (C56962sq) this.A01;
                AnonymousClass3ZH r72 = (AnonymousClass3ZH) this.A02;
                Class<UserJid> cls = UserJid.class;
                if (r82.A0P((UserJid) r72.A0I(cls))) {
                    Activity activity2 = (Activity) this.A00;
                    UnblockDialogFragment.A00(new C112135jF(activity2, r82, (UserJid) AnonymousClass3ZH.A05(r72, cls)), AnonymousClass002.A0F(activity2.getApplicationContext(), ((AnonymousClass5ZU) this.A05).A0H(r72), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), 0, false).A1O((C08270df) this.A03, (String) null);
                    return;
                }
                Context context = (Context) this.A00;
                Context applicationContext = context.getApplicationContext();
                Jid A0I = r72.A0I(cls);
                Objects.requireNonNull(A0I);
                context.startActivity(C627736r.A1A(applicationContext, Collections.singletonList(A0I.getRawString()), 7));
                return;
            case 2:
                C106365Yr.A01((TextEmojiLabel) this.A02, (C179218in) this.A05, (C58932w3) this.A04);
                AnonymousClass0YG.A06((Drawable) this.A03, AnonymousClass0Y8.A04((Context) this.A01, R.color.f5nameremoved));
                return;
            case 3:
                View view2 = (View) this.A00;
                AnonymousClass3ZH r73 = (AnonymousClass3ZH) this.A01;
                C56962sq r62 = (C56962sq) this.A02;
                AnonymousClass64Q r5 = (AnonymousClass64Q) this.A03;
                AnonymousClass4FU r4 = (AnonymousClass4FU) this.A04;
                Activity activity3 = (Activity) this.A05;
                C626936e.A06(r73);
                UserJid A07 = AnonymousClass3ZH.A07(r73);
                C626936e.A06(A07);
                boolean A0P = r62.A0P(A07);
                String str = "block_header_chat";
                boolean A0R = r73.A0R();
                if (A0P) {
                    if (A0R) {
                        str = "biz_block_header_chat";
                    }
                    r62.A0F(activity3, r73, str, false);
                    return;
                } else if (A0R) {
                    view2.getContext().startActivity(C627736r.A0m(view2.getContext(), A07, "biz_block_header_chat", false, false, false, false, false));
                    return;
                } else {
                    C103835Op Azw = r5.Azw(A07, str);
                    Azw.A04 = true;
                    Azw.A05 = false;
                    Azw.A01(0, 1);
                    r4.Boo(C103835Op.A00(Azw));
                    return;
                }
            default:
                C71343bx.A00((AnonymousClass4FS) this.A00, this.A01, this.A02, 35);
                C106215Yb.A01((Activity) this.A03, (View) this.A04, R.string.f11nameremoved);
                ((Dialog) this.A05).dismiss();
                return;
        }
    }
}
