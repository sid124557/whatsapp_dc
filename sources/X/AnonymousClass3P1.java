package X;

import android.net.Uri;
import com.whatsapp.community.AddGroupsToCommunityActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.jid.GroupJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3P1  reason: invalid class name */
public class AnonymousClass3P1 implements AnonymousClass4EO {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C59822xY A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ Set A03;

    public AnonymousClass3P1(Uri uri, C59822xY r2, Set set, Set set2) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = set;
        this.A02 = set2;
    }

    public void BdP(AnonymousClass2RJ r18, C27991fJ r19) {
        C28001fK r2;
        C69263Wi r3;
        Runnable runnable;
        C69263Wi r22;
        Runnable r1;
        C59822xY r4 = this.A01;
        C27991fJ r5 = r19;
        r4.A02 = r5;
        Uri uri = this.A00;
        if (uri != null) {
            File A0a = C18310x6.A0a(uri);
            if (A0a.exists()) {
                r4.A0F.A0H(r4.A07.A0A(r5), A0a, (byte[]) null, false);
            }
        }
        C84394Ce r7 = r4.A01;
        if (r7 != null) {
            AnonymousClass4IO r72 = (AnonymousClass4IO) r7;
            if (r72.A01 != 0) {
                NewCommunityActivity newCommunityActivity = (NewCommunityActivity) r72.A00;
                newCommunityActivity.A0Q.set(r5);
                AnonymousClass33U r12 = newCommunityActivity.A0A;
                String str = r5.user;
                C46352bU r0 = r12.A01;
                String A002 = r0.A00();
                Integer num = r0.A02;
                Integer A0h = AnonymousClass0x7.A0h();
                Integer A0b = C18290x4.A0b();
                C24931Zh r13 = new C24931Zh();
                r13.A04 = A002;
                r13.A01 = A0b;
                r13.A02 = num;
                r13.A00 = A0h;
                r13.A03 = null;
                r13.A05 = str;
                r12.A04.BhA(r13);
                if (newCommunityActivity.A07.A0L(r5)) {
                    r22 = newCommunityActivity.A05;
                    r1 = new C70193a6(r72, 8, r5);
                } else {
                    r3 = newCommunityActivity.A05;
                    runnable = C71313bu.A00(r72, 18);
                    r3.A0T(runnable, 10000);
                }
            } else {
                AddGroupsToCommunityActivity addGroupsToCommunityActivity = (AddGroupsToCommunityActivity) r72.A00;
                addGroupsToCommunityActivity.A0R.set(r5);
                if (addGroupsToCommunityActivity.A0F.A0L(r5)) {
                    r22 = addGroupsToCommunityActivity.A05;
                    r1 = new C71653cS(r72, 23, r5);
                } else {
                    r3 = addGroupsToCommunityActivity.A05;
                    runnable = new C71553cI((Object) r72, 24);
                    r3.A0T(runnable, 10000);
                }
            }
            r22.A0S(r1);
        }
        Set set = this.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            GroupJid A003 = AnonymousClass32V.A00(C18310x6.A0R(it).A0H);
            if (A003 != null) {
                A0s.add(A003);
            }
        }
        boolean A1S = AnonymousClass0x7.A1S(A0s);
        Set set2 = this.A02;
        int size = set2.size() + (A1S ? 1 : 0);
        if (size == 0) {
            C59822xY.A00(r4, size);
            return;
        }
        r4.A0I.set(size);
        if (!set2.isEmpty()) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it2);
                C95814uZ r23 = A0R.A0H;
                if (r23 instanceof C28001fK) {
                    r2 = (C28001fK) r23;
                } else {
                    r2 = null;
                }
                C626936e.A06(r2);
                C47492dL r14 = new C47492dL(r2);
                r14.A03 = A0R.A0J();
                r14.A04 = AnonymousClass001.A0s();
                r14.A00 = A0R.A02;
                r14.A01 = r5;
                AnonymousClass2U1 A004 = r14.A00();
                r4.A0H.put(r2, A0R.A0J());
                C56612sH r11 = r4.A09;
                AnonymousClass1VX r122 = r4.A0A;
                new AnonymousClass3TR(r4.A04, r4.A06, r11, r122, r4.A0B, new AnonymousClass3P0(r4, A0R, r2), A004, r4.A0E).A00();
            }
        }
        if (!A0s.isEmpty()) {
            Iterator it3 = A0s.iterator();
            while (it3.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it3);
                r4.A0H.put(A0P, r4.A07.A0A(A0P).A0J());
            }
            r4.A0D.A00(new C626435x(r4, 1), r5, A0s);
        }
    }

    public void Be8() {
        C84394Ce r0 = this.A01.A01;
        if (r0 != null) {
            r0.BPN();
        }
    }

    public void onError(int i) {
        C84394Ce r0 = this.A01.A01;
        if (r0 != null) {
            r0.BPN();
        }
    }
}
