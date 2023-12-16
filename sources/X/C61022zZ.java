package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.RemovalOfGroupFromCommunity$$ExternalSyntheticLambda6;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2zZ  reason: invalid class name and case insensitive filesystem */
public class C61022zZ {
    public C89654ea A00;
    public final C56942so A01;
    public final C29441ip A02;
    public final C56982ss A03;
    public final C56892sj A04;
    public final AnonymousClass1VX A05;
    public final C27991fJ A06;
    public final C27991fJ A07;
    public final AnonymousClass31C A08;
    public final Runnable A09;
    public final String A0A;

    public static /* synthetic */ void A00(C61022zZ r3, int i) {
        C89654ea r2 = r3.A00;
        if (r2 != null) {
            r2.runOnUiThread(new C117705sM((Object) r3, i, 36));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r8 = this;
            X.1fJ r1 = r8.A07
            if (r1 == 0) goto L_0x0078
            X.1fJ r0 = r8.A06
            if (r0 == 0) goto L_0x0078
            X.4ea r0 = r8.A00
            if (r0 == 0) goto L_0x0078
            X.2ss r0 = r8.A03
            java.lang.String r7 = r0.A0D(r1)
            X.2sj r0 = r8.A04
            boolean r6 = r0.A0D(r1)
            X.2so r0 = r8.A01
            X.2rM r0 = r0.A0H
            java.util.Set r0 = r0.A03(r1)
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto L_0x008c
            X.1VX r2 = r8.A05
            r1 = 3167(0xc5f, float:4.438E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x008c
            X.4ea r5 = r8.A00
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L_0x0079
            r2 = 2131887939(0x7f120743, float:1.94105E38)
        L_0x003c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r8.A0A
            r1[r4] = r0
        L_0x0042:
            X.2iE r3 = com.whatsapp.LegacyMessageDialogFragment.A00(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131887938(0x7f120742, float:1.9410497E38)
            r3.A05 = r0
            r3.A0B = r1
            r0 = 2131887939(0x7f120743, float:1.94105E38)
            r3.A00 = r0
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 9
            X.4I1 r0 = new X.4I1
            r0.<init>(r1)
            r3.A01(r0, r2)
            if (r6 == 0) goto L_0x0071
            r0 = 14
            X.4I8 r1 = new X.4I8
            r1.<init>(r5, r0, r8)
            r0 = 2131886346(0x7f12010a, float:1.9407268E38)
        L_0x006d:
            r3.A04 = r0
            r3.A07 = r1
        L_0x0071:
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            X.C18270x1.A0t(r0, r5)
        L_0x0078:
            return
        L_0x0079:
            r2 = 2131887941(0x7f120745, float:1.9410503E38)
            if (r7 == 0) goto L_0x003c
            r2 = 2131887940(0x7f120744, float:1.9410501E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            java.lang.String r0 = r8.A0A
            r1[r4] = r0
            r1[r3] = r7
            goto L_0x0042
        L_0x008c:
            if (r6 == 0) goto L_0x0092
            r8.A02()
            return
        L_0x0092:
            X.4ea r5 = r8.A00
            java.lang.String r4 = r8.A0A
            r3 = 1
            r2 = 0
            if (r7 != 0) goto L_0x00c8
            r1 = 2131887984(0x7f120770, float:1.941059E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r4
        L_0x00a1:
            X.2iE r3 = com.whatsapp.LegacyMessageDialogFragment.A00(r0, r1)
            r1 = 2131887987(0x7f120773, float:1.9410597E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3.A05 = r1
            r3.A0B = r0
            r3.A00 = r1
            r2 = 2131893004(0x7f121b0c, float:1.9420772E38)
            r1 = 13
            X.4I8 r0 = new X.4I8
            r0.<init>(r5, r1, r8)
            r3.A01(r0, r2)
            r0 = 8
            X.4I1 r1 = new X.4I1
            r1.<init>(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            goto L_0x006d
        L_0x00c8:
            r1 = 2131887986(0x7f120772, float:1.9410595E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r4, r2)
            r0[r3] = r7
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61022zZ.A01():void");
    }

    public void A02() {
        char c;
        C89654ea r4 = this.A00;
        if (r4 != null) {
            C56892sj r2 = this.A04;
            C52882mC r5 = new C52882mC(this.A06, this.A0A, 2, -1);
            View inflate = LayoutInflater.from(r4).inflate(R.layout.f8nameremoved, (ViewGroup) null);
            TextView A0G = C18300x5.A0G(inflate, R.id.text);
            GroupJid groupJid = r5.A02;
            boolean z = true;
            if (r2.A04(groupJid).size() <= 1 && r2.A0C(groupJid)) {
                z = false;
            }
            String str = r5.A03;
            Resources resources = r4.getResources();
            if (TextUtils.isEmpty(str)) {
                c = 2;
                if (z) {
                    c = 0;
                }
            } else {
                c = 3;
                if (z) {
                    c = 1;
                }
            }
            A0G.setText(C18320x8.A0b(resources, str, new Object[1], 0, AnonymousClass2B7.A00[c]));
            TextView A0G2 = C18300x5.A0G(inflate, R.id.remove_members_checkbox);
            if (z) {
                A0G2.setText(R.string.f11nameremoved);
            } else {
                A0G2.setVisibility(8);
            }
            C19340zH A002 = AnonymousClass5V0.A00(r4);
            A002.A0a(inflate);
            A002.A0U(R.string.f11nameremoved);
            A002.A0d(r4, new AnonymousClass4K7(A0G2, 7, this), R.string.f11nameremoved);
            A002.A0c(r4, (C15930sC) null, R.string.f11nameremoved);
            A002.A0S();
        }
    }

    public final void A03(boolean z) {
        AnonymousClass36K A0I;
        C89654ea r3 = this.A00;
        if (r3 != null) {
            C27991fJ r6 = this.A07;
            if (r6 == null) {
                r3.runOnUiThread(new C117705sM((Object) this, 400, 36));
            } else if (!this.A02.A0F()) {
                this.A00.A05.A0F(C29441ip.A00(this.A00), 1);
            } else {
                this.A00.Bp9(R.string.f11nameremoved);
                AnonymousClass31C r12 = this.A08;
                AnonymousClass2GY r4 = new AnonymousClass2GY(this);
                List singletonList = Collections.singletonList(this.A06);
                String A032 = r12.A03();
                int size = singletonList.size();
                AnonymousClass36K[] r32 = new AnonymousClass36K[size];
                for (int i = 0; i < size; i++) {
                    if (z) {
                        AnonymousClass39V[] r7 = new AnonymousClass39V[2];
                        AnonymousClass39V.A02((Jid) singletonList.get(i), "jid", r7, 0);
                        AnonymousClass39V.A0B("remove_orphaned_members", "true", r7, 1);
                        A0I = AnonymousClass36K.A0I("group", r7);
                    } else {
                        AnonymousClass39V[] r5 = new AnonymousClass39V[1];
                        AnonymousClass39V.A02((Jid) singletonList.get(i), "jid", r5, 0);
                        A0I = AnonymousClass36K.A0I("group", r5);
                    }
                    r32[i] = A0I;
                }
                AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                AnonymousClass39V.A0B("unlink_type", "sub_group", r2, 0);
                AnonymousClass36K A0J = AnonymousClass36K.A0J("unlink", r2, r32);
                AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A032, 0);
                AnonymousClass39V.A0D("xmlns", "w:g2", A0H, 1, 2);
                r12.A0D(new AnonymousClass3SX(r4), AnonymousClass36K.A0C(r6, A0J, A0H), A032, 308, 32000);
            }
        }
    }

    public C61022zZ(C89654ea r4, C56942so r5, C29441ip r6, AnonymousClass5ZU r7, C56982ss r8, C56892sj r9, AnonymousClass3ZH r10, AnonymousClass1VX r11, AnonymousClass31C r12, Runnable runnable) {
        this.A05 = r11;
        this.A03 = r8;
        this.A08 = r12;
        this.A01 = r5;
        this.A04 = r9;
        this.A02 = r6;
        this.A09 = runnable;
        C27991fJ r0 = (C27991fJ) AnonymousClass3ZH.A04(r10);
        this.A06 = r0;
        this.A07 = r5.A01(r0);
        this.A0A = r7.A0H(r10);
        C626936e.A01();
        AnonymousClass08A r2 = r4.A06;
        if (r2.A02 != AnonymousClass0GC.DESTROYED) {
            this.A00 = r4;
            r2.A00(new RemovalOfGroupFromCommunity$$ExternalSyntheticLambda6(this));
            return;
        }
        this.A00 = null;
    }
}
