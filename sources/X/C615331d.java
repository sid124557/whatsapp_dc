package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.31d  reason: invalid class name and case insensitive filesystem */
public class C615331d {
    public static UserJid A00(C56972sr r2, C56982ss r3, C95814uZ r4, boolean z) {
        UserJid A04;
        if (!(r4 instanceof GroupJid) || (r3.A06((GroupJid) r4) != 3 && !z)) {
            A04 = C56972sr.A04(r2);
        } else {
            A04 = r2.A0H();
        }
        C626936e.A06(A04);
        return A04;
    }

    public static C40682Hi A01(AnonymousClass1A9 r5, List list, int i) {
        StringBuilder sb;
        String obj;
        HashSet A0K = AnonymousClass002.A0K();
        C188248ya<C172548Lq> r3 = r5.selectedOptions_;
        if (r3 != null) {
            if (r3.size() > list.size() || (i > 0 && r3.size() > i)) {
                sb = AnonymousClass001.A0o();
                AnonymousClass000.A1H("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_options_count selectedOptionsSize=", sb, r3);
                AnonymousClass000.A1H(" pollOptionsSize=", sb, list);
                sb.append(" selectableOptionCount=");
                sb.append(i);
            } else {
                for (C172548Lq A07 : r3) {
                    byte[] A072 = A07.A07();
                    int length = A072.length;
                    if (length != 32) {
                        sb = AnonymousClass001.A0o();
                        sb.append("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_option optionLength=");
                        sb.append(length);
                    } else {
                        A0K.add(C18290x4.A0t(A072));
                    }
                }
                List A02 = A02(list, A0K);
                if (A02.size() == A0K.size()) {
                    return new C40682Hi(A02);
                }
                obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_option_not_found pollVoteSelectedOptionSha256Strings is not same size as pollVoteSelectedOptionIds";
            }
            obj = sb.toString();
            break;
        }
        obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload selectedOptionsSha256ByteArrays is null";
        Log.e(obj);
        return null;
    }

    public static List A02(List list, Set set) {
        if (set.size() == 0) {
            return AnonymousClass001.A0s();
        }
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60142y4 A0Z = AnonymousClass0x9.A0Z(it);
            if (set.contains(A0Z.A02)) {
                long j = A0Z.A01;
                if (j != -1) {
                    AnonymousClass0x2.A1Q(A0K, j);
                }
            }
        }
        return AnonymousClass002.A0J(A0K);
    }
}
