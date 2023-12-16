package X;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53f  reason: invalid class name and case insensitive filesystem */
public final class C987853f extends C88504Yz implements C15590rc {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final C05430Th A04;
    public final C05430Th A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final AnonymousClass1VX A08;
    public final C103295Mi A09;
    public final UpdatesFragment A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C987853f(android.view.View r20, X.C620733j r21, X.AnonymousClass1VX r22, X.C103295Mi r23, com.whatsapp.updates.ui.UpdatesFragment r24) {
        /*
            r19 = this;
            r3 = 1
            r7 = r21
            X.C162457s7.A0J(r7, r3)
            r6 = r22
            r1 = r23
            X.C18260x0.A0T(r6, r1)
            r2 = r19
            r4 = r20
            r2.<init>(r4)
            r0 = r24
            r2.A0A = r0
            r2.A08 = r6
            r2.A09 = r1
            r0 = 2131434517(0x7f0b1c15, float:1.849085E38)
            com.whatsapp.WaTextView r1 = X.C86644Kx.A0O(r4, r0)
            r2.A07 = r1
            r0 = 2131431565(0x7f0b108d, float:1.8484863E38)
            android.view.View r15 = r4.findViewById(r0)
            r2.A02 = r15
            r0 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r10 = r4.findViewById(r0)
            r2.A00 = r10
            r0 = 2131433417(0x7f0b17c9, float:1.848862E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0J(r4, r0)
            r2.A03 = r0
            r5 = 2131433421(0x7f0b17cd, float:1.8488627E38)
            com.whatsapp.WaTextView r5 = X.C86644Kx.A0O(r4, r5)
            r2.A06 = r5
            r8 = 2131428501(0x7f0b0495, float:1.8478648E38)
            android.view.View r8 = r4.findViewById(r8)
            r2.A01 = r8
            android.content.Context r9 = r4.getContext()
            boolean r8 = X.C620733j.A04(r7)
            r16 = 5
            int r11 = X.C86664Kz.A04(r8)
            r12 = 0
            int r13 = X.AnonymousClass29M.A00(r6)
            X.0Th r8 = new X.0Th
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A04 = r8
            android.content.Context r14 = r4.getContext()
            boolean r7 = X.C620733j.A04(r7)
            if (r7 != 0) goto L_0x0078
            r16 = 3
        L_0x0078:
            int r18 = X.AnonymousClass29M.A00(r6)
            X.0Th r13 = new X.0Th
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r2.A05 = r13
            r6 = 2131893993(0x7f121ee9, float:1.9422778E38)
            r1.setText(r6)
            X.C106905aM.A04(r1)
            X.C106905aM.A04(r5)
            r1 = 16
            X.C109395eY.A00(r0, r2, r1)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r1 = X.C18290x4.A0M(r4, r0)
            r0 = 8
            r1.setVisibility(r0)
            X.C107295b4.A06(r4, r3)
            r0 = 2131428486(0x7f0b0486, float:1.8478618E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 17
            X.C109395eY.A00(r1, r2, r0)
            r0 = 2131432349(0x7f0b139d, float:1.8486453E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 18
            X.C109395eY.A00(r1, r2, r0)
            X.0Th r7 = r2.A04
            X.0cz r6 = r7.A04
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A00(r0)
            if (r0 == 0) goto L_0x00cb
            r6.A0H = r3
        L_0x00cb:
            r0 = 2131892696(0x7f1219d8, float:1.9420148E38)
            android.view.MenuItem r5 = r6.add((int) r12, (int) r12, (int) r12, (int) r0)
            r4 = 2131232066(0x7f080542, float:1.808023E38)
            android.content.Context r1 = X.C86664Kz.A0T(r2)
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r1, r4, r0)
            r5.setIcon(r0)
            r0 = 2131892697(0x7f1219d9, float:1.942015E38)
            android.view.MenuItem r5 = r6.add((int) r12, (int) r3, (int) r12, (int) r0)
            r4 = 2131233292(0x7f080a0c, float:1.8082717E38)
            android.content.Context r1 = X.C86664Kz.A0T(r2)
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r1, r4, r0)
            r5.setIcon(r0)
            android.view.View r4 = r2.A00
            r0 = 20
            X.C109395eY.A00(r4, r2, r0)
            android.view.View r6 = r2.A0H
            android.content.Context r1 = r6.getContext()
            r0 = 2131894316(0x7f12202c, float:1.9423433E38)
            X.C18300x5.A13(r1, r4, r0)
            r7.A01 = r2
            X.0Th r5 = r2.A05
            X.0cz r7 = r5.A04
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A00(r0)
            if (r0 == 0) goto L_0x0124
            r7.A0H = r3
        L_0x0124:
            X.5Mi r0 = r2.A09
            X.1VX r8 = r0.A00
            r0 = 6796(0x1a8c, float:9.523E-42)
            boolean r0 = r8.A0X(r0)
            if (r0 == 0) goto L_0x014e
            r1 = 2131431468(0x7f0b102c, float:1.8484666E38)
            r0 = 2131893423(0x7f121caf, float:1.9421622E38)
            android.view.MenuItem r4 = r7.add((int) r12, (int) r1, (int) r12, (int) r0)
            r3 = 2131234202(0x7f080d9a, float:1.8084563E38)
            android.content.Context r1 = X.C86664Kz.A0T(r2)
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r1, r3, r0)
            r4.setIcon(r0)
        L_0x014e:
            r0 = 6850(0x1ac2, float:9.599E-42)
            boolean r0 = r8.A0X(r0)
            if (r0 != 0) goto L_0x0174
            r1 = 2131431486(0x7f0b103e, float:1.8484703E38)
            r0 = 2131896368(0x7f122830, float:1.9427595E38)
            android.view.MenuItem r4 = r7.add((int) r12, (int) r1, (int) r12, (int) r0)
            r3 = 2131234166(0x7f080d76, float:1.808449E38)
            android.content.Context r1 = X.C86664Kz.A0T(r2)
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r1, r3, r0)
            r4.setIcon(r0)
        L_0x0174:
            r0 = 6279(0x1887, float:8.799E-42)
            boolean r0 = r8.A0X(r0)
            if (r0 != 0) goto L_0x0198
            r1 = 2
            r0 = 2131896137(0x7f122749, float:1.9427127E38)
            android.view.MenuItem r4 = r7.add((int) r12, (int) r1, (int) r12, (int) r0)
            r3 = 2131231754(0x7f08040a, float:1.8079598E38)
            android.content.Context r1 = X.C86664Kz.A0T(r2)
            X.1VX r0 = r2.A08
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r1, r3, r0)
            r4.setIcon(r0)
        L_0x0198:
            android.view.View r3 = r2.A02
            r0 = 19
            X.C109395eY.A00(r3, r2, r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131890819(0x7f121283, float:1.941634E38)
            X.C18300x5.A13(r1, r3, r0)
            r5.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C987853f.<init>(android.view.View, X.33j, X.1VX, X.5Mi, com.whatsapp.updates.ui.UpdatesFragment):void");
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (Integer.valueOf(itemId) != null) {
                if (itemId == 2) {
                    Context A1D = this.A0A.A1D();
                    if (A1D != null) {
                        Intent A072 = C18320x8.A07();
                        A072.setClassName(A1D.getPackageName(), "com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity");
                        A1D.startActivity(A072);
                    }
                    return true;
                } else if (itemId == R.id.menuitem_status_privacy) {
                    UpdatesFragment updatesFragment = this.A0A;
                    updatesFragment.A0m(C627736r.A07(updatesFragment.A0G()));
                    return true;
                } else if (itemId == 0) {
                    this.A0A.A1J();
                    return true;
                } else if (itemId == 1) {
                    this.A0A.A1K();
                    return true;
                } else if (itemId == R.id.menuitem_archived_status) {
                    AnonymousClass344.A00(new StatusArchiveSettingsBottomSheetDialog(), this.A0A.A0T());
                    return true;
                } else if (itemId == R.id.menuitem_see_all_statuses) {
                    this.A0A.A1L();
                    return true;
                }
            }
        }
        throw AnonymousClass001.A0e("Could not handle menu item click");
    }
}
