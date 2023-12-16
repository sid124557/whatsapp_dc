package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.4bW  reason: invalid class name and case insensitive filesystem */
public abstract class C89104bW extends C131886eL {
    public MenuItem A00;
    public MenuItem A01;
    public View A02;
    public C116985rC A03;
    public C990254d A04;
    public AnonymousClass54V A05;
    public AnonymousClass64J A06;
    public C56962sq A07;
    public C29301ib A08;
    public C44772Xk A09;
    public C64773Ex A0A;
    public C29421in A0B;
    public AnonymousClass5ZU A0C;
    public C105365Uq A0D;
    public C114015mM A0E;
    public C29241iV A0F;
    public C105225Ub A0G;
    public AnonymousClass2ML A0H;
    public String A0I;
    public ArrayList A0J;
    public List A0K = AnonymousClass001.A0s();
    public Set A0L = AnonymousClass002.A0K();
    public boolean A0M = true;
    public final Handler A0N;
    public final AnonymousClass4OZ A0O = new AnonymousClass4OZ(this);
    public final C54232oO A0P;
    public final C56602sG A0Q;
    public final C55702qm A0R;
    public final Runnable A0S;
    public final Set A0T = AnonymousClass002.A0K();
    public final Set A0U;
    public final Set A0V = AnonymousClass002.A0K();

    public void onCreate(Bundle bundle) {
        int i;
        AnonymousClass4SG.A37(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        this.A0D = this.A0E.A06(this, "content-distribution-recipients-picker");
        this.A0G = new C105225Ub(this, AnonymousClass4SG.A2R(this), new C159487lv(this, 0), A28, this.A00);
        this.A0M = getIntent().getBooleanExtra("is_black_list", true);
        AnonymousClass0R8 A0R2 = C86634Kw.A0R(this);
        A0R2.A0N(true);
        boolean z = this instanceof StatusRecipientsActivity;
        if (this.A0M) {
            if (z) {
                i = R.string.f11nameremoved;
            } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
                i = R.string.f11nameremoved;
            } else if (this instanceof AboutStatusBlockListPickerActivity) {
                i = R.string.f11nameremoved;
            } else if (this instanceof LastSeenBlockListPickerActivity) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
        } else if (z) {
            i = R.string.f11nameremoved;
        } else {
            i = 0;
        }
        A0R2.A0B(i);
        if (bundle != null) {
            List A0B2 = C627336j.A0B(UserJid.class, bundle.getStringArrayList("selected_jids"));
            if (!A0B2.isEmpty()) {
                this.A0V.addAll(A0B2);
            }
        } else if (!AnonymousClass4SG.A44(this) && !this.A09.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
        View findViewById = findViewById(R.id.done);
        this.A02 = findViewById;
        C989453v.A00(findViewById, this, 0);
        if (this instanceof ProfilePhotoBlockListPickerActivity) {
            ProfilePhotoBlockListPickerActivity profilePhotoBlockListPickerActivity = (ProfilePhotoBlockListPickerActivity) this;
            C86604Kt.A1M(profilePhotoBlockListPickerActivity, profilePhotoBlockListPickerActivity.A00.A00(), 320);
        } else if (this instanceof AboutStatusBlockListPickerActivity) {
            AboutStatusBlockListPickerActivity aboutStatusBlockListPickerActivity = (AboutStatusBlockListPickerActivity) this;
            C86604Kt.A1M(aboutStatusBlockListPickerActivity, aboutStatusBlockListPickerActivity.A00.A00(), 319);
        } else if (this instanceof LastSeenBlockListPickerActivity) {
            LastSeenBlockListPickerActivity lastSeenBlockListPickerActivity = (LastSeenBlockListPickerActivity) this;
            C86604Kt.A1M(lastSeenBlockListPickerActivity, lastSeenBlockListPickerActivity.A00.A00(), 263);
        } else if (this instanceof GroupAddBlacklistPickerActivity) {
            GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
            C86604Kt.A1M(groupAddBlacklistPickerActivity, groupAddBlacklistPickerActivity.A00.A00(), 229);
        } else {
            A77();
        }
        C18280x3.A0r(this, 16908292, 0);
        C18280x3.A0r(this, R.id.init_contacts_progress, 0);
        this.A0B.A06(this.A0Q);
        this.A08.A06(this.A0P);
        this.A0F.A06(this.A0R);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem A0L2 = C86634Kw.A0L(menu);
        this.A00 = A0L2;
        A0L2.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new C1894191f(this, 0));
        C86644Kx.A0u(this.A00, this.A0K);
        int i = R.string.f11nameremoved;
        MenuItem icon = menu.add(0, R.id.menuitem_select_all, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_select_all);
        this.A01 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A01;
        if (this.A0V.size() == this.A0L.size()) {
            i = R.string.f11nameremoved;
        }
        menuItem.setTitle(i);
        return super.onCreateOptionsMenu(menu);
    }

    public static /* synthetic */ void A0C(C89104bW r3) {
        C990254d r1 = r3.A04;
        if (r1 != null) {
            r1.A0D(true);
            r3.A04 = null;
        }
        C990254d r12 = new C990254d(r3, r3.A0J, r3.A0K);
        r3.A04 = r12;
        C18270x1.A0w(r12, r3.A04);
    }

    public List A75() {
        if (!(this instanceof StatusRecipientsActivity)) {
            return AnonymousClass0x9.A18();
        }
        StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
        if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
            C108845de A7B = ((StatusTemporalRecipientsActivity) statusRecipientsActivity).A7B();
            if (A7B != null) {
                return A7B.A01;
            }
            return C72023d3.A00;
        }
        C620233e r0 = statusRecipientsActivity.A03;
        if (r0 != null) {
            return r0.A07();
        }
        throw C18270x1.A0S("statusStore");
    }

    public List A76() {
        if (this instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                C108845de A7B = ((StatusTemporalRecipientsActivity) statusRecipientsActivity).A7B();
                if (A7B != null) {
                    return A7B.A02;
                }
                return C72023d3.A00;
            }
            C620233e r0 = statusRecipientsActivity.A03;
            if (r0 != null) {
                return r0.A08();
            }
            throw C18270x1.A0S("statusStore");
        } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
            return AnonymousClass002.A0J(((ProfilePhotoBlockListPickerActivity) this).A00.A03());
        } else {
            if (this instanceof AboutStatusBlockListPickerActivity) {
                return AnonymousClass002.A0J(((AboutStatusBlockListPickerActivity) this).A00.A03());
            }
            if (this instanceof LastSeenBlockListPickerActivity) {
                return AnonymousClass002.A0J(((LastSeenBlockListPickerActivity) this).A00.A03());
            }
            return AnonymousClass002.A0J(((GroupAddBlacklistPickerActivity) this).A00.A03());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A78() {
        /*
            r8 = this;
            boolean r2 = r8.A0M
            r7 = 0
            r1 = 1
            java.util.Set r6 = r8.A0V
            boolean r0 = r6.isEmpty()
            if (r2 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0042
            r0 = 2131891189(0x7f1213f5, float:1.9417091E38)
        L_0x0011:
            java.lang.String r4 = r8.getString(r0)
        L_0x0015:
            android.view.MenuItem r3 = r8.A01
            if (r3 == 0) goto L_0x002e
            int r2 = r6.size()
            java.util.Set r0 = r8.A0L
            int r1 = r0.size()
            r0 = 2131893431(0x7f121cb7, float:1.9421638E38)
            if (r2 != r1) goto L_0x002b
            r0 = 2131894632(0x7f122168, float:1.9424074E38)
        L_0x002b:
            r3.setTitle(r0)
        L_0x002e:
            X.0R8 r0 = X.C86634Kw.A0R(r8)
            r0.A0I(r4)
            return
        L_0x0036:
            if (r0 == 0) goto L_0x003c
            r0 = 2131891190(0x7f1213f6, float:1.9417093E38)
            goto L_0x0011
        L_0x003c:
            X.33j r5 = r8.A00
            r4 = 2131755328(0x7f100140, float:1.9141532E38)
            goto L_0x0047
        L_0x0042:
            X.33j r5 = r8.A00
            r4 = 2131755327(0x7f10013f, float:1.914153E38)
        L_0x0047:
            int r0 = r6.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r6.size()
            X.AnonymousClass000.A1P(r1, r0, r7)
            java.lang.String r4 = r5.A0L(r1, r4, r2)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89104bW.A78():void");
    }

    public final void A79() {
        boolean A1a = C86644Kx.A1a(this.A05);
        C990254d r0 = this.A04;
        if (r0 != null) {
            r0.A0D(A1a);
            this.A04 = null;
        }
        AnonymousClass54V r1 = new AnonymousClass54V(this, this.A0V);
        this.A05 = r1;
        C18270x1.A0w(r1, this.A04);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    public void onBackPressed() {
        if (C86604Kt.A1Y(this.A0G.A04)) {
            this.A0G.A01(true);
            return;
        }
        Set set = this.A0T;
        Set set2 = this.A0V;
        if (!set.containsAll(set2) || !set2.containsAll(set)) {
            Boo(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
        } else {
            finish();
        }
    }

    public boolean onSearchRequested() {
        this.A0G.A02(false);
        return false;
    }

    public C89104bW() {
        HashSet A0K2 = AnonymousClass002.A0K();
        this.A0U = A0K2;
        Objects.requireNonNull(A0K2);
        this.A0S = new C117645sG((Object) A0K2, 8);
        this.A0N = AnonymousClass000.A0A();
        this.A0Q = AnonymousClass681.A00(this, 0);
        this.A0P = new C189058zv(this, 0);
        this.A0R = new AnonymousClass901(this, 0);
    }

    public void A77() {
        A79();
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, C86614Ku.A03(this)));
        listView.addFooterView(view, (Object) null, false);
        invalidateOptionsMenu();
        listView.setAdapter(this.A0O);
        AnonymousClass696.A00(listView, this, 0);
        A78();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0B.A07(this.A0Q);
        this.A08.A07(this.A0P);
        this.A0F.A07(this.A0R);
        this.A0D.A00();
        AnonymousClass54V r0 = this.A05;
        if (r0 != null) {
            r0.A0D(true);
            this.A05 = null;
        }
        C990254d r02 = this.A04;
        if (r02 != null) {
            r02.A0D(true);
            this.A04 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == R.id.menuitem_select_all) {
            Set set = this.A0V;
            if (set.size() != this.A0L.size()) {
                int i = 0;
                while (true) {
                    AnonymousClass4OZ r1 = this.A0O;
                    if (i >= r1.getCount()) {
                        break;
                    }
                    set.add(AnonymousClass3ZH.A03(AnonymousClass4L0.A0L(r1.A00, i)));
                    i++;
                }
            } else {
                set.clear();
            }
            this.A0O.notifyDataSetChanged();
            A78();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            Set set2 = this.A0T;
            Set set3 = this.A0V;
            if (!set2.containsAll(set3) || !set3.containsAll(set2)) {
                Boo(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
                return true;
            }
            finish();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        CharSequence charSequence;
        super.onRestoreInstanceState(bundle);
        C105225Ub r2 = this.A0G;
        if (bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            r2.A02(false);
            r2.A00 = bundle.getInt("search_button_x_pos");
            r2.A02.A0H(charSequence);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0V;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C627336j.A0A(set));
        }
        this.A0G.A00(bundle);
    }
}
