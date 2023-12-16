package X;

import android.content.Context;
import android.text.Editable;
import android.view.ViewGroup;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5jL  reason: invalid class name and case insensitive filesystem */
public final class C112195jL implements C179098ib {
    public C179108ic A00;
    public BotCommandsPickerView A01;
    public UserJid A02;
    public final ViewGroup A03;
    public final C113905mB A04;
    public final MentionableEntry A05;

    public final void A00(Context context, String str) {
        C18270x1.A14(context, str);
        int A042 = AnonymousClass0Y8.A04(context, C18290x4.A00(context));
        MentionableEntry mentionableEntry = this.A05;
        Editable text = mentionableEntry.getText();
        if (text != null) {
            AnonymousClass6EC r4 = new AnonymousClass6EC(A042);
            String A0V = AnonymousClass000.A0V("/", str, AnonymousClass001.A0o());
            String obj = text.toString();
            C162457s7.A0J(obj, 0);
            int A0D = C175728Zm.A0D(obj, '/', obj.length() - 1);
            text.replace(A0D, mentionableEntry.getSelectionEnd(), AnonymousClass001.A0j(AnonymousClass000.A0l(A0V), ' '));
            text.setSpan(r4, A0D, C86664Kz.A0L(str, A0D) + 1, 33);
        }
    }

    public C112195jL(ViewGroup viewGroup, C15910sA r5, C113905mB r6, MentionableEntry mentionableEntry, C87694Uy r8) {
        C18260x0.A0V(mentionableEntry, r8, r5);
        C162457s7.A0J(r6, 5);
        this.A05 = mentionableEntry;
        this.A03 = viewGroup;
        this.A04 = r6;
        C86604Kt.A1N(r5, r8.A05, new C121255zv(this), 56);
        mentionableEntry.addTextChangedListener(new AnonymousClass52S(this, r8));
        mentionableEntry.A0G = new C171498Hh(this, r8);
    }
}
