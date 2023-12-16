package X;

import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.984  reason: invalid class name */
public abstract class AnonymousClass984 extends AnonymousClass5c4 implements C185008su {
    public final C620733j A00;

    public void A00(AnonymousClass49F r7, AnonymousClass49G r8) {
        if (this instanceof AnonymousClass9Hg) {
            AnonymousClass9Hg r2 = (AnonymousClass9Hg) this;
            r2.A02 = new C193179Nl(r8.B3p());
            r2.A01();
        } else if (this instanceof C191959Hf) {
            C191959Hf r22 = (C191959Hf) this;
            r22.A01 = new C43432Sc(r8.B3p().A0K(40)).A02;
            r22.A00 = r7;
        } else {
            C191949He r5 = (C191949He) this;
            List<Object> A0R = r8.B3p().A0R(45);
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object r23 : A0R) {
                A0s.add(new C204959qC(r23, 0));
            }
            r5.A01 = A0s;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fb, code lost:
        r3 = X.AnonymousClass0x7.A0J(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ff, code lost:
        r4.setIcon(r3);
        r4.setShowAsAction(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (r1.equals(r0) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r4.setShowAsAction(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQQ(android.view.Menu r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass9Hg
            if (r0 == 0) goto L_0x005a
            r5 = r11
            X.9Hg r5 = (X.AnonymousClass9Hg) r5
            java.lang.String r1 = "cart"
            r0 = 55
            r4 = 0
            android.view.MenuItem r0 = r12.add(r4, r0, r4, r1)
            r5.A00 = r0
            r2 = 1
            r0.setShowAsAction(r2)
            android.view.MenuItem r1 = r5.A00
            r0 = 2131231807(0x7f08043f, float:1.8079705E38)
            r1.setIcon(r0)
            android.view.MenuItem r0 = r5.A00
            r0.setVisible(r4)
            java.lang.String r1 = "more"
            r0 = 56
            android.view.MenuItem r0 = r12.add(r4, r0, r4, r1)
            r5.A01 = r0
            r0.setShowAsAction(r2)
            android.view.MenuItem r3 = r5.A01
            X.4Dj r0 = r5.A03
            X.2dA r0 = r0.BEP()
            java.lang.ref.WeakReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r2 = r0.getApplicationContext()
            r1 = 2131234070(0x7f080d16, float:1.8084295E38)
            r0 = 2131101973(0x7f060915, float:1.781637E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r2, r1, r0)
            r3.setIcon(r0)
            android.view.MenuItem r0 = r5.A01
            r0.setVisible(r4)
            r5.A01()
        L_0x0059:
            return
        L_0x005a:
            boolean r0 = r11 instanceof X.C191959Hf
            if (r0 == 0) goto L_0x0112
            r7 = r11
            X.9Hf r7 = (X.C191959Hf) r7
            java.util.List r0 = r7.A01
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            java.util.List r0 = r7.A01
            java.util.Iterator r10 = r0.iterator()
            r6 = 0
            r5 = 0
        L_0x0073:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r8 = r10.next()
            X.2PA r8 = (X.AnonymousClass2PA) r8
            java.lang.String r0 = r8.A02
            android.view.MenuItem r4 = r12.add(r6, r5, r6, r0)
            X.48t r0 = r8.A00
            if (r0 == 0) goto L_0x0099
            java.util.Map r3 = r7.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1 = 9
            X.9po r0 = new X.9po
            r0.<init>(r8, r1)
            r3.put(r2, r0)
        L_0x0099:
            java.lang.String r1 = r8.A01
            if (r1 == 0) goto L_0x00a5
            int r0 = r1.hashCode()
            r8 = 1
            switch(r0) {
                case -906336856: goto L_0x00a8;
                case -316266717: goto L_0x00b8;
                case 3327275: goto L_0x00bb;
                case 109400031: goto L_0x00e6;
                case 529642498: goto L_0x00e9;
                case 928814795: goto L_0x00ec;
                case 1505434244: goto L_0x0106;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            int r5 = r5 + 1
            goto L_0x0073
        L_0x00a8:
            java.lang.String r0 = "search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            X.33j r2 = r7.A00
            android.content.Context r1 = r7.A02
            r0 = 2131231776(0x7f080420, float:1.8079643E38)
            goto L_0x00fb
        L_0x00b8:
            java.lang.String r0 = "open_in_browser"
            goto L_0x0108
        L_0x00bb:
            java.lang.String r0 = "lock"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            X.33j r1 = r7.A00
            android.content.Context r9 = r7.A02
            r0 = 2131232222(0x7f0805de, float:1.8080547E38)
            X.6dx r3 = X.AnonymousClass0x7.A0J(r9, r1, r0)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2130971051(0x7f0409ab, float:1.755083E38)
            r0 = 2131102713(0x7f060bf9, float:1.7817872E38)
            int r0 = X.AnonymousClass5Yj.A02(r9, r1, r0)
            int r1 = r2.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r1, r0)
            goto L_0x00ff
        L_0x00e6:
            java.lang.String r0 = "share"
            goto L_0x0108
        L_0x00e9:
            java.lang.String r0 = "overflow"
            goto L_0x0108
        L_0x00ec:
            java.lang.String r0 = "report_a_bug"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            X.33j r2 = r7.A00
            android.content.Context r1 = r7.A02
            r0 = 2131234155(0x7f080d6b, float:1.8084468E38)
        L_0x00fb:
            X.6dx r3 = X.AnonymousClass0x7.A0J(r1, r2, r0)
        L_0x00ff:
            r4.setIcon(r3)
            r4.setShowAsAction(r8)
            goto L_0x00a5
        L_0x0106:
            java.lang.String r0 = "copy_link"
        L_0x0108:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r4.setShowAsAction(r6)
            goto L_0x00a5
        L_0x0112:
            r4 = r11
            X.9He r4 = (X.C191949He) r4
            java.lang.String r1 = ""
            r0 = 56
            r5 = 0
            android.view.MenuItem r0 = r12.add(r5, r0, r5, r1)
            r4.A00 = r0
            r0.setShowAsAction(r5)
            android.view.MenuItem r1 = r4.A00
            r0 = 2131893824(0x7f121e40, float:1.9422435E38)
            r1.setTitle(r0)
            android.view.MenuItem r3 = r4.A00
            X.4Dj r0 = r4.A02
            X.2dA r0 = r0.BEP()
            java.lang.ref.WeakReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r2 = r0.getApplicationContext()
            r1 = 2131234070(0x7f080d16, float:1.8084295E38)
            r0 = 2131101973(0x7f060915, float:1.781637E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r2, r1, r0)
            r3.setIcon(r0)
            android.view.MenuItem r0 = r4.A00
            r0.setVisible(r5)
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            android.view.MenuItem r1 = r4.A00
            if (r1 == 0) goto L_0x0059
            r0 = 1
            r1.setVisible(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass984.BQQ(android.view.Menu):void");
    }

    public boolean BXQ(MenuItem menuItem) {
        if (this instanceof AnonymousClass9Hg) {
            AnonymousClass9Hg r3 = (AnonymousClass9Hg) this;
            if (menuItem.getItemId() != 56) {
                return false;
            }
            AnonymousClass8DJ.A0B(r3.A03.BEP(), new C196239aW(new C204959qC(r3, 1), r3));
            return false;
        } else if (this instanceof C191959Hf) {
            C191959Hf r1 = (C191959Hf) this;
            int itemId = menuItem.getItemId();
            Map map = r1.A04;
            Integer valueOf = Integer.valueOf(itemId);
            if (!map.containsKey(valueOf)) {
                return false;
            }
            AnonymousClass49F r0 = r1.A00;
            if (r0 != null) {
                C131266dJ B3o = r0.B3o();
                Object obj = map.get(valueOf);
                C626936e.A06(obj);
                AnonymousClass8DJ.A07(((AnonymousClass49I) obj).B3r(), B3o).run();
                return true;
            }
            C47382dA BEP = r1.A03.BEP();
            Object obj2 = map.get(valueOf);
            C626936e.A06(obj2);
            AnonymousClass8DJ.A0B(BEP, (AnonymousClass49I) obj2);
            return true;
        } else if (!(this instanceof C191949He)) {
            return false;
        } else {
            C191949He r4 = (C191949He) this;
            if (r4.A01 != null && menuItem.getItemId() == 56) {
                AnonymousClass8DJ.A0B(r4.A02.BEP(), new C204719po(r4, 8));
            }
            return false;
        }
    }

    public AnonymousClass984(C620733j r1) {
        this.A00 = r1;
    }

    public boolean BYj(Menu menu) {
        return false;
    }
}
