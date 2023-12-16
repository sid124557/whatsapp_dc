package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4gz  reason: invalid class name and case insensitive filesystem */
public class C90264gz extends C90534hg implements C181828nP {
    public long A00 = 1;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Activity A07;
    public final AnonymousClass5WY A08;
    public final C105405Uu A09;
    public final C150397Qo A0A;
    public final C87614Tz A0B;
    public final C104975Tb A0C;
    public final C184108rG A0D;
    public final C64773Ex A0E;
    public final C56422rx A0F;
    public final AnonymousClass5ZU A0G;
    public final AnonymousClass33p A0H;
    public final C620733j A0I;
    public final AnonymousClass1VX A0J;
    public final C53202mi A0K;
    public final Map A0L = AnonymousClass001.A0t();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90264gz(android.app.Activity r11, X.C111095hX r12, X.C56972sr r13, X.AnonymousClass5WY r14, X.C105405Uu r15, X.AnonymousClass5Y9 r16, X.C152967aS r17, X.C150397Qo r18, X.C87614Tz r19, X.C104975Tb r20, X.C184108rG r21, X.C64773Ex r22, X.C56422rx r23, X.AnonymousClass5ZU r24, X.AnonymousClass33p r25, X.C620733j r26, X.AnonymousClass1VX r27, X.C53202mi r28, com.whatsapp.jid.UserJid r29) {
        /*
            r10 = this;
            r2 = 1
            r8 = r27
            X.C162457s7.A0J(r8, r2)
            r6 = r16
            r1 = r28
            r5 = r13
            X.C18260x0.A0e(r13, r14, r6, r1)
            r9 = r29
            r7 = r17
            X.C18260x0.A0W(r15, r9, r7)
            r0 = 10
            r4 = r12
            X.C162457s7.A0J(r12, r0)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.A08 = r14
            r10.A0K = r1
            r10.A09 = r15
            r10.A07 = r11
            r0 = 1
            r10.A00 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r10.A0L = r0
            r10.A0E(r2)
            r0 = 0
            r10.A06 = r0
            r10.A05 = r0
            r10.A0J = r8
            r0 = r22
            r10.A0E = r0
            r0 = r24
            r10.A0G = r0
            r0 = r26
            r10.A0I = r0
            r0 = r23
            r10.A0F = r0
            r0 = r25
            r10.A0H = r0
            r0 = r21
            r10.A0D = r0
            r0 = r19
            r10.A0B = r0
            r0 = r18
            r10.A0A = r0
            r0 = r20
            r10.A0C = r0
            r10.A0U(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90264gz.<init>(android.app.Activity, X.5hX, X.2sr, X.5WY, X.5Uu, X.5Y9, X.7aS, X.7Qo, X.4Tz, X.5Tb, X.8rG, X.3Ex, X.2rx, X.5ZU, X.33p, X.33j, X.1VX, X.2mi, com.whatsapp.jid.UserJid):void");
    }

    public AnonymousClass6J5 A0L(ViewGroup viewGroup, int i) {
        AnonymousClass6J5 A0L2;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 2) {
            UserJid userJid = this.A07;
            C56972sr r8 = this.A03;
            C111095hX r7 = this.A02;
            C64773Ex r9 = this.A0E;
            AnonymousClass5ZU r11 = this.A0G;
            return new C90564hj(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), r7, r8, r9, this.A0F, r11, userJid);
        } else if (i2 == 5) {
            Activity activity = this.A07;
            UserJid userJid2 = this.A07;
            C56972sr r72 = this.A03;
            C620733j r15 = this.A0I;
            return AnonymousClass5A3.A00(activity, viewGroup2, r72, new C146957Cg(897462978), this.A05, this, this, this.A0C, (C181878nU) null, this.A0D, r15, userJid2);
        } else if (i2 == 7) {
            return new C90554hi(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A02, this, this, this.A07);
        } else if (i2 == 10) {
            return new C132436fJ(AnonymousClass001.A0R(LayoutInflater.from(viewGroup2.getContext()), viewGroup2, R.layout.f8nameremoved));
        } else {
            switch (i) {
                case 14:
                    C181838nQ r2 = (C181838nQ) this.A07;
                    View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved);
                    C989453v.A00(A0R, r2, 19);
                    r2.setPostcodeAndLocationViews(A0R);
                    return new C132466fN(A0R);
                case 15:
                    C111095hX r73 = this.A02;
                    UserJid userJid3 = this.A07;
                    return new C90544hh(r73, this.A05, (CategoryMediaCard) AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A0B, userJid3);
                case 16:
                    return new C132456fM(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A0B);
                default:
                    C162457s7.A0J(viewGroup2, 0);
                    if (i2 == 1) {
                        UserJid userJid4 = this.A07;
                        A0L2 = new AnonymousClass6fK(this.A02, this.A03, (CatalogHeader) C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false), userJid4);
                    } else {
                        A0L2 = super.A0L(viewGroup2, i2);
                    }
                    C162457s7.A0H(A0L2);
                    return A0L2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        if (r0.A01 != false) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(com.whatsapp.jid.UserJid r13) {
        /*
            r12 = this;
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.util.List r5 = r12.A00
            r5.clear()
            android.app.Activity r6 = r12.A07
            int r1 = X.C86604Kt.A02(r6)
            r0 = 1
            if (r1 != r0) goto L_0x0015
            r12.A0Q()
        L_0x0015:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x004f
            X.7Qo r3 = r12.A0A
            X.33p r7 = r12.A0H
            com.whatsapp.jid.UserJid r2 = r12.A07
            java.lang.String r0 = r2.getRawString()
            java.lang.String r1 = r7.A0c(r0)
            java.lang.String r0 = r12.A02
            java.lang.String r4 = r3.A00(r1, r0)
            java.lang.String r3 = r2.getRawString()
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "dc_location_name_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.String r0 = X.C18280x3.A0Z(r2, r0)
            if (r4 == 0) goto L_0x00ee
            if (r0 == 0) goto L_0x00ee
            X.6fF r1 = new X.6fF
            r1.<init>(r4, r0)
        L_0x004c:
            r5.add(r1)
        L_0x004f:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0065
            X.6fA r0 = new X.6fA
            r0.<init>()
            r5.add(r0)
            java.util.List r1 = r12.A03
            X.6fD r0 = new X.6fD
            r0.<init>(r1)
            r5.add(r0)
        L_0x0065:
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0104
            X.5Uu r9 = r12.A09
            java.util.List r0 = r9.A0A(r13)
            java.util.Iterator r11 = r0.iterator()
            r10 = 0
            r3 = 0
        L_0x0075:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r2 = r11.next()
            X.2gz r2 = (X.C49722gz) r2
            X.2gP r0 = r2.A00
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0075
            java.util.List r4 = r2.A04
            java.util.Iterator r1 = r4.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0075
            X.5dw r0 = X.C86664Kz.A12(r1)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.lang.String r7 = r2.A03
            java.lang.String r3 = r2.A02
            X.2gP r2 = r2.A00
            int r1 = r2.A00
            X.6fI r0 = new X.6fI
            r0.<init>(r7, r10, r3)
            r8.add(r0)
            r0 = 2
            if (r1 != r0) goto L_0x00bc
            X.6fG r0 = new X.6fG
            r0.<init>(r2, r7)
            r8.add(r0)
        L_0x00bc:
            java.util.Iterator r10 = r4.iterator()
            r4 = 0
        L_0x00c1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e8
            X.5dw r3 = X.C86664Kz.A12(r10)
            r0 = 3
            if (r4 == r0) goto L_0x00e8
            X.C162457s7.A0H(r3)
            boolean r0 = r12.A0V(r3)
            if (r0 == 0) goto L_0x00c1
            long r0 = r12.A0K(r3)
            X.6fH r2 = new X.6fH
            r2.<init>(r3, r0)
            r2.A02 = r7
            r8.add(r2)
            int r4 = r4 + 1
            goto L_0x00c1
        L_0x00e8:
            r5.addAll(r8)
            r10 = 1
            r3 = 1
            goto L_0x0075
        L_0x00ee:
            java.lang.String r2 = r12.A01
            if (r2 == 0) goto L_0x004f
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131892698(0x7f1219da, float:1.9420152E38)
            java.lang.String r0 = r1.getString(r0)
            X.6fF r1 = new X.6fF
            r1.<init>(r2, r0)
            goto L_0x004c
        L_0x0104:
            r3 = 0
        L_0x0105:
            X.5Uu r0 = r12.A09
            java.util.List r4 = r0.A0B(r13)
            if (r4 == 0) goto L_0x0150
            if (r3 != 0) goto L_0x0113
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0125
        L_0x0113:
            r3 = 1
            java.lang.String r2 = "catalog_products_all_items_collection_id"
            r0 = 2131887813(0x7f1206c5, float:1.9410244E38)
            java.lang.String r1 = r6.getString(r0)
            X.6fI r0 = new X.6fI
            r0.<init>(r2, r3, r1)
            r5.add(r0)
        L_0x0125:
            java.util.Iterator r4 = r4.iterator()
        L_0x0129:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0150
            X.5dw r3 = X.C86664Kz.A12(r4)
            boolean r0 = r12.A0V(r3)
            if (r0 == 0) goto L_0x0129
            long r1 = r12.A0K(r3)
            X.6fH r0 = new X.6fH
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0129
        L_0x0146:
            X.7Gs r0 = r9.A03(r13)
            if (r0 == 0) goto L_0x0105
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0105
        L_0x0150:
            int r1 = r12.A0P()
            r0 = -1
            if (r1 != r0) goto L_0x0166
            X.6fE r0 = new X.6fE
            r0.<init>()
            r5.add(r0)
            int r0 = X.AnonymousClass002.A03(r5)
            r12.A07(r0)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90264gz.A0U(com.whatsapp.jid.UserJid):void");
    }

    public AnonymousClass7KJ B5f(int i) {
        int i2 = 0;
        String str = null;
        if (i < 0) {
            return null;
        }
        boolean z = false;
        int i3 = -1;
        int i4 = -1;
        while (true) {
            C147037Co r1 = (C147037Co) this.A00.get(i2);
            if (r1 instanceof AnonymousClass6fI) {
                i3++;
                str = ((AnonymousClass6fI) r1).A02;
                z = true;
                i4 = -1;
            }
            if (r1 instanceof C132426fH) {
                if (!z) {
                    return null;
                }
                i4++;
            }
            if (i2 != i) {
                i2++;
            } else if (!z) {
                return null;
            } else {
                if ("catalog_products_all_items_collection_id".equals(str)) {
                    return new AnonymousClass7KJ((String) null, String.valueOf(i4), (String) null);
                }
                return new AnonymousClass7KJ(String.valueOf(i3), String.valueOf(i4), str);
            }
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C05570Ua A0L2;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 2) {
            UserJid userJid = this.A07;
            C56972sr r8 = this.A03;
            C111095hX r7 = this.A02;
            C64773Ex r9 = this.A0E;
            AnonymousClass5ZU r11 = this.A0G;
            return new C90564hj(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), r7, r8, r9, this.A0F, r11, userJid);
        } else if (i2 == 5) {
            Activity activity = this.A07;
            UserJid userJid2 = this.A07;
            C56972sr r72 = this.A03;
            C620733j r15 = this.A0I;
            return AnonymousClass5A3.A00(activity, viewGroup2, r72, new C146957Cg(897462978), this.A05, this, this, this.A0C, (C181878nU) null, this.A0D, r15, userJid2);
        } else if (i2 == 7) {
            return new C90554hi(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A02, this, this, this.A07);
        } else if (i2 == 10) {
            return new C132436fJ(AnonymousClass001.A0R(LayoutInflater.from(viewGroup2.getContext()), viewGroup2, R.layout.f8nameremoved));
        } else {
            switch (i) {
                case 14:
                    C181838nQ r2 = (C181838nQ) this.A07;
                    View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved);
                    C989453v.A00(A0R, r2, 19);
                    r2.setPostcodeAndLocationViews(A0R);
                    return new C132466fN(A0R);
                case 15:
                    C111095hX r73 = this.A02;
                    UserJid userJid3 = this.A07;
                    return new C90544hh(r73, this.A05, (CategoryMediaCard) AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A0B, userJid3);
                case 16:
                    return new C132456fM(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A0B);
                default:
                    C162457s7.A0J(viewGroup2, 0);
                    if (i2 == 1) {
                        UserJid userJid4 = this.A07;
                        A0L2 = new AnonymousClass6fK(this.A02, this.A03, (CatalogHeader) C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false), userJid4);
                    } else {
                        A0L2 = super.A0L(viewGroup2, i2);
                    }
                    C162457s7.A0H(A0L2);
                    return A0L2;
            }
        }
    }

    public final int A0P() {
        List list = this.A00;
        if (list.size() <= 0 || !(C18300x5.A0c(list) instanceof C132406fE)) {
            return -1;
        }
        return AnonymousClass002.A03(list);
    }

    public final void A0Q() {
        List list = this.A00;
        if (list.size() <= 0 || !(C18290x4.A0k(list) instanceof C132376fB)) {
            list.add(0, new C132376fB());
            A07(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r0 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r4 = this;
            X.5Y9 r2 = r4.A04
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0038
            r4.A0M()
        L_0x000d:
            int r1 = r4.A0P()
            r0 = -1
            if (r1 == r0) goto L_0x0058
            java.util.List r0 = r4.A00
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.FooterDisplayItem"
            X.C162457s7.A0K(r3, r0)
            X.6fE r3 = (X.C132406fE) r3
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x004f
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x004f
            X.5Uu r2 = r4.A09
            com.whatsapp.jid.UserJid r1 = r4.A07
            X.C162457s7.A0C(r1)
            boolean r0 = r2.A0J(r1)
            if (r0 != 0) goto L_0x0055
            monitor-enter(r2)
            goto L_0x003c
        L_0x0038:
            r4.A0N()
            goto L_0x000d
        L_0x003c:
            X.7OX r0 = X.C105405Uu.A00(r2, r1)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0045
            monitor-exit(r2)
            r0 = 0
            goto L_0x0052
        L_0x0045:
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x004c }
            boolean r0 = X.C18310x6.A1X(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0051
        L_0x004c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x004f:
            r1 = 5
            goto L_0x0056
        L_0x0051:
            monitor-exit(r2)
        L_0x0052:
            r1 = 3
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            r3.A00 = r1
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90264gz.A0R():void");
    }

    public final void A0S(int i) {
        int i2;
        if (i == 404) {
            UserJid userJid = this.A07;
            C162457s7.A0C(userJid);
            A0U(userJid);
            A05();
        }
        AnonymousClass5Y9 r1 = this.A04;
        if (r1.A02 || r1.A01) {
            A0N();
        } else {
            A0M();
        }
        int A0P = A0P();
        if (A0P != -1) {
            Object obj = this.A00.get(A0P);
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.FooterDisplayItem");
            C132406fE r3 = (C132406fE) obj;
            if (i != -1) {
                i2 = 1;
                if (i != 404) {
                    if (i != 406) {
                        C18260x0.A0z("business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ", AnonymousClass001.A0o(), i);
                        i2 = 2;
                    } else {
                        Activity activity = this.A07;
                        C56972sr r32 = this.A03;
                        AnonymousClass5WY r5 = this.A08;
                        C53202mi r6 = this.A0K;
                        WeakReference weakReference = C1441670h.A00;
                        if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                            r32.A0P();
                            Me me = r32.A00;
                            C19340zH A002 = AnonymousClass5V0.A00(activity);
                            A002.A0T(R.string.f11nameremoved);
                            A002.A0i(true);
                            A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                            A002.A0X(new C1236569g(r5, r6, activity, me, 0), R.string.f11nameremoved);
                            AnonymousClass043 create = A002.create();
                            C1441670h.A00 = AnonymousClass0x9.A14(create);
                            create.show();
                        }
                        A06(A0P);
                    }
                }
            } else {
                i2 = 4;
            }
            r3.A00 = i2;
            A06(A0P);
        }
    }

    public void A0T(C109015dw r11) {
        List list = this.A00;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C147037Co r2 = (C147037Co) list.get(i);
            if (r2 instanceof C132426fH) {
                C132426fH r22 = (C132426fH) r2;
                if (C162457s7.A0P(r22.A01.A0F, r11.A0F)) {
                    r22.A01 = r11;
                    r22.A00 = A0K(r11);
                    A06(i);
                    z = false;
                }
            }
        }
        if (!A0V(r11)) {
            if (!z) {
                HashSet A15 = AnonymousClass0x9.A15(AnonymousClass002.A0J(C18290x4.A13(r11.A0F)));
                list.size();
                int A032 = AnonymousClass002.A03(list);
                if (A032 >= 0) {
                    while (true) {
                        int i2 = A032 - 1;
                        C147037Co r1 = (C147037Co) list.get(A032);
                        if (r1 instanceof C132426fH) {
                            C109015dw r0 = ((C132426fH) r1).A01;
                            C162457s7.A0C(r0);
                            if (A15.contains(r0.A0F)) {
                                list.remove(A032);
                                A08(A032);
                            }
                        }
                        if (i2 >= 0) {
                            A032 = i2;
                        } else {
                            return;
                        }
                    }
                }
            }
        } else if (z) {
            int size2 = list.size();
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            for (int i4 = 0; i4 < size2; i4++) {
                C147037Co r7 = (C147037Co) list.get(i4);
                C18280x3.A12(r7);
                int i5 = r7.A00;
                if (!(i5 == 16 || i5 == 15 || i5 == 1 || i5 == 14)) {
                    if (!(r7 instanceof AnonymousClass6fI)) {
                        if (!(r7 instanceof C132426fH)) {
                            if (!(r7 instanceof AnonymousClass6fG)) {
                                break;
                            }
                        } else if (C107575bX.A0F(((C132426fH) r7).A02)) {
                            break;
                        }
                    } else {
                        if ("catalog_products_all_items_collection_id".equals(((AnonymousClass6fI) r7).A02)) {
                            z3 = true;
                        }
                        i3++;
                        z2 = true;
                    }
                }
                i3++;
            }
            if ((!z2 || z3) && i3 != -1) {
                list.add(i3, new C132426fH(r11, A0K(r11)));
                A07(i3);
            }
        }
    }

    public long A0B(int i) {
        String str;
        StringBuilder sb;
        String str2;
        switch (getItemViewType(i)) {
            case 1:
                return -2;
            case 2:
                return -3;
            case 3:
                return -4;
            case 4:
                return -5;
            case 5:
                Object obj = this.A00.get(i);
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.ProductDisplayItem");
                C132426fH r2 = (C132426fH) obj;
                str = AnonymousClass000.A0X(r2.A01.A0F, AnonymousClass000.A0l("product_"));
                String str3 = r2.A02;
                if (str3 != null) {
                    str = AnonymousClass000.A0V("_in_collection_", str3, AnonymousClass000.A0l(str));
                    break;
                }
                break;
            case 6:
                return -6;
            case 7:
                Object obj2 = this.A00.get(i);
                C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionHeaderDisplayItem");
                sb = AnonymousClass001.A0o();
                sb.append("collection_");
                str2 = ((AnonymousClass6fI) obj2).A02;
                break;
            case 8:
                Object obj3 = this.A00.get(i);
                C162457s7.A0K(obj3, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionReviewStatusBannerDisplayItem");
                sb = AnonymousClass001.A0o();
                sb.append("collection_review_status_banner");
                str2 = ((AnonymousClass6fG) obj3).A01;
                break;
            case 9:
                return -7;
            case 10:
                return -8;
            case 11:
                return -10;
            case 12:
                C162457s7.A0K(this.A00.get(i), "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.OrderCatalogPickerDisplayItem");
                throw AnonymousClass001.A0g("orderProduct");
            case 13:
                return -9;
            case 14:
                return -11;
            case 15:
                return -12;
            case 16:
                return -13;
            default:
                return 0;
        }
        str = AnonymousClass000.A0X(str2, sb);
        Map map = this.A0L;
        if (!map.containsKey(str)) {
            long j = this.A00;
            this.A00 = 1 + j;
            map.put(str, Long.valueOf(j));
        }
        return C18310x6.A0B(C57692u3.A02(map, str));
    }

    public boolean A0V(C109015dw r3) {
        if (!r3.A01()) {
            return false;
        }
        Integer num = this.A0B.A01;
        if (num == null || num.intValue() != 404) {
            return true;
        }
        return false;
    }
}
