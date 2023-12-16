package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.1sn  reason: invalid class name and case insensitive filesystem */
public class C33311sn extends AnonymousClass5ZM {
    public final /* synthetic */ GroupMembersSelector A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (obj != null) {
            GroupMembersSelector groupMembersSelector = this.A00;
            View A0H = C18310x6.A0H(LayoutInflater.from(groupMembersSelector), R.layout.f8nameremoved);
            C19340zH A002 = AnonymousClass5V0.A00(groupMembersSelector);
            A002.A0U(R.string.f11nameremoved);
            C19340zH.A01(groupMembersSelector, A002, R.string.f11nameremoved);
            A002.A0a(A0H);
            AnonymousClass043 create = A002.create();
            TextView A0G = C18300x5.A0G(A0H, R.id.button1);
            TextView A0G2 = C18300x5.A0G(A0H, R.id.button2);
            TextView A0G3 = C18300x5.A0G(A0H, R.id.button3);
            A0G.setText(R.string.f11nameremoved);
            A0G.setOnClickListener(new C109725f5((Object) this, obj, (Object) create, 44));
            A0G2.setText(R.string.f11nameremoved);
            C635439q.A00(A0G2, this, 2);
            A0G3.setText(R.string.f11nameremoved);
            C635439q.A00(A0G3, create, 3);
            A0G3.setVisibility(0);
            create.show();
            return;
        }
        this.A00.A7d(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33311sn(GroupMembersSelector groupMembersSelector) {
        super(groupMembersSelector, true);
        this.A00 = groupMembersSelector;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        GroupMembersSelector groupMembersSelector = this.A00;
        C56892sj r2 = groupMembersSelector.A04;
        AnonymousClass1RR A01 = C56972sr.A01(groupMembersSelector.A01);
        Objects.requireNonNull(A01);
        UserJid userJid = (UserJid) A01.A0H;
        Objects.requireNonNull(userJid);
        for (C28011fL r5 : r2.A09.A0B(userJid)) {
            if ((r5 instanceof C27991fJ) && AnonymousClass3ZH.A0E(groupMembersSelector.A0B.A0A(r5))) {
                C620833k A07 = groupMembersSelector.A05.A07(r5);
                int size = A07.A09.size();
                List list = groupMembersSelector.A0f;
                if (size == list.size() + 1) {
                    C129526aS A02 = A07.A02();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (A02.contains(AnonymousClass3ZH.A06(it))) {
                            i++;
                        }
                    }
                    if (i == list.size()) {
                        return r5;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
