package com.whatsapp.conversation.conversationrow.album;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0WA;
import X.AnonymousClass0X0;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass314;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4Lg;
import X.AnonymousClass4SG;
import X.AnonymousClass4T4;
import X.AnonymousClass4Ve;
import X.AnonymousClass5G5;
import X.AnonymousClass5IY;
import X.AnonymousClass5OM;
import X.AnonymousClass5QO;
import X.AnonymousClass5RO;
import X.AnonymousClass5S9;
import X.AnonymousClass5TZ;
import X.AnonymousClass5UP;
import X.AnonymousClass5Ul;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZU;
import X.AnonymousClass657;
import X.AnonymousClass677;
import X.AnonymousClass679;
import X.AnonymousClass681;
import X.AnonymousClass685;
import X.AnonymousClass687;
import X.AnonymousClass68U;
import X.AnonymousClass68W;
import X.AnonymousClass6AE;
import X.AnonymousClass6C6;
import X.C04740Ql;
import X.C103185Lw;
import X.C106405Yw;
import X.C107275b2;
import X.C107395bF;
import X.C107405bG;
import X.C107525bS;
import X.C107695bk;
import X.C108845de;
import X.C110205fr;
import X.C110455gG;
import X.C112975kg;
import X.C113145kx;
import X.C114295mo;
import X.C116985rC;
import X.C1229266j;
import X.C1233167y;
import X.C124166Bf;
import X.C135166kE;
import X.C15910sA;
import X.C16850u7;
import X.C172068Jm;
import X.C181678n9;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C187958y5;
import X.C27821ej;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C30341mI;
import X.C45852ag;
import X.C47122ck;
import X.C52532ld;
import X.C53502nC;
import X.C54232oO;
import X.C55702qm;
import X.C55832qz;
import X.C55852r1;
import X.C56602sG;
import X.C58152un;
import X.C58422vE;
import X.C60152y5;
import X.C620733j;
import X.C621433s;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C71333bw;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C87124Oc;
import X.C88744aj;
import X.C88834as;
import X.C89224c7;
import X.C93334oL;
import X.C93724pC;
import X.C93744pE;
import X.C95814uZ;
import X.C97154xi;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MediaAlbumActivity extends C93334oL implements AnonymousClass677, C16850u7, C181678n9 {
    public Bundle A00;
    public View A01;
    public ListView A02;
    public Toolbar A03;
    public C116985rC A04;
    public C103185Lw A05;
    public AnonymousClass5Ul A06;
    public C29301ib A07;
    public C29421in A08;
    public AnonymousClass5G5 A09;
    public MessageSelectionViewModel A0A;
    public C87124Oc A0B;
    public C93744pE A0C;
    public AnonymousClass4Lg A0D;
    public C45852ag A0E;
    public C113145kx A0F;
    public C89224c7 A0G;
    public AnonymousClass5IY A0H;
    public C27821ej A0I;
    public AnonymousClass5S9 A0J;
    public C29241iV A0K;
    public C97154xi A0L;
    public C95814uZ A0M;
    public C95814uZ A0N;
    public C53502nC A0O;
    public C55852r1 A0P;
    public C52532ld A0Q;
    public AnonymousClass5UP A0R;
    public C60152y5 A0S;
    public AnonymousClass5TZ A0T;
    public C187958y5 A0U;
    public boolean A0V;
    public final C54232oO A0W;
    public final C56602sG A0X;
    public final AnonymousClass657 A0Y;
    public final AnonymousClass4FW A0Z;
    public final C55702qm A0a;
    public final HashSet A0b;
    public final HashSet A0c;

    public void onStart() {
        super.onStart();
        AnonymousClass5Y0 r8 = this.A0C;
        C112975kg r0 = this.A00;
        C64773Ex r2 = r0.A0C;
        AnonymousClass5ZU r3 = r0.A0F;
        C620733j r7 = this.A00;
        this.A0F = new AnonymousClass685(this, r2, r3, new AnonymousClass5RO(), this.A05.A00(this), this.A0C, r7, r8, this, 0);
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            AnonymousClass4SG.A3i(this);
            this.A0P = (C55852r1) r1.AHM.get();
            this.A0Q = (C52532ld) r1.AZr.get();
            this.A06 = C86644Kx.A0L(r1);
            this.A0I = C86604Kt.A0X(r1);
            this.A0U = C86614Ku.A0o(r1);
            this.A0R = C86634Kw.A0n(r1);
            this.A08 = C86614Ku.A0S(r1);
            this.A07 = C86624Kv.A0N(r1);
            this.A0L = C107695bk.A25(r2);
            this.A0T = C107695bk.A5D(r2);
            this.A0S = C64333Db.A74(r1);
            this.A0K = C86624Kv.A0T(r1);
            this.A0O = (C53502nC) r2.A82.get();
            this.A09 = (AnonymousClass5G5) r2.A2n.get();
            this.A0C = new C93744pE((C93724pC) r1.A00.A2l.get());
            this.A0E = (C45852ag) r2.A0P.get();
            this.A04 = C88744aj.A00;
            this.A05 = (C103185Lw) A2X.A0k.get();
            this.A0H = C107695bk.A1m(r2);
        }
    }

    public final int A75() {
        if (this.A0D.A0X(6650)) {
            Rect A0N2 = AnonymousClass001.A0N();
            AnonymousClass001.A0Q(this).getWindowVisibleDisplayFrame(A0N2);
            return A0N2.top;
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C18320x8.A00(this, identifier);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A77() {
        /*
            r11 = this;
            X.4Oc r0 = r11.A0B
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.4Oc r0 = r11.A0B
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x0017:
            boolean r0 = r2.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x002f
            X.34x r0 = X.C18300x5.A0T(r2)
            byte r1 = r0.A1I
            if (r1 != r6) goto L_0x0029
            int r10 = r10 + 1
            goto L_0x0017
        L_0x0029:
            r0 = 3
            if (r1 != r0) goto L_0x0017
            int r8 = r8 + 1
            goto L_0x0017
        L_0x002f:
            X.4Oc r0 = r11.A0B
            java.util.List r0 = r0.A00
            X.34x r4 = X.C18320x8.A0R(r0, r7)
            if (r8 != 0) goto L_0x007d
            X.33j r9 = r11.A00
            r5 = 2131755241(0x7f1000e9, float:1.9141356E38)
            long r2 = (long) r10
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
        L_0x0045:
            r1[r7] = r0
            java.lang.String r5 = r9.A0L(r1, r5, r2)
        L_0x004b:
            long r2 = r4.A0K
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C107175ap.A00(r0, r2)
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r5)
            java.lang.String r1 = "  "
            r3.append(r1)
            r0 = 2131895788(0x7f1225ec, float:1.9426419E38)
            X.AnonymousClass0x2.A0s(r11, r3, r0)
            r3.append(r1)
            X.33j r2 = r11.A00
            long r0 = r4.A0K
            java.lang.String r0 = X.C107565bW.A0E(r2, r0)
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r3)
        L_0x0075:
            X.0R8 r0 = X.C86634Kw.A0R(r11)
            r0.A0I(r5)
            return
        L_0x007d:
            if (r10 != 0) goto L_0x008c
            X.33j r9 = r11.A00
            r5 = 2131755244(0x7f1000ec, float:1.9141362E38)
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0045
        L_0x008c:
            r3 = 2131891353(0x7f121499, float:1.9417424E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.33j r1 = r11.A00
            r0 = 2131755241(0x7f1000e9, float:1.9141356E38)
            java.lang.String r0 = X.C86604Kt.A0q(r1, r10, r7, r0)
            r2[r7] = r0
            X.33j r1 = r11.A00
            r0 = 2131755244(0x7f1000ec, float:1.9141362E38)
            java.lang.String r0 = X.C86604Kt.A0q(r1, r8, r7, r0)
            java.lang.String r5 = X.AnonymousClass002.A0F(r11, r0, r2, r6, r3)
            goto L_0x004b
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A77():void");
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public /* bridge */ /* synthetic */ void BJZ(Object obj) {
        this.A05.A00(this).B2s(new AnonymousClass68U(0), Collections.singleton(obj), 1);
    }

    public C04740Ql BQO(Bundle bundle, int i) {
        C55832qz r2 = this.A00.A0y;
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        C626936e.A06(longArrayExtra);
        return new AnonymousClass4Ve(this, r2, longArrayExtra);
    }

    public /* bridge */ /* synthetic */ void BVX(C04740Ql r10, Object obj) {
        int headerViewsCount;
        int A75;
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            C87124Oc r8 = this.A0B;
            r8.A00 = list;
            r8.notifyDataSetChanged();
            MediaAlbumActivity mediaAlbumActivity = r8.A02;
            if (mediaAlbumActivity.A00 != null) {
                mediaAlbumActivity.getListView().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
                mediaAlbumActivity.A00 = null;
            } else {
                int A012 = C18320x8.A01(mediaAlbumActivity.getIntent(), "start_index");
                if (A012 < r8.getCount()) {
                    AnonymousClass5OM r6 = r8.A01;
                    Point A072 = AnonymousClass4L0.A07();
                    MediaAlbumActivity mediaAlbumActivity2 = r6.A05;
                    C86604Kt.A0x(mediaAlbumActivity2, A072);
                    int i = A072.y;
                    int i2 = A072.x;
                    ListView listView = mediaAlbumActivity2.getListView();
                    C626936e.A04(listView);
                    if (i >= i2) {
                        View view = r8.getView(A012, (View) null, listView);
                        boolean z = false;
                        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), 0);
                        r6.A01 = (i * 4) / 5;
                        int measuredHeight = view.getMeasuredHeight();
                        r6.A02 = measuredHeight;
                        int i3 = r6.A01;
                        if (i3 < measuredHeight) {
                            r6.A00 = A012;
                        } else {
                            r6.A00 = -1;
                        }
                        if (A012 != 0) {
                            int min = Math.min(measuredHeight, i3);
                            if (A012 == r8.getCount() - 1) {
                                z = true;
                            }
                            r6.A03 = r6.A00(i, min, z);
                            headerViewsCount = A012 + listView.getHeaderViewsCount();
                            A75 = r6.A03;
                        } else {
                            r6.A03 = 0;
                        }
                    } else {
                        headerViewsCount = A012 + listView.getHeaderViewsCount();
                        A75 = mediaAlbumActivity2.A75() + C86614Ku.A03(mediaAlbumActivity2);
                    }
                    listView.setSelectionFromTop(headerViewsCount, A75);
                }
            }
            A77();
            AnonymousClass6AE.A00(getListView().getViewTreeObserver(), this, 2);
            return;
        }
        finish();
    }

    public boolean BbB() {
        Log.i("MediaAlbumActivity/starred/onSelectionRequested");
        return this.A0A.A0E(C18280x3.A00(((C172068Jm) this.A0U).A01.A0Y(C58422vE.A01, 2889) ? 1 : 0));
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A00.A0Q.A01;
    }

    public C15910sA getLifecycleOwner() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        int length;
        if (C107275b2.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220);
            autoTransition.setInterpolator(new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        this.A00 = bundle;
        super.onCreate(bundle);
        A5U();
        setContentView((int) R.layout.f8nameremoved);
        this.A03 = AnonymousClass1Hf.A28(this);
        this.A01 = findViewById(R.id.root);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, this.A03);
        A2S.A0N(true);
        this.A08.A06(this.A0X);
        this.A00.A0a.A06(this.A0Z);
        this.A07.A06(this.A0W);
        this.A0K.A06(this.A0a);
        AnonymousClass001.A0Q(this).setSystemUiVisibility(1792);
        C107405bG.A04(this);
        getWindow().addFlags(134217728);
        String stringExtra = getIntent().getStringExtra("chat_jid");
        C106405Yw r1 = C95814uZ.A00;
        this.A0M = r1.A05(stringExtra);
        C95814uZ A052 = r1.A05(AnonymousClass0x7.A0l(this));
        this.A0N = A052;
        if (A052 == null) {
            A2S.A0B(R.string.f11nameremoved);
        } else if (this.A0D.A0X(6650)) {
            C71333bw.A00(this.A04, this, A2S, 33);
        } else {
            C112975kg r0 = this.A00;
            A2S.A0J(AnonymousClass5ZU.A01(r0.A0C, r0.A0F, this.A0N));
        }
        this.A0B = new C87124Oc(this);
        ListView listView = getListView();
        this.A02 = listView;
        listView.setFastScrollEnabled(false);
        this.A02.setScrollbarFadingEnabled(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(0, 0, 0, C86614Ku.A03(this));
        this.A02.addHeaderView(frameLayout, (Object) null, false);
        FrameLayout frameLayout2 = new FrameLayout(this);
        this.A02.addFooterView(frameLayout2, (Object) null, false);
        View findViewById = findViewById(R.id.title_background);
        AnonymousClass0YZ.A0E(this.A02, new C110455gG(frameLayout, frameLayout2, findViewById, this));
        AnonymousClass4Lg r02 = new AnonymousClass4Lg(C86634Kw.A03(this));
        this.A0D = r02;
        A2S.A0D(r02);
        int A032 = C86634Kw.A03(this);
        int A033 = C86634Kw.A03(this);
        this.A02.setOnScrollListener(new C110205fr(frameLayout, this, AnonymousClass0Y8.A04(this, R.color.f5nameremoved), A033, A032));
        A74(this.A0B);
        View findViewById2 = findViewById(R.id.background);
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
        verticalSwipeDismissBehavior.A05 = new C114295mo(findViewById2, findViewById, this);
        C86634Kw.A1C(this.A02, verticalSwipeDismissBehavior);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass0x9.A0H(this).A01(MessageSelectionViewModel.class);
        this.A0A = messageSelectionViewModel;
        AnonymousClass6C6.A01(this, messageSelectionViewModel.A01, 188);
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        if (longArrayExtra == null || (length = longArrayExtra.length) == 0) {
            finish();
            return;
        }
        A2S.A0I(C86604Kt.A0q(this.A00, length, 0, R.plurals.f9nameremoved));
        AnonymousClass0WA.A00(this).A03(this);
        AnonymousClass4SG.A3d(this);
    }

    public MediaAlbumActivity(int i) {
        this.A0V = false;
        AnonymousClass68W.A00(this, 42);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        String A0n = C18310x6.A0n(this);
        A5u.A00 = 18;
        A5u.A01 = A0n;
        A5u.A06 = true;
        return A5u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1.A02(r2, false) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A76() {
        /*
            r6 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.4Oc r0 = r6.A0B
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0040
            java.util.Iterator r4 = r0.iterator()
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            X.1mV r3 = X.C18320x8.A0S(r4)
            X.33C r2 = X.C30471mV.A00(r3)
            boolean r0 = X.C627636p.A10(r3)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0032
            X.2r1 r1 = r6.A0P
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r1.A02(r2, r0)
            if (r0 != 0) goto L_0x003c
        L_0x0032:
            X.2ld r1 = r6.A0Q
            X.1VX r0 = r6.A0D
            boolean r0 = X.C624234y.A00(r0, r1, r3)
            if (r0 == 0) goto L_0x000e
        L_0x003c:
            r5.add(r3)
            goto L_0x000e
        L_0x0040:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A76():java.util.List");
    }

    public final void A78(AnonymousClass3ZH r5, C95814uZ r6, C624134x r7) {
        if ((!r5.A0U() || this.A00.A0Y.A0C((GroupJid) r6)) && !this.A00.A11.A04(r5, r6)) {
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.status.playback.MessageReplyActivity");
            A072.putExtra("isMediaViewReply", false);
            startActivity(C107395bF.A00(A072, r7.A1J));
            return;
        }
        C626936e.A0E(!(r7 instanceof C30341mI), "should not reply to systemMessage");
        C95814uZ A0n = r7.A0n();
        C626936e.A06(A0n);
        this.A09.A00.put(A0n, r7);
        new C627736r();
        Intent A012 = C627336j.A01(this, A0n, 0);
        A012.putExtra("extra_quoted_message_row_id", r7.A0H);
        this.A00.A0B(this, A012);
    }

    public void BVf(C04740Ql r1) {
    }

    public void BZO(int i) {
        AnonymousClass5S9 r1;
        super.BZO(i);
        if (i == 0 && (r1 = this.A0J) != null) {
            r1.A01(false);
        }
    }

    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            A5b(new AnonymousClass4T4(this));
        }
        super.finishAfterTransition();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r6;
        int intExtra;
        C1229266j A002;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i == 906) {
                AnonymousClass5QO r2 = (AnonymousClass5QO) this.A0A.A00.A07();
                if (r2 != null && !r2.A04.isEmpty()) {
                    if (i2 == 2) {
                        C621433s.A01(this, 106);
                    } else if (!(i2 != 3 || intent == null || (intExtra = intent.getIntExtra("RESULT_EXTRA_ACTION_ID", -1)) == -1)) {
                        if (this.A05.A00(this).B2s(new AnonymousClass68U(1), r2.A00(), intExtra) && (A002 = this.A0C.A00(intExtra)) != null && !A002.B7f()) {
                            return;
                        }
                    }
                }
                this.A0A.A0D();
            }
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C116985rC r1 = this.A04;
                if (r1.A07()) {
                    r1.A04();
                    getForwardMessages();
                    throw AnonymousClass001.A0g("handleAdvertiseForwardClick");
                }
            } else {
                Collection A042 = this.A00.A04();
                if (!A042.isEmpty()) {
                    List A0r = C86604Kt.A0r(intent);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    if (AnonymousClass000.A1W(C627336j.A03(A0r))) {
                        C626936e.A06(intent);
                        Bundle extras = intent.getExtras();
                        AnonymousClass5TZ r0 = this.A0T;
                        C626936e.A06(extras);
                        r6 = r0.A00(extras);
                    } else {
                        r6 = null;
                    }
                    this.A00.A07.A09(this.A06, r6, stringExtra, AnonymousClass314.A00(A042), A0r, booleanExtra);
                    if (A0r.size() != 1 || (A0r.get(0) instanceof C135166kE)) {
                        Bqv(A0r);
                    } else if (this.A0D.A0X(6650)) {
                        C71333bw.A00(this.A04, this, A0r, 34);
                    } else {
                        this.A00.A0B(this, C627736r.A0N(this, this.A00.A0C.A0A((C95814uZ) A0r.get(0))));
                    }
                } else {
                    Log.w("MediaAlbumActivity/forward/failed");
                    this.A05.A0H(R.string.f11nameremoved, 0);
                }
            }
            B3M();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int size = A76().size();
        if (size <= 0 || !this.A0D.A0X(4048)) {
            return false;
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, size, 0);
        menu.add(0, 0, 0, getString(R.string.f11nameremoved, objArr));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.A07(this.A0X);
        this.A00.A0a.A07(this.A0Z);
        this.A07.A07(this.A0W);
        this.A0K.A07(this.A0a);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 16908332) {
                AnonymousClass0X0.A00(this);
            }
            return true;
        }
        this.A0E.A00(this, A76(), true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView listView = getListView();
        bundle.putInt("top_index", listView.getFirstVisiblePosition());
        int i = 0;
        View childAt = listView.getChildAt(0);
        if (childAt != null) {
            i = childAt.getTop() - listView.getPaddingTop();
        }
        bundle.putInt("top_offset", i);
    }

    public int A5t() {
        return 78318969;
    }

    public MediaAlbumActivity() {
        this(0);
        this.A0b = AnonymousClass002.A0K();
        this.A0c = AnonymousClass002.A0K();
        this.A0Z = new C124166Bf(this, 5);
        this.A0X = AnonymousClass681.A00(this, 19);
        this.A0W = new C1233167y(this, 7);
        this.A0a = new AnonymousClass687(this, 8);
        this.A0Y = new C107525bS(this, 0);
    }
}
