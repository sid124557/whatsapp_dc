package X;

import com.whatsapp.EmojiPicker$EmojiWeight;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.4KD  reason: invalid class name */
public class AnonymousClass4KD implements C15800rx {
    public Object A00;
    public final int A01;

    public AnonymousClass4KD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean Bqd(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass2S2 r4 = (AnonymousClass2S2) this.A00;
                AnonymousClass3ZH r6 = (AnonymousClass3ZH) obj;
                C56982ss r2 = r4.A02;
                return !AnonymousClass36T.A07(r4.A00, r2, r4.A03, r6, (GroupJid) r6.A0I(GroupJid.class));
            case 1:
                return ((C56972sr) this.A00).A0a((C95814uZ) obj);
            case 2:
                return ((Set) this.A00).contains(obj);
            case 3:
                return ((Set) this.A00).contains(new C106655Zv(C107425bI.A06(((EmojiPicker$EmojiWeight) obj).A01)));
            case 4:
                return this.A00.equals(((C52882mC) obj).A02);
            case 5:
                C52882mC r62 = (C52882mC) obj;
                C162457s7.A0J(r62, 1);
                return !((AnonymousClass2L1) this.A00).A00.A0C(r62.A02);
            default:
                C52882mC r63 = (C52882mC) obj;
                C162457s7.A0J(r63, 1);
                return ((AnonymousClass2L1) this.A00).A00.A0C(r63.A02);
        }
    }
}
