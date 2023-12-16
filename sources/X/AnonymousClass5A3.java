package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5A3  reason: invalid class name */
public final class AnonymousClass5A3 {
    public static final C90524hb A00(Context context, ViewGroup viewGroup, C56972sr r15, C146957Cg r16, C152967aS r17, C185018sv r18, C181828nP r19, C104975Tb r20, C181878nU r21, C184108rG r22, C620733j r23, UserJid userJid) {
        C162457s7.A0J(context, 0);
        C152967aS r5 = r17;
        C620733j r11 = r23;
        UserJid userJid2 = userJid;
        C18260x0.A0f(userJid2, r15, viewGroup, r11, r5);
        C184108rG r10 = r22;
        C162457s7.A0J(r10, 8);
        C104975Tb r8 = r20;
        C162457s7.A0J(r8, 11);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup, false);
        C107295b4.A02(inflate);
        C162457s7.A0H(inflate);
        return new C90524hb(inflate, r15, r16, r5, r18, r19, r8, r21, r10, r11, userJid2);
    }
}
