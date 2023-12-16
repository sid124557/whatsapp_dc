package X;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.community.LinkExistingGroups;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity;
import com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4eX  reason: invalid class name and case insensitive filesystem */
public abstract class C89634eX extends C89164br implements C1229166i, C182148nw {
    public MenuItem A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public BaseAdapter A03;
    public ListView A04;
    public AnonymousClass6Z3 A05;
    public C48852fa A06;
    public AnonymousClass64J A07;
    public C56962sq A08;
    public C29301ib A09;
    public C44772Xk A0A;
    public C64773Ex A0B;
    public C29421in A0C;
    public AnonymousClass5ZU A0D;
    public C105365Uq A0E;
    public C114015mM A0F;
    public C103845Oq A0G;
    public SelectedContactsList A0H;
    public C53802nh A0I;
    public AnonymousClass54L A0J;
    public C33481tC A0K;
    public AnonymousClass54Z A0L;
    public C53592nL A0M;
    public C620733j A0N;
    public C29241iV A0O;
    public C105055Tk A0P;
    public AnonymousClass2ML A0Q;
    public WDSSearchBar A0R;
    public String A0S;
    public ArrayList A0T;
    public List A0U = AnonymousClass001.A0s();
    public List A0V = AnonymousClass001.A0s();
    public List A0W = AnonymousClass001.A0s();
    public List A0X;
    public boolean A0Y = false;
    public boolean A0Z = true;
    public boolean A0a;
    public final C54232oO A0b = new C1233167y(this, 4);
    public final C56602sG A0c = AnonymousClass681.A00(this, 14);
    public final C183538qC A0d = C72333dY.A06(new C107625bc(this, 2));
    public final ArrayList A0e = AnonymousClass001.A0s();
    public final List A0f = AnonymousClass001.A0s();

    public static UnblockDialogFragment A0C(C89634eX r6, AnonymousClass3ZH r7, int i) {
        String string = r6.getString(i, new Object[]{r6.A0D.A0H(r7)});
        C56962sq r2 = r6.A08;
        Jid A0I2 = r7.A0I(UserJid.class);
        C626936e.A06(A0I2);
        return UnblockDialogFragment.A00(new C112135jF(r6, r2, (UserJid) A0I2), string, R.string.f11nameremoved, false);
    }

    private void A0L() {
        C33481tC r0 = this.A0K;
        if (r0 != null) {
            r0.A0D(true);
            this.A0K = null;
        }
        AnonymousClass54Z r02 = this.A0L;
        if (r02 != null) {
            r02.A0D(true);
            this.A0L = null;
        }
        C33481tC r1 = new C33481tC(this.A0D, this, this.A0M, this.A0T, this.A0U);
        this.A0K = r1;
        C18270x1.A0w(r1, this.A04);
    }

    public void A7M(View view, View view2, View view3, View view4) {
        view4.setVisibility(0);
        C86624Kv.A12(view, view2);
        view3.setVisibility(0);
    }

    public void A7X(List list) {
        this.A0K = null;
        if (this.A0a) {
            Bs7();
        }
        this.A0V.clear();
        AnonymousClass54Z r1 = new AnonymousClass54Z(this, list);
        this.A0L = r1;
        C18270x1.A0w(r1, this.A04);
    }

    public void A7Y(List list) {
        List list2;
        this.A0J = null;
        this.A0U = list;
        A0L();
        if (this.A0Z) {
            HashSet A0K2 = AnonymousClass002.A0K();
            List list3 = this.A0X;
            if (list3 != null && !list3.isEmpty()) {
                Iterator it = this.A0U.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
                    Class<C95814uZ> cls = C95814uZ.class;
                    if (this.A0X.contains(A0R2.A0I(cls))) {
                        A0R2.A0y = true;
                        if (!A0K2.contains(A0R2.A0I(cls))) {
                            List list4 = this.A0f;
                            list4.add(A0R2);
                            A0K2.add(A0R2.A0I(cls));
                            if (list4.size() >= A78()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            SelectedContactsList selectedContactsList = this.A0H;
            if (!(selectedContactsList == null || (list2 = this.A0X) == null || list2.isEmpty())) {
                selectedContactsList.A07.A05();
            }
            this.A0Z = false;
        }
        int size = this.A0f.size();
        A7K(size);
        A7J(size);
        MenuItem menuItem = this.A00;
        if (menuItem != null) {
            C86644Kx.A0u(menuItem, this.A0U);
        }
        SelectedContactsList selectedContactsList2 = this.A0H;
        if (selectedContactsList2 != null) {
            ListView listView = this.A04;
            ViewGroup viewGroup = this.A02;
            boolean z = this.A0a;
            selectedContactsList2.setVisibility(AnonymousClass0x9.A00(selectedContactsList2.A09.isEmpty() ? 1 : 0));
            if (!selectedContactsList2.A09.isEmpty()) {
                selectedContactsList2.A02(listView, viewGroup, z);
            }
        }
    }

    public void A7Z(List list) {
        this.A0L = null;
        ArrayList arrayList = this.A0e;
        arrayList.clear();
        arrayList.addAll(list);
        this.A03.notifyDataSetChanged();
        A0X();
    }

    public void B1w(ThumbnailButton thumbnailButton, AnonymousClass3ZH r4, boolean z) {
        C105365Uq r0 = this.A0E;
        if (r0 != null) {
            r0.A0A(thumbnailButton, r4, false);
        }
    }

    public void onBackPressed() {
        WDSSearchBar wDSSearchBar = this.A0R;
        if (wDSSearchBar == null || !C86604Kt.A1Y(wDSSearchBar.A07)) {
            A7G();
        } else {
            this.A0R.A02(true);
        }
    }

    public int A75() {
        List A042;
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity) || (this instanceof NotifyContactsSelector) || (this instanceof InviteNewsletterAdminSelector)) {
            return R.string.f11nameremoved;
        }
        if (this instanceof GroupMembersSelector) {
            Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
            if (bundleExtra == null || (A042 = C107395bF.A04(bundleExtra)) == null || A042.size() != 0) {
                return R.string.f11nameremoved;
            }
            return R.string.f11nameremoved;
        } else if ((this instanceof EditGroupAdminsSelector) || (this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector) || (this instanceof ContactsAttachmentSelector)) {
            return R.string.f11nameremoved;
        } else {
            if (this instanceof AddGroupParticipantsSelector) {
                if (C18270x1.A1V(((AddGroupParticipantsSelector) this).A0Q)) {
                    return R.string.f11nameremoved;
                }
                return R.string.f11nameremoved;
            } else if (this instanceof LinkExistingGroups) {
                return R.string.f11nameremoved;
            } else {
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                if (!(groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) && !groupCallParticipantPicker.A7i() && groupCallParticipantPicker.A7h()) {
                    return R.string.f11nameremoved;
                }
                return R.string.f11nameremoved;
            }
        }
    }

    public int A76() {
        if (this instanceof LinkExistingGroupActivity) {
            return R.string.f11nameremoved;
        }
        return 0;
    }

    public int A77() {
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity) || (this instanceof NotifyContactsSelector) || (this instanceof InviteNewsletterAdminSelector) || (this instanceof GroupMembersSelector) || (this instanceof EditGroupAdminsSelector) || (this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector) || (this instanceof ContactsAttachmentSelector)) {
            return R.plurals.f9nameremoved;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            if (C18270x1.A1V(((AddGroupParticipantsSelector) this).A0Q)) {
                return R.plurals.f9nameremoved;
            }
            return R.plurals.f9nameremoved;
        } else if (!(this instanceof LinkExistingGroups)) {
            return R.plurals.f9nameremoved;
        } else {
            LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
            if (linkExistingGroups.A02.A0F.A0N(1990) >= linkExistingGroups.A02.A0F.A0N(1238) || linkExistingGroups.A09 != null) {
                return R.plurals.f9nameremoved;
            }
            return R.plurals.f9nameremoved;
        }
    }

    public int A78() {
        C56892sj r1;
        if (this instanceof LinkExistingGroupActivity) {
            return 1;
        }
        if (this instanceof GroupMembersSelectorActivity) {
            r1 = ((GroupMembersSelectorActivity) this).A01;
            if (r1 == null) {
                throw C18270x1.A0S("groupParticipantsManager");
            }
        } else if (this instanceof NotifyContactsSelector) {
            return Integer.MAX_VALUE;
        } else {
            if (this instanceof InviteNewsletterAdminSelector) {
                InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this;
                int A0N2 = inviteNewsletterAdminSelector.A0D.A0N(6461) - ((List) C18300x5.A0d(inviteNewsletterAdminSelector.A08)).size();
                List list = inviteNewsletterAdminSelector.A06;
                int i = 0;
                if (list != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (Object next : list) {
                        if (((C102295Ih) next).A02 == C372821q.ADMIN) {
                            A0s.add(next);
                        }
                    }
                    i = A0s.size();
                }
                return A0N2 - i;
            } else if (this instanceof GroupMembersSelector) {
                r1 = ((GroupMembersSelector) this).A04;
            } else if (this instanceof EditGroupAdminsSelector) {
                EditGroupAdminsSelector editGroupAdminsSelector = (EditGroupAdminsSelector) this;
                int size = editGroupAdminsSelector.A0U.size();
                if (size != 0) {
                    return Math.min(editGroupAdminsSelector.A00.A02(AnonymousClass34R.A04(C86664Kz.A1J(editGroupAdminsSelector.getIntent(), "gid"))) - 1, size);
                }
                return Integer.MAX_VALUE;
            } else if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
                int A032 = this.A06.A03(C66663Mh.A15);
                if (A032 == 0) {
                    return Integer.MAX_VALUE;
                }
                return A032;
            } else if (this instanceof ContactsAttachmentSelector) {
                return 257;
            } else {
                if (this instanceof AddGroupParticipantsSelector) {
                    AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
                    C56892sj r12 = addGroupParticipantsSelector.A07;
                    if (r12 != null) {
                        return r12.A02((C27991fJ) addGroupParticipantsSelector.A0N.getValue()) - addGroupParticipantsSelector.A0I.size();
                    }
                    throw C18270x1.A0S("groupParticipantsManager");
                } else if (this instanceof LinkExistingGroups) {
                    return getIntent().getIntExtra("max_groups_allowed_to_link", Integer.MAX_VALUE);
                } else {
                    return this.A0D.A0N(862) - 1;
                }
            }
        }
        return r1.A02((C27991fJ) null) - 1;
    }

    public int A79() {
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity)) {
            return 1;
        }
        if (this instanceof NotifyContactsSelector) {
            return 0;
        }
        if ((this instanceof InviteNewsletterAdminSelector) || (this instanceof GroupMembersSelector)) {
            return 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return 0;
        }
        if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
            return 2;
        }
        if ((this instanceof ContactsAttachmentSelector) || (this instanceof AddGroupParticipantsSelector) || !(this instanceof LinkExistingGroups)) {
            return 1;
        }
        return 0;
    }

    public int A7A() {
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity) || (this instanceof NotifyContactsSelector) || (this instanceof InviteNewsletterAdminSelector) || (this instanceof GroupMembersSelector) || (this instanceof EditGroupAdminsSelector) || (this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector) || (this instanceof ContactsAttachmentSelector) || (this instanceof AddGroupParticipantsSelector) || (this instanceof LinkExistingGroups)) {
            return R.string.f11nameremoved;
        }
        return 0;
    }

    public Drawable A7B() {
        if (this instanceof LinkExistingGroupActivity) {
            return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
        }
        if (this instanceof GroupMembersSelectorActivity) {
            return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
        }
        if (!(this instanceof NotifyContactsSelector)) {
            if (this instanceof InviteNewsletterAdminSelector) {
                Drawable A002 = AnonymousClass0RP.A00(this, R.drawable.ic_fab_check);
                C162457s7.A0H(A002);
                return A002;
            } else if (this instanceof GroupMembersSelector) {
                return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
            } else {
                if (!(this instanceof EditGroupAdminsSelector) && !(this instanceof EditBroadcastRecipientsSelector) && !(this instanceof ListMembersSelector)) {
                    if (this instanceof ContactsAttachmentSelector) {
                        return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
                    }
                    if (!(this instanceof AddGroupParticipantsSelector)) {
                        if (this instanceof LinkExistingGroups) {
                            return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
                        }
                        return null;
                    }
                }
            }
        }
        return AnonymousClass0RP.A00(this, R.drawable.ic_fab_check);
    }

    public View A7C() {
        if (this instanceof LinkExistingGroupActivity) {
            View A0R2 = AnonymousClass001.A0R(getLayoutInflater(), this.A04, R.layout.f8nameremoved);
            C162457s7.A0D(A0R2);
            TextView A0I2 = AnonymousClass0x2.A0I(A0R2, R.id.link_existing_group_picker_title);
            C106905aM.A04(A0I2);
            A0I2.setText(R.string.f11nameremoved);
            View A0E2 = C18280x3.A0E(A0R2, R.id.add_groups_new_group);
            C18320x8.A14(A0E2, this, 29);
            C106905aM.A04(AnonymousClass0x2.A0I(A0E2, R.id.create_new_group_text));
            return A0R2;
        } else if (!(this instanceof GroupCallParticipantPicker)) {
            return null;
        } else {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            if (!(groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) && groupCallParticipantPicker.A7h()) {
                LinearLayout linearLayout = new LinearLayout(groupCallParticipantPicker);
                linearLayout.setOrientation(1);
                View A012 = C106465Zc.A01(groupCallParticipantPicker, groupCallParticipantPicker.A04, groupCallParticipantPicker.A05, (C29441ip) groupCallParticipantPicker.A05.get());
                FrameLayout A0K2 = C86654Ky.A0K(groupCallParticipantPicker, A012);
                AnonymousClass0YY.A06(A0K2, 2);
                List list = groupCallParticipantPicker.A0B;
                list.add(A012);
                linearLayout.addView(A0K2);
                if (!AnonymousClass4SG.A45(groupCallParticipantPicker)) {
                    ListView listView = groupCallParticipantPicker.A04;
                    AnonymousClass1VX r10 = groupCallParticipantPicker.A0D;
                    C69263Wi r9 = groupCallParticipantPicker.A05;
                    C105055Tk r11 = groupCallParticipantPicker.A0P;
                    C162457s7.A0J(listView, 1);
                    C162457s7.A0J(r10, 4);
                    C18260x0.A0T(r9, r11);
                    View A022 = C106465Zc.A02(groupCallParticipantPicker, listView, r9, r10, r11, (AnonymousClass4GP) null, 2, 4);
                    C620733j r1 = groupCallParticipantPicker.A0N;
                    C116985rC r0 = (C116985rC) groupCallParticipantPicker.A07.get();
                    C86614Ku.A1S(r1, 2, r0);
                    C106465Zc.A03(groupCallParticipantPicker, A022, r0, r1, (AnonymousClass4GP) null);
                    FrameLayout A0K3 = C86654Ky.A0K(groupCallParticipantPicker, A022);
                    AnonymousClass0YY.A06(A0K3, 2);
                    list.add(A022);
                    linearLayout.addView(A0K3);
                }
                if (((C105355Up) groupCallParticipantPicker.A04.get()).A04()) {
                    View A002 = C106465Zc.A00(groupCallParticipantPicker, groupCallParticipantPicker.A04, (C57012sv) groupCallParticipantPicker.A02.get(), groupCallParticipantPicker.A00, new AnonymousClass6C0(groupCallParticipantPicker, 3));
                    FrameLayout A0K4 = C86654Ky.A0K(groupCallParticipantPicker, A002);
                    AnonymousClass0YY.A06(A0K4, 2);
                    list.add(A002);
                    linearLayout.addView(A0K4);
                }
                if (linearLayout.getChildCount() == 0) {
                    return null;
                }
                return linearLayout;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r2 == 4) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A7D() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x004f
            r7 = r13
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r7 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r7
            android.view.LayoutInflater r2 = r7.getLayoutInflater()
            r1 = 2131626360(0x7f0e0978, float:1.8879954E38)
            r0 = 0
            r6 = 0
            android.view.View r5 = r2.inflate(r1, r0, r6)
            r0 = 2131429481(0x7f0b0869, float:1.8480636E38)
            android.widget.TextView r4 = X.AnonymousClass0x2.A0I(r5, r0)
            X.5a2 r0 = r7.A05
            if (r0 == 0) goto L_0x0048
            r3 = 2131890275(0x7f121063, float:1.9415237E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.3Lk r1 = r7.A04
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = "360977646301595"
            android.net.Uri r0 = r1.A03(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r7, r0, r2, r6, r3)
            android.text.SpannableString r0 = X.C106625Zs.A00(r7, r0)
            r4.setText(r0)
            X.1VX r0 = r7.A0D
            X.C18270x1.A0q(r4, r0)
            return r5
        L_0x0041:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0048:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x004f:
            boolean r0 = r13 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x00a0
            r4 = r13
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            boolean r0 = r4.A7e()
            if (r0 != 0) goto L_0x0070
            X.3Lq r1 = r4.A0A
            if (r1 == 0) goto L_0x0099
            X.66R r0 = r4.A0N
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r2 = r1.A03(r0)
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            X.66R r0 = r4.A0N
            java.lang.Object r3 = r0.getValue()
            X.1fJ r3 = (X.C27991fJ) r3
            r2 = 0
            if (r3 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0098
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131626360(0x7f0e0978, float:1.8879954E38)
            android.view.View r2 = r1.inflate(r0, r2)
            r0 = 2131429481(0x7f0b0869, float:1.8480636E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86614Ku.A0M(r2, r0)
            r4.A7c(r1, r3)
            X.1VX r0 = r4.A0D
            X.C18270x1.A0q(r1, r0)
        L_0x0098:
            return r2
        L_0x0099:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a0:
            boolean r0 = r13 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x00c9
            r2 = r13
            com.whatsapp.community.LinkExistingGroups r2 = (com.whatsapp.community.LinkExistingGroups) r2
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x00c8
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131626360(0x7f0e0978, float:1.8879954E38)
            android.view.View r1 = X.C18310x6.A0H(r1, r0)
            r2.A00 = r1
            r0 = 2131429481(0x7f0b0869, float:1.8480636E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r1, r0)
            java.lang.String r0 = r2.A7E()
            r1.setText(r0)
            android.view.View r0 = r2.A00
        L_0x00c8:
            return r0
        L_0x00c9:
            boolean r0 = r13 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0173
            r9 = r13
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r9 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r9
            boolean r0 = r9 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet
            if (r0 == 0) goto L_0x00d6
            r8 = 0
        L_0x00d5:
            return r8
        L_0x00d6:
            boolean r0 = r9.A7h()
            r8 = 0
            if (r0 != 0) goto L_0x00d5
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131626360(0x7f0e0978, float:1.8879954E38)
            android.view.View r8 = r1.inflate(r0, r8)
            r0 = 2131429481(0x7f0b0869, float:1.8480636E38)
            android.widget.TextView r7 = X.AnonymousClass002.A09(r8, r0)
            boolean r0 = r9.A7i()
            r2 = 1
            r6 = 0
            X.33j r5 = r9.A0N
            if (r0 == 0) goto L_0x0112
            r4 = 2131755222(0x7f1000d6, float:1.9141317E38)
            int r0 = r9.A78()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r9.A78()
            X.AnonymousClass000.A1P(r3, r2, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r0)
            r7.setText(r0)
            return r8
        L_0x0112:
            r4 = 2131755414(0x7f100196, float:1.9141707E38)
            int r0 = r9.A78()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r9.A78()
            X.AnonymousClass000.A1P(r3, r2, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r12 = X.C18330xA.A00(r0)
            android.text.style.URLSpan[] r11 = X.C86624Kv.A1b(r0)
            if (r11 == 0) goto L_0x016a
            int r10 = r11.length
        L_0x0136:
            if (r6 >= r10) goto L_0x016a
            r2 = r11[r6]
            java.lang.String r1 = r2.getURL()
            java.lang.String r0 = "learn_more_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0167
            java.lang.String r0 = "GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r5 = r12.getSpanStart(r2)
            int r4 = r12.getSpanEnd(r2)
            int r3 = r12.getSpanFlags(r2)
            r12.removeSpan(r2)
            int r2 = X.C18290x4.A00(r9)
            r1 = 1
            X.67t r0 = new X.67t
            r0.<init>(r9, r9, r2, r1)
            r12.setSpan(r0, r5, r4, r3)
        L_0x0167:
            int r6 = r6 + 1
            goto L_0x0136
        L_0x016a:
            r7.setText(r12)
            X.1VX r0 = r9.A0D
            X.C18270x1.A0q(r7, r0)
            return r8
        L_0x0173:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7D():android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A7E() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 == 0) goto L_0x0031
            com.whatsapp.Me r0 = X.AnonymousClass4SG.A2b(r4)
            X.C626936e.A06(r0)
            X.33j r3 = r4.A0N
            X.C626936e.A06(r0)
            java.lang.String r2 = r0.cc
            java.lang.String r1 = r0.jabber_id
            X.C626936e.A06(r1)
            java.lang.String r0 = r0.cc
            java.lang.String r0 = X.C18320x8.A0f(r0, r1)
            java.lang.String r2 = X.AnonymousClass4SG.A2v(r3, r2, r0)
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = r2.replace(r1, r0)
            r0 = 2131887049(0x7f1203c9, float:1.9408694E38)
            java.lang.String r0 = X.C86604Kt.A0m(r4, r1, r0)
            return r0
        L_0x0031:
            boolean r0 = r4 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x007a
            r3 = r4
            com.whatsapp.community.LinkExistingGroups r3 = (com.whatsapp.community.LinkExistingGroups) r3
            X.8qC r0 = r3.A0D
            java.lang.Object r2 = r0.get()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.1VX r1 = r3.A0D
            r0 = 2447(0x98f, float:3.429E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0078
            X.1fJ r1 = r3.A09
            if (r1 != 0) goto L_0x006b
            r0 = 0
        L_0x004f:
            boolean r1 = r2.booleanValue()
            if (r0 == 0) goto L_0x0062
            r0 = 2131890412(0x7f1210ec, float:1.9415515E38)
            if (r1 == 0) goto L_0x005d
            r0 = 2131890415(0x7f1210ef, float:1.9415521E38)
        L_0x005d:
            java.lang.String r0 = r3.getString(r0)
            return r0
        L_0x0062:
            r0 = 2131890413(0x7f1210ed, float:1.9415517E38)
            if (r1 == 0) goto L_0x005d
            r0 = 2131890414(0x7f1210ee, float:1.941552E38)
            goto L_0x005d
        L_0x006b:
            X.2ss r0 = r3.A04
            X.31A r0 = X.C56982ss.A00(r0, r1)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.A0n
            r0 = r0 ^ 1
            goto L_0x004f
        L_0x0078:
            r0 = 1
            goto L_0x004f
        L_0x007a:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7E():java.lang.String");
    }

    public final List A7F() {
        List list = this.A0f;
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(AnonymousClass3ZH.A06(it));
        }
        return A0p;
    }

    public void A7G() {
        if (this instanceof LinkExistingGroupActivity) {
            LinkExistingGroupActivity linkExistingGroupActivity = (LinkExistingGroupActivity) this;
            C111145hc r1 = linkExistingGroupActivity.A03;
            if (r1 == null) {
                throw C18270x1.A0S("xFamilyUserFlowLogger");
            }
            r1.A03("EXIT_GROUP_SELECTION");
            linkExistingGroupActivity.finish();
        } else if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            groupCallParticipantPicker.finish();
            if (groupCallParticipantPicker.A7f()) {
                C619532x A2i = AnonymousClass4SG.A2i(groupCallParticipantPicker);
                C86624Kv.A1K(A2i.A02, A2i, 19);
            }
        } else {
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.4m4] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.4m3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7H() {
        /*
            r16 = this;
            r12 = r16
            X.54L r0 = r12.A0J
            boolean r2 = X.C86644Kx.A1a(r0)
            X.1tC r0 = r12.A0K
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0.A0D(r2)
            r12.A0K = r1
        L_0x0012:
            X.54Z r0 = r12.A0L
            if (r0 == 0) goto L_0x001b
            r0.A0D(r2)
            r12.A0L = r1
        L_0x001b:
            boolean r0 = r12 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x0052
            r4 = r12
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r4 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r4
            X.8qC r0 = r4.A04
            if (r0 == 0) goto L_0x0089
            java.lang.Object r6 = X.C18300x5.A0b(r0)
            X.2ss r6 = (X.C56982ss) r6
            X.5ZU r3 = r4.A0D
            X.C162457s7.A0C(r3)
            X.33j r5 = r4.A0N
            X.C162457s7.A0C(r5)
            X.8qC r0 = r4.A05
            if (r0 == 0) goto L_0x0082
            java.lang.Object r7 = X.C18300x5.A0b(r0)
            X.3Lq r7 = (X.C66493Lq) r7
            java.util.List r8 = r4.A0f
            X.C162457s7.A0C(r8)
            X.4m3 r2 = new X.4m3
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x004a:
            r12.A0J = r2
            X.4FS r0 = r12.A04
            X.C18270x1.A0w(r2, r0)
            return
        L_0x0052:
            boolean r0 = r12 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x006f
            r5 = r12
            com.whatsapp.community.LinkExistingGroups r5 = (com.whatsapp.community.LinkExistingGroups) r5
            X.1VX r9 = r5.A0D
            X.2ss r7 = r5.A04
            X.3Mh r3 = r5.A06
            X.5ZU r4 = r5.A0D
            X.33j r6 = r5.A0N
            X.3Lq r10 = r5.A07
            X.2sj r8 = r5.A06
            java.util.List r11 = r5.A0f
            X.4m4 r2 = new X.4m4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x004a
        L_0x006f:
            X.3Ex r10 = r12.A0B
            X.5ZU r11 = r12.A0D
            X.33j r13 = r12.A0N
            java.util.List r1 = r12.A0f
            X.2ML r0 = r12.A0Q
            X.4m2 r2 = new X.4m2
            r9 = r2
            r14 = r0
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x004a
        L_0x0082:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0089:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033c, code lost:
        if (r6.A0D.A0X(5021) == false) goto L_0x033e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7I() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x0084
            r3 = r11
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r3 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r3
            X.5hc r1 = r3.A03
            if (r1 != 0) goto L_0x0012
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0012:
            java.lang.String r0 = "TAP_GROUP_CONFIRM_NEXT"
            r1.A05(r0)
            java.util.List r0 = r3.A0f
            java.util.Iterator r4 = X.AnonymousClass0x7.A0x(r0)
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a1
            X.3ZH r1 = X.C18310x6.A0R(r4)
            X.4uZ r0 = r1.A0H
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r1.A0J()
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = ""
        L_0x0033:
            r3.A0C = r0
            X.4uZ r1 = r1.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C162457s7.A0K(r1, r0)
            X.1fJ r1 = (X.C27991fJ) r1
            r3.A00 = r1
            if (r1 == 0) goto L_0x0054
            X.8qC r0 = r3.A05
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r0.get()
            X.3Lq r0 = (X.C66493Lq) r0
            java.util.Map r0 = r0.A1F
            java.lang.String r0 = X.C18310x6.A0o(r1, r0)
            r3.A0A = r0
        L_0x0054:
            java.lang.String r2 = r3.A0A
            if (r2 == 0) goto L_0x007b
            int r0 = r2.length()
            if (r0 == 0) goto L_0x007b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://chat.whatsapp.com/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
        L_0x0068:
            r3.A0B = r0
            r1 = 0
            if (r2 == 0) goto L_0x0077
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0077
            r3.A7c()
            goto L_0x001d
        L_0x0077:
            r3.A7e(r1)
            goto L_0x001d
        L_0x007b:
            r0 = 0
            goto L_0x0068
        L_0x007d:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0084:
            boolean r0 = r11 instanceof com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity
            if (r0 == 0) goto L_0x00a2
            r7 = r11
            com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity r7 = (com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity) r7
            java.util.List r0 = r7.A7F()
            r7.A05 = r0
            r2 = 0
            boolean r0 = r0.isEmpty()
            r6 = 1
            if (r0 != r6) goto L_0x0210
            X.3Wi r1 = r7.A05
            r0 = 2131896183(0x7f122777, float:1.942722E38)
            r1.A0H(r0, r2)
        L_0x00a1:
            return
        L_0x00a2:
            boolean r0 = r11 instanceof com.whatsapp.registration.NotifyContactsSelector
            if (r0 == 0) goto L_0x00b5
            android.content.Intent r1 = X.C18320x8.A07()
            java.util.List r0 = r11.A7F()
            X.C86654Ky.A0x(r1, r0)
            X.AnonymousClass0x2.A0m(r11, r1)
            return
        L_0x00b5:
            boolean r0 = r11 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x00d7
            r1 = r11
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r1 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r1
            X.66R r0 = r1.A0A
            java.lang.Object r3 = r0.getValue()
            X.4uY r3 = (X.C95804uY) r3
            if (r3 == 0) goto L_0x00a1
            X.0df r2 = r1.getSupportFragmentManager()
            java.util.List r1 = r1.A7F()
            r0 = 1
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r0 = X.AnonymousClass5BM.A00(r3, r1, r0)
            X.AnonymousClass344.A01(r0, r2)
            return
        L_0x00d7:
            boolean r0 = r11 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x0137
            r4 = r11
            com.whatsapp.group.GroupMembersSelector r4 = (com.whatsapp.group.GroupMembersSelector) r4
            java.util.List r0 = r4.A7F()
            r4.A0C = r0
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x00f4
            X.3Wi r1 = r4.A05
            r0 = 2131891243(0x7f12142b, float:1.94172E38)
            r1.A0H(r0, r3)
            return
        L_0x00f4:
            X.1fJ r2 = r4.A08
            r5 = 1
            if (r2 != 0) goto L_0x025d
            X.1VX r1 = r4.A0D
            r0 = 3011(0xbc3, float:4.22E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0259
            boolean r1 = r4.A0F
            X.1sn r0 = r4.A07
            if (r1 == 0) goto L_0x011f
            if (r0 == 0) goto L_0x010e
            r0.A0D(r5)
        L_0x010e:
            X.1sn r2 = new X.1sn
            r2.<init>(r4)
            r4.A07 = r2
            X.4FS r1 = r4.A04
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.BkO(r2, r0)
            r4.A0F = r3
            return
        L_0x011f:
            if (r0 == 0) goto L_0x0128
            int r1 = r0.A06()
            r0 = 2
            if (r1 != r0) goto L_0x00a1
        L_0x0128:
            X.1sn r2 = new X.1sn
            r2.<init>(r4)
            r4.A07 = r2
            X.4FS r1 = r4.A04
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.BkO(r2, r0)
            return
        L_0x0137:
            boolean r0 = r11 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 == 0) goto L_0x0150
            android.content.Intent r2 = X.C18320x8.A07()
            java.util.List r0 = r11.A7F()
            java.util.ArrayList r1 = X.C627336j.A0A(r0)
            java.lang.String r0 = "jids"
            r2.putExtra(r0, r1)
            X.AnonymousClass0x2.A0m(r11, r2)
            return
        L_0x0150:
            boolean r0 = r11 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 == 0) goto L_0x0169
            android.content.Intent r2 = X.C18320x8.A07()
            java.util.List r0 = r11.A7F()
            java.util.ArrayList r1 = X.C627336j.A0A(r0)
            java.lang.String r0 = "contacts"
            r2.putExtra(r0, r1)
            X.AnonymousClass0x2.A0m(r11, r2)
            return
        L_0x0169:
            boolean r0 = r11 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 == 0) goto L_0x0180
            r4 = r11
            com.whatsapp.contact.picker.ListMembersSelector r4 = (com.whatsapp.contact.picker.ListMembersSelector) r4
            X.314 r1 = r4.A04
            X.2ss r0 = r1.A02
            r0.A0G()
            long r2 = X.C18280x3.A07()
            X.3ZV r5 = r1.A01
            monitor-enter(r5)
            goto L_0x02a3
        L_0x0180:
            boolean r0 = r11 instanceof com.whatsapp.contact.picker.ContactsAttachmentSelector
            if (r0 == 0) goto L_0x01a7
            r0 = r11
            com.whatsapp.contact.picker.ContactsAttachmentSelector r0 = (com.whatsapp.contact.picker.ContactsAttachmentSelector) r0
            X.4Ts r4 = r0.A02
            java.util.List r0 = r0.A7F()
            X.08M r3 = r4.A02
            r3.A0H(r0)
            X.08M r0 = r4.A03
            X.C86654Ky.A1H(r0)
            X.5Mk r1 = r4.A09
            X.08J r2 = r4.A01
            r0 = 2
            X.C103315Mk.A00(r3, r2, r1, r4, r0)
            X.08J r1 = r4.A00
            r0 = 167(0xa7, float:2.34E-43)
            X.AnonymousClass6C6.A03(r2, r1, r4, r0)
            return
        L_0x01a7:
            boolean r0 = r11 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x01d4
            r6 = r11
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r6 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r6
            X.66R r3 = r6.A0R
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x02e0
            X.5Wv r1 = r6.A0B
            android.widget.ListView r0 = r6.getListView()
            r1.A02(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.util.List r0 = r6.A7F()
            java.util.ArrayList r1 = X.C627336j.A0A(r0)
            java.lang.String r0 = "contacts"
            r2.putExtra(r0, r1)
            X.AnonymousClass0x2.A0m(r6, r2)
            return
        L_0x01d4:
            boolean r0 = r11 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x00a1
            r4 = r11
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            java.util.List r0 = r4.A0f
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            r3 = 0
            if (r0 != 0) goto L_0x0430
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0430
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131891237(0x7f121425, float:1.9417188E38)
            java.lang.String r0 = r4.getString(r0)
            r2.A0g(r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 129(0x81, float:1.81E-43)
            X.6C6 r0 = X.AnonymousClass6C6.A00(r4, r0)
            r2.A0c(r4, r0, r1)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2.A0d(r4, r3, r0)
            r2.A0S()
            return
        L_0x0210:
            int r5 = r7.A00
            java.util.List r4 = r7.A7F()
            java.lang.String r3 = r7.A04
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.newgroup.NewGroup"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "create_group_for_xfamily"
            r2.putExtra(r0, r6)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x023e
            java.lang.String r1 = "selected"
            java.util.ArrayList r0 = X.C627336j.A0A(r4)
            r2.putStringArrayListExtra(r1, r0)
        L_0x023e:
            java.lang.String r0 = "prefill_group_name"
            r2.putExtra(r0, r3)
            r0 = 11
            r7.BpY(r2, r0)
            X.5hc r1 = r7.A03
            if (r1 != 0) goto L_0x0253
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0253:
            java.lang.String r0 = "TAP_ADD_PARTICIPANTS_NEXT"
            r1.A05(r0)
            return
        L_0x0259:
            r4.A7d(r3)
            return
        L_0x025d:
            X.5ZU r1 = r4.A0D
            X.3Ex r0 = r4.A0B
            java.lang.String r3 = X.AnonymousClass5ZU.A01(r0, r1, r2)
            boolean r2 = X.AnonymousClass000.A1W(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupMembersSelector/ CommunityName is null for"
            r1.append(r0)
            X.1fJ r0 = r4.A08
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            X.C626936e.A0D(r2, r0)
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r1 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r0 = 247(0xf7, float:3.46E-43)
            X.6C6 r0 = X.AnonymousClass6C6.A00(r4, r0)
            r2.A0d(r4, r0, r1)
            r0 = 2131894128(0x7f121f70, float:1.9423052E38)
            if (r3 == 0) goto L_0x029e
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r4, r3, r5, r0)
        L_0x0294:
            r2.A0g(r0)
            X.C19340zH.A05(r2)
            r2.A0S()
            return
        L_0x029e:
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0294
        L_0x02a3:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02dd }
            r0.append(r2)     // Catch:{ all -> 0x02dd }
            java.lang.String r1 = "@broadcast"
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r0)     // Catch:{ all -> 0x02dd }
            X.1fI r0 = X.AnonymousClass27Y.A00(r0)     // Catch:{ all -> 0x02dd }
            int r0 = r5.A00(r0)     // Catch:{ all -> 0x02dd }
            if (r0 < 0) goto L_0x02be
            r0 = 1
            long r2 = r2 + r0
            goto L_0x02a3
        L_0x02be:
            monitor-exit(r5)     // Catch:{ all -> 0x02dd }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r0)
            X.1fI r3 = X.AnonymousClass27Y.A00(r0)
            X.C626936e.A06(r3)
            java.util.List r2 = r4.A7F()
            X.4FS r1 = r4.A04
            r0 = 42
            X.C70323aJ.A00(r1, r4, r3, r2, r0)
            return
        L_0x02dd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02dd }
            throw r0
        L_0x02e0:
            X.66R r8 = r6.A0J
            java.lang.Object r0 = r8.getValue()
            r9 = 1
            r5 = 0
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AddGroupParticipantsSelector/ CommunityName is null for "
            r1.append(r0)
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            X.C626936e.A0D(r2, r0)
            X.2ss r1 = r6.A05
            if (r1 == 0) goto L_0x0429
            X.66R r0 = r6.A0N
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A07(r0)
            r0 = 3
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.Object r1 = r3.getValue()
            r4 = 0
            if (r1 == 0) goto L_0x033e
            X.2so r0 = r6.A01
            if (r0 == 0) goto L_0x0422
            X.2rM r0 = r0.A0H
            r0.A04()
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            X.2vX r0 = (X.C58612vX) r0
            if (r0 == 0) goto L_0x033e
            X.2mC r0 = r0.A01
            if (r0 == 0) goto L_0x033e
            X.1VX r1 = r6.A0D
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0X(r0)
            r10 = 1
            if (r0 != 0) goto L_0x033f
        L_0x033e:
            r10 = 0
        L_0x033f:
            if (r2 == 0) goto L_0x03ca
            if (r10 != 0) goto L_0x040a
            X.66R r0 = r6.A0Q
            boolean r1 = X.C18270x1.A1V(r0)
            java.lang.Object r0 = r8.getValue()
            if (r1 == 0) goto L_0x03b8
            if (r0 == 0) goto L_0x03c2
            r2 = 2131887922(0x7f120732, float:1.9410465E38)
        L_0x0354:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r8.getValue()
            java.lang.String r8 = X.AnonymousClass002.A0F(r6, r0, r1, r5, r2)
        L_0x035e:
            X.C162457s7.A0H(r8)
            X.0zH r7 = X.AnonymousClass5V0.A00(r6)
            r1 = 2131894127(0x7f121f6f, float:1.942305E38)
            r0 = 161(0xa1, float:2.26E-43)
            X.6C6 r0 = X.AnonymousClass6C6.A00(r6, r0)
            r7.A0d(r6, r0, r1)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r7.A0W(r4, r0)
            if (r10 == 0) goto L_0x03b4
            r0 = 2131624083(0x7f0e0093, float:1.8875336E38)
            android.view.View r4 = android.view.View.inflate(r6, r0, r4)
            r7.A0a(r4)
            java.util.List r0 = r6.A7F()
            int r3 = r0.size()
            android.content.res.Resources r2 = r6.getResources()
            X.66R r0 = r6.A0Q
            boolean r1 = X.C18270x1.A1V(r0)
            r0 = 2131755040(0x7f100020, float:1.9140948E38)
            if (r1 == 0) goto L_0x039d
            r0 = 2131755037(0x7f10001d, float:1.9140942E38)
        L_0x039d:
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r2, r3, r5, r0)
            r7.A0h(r0)
            r0 = 2131429479(0x7f0b0867, float:1.8480632E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r4, r0)
            if (r0 == 0) goto L_0x03b0
            r0.setText(r8)
        L_0x03b0:
            r7.A0S()
            return
        L_0x03b4:
            r7.A0g(r8)
            goto L_0x03b0
        L_0x03b8:
            if (r0 == 0) goto L_0x03be
            r2 = 2131887196(0x7f12045c, float:1.9408992E38)
            goto L_0x0354
        L_0x03be:
            r0 = 2131887197(0x7f12045d, float:1.9408994E38)
            goto L_0x03c5
        L_0x03c2:
            r0 = 2131887923(0x7f120733, float:1.9410467E38)
        L_0x03c5:
            java.lang.String r8 = r6.getString(r0)
            goto L_0x035e
        L_0x03ca:
            java.util.List r0 = r6.A7F()
            int r7 = r0.size()
            java.lang.Object r0 = r8.getValue()
            if (r10 == 0) goto L_0x03f2
            if (r0 == 0) goto L_0x03ee
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131755339(0x7f10014b, float:1.9141554E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r8.getValue()
            r1[r5] = r0
            java.lang.String r8 = r3.getQuantityString(r2, r7, r1)
            goto L_0x041d
        L_0x03ee:
            r0 = 2131894130(0x7f121f72, float:1.9423056E38)
            goto L_0x0405
        L_0x03f2:
            if (r0 == 0) goto L_0x0402
            r2 = 2131894128(0x7f121f70, float:1.9423052E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r8.getValue()
            java.lang.String r8 = X.AnonymousClass002.A0F(r6, r0, r1, r5, r2)
            goto L_0x041d
        L_0x0402:
            r0 = 2131894129(0x7f121f71, float:1.9423054E38)
        L_0x0405:
            java.lang.String r8 = r6.getString(r0)
            goto L_0x041d
        L_0x040a:
            java.util.List r0 = r6.A7F()
            int r2 = r0.size()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131755038(0x7f10001e, float:1.9140944E38)
            java.lang.String r8 = r1.getQuantityString(r0, r2)
        L_0x041d:
            X.C162457s7.A0H(r8)
            goto L_0x035e
        L_0x0422:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0429:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0430:
            java.util.List r1 = r4.A7c()
            X.8qC r0 = r4.A0D
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x044e
            X.20q r0 = X.C370220q.SUGGEST
        L_0x0442:
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r1 = X.AnonymousClass25M.A00(r0, r1)
            X.0df r0 = r4.getSupportFragmentManager()
            r1.A1S(r0, r3)
            return
        L_0x044e:
            X.20q r0 = X.C370220q.DIRECT_LINK
            goto L_0x0442
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7I():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2.A0f.isEmpty() != false) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        if (r3 == 0) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r3 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7J(int r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x000d
            if (r3 != 0) goto L_0x0027
        L_0x0006:
            X.6Z3 r1 = r2.A05
        L_0x0008:
            r0 = 1
            r1.A04(r0)
        L_0x000c:
            return
        L_0x000d:
            boolean r0 = r2 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0016
            X.6Z3 r1 = r2.A05
            if (r3 != 0) goto L_0x002d
            goto L_0x0008
        L_0x0016:
            java.util.List r0 = r2.A0U
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r2.A0f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
            goto L_0x0006
        L_0x0027:
            boolean r0 = r2 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 != 0) goto L_0x000c
            X.6Z3 r1 = r2.A05
        L_0x002d:
            r0 = 1
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7J(int):void");
    }

    public void A7L(View view, View view2, View view3, View view4) {
        C86624Kv.A14(view4, view, view2, 8);
        view3.setVisibility(0);
        int A76 = A76();
        Object[] A0L2 = AnonymousClass002.A0L();
        A0L2[0] = this.A0S;
        AnonymousClass001.A0y(this, (TextView) view3, A0L2, A76);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r5.A0y != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7N(X.AnonymousClass5QN r4, X.AnonymousClass3ZH r5) {
        /*
            r3 = this;
            X.5Uq r1 = r3.A0E
            if (r1 == 0) goto L_0x0009
            android.widget.ImageView r0 = r4.A01
            r1.A08(r0, r5)
        L_0x0009:
            X.5YB r1 = r4.A03
            java.util.ArrayList r0 = r3.A0T
            r1.A0A(r5, r0)
            android.view.View r2 = r4.A00
            r0 = 27
            X.C109725f5.A00(r2, r3, r5, r4, r0)
            int r1 = r3.A78()
            java.util.List r0 = r3.A0f
            int r0 = r0.size()
            if (r1 != r0) goto L_0x002a
            boolean r1 = r5.A0y
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x002c:
            r2.setAlpha(r0)
            com.whatsapp.components.SelectionCheckView r0 = r4.A04
            r0.setTag(r5)
            r3.A7O(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.A7N(X.5QN, X.3ZH):void");
    }

    public void A7P(AnonymousClass2W6 r3) {
        if (AnonymousClass3ZH.A0D(r3, this.A0U)) {
            this.A03.notifyDataSetChanged();
            SelectedContactsList selectedContactsList = this.A0H;
            if (selectedContactsList == null) {
                return;
            }
            if (((r3 instanceof AnonymousClass1RO) || (r3 instanceof AnonymousClass1RP)) && AnonymousClass3ZH.A0D(r3, selectedContactsList.A09)) {
                selectedContactsList.A07.A05();
            }
        }
    }

    public void A7Q(AnonymousClass3ZH r8) {
        if (this instanceof GroupMembersSelector) {
            Boo(A0C(this, r8, R.string.f11nameremoved));
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            Boo(A0C(this, r8, R.string.f11nameremoved));
        } else if (this instanceof ListMembersSelector) {
            Boo(A0C(this, r8, R.string.f11nameremoved));
        } else if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            C162457s7.A0J(r8, 0);
            boolean A1V = C18270x1.A1V(addGroupParticipantsSelector.A0Q);
            int i = R.string.f11nameremoved;
            if (A1V) {
                i = R.string.f11nameremoved;
            }
            String A0F2 = AnonymousClass002.A0F(addGroupParticipantsSelector, AnonymousClass4SG.A2h(addGroupParticipantsSelector, r8).A00.A01, new Object[1], 0, i);
            C162457s7.A0H(A0F2);
            C18270x1.A0t(UnblockDialogFragment.A00(new C112135jF(addGroupParticipantsSelector, addGroupParticipantsSelector.A08, C86604Kt.A0d(r8)), A0F2, R.string.f11nameremoved, false), addGroupParticipantsSelector);
        } else if (this instanceof GroupCallParticipantPicker) {
            C18270x1.A0t(A0C(this, r8, R.string.f11nameremoved), this);
        }
    }

    public void A7T(String str) {
        if (str == null) {
            str = "";
        }
        this.A0S = str;
        ArrayList A032 = C107155an.A03(this.A0N, str);
        this.A0T = A032;
        if (A032.isEmpty()) {
            this.A0T = null;
        }
        A0L();
    }

    public void A7U(ArrayList arrayList) {
        this.A0B.A0b(arrayList);
    }

    public void A7W(List list) {
        this.A0V.clear();
        int A042 = C86644Kx.A04(this, R.id.error_text_line1);
        C18280x3.A0r(this, R.id.error_text_line2, A042);
        C18280x3.A0r(this, R.id.retry_button, A042);
        A0X();
        View findViewById = findViewById(R.id.search_no_matches_container);
        this.A0G.A00(new C112805kP(findViewById, this, list), this.A0S);
    }

    public boolean A7a() {
        return AnonymousClass000.A1W(this.A0J);
    }

    public boolean A7b(AnonymousClass3ZH r4) {
        Class<UserJid> cls = UserJid.class;
        if (r4.A0I(cls) == null || !this.A08.A0P((UserJid) r4.A0I(cls))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 >= 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ayk(X.AnonymousClass3ZH r10) {
        /*
            r9 = this;
            android.widget.ListView r0 = r9.A04
            android.view.View r6 = r0.findViewWithTag(r10)
            com.whatsapp.components.SelectionCheckView r6 = (com.whatsapp.components.SelectionCheckView) r6
            boolean r0 = r9.A7b(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r10.A0y
            if (r0 != 0) goto L_0x0014
            r6 = r5
        L_0x0014:
            boolean r0 = r10.A0y
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0179
            r10.A0y = r4
            java.util.List r2 = r9.A0f
            int r7 = r2.indexOf(r10)
            if (r7 >= 0) goto L_0x003b
            r7 = 0
        L_0x0025:
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x003e
            X.4uZ r1 = r10.A0H
            X.3ZH r0 = X.AnonymousClass4L0.A0L(r2, r7)
            X.4uZ r0 = r0.A0H
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x0175
            if (r7 < 0) goto L_0x003e
        L_0x003b:
            r9.A7S(r10, r7)
        L_0x003e:
            if (r6 == 0) goto L_0x0045
            boolean r0 = r10.A0y
            r6.A06(r0, r3)
        L_0x0045:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0060
            r0 = 2131431467(0x7f0b102b, float:1.8484664E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L_0x0059
            r0 = 64
            X.AnonymousClass0YY.A0E(r1, r0, r5)
        L_0x0059:
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x0060
            r9.Bs7()
        L_0x0060:
            int r0 = r2.size()
            r9.A7K(r0)
            r9.A7J(r0)
            java.util.List r0 = r9.A0U
            java.util.Iterator r3 = r0.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008c
            X.3ZH r2 = X.C18310x6.A0R(r3)
            if (r2 == r10) goto L_0x0070
            X.4uZ r1 = r10.A0H
            X.4uZ r0 = r2.A0H
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r10.A0y
            r2.A0y = r0
            r4 = 1
            goto L_0x0070
        L_0x008c:
            if (r4 == 0) goto L_0x0093
            android.widget.BaseAdapter r0 = r9.A03
            r0.notifyDataSetChanged()
        L_0x0093:
            com.whatsapp.contact.picker.SelectedContactsList r3 = r9.A0H
            if (r3 == 0) goto L_0x01a4
            android.view.ViewGroup r1 = r9.A02
            android.widget.ListView r4 = r9.A04
            boolean r5 = r9.A0a
            r3.A01()
            java.util.List r0 = r3.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014d
            r0 = 4
            r3.setVisibility(r0)
            if (r5 == 0) goto L_0x00b3
            X.66i r0 = r3.A08
            r0.Bs7()
        L_0x00b3:
            android.animation.AnimatorSet r0 = r3.A02
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00c2
            android.animation.AnimatorSet r0 = r3.A02
            r0.end()
        L_0x00c2:
            int[] r2 = X.C86664Kz.A1Z()
            if (r5 == 0) goto L_0x014a
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x014a
            int r0 = r3.A01
            int r1 = X.AnonymousClass4L0.A05(r1, r0)
        L_0x00d4:
            r0 = 0
            r2[r0] = r1
            android.animation.ValueAnimator r1 = X.C86664Kz.A0Q(r2, r0)
            r3.A03 = r1
            X.5bp r0 = new X.5bp
            r0.<init>(r4)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r1 = r3.A03
            X.5bl r0 = new X.5bl
            r0.<init>(r3)
            r1.addListener(r0)
            android.animation.ValueAnimator r2 = r3.A03
            r0 = 240(0xf0, double:1.186E-321)
            r2.setDuration(r0)
            boolean r0 = r3 instanceof com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList
            if (r0 == 0) goto L_0x0144
            r8 = r3
            com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList r8 = (com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList) r8
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168119(0x7f070b77, float:1.795053E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168120(0x7f070b78, float:1.7950533E38)
            int r7 = r1.getDimensionPixelSize(r0)
            int r6 = r8.A00
            int r5 = r6 + r2
            X.33j r0 = r8.A02
            boolean r1 = X.C620733j.A04(r0)
            r4 = 1
            r0 = -1
            if (r1 == 0) goto L_0x0122
            r0 = 1
        L_0x0122:
            int r5 = r5 * r0
            com.whatsapp.WaImageButton r2 = r8.A00
            float r1 = r2.getTranslationX()
            float r0 = (float) r5
            float r1 = r1 + r0
            r2.setTranslationX(r1)
            int r6 = r6 + r7
            X.33j r0 = r8.A02
            boolean r0 = X.C620733j.A04(r0)
            if (r0 != 0) goto L_0x0138
            r4 = -1
        L_0x0138:
            int r6 = r6 * r4
            com.whatsapp.WaImageButton r2 = r8.A01
            float r1 = r2.getTranslationX()
            float r0 = (float) r6
            float r1 = r1 + r0
            r2.setTranslationX(r1)
        L_0x0144:
            android.animation.ValueAnimator r0 = r3.A03
            r0.start()
            return
        L_0x014a:
            int r1 = r3.A01
            goto L_0x00d4
        L_0x014d:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x015d
            android.animation.ValueAnimator r0 = r3.A03
            if (r0 == 0) goto L_0x0165
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0165
        L_0x015d:
            r0 = 0
            r3.setVisibility(r0)
            r3.A02(r4, r1, r5)
            return
        L_0x0165:
            boolean r0 = r10.A0y
            if (r0 == 0) goto L_0x01a4
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            java.util.List r0 = r3.A09
            int r0 = X.AnonymousClass002.A03(r0)
            r1.A0Z(r0)
            return
        L_0x0175:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0179:
            int r1 = r9.A78()
            java.util.List r2 = r9.A0f
            int r0 = r2.size()
            if (r0 != r1) goto L_0x01cf
            boolean r0 = r9 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x01a5
            int r1 = r9.A78()
            X.3Wi r6 = r9.A05
            X.33j r5 = r9.A0N
            r4 = 2131755157(0x7f100095, float:1.9141185E38)
            long r2 = (long) r1
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            boolean r1 = X.C18300x5.A1Y(r0, r1)
            java.lang.String r0 = r5.A0L(r0, r4, r2)
            r6.A0P(r0, r1)
        L_0x01a4:
            return
        L_0x01a5:
            android.widget.ListView r0 = r9.A04
            android.view.View r6 = r0.findViewWithTag(r10)
            com.whatsapp.components.SelectionCheckView r6 = (com.whatsapp.components.SelectionCheckView) r6
            int r5 = r9.A78()
            X.33j r4 = r9.A0N
            int r3 = r9.A77()
            long r1 = (long) r5
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1L(r0, r5)
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            r9.Bou(r0)
            if (r6 == 0) goto L_0x01a4
            android.widget.FrameLayout r1 = r6.A0B
            r0 = 4
            X.C86654Ky.A18(r1, r6, r0)
            return
        L_0x01cf:
            boolean r0 = r9 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 != 0) goto L_0x01e5
            android.view.View r1 = X.AnonymousClass4SG.A2R(r9)
            if (r1 == 0) goto L_0x01ff
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r1, r0)
            if (r0 == 0) goto L_0x01e5
            X.C86634Kw.A1I(r0)
        L_0x01e5:
            r10.A0y = r3
            boolean r0 = r2.add(r10)
            if (r0 == 0) goto L_0x003e
            r9.A7R(r10)
            java.util.List r0 = r9.A0V
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r9.A0W
            X.C86644Kx.A1V(r10, r0)
            goto L_0x003e
        L_0x01ff:
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r9.A0R
            if (r0 == 0) goto L_0x01e5
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A07
            com.whatsapp.WaEditText r0 = r0.A09
            X.C86634Kw.A1I(r0)
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634eX.Ayk(X.3ZH):void");
    }

    public void Bb8() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList A0s = AnonymousClass001.A0s();
            groupCallParticipantPicker.A7e(A0s, groupCallParticipantPicker.A7F());
            if (groupCallParticipantPicker.A01.Bpl(groupCallParticipantPicker, A0s, AnonymousClass001.A0K(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), false) == 0) {
                groupCallParticipantPicker.A7c();
                C18290x4.A18(groupCallParticipantPicker);
            }
        }
    }

    public void Bb9() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList A0s = AnonymousClass001.A0s();
            groupCallParticipantPicker.A7e(A0s, groupCallParticipantPicker.A7F());
            if (groupCallParticipantPicker.A01.Bpl(groupCallParticipantPicker, A0s, AnonymousClass001.A0K(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), true) == 0) {
                groupCallParticipantPicker.A7c();
                C18290x4.A18(groupCallParticipantPicker);
            }
        }
    }

    public void Bs7() {
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        int i2;
        if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            if (addGroupParticipantsSelector.A0a && addGroupParticipantsSelector.A0f.isEmpty()) {
                String str = addGroupParticipantsSelector.A0S;
                i2 = 0;
                if (str == null || str.length() == 0) {
                    C56982ss r1 = addGroupParticipantsSelector.A05;
                    if (r1 == null) {
                        throw C18270x1.A0S("chatsCache");
                    } else if (!r1.A0N((C95814uZ) addGroupParticipantsSelector.A0N.getValue())) {
                        viewGroup2 = addGroupParticipantsSelector.A02;
                        viewGroup2.setVisibility(i2);
                        return;
                    }
                }
            }
            viewGroup2 = addGroupParticipantsSelector.A02;
            i2 = 8;
            viewGroup2.setVisibility(i2);
            return;
        }
        if (!this.A0a || !this.A0f.isEmpty()) {
            viewGroup = this.A02;
            i = 8;
        } else {
            viewGroup = this.A02;
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
    }

    public boolean onSearchRequested() {
        WDSSearchBar wDSSearchBar = this.A0R;
        if (wDSSearchBar == null) {
            return false;
        }
        wDSSearchBar.A01();
        return false;
    }

    private void A0X() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        View findViewById5 = findViewById(R.id.error_text_line1);
        if (!this.A0A.A00()) {
            findViewById4.setVisibility(8);
            C86654Ky.A16(findViewById, findViewById2, findViewById3, 0, 8);
        } else if (A7a()) {
            A7M(findViewById, findViewById2, findViewById3, findViewById4);
        } else if (!TextUtils.isEmpty(this.A0S)) {
            if (this.A0Y) {
                findViewById4.setVisibility(0);
            } else if (findViewById5.getVisibility() != 0) {
                findViewById3.setVisibility(0);
                Object[] A0L2 = AnonymousClass002.A0L();
                A0L2[0] = this.A0S;
                AnonymousClass001.A0y(this, (TextView) findViewById3, A0L2, R.string.f11nameremoved);
                findViewById4.setVisibility(8);
            }
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        } else if (A76() != 0) {
            A7L(findViewById, findViewById2, findViewById3, findViewById4);
        } else {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
            if (this instanceof InviteNewsletterAdminSelector) {
                int A052 = C18290x4.A05(findViewById(R.id.contacts_empty));
                TextView A0L3 = C18310x6.A0L(this, R.id.search_no_matches);
                if (A0L3 != null) {
                    A0L3.setVisibility(0);
                    A0L3.setText(R.string.f11nameremoved);
                }
                View findViewById6 = findViewById(R.id.warning);
                if (findViewById6 != null) {
                    findViewById6.setVisibility(A052);
                }
            }
        }
        int size = this.A0f.size();
        A7K(size);
        A7J(size);
    }

    public static void A0Y(C89634eX r3, String str) {
        if (!TextUtils.isEmpty(str)) {
            C53802nh r2 = r3.A0I;
            int i = 27;
            if (TextUtils.isEmpty(r3.A0S)) {
                i = 26;
            }
            r2.A01(r3, Integer.valueOf(i), str, "sms:");
        }
    }

    public void A7K(int i) {
        String A0L2;
        AnonymousClass0R8 A0R2 = C86634Kw.A0R(this);
        int A78 = A78();
        C626936e.A0D(AnonymousClass001.A1W(A78), "Max contacts must be positive");
        if (A78 == Integer.MAX_VALUE) {
            A0L2 = C86604Kt.A0q(this.A0N, i, 0, R.plurals.f9nameremoved);
        } else {
            Object[] A0M2 = AnonymousClass002.A0M();
            C86604Kt.A1X(A0M2, i, 0, A78, 1);
            A0L2 = this.A0N.A0L(A0M2, R.plurals.f9nameremoved, (long) i);
        }
        A0R2.A0I(A0L2);
    }

    public void A7O(AnonymousClass5QN r6, AnonymousClass3ZH r7) {
        boolean z;
        if (!A7b(r7) || r7.A0y) {
            if (this instanceof GroupCallParticipantPicker) {
                z = this.A0D.A0X(5839);
            } else {
                z = true;
            }
            if (z) {
                if (this.A0D.A0X(5839)) {
                    String A012 = AnonymousClass31U.A01(this, this.A06, r7);
                    if (!C107575bX.A0F(A012)) {
                        TextEmojiLabel textEmojiLabel = r6.A02;
                        textEmojiLabel.A0K((List) null, A012);
                        textEmojiLabel.setVisibility(0);
                        r6.A01(r7.A0y);
                        return;
                    }
                } else if (r7.A0X != null) {
                    TextEmojiLabel textEmojiLabel2 = r6.A02;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0K((List) null, r7.A0X);
                    String str = r7.A0X;
                    if (str == null) {
                        str = "";
                    }
                    textEmojiLabel2.A0K((List) null, str);
                    r6.A01(r7.A0y);
                    return;
                }
            }
            r6.A02.setVisibility(8);
            r6.A01(r7.A0y);
            return;
        }
        r6.A00(getString(R.string.f11nameremoved), true);
    }

    public void A7R(AnonymousClass3ZH r3) {
        if (A78() == this.A0f.size()) {
            this.A03.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0H;
        if (selectedContactsList != null) {
            selectedContactsList.A07.A07(AnonymousClass002.A03(selectedContactsList.A09));
        }
    }

    public void A7S(AnonymousClass3ZH r4, int i) {
        int A78 = A78();
        List list = this.A0f;
        boolean A1U = AnonymousClass000.A1U(A78, list.size());
        list.remove(i);
        if (A1U) {
            this.A03.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0H;
        if (selectedContactsList != null) {
            selectedContactsList.A07.A08(i);
        }
    }

    public void A7V(List list) {
        ViewGroup A0m = C86664Kz.A0m(this, R.id.search_no_matches_container);
        TextView A0L2 = C18310x6.A0L(this, R.id.moreText);
        if (TextUtils.isEmpty(this.A0S) || !list.isEmpty()) {
            A0L2.setVisibility(8);
        } else {
            A0L2.setVisibility(0);
            C106905aM.A04(A0L2);
        }
        if (this.A01 == null) {
            FrameLayout frameLayout = new FrameLayout(this);
            this.A01 = frameLayout;
            boolean z = C1001059l.A04;
            int i = R.drawable.ic_voip_add_person;
            if (z) {
                i = R.drawable.ic_voip_add_person_filled_wds;
            }
            View A002 = AnonymousClass5V7.A00(getLayoutInflater(), (ViewGroup) null, i, R.string.f11nameremoved);
            AnonymousClass54F.A00(A002, this, 4);
            C107295b4.A02(A002);
            frameLayout.addView(A002);
            A0m.addView(this.A01);
        }
        if (TextUtils.isEmpty(this.A0S) || !list.isEmpty()) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
        }
    }

    public void BXG(String str) {
        A0Y(this, str);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            this.A0P.A00();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        int i3;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        if (this instanceof ContactsAttachmentSelector) {
            boolean A002 = C154437dA.A00(this.A0D);
            i = R.layout.f8nameremoved;
            if (A002) {
                i = R.layout.f8nameremoved;
            }
        } else if (this instanceof GroupCallParticipantPickerSheet) {
            i = R.layout.f8nameremoved;
        } else {
            i = R.layout.f8nameremoved;
        }
        setContentView(C18310x6.A0H(layoutInflater, i));
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, AnonymousClass1Hf.A28(this));
        A2S.A0N(true);
        A2S.A0O(true);
        A2S.A0B(A75());
        this.A0E = this.A0F.A06(this, "multiple-contact-picker");
        WDSSearchBar wDSSearchBar = (WDSSearchBar) findViewById(R.id.toolbar_holder);
        this.A0R = wDSSearchBar;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setOnQueryTextChangeListener(new AnonymousClass69F(this, 0));
            this.A0R.A07.setTrailingButtonIcon(C140036t3.A00);
        }
        ListView listView2 = getListView();
        this.A04 = listView2;
        boolean z2 = this instanceof GroupCallParticipantPicker;
        if (z2) {
            z = false;
        } else {
            z = true;
        }
        listView2.setFastScrollAlwaysVisible(z);
        this.A04.setScrollBarStyle(33554432);
        if (!(this instanceof LinkExistingGroupActivity)) {
            ViewStub viewStub = (ViewStub) C005205m.A00(this, R.id.selected_list_stub);
            if (z2) {
                i3 = R.layout.f8nameremoved;
            } else {
                i3 = R.layout.f8nameremoved;
            }
            SelectedContactsList selectedContactsList = (SelectedContactsList) C86634Kw.A0M(viewStub, i3);
            this.A0H = selectedContactsList;
            selectedContactsList.A08 = this;
            selectedContactsList.A09 = this.A0f;
        }
        if (A7C() != null) {
            this.A04.addHeaderView(A7C(), (Object) null, false);
        }
        List list = this.A0f;
        list.clear();
        if (bundle != null) {
            List A0B2 = C627336j.A0B(C95814uZ.class, bundle.getStringArrayList("selected_jids"));
            if (!A0B2.isEmpty()) {
                Iterator it = A0B2.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A072 = this.A0B.A07(C18300x5.A0P(it));
                    if (A072 != null) {
                        A072.A0y = true;
                        list.add(A072);
                    }
                }
            }
        } else {
            this.A0X = C86634Kw.A12(getIntent(), C95814uZ.class, "selected");
        }
        A7H();
        this.A04.setOnScrollListener(new C107125ak(this));
        this.A04.setFastScrollEnabled(true);
        this.A04.setScrollbarFadingEnabled(true);
        boolean A003 = C102805Ki.A00(this.A0N);
        ListView listView3 = this.A04;
        if (A003) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A04;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i2 = R.dimen.f6nameremoved;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A04;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i2 = R.dimen.f6nameremoved;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        AnonymousClass696.A00(this.A04, this, 4);
        this.A02 = C86664Kz.A0m(this, R.id.warning);
        View A7D = A7D();
        if (A7D != null) {
            this.A0a = true;
            this.A02.removeAllViews();
            this.A02.addView(A7D);
        } else {
            String A7E = A7E();
            this.A0a = C18320x8.A1U(A7E);
            C18310x6.A0L(this, R.id.warning_text).setText(A7E);
        }
        Bs7();
        AnonymousClass4OQ r0 = new AnonymousClass4OQ(this, this, this.A0e);
        this.A03 = r0;
        A74(r0);
        AnonymousClass6Z3 r1 = (AnonymousClass6Z3) C005205m.A00(this, R.id.next_btn);
        this.A05 = r1;
        if (!z2) {
            r1.setImageDrawable(A7B());
            C18300x5.A13(this, this.A05, A7A());
            AnonymousClass54F.A00(this.A05, this, 2);
        }
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new C109335eS(this, 36));
        AnonymousClass54F.A00(findViewById(R.id.button_open_permission_settings), this, 3);
        registerForContextMenu(this.A04);
        A0X();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem A0L2 = C86634Kw.A0L(menu);
        this.A00 = A0L2;
        A0L2.setShowAsAction(2);
        C86644Kx.A0u(this.A00, this.A0U);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0U.clear();
        this.A0e.clear();
        C105365Uq r0 = this.A0E;
        if (r0 != null) {
            r0.A00();
            this.A0E = null;
        }
        AnonymousClass54L r02 = this.A0J;
        if (r02 != null) {
            r02.A0D(true);
            this.A0J = null;
        }
        C33481tC r03 = this.A0K;
        if (r03 != null) {
            r03.A0D(true);
            this.A0K = null;
        }
        AnonymousClass54Z r04 = this.A0L;
        if (r04 != null) {
            r04.A0D(true);
            this.A0L = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            A7G();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.A0C.A07(this.A0c);
        this.A09.A07(this.A0b);
        this.A0O.A07(this.A0d.get());
    }

    public void onResume() {
        super.onResume();
        this.A0C.A06(this.A0c);
        this.A09.A06(this.A0b);
        this.A0O.A06(this.A0d.get());
        this.A03.notifyDataSetChanged();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List list = this.A0f;
        if (!list.isEmpty()) {
            ArrayList A0p = AnonymousClass000.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C86624Kv.A1H(C18310x6.A0R(it), A0p);
            }
            C86644Kx.A0r(bundle, "selected_jids", A0p);
        }
    }
}
