package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.5ic  reason: invalid class name and case insensitive filesystem */
public class C111745ic implements AnonymousClass4CM {
    public C95814uZ A00;
    public final int A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final C621033m A07;
    public final AnonymousClass3DP A08;
    public final C620433g A09;
    public final C44272Vj A0A;
    public final C56942so A0B;
    public final AnonymousClass67D A0C;
    public final C64773Ex A0D;
    public final C64223Cq A0E;
    public final C54122oD A0F;
    public final C104275Qi A0G;
    public final AnonymousClass5XH A0H;
    public final C56612sH A0I;
    public final AnonymousClass33p A0J;
    public final C56982ss A0K;
    public final C56892sj A0L;
    public final AnonymousClass3LP A0M;
    public final C66493Lq A0N;
    public final C53202mi A0O;
    public final C50452iC A0P;
    public final C619933b A0Q;
    public final AnonymousClass1R1 A0R;
    public final C105055Tk A0S;
    public final C106165Xw A0T;
    public final C187958y5 A0U;
    public final AnonymousClass4FS A0V;
    public final WeakReference A0W;
    public final WeakReference A0X;

    public void A00() {
        UserJid A072;
        if (this.A00 != null) {
            this.A0E.A08();
            AnonymousClass3ZH A0A2 = this.A0D.A0A(this.A00);
            if (A0A2.A0R() && (A072 = AnonymousClass3ZH.A07(A0A2)) != null) {
                this.A09.A08(this, A072, (String) null);
            }
            this.A0S.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r2 == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.Menu r11, X.C95814uZ r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            java.lang.ref.WeakReference r0 = r10.A0W
            android.content.Context r1 = X.C86664Kz.A0U(r0)
            if (r1 == 0) goto L_0x0028
            r10.A00 = r12
            X.3Ex r0 = r10.A0D
            X.3ZH r4 = r0.A0A(r12)
            boolean r0 = r12 instanceof X.C28001fK
            r3 = 0
            if (r0 == 0) goto L_0x0029
            X.3Lq r0 = r10.A0N
            java.util.Set r0 = r0.A1G
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L_0x0028
            r2 = 2131431414(0x7f0b0ff6, float:1.8484557E38)
            r1 = 2131888537(0x7f120999, float:1.9411712E38)
        L_0x0025:
            r11.add(r3, r2, r3, r1)
        L_0x0028:
            return
        L_0x0029:
            boolean r5 = r12 instanceof X.AnonymousClass1fS
            if (r5 != 0) goto L_0x0036
            r2 = 2131431413(0x7f0b0ff5, float:1.8484555E38)
            r0 = 2131886366(0x7f12011e, float:1.9407309E38)
            r11.add(r3, r2, r3, r0)
        L_0x0036:
            X.2k5 r0 = r4.A0F
            if (r0 != 0) goto L_0x00d2
            boolean r0 = X.C627336j.A0K(r12)
            if (r0 == 0) goto L_0x00a1
            r4 = 2131431415(0x7f0b0ff7, float:1.8484559E38)
            X.4uZ r2 = r10.A00
            X.1fJ r0 = X.AnonymousClass34R.A01(r2)
            if (r0 == 0) goto L_0x0063
            X.2so r0 = r10.A0B
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.2ss r0 = r0.A06
            int r2 = r0.A06(r2)
            r0 = 3
            if (r2 != r0) goto L_0x0063
            X.2Vj r0 = r10.A0A
            boolean r2 = r0.A00()
            r0 = 2131886432(0x7f120160, float:1.9407443E38)
            if (r2 != 0) goto L_0x0066
        L_0x0063:
            r0 = 2131889890(0x7f120ee2, float:1.9414456E38)
        L_0x0066:
            r11.add(r3, r4, r3, r0)
        L_0x0069:
            boolean r0 = X.C627336j.A0K(r12)
            if (r0 == 0) goto L_0x00d9
            X.1fJ r2 = X.AnonymousClass34R.A02(r12)
            X.3Lq r0 = r10.A0N
            boolean r0 = r0.A0i(r2)
            if (r0 == 0) goto L_0x008f
            X.2sj r0 = r10.A0L
            boolean r0 = r0.A0C(r2)
            r2 = 2131888537(0x7f120999, float:1.9411712E38)
            if (r0 == 0) goto L_0x0089
            r2 = 2131889207(0x7f120c37, float:1.9413071E38)
        L_0x0089:
            r0 = 2131431414(0x7f0b0ff6, float:1.8484557E38)
            r11.add(r3, r0, r3, r2)
        L_0x008f:
            X.5rC r2 = r10.A03
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x010e
            r2.A04()
            java.lang.String r0 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00a1:
            if (r5 == 0) goto L_0x00aa
            r4 = 2131431415(0x7f0b0ff7, float:1.8484559E38)
            r0 = 2131890488(0x7f121138, float:1.941567E38)
            goto L_0x0066
        L_0x00aa:
            X.2sr r0 = r10.A06
            boolean r0 = X.C86664Kz.A1W(r0)
            if (r0 == 0) goto L_0x0069
            X.3LP r0 = r10.A0M
            boolean r0 = X.C57362tW.A00(r0, r12)
            if (r0 != 0) goto L_0x0069
            X.2mi r0 = r10.A0O
            boolean r0 = r0.A02(r12)
            if (r0 != 0) goto L_0x0069
            r2 = 2131431407(0x7f0b0fef, float:1.8484542E38)
            r0 = 2131886335(0x7f1200ff, float:1.9407246E38)
            r11.add(r3, r2, r3, r0)
            r4 = 2131431408(0x7f0b0ff0, float:1.8484544E38)
            r0 = 2131886345(0x7f120109, float:1.9407266E38)
            goto L_0x0066
        L_0x00d2:
            r4 = 2131431412(0x7f0b0ff4, float:1.8484552E38)
            r0 = 2131895053(0x7f12230d, float:1.9424928E38)
            goto L_0x0066
        L_0x00d9:
            r2 = 2131431414(0x7f0b0ff6, float:1.8484557E38)
            if (r5 == 0) goto L_0x00f6
            r0 = 2131888544(0x7f1209a0, float:1.9411726E38)
            r11.add(r3, r2, r3, r0)
            X.5rC r2 = r10.A03
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x010e
            r2.A04()
            java.lang.String r0 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00f6:
            r0 = 2131888524(0x7f12098c, float:1.9411686E38)
            r11.add(r3, r2, r3, r0)
            X.5rC r2 = r10.A03
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x010e
            r2.A04()
            java.lang.String r0 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x010e:
            X.2ss r4 = r10.A0K
            boolean r0 = r4.A0M(r12)
            if (r0 == 0) goto L_0x01aa
            r2 = 2131431426(0x7f0b1002, float:1.848458E38)
            r0 = 2131894558(0x7f12211e, float:1.9423924E38)
            if (r5 == 0) goto L_0x0121
            r0 = 2131894556(0x7f12211c, float:1.942392E38)
        L_0x0121:
            java.lang.String r0 = r1.getString(r0)
            r11.add(r3, r2, r3, r0)
        L_0x0128:
            if (r14 == 0) goto L_0x014f
            X.33p r7 = r10.A0J
            boolean r2 = X.C622334f.A01(r7, r4, r12)
            X.1R1 r0 = r10.A0R
            X.2sa r0 = X.AnonymousClass1R1.A00(r12, r0)
            long r8 = r0.A00()
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0184
            if (r2 != 0) goto L_0x0184
            r1 = 2131431421(0x7f0b0ffd, float:1.848457E38)
            r0 = 2131890686(0x7f1211fe, float:1.941607E38)
            r11.add(r3, r1, r3, r0)
        L_0x014f:
            boolean r0 = r4.A0M(r12)
            if (r0 != 0) goto L_0x0170
            if (r13 == 0) goto L_0x0170
            X.1R1 r0 = r10.A0R
            X.2sa r0 = X.AnonymousClass1R1.A00(r12, r0)
            boolean r2 = r0.A0H
            r1 = 2131431424(0x7f0b1000, float:1.8484577E38)
            r0 = 2131890691(0x7f121203, float:1.941608E38)
            if (r2 == 0) goto L_0x016d
            r1 = 2131431431(0x7f0b1007, float:1.848459E38)
            r0 = 2131890704(0x7f121210, float:1.9416107E38)
        L_0x016d:
            r11.add(r3, r1, r3, r0)
        L_0x0170:
            int r0 = r4.A03(r12)
            r2 = 2131431419(0x7f0b0ffb, float:1.8484567E38)
            r1 = 2131890615(0x7f1211b7, float:1.9415927E38)
            if (r0 == 0) goto L_0x0025
            r2 = 2131431418(0x7f0b0ffa, float:1.8484565E38)
            r1 = 2131890614(0x7f1211b6, float:1.9415925E38)
            goto L_0x0025
        L_0x0184:
            r0 = 2131890703(0x7f12120f, float:1.9416105E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r2 = X.AnonymousClass4L0.A0A(r0)
            boolean r0 = X.C622334f.A01(r7, r4, r12)
            if (r0 == 0) goto L_0x01a3
            r0 = 2131101327(0x7f06068f, float:1.781506E38)
            android.text.style.ForegroundColorSpan r1 = X.C86634Kw.A0I(r1, r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r3)
        L_0x01a3:
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            r11.add(r3, r0, r3, r2)
            goto L_0x014f
        L_0x01aa:
            if (r5 == 0) goto L_0x01b4
            r2 = 2131431409(0x7f0b0ff1, float:1.8484546E38)
            r0 = 2131886448(0x7f120170, float:1.9407475E38)
            goto L_0x0121
        L_0x01b4:
            boolean r0 = r4.A0L(r12)
            if (r0 == 0) goto L_0x0128
            r2 = 2131431409(0x7f0b0ff1, float:1.8484546E38)
            r0 = 2131886449(0x7f120171, float:1.9407477E38)
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111745ic.A01(android.view.Menu, X.4uZ, boolean, boolean):void");
    }

    public boolean A02(MenuItem menuItem, C08310eF r15, C003203q r16) {
        AnonymousClass4FS r3;
        Runnable runnable;
        Intent A0g;
        C08270df r4 = (C08270df) this.A0X.get();
        if (!(r4 == null || this.A00 == null)) {
            C003203q r7 = r16;
            if (menuItem.getItemId() == R.id.menuitem_conversations_contact_info) {
                AnonymousClass3ZH A0A2 = this.A0D.A0A(this.A00);
                if (A0A2.A0F != null) {
                    r7.startActivity(C86664Kz.A1B().A1K(r7, A0A2));
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_delete) {
                AnonymousClass5XH r0 = this.A0H;
                C95814uZ r32 = this.A00;
                r0.A0A.A01(r32, new C116275q1(r4, r0, r32));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_new_contact) {
                AnonymousClass3ZH A0A3 = this.A0D.A0A(this.A00);
                C106165Xw r42 = this.A0T;
                if (C106165Xw.A01(r42)) {
                    r42.A06(r7.getSupportFragmentManager(), A0A3, this.A00);
                    r7.getSupportFragmentManager().A0j(new C107455bL(r7, 1, this), r7, "request_bottom_sheet_fragment");
                } else {
                    Intent A022 = r42.A02(A0A3, this.A00, true);
                    C626936e.A06(r7);
                    A022.setComponent(A022.resolveActivity(r7.getPackageManager()));
                    if (A022.getComponent() != null) {
                        r15.startActivityForResult(A022, this.A01);
                    } else {
                        Log.w("conversations/context system contact list could not found");
                        this.A05.A0H(R.string.f11nameremoved, 0);
                        return true;
                    }
                }
                this.A0S.A03(true, 7);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_to_existing_contact) {
                try {
                    r15.startActivityForResult(this.A0T.A02(this.A0D.A0A(this.A00), this.A00, false), this.A01);
                    this.A0S.A03(false, 7);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    this.A05.A0H(R.string.f11nameremoved, 0);
                    return true;
                }
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_pin) {
                C104275Qi r5 = this.A0G;
                C95814uZ r43 = this.A00;
                C162457s7.A0J(r43, 0);
                Set A0R2 = r5.A05.A0R();
                if (A0R2.size() >= 3) {
                    r5.A00(A0R2);
                    return true;
                }
                C117155rT.A00(r5.A06, r5, r43, 22);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unpin) {
                C104275Qi r44 = this.A0G;
                C95814uZ r2 = this.A00;
                C162457s7.A0J(r2, 0);
                C117155rT.A00(r44.A06, r44, r2, 21);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mute) {
                C57402ta.A01(AnonymousClass21R.CHAT_LIST_SCREEN, Collections.singleton(this.A00)).A1O(r4, (String) null);
                return true;
            } else {
                if (menuItem.getItemId() == R.id.menuitem_conversations_unmute) {
                    C95814uZ r33 = this.A00;
                    if (C622334f.A01(this.A0J, this.A0K, r33)) {
                        C622334f.A00(r7, r7.findViewById(R.id.result_list), this.A07, this.A00, 0, r7.getString(R.string.f11nameremoved));
                        return true;
                    }
                    r3 = this.A0V;
                    runnable = C117625sE.A00(this, 43);
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_archive) {
                    AnonymousClass5XH r52 = this.A0H;
                    C95814uZ r45 = this.A00;
                    r52.A06.A06(r45, 0, true);
                    r3 = r52.A0B;
                    runnable = new C70333aK(r52, r45, 0, 41);
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_unarchive) {
                    AnonymousClass5XH r02 = this.A0H;
                    r02.A06.A06(this.A00, 0, false);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_read) {
                    this.A0F.A00(this.A00, 1, true, true);
                    this.A0Q.A07();
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_unread) {
                    this.A0F.A02(this.A00, true);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_create_shortcuit) {
                    this.A08.A05(this.A0D.A0A(this.A00));
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_group_info) {
                    AnonymousClass3ZH A0A4 = this.A0D.A0A(this.A00);
                    if (A0A4.A0H instanceof AnonymousClass1fS) {
                        C626936e.A06(r7);
                        A0g = C627736r.A0f(r7, A0A4.A0H, true);
                    } else {
                        C95814uZ r1 = this.A00;
                        if (AnonymousClass34R.A01(r1) != null) {
                            C56942so r46 = this.A0B;
                            if (r46.A06.A06((GroupJid) r1) == 3 && this.A0A.A00()) {
                                C27991fJ A012 = r46.A01((C27991fJ) this.A00);
                                if (A012 == null || !this.A0C.Bg9(r7, r7.findViewById(R.id.result_list), A012)) {
                                    return false;
                                }
                                return true;
                            }
                        }
                        A0g = C627736r.A0g(r7, A0A4.A0H, true, false, true);
                        AnonymousClass5VI.A00(A0g, C18310x6.A0n(r7));
                    }
                    AnonymousClass0RN.A00(r7, A0g, (Bundle) null);
                    return true;
                } else {
                    C116985rC r12 = this.A03;
                    if (r12.A07()) {
                        menuItem.getItemId();
                        r12.A04();
                        throw AnonymousClass001.A0g("getMenuItemLabelId");
                    }
                }
                r3.BkM(runnable);
                return true;
            }
        }
        return false;
    }

    public void BU1() {
    }

    public void BU2() {
    }

    public C111745ic(Context context, C08270df r3, C116985rC r4, C116985rC r5, C116985rC r6, C69263Wi r7, C56972sr r8, C621033m r9, AnonymousClass3DP r10, C620433g r11, C44272Vj r12, C56942so r13, AnonymousClass67D r14, C64773Ex r15, C64223Cq r16, C54122oD r17, C104275Qi r18, AnonymousClass5XH r19, C56612sH r20, AnonymousClass33p r21, C56982ss r22, C56892sj r23, AnonymousClass3LP r24, C66493Lq r25, C53202mi r26, C50452iC r27, C619933b r28, AnonymousClass1R1 r29, C105055Tk r30, C106165Xw r31, C187958y5 r32, AnonymousClass4FS r33, int i) {
        this.A0W = AnonymousClass0x9.A14(context);
        this.A0X = AnonymousClass0x9.A14(r3);
        this.A0I = r20;
        this.A03 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A0V = r33;
        this.A0K = r22;
        this.A04 = r5;
        this.A07 = r9;
        this.A0M = r24;
        this.A0D = r15;
        this.A0U = r32;
        this.A0P = r27;
        this.A0N = r25;
        this.A02 = r6;
        this.A0S = r30;
        this.A0R = r29;
        this.A08 = r10;
        this.A0T = r31;
        this.A0E = r16;
        this.A0Q = r28;
        this.A0J = r21;
        this.A0B = r13;
        this.A0G = r18;
        this.A09 = r11;
        this.A0A = r12;
        this.A0F = r17;
        this.A0C = r14;
        this.A0L = r23;
        this.A0H = r19;
        this.A0O = r26;
        this.A01 = i;
    }
}
