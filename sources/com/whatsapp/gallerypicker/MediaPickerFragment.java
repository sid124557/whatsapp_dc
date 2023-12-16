package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R2;
import X.AnonymousClass0R6;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5YF;
import X.AnonymousClass5Yj;
import X.AnonymousClass67N;
import X.C003203q;
import X.C009707r;
import X.C08310eF;
import X.C105115Tq;
import X.C105995Xf;
import X.C106105Xq;
import X.C107335b8;
import X.C113975mI;
import X.C134366iu;
import X.C154317cy;
import X.C162457s7;
import X.C16910uE;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C185448tf;
import X.C186058ug;
import X.C48682fI;
import X.C56422rx;
import X.C56612sH;
import X.C58392vB;
import X.C69263Wi;
import X.C69993Zl;
import X.C73723fy;
import X.C73783g4;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C87884Wm;
import X.C88084Xg;
import X.C95294tG;
import X.C95804uY;
import X.C95814uZ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.NewMediaPickerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MediaPickerFragment extends Hilt_MediaPickerFragment implements C185448tf {
    public int A00;
    public int A01;
    public long A02;
    public BroadcastReceiver A03;
    public C16910uE A04;
    public AnonymousClass0R2 A05;
    public C105995Xf A06;
    public C56422rx A07;
    public C56612sH A08;
    public C88084Xg A09;
    public C95814uZ A0A;
    public C48682fI A0B;
    public C58392vB A0C;
    public C105115Tq A0D;
    public Integer A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public final C106105Xq A0K = new C106105Xq();
    public final HashSet A0L = AnonymousClass0x9.A17();

    public void A0k(int i, int i2, Intent intent) {
        C87884Wm r1;
        if (i == 1) {
            C003203q A0R = A0R();
            C162457s7.A0K(A0R, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (i2 == -1) {
                A0R.setResult(-1, intent);
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        A0R.setResult(2);
                    } else {
                        return;
                    }
                } else if (intent != null) {
                    ArrayList<Object> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    this.A0E = Integer.valueOf(C18320x8.A01(intent, "media_quality_selection"));
                    HashSet hashSet = this.A0L;
                    hashSet.clear();
                    if (parcelableArrayListExtra != null) {
                        hashSet.addAll(parcelableArrayListExtra);
                    }
                    if (this instanceof NewMediaPickerFragment) {
                        NewMediaPickerFragment newMediaPickerFragment = (NewMediaPickerFragment) this;
                        if (parcelableArrayListExtra != null) {
                            int size = parcelableArrayListExtra.size();
                            Set set = newMediaPickerFragment.A05;
                            if (size < set.size()) {
                                ArrayList A0c = C73783g4.A0c(parcelableArrayListExtra);
                                for (Object A1D : parcelableArrayListExtra) {
                                    AnonymousClass0x7.A1D(A1D, A0c);
                                }
                                Set A0P = C73723fy.A0P(A0c);
                                ArrayList A0s = AnonymousClass001.A0s();
                                for (Object next : set) {
                                    if (A0P.contains(((C186058ug) next).B3d().toString())) {
                                        A0s.add(next);
                                    }
                                }
                                set.clear();
                                set.addAll(A0s);
                                RecyclerView recyclerView = newMediaPickerFragment.A04;
                                AnonymousClass0R6 r12 = null;
                                if (recyclerView != null) {
                                    r12 = recyclerView.A0N;
                                }
                                if ((r12 instanceof C87884Wm) && (r1 = (C87884Wm) r12) != null) {
                                    C86644Kx.A1F(r1, set, r1.A02);
                                }
                            }
                        }
                    }
                    AnonymousClass0R2 r0 = this.A05;
                    if (r0 == null) {
                        A1Z();
                    } else {
                        r0.A06();
                    }
                    this.A0K.A02(intent.getExtras());
                    A1P();
                    return;
                } else {
                    return;
                }
            } else if (!A1V()) {
                this.A0K.A00.clear();
                return;
            } else {
                return;
            }
            A0R.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
        if (A1c() != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1
            r9.A0X = r0
            X.2sH r0 = r9.A08
            if (r0 == 0) goto L_0x0160
            long r0 = java.lang.System.currentTimeMillis()
            r9.A02 = r0
            X.03q r1 = r9.A0R()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C162457s7.A0K(r1, r0)
            android.content.Intent r6 = r1.getIntent()
            X.1VX r0 = r9.A1L()
            int r1 = X.C86664Kz.A0I(r0)
            java.lang.String r0 = "max_items"
            int r0 = r6.getIntExtra(r0, r1)
            r9.A01 = r0
            java.lang.String r0 = "skip_max_items_new_limit"
            r3 = 0
            boolean r0 = r6.getBooleanExtra(r0, r3)
            r9.A0J = r0
            java.lang.String r0 = "preview"
            r4 = 1
            boolean r0 = r6.getBooleanExtra(r0, r4)
            r9.A0I = r0
            java.lang.String r0 = "is_in_multi_select_mode_only"
            boolean r0 = r6.getBooleanExtra(r0, r3)
            if (r0 != 0) goto L_0x004b
            boolean r1 = r9.A1c()
            r0 = 0
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            r9.A0G = r0
            android.content.Context r1 = r9.A0G()
            X.5g6 r0 = new X.5g6
            r0.<init>(r1, r9)
            r9.A04 = r0
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x0060
            r9.A1Z()
        L_0x0060:
            X.5Yw r1 = X.C95814uZ.A00
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.getStringExtra(r0)
            X.4uZ r0 = r1.A05(r0)
            r9.A0A = r0
            java.lang.String r0 = "is_favorite_filter_enabled"
            boolean r0 = r6.getBooleanExtra(r0, r3)
            r9.A0F = r0
            r7 = 7
            r9.A00 = r7
            X.03q r8 = r9.A0R()
            X.AnonymousClass0x9.A1L(r8)
            X.4ea r8 = (X.C89654ea) r8
            android.content.Intent r2 = r8.getIntent()
            if (r2 == 0) goto L_0x0103
            java.lang.String r5 = r2.resolveType(r8)
            if (r5 == 0) goto L_0x00cf
            java.lang.String r0 = "vnd.android.cursor.dir/image"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "image/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ae
        L_0x009e:
            r9.A00 = r4
            r1 = 2131896233(0x7f1227a9, float:1.9427321E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1)
            r8.setTitle(r0)
        L_0x00ae:
            java.lang.String r0 = "vnd.android.cursor.dir/video"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "video/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00cf
        L_0x00be:
            r0 = 4
            r9.A00 = r0
            r1 = 2131896234(0x7f1227aa, float:1.9427323E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1)
            r8.setTitle(r0)
        L_0x00cf:
            android.os.Bundle r5 = r2.getExtras()
            if (r5 == 0) goto L_0x0103
            java.lang.String r0 = "window_title"
            java.lang.String r2 = r5.getString(r0)
            if (r2 == 0) goto L_0x00f8
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00f8
            r8.A6e(r2)
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r1 = r8.findViewById(r0)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x00f8
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00f8
            r1.setTitle((java.lang.CharSequence) r2)
        L_0x00f8:
            java.lang.String r1 = "include_media"
            int r0 = r9.A00
            int r0 = r5.getInt(r1, r0)
            r7 = r7 & r0
            r9.A00 = r7
        L_0x0103:
            java.lang.String r0 = "android.intent.extra.STREAM"
            if (r10 == 0) goto L_0x0154
            java.util.ArrayList r1 = r10.getParcelableArrayList(r0)
        L_0x010b:
            if (r1 == 0) goto L_0x0121
            boolean r0 = X.AnonymousClass0x7.A1S(r1)
            if (r0 == 0) goto L_0x0121
            java.util.HashSet r0 = r9.A0L
            r0.clear()
            r0.addAll(r1)
            r9.A1Z()
            r9.A1P()
        L_0x0121:
            r9.A13(r4)
            r9.A1T(r3)
            com.whatsapp.StickyHeadersRecyclerView r3 = r9.A0C
            if (r3 == 0) goto L_0x013f
            X.5Tq r2 = r9.A0D
            if (r2 == 0) goto L_0x0159
            android.app.Activity r0 = X.C111095hX.A04(r3)
            r1 = 3
            r2.A02(r0)
            X.4Xb r0 = new X.4Xb
            r0.<init>(r2, r1)
            r3.A0q(r0)
        L_0x013f:
            int r0 = r9.A01
            if (r0 <= r4) goto L_0x0153
            X.4Xg r1 = new X.4Xg
            r1.<init>(r9)
            com.whatsapp.StickyHeadersRecyclerView r0 = r9.A0C
            if (r0 == 0) goto L_0x0151
            java.util.ArrayList r0 = r0.A14
            r0.add(r1)
        L_0x0151:
            r9.A09 = r1
        L_0x0153:
            return
        L_0x0154:
            java.util.ArrayList r1 = r6.getParcelableArrayListExtra(r0)
            goto L_0x010b
        L_0x0159:
            java.lang.String r0 = "scrollPerfLoggerManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0160:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A0o(android.os.Bundle):void");
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", AnonymousClass002.A0J(this.A0L));
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C162457s7.A0J(menu, 0);
        if (this.A01 > 1) {
            menu.add(0, R.id.menuitem_select_multiple, 0, C08310eF.A09(this).getString(R.string.f11nameremoved)).setIcon(C107335b8.A04(A0G(), R.drawable.ic_action_select_multiple_teal, AnonymousClass5Yj.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved))).setShowAsAction(2);
        }
    }

    public boolean A1X(C186058ug r6, C95294tG r7) {
        if (((this.A0A instanceof C95804uY) && !A1L().A0X(5643)) || this.A01 <= 1) {
            return false;
        }
        HashSet hashSet = this.A0L;
        Uri B3d = r6.B3d();
        if (!C73723fy.A0U(hashSet, B3d) && this.A09 != null && hashSet.size() < this.A01 && this.A0C != null) {
            int A012 = RecyclerView.A01(r7);
            C88084Xg r1 = this.A09;
            if (r1 != null) {
                r1.A04 = true;
                r1.A03 = A012;
                r1.A00 = C86654Ky.A04(r7);
            }
        }
        if (A1V()) {
            A1a(r6);
            return true;
        }
        C162457s7.A0D(B3d);
        hashSet.add(B3d);
        this.A0K.A04(new AnonymousClass5YF(B3d));
        C003203q A0R = A0R();
        C162457s7.A0K(A0R, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C009707r r12 = (C009707r) A0R;
        C16910uE r0 = this.A04;
        if (r0 == null) {
            throw C18270x1.A0S("actionModeCallback");
        }
        this.A05 = r12.Bpz(r0);
        A1P();
        A1R(hashSet.size());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ba, code lost:
        if (r5 != false) goto L_0x018d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1b(java.util.Set r21) {
        /*
            r20 = this;
            r7 = 0
            r9 = 1
            if (r21 == 0) goto L_0x01b5
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x01b5
            java.util.ArrayList r8 = X.AnonymousClass002.A0J(r21)
            r6 = r20
            X.03q r14 = r6.A0R()
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x02a0
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "origin"
            int r5 = r1.getIntExtra(r0, r9)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "should_send_media"
            boolean r10 = r1.getBooleanExtra(r0, r9)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "should_hide_caption_view"
            boolean r12 = r1.getBooleanExtra(r0, r7)
            X.03q r11 = r6.A0R()
            X.5PE r4 = new X.5PE
            r4.<init>(r11)
            r4.A0G = r8
            X.4uZ r0 = r6.A0A
            java.lang.String r0 = X.C627336j.A07(r0)
            r4.A0C = r0
            int r1 = r6.A01
            java.util.HashSet r13 = r6.A0L
            int r0 = r13.size()
            int r1 = r1 - r0
            r4.A01 = r1
            boolean r0 = r6.A0H
            r4.A0N = r0
            r4.A02 = r5
            X.2sH r0 = r6.A08
            if (r0 == 0) goto L_0x0299
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.A02
            long r0 = r0 - r2
            r4.A04 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "picker_open_time"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            r4.A05 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            long r0 = r1.getLongExtra(r0, r2)
            r4.A06 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.A0D = r0
            r0 = 20
            boolean r0 = X.AnonymousClass001.A1X(r5, r0)
            r4.A0J = r0
            r4.A0M = r10
            r4.A0L = r12
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "number_from_url"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            r4.A0H = r0
            r0 = 35
            if (r5 == r0) goto L_0x01c4
            r0 = 37
            if (r5 == r0) goto L_0x01c4
            r0 = 40
            if (r5 == r0) goto L_0x01c4
            if (r10 == 0) goto L_0x01c4
            r4.A0K = r9
        L_0x00b5:
            X.5Xf r2 = r6.A06
            if (r2 == 0) goto L_0x0292
            boolean r1 = r6.A1V()
            int r0 = r13.size()
            r2.A03(r1, r0)
            X.5Xq r3 = r6.A0K
            java.lang.Object r0 = r8.get(r7)
            android.net.Uri r0 = (android.net.Uri) r0
            X.5YF r5 = r3.A00(r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.util.List r2 = X.C624435a.A03(r0)
            X.2fI r1 = r6.A0B
            if (r1 == 0) goto L_0x028b
            java.lang.String r0 = r5.A0B()
            java.util.List r1 = r1.A00(r0)
            if (r2 == 0) goto L_0x010f
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x010f
            if (r1 == 0) goto L_0x00fa
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x010f
        L_0x00fa:
            X.2fI r1 = r6.A0B
            if (r1 == 0) goto L_0x0284
            java.lang.String r0 = r5.A0C()
            X.C162457s7.A0D(r0)
            r1.A01(r0, r2)
            java.lang.String r0 = r5.A0C()
            r5.A0I(r0)
        L_0x010f:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r1 = r5.A09()
            if (r2 == 0) goto L_0x0130
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0130
            if (r1 == 0) goto L_0x012d
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0130
        L_0x012d:
            r5.A0G(r2)
        L_0x0130:
            java.lang.Integer r0 = r6.A0E
            r4.A0A = r0
            X.AnonymousClass5PE.A00(r3, r4)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "is_send_as_document"
            boolean r5 = r1.getBooleanExtra(r0, r7)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            boolean r1 = r1.getBooleanExtra(r0, r7)
            boolean r0 = X.C107275b2.A00
            if (r0 == 0) goto L_0x01bd
            if (r1 != 0) goto L_0x01bd
            int r0 = r8.size()
            if (r0 != r9) goto L_0x01bd
            android.view.View r0 = r6.A0B
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r10 = r8.get(r7)
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto L_0x01b6
            com.whatsapp.StickyHeadersRecyclerView r0 = r6.A0C
            if (r0 == 0) goto L_0x01b6
            java.util.Iterator r1 = X.C86634Kw.A11(r0)
        L_0x016b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b6
            android.view.View r2 = X.C86654Ky.A0H(r1)
            boolean r0 = r2 instanceof X.C95294tG
            if (r0 == 0) goto L_0x016b
            X.4tG r2 = (X.C95294tG) r2
            android.net.Uri r0 = r2.getUri()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x016b
            r4.A07 = r10
            X.4uZ r3 = r6.A0A
            if (r3 == 0) goto L_0x01cf
            if (r5 == 0) goto L_0x01cf
        L_0x018d:
            X.2rx r1 = r6.A07
            if (r1 == 0) goto L_0x01c8
            int r0 = r8.size()
            boolean r0 = X.AnonymousClass5b1.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x02bb
            r17 = 0
            java.lang.Object r15 = r8.get(r7)
            android.net.Uri r15 = (android.net.Uri) r15
            r18 = r17
            r19 = r7
            r16 = r3
            android.content.Intent r1 = X.C627736r.A0J(r14, r15, r16, r17, r18, r19)
            X.C162457s7.A0D(r1)
            r0 = 36
            r14.startActivityForResult(r1, r0)
        L_0x01b5:
            return
        L_0x01b6:
            X.4uZ r3 = r6.A0A
            if (r3 == 0) goto L_0x027c
            if (r5 == 0) goto L_0x027c
            goto L_0x018d
        L_0x01bd:
            X.4uZ r3 = r6.A0A
            if (r3 == 0) goto L_0x0278
            if (r5 == 0) goto L_0x0278
            goto L_0x018d
        L_0x01c4:
            r4.A0K = r7
            goto L_0x00b5
        L_0x01c8:
            java.lang.String r0 = "verifiedNameManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01cf:
            android.content.Intent r4 = r4.A01()
            X.03q r3 = r6.A0R()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.lang.String r0 = r10.toString()
            X.AnonymousClass0x2.A1G(r2, r0, r8)
            android.view.View r1 = r6.A0J()
            r0 = 2131430562(0x7f0b0ca2, float:1.8482828E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r8)
            android.view.View r1 = r6.A0J()
            r0 = 2131434437(0x7f0b1bc5, float:1.8490688E38)
            android.view.View r5 = r1.findViewById(r0)
            X.03q r0 = r6.A0R()
            X.5MG r1 = new X.5MG
            r1.<init>(r0)
            r0 = 2131896406(0x7f122856, float:1.9427672E38)
            java.lang.String r0 = r1.A03(r0)
            X.AnonymousClass0YZ.A0F(r5, r0)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r5)
            X.AnonymousClass0x2.A1G(r5, r0, r8)
            android.view.View r1 = r6.A0J()
            r0 = 2131430291(0x7f0b0b93, float:1.8482279E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r8)
            android.view.View r1 = r6.A0J()
            r0 = 2131430299(0x7f0b0b9b, float:1.8482295E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r8)
            android.graphics.Bitmap r5 = r2.A06
            if (r5 == 0) goto L_0x0256
            X.30B r0 = r6.A0D
            if (r0 == 0) goto L_0x0271
            X.1sU r2 = r0.A02()
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r10)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r2.A09(r0, r5)
        L_0x0256:
            X.0PJ[] r0 = new X.AnonymousClass0PJ[r7]
            java.lang.Object[] r1 = r8.toArray(r0)
            X.0PJ[] r1 = (X.AnonymousClass0PJ[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.0PJ[] r0 = (X.AnonymousClass0PJ[]) r0
            X.0Vi r0 = X.C05880Vi.A01(r3, r0)
            android.os.Bundle r0 = r0.A02()
            X.C05680Um.A02(r3, r4, r0, r9)
            return
        L_0x0271:
            java.lang.String r0 = "caches"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0278:
            X.03q r14 = r6.A0R()
        L_0x027c:
            android.content.Intent r0 = r4.A01()
            r14.startActivityForResult(r0, r9)
            return
        L_0x0284:
            java.lang.String r0 = "mentionState"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x028b:
            java.lang.String r0 = "mentionState"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0292:
            java.lang.String r0 = "cameraCaptureFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0299:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a0:
            android.content.Intent r2 = X.C86644Kx.A0A(r6)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r8)
            int r0 = r8.size()
            if (r0 != r9) goto L_0x02b9
            java.lang.Object r0 = r8.get(r7)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x02b5:
            r2.setData(r0)
            goto L_0x02c8
        L_0x02b9:
            r0 = 0
            goto L_0x02b5
        L_0x02bb:
            android.content.Intent r2 = X.C86644Kx.A0A(r6)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r8)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x02c8:
            X.AnonymousClass0x2.A0m(r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A1b(java.util.Set):void");
    }

    public void A1Y() {
        this.A0L.clear();
        if (A1c()) {
            A1Z();
            AnonymousClass0R2 r0 = this.A05;
            if (r0 != null) {
                r0.A06();
            }
        }
        A1P();
    }

    public final boolean A1c() {
        if (this.A01 <= 1) {
            return false;
        }
        C113975mI r0 = this.A0S;
        if (r0 == null) {
            throw C18270x1.A0S("mediaTray");
        } else if (r0.A00.A0X(4261)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean BKt() {
        int i;
        if (!this.A0J && this.A0L.size() >= (i = this.A01) && !this.A0H) {
            C86624Kv.A1I(this, i);
            this.A0H = true;
        }
        if (this.A0L.size() < this.A01) {
            return false;
        }
        return true;
    }

    public void Bl8(C186058ug r3) {
        if (!C73723fy.A0U(this.A0L, r3.B3d())) {
            A1a(r3);
        }
    }

    public void Bos() {
        Toast toast = this.A09;
        if (toast != null) {
            toast.cancel();
        }
        C69263Wi A1J = A1J();
        Context A0G2 = A0G();
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L2, this.A01);
        Toast A0C2 = A1J.A0C(A0G2.getString(R.string.f11nameremoved, A0L2));
        A0C2.show();
        this.A09 = A0C2;
    }

    public void BrQ(C186058ug r3) {
        if (C73723fy.A0U(this.A0L, r3.B3d())) {
            A1a(r3);
        }
    }

    public void A0a() {
        ImageView imageView;
        super.A0a();
        this.A05 = null;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A0C;
        if (stickyHeadersRecyclerView != null) {
            Iterator A11 = C86634Kw.A11(stickyHeadersRecyclerView);
            while (A11.hasNext()) {
                View A0H2 = C86654Ky.A0H(A11);
                if ((A0H2 instanceof C134366iu) && (imageView = (ImageView) A0H2) != null) {
                    imageView.setImageDrawable((Drawable) null);
                }
            }
        }
    }

    public void A0e() {
        super.A0e();
        if (this.A03 != null) {
            A0R().unregisterReceiver(this.A03);
            this.A03 = null;
        }
    }

    public void A0f() {
        super.A0f();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        this.A03 = new AnonymousClass67N(this, 2);
        C154317cy.A01(this.A03, A0R(), intentFilter, true);
    }

    public boolean A1B(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != R.id.menuitem_select_multiple) {
            return false;
        }
        A1Z();
        A1P();
        return true;
    }

    public void A1Z() {
        C003203q A0R = A0R();
        C162457s7.A0K(A0R, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C009707r r1 = (C009707r) A0R;
        C16910uE r0 = this.A04;
        if (r0 == null) {
            throw C18270x1.A0S("actionModeCallback");
        }
        this.A05 = r1.Bpz(r0);
    }

    public void A1a(C186058ug r8) {
        int i;
        Uri B3d = r8.B3d();
        C162457s7.A0D(B3d);
        if (A1V()) {
            HashSet hashSet = this.A0L;
            if (C73723fy.A0U(hashSet, B3d)) {
                hashSet.remove(B3d);
                this.A0K.A00.remove(B3d);
            } else {
                if (!this.A0J && hashSet.size() >= (i = this.A01) && !this.A0H) {
                    C86624Kv.A1I(this, i);
                    this.A0H = true;
                }
                if (hashSet.size() >= this.A01) {
                    Toast toast = this.A09;
                    if (toast != null) {
                        toast.cancel();
                    }
                    C69263Wi A1J = A1J();
                    Context A0G2 = A0G();
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, this.A01);
                    Toast A0C2 = A1J.A0C(A0G2.getString(R.string.f11nameremoved, objArr));
                    A0C2.show();
                    this.A09 = A0C2;
                } else {
                    hashSet.add(B3d);
                    this.A0K.A04(new AnonymousClass5YF(B3d));
                }
            }
            AnonymousClass0R2 r0 = this.A05;
            if (r0 != null) {
                r0.A06();
            }
            if (hashSet.size() > 0) {
                A1J().A0T(new C69993Zl(this, 32), 300);
            }
            A1P();
            return;
        }
        A1b(C18300x5.A0x(B3d));
        this.A0K.A04(new AnonymousClass5YF(B3d));
    }
}
