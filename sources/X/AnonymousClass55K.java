package X;

import android.util.Pair;
import android.view.ViewGroup;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.55K  reason: invalid class name */
public class AnonymousClass55K extends AnonymousClass5ZM {
    public int A00;
    public final WfalManager A01;
    public final C55152pt A02;
    public final AnonymousClass2W5 A03;
    public final C620233e A04;
    public final C54602oz A05;
    public final UserJid A06;
    public final AnonymousClass2z0 A07;
    public final C55832qz A08;
    public final C104745Se A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass55K(WfalManager wfalManager, C55152pt r3, AnonymousClass2W5 r4, C620233e r5, C54602oz r6, UserJid userJid, AnonymousClass2z0 r8, StatusPlaybackContactFragment statusPlaybackContactFragment, C55832qz r10, C104745Se r11, C183538qC r12, C183538qC r13, boolean z, boolean z2) {
        super(statusPlaybackContactFragment, true);
        this.A04 = r5;
        this.A09 = r11;
        this.A08 = r10;
        this.A01 = wfalManager;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r12;
        this.A0B = r13;
        this.A05 = r6;
        this.A07 = r8;
        this.A0C = z;
        this.A06 = userJid;
        this.A0D = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C620233e r0 = this.A04;
        UserJid userJid = this.A06;
        C623534r A052 = r0.A05(userJid);
        List A012 = this.A02.A01(userJid);
        if (userJid == AnonymousClass1fY.A00) {
            if (this.A01.A02()) {
                ((C56012rH) this.A0A.get()).A02();
            } else if (this.A09.A00()) {
                ((C54592oy) this.A0B.get()).A01();
            }
        }
        if (A052 != null) {
            AnonymousClass2z0 r1 = this.A07;
            if (r1 != null) {
                C624134x A053 = this.A08.A05(r1);
                if (A053 != null) {
                    Iterator it = A012.iterator();
                    while (it.hasNext()) {
                        if (C18300x5.A0T(it).A0K < A053.A0K) {
                            this.A00++;
                        }
                    }
                }
            } else if (this.A0C) {
                Iterator it2 = A012.iterator();
                while (it2.hasNext()) {
                    if (!A052.A0C(C18300x5.A0T(it2))) {
                        this.A00++;
                    }
                }
            }
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it3 = A012.iterator();
            while (it3.hasNext()) {
                C624134x A0T = C18300x5.A0T(it3);
                if (userJid instanceof C135216kJ) {
                    A0t.put(Long.valueOf(A0T.A1L), this.A03.A00(A0T));
                }
            }
            if (this.A0D) {
                Iterator it4 = A012.iterator();
                while (it4.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it4);
                    if (A0T2.A1I == 2) {
                        this.A05.A02(A0T2);
                    }
                }
            }
            return AnonymousClass0x9.A0C(A012, A0t);
        }
        return AnonymousClass0x9.A0C(Collections.emptyList(), Collections.emptyMap());
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) A07(StatusPlaybackContactFragment.class);
        if (statusPlaybackContactFragment != null) {
            List list = (List) pair.first;
            int i = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("playbackFragment/onMessagesLoaded ", A0o, list);
            C18260x0.A1R(A0o, " messages; ", statusPlaybackContactFragment);
            AnonymousClass5LT A0c = C86654Ky.A0c(statusPlaybackContactFragment);
            statusPlaybackContactFragment.A0o = list;
            statusPlaybackContactFragment.A0p = (Map) pair.second;
            statusPlaybackContactFragment.A1V();
            if (!list.isEmpty()) {
                if (i < list.size()) {
                    statusPlaybackContactFragment.A00 = i;
                }
                C105285Uh A1R = statusPlaybackContactFragment.A1R(C18320x8.A0R(list, statusPlaybackContactFragment.A00));
                ViewGroup viewGroup = A0c.A07;
                viewGroup.removeAllViews();
                viewGroup.addView(A1R.A00);
                A0c.A02.setVisibility(8);
                if (statusPlaybackContactFragment.A00) {
                    if (statusPlaybackContactFragment.A0o != null) {
                        int i2 = statusPlaybackContactFragment.A00;
                        statusPlaybackContactFragment.A00 = -1;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        statusPlaybackContactFragment.A1W(i2);
                    }
                    statusPlaybackContactFragment.A1Z(statusPlaybackContactFragment.A1Q(), 0, statusPlaybackContactFragment.A01);
                    return;
                }
                return;
            }
            C1226465e r2 = (C1226465e) statusPlaybackContactFragment.A0Q();
            if (r2 != null) {
                ((StatusPlaybackActivity) r2).A76(statusPlaybackContactFragment.A0R.getRawString(), 0, 0);
            }
        }
    }
}
