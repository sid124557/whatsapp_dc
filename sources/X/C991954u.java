package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionPickerView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.54u  reason: invalid class name and case insensitive filesystem */
public class C991954u extends AnonymousClass5ZM {
    public final C66543Lv A00;
    public final C55832qz A01;
    public final CharSequence A02;
    public final /* synthetic */ MentionPickerView A03;

    public C991954u(C66543Lv r1, MentionPickerView mentionPickerView, C55832qz r3, CharSequence charSequence) {
        this.A03 = mentionPickerView;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = charSequence;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashSet A0K = AnonymousClass002.A0K();
        int i = 0;
        C27991fJ r6 = ((C27991fJ[]) objArr)[0];
        if (r6 == null) {
            return A0K;
        }
        Cursor cursor = this.A00.A0B(r6, 15, 1, -1, true).A00;
        try {
            cursor.moveToPrevious();
            while (cursor.moveToNext() && i < 15) {
                C624134x A04 = this.A01.A04(cursor, r6);
                C626936e.A06(A04);
                if (!(A04 instanceof C30341mI)) {
                    if (C624435a.A05(this.A03.A05, A04.A18)) {
                        A0K.add((UserJid) A04.A0n());
                    }
                }
                i++;
            }
            cursor.close();
            return A0K;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Set set = (Set) obj;
        MentionPickerView mentionPickerView = this.A03;
        mentionPickerView.A0P = true;
        AnonymousClass4XF r4 = mentionPickerView.A0L;
        C117785sU r1 = r4.A04;
        if (r1 == null) {
            C56972sr r3 = r4.A0D;
            AnonymousClass5ZU r2 = r4.A0F;
            r1 = new C117785sU(r3, r2, r2.A06((AnonymousClass3ZH) null, AnonymousClass34R.A01(r4.A0K)));
            r4.A04 = r1;
        }
        r1.A00 = set;
        mentionPickerView.A0L.getFilter().filter(this.A02);
    }
}
