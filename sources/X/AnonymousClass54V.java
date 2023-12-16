package X;

import android.view.MenuItem;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.54V  reason: invalid class name */
public class AnonymousClass54V extends AnonymousClass5ZM {
    public final Set A00;
    public final /* synthetic */ C89104bW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54V(C89104bW r2, Set set) {
        super(r2, true);
        this.A01 = r2;
        HashSet A0K = AnonymousClass002.A0K();
        this.A00 = A0K;
        A0K.addAll(set);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A75;
        boolean z;
        AnonymousClass7KC r4 = new AnonymousClass7KC();
        ArrayList A0s = AnonymousClass001.A0s();
        r4.A00 = A0s;
        C89104bW r5 = this.A01;
        r5.A0A.A0b(A0s);
        if (!r5.A0H.A01.A0X(3763)) {
            Iterator it = r4.A00.iterator();
            while (it.hasNext()) {
                if (C627336j.A0L(C86604Kt.A0b(it))) {
                    it.remove();
                }
            }
        }
        r4.A01 = new HashSet(r4.A00.size(), 1.0f);
        Iterator it2 = r4.A00.iterator();
        while (it2.hasNext()) {
            r4.A01.add(AnonymousClass3ZH.A03(C18310x6.A0R(it2)));
        }
        if (r5.A0M) {
            A75 = r5.A76();
        } else {
            A75 = r5.A75();
        }
        List userJidsFromChatJids = UserJid.userJidsFromChatJids(A75);
        r4.A02 = new HashSet(userJidsFromChatJids.size());
        Iterator it3 = userJidsFromChatJids.iterator();
        while (it3.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it3);
            if (r5 instanceof StatusRecipientsActivity) {
                z = !r5.A0M;
            } else if ((r5 instanceof LastSeenBlockListPickerActivity) || (r5 instanceof GroupAddBlacklistPickerActivity)) {
                z = false;
            } else {
                z = true;
            }
            boolean contains = r4.A01.contains(A0P);
            if (z) {
                if (!contains) {
                }
            } else if (!contains) {
                r4.A01.add(A0P);
                C86614Ku.A1P(r5.A0A, A0P, r4.A00);
            }
            r4.A02.add(A0P);
        }
        Collections.sort(r4.A00, new C91864lG(r4, this, r5.A0C, r5.A00));
        if (userJidsFromChatJids.size() != r4.A02.size()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("statusrecipients/update old:", A0o, userJidsFromChatJids);
            A0o.append(" new:");
            C18260x0.A1G(A0o, r4.A02.size());
            Set set = r4.A02;
            if (r5 instanceof StatusRecipientsActivity) {
                StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) r5;
                C162457s7.A0J(set, 0);
                C620233e r2 = statusRecipientsActivity.A03;
                if (r2 != null) {
                    r2.A0E(AnonymousClass002.A0J(set), C18280x3.A00(statusRecipientsActivity.A0M ? 1 : 0));
                    AnonymousClass3FH r0 = statusRecipientsActivity.A02;
                    if (r0 != null) {
                        r0.A00();
                    } else {
                        throw C18270x1.A0S("syncdUpdateHelper");
                    }
                } else {
                    throw C18270x1.A0S("statusStore");
                }
            }
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7KC r8 = (AnonymousClass7KC) obj;
        C89104bW r4 = this.A01;
        r4.A05 = null;
        Set set = r4.A0V;
        set.clear();
        set.addAll(r8.A02);
        Set set2 = r4.A0T;
        set2.clear();
        set2.addAll(set);
        Set set3 = this.A00;
        if (!set3.isEmpty()) {
            for (Object next : set3) {
                if (!(r4 instanceof StatusRecipientsActivity) ? !((r4 instanceof LastSeenBlockListPickerActivity) || (r4 instanceof GroupAddBlacklistPickerActivity)) : (!r4.A0M)) {
                    if (!r8.A01.contains(next)) {
                    }
                }
                set.add(next);
            }
            HashSet A0K = AnonymousClass002.A0K();
            for (Object next2 : r8.A02) {
                if (!set3.contains(next2)) {
                    A0K.add(next2);
                }
            }
            set.removeAll(A0K);
        }
        r4.A78();
        ArrayList arrayList = r8.A00;
        r4.A0K = arrayList;
        r4.A0L = r8.A01;
        MenuItem menuItem = r4.A00;
        if (menuItem != null) {
            menuItem.setVisible(AnonymousClass0x7.A1S(arrayList));
        }
        C89104bW.A0C(r4);
    }
}
