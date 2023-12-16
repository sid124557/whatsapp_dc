package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.5g7  reason: invalid class name and case insensitive filesystem */
public class C110365g7 implements C16910uE {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public MenuItem A0F;
    public MenuItem A0G;
    public MenuItem A0H;
    public MenuItem A0I;
    public MenuItem A0J;
    public MenuItem A0K;
    public MenuItem A0L;
    public final C104135Pu A0M = new C104135Pu();
    public final /* synthetic */ ConversationsFragment A0N;

    public C110365g7(ConversationsFragment conversationsFragment) {
        this.A0N = conversationsFragment;
    }

    public final void A00(boolean z) {
        String str;
        ConversationsFragment conversationsFragment = this.A0N;
        C95814uZ A1O = conversationsFragment.A1O();
        conversationsFragment.A2M = A1O;
        UserJid A032 = AnonymousClass32Y.A03(A1O);
        conversationsFragment.A1b(2);
        if (A032 != null) {
            if (z) {
                str = "chat_list_block";
            } else {
                str = "chat_list_noinsub_block";
            }
            boolean contains = conversationsFragment.A0w.A0d.contains(A032);
            C64773Ex r1 = conversationsFragment.A19;
            if (contains) {
                AnonymousClass3ZH A0A2 = r1.A0A(A032);
                conversationsFragment.A0w.A0F(conversationsFragment.A0R(), A0A2, str, false);
                return;
            }
            AnonymousClass3ZH A0A3 = r1.A0A(A032);
            C003203q A0R = conversationsFragment.A0R();
            if (A0A3.A0R()) {
                A0R.startActivity(C627736r.A0m(A0R, A032, str, false, false, true, false, false));
                return;
            }
            C103835Op Azw = conversationsFragment.A0x.Azw(A032, str);
            Azw.A04 = true;
            Azw.A05 = false;
            UserJid userJid = Azw.A07;
            boolean z2 = Azw.A02;
            int i = Azw.A01;
            BlockConfirmationDialogFragment.A00(userJid, Azw.A08, Azw.A00, i, z2, Azw.A03, true, false).A1O(conversationsFragment.A0T(), (String) null);
        }
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r16) {
        RecyclerView recyclerView;
        if ((menu instanceof C07890cz) && C106545Zk.A00(this.A0N.A24)) {
            ((C07890cz) menu).A0H = true;
        }
        ConversationsFragment conversationsFragment = this.A0N;
        if (AnonymousClass5N3.A00(conversationsFragment) && (recyclerView = conversationsFragment.A0L) != null) {
            recyclerView.setAlpha(0.5f);
        }
        C104135Pu r1 = this.A0M;
        r1.A00.clear();
        this.A08 = menu.add(0, R.id.menuitem_conversations_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0D = menu.add(0, R.id.menuitem_conversations_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A02 = menu.add(0, R.id.menuitem_conversations_block_non_trusted, 0, (CharSequence) null).setIcon(C107335b8.A04(conversationsFragment.A0G(), R.drawable.ic_spam_block, R.color.f5nameremoved));
        this.A0I = menu.add(0, R.id.menuitem_conversations_unblock_non_trusted, 0, (CharSequence) null).setIcon(C107335b8.A04(conversationsFragment.A0G(), R.drawable.ic_spam_block, R.color.f5nameremoved));
        this.A05 = menu.add(0, R.id.menuitem_conversations_delete, 0, (CharSequence) null).setIcon(R.drawable.ic_action_delete);
        this.A07 = menu.add(0, R.id.menuitem_conversations_mute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_mute);
        this.A0C = menu.add(0, R.id.menuitem_conversations_unmute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unmute);
        MenuItem add = menu.add(0, R.id.menuitem_conversations_archive, 0, (CharSequence) null);
        this.A04 = add;
        boolean isVisible = add.isVisible();
        MenuItem menuItem = this.A04;
        if (isVisible) {
            menuItem.setIcon(C107335b8.A04(conversationsFragment.A0G(), R.drawable.ic_action_archive, R.color.f5nameremoved));
        } else {
            menuItem.setIcon(R.drawable.ic_action_archive);
        }
        MenuItem add2 = menu.add(0, R.id.menuitem_conversations_unarchive, 0, (CharSequence) null);
        this.A0B = add2;
        boolean isVisible2 = add2.isVisible();
        MenuItem menuItem2 = this.A0B;
        if (isVisible2) {
            menuItem2.setIcon(C107335b8.A04(conversationsFragment.A0G(), R.drawable.ic_action_unarchive, R.color.f5nameremoved));
        } else {
            menuItem2.setIcon(R.drawable.ic_action_unarchive);
        }
        this.A09 = menu.add(0, R.id.menuitem_conversations_overflow_menu_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0E = menu.add(0, R.id.menuitem_conversations_overflow_menu_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A06 = menu.add(0, R.id.menuitem_conversations_leave, 0, (CharSequence) null).setIcon(R.drawable.ic_exit_group);
        this.A01 = menu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_spam_add);
        this.A0L = menu.add(0, R.id.menuitem_conversations_contact_info, 0, R.string.f11nameremoved).setIcon(R.drawable.vec_ic_settings_contacts);
        this.A00 = menu.add(0, R.id.menuitem_conversations_add_new_contact, 0, R.string.f11nameremoved).setIcon(R.drawable.vec_ic_settings_contacts);
        this.A0A = menu.add(0, R.id.menuitem_conversations_mark_read, 0, R.string.f11nameremoved).setIcon(R.drawable.vec_ic_read);
        this.A0F = menu.add(0, R.id.menuitem_conversations_mark_unread, 0, R.string.f11nameremoved).setIcon(R.drawable.smart_filter_unread);
        this.A0H = menu.add(0, R.id.menuitem_conversations_select_all, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_select_all);
        this.A0K = menu.add(0, R.id.menuitem_conversations_unlock, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_chat_unlock_outline);
        this.A0G = menu.add(0, R.id.menuitem_conversations_lock, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_chat_lock_outline);
        this.A03 = menu.add(0, R.id.menuitem_conversations_block, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_spam_block);
        this.A0J = menu.add(0, R.id.menuitem_conversations_unblock, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_spam_block);
        this.A08.setShowAsAction(2);
        this.A0D.setShowAsAction(2);
        this.A04.setShowAsAction(2);
        this.A0B.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A07.setShowAsAction(2);
        this.A0C.setShowAsAction(2);
        this.A02.setShowAsAction(2);
        this.A0I.setShowAsAction(2);
        this.A09.setShowAsAction(8);
        this.A0E.setShowAsAction(8);
        this.A06.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0L.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A0A.setShowAsAction(8);
        this.A0F.setShowAsAction(8);
        this.A0H.setShowAsAction(8);
        this.A0K.setShowAsAction(8);
        this.A0G.setShowAsAction(8);
        this.A03.setShowAsAction(8);
        this.A0J.setShowAsAction(8);
        Set set = r1.A01;
        C86654Ky.A1R(set, R.id.menuitem_conversations_overflow_menu_pin);
        C86654Ky.A1R(set, R.id.menuitem_conversations_overflow_menu_unpin);
        C86654Ky.A1R(set, R.id.menuitem_conversations_leave);
        C86654Ky.A1R(set, R.id.menuitem_conversations_create_shortcuit);
        C86654Ky.A1R(set, R.id.menuitem_conversations_contact_info);
        C86654Ky.A1R(set, R.id.menuitem_conversations_add_new_contact);
        C86654Ky.A1R(set, R.id.menuitem_conversations_mark_read);
        C86654Ky.A1R(set, R.id.menuitem_conversations_mark_unread);
        C86654Ky.A1R(set, R.id.menuitem_conversations_select_all);
        C86654Ky.A1R(set, R.id.menuitem_conversations_unlock);
        C86654Ky.A1R(set, R.id.menuitem_conversations_lock);
        C86654Ky.A1R(set, R.id.menuitem_conversations_block);
        C86654Ky.A1R(set, R.id.menuitem_conversations_unblock);
        return true;
    }

    public void BQw(AnonymousClass0R2 r4) {
        RecyclerView recyclerView;
        ConversationsFragment conversationsFragment = this.A0N;
        conversationsFragment.A1a(2);
        conversationsFragment.A0J = null;
        AnonymousClass4PW r0 = conversationsFragment.A1N;
        if (r0 != null) {
            r0.setEnableState(true);
        }
        AnonymousClass4PW r02 = conversationsFragment.A1M;
        if (r02 != null) {
            r02.setEnableState(true);
        }
        if (AnonymousClass5N3.A00(conversationsFragment) && (recyclerView = conversationsFragment.A0L) != null) {
            recyclerView.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0341, code lost:
        if (X.C18280x3.A1W(X.AnonymousClass0x2.A0F(r4), "notify_new_message_for_archived_chats") != false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0357, code lost:
        if (r19 != false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03b3, code lost:
        if (X.C86644Kx.A1Z(r6.A24) == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c9, code lost:
        if (((X.C1229766o) r6.A2y.get()).BH2(r5) != false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03cf, code lost:
        if (r8 == false) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e5, code lost:
        if (r0 != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03eb, code lost:
        if (r8 != false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03f1, code lost:
        if (r24 == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r3 != 1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c6, code lost:
        if (X.C86624Kv.A0O(r6).A0J == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d4, code lost:
        if (r1 == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01db, code lost:
        if (r1 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BYg(android.view.Menu r28, X.AnonymousClass0R2 r29) {
        /*
            r27 = this;
            r7 = r27
            com.whatsapp.conversationslist.ConversationsFragment r6 = r7.A0N
            boolean r0 = r6.A16()
            r5 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "conversations/actionmode/fragment is not attached to activity."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r5
        L_0x0011:
            java.util.LinkedHashSet r0 = r6.A33
            r4 = 1
            r8 = r29
            if (r0 == 0) goto L_0x049b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x049b
            X.4PW r0 = r6.A1N
            if (r0 == 0) goto L_0x0025
            r0.setEnableState(r5)
        L_0x0025:
            X.4PW r0 = r6.A1M
            if (r0 == 0) goto L_0x002c
            r0.setEnableState(r5)
        L_0x002c:
            java.util.LinkedHashSet r0 = r6.A33
            int r3 = r0.size()
            boolean r0 = r6.A3B
            if (r0 == 0) goto L_0x0497
            X.2sr r0 = r6.A0j
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x0497
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x0497
            java.util.LinkedHashSet r0 = r6.A33
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0497
            r26 = 0
            r25 = 0
            if (r3 == r4) goto L_0x0052
        L_0x0050:
            r25 = 1
        L_0x0052:
            X.33j r0 = r6.A1l
            java.util.Locale r2 = X.C620733j.A02(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r1, r3, r5)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r8.A0B(r0)
            android.view.MenuItem r1 = r7.A04
            if (r3 != r4) goto L_0x0450
            r0 = 2131887090(0x7f1203f2, float:1.9408777E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0B
            r0 = 2131887098(0x7f1203fa, float:1.9408793E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A05
            r0 = 2131887092(0x7f1203f4, float:1.9408781E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A06
            r0 = 2131887094(0x7f1203f6, float:1.9408785E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r7.A08
            r2 = 2131887096(0x7f1203f8, float:1.940879E38)
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0D
            r1 = 2131887100(0x7f1203fc, float:1.9408798E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r7.A09
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0E
            r0.setTitle(r1)
            android.view.MenuItem r1 = r7.A0K
            r0 = 2131887664(0x7f120630, float:1.9409941E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0G
            r0 = 2131887663(0x7f12062f, float:1.940994E38)
        L_0x00af:
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A07
            r0 = 2131890686(0x7f1211fe, float:1.941607E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0C
            r0 = 2131890703(0x7f12120f, float:1.9416105E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A02
            r0 = 2131886811(0x7f1202db, float:1.9408211E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0I
            r0 = 2131894576(0x7f122130, float:1.942396E38)
            r1.setTitle(r0)
            java.util.List r0 = r6.A1Q()
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x00dd
            r5 = 1
        L_0x00dd:
            r0 = 64
            boolean r3 = X.C86624Kv.A1W(r3, r0)
            java.util.LinkedHashSet r0 = r6.A33
            int r0 = r0.size()
            boolean r24 = X.AnonymousClass000.A1U(r0, r4)
            java.util.LinkedHashSet r0 = r6.A33
            int r0 = r0.size()
            boolean r2 = X.AnonymousClass000.A1U(r0, r4)
            java.util.LinkedHashSet r1 = r6.A33
            int r0 = r1.size()
            r10 = 0
            if (r0 != r4) goto L_0x0125
            X.2sr r0 = r6.A0j
            boolean r0 = X.C86664Kz.A1W(r0)
            if (r0 == 0) goto L_0x0125
            java.util.Iterator r0 = r1.iterator()
            X.4uZ r1 = X.C18300x5.A0P(r0)
            boolean r0 = X.C627336j.A0L(r1)
            if (r0 != 0) goto L_0x0125
            X.8qC r0 = r6.A2y
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            boolean r0 = r0.BH2(r1)
            if (r0 != 0) goto L_0x0125
            r10 = 1
        L_0x0125:
            java.util.LinkedHashSet r0 = r6.A33
            java.util.Iterator r23 = r0.iterator()
            r11 = 1
            r22 = 0
            r21 = 0
            r20 = 0
            r9 = 0
            r8 = 0
            r19 = 0
            r18 = 0
            r12 = 1
            r17 = 1
            r14 = 1
        L_0x013c:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0232
            X.4uZ r4 = X.C18300x5.A0P(r23)
            X.3Ex r0 = r6.A19
            X.3ZH r1 = r0.A0A(r4)
            X.314 r0 = r6.A1K
            boolean r13 = r0.A0D(r4)
            boolean r0 = r4 instanceof X.C28001fK
            if (r0 == 0) goto L_0x0162
            r3 = 1
            r24 = 0
            r2 = 0
            r10 = 0
            r21 = 1
            r19 = 1
            r18 = 1
            r12 = 0
        L_0x0162:
            X.2k5 r0 = r1.A0F
            if (r0 != 0) goto L_0x0442
            X.4uZ r0 = r1.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x03f8
            android.view.MenuItem r1 = r7.A0L
            r0 = 2131890488(0x7f121138, float:1.941567E38)
            r1.setTitle(r0)
            android.view.MenuItem r12 = r7.A0L
            android.content.Context r10 = r6.A1D()
            r1 = 2131232672(0x7f0807a0, float:1.808146E38)
            X.1VX r0 = r6.A24
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r10, r1, r0)
            r12.setIcon(r0)
            r24 = 0
            r10 = 0
        L_0x018d:
            r12 = 0
        L_0x018e:
            X.3LP r0 = r6.A25
            boolean r0 = X.C57362tW.A00(r0, r4)
            if (r0 != 0) goto L_0x019e
            X.2mi r0 = r6.A2G
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x019f
        L_0x019e:
            r10 = 0
        L_0x019f:
            X.2ss r0 = r6.A1o
            boolean r0 = r0.A0N(r4)
            r22 = r22 | r0
            X.2ss r0 = r6.A1o
            boolean r0 = r0.A0M(r4)
            r0 = r0 ^ 1
            r21 = r21 | r0
            X.5aW r0 = X.C86624Kv.A0O(r6)
            X.1VX r1 = r0.A04
            r0 = 5337(0x14d9, float:7.479E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01c8
            X.5aW r0 = X.C86624Kv.A0O(r6)
            boolean r0 = r0.A0J
            r1 = 1
            if (r0 != 0) goto L_0x01c9
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            X.2ss r0 = r6.A1o
            boolean r0 = r0.A0P(r4)
            r20 = r20 | r0
            if (r20 == 0) goto L_0x01d6
            r0 = 1
            if (r1 != 0) goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            r9 = r9 | r0
            if (r20 != 0) goto L_0x01dd
            r0 = 1
            if (r1 != 0) goto L_0x01de
        L_0x01dd:
            r0 = 0
        L_0x01de:
            r8 = r8 | r0
            boolean r0 = r6.A3B
            if (r0 == 0) goto L_0x01eb
            X.2sr r0 = r6.A0j
            boolean r0 = r0.A0a(r4)
            if (r0 != 0) goto L_0x0201
        L_0x01eb:
            X.1R1 r0 = r6.A2g
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            long r15 = r0.A00()
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r0 = r0 ^ 1
            r19 = r19 | r0
        L_0x0201:
            X.1R1 r0 = r6.A2g
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            boolean r0 = r0.A0H
            r0 = r0 ^ 1
            r18 = r18 | r0
            X.2ss r0 = r6.A1o
            int r0 = r0.A03(r4)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r0 = r0 ^ 1
            r3 = r3 | r0
            if (r11 != 0) goto L_0x03f5
            if (r12 != 0) goto L_0x03f5
            if (r24 != 0) goto L_0x03f5
            if (r2 != 0) goto L_0x03f5
            if (r10 != 0) goto L_0x03f5
            if (r17 != 0) goto L_0x03f5
            if (r18 == 0) goto L_0x03f5
            if (r19 == 0) goto L_0x03f5
            if (r3 == 0) goto L_0x03f5
            if (r21 == 0) goto L_0x03f5
            r24 = 0
            r12 = 0
            r14 = 0
        L_0x0232:
            r0 = r21 ^ 1
            if (r20 == 0) goto L_0x03f0
            r21 = 0
        L_0x0238:
            r1 = 0
        L_0x0239:
            boolean r13 = X.AnonymousClass000.A1S(r21)
            boolean r4 = X.AnonymousClass000.A1S(r0)
            if (r22 == 0) goto L_0x0244
            r12 = 0
        L_0x0244:
            android.view.MenuItem r0 = r7.A05
            r0.setVisible(r11)
            android.view.MenuItem r0 = r7.A06
            r0.setVisible(r12)
            android.view.MenuItem r0 = r7.A0H
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A04
            r0.setVisible(r13)
            android.view.MenuItem r0 = r7.A0B
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0K
            r0.setVisible(r9)
            android.view.MenuItem r0 = r7.A0G
            r0.setVisible(r8)
            X.4uZ r0 = r6.A1O()
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r0)
            if (r5 == 0) goto L_0x028b
            X.1VX r4 = r6.A24
            r0 = 2290(0x8f2, float:3.209E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x028b
            X.3Ex r0 = r6.A19
            X.3ZH r0 = r0.A0A(r5)
            X.2qS r0 = r0.A0E
            if (r0 == 0) goto L_0x0396
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0396
        L_0x028b:
            r5 = 0
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x028f:
            android.view.MenuItem r0 = r7.A03
            r0.setVisible(r11)
            android.view.MenuItem r0 = r7.A0J
            r0.setVisible(r12)
            android.view.MenuItem r0 = r7.A02
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0I
            r0.setVisible(r9)
            if (r18 == 0) goto L_0x038c
            boolean r0 = r6 instanceof com.whatsapp.conversationslist.FolderConversationsFragment
            if (r0 != 0) goto L_0x038c
            r8 = 1
        L_0x02aa:
            r4 = 0
        L_0x02ab:
            if (r5 != 0) goto L_0x0375
            if (r9 != 0) goto L_0x0375
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r8)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A09
            r5 = 0
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0E
            r0.setVisible(r5)
        L_0x02c4:
            if (r14 == 0) goto L_0x0316
            android.view.MenuItem r0 = r7.A07
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0F
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A04
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0B
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A09
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0E
        L_0x02f5:
            r0.setVisible(r5)
        L_0x02f8:
            android.view.MenuItem r0 = r7.A01
            r0.setVisible(r1)
            android.view.MenuItem r0 = r7.A0L
            r0.setVisible(r2)
            android.view.MenuItem r0 = r7.A00
            r0.setVisible(r10)
            X.5Pu r2 = r7.A0M
            X.03q r1 = r6.A0Q()
            X.1VX r0 = r6.A24
            r3 = r28
            r2.A00(r1, r3, r0)
            r0 = 1
            return r0
        L_0x0316:
            if (r17 == 0) goto L_0x032a
            android.view.MenuItem r0 = r7.A07
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0F
            goto L_0x02f5
        L_0x032a:
            boolean r0 = r6 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 == 0) goto L_0x0373
            X.33p r4 = r6.A1k
            boolean r0 = r4.A28()
            if (r0 == 0) goto L_0x0343
            android.content.SharedPreferences r4 = X.AnonymousClass0x2.A0F(r4)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r4 = X.C18280x3.A1W(r4, r0)
            r0 = 1
            if (r4 == 0) goto L_0x0344
        L_0x0343:
            r0 = 0
        L_0x0344:
            r4 = r0 ^ 1
        L_0x0346:
            android.view.MenuItem r0 = r7.A07
            if (r4 == 0) goto L_0x036a
            if (r26 == 0) goto L_0x034f
            if (r19 == 0) goto L_0x034f
            r5 = 1
        L_0x034f:
            r0.setVisible(r5)
            android.view.MenuItem r4 = r7.A0C
            if (r25 == 0) goto L_0x0359
            r0 = 1
            if (r19 == 0) goto L_0x035a
        L_0x0359:
            r0 = 0
        L_0x035a:
            r4.setVisible(r0)
        L_0x035d:
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r3)
            android.view.MenuItem r4 = r7.A0F
            r0 = r3 ^ 1
            r4.setVisible(r0)
            goto L_0x02f8
        L_0x036a:
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r5)
            goto L_0x035d
        L_0x0373:
            r4 = 1
            goto L_0x0346
        L_0x0375:
            r5 = 0
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A09
            r0.setVisible(r8)
            android.view.MenuItem r0 = r7.A0E
            r0.setVisible(r4)
            goto L_0x02c4
        L_0x038c:
            r8 = 0
            if (r18 != 0) goto L_0x02aa
            boolean r0 = r6 instanceof com.whatsapp.conversationslist.FolderConversationsFragment
            if (r0 != 0) goto L_0x02aa
            r4 = 1
            goto L_0x02ab
        L_0x0396:
            X.2sq r0 = r6.A0w
            java.util.Set r0 = r0.A0d
            boolean r9 = r0.contains(r5)
            X.2sD r0 = r6.A2k
            boolean r8 = r0.A09(r5)
            X.2sr r0 = r6.A0j
            boolean r0 = r0.A0a(r5)
            if (r0 == 0) goto L_0x03b5
            X.1VX r0 = r6.A24
            boolean r0 = X.C86644Kx.A1Z(r0)
            r4 = 1
            if (r0 != 0) goto L_0x03b6
        L_0x03b5:
            r4 = 0
        L_0x03b6:
            if (r9 != 0) goto L_0x03cb
            if (r8 == 0) goto L_0x03cb
            if (r4 != 0) goto L_0x03cb
            X.8qC r0 = r6.A2y
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            boolean r0 = r0.BH2(r5)
            r11 = 1
            if (r0 == 0) goto L_0x03d1
        L_0x03cb:
            r11 = 0
            if (r9 == 0) goto L_0x03d1
            r12 = 1
            if (r8 != 0) goto L_0x03e7
        L_0x03d1:
            r12 = 0
            if (r9 != 0) goto L_0x03e7
            if (r8 != 0) goto L_0x03e7
            if (r4 != 0) goto L_0x03e7
            X.8qC r0 = r6.A2y
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            boolean r0 = r0.BH2(r5)
            r5 = 1
            if (r0 == 0) goto L_0x03ed
        L_0x03e7:
            r5 = 0
            if (r9 == 0) goto L_0x03ed
            r9 = 1
            if (r8 == 0) goto L_0x028f
        L_0x03ed:
            r9 = 0
            goto L_0x028f
        L_0x03f0:
            r1 = 1
            if (r24 != 0) goto L_0x0239
            goto L_0x0238
        L_0x03f5:
            r14 = 0
            goto L_0x013c
        L_0x03f8:
            boolean r0 = r1.A0U()
            if (r0 == 0) goto L_0x0440
            android.view.MenuItem r1 = r7.A0L
            r0 = 2131889890(0x7f120ee2, float:1.9414456E38)
            r1.setTitle(r0)
            android.view.MenuItem r13 = r7.A0L
            android.content.Context r10 = r6.A1D()
            r1 = 2131232672(0x7f0807a0, float:1.808146E38)
            X.1VX r0 = r6.A24
            boolean r0 = X.C106545Zk.A03(r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A05(r10, r1, r0)
            r13.setIcon(r0)
            X.3Lq r1 = r6.A27
            X.1fJ r0 = X.AnonymousClass34R.A01(r4)
            boolean r0 = r1.A0i(r0)
            if (r0 != 0) goto L_0x042f
            r11 = 0
        L_0x0429:
            r12 = 0
        L_0x042a:
            r10 = 0
            r17 = 0
            goto L_0x018e
        L_0x042f:
            X.2sj r1 = r6.A1t
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A01(r4)
            X.C626936e.A06(r0)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0429
            r11 = 0
            goto L_0x042a
        L_0x0440:
            r2 = 0
            goto L_0x044c
        L_0x0442:
            android.view.MenuItem r1 = r7.A0L
            r0 = 2131895053(0x7f12230d, float:1.9424928E38)
            r1.setTitle(r0)
            r11 = r11 & r13
            r10 = 0
        L_0x044c:
            r17 = 0
            goto L_0x018d
        L_0x0450:
            r0 = 2131887089(0x7f1203f1, float:1.9408775E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0B
            r0 = 2131887097(0x7f1203f9, float:1.9408791E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A05
            r0 = 2131887091(0x7f1203f3, float:1.940878E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A06
            r0 = 2131887093(0x7f1203f5, float:1.9408783E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r7.A08
            r2 = 2131887095(0x7f1203f7, float:1.9408787E38)
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0D
            r1 = 2131887099(0x7f1203fb, float:1.9408796E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r7.A09
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0E
            r0.setTitle(r1)
            android.view.MenuItem r1 = r7.A0K
            r0 = 2131887662(0x7f12062e, float:1.9409937E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0G
            r0 = 2131887661(0x7f12062d, float:1.9409935E38)
            goto L_0x00af
        L_0x0497:
            r26 = 1
            goto L_0x0050
        L_0x049b:
            X.4PW r0 = r6.A1N
            if (r0 == 0) goto L_0x04a2
            r0.setEnableState(r4)
        L_0x04a2:
            X.4PW r0 = r6.A1M
            if (r0 == 0) goto L_0x04a9
            r0.setEnableState(r4)
        L_0x04a9:
            r8.A05()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110365g7.BYg(android.view.Menu, X.0R2):boolean");
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r17) {
        AnonymousClass4FS r3;
        Runnable r0;
        AbstractCollection linkedHashSet;
        int i;
        String str;
        C95814uZ r5;
        AnonymousClass5AS r32;
        AnonymousClass5AS r2;
        Object tag;
        DialogFragment A002;
        C08270df A0T;
        Intent A0g;
        Collection collection;
        int itemId = menuItem.getItemId();
        ConversationsFragment conversationsFragment = this.A0N;
        C46342bT r33 = conversationsFragment.A11;
        int i2 = 5;
        if (conversationsFragment.A33.size() == 1) {
            i2 = 1;
        }
        r33.A01 = i2;
        if (itemId == R.id.menuitem_conversations_archive) {
            linkedHashSet = AnonymousClass002.A0J(conversationsFragment.A33);
            conversationsFragment.A1b(0);
            if (!linkedHashSet.isEmpty()) {
                r3 = conversationsFragment.A2u;
                i = 28;
            }
            return true;
        }
        if (itemId == R.id.menuitem_conversations_unarchive) {
            ArrayList A0J2 = AnonymousClass002.A0J(conversationsFragment.A33);
            conversationsFragment.A1b(0);
            ListView listView = conversationsFragment.A0E;
            if (listView != null) {
                listView.post(new C117155rT(this, 27, A0J2));
            }
            if (conversationsFragment.A1k.A28()) {
                conversationsFragment.A1h(AnonymousClass0x2.A0Y(C08310eF.A09(conversationsFragment), A0J2.size(), 0, R.plurals.f9nameremoved), C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), new C109475eg(this, 46, A0J2));
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_delete) {
            C95814uZ A1O = conversationsFragment.A1O();
            conversationsFragment.A2M = A1O;
            if (A1O != null) {
                AnonymousClass5XH r22 = conversationsFragment.A1X;
                r22.A0A.A01(A1O, new C116275q1(conversationsFragment.A0I, r22, A1O));
                return true;
            }
            C08270df r1 = conversationsFragment.A0I;
            if (!(r1 == null || conversationsFragment.A33.size() == 0)) {
                C116265q0 r6 = new C116265q0(r1, this);
                C104355Qq r4 = conversationsFragment.A2p;
                C993555k r12 = new C993555k(r4.A03, (AnonymousClass66M) r6, (Set) conversationsFragment.A33);
                C18270x1.A0w(r12, r4.A08);
                r4.A00.A0T(new C71573cK(r12, 45, r6), 500);
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_leave) {
            C08270df r62 = conversationsFragment.A0I;
            if (r62 != null) {
                ProgressDialogFragment A003 = ProgressDialogFragment.A00(R.string.f11nameremoved, R.string.f11nameremoved);
                A003.A1O(r62, "count_progress");
                LinkedHashSet linkedHashSet2 = conversationsFragment.A33;
                C162457s7.A0J(linkedHashSet2, 0);
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C27991fJ) {
                        A0s.add(next);
                    }
                }
                Set A0P = C73723fy.A0P(A0s);
                AnonymousClass4FS r13 = conversationsFragment.A2u;
                C55562qY r10 = conversationsFragment.A1z;
                r13.BkL(new C991754s(new C110415gC(r62, A003, A0P), conversationsFragment, conversationsFragment.A13, r10, A0P), new Object[0]);
                return true;
            }
        } else {
            if (itemId == R.id.menuitem_conversations_mute) {
                C95814uZ A1O2 = conversationsFragment.A1O();
                conversationsFragment.A2M = A1O2;
                str = null;
                if (A1O2 != null) {
                    collection = Collections.singleton(A1O2);
                } else {
                    collection = conversationsFragment.A33;
                }
                A002 = C57402ta.A01(AnonymousClass21R.CHAT_LIST_SCREEN, collection);
                A0T = conversationsFragment.A0U();
            } else if (itemId == R.id.menuitem_conversations_unmute) {
                linkedHashSet = new LinkedHashSet(conversationsFragment.A33);
                conversationsFragment.A1b(1);
                r3 = conversationsFragment.A2u;
                i = 29;
            } else if (itemId == R.id.menuitem_conversations_block_non_trusted || itemId == R.id.menuitem_conversations_unblock_non_trusted) {
                A00(false);
                return true;
            } else if (itemId == R.id.menuitem_conversations_block || itemId == R.id.menuitem_conversations_unblock) {
                A00(true);
                return true;
            } else if (itemId == R.id.menuitem_conversations_pin || itemId == R.id.menuitem_conversations_overflow_menu_pin) {
                HashSet A15 = AnonymousClass0x9.A15(conversationsFragment.A33);
                Set A0R = conversationsFragment.A2g.A0R();
                A15.removeAll(A0R);
                int size = A15.size();
                if (A0R.size() + size > 3) {
                    conversationsFragment.A1U.A00(A0R);
                    return true;
                }
                conversationsFragment.A1b(1);
                r3 = conversationsFragment.A2u;
                r0 = new C71733ca((Object) A15, (Object) this, size, 34);
                r3.BkM(r0);
            } else if (itemId == R.id.menuitem_conversations_unpin || itemId == R.id.menuitem_conversations_overflow_menu_unpin) {
                linkedHashSet = new LinkedHashSet(conversationsFragment.A33);
                conversationsFragment.A1b(1);
                r3 = conversationsFragment.A2u;
                i = 30;
            } else if (itemId == R.id.menuitem_conversations_create_shortcuit) {
                C95814uZ A1O3 = conversationsFragment.A1O();
                conversationsFragment.A2M = A1O3;
                if (A1O3 != null) {
                    conversationsFragment.A0n.A05(conversationsFragment.A19.A0A(A1O3));
                }
                conversationsFragment.A1b(2);
                return true;
            } else {
                str = null;
                if (itemId == R.id.menuitem_conversations_contact_info) {
                    C95814uZ A1O4 = conversationsFragment.A1O();
                    conversationsFragment.A2M = A1O4;
                    if (A1O4 != null) {
                        AnonymousClass3ZH A0A2 = conversationsFragment.A19.A0A(A1O4);
                        conversationsFragment.A1b(2);
                        if (A0A2.A0F != null) {
                            C003203q A0R2 = conversationsFragment.A0R();
                            A0R2.startActivity(C627736r.A0l(A0R2, C86604Kt.A0d(A0A2), 12, true, true));
                            return true;
                        }
                        boolean z = A0A2.A0H instanceof AnonymousClass1fS;
                        C003203q A0R3 = conversationsFragment.A0R();
                        C95814uZ r02 = A0A2.A0H;
                        if (z) {
                            A0g = C627736r.A0f(A0R3, r02, true);
                        } else {
                            A0g = C627736r.A0g(A0R3, r02, true, false, true);
                            AnonymousClass5VI.A00(A0g, C18310x6.A0n(A0R3));
                        }
                        AnonymousClass0RN.A00(A0R3, A0g, (Bundle) null);
                        return true;
                    }
                } else if (itemId == R.id.menuitem_conversations_add_new_contact) {
                    C95814uZ A1O5 = conversationsFragment.A1O();
                    conversationsFragment.A2M = A1O5;
                    if (A1O5 != null) {
                        AnonymousClass3ZH A0A3 = conversationsFragment.A19.A0A(A1O5);
                        A002 = CreateOrAddToContactsDialog.A00(A0A3, C56972sr.A08(conversationsFragment.A0j, A0A3));
                        A0T = conversationsFragment.A0T();
                    }
                } else {
                    if (itemId == R.id.menuitem_conversations_mark_read) {
                        Iterator it2 = conversationsFragment.A33.iterator();
                        while (it2.hasNext()) {
                            C95814uZ A0P2 = C18300x5.A0P(it2);
                            if (!(A0P2 instanceof C28001fK)) {
                                conversationsFragment.A1J.A01(A0P2, 3, true, true, true);
                                conversationsFragment.A2R.A07();
                            }
                        }
                    } else if (itemId == R.id.menuitem_conversations_mark_unread) {
                        Iterator it3 = conversationsFragment.A33.iterator();
                        while (it3.hasNext()) {
                            C95814uZ A0P3 = C18300x5.A0P(it3);
                            if (!(A0P3 instanceof AnonymousClass1fS) && !(A0P3 instanceof C28001fK)) {
                                conversationsFragment.A1J.A02(A0P3, true);
                            }
                        }
                    } else if (itemId == R.id.menuitem_conversations_select_all) {
                        conversationsFragment.A35.clear();
                        if (conversationsFragment.A0E != null) {
                            for (int i3 = 0; i3 < conversationsFragment.A0E.getChildCount(); i3++) {
                                View childAt = conversationsFragment.A0E.getChildAt(i3);
                                if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof ViewHolder))) {
                                    ViewHolder viewHolder = (ViewHolder) tag;
                                    C95814uZ B8o = viewHolder.A01.B8o();
                                    if (!conversationsFragment.A33.contains(B8o)) {
                                        conversationsFragment.A33.add(B8o);
                                        View view = viewHolder.A06;
                                        view.setBackgroundResource(AnonymousClass5Yj.A05(view));
                                        viewHolder.A0F(true, true);
                                    }
                                }
                            }
                        }
                        for (AnonymousClass659 B8o2 : conversationsFragment.A1Q()) {
                            C95814uZ B8o3 = B8o2.B8o();
                            if (!conversationsFragment.A33.contains(B8o3) && !(B8o3 instanceof C28001fK)) {
                                conversationsFragment.A33.add(B8o3);
                            }
                        }
                        if (conversationsFragment.A0J != null) {
                            int size2 = conversationsFragment.A33.size();
                            AnonymousClass0R2 r34 = conversationsFragment.A0J;
                            Locale A022 = C620733j.A02(conversationsFragment.A1l);
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1P(objArr, size2, 0);
                            r34.A0B(String.format(A022, "%d", objArr));
                            conversationsFragment.A0J.A06();
                        }
                        if (!conversationsFragment.A33.isEmpty()) {
                            C003203q A0R4 = conversationsFragment.A0R();
                            C620633i r52 = conversationsFragment.A1g;
                            Resources A092 = C08310eF.A09(conversationsFragment);
                            int size3 = conversationsFragment.A33.size();
                            Object[] objArr2 = new Object[1];
                            AnonymousClass000.A1P(objArr2, conversationsFragment.A33.size(), 0);
                            C107295b4.A00(A0R4, r52, A092.getQuantityString(R.plurals.f9nameremoved, size3, objArr2));
                            return true;
                        }
                    } else if (itemId == R.id.menuitem_conversations_unlock) {
                        conversationsFragment.A2M = conversationsFragment.A1O();
                        C86624Kv.A0O(conversationsFragment).A00 = true;
                        if (conversationsFragment.A0Q() instanceof C89644eZ) {
                            C106995aW A0O = C86624Kv.A0O(conversationsFragment);
                            C89644eZ r35 = (C89644eZ) conversationsFragment.A0Q();
                            C95814uZ r03 = conversationsFragment.A2M;
                            if (r03 != null) {
                                r2 = new C91544kL(r03);
                            } else {
                                r2 = new C91554kM(conversationsFragment.A33);
                            }
                            A0O.A08(r35, r2, conversationsFragment.A3J, 4);
                            return true;
                        }
                    } else if (itemId == R.id.menuitem_conversations_lock) {
                        conversationsFragment.A2M = conversationsFragment.A1O();
                        if (conversationsFragment.A0Q() instanceof C89644eZ) {
                            LinkedHashSet linkedHashSet3 = conversationsFragment.A33;
                            if (linkedHashSet3.iterator().hasNext()) {
                                r5 = C18300x5.A0P(linkedHashSet3.iterator());
                            } else {
                                r5 = null;
                            }
                            C106995aW A0O2 = C86624Kv.A0O(conversationsFragment);
                            C89644eZ r23 = (C89644eZ) conversationsFragment.A0Q();
                            C95814uZ r04 = conversationsFragment.A2M;
                            if (r04 != null) {
                                r32 = new C91564kN(r04);
                            } else {
                                r32 = new C91574kO(conversationsFragment.A33);
                            }
                            A0O2.A0A(r23, r32, conversationsFragment.A3K, r5, 1);
                            return true;
                        }
                    } else if (conversationsFragment.A0N.A07()) {
                        conversationsFragment.A0Z.A04();
                        throw AnonymousClass001.A0g("getMenuItemChatAssignmentId");
                    }
                    conversationsFragment.A1b(1);
                    return true;
                }
                return false;
            }
            A002.A1O(A0T, str);
            return true;
        }
        return true;
        r0 = new C117155rT(this, i, linkedHashSet);
        r3.BkM(r0);
        return true;
    }
}
