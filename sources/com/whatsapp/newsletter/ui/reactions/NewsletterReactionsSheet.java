package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hp;
import X.AnonymousClass20D;
import X.AnonymousClass2SQ;
import X.AnonymousClass2z0;
import X.AnonymousClass360;
import X.AnonymousClass4FP;
import X.AnonymousClass4Ut;
import X.AnonymousClass5UP;
import X.AnonymousClass5ZU;
import X.AnonymousClass62A;
import X.AnonymousClass62B;
import X.AnonymousClass62C;
import X.AnonymousClass69I;
import X.AnonymousClass6JI;
import X.AnonymousClass7CN;
import X.AnonymousClass7CO;
import X.AnonymousClass7YK;
import X.AnonymousClass8YQ;
import X.C08240dc;
import X.C08310eF;
import X.C104925Sw;
import X.C107165ao;
import X.C111095hX;
import X.C114015mM;
import X.C118055sv;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C33141sV;
import X.C46502bj;
import X.C56612sH;
import X.C616131n;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C64313Cz;
import X.C64333Db;
import X.C72023d3;
import X.C84814Du;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class NewsletterReactionsSheet extends Hilt_NewsletterReactionsSheet {
    public MaterialButton A00;
    public MaterialButton A01;
    public MaterialButtonToggleGroup A02;
    public C111095hX A03;
    public AnonymousClass7CN A04;
    public WaViewPager A05;
    public AnonymousClass5ZU A06;
    public C114015mM A07;
    public C620733j A08;
    public AnonymousClass5UP A09;
    public C46502bj A0A;
    public AnonymousClass4Ut A0B;
    public List A0C = C72023d3.A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        if (!this.A0C.isEmpty()) {
            return C86664Kz.A0h(layoutInflater, viewGroup, R.layout.f8nameremoved);
        }
        C08240dc r0 = new C08240dc(A0U());
        r0.A07(this);
        r0.A01();
        A0U().A0M();
        return null;
    }

    public void A0w(Bundle bundle, View view) {
        C64313Cz r3;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        view2.getLayoutParams().height = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = (MaterialButtonToggleGroup) view2.findViewById(R.id.reactions_tab_buttons);
        this.A00 = (MaterialButton) view2.findViewById(R.id.reactions_button_all);
        this.A01 = (MaterialButton) view2.findViewById(R.id.reactions_button_contacts);
        this.A05 = (WaViewPager) view2.findViewById(R.id.reactions_content);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A02;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A08.add(new AnonymousClass69I(this, 0));
        }
        AnonymousClass7CN r1 = this.A04;
        if (r1 != null) {
            List list = this.A0C;
            boolean z4 = true;
            if (list.size() <= 1) {
                z4 = false;
            }
            C118055sv r12 = r1.A00;
            C64333Db r0 = r12.A04;
            C56612sH A2p = C64333Db.A2p(r0);
            C621033m A082 = C64333Db.A08(r0);
            C33141sV A0e = C86654Ky.A0e(r0);
            this.A0B = new AnonymousClass4Ut((AnonymousClass7CO) r12.A03.A13.get(), A082, A2p, C64333Db.A39(r0), C86634Kw.A0n(r0), A0e, list, z4);
            WaViewPager waViewPager = this.A05;
            if (waViewPager != null) {
                waViewPager.A0G(new AnonymousClass6JI(waViewPager, this));
            }
            AnonymousClass4Ut r9 = this.A0B;
            if (r9 == null) {
                throw C86604Kt.A0j();
            }
            C86604Kt.A1N(A0V(), r9.A04, new AnonymousClass62A(this), 294);
            C86604Kt.A1N(A0V(), r9.A01, new AnonymousClass8YQ(this), 295);
            C86604Kt.A1N(A0V(), r9.A03, new AnonymousClass62B(this), 296);
            ArrayList A0s = AnonymousClass001.A0s();
            LinkedHashMap A0r = C18320x8.A0r();
            LinkedHashMap A0r2 = C18320x8.A0r();
            List list2 = r9.A0B;
            Iterator it = list2.iterator();
            long j = 0;
            String str = null;
            String str2 = null;
            loop0:
            while (true) {
                if (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    AnonymousClass4FP r32 = A0T.A0L;
                    if ((r32 instanceof C64313Cz) && (r3 = (C64313Cz) r32) != null) {
                        Iterator B4K = r3.B4K();
                        while (B4K.hasNext()) {
                            AnonymousClass1Hp r122 = (AnonymousClass1Hp) B4K.next();
                            String str3 = r122.A02;
                            String A032 = C107165ao.A03(str3);
                            if (A032 == null) {
                                break loop0;
                            }
                            String A022 = C107165ao.A02(A032);
                            C162457s7.A0D(A022);
                            if (r9.A0E) {
                                z = false;
                                StringBuilder A0l = AnonymousClass000.A0l(A022);
                                AnonymousClass2z0 r11 = A0T.A1J;
                                String A0R = AnonymousClass000.A0R(r11, A0l);
                                if (r122.A01) {
                                    String A0o = C18290x4.A0o(r11);
                                    boolean z5 = r122.A01;
                                    StringBuilder A0l2 = AnonymousClass000.A0l(A0o);
                                    A0l2.append('_');
                                    A0l2.append(z5);
                                    LinkedHashMap linkedHashMap = A0r;
                                    linkedHashMap.put(A0R, new C104925Sw(A0T, AnonymousClass0x2.A0e(A022, A0l2, '_'), str3, (List) null, 1, true));
                                }
                            } else {
                                z = r122.A01;
                                if (z) {
                                    str2 = str3;
                                    str = A022;
                                }
                            }
                            C104925Sw r2 = (C104925Sw) A0r2.get(A022);
                            if (r2 != null) {
                                i = r2.A00;
                            } else {
                                i = 0;
                            }
                            int i2 = (int) r122.A00;
                            C104925Sw r22 = (C104925Sw) A0r2.get(A022);
                            if (r22 != null) {
                                z2 = r22.A05;
                            } else {
                                z2 = false;
                            }
                            j += (long) i2;
                            boolean z6 = r122.A01;
                            StringBuilder A0l3 = AnonymousClass000.A0l("aggregate");
                            A0l3.append('_');
                            A0l3.append(z6);
                            String A0e2 = AnonymousClass0x2.A0e(str3, A0l3, '_');
                            int i3 = i + i2;
                            if (!z2) {
                                z3 = false;
                                if (!z) {
                                    A0r2.put(A022, new C104925Sw(A0T, A0e2, A022, (List) null, i3, z3));
                                }
                            }
                            z3 = true;
                            A0r2.put(A022, new C104925Sw(A0T, A0e2, A022, (List) null, i3, z3));
                        }
                        continue;
                    }
                } else {
                    if (str2 != null && !C162457s7.A0P(str, str2)) {
                        C104925Sw r23 = (C104925Sw) A0r2.get(str);
                        if (r23 != null) {
                            String str4 = r23.A02;
                            int i4 = r23.A00;
                            boolean z7 = r23.A05;
                            A0r2.put(str2, new C104925Sw(r23.A01, str4, str2, r23.A04, i4, z7));
                        }
                        AnonymousClass360.A02(A0r2).remove(str);
                    }
                    A0s.addAll(A0r.values());
                    Collection values = A0r2.values();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (Object next : values) {
                        if (((C104925Sw) next).A05) {
                            A0s2.add(next);
                        }
                    }
                    A0s.addAll(C86654Ky.A0q(A0s2, 46));
                    Collection values2 = A0r2.values();
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    for (Object next2 : values2) {
                        C86624Kv.A1Q(next2, A0s3, ((C104925Sw) next2).A05 ? 1 : 0);
                    }
                    A0s.addAll(C86654Ky.A0q(A0s3, 47));
                    r9.A00.A0H(new AnonymousClass7YK(A0s, j));
                }
            }
            AnonymousClass2SQ r6 = r9.A09;
            AnonymousClass62C r5 = new AnonymousClass62C(r9);
            C616131n.A02(r6.A04, new GetReactionSendersUseCase$invoke$1(r6, list2, (C84814Du) null, r5), r6.A05, (AnonymousClass20D) null, 2);
            return;
        }
        throw C18270x1.A0S("viewModelFactory");
    }

    public void A0c() {
        super.A0c();
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
    }

    public void A0a() {
        super.A0a();
    }
}
