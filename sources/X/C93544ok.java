package X;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4ok  reason: invalid class name and case insensitive filesystem */
public abstract class C93544ok extends C93044nm implements AnonymousClass677, C16850u7 {
    public MenuItem A00;
    public C116985rC A01;
    public AnonymousClass5M7 A02;
    public AnonymousClass5Ul A03;
    public C29301ib A04;
    public AnonymousClass675 A05;
    public C29421in A06;
    public C105365Uq A07;
    public MessageSelectionViewModel A08;
    public C93754pF A09;
    public C49482gb A0A;
    public C55062pj A0B;
    public C66533Lu A0C;
    public C72303dV A0D;
    public C29241iV A0E;
    public C95814uZ A0F;
    public AnonymousClass5TZ A0G;
    public String A0H;
    public ArrayList A0I;
    public final AbsListView.OnScrollListener A0J = new C110215fs(this);
    public final C54232oO A0K = new C1233167y(this, 9);
    public final C56602sG A0L = AnonymousClass681.A00(this, 21);
    public final AnonymousClass657 A0M = new C107525bS(this, 1);
    public final C55702qm A0N = new AnonymousClass687(this, 10);

    public AnonymousClass675 A75() {
        AnonymousClass543 r9 = new AnonymousClass543(this, 48, this.A00);
        C56972sr r3 = this.A01;
        C112975kg r0 = this.A00;
        return new C19400zX(this, r3, r0.A0C, this.A07, r0.A0M, this, r0.A0y, r9);
    }

    public C04740Ql BQO(Bundle bundle, int i) {
        AnonymousClass65Y r4;
        String string;
        C620733j r2 = this.A00;
        if (this instanceof EnforcedMessagesActivity) {
            r4 = ((EnforcedMessagesActivity) this).A03;
            if (r4 == null) {
                throw C18270x1.A0S("enforcedMessageCursorProvider");
            }
        } else if (this instanceof StarredMessagesActivity) {
            r4 = ((StarredMessagesActivity) this).A03;
        } else {
            r4 = ((KeptMessagesActivity) this).A03;
        }
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("query");
        }
        return new C87714Vg(this, r2, this.A0F, r4, string);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r6;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            Collection A042 = this.A00.A04();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C116985rC r1 = this.A01;
                if (r1.A07()) {
                    r1.A04();
                    throw AnonymousClass001.A0g("handleAdvertiseForwardClick");
                }
            } else if (A042.isEmpty() || stringArrayListExtra == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(A76());
                C18260x0.A1M(A0o, "/forward/failed");
                this.A05.A0H(R.string.f11nameremoved, 0);
            } else {
                List A0B2 = C627336j.A0B(C95814uZ.class, stringArrayListExtra);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                if (AnonymousClass000.A1W(C627336j.A03(A0B2))) {
                    C626936e.A06(intent);
                    r6 = this.A0G.A00(intent.getExtras());
                } else {
                    r6 = null;
                }
                this.A00.A07.A09(this.A03, r6, stringExtra, AnonymousClass314.A00(A042), A0B2, booleanExtra);
                if (A0B2.size() != 1 || (A0B2.get(0) instanceof C135166kE)) {
                    Bqv(A0B2);
                } else {
                    this.A00.A0B(this, C86604Kt.A08(this, this.A00.A0C, C86664Kz.A1B(), A0B2));
                }
            }
            B3M();
        }
    }

    public String A76() {
        if (this instanceof EnforcedMessagesActivity) {
            return "EnforcedNewsletterMessage";
        }
        if (this instanceof StarredMessagesActivity) {
            return "starred";
        }
        return "kept";
    }

    public void A77() {
        Bundle bundle;
        if (!TextUtils.isEmpty(this.A0H)) {
            bundle = AnonymousClass002.A08();
            bundle.putString("query", this.A0H);
        } else {
            bundle = null;
        }
        AnonymousClass0WA.A00(this).A01(bundle, this);
    }

    public void A78() {
        if (this instanceof EnforcedMessagesActivity) {
            C18290x4.A0X(this.A00, R.id.newsletter_enforced_messages_empty_state).A06(AnonymousClass001.A08(this.A05.isEmpty() ? 1 : 0));
        } else if (!(this instanceof StarredMessagesActivity)) {
            KeptMessagesActivity keptMessagesActivity = (KeptMessagesActivity) this;
            ScrollView scrollView = keptMessagesActivity.A01;
            if (scrollView != null && keptMessagesActivity.A02 != null && keptMessagesActivity.A00 != null) {
                if (keptMessagesActivity.A05.B6e() == null) {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(8);
                    keptMessagesActivity.A00.setVisibility(0);
                    return;
                }
                ArrayList arrayList = keptMessagesActivity.A0I;
                if (arrayList == null || arrayList.isEmpty()) {
                    scrollView.setVisibility(0);
                    keptMessagesActivity.A02.setVisibility(8);
                } else {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(0);
                    WaTextView waTextView = keptMessagesActivity.A02;
                    Object[] A0L2 = AnonymousClass002.A0L();
                    A0L2[0] = keptMessagesActivity.A0H;
                    AnonymousClass001.A0y(keptMessagesActivity, waTextView, A0L2, R.string.f11nameremoved);
                }
                keptMessagesActivity.A00.setVisibility(8);
            }
        } else if (this.A05.B6e() == null) {
            C18280x3.A0r(this, R.id.empty_view, 8);
            C18280x3.A0r(this, R.id.search_no_matches, 8);
            C18280x3.A0r(this, R.id.progress, 0);
        } else {
            ArrayList arrayList2 = this.A0I;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                C18280x3.A0r(this, R.id.empty_view, 0);
                C18280x3.A0r(this, R.id.search_no_matches, 8);
            } else {
                C18280x3.A0r(this, R.id.empty_view, 8);
                TextView A0L3 = C18310x6.A0L(this, R.id.search_no_matches);
                A0L3.setVisibility(0);
                Object[] A0L4 = AnonymousClass002.A0L();
                A0L4[0] = this.A0H;
                AnonymousClass001.A0y(this, A0L3, A0L4, R.string.f11nameremoved);
            }
            C18280x3.A0r(this, R.id.progress, 8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BVX(X.C04740Ql r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.database.Cursor r5 = (android.database.Cursor) r5
            X.675 r0 = r3.A05
            r0.BqV(r5)
            r3.A78()
            java.lang.String r0 = r3.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003d
            X.675 r0 = r3.A05
            boolean r1 = r0.isEmpty()
            android.view.MenuItem r0 = r3.A00
            if (r1 == 0) goto L_0x003e
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isActionViewExpanded()
            if (r0 == 0) goto L_0x002a
            android.view.MenuItem r0 = r3.A00
            r0.collapseActionView()
        L_0x002a:
            android.view.MenuItem r0 = r3.A00
        L_0x002c:
            r0.setVisible(r2)
        L_0x002f:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r1 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r1
            android.view.MenuItem r0 = r1.A00
            if (r0 == 0) goto L_0x003d
            r0.setVisible(r2)
        L_0x003d:
            return
        L_0x003e:
            r2 = 1
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93544ok.BVX(X.0Ql, java.lang.Object):void");
    }

    public void BVf(C04740Ql r3) {
        this.A05.BqV((Cursor) null);
    }

    public C15910sA getLifecycleOwner() {
        return this;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        if (this.A0C.A0N() && !(this instanceof EnforcedMessagesActivity)) {
            SearchView searchView = new SearchView(this);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            int A022 = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
            C18320x8.A11(getResources(), AnonymousClass002.A09(searchView, R.id.search_src_text), A022);
            searchView.setQueryHint(getString(R.string.f11nameremoved));
            searchView.A0B = new AnonymousClass5CM(this, 6);
            MenuItem A0L2 = C86634Kw.A0L(menu);
            this.A00 = A0L2;
            AnonymousClass5QT r1 = this.A00;
            synchronized (r1) {
                listAdapter = r1.A00;
            }
            A0L2.setVisible(!listAdapter.isEmpty());
            this.A00.setActionView(searchView);
            this.A00.setShowAsAction(10);
            this.A00.setOnActionExpandListener(new AnonymousClass6AS(this, 0));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0A.A00);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem == null) {
            return false;
        }
        menuItem.expandActionView();
        return false;
    }

    public boolean BbB() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A76());
        C18260x0.A1L(A0o, "/selectionrequested");
        return this.A08.A0E(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A6N();
        AnonymousClass1Ha.A1z(this);
        this.A06.A06(this.A0L);
        this.A04.A06(this.A0K);
        this.A0E.A06(this.A0N);
        C114015mM r3 = this.A00.A0H;
        StringBuilder A0o = AnonymousClass001.A0o();
        String A76 = A76();
        A0o.append(A76);
        this.A07 = r3.A06(this, AnonymousClass000.A0X("-messages-activity", A0o));
        if (AnonymousClass4SG.A2b(this) != null) {
            C72303dV r0 = this.A0D;
            r0.A05();
            if (r0.A09 && this.A09.A02()) {
                this.A0F = C106405Yw.A00(this);
                this.A0A.A00(bundle);
                this.A0B.A02(this.A0F, AnonymousClass000.A0O(this));
                this.A05 = A75();
                AnonymousClass0WA.A00(this).A03(this);
                MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass0x9.A0H(this).A01(MessageSelectionViewModel.class);
                this.A08 = messageSelectionViewModel;
                AnonymousClass6C6.A01(this, messageSelectionViewModel.A01, 189);
                return;
            }
        }
        C18260x0.A1L(AnonymousClass000.A0l(A76), "/create/no-me-or-msgstore-db");
        AnonymousClass4SG.A36(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
        this.A06.A07(this.A0L);
        this.A04.A07(this.A0K);
        this.A0E.A07(this.A0N);
        this.A00.A0S.A06();
        if (isFinishing()) {
            this.A0B.A03(this.A0F, AnonymousClass000.A0O(this));
        }
    }

    public void onPause() {
        super.onPause();
        if (this.A00.A0S.A0B()) {
            this.A00.A0S.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A0S.A0B()) {
            this.A00.A0S.A05();
        }
        this.A05.notifyDataSetChanged();
    }
}
